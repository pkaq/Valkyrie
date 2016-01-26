package hcs.core.rest;
public class Response {
    //是否成功
    private Boolean success;
    //返回数据
    private Object data;
    
    /**
     * 构造
     */
    public Response() {
        super();
    }
    /**
     * @param success
     * @param data
     */
    public Response(Boolean success, Object data) {
        super();
        this.success = success;
        this.data = data;
    }
    /**
     * @param success
     * @param str
     */
    public Response(Boolean success,String str){
        super();
        this.success = success;
    }

    

    public Response success(Object data){
        this.success = true;
        this.data = data;
        return this;
    }
    
    public Response failure(Object data){
        this.success = false;
        this.data = data;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}