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
    * 周期开始时间，格式为yyyy-mm-dd hh:ii:ss
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 周期结束时间，格式为yyyy-mm-dd hh:ii:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 账单类型：1-费用账单、2-消耗账单
    */
    @SerializedName("BillType")
    @Expose
    private String BillType;

    /**
    * 统计周期：日-day，月-month；
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * 分类维度（数据汇总维度），查询分类维度（请使用分类维度code入参）入参枚举值：
default=仅总计
feeType=费用类型
billType=账单类型
business=产品
product=子产品
region=地域
zone=可用区
actionType=交易类型
payMode =计费模式
tags=标签
project =项目
payerUin=支付者账号
ownerUin=使用者账号
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * 费用类型：cost-折后总费用，totalCost-原价费用
    */
    @SerializedName("FeeType")
    @Expose
    private String FeeType;

    /**
    * 数量，每页最大值为100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 起始页，当PageNo=1表示第一页， PageNo=2表示第二页，依次类推。
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 分账标签值
    */
    @SerializedName("TagKeyStr")
    @Expose
    private String TagKeyStr;

    /**
    * 是否需要筛选框， 1-表示需要， 0-表示不需要，若不传默认不需要。
    */
    @SerializedName("NeedConditionValue")
    @Expose
    private String NeedConditionValue;

    /**
    * 筛选参数
    */
    @SerializedName("Conditions")
    @Expose
    private AnalyseConditions Conditions;

    /**
     * Get 周期开始时间，格式为yyyy-mm-dd hh:ii:ss 
     * @return BeginTime 周期开始时间，格式为yyyy-mm-dd hh:ii:ss
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 周期开始时间，格式为yyyy-mm-dd hh:ii:ss
     * @param BeginTime 周期开始时间，格式为yyyy-mm-dd hh:ii:ss
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 周期结束时间，格式为yyyy-mm-dd hh:ii:ss 
     * @return EndTime 周期结束时间，格式为yyyy-mm-dd hh:ii:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 周期结束时间，格式为yyyy-mm-dd hh:ii:ss
     * @param EndTime 周期结束时间，格式为yyyy-mm-dd hh:ii:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 账单类型：1-费用账单、2-消耗账单 
     * @return BillType 账单类型：1-费用账单、2-消耗账单
     */
    public String getBillType() {
        return this.BillType;
    }

    /**
     * Set 账单类型：1-费用账单、2-消耗账单
     * @param BillType 账单类型：1-费用账单、2-消耗账单
     */
    public void setBillType(String BillType) {
        this.BillType = BillType;
    }

    /**
     * Get 统计周期：日-day，月-month； 
     * @return PeriodType 统计周期：日-day，月-month；
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set 统计周期：日-day，月-month；
     * @param PeriodType 统计周期：日-day，月-month；
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get 分类维度（数据汇总维度），查询分类维度（请使用分类维度code入参）入参枚举值：
default=仅总计
feeType=费用类型
billType=账单类型
business=产品
product=子产品
region=地域
zone=可用区
actionType=交易类型
payMode =计费模式
tags=标签
project =项目
payerUin=支付者账号
ownerUin=使用者账号 
     * @return Dimensions 分类维度（数据汇总维度），查询分类维度（请使用分类维度code入参）入参枚举值：
default=仅总计
feeType=费用类型
billType=账单类型
business=产品
product=子产品
region=地域
zone=可用区
actionType=交易类型
payMode =计费模式
tags=标签
project =项目
payerUin=支付者账号
ownerUin=使用者账号
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 分类维度（数据汇总维度），查询分类维度（请使用分类维度code入参）入参枚举值：
default=仅总计
feeType=费用类型
billType=账单类型
business=产品
product=子产品
region=地域
zone=可用区
actionType=交易类型
payMode =计费模式
tags=标签
project =项目
payerUin=支付者账号
ownerUin=使用者账号
     * @param Dimensions 分类维度（数据汇总维度），查询分类维度（请使用分类维度code入参）入参枚举值：
default=仅总计
feeType=费用类型
billType=账单类型
business=产品
product=子产品
region=地域
zone=可用区
actionType=交易类型
payMode =计费模式
tags=标签
project =项目
payerUin=支付者账号
ownerUin=使用者账号
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 费用类型：cost-折后总费用，totalCost-原价费用 
     * @return FeeType 费用类型：cost-折后总费用，totalCost-原价费用
     */
    public String getFeeType() {
        return this.FeeType;
    }

    /**
     * Set 费用类型：cost-折后总费用，totalCost-原价费用
     * @param FeeType 费用类型：cost-折后总费用，totalCost-原价费用
     */
    public void setFeeType(String FeeType) {
        this.FeeType = FeeType;
    }

    /**
     * Get 数量，每页最大值为100 
     * @return PageSize 数量，每页最大值为100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 数量，每页最大值为100
     * @param PageSize 数量，每页最大值为100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 起始页，当PageNo=1表示第一页， PageNo=2表示第二页，依次类推。 
     * @return PageNo 起始页，当PageNo=1表示第一页， PageNo=2表示第二页，依次类推。
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 起始页，当PageNo=1表示第一页， PageNo=2表示第二页，依次类推。
     * @param PageNo 起始页，当PageNo=1表示第一页， PageNo=2表示第二页，依次类推。
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 分账标签值 
     * @return TagKeyStr 分账标签值
     */
    public String getTagKeyStr() {
        return this.TagKeyStr;
    }

    /**
     * Set 分账标签值
     * @param TagKeyStr 分账标签值
     */
    public void setTagKeyStr(String TagKeyStr) {
        this.TagKeyStr = TagKeyStr;
    }

    /**
     * Get 是否需要筛选框， 1-表示需要， 0-表示不需要，若不传默认不需要。 
     * @return NeedConditionValue 是否需要筛选框， 1-表示需要， 0-表示不需要，若不传默认不需要。
     */
    public String getNeedConditionValue() {
        return this.NeedConditionValue;
    }

    /**
     * Set 是否需要筛选框， 1-表示需要， 0-表示不需要，若不传默认不需要。
     * @param NeedConditionValue 是否需要筛选框， 1-表示需要， 0-表示不需要，若不传默认不需要。
     */
    public void setNeedConditionValue(String NeedConditionValue) {
        this.NeedConditionValue = NeedConditionValue;
    }

    /**
     * Get 筛选参数 
     * @return Conditions 筛选参数
     */
    public AnalyseConditions getConditions() {
        return this.Conditions;
    }

    /**
     * Set 筛选参数
     * @param Conditions 筛选参数
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

