package jadineria.jardineraDelEden.persistence;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "gama_producto")
public class ProductRange {

    @Id
    @Column(name = "gama", nullable = false)
    private String range;

    @Column(name = "descripcion_texto", nullable = false, columnDefinition = "TEXT") 
    private String descriptionText;

    @Column(name = "descripcion_html", nullable = false, columnDefinition = "TEXT")
    private String descriptionHtml; 

    @Column(name = "imagen", nullable = false)
    private String image;

    @OneToMany(mappedBy = "range")
    private List<Product> products = new ArrayList<>();

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    public void setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
