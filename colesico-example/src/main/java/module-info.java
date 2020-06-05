module colesico.framework.demo {

    requires colesico.framework.bundle.web;
    requires colesico.framework.undertow;
    requires java.net.http;

    exports colesico.framework.demo;
    opens colesico.framework.demo to gson;
}