/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVoucherInfoRequest extends AbstractModel {

    /**
    * <p>一页多少条数据，默认是20条，最大不超过1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>第多少页，默认是1</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>券状态：待使用：unUsed，已使用：xa0used，已发货：delivered，已作废：xa0cancel，已过期：overdue</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>代金券id</p>
    */
    @SerializedName("VoucherId")
    @Expose
    private String VoucherId;

    /**
    * <p>代金券订单id</p>
    */
    @SerializedName("CodeId")
    @Expose
    private String CodeId;

    /**
    * <p>商品码</p>
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * <p>活动id</p>
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * <p>代金券名称</p>
    */
    @SerializedName("VoucherName")
    @Expose
    private String VoucherName;

    /**
    * <p>发放开始时间,例：2021-01-01</p>
    */
    @SerializedName("TimeFrom")
    @Expose
    private String TimeFrom;

    /**
    * <p>发放结束时间，例：2021-01-01</p>
    */
    @SerializedName("TimeTo")
    @Expose
    private String TimeTo;

    /**
    * <p>指定排序字段：BeginTime开始时间、EndTime到期时间、CreateTime创建时间</p>
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * <p>指定升序降序：desc、asc</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * <p>付费模式，postPay后付费/prePay预付费/riPay预留实例/&quot;&quot;或者&quot;*&quot;表示全部模式，如果payMode为&quot;&quot;或&quot;*&quot;，那么productCode与subProductCode必须传空</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>付费场景PayMode=postPay时：spotpay-竞价实例,&quot;settle account&quot;-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景</p>
    */
    @SerializedName("PayScene")
    @Expose
    private String PayScene;

    /**
    * <p>操作人，默认就是用户uin</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>代金券主类型 has_price 为有价现金券 no_price 为无价代金券</p>
    */
    @SerializedName("VoucherMainType")
    @Expose
    private String VoucherMainType;

    /**
    * <p>代金券副类型 discount 为折扣券 deduct 为抵扣券</p>
    */
    @SerializedName("VoucherSubType")
    @Expose
    private String VoucherSubType;

    /**
    * <p>券有效时间开始时间</p>
    */
    @SerializedName("StartTimeFrom")
    @Expose
    private String StartTimeFrom;

    /**
    * <p>券有效时间结束时间</p>
    */
    @SerializedName("StartTimeTo")
    @Expose
    private String StartTimeTo;

    /**
    * <p>券失效时间开始时间</p>
    */
    @SerializedName("EndTimeFrom")
    @Expose
    private String EndTimeFrom;

    /**
    * <p>券失效时间结束时间</p>
    */
    @SerializedName("EndTimeTo")
    @Expose
    private String EndTimeTo;

    /**
    * <p>发券时间开始时间</p>
    */
    @SerializedName("CreateTimeFrom")
    @Expose
    private String CreateTimeFrom;

    /**
    * <p>发券时间结束时间</p>
    */
    @SerializedName("CreateTimeTo")
    @Expose
    private String CreateTimeTo;

    /**
    * <p>语言参数</p><p>默认值：zh</p><p>期望返回产品名称中文或其他语言，目前仅支持中文、英文；填&quot;zh&quot;或不填时返回中文，其他情况返回英文</p>
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
     * Get <p>一页多少条数据，默认是20条，最大不超过1000</p> 
     * @return Limit <p>一页多少条数据，默认是20条，最大不超过1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>一页多少条数据，默认是20条，最大不超过1000</p>
     * @param Limit <p>一页多少条数据，默认是20条，最大不超过1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>第多少页，默认是1</p> 
     * @return Offset <p>第多少页，默认是1</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>第多少页，默认是1</p>
     * @param Offset <p>第多少页，默认是1</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>券状态：待使用：unUsed，已使用：xa0used，已发货：delivered，已作废：xa0cancel，已过期：overdue</p> 
     * @return Status <p>券状态：待使用：unUsed，已使用：xa0used，已发货：delivered，已作废：xa0cancel，已过期：overdue</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>券状态：待使用：unUsed，已使用：xa0used，已发货：delivered，已作废：xa0cancel，已过期：overdue</p>
     * @param Status <p>券状态：待使用：unUsed，已使用：xa0used，已发货：delivered，已作废：xa0cancel，已过期：overdue</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>代金券id</p> 
     * @return VoucherId <p>代金券id</p>
     */
    public String getVoucherId() {
        return this.VoucherId;
    }

    /**
     * Set <p>代金券id</p>
     * @param VoucherId <p>代金券id</p>
     */
    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    /**
     * Get <p>代金券订单id</p> 
     * @return CodeId <p>代金券订单id</p>
     */
    public String getCodeId() {
        return this.CodeId;
    }

    /**
     * Set <p>代金券订单id</p>
     * @param CodeId <p>代金券订单id</p>
     */
    public void setCodeId(String CodeId) {
        this.CodeId = CodeId;
    }

    /**
     * Get <p>商品码</p> 
     * @return ProductCode <p>商品码</p>
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set <p>商品码</p>
     * @param ProductCode <p>商品码</p>
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get <p>活动id</p> 
     * @return ActivityId <p>活动id</p>
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set <p>活动id</p>
     * @param ActivityId <p>活动id</p>
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get <p>代金券名称</p> 
     * @return VoucherName <p>代金券名称</p>
     */
    public String getVoucherName() {
        return this.VoucherName;
    }

    /**
     * Set <p>代金券名称</p>
     * @param VoucherName <p>代金券名称</p>
     */
    public void setVoucherName(String VoucherName) {
        this.VoucherName = VoucherName;
    }

    /**
     * Get <p>发放开始时间,例：2021-01-01</p> 
     * @return TimeFrom <p>发放开始时间,例：2021-01-01</p>
     */
    public String getTimeFrom() {
        return this.TimeFrom;
    }

    /**
     * Set <p>发放开始时间,例：2021-01-01</p>
     * @param TimeFrom <p>发放开始时间,例：2021-01-01</p>
     */
    public void setTimeFrom(String TimeFrom) {
        this.TimeFrom = TimeFrom;
    }

    /**
     * Get <p>发放结束时间，例：2021-01-01</p> 
     * @return TimeTo <p>发放结束时间，例：2021-01-01</p>
     */
    public String getTimeTo() {
        return this.TimeTo;
    }

    /**
     * Set <p>发放结束时间，例：2021-01-01</p>
     * @param TimeTo <p>发放结束时间，例：2021-01-01</p>
     */
    public void setTimeTo(String TimeTo) {
        this.TimeTo = TimeTo;
    }

    /**
     * Get <p>指定排序字段：BeginTime开始时间、EndTime到期时间、CreateTime创建时间</p> 
     * @return SortField <p>指定排序字段：BeginTime开始时间、EndTime到期时间、CreateTime创建时间</p>
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set <p>指定排序字段：BeginTime开始时间、EndTime到期时间、CreateTime创建时间</p>
     * @param SortField <p>指定排序字段：BeginTime开始时间、EndTime到期时间、CreateTime创建时间</p>
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get <p>指定升序降序：desc、asc</p> 
     * @return SortOrder <p>指定升序降序：desc、asc</p>
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>指定升序降序：desc、asc</p>
     * @param SortOrder <p>指定升序降序：desc、asc</p>
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get <p>付费模式，postPay后付费/prePay预付费/riPay预留实例/&quot;&quot;或者&quot;*&quot;表示全部模式，如果payMode为&quot;&quot;或&quot;*&quot;，那么productCode与subProductCode必须传空</p> 
     * @return PayMode <p>付费模式，postPay后付费/prePay预付费/riPay预留实例/&quot;&quot;或者&quot;*&quot;表示全部模式，如果payMode为&quot;&quot;或&quot;*&quot;，那么productCode与subProductCode必须传空</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式，postPay后付费/prePay预付费/riPay预留实例/&quot;&quot;或者&quot;*&quot;表示全部模式，如果payMode为&quot;&quot;或&quot;*&quot;，那么productCode与subProductCode必须传空</p>
     * @param PayMode <p>付费模式，postPay后付费/prePay预付费/riPay预留实例/&quot;&quot;或者&quot;*&quot;表示全部模式，如果payMode为&quot;&quot;或&quot;*&quot;，那么productCode与subProductCode必须传空</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>付费场景PayMode=postPay时：spotpay-竞价实例,&quot;settle account&quot;-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景</p> 
     * @return PayScene <p>付费场景PayMode=postPay时：spotpay-竞价实例,&quot;settle account&quot;-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景</p>
     */
    public String getPayScene() {
        return this.PayScene;
    }

    /**
     * Set <p>付费场景PayMode=postPay时：spotpay-竞价实例,&quot;settle account&quot;-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景</p>
     * @param PayScene <p>付费场景PayMode=postPay时：spotpay-竞价实例,&quot;settle account&quot;-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景</p>
     */
    public void setPayScene(String PayScene) {
        this.PayScene = PayScene;
    }

    /**
     * Get <p>操作人，默认就是用户uin</p> 
     * @return Operator <p>操作人，默认就是用户uin</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作人，默认就是用户uin</p>
     * @param Operator <p>操作人，默认就是用户uin</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>代金券主类型 has_price 为有价现金券 no_price 为无价代金券</p> 
     * @return VoucherMainType <p>代金券主类型 has_price 为有价现金券 no_price 为无价代金券</p>
     */
    public String getVoucherMainType() {
        return this.VoucherMainType;
    }

    /**
     * Set <p>代金券主类型 has_price 为有价现金券 no_price 为无价代金券</p>
     * @param VoucherMainType <p>代金券主类型 has_price 为有价现金券 no_price 为无价代金券</p>
     */
    public void setVoucherMainType(String VoucherMainType) {
        this.VoucherMainType = VoucherMainType;
    }

    /**
     * Get <p>代金券副类型 discount 为折扣券 deduct 为抵扣券</p> 
     * @return VoucherSubType <p>代金券副类型 discount 为折扣券 deduct 为抵扣券</p>
     */
    public String getVoucherSubType() {
        return this.VoucherSubType;
    }

    /**
     * Set <p>代金券副类型 discount 为折扣券 deduct 为抵扣券</p>
     * @param VoucherSubType <p>代金券副类型 discount 为折扣券 deduct 为抵扣券</p>
     */
    public void setVoucherSubType(String VoucherSubType) {
        this.VoucherSubType = VoucherSubType;
    }

    /**
     * Get <p>券有效时间开始时间</p> 
     * @return StartTimeFrom <p>券有效时间开始时间</p>
     */
    public String getStartTimeFrom() {
        return this.StartTimeFrom;
    }

    /**
     * Set <p>券有效时间开始时间</p>
     * @param StartTimeFrom <p>券有效时间开始时间</p>
     */
    public void setStartTimeFrom(String StartTimeFrom) {
        this.StartTimeFrom = StartTimeFrom;
    }

    /**
     * Get <p>券有效时间结束时间</p> 
     * @return StartTimeTo <p>券有效时间结束时间</p>
     */
    public String getStartTimeTo() {
        return this.StartTimeTo;
    }

    /**
     * Set <p>券有效时间结束时间</p>
     * @param StartTimeTo <p>券有效时间结束时间</p>
     */
    public void setStartTimeTo(String StartTimeTo) {
        this.StartTimeTo = StartTimeTo;
    }

    /**
     * Get <p>券失效时间开始时间</p> 
     * @return EndTimeFrom <p>券失效时间开始时间</p>
     */
    public String getEndTimeFrom() {
        return this.EndTimeFrom;
    }

    /**
     * Set <p>券失效时间开始时间</p>
     * @param EndTimeFrom <p>券失效时间开始时间</p>
     */
    public void setEndTimeFrom(String EndTimeFrom) {
        this.EndTimeFrom = EndTimeFrom;
    }

    /**
     * Get <p>券失效时间结束时间</p> 
     * @return EndTimeTo <p>券失效时间结束时间</p>
     */
    public String getEndTimeTo() {
        return this.EndTimeTo;
    }

    /**
     * Set <p>券失效时间结束时间</p>
     * @param EndTimeTo <p>券失效时间结束时间</p>
     */
    public void setEndTimeTo(String EndTimeTo) {
        this.EndTimeTo = EndTimeTo;
    }

    /**
     * Get <p>发券时间开始时间</p> 
     * @return CreateTimeFrom <p>发券时间开始时间</p>
     */
    public String getCreateTimeFrom() {
        return this.CreateTimeFrom;
    }

    /**
     * Set <p>发券时间开始时间</p>
     * @param CreateTimeFrom <p>发券时间开始时间</p>
     */
    public void setCreateTimeFrom(String CreateTimeFrom) {
        this.CreateTimeFrom = CreateTimeFrom;
    }

    /**
     * Get <p>发券时间结束时间</p> 
     * @return CreateTimeTo <p>发券时间结束时间</p>
     */
    public String getCreateTimeTo() {
        return this.CreateTimeTo;
    }

    /**
     * Set <p>发券时间结束时间</p>
     * @param CreateTimeTo <p>发券时间结束时间</p>
     */
    public void setCreateTimeTo(String CreateTimeTo) {
        this.CreateTimeTo = CreateTimeTo;
    }

    /**
     * Get <p>语言参数</p><p>默认值：zh</p><p>期望返回产品名称中文或其他语言，目前仅支持中文、英文；填&quot;zh&quot;或不填时返回中文，其他情况返回英文</p> 
     * @return Lang <p>语言参数</p><p>默认值：zh</p><p>期望返回产品名称中文或其他语言，目前仅支持中文、英文；填&quot;zh&quot;或不填时返回中文，其他情况返回英文</p>
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set <p>语言参数</p><p>默认值：zh</p><p>期望返回产品名称中文或其他语言，目前仅支持中文、英文；填&quot;zh&quot;或不填时返回中文，其他情况返回英文</p>
     * @param Lang <p>语言参数</p><p>默认值：zh</p><p>期望返回产品名称中文或其他语言，目前仅支持中文、英文；填&quot;zh&quot;或不填时返回中文，其他情况返回英文</p>
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
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
        if (source.VoucherMainType != null) {
            this.VoucherMainType = new String(source.VoucherMainType);
        }
        if (source.VoucherSubType != null) {
            this.VoucherSubType = new String(source.VoucherSubType);
        }
        if (source.StartTimeFrom != null) {
            this.StartTimeFrom = new String(source.StartTimeFrom);
        }
        if (source.StartTimeTo != null) {
            this.StartTimeTo = new String(source.StartTimeTo);
        }
        if (source.EndTimeFrom != null) {
            this.EndTimeFrom = new String(source.EndTimeFrom);
        }
        if (source.EndTimeTo != null) {
            this.EndTimeTo = new String(source.EndTimeTo);
        }
        if (source.CreateTimeFrom != null) {
            this.CreateTimeFrom = new String(source.CreateTimeFrom);
        }
        if (source.CreateTimeTo != null) {
            this.CreateTimeTo = new String(source.CreateTimeTo);
        }
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
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
        this.setParamSimple(map, prefix + "VoucherMainType", this.VoucherMainType);
        this.setParamSimple(map, prefix + "VoucherSubType", this.VoucherSubType);
        this.setParamSimple(map, prefix + "StartTimeFrom", this.StartTimeFrom);
        this.setParamSimple(map, prefix + "StartTimeTo", this.StartTimeTo);
        this.setParamSimple(map, prefix + "EndTimeFrom", this.EndTimeFrom);
        this.setParamSimple(map, prefix + "EndTimeTo", this.EndTimeTo);
        this.setParamSimple(map, prefix + "CreateTimeFrom", this.CreateTimeFrom);
        this.setParamSimple(map, prefix + "CreateTimeTo", this.CreateTimeTo);
        this.setParamSimple(map, prefix + "Lang", this.Lang);

    }
}

