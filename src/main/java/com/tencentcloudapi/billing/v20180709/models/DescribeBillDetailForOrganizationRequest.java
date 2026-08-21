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

public class DescribeBillDetailForOrganizationRequest extends AbstractModel {

    /**
    * <p>分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>数量，最大值为100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往<a href="https://console.cloud.tencent.com/expense/bill/overview">账单概览</a>页面顶部查看确认您的账单统计周期类型。</p>
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * <p>月份，格式为yyyy-mm，Month和BeginTime&amp;EndTime必传一个，如果有传BeginTime&amp;EndTime则Month字段无效。最多可拉取近18个月内的数据。</p>
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * <p>周期开始时间，格式为yyyy-mm-dd hh:ii:ss，Month和BeginTime&amp;EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据。最多可拉取18个月内的数据。</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>周期结束时间，格式为yyyy-mm-dd hh:ii:ss，Month和BeginTime&amp;EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据。最多可拉取近18个月内的数据。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>是否需要访问列表的总记录数，用于前端分页<br>1-表示需要， 0-表示不需要</p>
    */
    @SerializedName("NeedRecordNum")
    @Expose
    private Long NeedRecordNum;

    /**
    * <p>付费模式 prePay(表示包年包月)/postPay(表示按时按量)</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>查询指定资源信息</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>查询交易类型（请使用交易类型名称入参），入参示例枚举如下：<br>包年包月新购<br>包年包月续费<br>包年包月配置变更<br>包年包月退款<br>按量计费扣费<br>线下项目扣费<br>线下产品扣费<br>调账扣费<br>调账补偿<br>按量计费小时结<br>按量计费日结<br>按量计费月结<br>竞价实例小时结<br>线下项目调账补偿<br>线下产品调账补偿<br>优惠扣费<br>优惠补偿<br>按量计费迁入资源<br>按量计费迁出资源<br>包年包月迁入资源<br>包年包月迁出资源<br>预付费用<br>小时费用<br>预留实例退款<br>按量计费冲正<br>包年包月转按量<br>保底扣款<br>节省计划小时费用</p>
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * <p>项目ID:资源所属项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>产品名称代码<br>备注：如需获取当月使用过的BusinessCode，请调用API：<a href="https://cloud.tencent.com/document/product/555/35761">获取产品汇总费用分布</a></p>
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * <p>上一次请求返回的上下文信息，翻页查询Month&gt;=2023-05的月份的数据可加快查询速度，数据量10万级别以上的用户建议使用，查询速度可提升2~10倍</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get <p>分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推</p> 
     * @return Offset <p>分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推</p>
     * @param Offset <p>分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>数量，最大值为100</p> 
     * @return Limit <p>数量，最大值为100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>数量，最大值为100</p>
     * @param Limit <p>数量，最大值为100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往<a href="https://console.cloud.tencent.com/expense/bill/overview">账单概览</a>页面顶部查看确认您的账单统计周期类型。</p> 
     * @return PeriodType <p>周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往<a href="https://console.cloud.tencent.com/expense/bill/overview">账单概览</a>页面顶部查看确认您的账单统计周期类型。</p>
     * @deprecated
     */
    @Deprecated
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set <p>周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往<a href="https://console.cloud.tencent.com/expense/bill/overview">账单概览</a>页面顶部查看确认您的账单统计周期类型。</p>
     * @param PeriodType <p>周期类型，byUsedTime按计费周期/byPayTime按扣费周期。需要与费用中心该月份账单的周期保持一致。您可前往<a href="https://console.cloud.tencent.com/expense/bill/overview">账单概览</a>页面顶部查看确认您的账单统计周期类型。</p>
     * @deprecated
     */
    @Deprecated
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get <p>月份，格式为yyyy-mm，Month和BeginTime&amp;EndTime必传一个，如果有传BeginTime&amp;EndTime则Month字段无效。最多可拉取近18个月内的数据。</p> 
     * @return Month <p>月份，格式为yyyy-mm，Month和BeginTime&amp;EndTime必传一个，如果有传BeginTime&amp;EndTime则Month字段无效。最多可拉取近18个月内的数据。</p>
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set <p>月份，格式为yyyy-mm，Month和BeginTime&amp;EndTime必传一个，如果有传BeginTime&amp;EndTime则Month字段无效。最多可拉取近18个月内的数据。</p>
     * @param Month <p>月份，格式为yyyy-mm，Month和BeginTime&amp;EndTime必传一个，如果有传BeginTime&amp;EndTime则Month字段无效。最多可拉取近18个月内的数据。</p>
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get <p>周期开始时间，格式为yyyy-mm-dd hh:ii:ss，Month和BeginTime&amp;EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据。最多可拉取18个月内的数据。</p> 
     * @return BeginTime <p>周期开始时间，格式为yyyy-mm-dd hh:ii:ss，Month和BeginTime&amp;EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据。最多可拉取18个月内的数据。</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>周期开始时间，格式为yyyy-mm-dd hh:ii:ss，Month和BeginTime&amp;EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据。最多可拉取18个月内的数据。</p>
     * @param BeginTime <p>周期开始时间，格式为yyyy-mm-dd hh:ii:ss，Month和BeginTime&amp;EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据。最多可拉取18个月内的数据。</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>周期结束时间，格式为yyyy-mm-dd hh:ii:ss，Month和BeginTime&amp;EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据。最多可拉取近18个月内的数据。</p> 
     * @return EndTime <p>周期结束时间，格式为yyyy-mm-dd hh:ii:ss，Month和BeginTime&amp;EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据。最多可拉取近18个月内的数据。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>周期结束时间，格式为yyyy-mm-dd hh:ii:ss，Month和BeginTime&amp;EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据。最多可拉取近18个月内的数据。</p>
     * @param EndTime <p>周期结束时间，格式为yyyy-mm-dd hh:ii:ss，Month和BeginTime&amp;EndTime必传一个，如果有该字段则Month字段无效。BeginTime和EndTime必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据。最多可拉取近18个月内的数据。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>是否需要访问列表的总记录数，用于前端分页<br>1-表示需要， 0-表示不需要</p> 
     * @return NeedRecordNum <p>是否需要访问列表的总记录数，用于前端分页<br>1-表示需要， 0-表示不需要</p>
     */
    public Long getNeedRecordNum() {
        return this.NeedRecordNum;
    }

    /**
     * Set <p>是否需要访问列表的总记录数，用于前端分页<br>1-表示需要， 0-表示不需要</p>
     * @param NeedRecordNum <p>是否需要访问列表的总记录数，用于前端分页<br>1-表示需要， 0-表示不需要</p>
     */
    public void setNeedRecordNum(Long NeedRecordNum) {
        this.NeedRecordNum = NeedRecordNum;
    }

    /**
     * Get <p>付费模式 prePay(表示包年包月)/postPay(表示按时按量)</p> 
     * @return PayMode <p>付费模式 prePay(表示包年包月)/postPay(表示按时按量)</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式 prePay(表示包年包月)/postPay(表示按时按量)</p>
     * @param PayMode <p>付费模式 prePay(表示包年包月)/postPay(表示按时按量)</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>查询指定资源信息</p> 
     * @return ResourceId <p>查询指定资源信息</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>查询指定资源信息</p>
     * @param ResourceId <p>查询指定资源信息</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>查询交易类型（请使用交易类型名称入参），入参示例枚举如下：<br>包年包月新购<br>包年包月续费<br>包年包月配置变更<br>包年包月退款<br>按量计费扣费<br>线下项目扣费<br>线下产品扣费<br>调账扣费<br>调账补偿<br>按量计费小时结<br>按量计费日结<br>按量计费月结<br>竞价实例小时结<br>线下项目调账补偿<br>线下产品调账补偿<br>优惠扣费<br>优惠补偿<br>按量计费迁入资源<br>按量计费迁出资源<br>包年包月迁入资源<br>包年包月迁出资源<br>预付费用<br>小时费用<br>预留实例退款<br>按量计费冲正<br>包年包月转按量<br>保底扣款<br>节省计划小时费用</p> 
     * @return ActionType <p>查询交易类型（请使用交易类型名称入参），入参示例枚举如下：<br>包年包月新购<br>包年包月续费<br>包年包月配置变更<br>包年包月退款<br>按量计费扣费<br>线下项目扣费<br>线下产品扣费<br>调账扣费<br>调账补偿<br>按量计费小时结<br>按量计费日结<br>按量计费月结<br>竞价实例小时结<br>线下项目调账补偿<br>线下产品调账补偿<br>优惠扣费<br>优惠补偿<br>按量计费迁入资源<br>按量计费迁出资源<br>包年包月迁入资源<br>包年包月迁出资源<br>预付费用<br>小时费用<br>预留实例退款<br>按量计费冲正<br>包年包月转按量<br>保底扣款<br>节省计划小时费用</p>
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>查询交易类型（请使用交易类型名称入参），入参示例枚举如下：<br>包年包月新购<br>包年包月续费<br>包年包月配置变更<br>包年包月退款<br>按量计费扣费<br>线下项目扣费<br>线下产品扣费<br>调账扣费<br>调账补偿<br>按量计费小时结<br>按量计费日结<br>按量计费月结<br>竞价实例小时结<br>线下项目调账补偿<br>线下产品调账补偿<br>优惠扣费<br>优惠补偿<br>按量计费迁入资源<br>按量计费迁出资源<br>包年包月迁入资源<br>包年包月迁出资源<br>预付费用<br>小时费用<br>预留实例退款<br>按量计费冲正<br>包年包月转按量<br>保底扣款<br>节省计划小时费用</p>
     * @param ActionType <p>查询交易类型（请使用交易类型名称入参），入参示例枚举如下：<br>包年包月新购<br>包年包月续费<br>包年包月配置变更<br>包年包月退款<br>按量计费扣费<br>线下项目扣费<br>线下产品扣费<br>调账扣费<br>调账补偿<br>按量计费小时结<br>按量计费日结<br>按量计费月结<br>竞价实例小时结<br>线下项目调账补偿<br>线下产品调账补偿<br>优惠扣费<br>优惠补偿<br>按量计费迁入资源<br>按量计费迁出资源<br>包年包月迁入资源<br>包年包月迁出资源<br>预付费用<br>小时费用<br>预留实例退款<br>按量计费冲正<br>包年包月转按量<br>保底扣款<br>节省计划小时费用</p>
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>项目ID:资源所属项目ID</p> 
     * @return ProjectId <p>项目ID:资源所属项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID:资源所属项目ID</p>
     * @param ProjectId <p>项目ID:资源所属项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>产品名称代码<br>备注：如需获取当月使用过的BusinessCode，请调用API：<a href="https://cloud.tencent.com/document/product/555/35761">获取产品汇总费用分布</a></p> 
     * @return BusinessCode <p>产品名称代码<br>备注：如需获取当月使用过的BusinessCode，请调用API：<a href="https://cloud.tencent.com/document/product/555/35761">获取产品汇总费用分布</a></p>
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set <p>产品名称代码<br>备注：如需获取当月使用过的BusinessCode，请调用API：<a href="https://cloud.tencent.com/document/product/555/35761">获取产品汇总费用分布</a></p>
     * @param BusinessCode <p>产品名称代码<br>备注：如需获取当月使用过的BusinessCode，请调用API：<a href="https://cloud.tencent.com/document/product/555/35761">获取产品汇总费用分布</a></p>
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get <p>上一次请求返回的上下文信息，翻页查询Month&gt;=2023-05的月份的数据可加快查询速度，数据量10万级别以上的用户建议使用，查询速度可提升2~10倍</p> 
     * @return Context <p>上一次请求返回的上下文信息，翻页查询Month&gt;=2023-05的月份的数据可加快查询速度，数据量10万级别以上的用户建议使用，查询速度可提升2~10倍</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>上一次请求返回的上下文信息，翻页查询Month&gt;=2023-05的月份的数据可加快查询速度，数据量10万级别以上的用户建议使用，查询速度可提升2~10倍</p>
     * @param Context <p>上一次请求返回的上下文信息，翻页查询Month&gt;=2023-05的月份的数据可加快查询速度，数据量10万级别以上的用户建议使用，查询速度可提升2~10倍</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    public DescribeBillDetailForOrganizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillDetailForOrganizationRequest(DescribeBillDetailForOrganizationRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.NeedRecordNum != null) {
            this.NeedRecordNum = new Long(source.NeedRecordNum);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
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
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

