package cn.kdgc.test.stats;

import org.junit.Before;
import org.junit.Test;
import cn.kdgc.dao.connect.DruidConnect;
import cn.kdgc.test.ben.BeanTest;

public class DruidConnectTest extends BeanTest {
	private DruidConnect druid;

	@Before
	public void StatsInit() {
		druid = cxt.getBean("druidConnect", DruidConnect.class);
	}

	@Test
	public void ConnectTest() {
		System.out.println(druid.selectOrderMun());
	}

}
