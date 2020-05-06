import org.redisson.api.annotation.REntity;
import org.redisson.api.annotation.RId;

import java.io.Serializable;

/**
 * @author AlanSun
 * @date 2020/4/8 13:53
 */
@REntity
public class TestObject implements Serializable {
    @RId
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
