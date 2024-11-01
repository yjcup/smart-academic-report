package world.xuewei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 应用程序启动类
 *
 * <p>
 * ==========================================================================
 
 */
@SpringBootApplication
@EnableScheduling
public class AcademicReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcademicReportApplication.class, args);
    }

}
