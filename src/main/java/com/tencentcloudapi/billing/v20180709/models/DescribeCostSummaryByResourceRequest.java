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

public class DescribeCostSummaryByResourceRequest extends AbstractModel {

    /**
    * <p>目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>每次获取数据量，最大值为100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量,默认从0开始</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>查询账单数据的用户UIN</p>
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * <p>是否需要返回记录数量，0不需要，1需要，默认不需要</p>
    */
    @SerializedName("NeedRecordNum")
    @Expose
    private Long NeedRecordNum;

    /**
    * <p>是否需要返回过滤条件，0不需要，1需要，默认不需要</p>
    */
    @SerializedName("NeedConditionValue")
    @Expose
    private Long NeedConditionValue;

    /**
    * <p>过滤条件，只支持ResourceKeyword(资源关键字，支持资源id及资源名称模糊查询)，ProjectIds（项目id），RegionIds(地域id)，PayModes(付费模式，可选prePay和postPay)，HideFreeCost（是否隐藏0元流水，可选0和1），OrderByCost（按费用排序规则，可选desc和asc）</p>
    */
    @SerializedName("Conditions")
    @Expose
    private Conditions Conditions;

    /**
    * <p>分账标签键，用户自定义</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * <p>分账标签值，该参数为空表示该标签键下未设置标签值的记录</p>
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
     * Get <p>目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。</p> 
     * @return BeginTime <p>目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。</p>
     * @param BeginTime <p>目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。</p> 
     * @return EndTime <p>目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。</p>
     * @param EndTime <p>目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>每次获取数据量，最大值为100</p> 
     * @return Limit <p>每次获取数据量，最大值为100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每次获取数据量，最大值为100</p>
     * @param Limit <p>每次获取数据量，最大值为100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量,默认从0开始</p> 
     * @return Offset <p>偏移量,默认从0开始</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量,默认从0开始</p>
     * @param Offset <p>偏移量,默认从0开始</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>查询账单数据的用户UIN</p> 
     * @return PayerUin <p>查询账单数据的用户UIN</p>
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set <p>查询账单数据的用户UIN</p>
     * @param PayerUin <p>查询账单数据的用户UIN</p>
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get <p>是否需要返回记录数量，0不需要，1需要，默认不需要</p> 
     * @return NeedRecordNum <p>是否需要返回记录数量，0不需要，1需要，默认不需要</p>
     */
    public Long getNeedRecordNum() {
        return this.NeedRecordNum;
    }

    /**
     * Set <p>是否需要返回记录数量，0不需要，1需要，默认不需要</p>
     * @param NeedRecordNum <p>是否需要返回记录数量，0不需要，1需要，默认不需要</p>
     */
    public void setNeedRecordNum(Long NeedRecordNum) {
        this.NeedRecordNum = NeedRecordNum;
    }

    /**
     * Get <p>是否需要返回过滤条件，0不需要，1需要，默认不需要</p> 
     * @return NeedConditionValue <p>是否需要返回过滤条件，0不需要，1需要，默认不需要</p>
     */
    public Long getNeedConditionValue() {
        return this.NeedConditionValue;
    }

    /**
     * Set <p>是否需要返回过滤条件，0不需要，1需要，默认不需要</p>
     * @param NeedConditionValue <p>是否需要返回过滤条件，0不需要，1需要，默认不需要</p>
     */
    public void setNeedConditionValue(Long NeedConditionValue) {
        this.NeedConditionValue = NeedConditionValue;
    }

    /**
     * Get <p>过滤条件，只支持ResourceKeyword(资源关键字，支持资源id及资源名称模糊查询)，ProjectIds（项目id），RegionIds(地域id)，PayModes(付费模式，可选prePay和postPay)，HideFreeCost（是否隐藏0元流水，可选0和1），OrderByCost（按费用排序规则，可选desc和asc）</p> 
     * @return Conditions <p>过滤条件，只支持ResourceKeyword(资源关键字，支持资源id及资源名称模糊查询)，ProjectIds（项目id），RegionIds(地域id)，PayModes(付费模式，可选prePay和postPay)，HideFreeCost（是否隐藏0元流水，可选0和1），OrderByCost（按费用排序规则，可选desc和asc）</p>
     */
    public Conditions getConditions() {
        return this.Conditions;
    }

    /**
     * Set <p>过滤条件，只支持ResourceKeyword(资源关键字，支持资源id及资源名称模糊查询)，ProjectIds（项目id），RegionIds(地域id)，PayModes(付费模式，可选prePay和postPay)，HideFreeCost（是否隐藏0元流水，可选0和1），OrderByCost（按费用排序规则，可选desc和asc）</p>
     * @param Conditions <p>过滤条件，只支持ResourceKeyword(资源关键字，支持资源id及资源名称模糊查询)，ProjectIds（项目id），RegionIds(地域id)，PayModes(付费模式，可选prePay和postPay)，HideFreeCost（是否隐藏0元流水，可选0和1），OrderByCost（按费用排序规则，可选desc和asc）</p>
     */
    public void setConditions(Conditions Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get <p>分账标签键，用户自定义</p> 
     * @return TagKey <p>分账标签键，用户自定义</p>
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>分账标签键，用户自定义</p>
     * @param TagKey <p>分账标签键，用户自定义</p>
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>分账标签值，该参数为空表示该标签键下未设置标签值的记录</p> 
     * @return TagValue <p>分账标签值，该参数为空表示该标签键下未设置标签值的记录</p>
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set <p>分账标签值，该参数为空表示该标签键下未设置标签值的记录</p>
     * @param TagValue <p>分账标签值，该参数为空表示该标签键下未设置标签值的记录</p>
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    public DescribeCostSummaryByResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCostSummaryByResourceRequest(DescribeCostSummaryByResourceRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.NeedRecordNum != null) {
            this.NeedRecordNum = new Long(source.NeedRecordNum);
        }
        if (source.NeedConditionValue != null) {
            this.NeedConditionValue = new Long(source.NeedConditionValue);
        }
        if (source.Conditions != null) {
            this.Conditions = new Conditions(source.Conditions);
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
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "NeedRecordNum", this.NeedRecordNum);
        this.setParamSimple(map, prefix + "NeedConditionValue", this.NeedConditionValue);
        this.setParamObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);

    }
}

