package winterschoolone;

public class Updated extends AbstractEvent {

    private Long id;
    private String userId;
    private String menuId;
    private Integer qty;
    private String status;
    private Integer stampQty;
    private Integer couponQty;


    public Integer getStampQty() {
        return stampQty;
    }

    public void setStampQty(Integer stampQty) {
        this.stampQty = stampQty;
    }
    public Integer getCouponQty() {
        return couponQty;
    }

    public void setCouponQty(Integer couponQty) {
        this.couponQty = couponQty;
    }


    public Updated(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}