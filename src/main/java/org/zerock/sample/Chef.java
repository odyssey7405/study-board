package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;


// Spring 자동생성 에노테이션 @Controller  @Component, @Service, @Repository, @RestController, @Advice, @Mapper
// root-context.xml에 설정되어 있어야 한다. <annotation-driven /> <context:component-scan base-package="org.zerock" />
@Component
@Data  // VO 객체 생각해라
public class Chef {

}
