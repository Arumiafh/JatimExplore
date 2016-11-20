package id.sch.smktelkom_mlg.project.xirpl106152433.jatimexplore.model;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.io.Serializable;

@Table(name = "KotaData")
public class KotaData implements Serializable {
    @Column
    public String iconkota;
    @Column
    public String title;
    @Column
    public String tab1logo;
    @Column
    public String tab2foto;
    @Column
    public String tab2title;
    @Column
    public String tab2des;
    @Column
    public String tab3title;
    @Column
    public String tab3des1;
    @Column
    public String tab3foto1;
    @Column
    public String tab3des2;
    @Column
    public String tab3foto2;
    @Column
    public String tab3des3;

    @Column
    public String tab4foto;
    @Column
    public String tab4title;
    @Column
    public String tab4des;
    @Column
    public String tab4foto1;
    @Column
    public String tab4des1;
    @Column
    public String tab4foto2;
    @Column
    public String tab4des2;
    @Column
    public String tab4foto3;
    @Column
    public String tab4des3;

    public KotaData() {
        super();
    }

    public KotaData(String iconkota, String title, String tab1logo, String tab2foto, String tab2title,
                    String tab2des, String tab3title, String tab3des1, String tab3foto1, String tab3des2,
                    String tab3foto2, String tab3des3, String tab4title, String tab4foto, String tab4des,
                    String tab4foto1, String tab4des1, String tab4foto2, String tab4des2, String tab4foto3,
                    String tab4des3) {
        super();
        this.iconkota = iconkota;

        this.title = title;
        this.tab1logo = tab1logo;

        this.tab2foto = tab2foto;
        this.tab2title = tab2title;
        this.tab2des = tab2des;

        this.tab3title = tab3title;
        this.tab3des1 = tab3des1;
        this.tab3foto1 = tab3foto1;
        this.tab3des2 = tab3des2;
        this.tab3foto2 = tab3foto2;
        this.tab3des3 = tab3des3;

        this.tab4title = tab4title;
        this.tab4foto = tab4foto;
        this.tab4des = tab4des;
        this.tab4foto1 = tab4foto1;
        this.tab4des1 = tab4des1;
        this.tab4foto2 = tab4foto2;
        this.tab4des2 = tab4des2;
        this.tab4foto3 = tab4foto3;
        this.tab4des3 = tab4des3;

    }

}
