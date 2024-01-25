public interface Solution<T> {
    void enqueue(T data);
    T dequeue();
    void displayQueue();

}
