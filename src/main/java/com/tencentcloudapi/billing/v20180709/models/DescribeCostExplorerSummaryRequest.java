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

public class DescribeCostExplorerSummaryRequest extends AbstractModel {

    /**
    * <p>周期开始时间，格式为yyyy-mm-dd hh:ii:ss</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>周期结束时间，格式为yyyy-mm-dd hh:ii:ss</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>账单类型：1-费用账单、2-消耗账单</p>
    */
    @SerializedName("BillType")
    @Expose
    private String BillType;

    /**
    * <p>统计周期：日-day，月-month；</p>
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * <p>分类维度（数据汇总维度），查询分类维度（请使用分类维度code入参）入参枚举值：<br>default=仅总计<br>feeType=费用类型<br>billType=账单类型<br>business=产品<br>product=子产品<br>region=地域<br>zone=可用区<br>actionType=交易类型<br>payMode =计费模式<br>tags=标签<br>project =项目<br>payerUin=支付者账号<br>ownerUin=使用者账号</p>
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * <p>费用类型：cost-折后总费用，totalCost-原价费用</p>
    */
    @SerializedName("FeeType")
    @Expose
    private String FeeType;

    /**
    * <p>数量，每页最大值为100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>起始页，当PageNo=1表示第一页， PageNo=2表示第二页，依次类推。</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>分账标签键</p>
    */
    @SerializedName("TagKeyStr")
    @Expose
    private String TagKeyStr;

    /**
    * <p>是否需要筛选框， 1-表示需要， 0-表示不需要，若不传默认不需要。</p>
    */
    @SerializedName("NeedConditionValue")
    @Expose
    private String NeedConditionValue;

    /**
    * <p>筛选参数</p>
    */
    @SerializedName("Conditions")
    @Expose
    private AnalyseConditions Conditions;

    /**
     * Get <p>周期开始时间，格式为yyyy-mm-dd hh:ii:ss</p> 
     * @return BeginTime <p>周期开始时间，格式为yyyy-mm-dd hh:ii:ss</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>周期开始时间，格式为yyyy-mm-dd hh:ii:ss</p>
     * @param BeginTime <p>周期开始时间，格式为yyyy-mm-dd hh:ii:ss</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>周期结束时间，格式为yyyy-mm-dd hh:ii:ss</p> 
     * @return EndTime <p>周期结束时间，格式为yyyy-mm-dd hh:ii:ss</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>周期结束时间，格式为yyyy-mm-dd hh:ii:ss</p>
     * @param EndTime <p>周期结束时间，格式为yyyy-mm-dd hh:ii:ss</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>账单类型：1-费用账单、2-消耗账单</p> 
     * @return BillType <p>账单类型：1-费用账单、2-消耗账单</p>
     */
    public String getBillType() {
        return this.BillType;
    }

    /**
     * Set <p>账单类型：1-费用账单、2-消耗账单</p>
     * @param BillType <p>账单类型：1-费用账单、2-消耗账单</p>
     */
    public void setBillType(String BillType) {
        this.BillType = BillType;
    }

    /**
     * Get <p>统计周期：日-day，月-month；</p> 
     * @return PeriodType <p>统计周期：日-day，月-month；</p>
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set <p>统计周期：日-day，月-month；</p>
     * @param PeriodType <p>统计周期：日-day，月-month；</p>
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get <p>分类维度（数据汇总维度），查询分类维度（请使用分类维度code入参）入参枚举值：<br>default=仅总计<br>feeType=费用类型<br>billType=账单类型<br>business=产品<br>product=子产品<br>region=地域<br>zone=可用区<br>actionType=交易类型<br>payMode =计费模式<br>tags=标签<br>project =项目<br>payerUin=支付者账号<br>ownerUin=使用者账号</p> 
     * @return Dimensions <p>分类维度（数据汇总维度），查询分类维度（请使用分类维度code入参）入参枚举值：<br>default=仅总计<br>feeType=费用类型<br>billType=账单类型<br>business=产品<br>product=子产品<br>region=地域<br>zone=可用区<br>actionType=交易类型<br>payMode =计费模式<br>tags=标签<br>project =项目<br>payerUin=支付者账号<br>ownerUin=使用者账号</p>
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>分类维度（数据汇总维度），查询分类维度（请使用分类维度code入参）入参枚举值：<br>default=仅总计<br>feeType=费用类型<br>billType=账单类型<br>business=产品<br>product=子产品<br>region=地域<br>zone=可用区<br>actionType=交易类型<br>payMode =计费模式<br>tags=标签<br>project =项目<br>payerUin=支付者账号<br>ownerUin=使用者账号</p>
     * @param Dimensions <p>分类维度（数据汇总维度），查询分类维度（请使用分类维度code入参）入参枚举值：<br>default=仅总计<br>feeType=费用类型<br>billType=账单类型<br>business=产品<br>product=子产品<br>region=地域<br>zone=可用区<br>actionType=交易类型<br>payMode =计费模式<br>tags=标签<br>project =项目<br>payerUin=支付者账号<br>ownerUin=使用者账号</p>
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get <p>费用类型：cost-折后总费用，totalCost-原价费用</p> 
     * @return FeeType <p>费用类型：cost-折后总费用，totalCost-原价费用</p>
     */
    public String getFeeType() {
        return this.FeeType;
    }

    /**
     * Set <p>费用类型：cost-折后总费用，totalCost-原价费用</p>
     * @param FeeType <p>费用类型：cost-折后总费用，totalCost-原价费用</p>
     */
    public void setFeeType(String FeeType) {
        this.FeeType = FeeType;
    }

    /**
     * Get <p>数量，每页最大值为100</p> 
     * @return PageSize <p>数量，每页最大值为100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>数量，每页最大值为100</p>
     * @param PageSize <p>数量，每页最大值为100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>起始页，当PageNo=1表示第一页， PageNo=2表示第二页，依次类推。</p> 
     * @return PageNo <p>起始页，当PageNo=1表示第一页， PageNo=2表示第二页，依次类推。</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>起始页，当PageNo=1表示第一页， PageNo=2表示第二页，依次类推。</p>
     * @param PageNo <p>起始页，当PageNo=1表示第一页， PageNo=2表示第二页，依次类推。</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>分账标签键</p> 
     * @return TagKeyStr <p>分账标签键</p>
     */
    public String getTagKeyStr() {
        return this.TagKeyStr;
    }

    /**
     * Set <p>分账标签键</p>
     * @param TagKeyStr <p>分账标签键</p>
     */
    public void setTagKeyStr(String TagKeyStr) {
        this.TagKeyStr = TagKeyStr;
    }

    /**
     * Get <p>是否需要筛选框， 1-表示需要， 0-表示不需要，若不传默认不需要。</p> 
     * @return NeedConditionValue <p>是否需要筛选框， 1-表示需要， 0-表示不需要，若不传默认不需要。</p>
     */
    public String getNeedConditionValue() {
        return this.NeedConditionValue;
    }

    /**
     * Set <p>是否需要筛选框， 1-表示需要， 0-表示不需要，若不传默认不需要。</p>
     * @param NeedConditionValue <p>是否需要筛选框， 1-表示需要， 0-表示不需要，若不传默认不需要。</p>
     */
    public void setNeedConditionValue(String NeedConditionValue) {
        this.NeedConditionValue = NeedConditionValue;
    }

    /**
     * Get <p>筛选参数</p> 
     * @return Conditions <p>筛选参数</p>
     */
    public AnalyseConditions getConditions() {
        return this.Conditions;
    }

    /**
     * Set <p>筛选参数</p>
     * @param Conditions <p>筛选参数</p>
     */
    public void setConditions(AnalyseConditions Conditions) {
        this.Conditions = Conditions;
    }

    public DescribeCostExplorerSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCostExplorerSummaryRequest(DescribeCostExplorerSummaryRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.BillType != null) {
            this.BillType = new String(source.BillType);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
        }
        if (source.FeeType != null) {
            this.FeeType = new String(source.FeeType);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.TagKeyStr != null) {
            this.TagKeyStr = new String(source.TagKeyStr);
        }
        if (source.NeedConditionValue != null) {
            this.NeedConditionValue = new String(source.NeedConditionValue);
        }
        if (source.Conditions != null) {
            this.Conditions = new AnalyseConditions(source.Conditions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamSimple(map, prefix + "FeeType", this.FeeType);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "TagKeyStr", this.TagKeyStr);
        this.setParamSimple(map, prefix + "NeedConditionValue", this.NeedConditionValue);
        this.setParamObj(map, prefix + "Conditions.", this.Conditions);

    }
}

