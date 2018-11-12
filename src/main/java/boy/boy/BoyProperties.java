package boy.boy;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: psw
 * @Date: 2018/8/18
 */
@Component //
@ConfigurationProperties(prefix = "boy") //prefix是前缀
public class BoyProperties {

    private  String cupSize;
    private  Integer age;
    private  String sex;

    @Override
    public String toString() {
        return "Boy{" +
                "cupSize='" + cupSize + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
