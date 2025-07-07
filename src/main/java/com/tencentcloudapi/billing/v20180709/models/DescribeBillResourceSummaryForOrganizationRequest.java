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

public class DescribeBillResourceSummaryForOrganizationRequest extends AbstractModel {

    /**
    * 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数量，最大值为1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 月份，格式为yyyy-mm。不能早于开通账单2.0的月份
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往[账单概览](https://console.cloud.tencent.com/expense/bill/overview)页面顶部查看确认您的账单统计周期类型。
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * 是否需要访问列表的总记录数，用于前端分页
1-表示需要， 0-表示不需要
    */
    @SerializedName("NeedRecordNum")
    @Expose
    private Long NeedRecordNum;

    /**
    * 查询交易类型（请使用交易类型名称入参），入参示例枚举如下：
包年包月新购
包年包月续费
包年包月配置变更
包年包月退款 
按量计费扣费 
线下项目扣费 
线下产品扣费 
调账扣费 
调账补偿 
按量计费小时结 
按量计费日结 
按量计费月结 
竞价实例小时结 
线下项目调账补偿 
线下产品调账补偿 
优惠扣费 
优惠补偿 
按量计费迁入资源 
按量计费迁出资源 
包年包月迁入资源 
包年包月迁出资源 
预付费用 
小时费用 
预留实例退款 
按量计费冲正 
包年包月转按量 
保底扣款 
节省计划小时费用
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 查询指定资源信息
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 付费模式 prePay/postPay
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 产品名称代码
备注：如需获取当月使用过的BusinessCode，请调用API：<a href="https://cloud.tencent.com/document/product/555/35761">获取产品汇总费用分布</a>
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * 分账标签键，用户自定义（支持2021-01以后账单查询）
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 分账标签值，该参数为空表示该标签键下未设置标签值的记录
（支持2021-01以后账单查询）
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
     * Get 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推 
     * @return Offset 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推
     * @param Offset 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数量，最大值为1000 
     * @return Limit 数量，最大值为1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数量，最大值为1000
     * @param Limit 数量，最大值为1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 月份，格式为yyyy-mm。不能早于开通账单2.0的月份 
     * @return Month 月份，格式为yyyy-mm。不能早于开通账单2.0的月份
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 月份，格式为yyyy-mm。不能早于开通账单2.0的月份
     * @param Month 月份，格式为yyyy-mm。不能早于开通账单2.0的月份
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get 周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往[账单概览](https://console.cloud.tencent.com/expense/bill/overview)页面顶部查看确认您的账单统计周期类型。 
     * @return PeriodType 周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往[账单概览](https://console.cloud.tencent.com/expense/bill/overview)页面顶部查看确认您的账单统计周期类型。
     * @deprecated
     */
    @Deprecated
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set 周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往[账单概览](https://console.cloud.tencent.com/expense/bill/overview)页面顶部查看确认您的账单统计周期类型。
     * @param PeriodType 周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往[账单概览](https://console.cloud.tencent.com/expense/bill/overview)页面顶部查看确认您的账单统计周期类型。
     * @deprecated
     */
    @Deprecated
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
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
     * Get 查询交易类型（请使用交易类型名称入参），入参示例枚举如下：
包年包月新购
包年包月续费
包年包月配置变更
包年包月退款 
按量计费扣费 
线下项目扣费 
线下产品扣费 
调账扣费 
调账补偿 
按量计费小时结 
按量计费日结 
按量计费月结 
竞价实例小时结 
线下项目调账补偿 
线下产品调账补偿 
优惠扣费 
优惠补偿 
按量计费迁入资源 
按量计费迁出资源 
包年包月迁入资源 
包年包月迁出资源 
预付费用 
小时费用 
预留实例退款 
按量计费冲正 
包年包月转按量 
保底扣款 
节省计划小时费用 
     * @return ActionType 查询交易类型（请使用交易类型名称入参），入参示例枚举如下：
包年包月新购
包年包月续费
包年包月配置变更
包年包月退款 
按量计费扣费 
线下项目扣费 
线下产品扣费 
调账扣费 
调账补偿 
按量计费小时结 
按量计费日结 
按量计费月结 
竞价实例小时结 
线下项目调账补偿 
线下产品调账补偿 
优惠扣费 
优惠补偿 
按量计费迁入资源 
按量计费迁出资源 
包年包月迁入资源 
包年包月迁出资源 
预付费用 
小时费用 
预留实例退款 
按量计费冲正 
包年包月转按量 
保底扣款 
节省计划小时费用
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 查询交易类型（请使用交易类型名称入参），入参示例枚举如下：
包年包月新购
包年包月续费
包年包月配置变更
包年包月退款 
按量计费扣费 
线下项目扣费 
线下产品扣费 
调账扣费 
调账补偿 
按量计费小时结 
按量计费日结 
按量计费月结 
竞价实例小时结 
线下项目调账补偿 
线下产品调账补偿 
优惠扣费 
优惠补偿 
按量计费迁入资源 
按量计费迁出资源 
包年包月迁入资源 
包年包月迁出资源 
预付费用 
小时费用 
预留实例退款 
按量计费冲正 
包年包月转按量 
保底扣款 
节省计划小时费用
     * @param ActionType 查询交易类型（请使用交易类型名称入参），入参示例枚举如下：
包年包月新购
包年包月续费
包年包月配置变更
包年包月退款 
按量计费扣费 
线下项目扣费 
线下产品扣费 
调账扣费 
调账补偿 
按量计费小时结 
按量计费日结 
按量计费月结 
竞价实例小时结 
线下项目调账补偿 
线下产品调账补偿 
优惠扣费 
优惠补偿 
按量计费迁入资源 
按量计费迁出资源 
包年包月迁入资源 
包年包月迁出资源 
预付费用 
小时费用 
预留实例退款 
按量计费冲正 
包年包月转按量 
保底扣款 
节省计划小时费用
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
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
     * Get 产品名称代码
备注：如需获取当月使用过的BusinessCode，请调用API：<a href="https://cloud.tencent.com/document/product/555/35761">获取产品汇总费用分布</a> 
     * @return BusinessCode 产品名称代码
备注：如需获取当月使用过的BusinessCode，请调用API：<a href="https://cloud.tencent.com/document/product/555/35761">获取产品汇总费用分布</a>
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set 产品名称代码
备注：如需获取当月使用过的BusinessCode，请调用API：<a href="https://cloud.tencent.com/document/product/555/35761">获取产品汇总费用分布</a>
     * @param BusinessCode 产品名称代码
备注：如需获取当月使用过的BusinessCode，请调用API：<a href="https://cloud.tencent.com/document/product/555/35761">获取产品汇总费用分布</a>
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get 分账标签键，用户自定义（支持2021-01以后账单查询） 
     * @return TagKey 分账标签键，用户自定义（支持2021-01以后账单查询）
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 分账标签键，用户自定义（支持2021-01以后账单查询）
     * @param TagKey 分账标签键，用户自定义（支持2021-01以后账单查询）
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 分账标签值，该参数为空表示该标签键下未设置标签值的记录
（支持2021-01以后账单查询） 
     * @return TagValue 分账标签值，该参数为空表示该标签键下未设置标签值的记录
（支持2021-01以后账单查询）
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 分账标签值，该参数为空表示该标签键下未设置标签值的记录
（支持2021-01以后账单查询）
     * @param TagValue 分账标签值，该参数为空表示该标签键下未设置标签值的记录
（支持2021-01以后账单查询）
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    public DescribeBillResourceSummaryForOrganizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillResourceSummaryForOrganizationRequest(DescribeBillResourceSummaryForOrganizationRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.NeedRecordNum != null) {
            this.NeedRecordNum = new Long(source.NeedRecordNum);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamSimple(map, prefix + "NeedRecordNum", this.NeedRecordNum);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);

    }
}

