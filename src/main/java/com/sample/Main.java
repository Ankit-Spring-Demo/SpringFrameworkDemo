package com.sample;

import com.sample.demo.DoctorBeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sample")
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

       /* Doctor doctor = context.getBean(Doctor.class);
        doctor.setDoctorName("New Doctor");
        doctor.assist();

        Doctor doctor1 = context.getBean(Doctor.class);
        doctor1.assist();

        PrototypeDoctor PrototypeDoctor = context.getBean(PrototypeDoctor.class);
        PrototypeDoctor.setDoctorName("New Doctor");
        PrototypeDoctor.assist();

        PrototypeDoctor prototypeDoctor1 = context.getBean(PrototypeDoctor.class);
        prototypeDoctor1.assist();*/

        DoctorBeanNameAware doc = context.getBean(DoctorBeanNameAware.class);
        doc.assist();
// Spring lifecycle Detail
//Spring Bean Lifecycle  Instantiate --> populate properties
// --> BeanNameAware's setBeanName() --> BeanFactoryAware's setBeanFactory()  --> ApplicationContextAware's setApplicationContextAware()
// --> PreInitializationBean Postprocessors --> InitializeBean's  afterPropertiesSet() --> Call Custom Init Method --> PostInitializationBean Postprocessors
        // Bean is Ready to Use  ------
        //Container is Shut Down ------
//-->  DisposableBean's destroy()  --> Call Custom destroy-method
    }
}
