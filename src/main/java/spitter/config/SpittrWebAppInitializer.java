package spitter.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO �Զ����ɵķ������
		return new Class<?>[]{
				RootConfig.class
		};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO �Զ����ɵķ������
		return new Class<?>[]{
				WebConfig.class
		};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO �Զ����ɵķ������
		return new String[]{
				"/"
		};
	}

}
