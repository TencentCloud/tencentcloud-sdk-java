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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVoucherInfoRequest extends AbstractModel{

    /**
    * 一页多少条数据，默认是20条，最大不超过1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 第多少页，默认是1
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 券状态：待使用：unUsed，已使用： used，已发货：delivered，已作废： cancel，已过期：overdue
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 代金券id
    */
    @SerializedName("VoucherId")
    @Expose
    private String VoucherId;

    /**
    * 代金券订单id
    */
    @SerializedName("CodeId")
    @Expose
    private String CodeId;

    /**
    * 商品码
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 活动id
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * 代金券名称
    */
    @SerializedName("VoucherName")
    @Expose
    private String VoucherName;

    /**
    * 发放开始时间
    */
    @SerializedName("TimeFrom")
    @Expose
    private String TimeFrom;

    /**
    * 发放结束时间
    */
    @SerializedName("TimeTo")
    @Expose
    private String TimeTo;

    /**
    * 指定排序字段：BeginTime开始时间、EndTime到期时间、CreateTime创建时间
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * 指定升序降序：desc、asc
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * 付费模式，postPay后付费/prePay预付费/riPay预留实例/""或者"*"表示全部模式，如果payMode为""或"*"，那么productCode与subProductCode必须传空
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 付费场景PayMode=postPay时：spotpay-竞价实例,"settle account"-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景
    */
    @SerializedName("PayScene")
    @Expose
    private String PayScene;

    /**
    * 操作人，默认就是用户uin
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 一页多少条数据，默认是20条，最大不超过1000 
     * @return Limit 一页多少条数据，默认是20条，最大不超过1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页多少条数据，默认是20条，最大不超过1000
     * @param Limit 一页多少条数据，默认是20条，最大不超过1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 第多少页，默认是1 
     * @return Offset 第多少页，默认是1
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 第多少页，默认是1
     * @param Offset 第多少页，默认是1
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 券状态：待使用：unUsed，已使用： used，已发货：delivered，已作废： cancel，已过期：overdue 
     * @return Status 券状态：待使用：unUsed，已使用： used，已发货：delivered，已作废： cancel，已过期：overdue
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 券状态：待使用：unUsed，已使用： used，已发货：delivered，已作废： cancel，已过期：overdue
     * @param Status 券状态：待使用：unUsed，已使用： used，已发货：delivered，已作废： cancel，已过期：overdue
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 代金券id 
     * @return VoucherId 代金券id
     */
    public String getVoucherId() {
        return this.VoucherId;
    }

    /**
     * Set 代金券id
     * @param VoucherId 代金券id
     */
    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    /**
     * Get 代金券订单id 
     * @return CodeId 代金券订单id
     */
    public String getCodeId() {
        return this.CodeId;
    }

    /**
     * Set 代金券订单id
     * @param CodeId 代金券订单id
     */
    public void setCodeId(String CodeId) {
        this.CodeId = CodeId;
    }

    /**
     * Get 商品码 
     * @return ProductCode 商品码
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 商品码
     * @param ProductCode 商品码
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 活动id 
     * @return ActivityId 活动id
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动id
     * @param ActivityId 活动id
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 代金券名称 
     * @return VoucherName 代金券名称
     */
    public String getVoucherName() {
        return this.VoucherName;
    }

    /**
     * Set 代金券名称
     * @param VoucherName 代金券名称
     */
    public void setVoucherName(String VoucherName) {
        this.VoucherName = VoucherName;
    }

    /**
     * Get 发放开始时间 
     * @return TimeFrom 发放开始时间
     */
    public String getTimeFrom() {
        return this.TimeFrom;
    }

    /**
     * Set 发放开始时间
     * @param TimeFrom 发放开始时间
     */
    public void setTimeFrom(String TimeFrom) {
        this.TimeFrom = TimeFrom;
    }

    /**
     * Get 发放结束时间 
     * @return TimeTo 发放结束时间
     */
    public String getTimeTo() {
        return this.TimeTo;
    }

    /**
     * Set 发放结束时间
     * @param TimeTo 发放结束时间
     */
    public void setTimeTo(String TimeTo) {
        this.TimeTo = TimeTo;
    }

    /**
     * Get 指定排序字段：BeginTime开始时间、EndTime到期时间、CreateTime创建时间 
     * @return SortField 指定排序字段：BeginTime开始时间、EndTime到期时间、CreateTime创建时间
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set 指定排序字段：BeginTime开始时间、EndTime到期时间、CreateTime创建时间
     * @param SortField 指定排序字段：BeginTime开始时间、EndTime到期时间、CreateTime创建时间
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get 指定升序降序：desc、asc 
     * @return SortOrder 指定升序降序：desc、asc
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 指定升序降序：desc、asc
     * @param SortOrder 指定升序降序：desc、asc
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get 付费模式，postPay后付费/prePay预付费/riPay预留实例/""或者"*"表示全部模式，如果payMode为""或"*"，那么productCode与subProductCode必须传空 
     * @return PayMode 付费模式，postPay后付费/prePay预付费/riPay预留实例/""或者"*"表示全部模式，如果payMode为""或"*"，那么productCode与subProductCode必须传空
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式，postPay后付费/prePay预付费/riPay预留实例/""或者"*"表示全部模式，如果payMode为""或"*"，那么productCode与subProductCode必须传空
     * @param PayMode 付费模式，postPay后付费/prePay预付费/riPay预留实例/""或者"*"表示全部模式，如果payMode为""或"*"，那么productCode与subProductCode必须传空
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 付费场景PayMode=postPay时：spotpay-竞价实例,"settle account"-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景 
     * @return PayScene 付费场景PayMode=postPay时：spotpay-竞价实例,"settle account"-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景
     */
    public String getPayScene() {
        return this.PayScene;
    }

    /**
     * Set 付费场景PayMode=postPay时：spotpay-竞价实例,"settle account"-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景
     * @param PayScene 付费场景PayMode=postPay时：spotpay-竞价实例,"settle account"-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景
     */
    public void setPayScene(String PayScene) {
        this.PayScene = PayScene;
    }

    /**
     * Get 操作人，默认就是用户uin 
     * @return Operator 操作人，默认就是用户uin
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人，默认就是用户uin
     * @param Operator 操作人，默认就是用户uin
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public DescribeVoucherInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoucherInfoRequest(DescribeVoucherInfoRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.VoucherId != null) {
            this.VoucherId = new String(source.VoucherId);
        }
        if (source.CodeId != null) {
            this.CodeId = new String(source.CodeId);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new String(source.ActivityId);
        }
        if (source.VoucherName != null) {
            this.VoucherName = new String(source.VoucherName);
        }
        if (source.TimeFrom != null) {
            this.TimeFrom = new String(source.TimeFrom);
        }
        if (source.TimeTo != null) {
            this.TimeTo = new String(source.TimeTo);
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PayScene != null) {
            this.PayScene = new String(source.PayScene);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VoucherId", this.VoucherId);
        this.setParamSimple(map, prefix + "CodeId", this.CodeId);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "VoucherName", this.VoucherName);
        this.setParamSimple(map, prefix + "TimeFrom", this.TimeFrom);
        this.setParamSimple(map, prefix + "TimeTo", this.TimeTo);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayScene", this.PayScene);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

