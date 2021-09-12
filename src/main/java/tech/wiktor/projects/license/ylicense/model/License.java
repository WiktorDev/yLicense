package tech.wiktor.projects.license.ylicense.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name =  "license")
public class License {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "license_key")
    private String license_key;
    private String service;
    private String owner;
    @Column(name = "create_date")
    private Long createDate;
    @Column(name = "create_user")
    private String createUser;

    public License() {}

    public License(String license_key, String service, String owner, Long createDate, String createUser) {
        super();
        this.license_key = license_key;
        this.service = service;
        this.owner = owner;
        this.createDate = createDate;
        this.createUser = createUser;
    }
}
