package www.rsyrch.com.resume.utils.properties;
/*
 * @ClassName: ResumeProperties
 * @Description: properties文件读取
 * @Date: 2019/8/2 9:52
 **/

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "resume", ignoreInvalidFields = false)
@PropertySource("classpath:config/resume.properties")
@Data
@Component
public class ResumeProperties {
    private String userSessionName;
}
