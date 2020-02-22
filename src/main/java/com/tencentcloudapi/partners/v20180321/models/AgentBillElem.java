/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentBillElem extends AbstractModel{

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
    private Long Amt;

    /**
    * agentpay：代付；selfpay：自付
    */
    @SerializedName("PayerMode")
    @Expose
    private String PayerMode;

    /**
    * 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectType")
    @Expose
    private String ProjectType;

    /**
    * 活动ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
     * Get 代理商账号ID 
     * @return Uin 代理商账号ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 代理商账号ID
     * @param Uin 代理商账号ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 订单号，仅对预付费账单有意义 
     * @return OrderId 订单号，仅对预付费账单有意义
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号，仅对预付费账单有意义
     * @param OrderId 订单号，仅对预付费账单有意义
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 代客账号ID 
     * @return ClientUin 代客账号ID
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 代客账号ID
     * @param ClientUin 代客账号ID
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 代客备注名称 
     * @return ClientRemark 代客备注名称
     */
    public String getClientRemark() {
        return this.ClientRemark;
    }

    /**
     * Set 代客备注名称
     * @param ClientRemark 代客备注名称
     */
    public void setClientRemark(String ClientRemark) {
        this.ClientRemark = ClientRemark;
    }

    /**
     * Get 支付时间 
     * @return PayTime 支付时间
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set 支付时间
     * @param PayTime 支付时间
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get 云产品名称 
     * @return GoodsType 云产品名称
     */
    public String getGoodsType() {
        return this.GoodsType;
    }

    /**
     * Set 云产品名称
     * @param GoodsType 云产品名称
     */
    public void setGoodsType(String GoodsType) {
        this.GoodsType = GoodsType;
    }

    /**
     * Get 预付费/后付费 
     * @return PayMode 预付费/后付费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 预付费/后付费
     * @param PayMode 预付费/后付费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 支付月份 
     * @return SettleMonth 支付月份
     */
    public String getSettleMonth() {
        return this.SettleMonth;
    }

    /**
     * Set 支付月份
     * @param SettleMonth 支付月份
     */
    public void setSettleMonth(String SettleMonth) {
        this.SettleMonth = SettleMonth;
    }

    /**
     * Get 支付金额，单位分 
     * @return Amt 支付金额，单位分
     */
    public Long getAmt() {
        return this.Amt;
    }

    /**
     * Set 支付金额，单位分
     * @param Amt 支付金额，单位分
     */
    public void setAmt(Long Amt) {
        this.Amt = Amt;
    }

    /**
     * Get agentpay：代付；selfpay：自付 
     * @return PayerMode agentpay：代付；selfpay：自付
     */
    public String getPayerMode() {
        return this.PayerMode;
    }

    /**
     * Set agentpay：代付；selfpay：自付
     * @param PayerMode agentpay：代付；selfpay：自付
     */
    public void setPayerMode(String PayerMode) {
        this.PayerMode = PayerMode;
    }

    /**
     * Get 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientType 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * Set 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientType 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectType 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectType() {
        return this.ProjectType;
    }

    /**
     * Set 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectType 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectType(String ProjectType) {
        this.ProjectType = ProjectType;
    }

    /**
     * Get 活动ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityId 活动ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityId 活动ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "PayerMode", this.PayerMode);
        this.setParamSimple(map, prefix + "ClientType", this.ClientType);
        this.setParamSimple(map, prefix + "ProjectType", this.ProjectType);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);

    }
}

