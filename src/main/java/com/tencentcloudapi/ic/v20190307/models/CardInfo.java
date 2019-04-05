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

public class CardInfo  extends AbstractModel{

    /**
    * 卡片id
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
    * 应用id
    */
    @SerializedName("Sdkappid")
    @Expose
    private String Sdkappid;

    /**
    * 运营商编号
    */
    @SerializedName("Teleoperator")
    @Expose
    private Integer Teleoperator;

    /**
    * 卡片状态 1:未激活 2：激活 3：停卡 5：销卡
    */
    @SerializedName("CardStatus")
    @Expose
    private Integer CardStatus;

    /**
    * 网络状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkStatus")
    @Expose
    private Integer NetworkStatus;

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
    private Integer Type;

    /**
    * 套餐类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 流量池id
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
    private Integer PreorderCnt;

    /**
    * 激活被回调标志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsActivated")
    @Expose
    private Integer IsActivated;

    /**
    * 订单id
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
    private Integer AutoRenew;

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
    private Integer AllowArrears;

    /**
    * 是否开通短信0:未开短信 1:开通短信
    */
    @SerializedName("NeedSms")
    @Expose
    private Integer NeedSms;

    /**
    * 服务
    */
    @SerializedName("Provider")
    @Expose
    private Integer Provider;

    /**
     * 获取卡片id
     * @return Iccid 卡片id
     */
    public String getIccid() {
        return this.Iccid;
    }

    /**
     * 设置卡片id
     * @param Iccid 卡片id
     */
    public void setIccid(String Iccid) {
        this.Iccid = Iccid;
    }

    /**
     * 获取卡电话号码
注意：此字段可能返回 null，表示取不到有效值。
     * @return Msisdn 卡电话号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsisdn() {
        return this.Msisdn;
    }

    /**
     * 设置卡电话号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msisdn 卡电话号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsisdn(String Msisdn) {
        this.Msisdn = Msisdn;
    }

    /**
     * 获取卡imsi
注意：此字段可能返回 null，表示取不到有效值。
     * @return Imsi 卡imsi
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImsi() {
        return this.Imsi;
    }

    /**
     * 设置卡imsi
注意：此字段可能返回 null，表示取不到有效值。
     * @param Imsi 卡imsi
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImsi(String Imsi) {
        this.Imsi = Imsi;
    }

    /**
     * 获取卡imei
注意：此字段可能返回 null，表示取不到有效值。
     * @return Imei 卡imei
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * 设置卡imei
注意：此字段可能返回 null，表示取不到有效值。
     * @param Imei 卡imei
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * 获取应用id
     * @return Sdkappid 应用id
     */
    public String getSdkappid() {
        return this.Sdkappid;
    }

    /**
     * 设置应用id
     * @param Sdkappid 应用id
     */
    public void setSdkappid(String Sdkappid) {
        this.Sdkappid = Sdkappid;
    }

    /**
     * 获取运营商编号
     * @return Teleoperator 运营商编号
     */
    public Integer getTeleoperator() {
        return this.Teleoperator;
    }

    /**
     * 设置运营商编号
     * @param Teleoperator 运营商编号
     */
    public void setTeleoperator(Integer Teleoperator) {
        this.Teleoperator = Teleoperator;
    }

    /**
     * 获取卡片状态 1:未激活 2：激活 3：停卡 5：销卡
     * @return CardStatus 卡片状态 1:未激活 2：激活 3：停卡 5：销卡
     */
    public Integer getCardStatus() {
        return this.CardStatus;
    }

    /**
     * 设置卡片状态 1:未激活 2：激活 3：停卡 5：销卡
     * @param CardStatus 卡片状态 1:未激活 2：激活 3：停卡 5：销卡
     */
    public void setCardStatus(Integer CardStatus) {
        this.CardStatus = CardStatus;
    }

    /**
     * 获取网络状态
注意：此字段可能返回 null，表示取不到有效值。
     * @return NetworkStatus 网络状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getNetworkStatus() {
        return this.NetworkStatus;
    }

    /**
     * 设置网络状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkStatus 网络状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkStatus(Integer NetworkStatus) {
        this.NetworkStatus = NetworkStatus;
    }

    /**
     * 获取激活时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return ActivitedTime 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivitedTime() {
        return this.ActivitedTime;
    }

    /**
     * 设置激活时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivitedTime 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivitedTime(String ActivitedTime) {
        this.ActivitedTime = ActivitedTime;
    }

    /**
     * 获取资费类型，1 单卡，2 流量池
     * @return Type 资费类型，1 单卡，2 流量池
     */
    public Integer getType() {
        return this.Type;
    }

    /**
     * 设置资费类型，1 单卡，2 流量池
     * @param Type 资费类型，1 单卡，2 流量池
     */
    public void setType(Integer Type) {
        this.Type = Type;
    }

    /**
     * 获取套餐类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return ProductId 套餐类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置套餐类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId 套餐类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取流量池id
注意：此字段可能返回 null，表示取不到有效值。
     * @return PoolId 流量池id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPoolId() {
        return this.PoolId;
    }

    /**
     * 设置流量池id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PoolId 流量池id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoolId(String PoolId) {
        this.PoolId = PoolId;
    }

    /**
     * 获取周期套餐流量使用
注意：此字段可能返回 null，表示取不到有效值。
     * @return DataUsedInPeriod 周期套餐流量使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDataUsedInPeriod() {
        return this.DataUsedInPeriod;
    }

    /**
     * 设置周期套餐流量使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataUsedInPeriod 周期套餐流量使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataUsedInPeriod(Float DataUsedInPeriod) {
        this.DataUsedInPeriod = DataUsedInPeriod;
    }

    /**
     * 获取周期套餐总量
注意：此字段可能返回 null，表示取不到有效值。
     * @return DataTotalInPeriod 周期套餐总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDataTotalInPeriod() {
        return this.DataTotalInPeriod;
    }

    /**
     * 设置周期套餐总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataTotalInPeriod 周期套餐总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataTotalInPeriod(Float DataTotalInPeriod) {
        this.DataTotalInPeriod = DataTotalInPeriod;
    }

    /**
     * 获取过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return ProductExpiredTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductExpiredTime() {
        return this.ProductExpiredTime;
    }

    /**
     * 设置过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductExpiredTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductExpiredTime(String ProductExpiredTime) {
        this.ProductExpiredTime = ProductExpiredTime;
    }

    /**
     * 获取描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取创建时间
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 获取修改时间
     * @return ModifiedTime 修改时间
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * 设置修改时间
     * @param ModifiedTime 修改时间
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * 获取套餐周期
注意：此字段可能返回 null，表示取不到有效值。
     * @return PreorderCnt 套餐周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getPreorderCnt() {
        return this.PreorderCnt;
    }

    /**
     * 设置套餐周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreorderCnt 套餐周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreorderCnt(Integer PreorderCnt) {
        this.PreorderCnt = PreorderCnt;
    }

    /**
     * 获取激活被回调标志
注意：此字段可能返回 null，表示取不到有效值。
     * @return IsActivated 激活被回调标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getIsActivated() {
        return this.IsActivated;
    }

    /**
     * 设置激活被回调标志
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsActivated 激活被回调标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsActivated(Integer IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * 获取订单id
注意：此字段可能返回 null，表示取不到有效值。
     * @return OrderId 订单id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * 设置订单id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderId 订单id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * 获取是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @return AutoRenew 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * 设置是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenew 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenew(Integer AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * 获取备注
注意：此字段可能返回 null，表示取不到有效值。
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * 设置备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * 获取0 不需要开通达量不停卡 1 需要开通达量不停卡
注意：此字段可能返回 null，表示取不到有效值。
     * @return AllowArrears 0 不需要开通达量不停卡 1 需要开通达量不停卡
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getAllowArrears() {
        return this.AllowArrears;
    }

    /**
     * 设置0 不需要开通达量不停卡 1 需要开通达量不停卡
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowArrears 0 不需要开通达量不停卡 1 需要开通达量不停卡
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowArrears(Integer AllowArrears) {
        this.AllowArrears = AllowArrears;
    }

    /**
     * 获取是否开通短信0:未开短信 1:开通短信
     * @return NeedSms 是否开通短信0:未开短信 1:开通短信
     */
    public Integer getNeedSms() {
        return this.NeedSms;
    }

    /**
     * 设置是否开通短信0:未开短信 1:开通短信
     * @param NeedSms 是否开通短信0:未开短信 1:开通短信
     */
    public void setNeedSms(Integer NeedSms) {
        this.NeedSms = NeedSms;
    }

    /**
     * 获取服务
     * @return Provider 服务
     */
    public Integer getProvider() {
        return this.Provider;
    }

    /**
     * 设置服务
     * @param Provider 服务
     */
    public void setProvider(Integer Provider) {
        this.Provider = Provider;
    }

    /**
     * 内部实现，用户禁止调用
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

