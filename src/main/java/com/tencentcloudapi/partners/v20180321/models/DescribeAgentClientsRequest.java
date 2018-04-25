package com.tencentcloudapi.partners.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeAgentClientsRequest  extends AbstractModel{


    /**
    * 客户账号ID
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;
    

    /**
    * 客户名称。由于涉及隐私，名称打码显示，故名称仅支持打码后的模糊搜索
    */
    @SerializedName("ClientName")
    @Expose
    private String ClientName;
    

    /**
    * 客户类型，a/b，类型定义参考代理商相关政策文档
    */
    @SerializedName("ClientFlag")
    @Expose
    private String ClientFlag;
    

    /**
    * ASC/DESC， 不区分大小写，按申请时间排序
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;
    

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;
    

    /**
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;
    

    /**
     * 获取客户账号ID
     * @return ClientUin 客户账号ID
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * 设置客户账号ID
     * @param ClientUin 客户账号ID
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * 获取客户名称。由于涉及隐私，名称打码显示，故名称仅支持打码后的模糊搜索
     * @return ClientName 客户名称。由于涉及隐私，名称打码显示，故名称仅支持打码后的模糊搜索
     */
    public String getClientName() {
        return this.ClientName;
    }

    /**
     * 设置客户名称。由于涉及隐私，名称打码显示，故名称仅支持打码后的模糊搜索
     * @param ClientName 客户名称。由于涉及隐私，名称打码显示，故名称仅支持打码后的模糊搜索
     */
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    /**
     * 获取客户类型，a/b，类型定义参考代理商相关政策文档
     * @return ClientFlag 客户类型，a/b，类型定义参考代理商相关政策文档
     */
    public String getClientFlag() {
        return this.ClientFlag;
    }

    /**
     * 设置客户类型，a/b，类型定义参考代理商相关政策文档
     * @param ClientFlag 客户类型，a/b，类型定义参考代理商相关政策文档
     */
    public void setClientFlag(String ClientFlag) {
        this.ClientFlag = ClientFlag;
    }

    /**
     * 获取ASC/DESC， 不区分大小写，按申请时间排序
     * @return OrderDirection ASC/DESC， 不区分大小写，按申请时间排序
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * 设置ASC/DESC， 不区分大小写，按申请时间排序
     * @param OrderDirection ASC/DESC， 不区分大小写，按申请时间排序
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取限制数目
     * @return Limit 限制数目
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "ClientName", this.ClientName);
        this.setParamSimple(map, prefix + "ClientFlag", this.ClientFlag);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

