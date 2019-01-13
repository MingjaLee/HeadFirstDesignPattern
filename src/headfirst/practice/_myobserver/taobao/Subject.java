package com.design.observer.taobao;

/**
 * @author jerry
 * @create 17/9/28 14:32
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
