package g44422.webg5.Pae.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

import g44422.webg5.Pae.business.PAE;
import g44422.webg5.Pae.interfaces.IPAE;

@Configuration
public class WebConfig {

	@Bean
	@Scope(SCOPE_SINGLETON)
	public IPAE pae() {
		return new PAE();
	}

}
