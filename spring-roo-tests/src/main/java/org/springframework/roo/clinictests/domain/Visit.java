package org.springframework.roo.clinictests.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;
import javax.validation.constraints.Size;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.springframework.format.annotation.DateTimeFormat;
import io.springlets.format.EntityFormat;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.util.Calendar;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = Visit
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(entityFormatMessage = "visit_format")
@RooJpaAudit
@RooJaxbEntity
public class Visit {

    /**
     * TODO Auto-generated field documentation
     *
     */
    @Id
    @SequenceGenerator(name = "visitGen", sequenceName = "VISIT_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "visitGen")
    private Long id;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @Version
    private Integer version;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @Size(max = 255)
    private String description;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    @Past
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date visitDate;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @EntityFormat
    private Pet pet;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @EntityFormat
    private Vet vet;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar createdDate;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @CreatedBy
    private String createdBy;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar modifiedDate;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @LastModifiedBy
    private String modifiedBy;
}
