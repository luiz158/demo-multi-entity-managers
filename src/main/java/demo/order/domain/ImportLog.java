package demo.order.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "IMPORT_LOG")
public class ImportLog implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String logFileName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    @Override
    public String toString() {
        return "ImportLog{" +
                "id=" + id +
                ", logFileName='" + logFileName + '\'' +
                '}';
    }

}



