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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvoiceManagementList extends AbstractModel{

    /**
    * 发票ID
    */
    @SerializedName("InvoiceId")
    @Expose
    private String InvoiceId;

    /**
    * 订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 销方名称
    */
    @SerializedName("SellerName")
    @Expose
    private String SellerName;

    /**
    * 业务开票号
    */
    @SerializedName("OrderSn")
    @Expose
    private String OrderSn;

    /**
    * 开票平台ID
    */
    @SerializedName("InvoicePlatformId")
    @Expose
    private Long InvoicePlatformId;

    /**
    * 腾讯云AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 开票号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvoiceSn")
    @Expose
    private String InvoiceSn;

    /**
    * 开票代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvoiceCode")
    @Expose
    private String InvoiceCode;

    /**
    * 红冲状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedStatus")
    @Expose
    private Long RedStatus;

    /**
    * 开票通知时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyTime")
    @Expose
    private String NotifyTime;

    /**
    * 含税总金额
    */
    @SerializedName("AmountHasTax")
    @Expose
    private String AmountHasTax;

    /**
    * 发票类型
    */
    @SerializedName("InvoiceType")
    @Expose
    private Long InvoiceType;

    /**
    * 开票状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvoiceStatus")
    @Expose
    private Long InvoiceStatus;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 发票ID 
     * @return InvoiceId 发票ID
     */
    public String getInvoiceId() {
        return this.InvoiceId;
    }

    /**
     * Set 发票ID
     * @param InvoiceId 发票ID
     */
    public void setInvoiceId(String InvoiceId) {
        this.InvoiceId = InvoiceId;
    }

    /**
     * Get 订单号 
     * @return OrderId 订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号
     * @param OrderId 订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 销方名称 
     * @return SellerName 销方名称
     */
    public String getSellerName() {
        return this.SellerName;
    }

    /**
     * Set 销方名称
     * @param SellerName 销方名称
     */
    public void setSellerName(String SellerName) {
        this.SellerName = SellerName;
    }

    /**
     * Get 业务开票号 
     * @return OrderSn 业务开票号
     */
    public String getOrderSn() {
        return this.OrderSn;
    }

    /**
     * Set 业务开票号
     * @param OrderSn 业务开票号
     */
    public void setOrderSn(String OrderSn) {
        this.OrderSn = OrderSn;
    }

    /**
     * Get 开票平台ID 
     * @return InvoicePlatformId 开票平台ID
     */
    public Long getInvoicePlatformId() {
        return this.InvoicePlatformId;
    }

    /**
     * Set 开票平台ID
     * @param InvoicePlatformId 开票平台ID
     */
    public void setInvoicePlatformId(Long InvoicePlatformId) {
        this.InvoicePlatformId = InvoicePlatformId;
    }

    /**
     * Get 腾讯云AppId 
     * @return AppId 腾讯云AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 腾讯云AppId
     * @param AppId 腾讯云AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 开票号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvoiceSn 开票号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvoiceSn() {
        return this.InvoiceSn;
    }

    /**
     * Set 开票号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvoiceSn 开票号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvoiceSn(String InvoiceSn) {
        this.InvoiceSn = InvoiceSn;
    }

    /**
     * Get 开票代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvoiceCode 开票代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvoiceCode() {
        return this.InvoiceCode;
    }

    /**
     * Set 开票代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvoiceCode 开票代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvoiceCode(String InvoiceCode) {
        this.InvoiceCode = InvoiceCode;
    }

    /**
     * Get 红冲状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedStatus 红冲状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRedStatus() {
        return this.RedStatus;
    }

    /**
     * Set 红冲状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedStatus 红冲状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedStatus(Long RedStatus) {
        this.RedStatus = RedStatus;
    }

    /**
     * Get 开票通知时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyTime 开票通知时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotifyTime() {
        return this.NotifyTime;
    }

    /**
     * Set 开票通知时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyTime 开票通知时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyTime(String NotifyTime) {
        this.NotifyTime = NotifyTime;
    }

    /**
     * Get 含税总金额 
     * @return AmountHasTax 含税总金额
     */
    public String getAmountHasTax() {
        return this.AmountHasTax;
    }

    /**
     * Set 含税总金额
     * @param AmountHasTax 含税总金额
     */
    public void setAmountHasTax(String AmountHasTax) {
        this.AmountHasTax = AmountHasTax;
    }

    /**
     * Get 发票类型 
     * @return InvoiceType 发票类型
     */
    public Long getInvoiceType() {
        return this.InvoiceType;
    }

    /**
     * Set 发票类型
     * @param InvoiceType 发票类型
     */
    public void setInvoiceType(Long InvoiceType) {
        this.InvoiceType = InvoiceType;
    }

    /**
     * Get 开票状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvoiceStatus 开票状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInvoiceStatus() {
        return this.InvoiceStatus;
    }

    /**
     * Set 开票状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvoiceStatus 开票状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvoiceStatus(Long InvoiceStatus) {
        this.InvoiceStatus = InvoiceStatus;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvoiceId", this.InvoiceId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "SellerName", this.SellerName);
        this.setParamSimple(map, prefix + "OrderSn", this.OrderSn);
        this.setParamSimple(map, prefix + "InvoicePlatformId", this.InvoicePlatformId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "InvoiceSn", this.InvoiceSn);
        this.setParamSimple(map, prefix + "InvoiceCode", this.InvoiceCode);
        this.setParamSimple(map, prefix + "RedStatus", this.RedStatus);
        this.setParamSimple(map, prefix + "NotifyTime", this.NotifyTime);
        this.setParamSimple(map, prefix + "AmountHasTax", this.AmountHasTax);
        this.setParamSimple(map, prefix + "InvoiceType", this.InvoiceType);
        this.setParamSimple(map, prefix + "InvoiceStatus", this.InvoiceStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

