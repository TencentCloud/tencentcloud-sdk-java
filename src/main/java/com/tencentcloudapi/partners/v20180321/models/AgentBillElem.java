package com.tencentcloudapi.partners.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AgentBillElem  extends AbstractModel{


    /**
    * 代理商账号ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;
    

    /**
    * 订单号，仅对预付费账单有意义
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;
    

    /**
    * 代客账号ID
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;
    

    /**
    * 代客备注名称
    */
    @SerializedName("ClientRemark")
    @Expose
    private String ClientRemark;
    

    /**
    * 支付时间
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;
    

    /**
    * 云产品名称
    */
    @SerializedName("GoodsType")
    @Expose
    private String GoodsType;
    

    /**
    * 预付费/后付费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;
    

    /**
    * 支付月份
    */
    @SerializedName("SettleMonth")
    @Expose
    private String SettleMonth;
    

    /**
    * 支付金额，单位分
    */
    @SerializedName("Amt")
    @Expose
    private Integer Amt;
    

    /**
     * 获取代理商账号ID
     * @return Uin 代理商账号ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * 设置代理商账号ID
     * @param Uin 代理商账号ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取订单号，仅对预付费账单有意义
     * @return OrderId 订单号，仅对预付费账单有意义
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * 设置订单号，仅对预付费账单有意义
     * @param OrderId 订单号，仅对预付费账单有意义
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * 获取代客账号ID
     * @return ClientUin 代客账号ID
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * 设置代客账号ID
     * @param ClientUin 代客账号ID
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * 获取代客备注名称
     * @return ClientRemark 代客备注名称
     */
    public String getClientRemark() {
        return this.ClientRemark;
    }

    /**
     * 设置代客备注名称
     * @param ClientRemark 代客备注名称
     */
    public void setClientRemark(String ClientRemark) {
        this.ClientRemark = ClientRemark;
    }

    /**
     * 获取支付时间
     * @return PayTime 支付时间
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * 设置支付时间
     * @param PayTime 支付时间
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * 获取云产品名称
     * @return GoodsType 云产品名称
     */
    public String getGoodsType() {
        return this.GoodsType;
    }

    /**
     * 设置云产品名称
     * @param GoodsType 云产品名称
     */
    public void setGoodsType(String GoodsType) {
        this.GoodsType = GoodsType;
    }

    /**
     * 获取预付费/后付费
     * @return PayMode 预付费/后付费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置预付费/后付费
     * @param PayMode 预付费/后付费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * 获取支付月份
     * @return SettleMonth 支付月份
     */
    public String getSettleMonth() {
        return this.SettleMonth;
    }

    /**
     * 设置支付月份
     * @param SettleMonth 支付月份
     */
    public void setSettleMonth(String SettleMonth) {
        this.SettleMonth = SettleMonth;
    }

    /**
     * 获取支付金额，单位分
     * @return Amt 支付金额，单位分
     */
    public Integer getAmt() {
        return this.Amt;
    }

    /**
     * 设置支付金额，单位分
     * @param Amt 支付金额，单位分
     */
    public void setAmt(Integer Amt) {
        this.Amt = Amt;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "ClientRemark", this.ClientRemark);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "GoodsType", this.GoodsType);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "SettleMonth", this.SettleMonth);
        this.setParamSimple(map, prefix + "Amt", this.Amt);

    }
}

