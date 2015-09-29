package StringBufferAnQuan;

/**
 *
 * @author Administrator
 * @version 修改时间：2015年9月29日 下午4:16:13
 */
public class StringBufferAnQuan implements Runnable {
	StringBuffer buffer = new StringBuffer();

	@Override
	public void run() {
		try {
			Thread.sleep((int) (Math.random() * 2));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// builder.append(1);
		buffer.append(1);
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup group = new ThreadGroup("testgroup");
		StringBufferAnQuan t = new StringBufferAnQuan();
		for (int i = 0; i < 10000; i++) {
			Thread th = new Thread(group, t, String.valueOf(i));
			th.start();
		}

		while (group.activeCount() > 0) {
			Thread.sleep(10);
		}
		// 如果长度为10000就是安全的
		// System.out.println(t.builder.length());
		System.out.println(t.buffer.length());
	}
}