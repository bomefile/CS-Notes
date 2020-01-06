package com.interview;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class Sync extends AbstractQueuedSynchronizer {

    @Override
    protected boolean isHeldExclusively() {
        return super.isHeldExclusively();
    }

    @Override
    protected boolean tryAcquire(int arg) {
        return super.tryAcquire(arg);
    }

    @Override
    protected boolean tryRelease(int arg) {
        return super.tryRelease(arg);
    }
}
