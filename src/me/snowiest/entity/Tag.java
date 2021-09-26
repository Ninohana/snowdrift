package me.snowiest.entity;

public class Tag {
    private Integer tid;
    private String name;
    private String description;

    public Tag() {
    }

    public Tag(Integer tid, String name, String description) {
        this.tid = tid;
        this.name = name;
        this.description = description;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
