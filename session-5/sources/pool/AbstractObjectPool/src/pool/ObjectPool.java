package pool;

import java.util.LinkedList;
import java.util.List;

public abstract class ObjectPool<T> {

    private List<T> locked, unlocked;
    private int poolSize;

    public ObjectPool(int size) {
        poolSize = size;
        locked = new LinkedList<>();
        unlocked = new LinkedList<>();
    }

    protected T aquireReusable() throws NoAvailableInstanceException {
        T reusableObject;
        if (unlocked.size() > 0) {
            reusableObject = unlocked.remove(0);
            locked.add(reusableObject);
            return reusableObject;
        }

        if (locked.size() < poolSize) {
            reusableObject = createInstance();
            locked.add(reusableObject);
            return reusableObject;
        }

        throw new NoAvailableInstanceException();
    }

    protected void releaseReusable(T t) {
        locked.remove(t);
        unlocked.add(t);
    }

    protected void printStatus() {
        System.out.println("Active reusables:" + locked.size());
        System.out.println("Inactive reusables:" + unlocked.size());
    }

    protected abstract T createInstance();
}
