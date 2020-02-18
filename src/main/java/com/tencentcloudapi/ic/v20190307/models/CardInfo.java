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
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CardInfo extends AbstractModel{

    /**
    * 卡片ID
    */
    @SerializedName("Iccid")
    @Expose
    private String Iccid;

    /**
    * 卡电话号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msisdn")
    @Expose
    private String Msisdn;

    /**
    * 卡imsi
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Imsi")
    @Expose
    private String Imsi;

    /**
    * 卡imei
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * 应用ID
    */
    @SerializedName("Sdkappid")
    @Expose
    private String Sdkappid;

    /**
    * 运营商编号
    */
    @SerializedName("Teleoperator")
    @Expose
    private Long Teleoperator;

    /**
    * 卡片状态 1:未激活 2：激活 3：停卡 5：销卡
    */
    @SerializedName("CardStatus")
    @Expose
    private Long CardStatus;

    /**
    * 网络状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkStatus")
    @Expose
    private Long NetworkStatus;

    /**
    * 激活时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivitedTime")
    @Expose
    private String ActivitedTime;

    /**
    * 资费类型，1 单卡，2 流量池
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 套餐类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 流量池ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PoolId")
    @Expose
    private String PoolId;

    /**
    * 周期套餐流量使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataUsedInPeriod")
    @Expose
    private Float DataUsedInPeriod;

    /**
    * 周期套餐总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataTotalInPeriod")
    @Expose
    private Float DataTotalInPeriod;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductExpiredTime")
    @Expose
    private String ProductExpiredTime;

    /**
    * 描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 套餐周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreorderCnt")
    @Expose
    private Long PreorderCnt;

    /**
    * 激活被回调标志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsActivated")
    @Expose
    private Long IsActivated;

    /**
    * 订单ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 0 不需要开通达量不停卡 1 需要开通达量不停卡
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowArrears")
    @Expose
    private Long AllowArrears;

    /**
    * 是否开通短信0:未开短信 1:开通短信
    */
    @SerializedName("NeedSms")
    @Expose
    private Long NeedSms;

    /**
    * 服务
    */
    @SerializedName("Provider")
    @Expose
    private Long Provider;

    /**
     * Get 卡片ID 
     * @return Iccid 卡片ID
     */
    public String getIccid() {
        return this.Iccid;
    }

    /**
     * Set 卡片ID
     * @param Iccid 卡片ID
     */
    public void setIccid(String Iccid) {
        this.Iccid = Iccid;
    }

    /**
     * Get 卡电话号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msisdn 卡电话号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsisdn() {
        return this.Msisdn;
    }

    /**
     * Set 卡电话号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msisdn 卡电话号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsisdn(String Msisdn) {
        this.Msisdn = Msisdn;
    }

    /**
     * Get 卡imsi
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Imsi 卡imsi
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImsi() {
        return this.Imsi;
    }

    /**
     * Set 卡imsi
注意：此字段可能返回 null，表示取不到有效值。
     * @param Imsi 卡imsi
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImsi(String Imsi) {
        this.Imsi = Imsi;
    }

    /**
     * Get 卡imei
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Imei 卡imei
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set 卡imei
注意：此字段可能返回 null，表示取不到有效值。
     * @param Imei 卡imei
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get 应用ID 
     * @return Sdkappid 应用ID
     */
    public String getSdkappid() {
        return this.Sdkappid;
    }

    /**
     * Set 应用ID
     * @param Sdkappid 应用ID
     */
    public void setSdkappid(String Sdkappid) {
        this.Sdkappid = Sdkappid;
    }

    /**
     * Get 运营商编号 
     * @return Teleoperator 运营商编号
     */
    public Long getTeleoperator() {
        return this.Teleoperator;
    }

    /**
     * Set 运营商编号
     * @param Teleoperator 运营商编号
     */
    public void setTeleoperator(Long Teleoperator) {
        this.Teleoperator = Teleoperator;
    }

    /**
     * Get 卡片状态 1:未激活 2：激活 3：停卡 5：销卡 
     * @return CardStatus 卡片状态 1:未激活 2：激活 3：停卡 5：销卡
     */
    public Long getCardStatus() {
        return this.CardStatus;
    }

    /**
     * Set 卡片状态 1:未激活 2：激活 3：停卡 5：销卡
     * @param CardStatus 卡片状态 1:未激活 2：激活 3：停卡 5：销卡
     */
    public void setCardStatus(Long CardStatus) {
        this.CardStatus = CardStatus;
    }

    /**
     * Get 网络状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkStatus 网络状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetworkStatus() {
        return this.NetworkStatus;
    }

    /**
     * Set 网络状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkStatus 网络状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkStatus(Long NetworkStatus) {
        this.NetworkStatus = NetworkStatus;
    }

    /**
     * Get 激活时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivitedTime 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivitedTime() {
        return this.ActivitedTime;
    }

    /**
     * Set 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivitedTime 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivitedTime(String ActivitedTime) {
        this.ActivitedTime = ActivitedTime;
    }

    /**
     * Get 资费类型，1 单卡，2 流量池 
     * @return Type 资费类型，1 单卡，2 流量池
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 资费类型，1 单卡，2 流量池
     * @param Type 资费类型，1 单卡，2 流量池
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 套餐类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId 套餐类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 套餐类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId 套餐类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 流量池ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PoolId 流量池ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPoolId() {
        return this.PoolId;
    }

    /**
     * Set 流量池ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PoolId 流量池ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoolId(String PoolId) {
        this.PoolId = PoolId;
    }

    /**
     * Get 周期套餐流量使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataUsedInPeriod 周期套餐流量使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDataUsedInPeriod() {
        return this.DataUsedInPeriod;
    }

    /**
     * Set 周期套餐流量使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataUsedInPeriod 周期套餐流量使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataUsedInPeriod(Float DataUsedInPeriod) {
        this.DataUsedInPeriod = DataUsedInPeriod;
    }

    /**
     * Get 周期套餐总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataTotalInPeriod 周期套餐总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDataTotalInPeriod() {
        return this.DataTotalInPeriod;
    }

    /**
     * Set 周期套餐总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataTotalInPeriod 周期套餐总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataTotalInPeriod(Float DataTotalInPeriod) {
        this.DataTotalInPeriod = DataTotalInPeriod;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductExpiredTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductExpiredTime() {
        return this.ProductExpiredTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductExpiredTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductExpiredTime(String ProductExpiredTime) {
        this.ProductExpiredTime = ProductExpiredTime;
    }

    /**
     * Get 描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 修改时间 
     * @return ModifiedTime 修改时间
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 修改时间
     * @param ModifiedTime 修改时间
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 套餐周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreorderCnt 套餐周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPreorderCnt() {
        return this.PreorderCnt;
    }

    /**
     * Set 套餐周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreorderCnt 套餐周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreorderCnt(Long PreorderCnt) {
        this.PreorderCnt = PreorderCnt;
    }

    /**
     * Get 激活被回调标志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsActivated 激活被回调标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set 激活被回调标志
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsActivated 激活被回调标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsActivated(Long IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get 订单ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderId 订单ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderId 订单ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenew 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenew 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 0 不需要开通达量不停卡 1 需要开通达量不停卡
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowArrears 0 不需要开通达量不停卡 1 需要开通达量不停卡
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAllowArrears() {
        return this.AllowArrears;
    }

    /**
     * Set 0 不需要开通达量不停卡 1 需要开通达量不停卡
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowArrears 0 不需要开通达量不停卡 1 需要开通达量不停卡
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowArrears(Long AllowArrears) {
        this.AllowArrears = AllowArrears;
    }

    /**
     * Get 是否开通短信0:未开短信 1:开通短信 
     * @return NeedSms 是否开通短信0:未开短信 1:开通短信
     */
    public Long getNeedSms() {
        return this.NeedSms;
    }

    /**
     * Set 是否开通短信0:未开短信 1:开通短信
     * @param NeedSms 是否开通短信0:未开短信 1:开通短信
     */
    public void setNeedSms(Long NeedSms) {
        this.NeedSms = NeedSms;
    }

    /**
     * Get 服务 
     * @return Provider 服务
     */
    public Long getProvider() {
        return this.Provider;
    }

    /**
     * Set 服务
     * @param Provider 服务
     */
    public void setProvider(Long Provider) {
        this.Provider = Provider;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Iccid", this.Iccid);
        this.setParamSimple(map, prefix + "Msisdn", this.Msisdn);
        this.setParamSimple(map, prefix + "Imsi", this.Imsi);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "Sdkappid", this.Sdkappid);
        this.setParamSimple(map, prefix + "Teleoperator", this.Teleoperator);
        this.setParamSimple(map, prefix + "CardStatus", this.CardStatus);
        this.setParamSimple(map, prefix + "NetworkStatus", this.NetworkStatus);
        this.setParamSimple(map, prefix + "ActivitedTime", this.ActivitedTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "PoolId", this.PoolId);
        this.setParamSimple(map, prefix + "DataUsedInPeriod", this.DataUsedInPeriod);
        this.setParamSimple(map, prefix + "DataTotalInPeriod", this.DataTotalInPeriod);
        this.setParamSimple(map, prefix + "ProductExpiredTime", this.ProductExpiredTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "PreorderCnt", this.PreorderCnt);
        this.setParamSimple(map, prefix + "IsActivated", this.IsActivated);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AllowArrears", this.AllowArrears);
        this.setParamSimple(map, prefix + "NeedSms", this.NeedSms);
        this.setParamSimple(map, prefix + "Provider", this.Provider);

    }
}

