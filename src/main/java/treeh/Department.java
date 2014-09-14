package treeh;

/**
 * Created by evanhsiwood on 9/13/14.
 */
public class Department {
    private int id;
    private String name;
    private int level;
    private int disabled;
    private int pid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int isDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (disabled != that.disabled) return false;
        if (id != that.id) return false;
        if (level != that.level) return false;
        if (pid != that.pid) return false;
        if (!name.equals(that.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + level;
        result = 31 * result + disabled;
        result = 31 * result + pid;
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
