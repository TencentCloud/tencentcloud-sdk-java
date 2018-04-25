package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class GetProductsResponse  extends AbstractModel{


    /**
    * Product列表
    */
    @SerializedName("Products")
    @Expose
    private Product [] Products;
    

    /**
    * Product总数
    */
    @SerializedName("Total")
    @Expose
    private Integer Total;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取Product列表
     * @return Products Product列表
     */
    public Product [] getProducts() {
        return this.Products;
    }

    /**
     * 设置Product列表
     * @param Products Product列表
     */
    public void setProducts(Product [] Products) {
        this.Products = Products;
    }

    /**
     * 获取Product总数
     * @return Total Product总数
     */
    public Integer getTotal() {
        return this.Total;
    }

    /**
     * 设置Product总数
     * @param Total Product总数
     */
    public void setTotal(Integer Total) {
        this.Total = Total;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Products.", this.Products);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

