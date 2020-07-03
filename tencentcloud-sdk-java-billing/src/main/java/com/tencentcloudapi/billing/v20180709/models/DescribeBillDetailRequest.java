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

public class DescribeBillDetailRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数量，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往[账单概览](https://console.cloud.tencent.com/expense/bill/overview)页面顶部查看确认您的账单统计周期类型。
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * 月份，格式为yyyy-mm，Month和BeginTime&EndTime必传一个，如果有传BeginTime&EndTime则Month字段无效。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 周期开始时间，格式为Y-m-d H:i:s，Month和BeginTime&EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。(不支持跨月查询)
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 周期结束时间，格式为Y-m-d H:i:s，Month和BeginTime&EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。（不支持跨月查询）
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 是否需要访问列表的总记录数，用于前端分页
1-表示需要， 0-表示不需要
    */
    @SerializedName("NeedRecordNum")
    @Expose
    private Long NeedRecordNum;

    /**
    * 查询指定产品信息
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 付费模式 prePay/postPay
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 查询指定资源信息
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 查询交易类型。如 按量计费日结，按量计费小时结 等
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数量，最大值为100 
     * @return Limit 数量，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数量，最大值为100
     * @param Limit 数量，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往[账单概览](https://console.cloud.tencent.com/expense/bill/overview)页面顶部查看确认您的账单统计周期类型。 
     * @return PeriodType 周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往[账单概览](https://console.cloud.tencent.com/expense/bill/overview)页面顶部查看确认您的账单统计周期类型。
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set 周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往[账单概览](https://console.cloud.tencent.com/expense/bill/overview)页面顶部查看确认您的账单统计周期类型。
     * @param PeriodType 周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往[账单概览](https://console.cloud.tencent.com/expense/bill/overview)页面顶部查看确认您的账单统计周期类型。
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get 月份，格式为yyyy-mm，Month和BeginTime&EndTime必传一个，如果有传BeginTime&EndTime则Month字段无效。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。 
     * @return Month 月份，格式为yyyy-mm，Month和BeginTime&EndTime必传一个，如果有传BeginTime&EndTime则Month字段无效。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 月份，格式为yyyy-mm，Month和BeginTime&EndTime必传一个，如果有传BeginTime&EndTime则Month字段无效。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。
     * @param Month 月份，格式为yyyy-mm，Month和BeginTime&EndTime必传一个，如果有传BeginTime&EndTime则Month字段无效。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get 周期开始时间，格式为Y-m-d H:i:s，Month和BeginTime&EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。(不支持跨月查询) 
     * @return BeginTime 周期开始时间，格式为Y-m-d H:i:s，Month和BeginTime&EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。(不支持跨月查询)
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 周期开始时间，格式为Y-m-d H:i:s，Month和BeginTime&EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。(不支持跨月查询)
     * @param BeginTime 周期开始时间，格式为Y-m-d H:i:s，Month和BeginTime&EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。(不支持跨月查询)
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 周期结束时间，格式为Y-m-d H:i:s，Month和BeginTime&EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。（不支持跨月查询） 
     * @return EndTime 周期结束时间，格式为Y-m-d H:i:s，Month和BeginTime&EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。（不支持跨月查询）
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 周期结束时间，格式为Y-m-d H:i:s，Month和BeginTime&EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。（不支持跨月查询）
     * @param EndTime 周期结束时间，格式为Y-m-d H:i:s，Month和BeginTime&EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传。不能早于开通账单2.0的月份，最多可拉取24个月内的数据。（不支持跨月查询）
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 是否需要访问列表的总记录数，用于前端分页
1-表示需要， 0-表示不需要 
     * @return NeedRecordNum 是否需要访问列表的总记录数，用于前端分页
1-表示需要， 0-表示不需要
     */
    public Long getNeedRecordNum() {
        return this.NeedRecordNum;
    }

    /**
     * Set 是否需要访问列表的总记录数，用于前端分页
1-表示需要， 0-表示不需要
     * @param NeedRecordNum 是否需要访问列表的总记录数，用于前端分页
1-表示需要， 0-表示不需要
     */
    public void setNeedRecordNum(Long NeedRecordNum) {
        this.NeedRecordNum = NeedRecordNum;
    }

    /**
     * Get 查询指定产品信息 
     * @return ProductCode 查询指定产品信息
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 查询指定产品信息
     * @param ProductCode 查询指定产品信息
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 付费模式 prePay/postPay 
     * @return PayMode 付费模式 prePay/postPay
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式 prePay/postPay
     * @param PayMode 付费模式 prePay/postPay
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 查询指定资源信息 
     * @return ResourceId 查询指定资源信息
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 查询指定资源信息
     * @param ResourceId 查询指定资源信息
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 查询交易类型。如 按量计费日结，按量计费小时结 等 
     * @return ActionType 查询交易类型。如 按量计费日结，按量计费小时结 等
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 查询交易类型。如 按量计费日结，按量计费小时结 等
     * @param ActionType 查询交易类型。如 按量计费日结，按量计费小时结 等
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NeedRecordNum", this.NeedRecordNum);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);

    }
}

