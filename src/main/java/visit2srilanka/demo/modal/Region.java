package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Region {
    @Id
    private int region_id;
    private String Region_type;
    private String name;


    public Region(String region_type, String name, int region_id) {
        Region_type = region_type;
        this.name = name;
        this.region_id = region_id;
    }

    public String getRegion_type() {
        return Region_type;
    }

    public void setRegion_type(String region_type) {
        Region_type = region_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    @Override
    public String toString() {
        return "Region{" +
                "Region_type='" + Region_type + '\'' +
                ", name='" + name + '\'' +
                ", region_id=" + region_id +
                '}';
    }
}
