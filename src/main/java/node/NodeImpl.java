package node;

import java.util.List;

public record NodeImpl<O, V>(V value, List<O> outputs, boolean isFinal) implements Node<O, V> {}
