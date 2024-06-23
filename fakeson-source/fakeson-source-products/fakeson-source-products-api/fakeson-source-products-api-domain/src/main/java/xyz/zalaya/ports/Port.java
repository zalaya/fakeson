package xyz.zalaya.ports;

public interface Port<T, R> {
    R execute(T request);
}