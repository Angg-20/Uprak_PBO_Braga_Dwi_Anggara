package uprak;

public class regencies {

    int id, province_id;
    String name;
    
    public void regencies(){
        
    }

    public regencies(int id, int province_id, String name) {
        this.id = id;
        this.province_id = province_id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
