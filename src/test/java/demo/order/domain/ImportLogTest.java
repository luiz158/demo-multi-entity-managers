package demo.order.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ImportLogTest {

	@Autowired
	private ImportLogRepository importLogRepository;

	@Test
	public void save() {
		ImportLog importLog = new ImportLog();
		importLog.setLogFileName("Andreas");
		assertThat(importLog.getId(), is(nullValue()));
		this.importLogRepository.save(importLog);
		assertThat(importLog.getId(), is(not(nullValue())));
	}

}
