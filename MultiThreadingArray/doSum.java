class doSum extends Ary implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sum2[i]=aray3[i]+aray4[i];
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }
}