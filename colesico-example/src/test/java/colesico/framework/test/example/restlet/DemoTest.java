/*
 * Copyright © 2014-2020 Vladlen V. Larionov and others as noted.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package colesico.framework.test.example.restlet;

import colesico.framework.httpserver.HttpServer;
import colesico.framework.ioc.Ioc;
import colesico.framework.ioc.IocBuilder;
import colesico.framework.ioc.conditional.TestCondition;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.testng.AssertJUnit.assertEquals;

public class DemoTest {
    private Ioc ioc;
    private HttpServer httpServer;
    private HttpClient httpClient;
    private Gson gson = new Gson();
    private Logger logger = LoggerFactory.getLogger(DemoTest.class);

    @BeforeClass
    public void init() {
        TestCondition.enable();
        ioc = IocBuilder.create().build();
        httpServer = ioc.instance(HttpServer.class).start();
        httpClient = HttpClient.newBuilder().build();
    }

    @AfterClass
    public void destroy() {
        httpServer.stop();
    }

    private String requestGET(String url) throws Exception {
        var request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("X-Requested-With", "XMLHttpRequest")
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    @Test
    public void test1() throws Exception {
        String result = requestGET("http://localhost:8085/hello/colesico");
        assertEquals("Hola colesico", result);
    }

}
