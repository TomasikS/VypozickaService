package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * Pet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-05T07:51:45.550Z")
@EntityListeners(AuditingEntityListener.class)
@javax.persistence.Entity
@javax.persistence.Table(name = "vypozicka")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonProperty("id")
    private Integer id = null;

    @Column(name = "idbook")
    @JsonProperty("idbook")
    private Integer idbook = null;

    @Column(name = "dateoftake")
    @JsonProperty("dateoftake")
    private String dateoftake = null;

    @Column(name = "dateofretrieve")
    @JsonProperty("dateofretrieve")
    private String dateofretrieve = null;

    public Pet id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
  *
     */
    @ApiModelProperty(value = "")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pet idbook(Integer idbook) {
        this.idbook = idbook;
        return this;
    }

    /**
     * Get idbook
     *
     * @return idbook
  *
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public Integer  getIdbook() {
        return idbook;
    }

    public void setIdbook(Integer idbook) {
        this.idbook = idbook;
    }

    public Pet dateoftake(String dateoftake) {
        this.dateoftake = dateoftake;
        return this;
    }

    /**
     * Get dateoftake
     *
     * @return dateoftake
  *
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getDateoftake() {
        return dateoftake;
    }

    public void setDateoftake(String dateoftake) {
        this.dateoftake = dateoftake;
    }

    public Pet dateofretrieve(String dateofretrieve) {
        this.dateofretrieve = dateofretrieve;
        return this;
    }

    /**
     * Get dateofretrieve
     *
     * @return dateofretrieve
  *
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getDateofretrieve() {
        return dateofretrieve;
    }

    public void setDateofretrieve(String dateofretrieve) {
        this.dateofretrieve = dateofretrieve;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return Objects.equals(this.id, pet.id)
                && Objects.equals(this.idbook, pet.idbook)
                && Objects.equals(this.dateoftake, pet.dateoftake)
                && Objects.equals(this.dateofretrieve, pet.dateofretrieve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idbook, dateoftake, dateofretrieve);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pet {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idbook: ").append(toIndentedString(idbook)).append("\n");
        sb.append("    dateoftake: ").append(toIndentedString(dateoftake)).append("\n");
        sb.append("    dateofretrieve: ").append(toIndentedString(dateofretrieve)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
