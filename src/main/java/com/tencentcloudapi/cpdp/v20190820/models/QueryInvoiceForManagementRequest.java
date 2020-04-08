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

public class QueryInvoiceForManagementRequest extends AbstractModel{

    /**
    * 开票平台ID
    */
    @SerializedName("InvoicePlatformId")
    @Expose
    private Long InvoicePlatformId;

    /**
    * 开票状态
    */
    @SerializedName("InvoiceStatus")
    @Expose
    private Long InvoiceStatus;

    /**
    * 红冲状态
    */
    @SerializedName("RedInvoiceStatus")
    @Expose
    private Long RedInvoiceStatus;

    /**
    * 开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 页码
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 发票ID
    */
    @SerializedName("InvoiceId")
    @Expose
    private String InvoiceId;

    /**
    * 业务开票号
    */
    @SerializedName("OrderSn")
    @Expose
    private String OrderSn;

    /**
    * 发票号码
    */
    @SerializedName("InvoiceSn")
    @Expose
    private String InvoiceSn;

    /**
    * 发票代码
    */
    @SerializedName("InvoiceCode")
    @Expose
    private String InvoiceCode;

    /**
    * 接入环境。沙箱环境填 sandbox。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

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
     * Get 开票状态 
     * @return InvoiceStatus 开票状态
     */
    public Long getInvoiceStatus() {
        return this.InvoiceStatus;
    }

    /**
     * Set 开票状态
     * @param InvoiceStatus 开票状态
     */
    public void setInvoiceStatus(Long InvoiceStatus) {
        this.InvoiceStatus = InvoiceStatus;
    }

    /**
     * Get 红冲状态 
     * @return RedInvoiceStatus 红冲状态
     */
    public Long getRedInvoiceStatus() {
        return this.RedInvoiceStatus;
    }

    /**
     * Set 红冲状态
     * @param RedInvoiceStatus 红冲状态
     */
    public void setRedInvoiceStatus(Long RedInvoiceStatus) {
        this.RedInvoiceStatus = RedInvoiceStatus;
    }

    /**
     * Get 开始时间 
     * @return BeginTime 开始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间
     * @param BeginTime 开始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 页码 
     * @return Offset 页码
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页码
     * @param Offset 页码
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页大小 
     * @return Limit 页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页大小
     * @param Limit 页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get 发票号码 
     * @return InvoiceSn 发票号码
     */
    public String getInvoiceSn() {
        return this.InvoiceSn;
    }

    /**
     * Set 发票号码
     * @param InvoiceSn 发票号码
     */
    public void setInvoiceSn(String InvoiceSn) {
        this.InvoiceSn = InvoiceSn;
    }

    /**
     * Get 发票代码 
     * @return InvoiceCode 发票代码
     */
    public String getInvoiceCode() {
        return this.InvoiceCode;
    }

    /**
     * Set 发票代码
     * @param InvoiceCode 发票代码
     */
    public void setInvoiceCode(String InvoiceCode) {
        this.InvoiceCode = InvoiceCode;
    }

    /**
     * Get 接入环境。沙箱环境填 sandbox。 
     * @return Profile 接入环境。沙箱环境填 sandbox。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填 sandbox。
     * @param Profile 接入环境。沙箱环境填 sandbox。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvoicePlatformId", this.InvoicePlatformId);
        this.setParamSimple(map, prefix + "InvoiceStatus", this.InvoiceStatus);
        this.setParamSimple(map, prefix + "RedInvoiceStatus", this.RedInvoiceStatus);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "InvoiceId", this.InvoiceId);
        this.setParamSimple(map, prefix + "OrderSn", this.OrderSn);
        this.setParamSimple(map, prefix + "InvoiceSn", this.InvoiceSn);
        this.setParamSimple(map, prefix + "InvoiceCode", this.InvoiceCode);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

