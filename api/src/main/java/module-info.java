module creek.demo.api {
    requires transitive creek.kafka.metadata;

    exports io.github.dguy.creek.demo.api;
    exports io.github.dguy.creek.demo.internal to
            creek.demo.services,
            creek.demo.service;
}
