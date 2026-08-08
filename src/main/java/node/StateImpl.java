package node;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public record StateImpl(Object value, boolean isFinal) implements State {

  public static class StateImplBuilder{

    private Object value;
    private boolean isFinal;

    @Contract(value = " -> new", pure = true)
    public static @NotNull StateImplBuilder builder(){
      return new StateImplBuilder();
    }

    public StateImplBuilder value(Object value){
      this.value = value;
      return this;
    }

    public StateImplBuilder isFinal(boolean isFinal){
      this.isFinal = isFinal;
      return this;
    }

    public State build(){
      return new StateImpl(value, isFinal);
    }

  }

}
