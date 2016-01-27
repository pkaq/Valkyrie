/**
 * 
 */
package hcs.web.homepage.model;

/**
 * @Description:	 
 * @FileName: 		 Guess.java
 * @Author:		 W.F
 * @Version: 		 1.0
 * @Date: 			 2016年1月27日 上午10:08:38
 */
public class Guess {
    private String id;
    private String name;
    private String src;
    private String img;
    
    
    /**
     * @param id
     * @param name
     * @param src
     * @param img
     */
    public Guess(String id, String name, String src, String img) {
        super();
        this.id = id;
        this.name = name;
        this.src = src;
        this.img = img;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSrc() {
        return src;
    }
    public void setSrc(String src) {
        this.src = src;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    
    

}
