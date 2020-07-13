module colesico.framework.demo {

    requires colesico.framework.bundle.rest;
    requires colesico.framework.undertow;
    requires java.net.http;
    requires org.slf4j;

    exports colesico.framework.demo;
    opens colesico.framework.demo to gson;
}