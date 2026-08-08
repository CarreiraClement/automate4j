package node;

import java.util.List;
import org.jetbrains.annotations.UnmodifiableView;

public sealed interface Node<O, V> {

  @UnmodifiableView
  List<Node<O, V>> nexts();

  V value();

  boolean isFinal();
}