package me.snowiest.entity;

public class Picture {
    private Integer pid;
    private String name;
    private String path;
    private String description;

    public Picture() {
    }

    public Picture(Integer pid, String name, String path, String description) {
        this.pid = pid;
        this.name = name;
        this.path = path;
        this.description = description;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
