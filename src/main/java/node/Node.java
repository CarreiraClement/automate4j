package node;

import java.util.List;
import org.jetbrains.annotations.UnmodifiableView;

public sealed interface Node<O, V> permits NodeImpl {

  @UnmodifiableView
  List<O> outputs();

  V value();

  boolean isFinal();
}