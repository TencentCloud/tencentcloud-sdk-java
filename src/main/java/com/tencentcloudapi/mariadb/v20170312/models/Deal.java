package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Deal  extends AbstractModel{


    /**
    * 订单号
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 所属账号
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 商品数量
    */
    @SerializedName("Quantity")
    @Expose
    private Integer Quantity;

    /**
    * 关联的流程 Id，可用于查询流程执行状态
    */
    @SerializedName("FlowId")
    @Expose
    private Integer FlowId;

    /**
    * 只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * 获取订单号
     * @return DealName 订单号
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * 设置订单号
     * @param DealName 订单号
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * 获取所属账号
     * @return OwnerUin 所属账号
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * 设置所属账号
     * @param OwnerUin 所属账号
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * 获取商品数量
     * @return Quantity 商品数量
     */
    public Integer getQuantity() {
        return this.Quantity;
    }

    /**
     * 设置商品数量
     * @param Quantity 商品数量
     */
    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * 获取关联的流程 Id，可用于查询流程执行状态
     * @return FlowId 关联的流程 Id，可用于查询流程执行状态
     */
    public Integer getFlowId() {
        return this.FlowId;
    }

    /**
     * 设置关联的流程 Id，可用于查询流程执行状态
     * @param FlowId 关联的流程 Id，可用于查询流程执行状态
     */
    public void setFlowId(Integer FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * 获取只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
     * @return InstanceIds 只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
     * @param InstanceIds 只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

