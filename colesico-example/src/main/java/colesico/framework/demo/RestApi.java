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

package colesico.framework.demo;

import colesico.framework.restlet.Restlet;
import colesico.framework.restlet.teleapi.RestletResponseWriter;
import colesico.framework.restlet.teleapi.writer.PlainTextWriter;
import colesico.framework.router.Route;
import colesico.framework.router.RouteAttribute;

import static colesico.framework.httpserver.HttpServerAttribute.NON_BLOCKING;

@Restlet
public class RestApi {

    private final MessageService messageService;

    public RestApi(MessageService messageService) {
        this.messageService = messageService;
    }


    // Uncomment to run in non-blocking
    // @RouteAttribute(name = NON_BLOCKING, value = "true")
    
    @Route("/hello/:name")
    @RestletResponseWriter(PlainTextWriter.class)
    public String hello(String name) {
        return messageService.sayHello(name);
    }

}
