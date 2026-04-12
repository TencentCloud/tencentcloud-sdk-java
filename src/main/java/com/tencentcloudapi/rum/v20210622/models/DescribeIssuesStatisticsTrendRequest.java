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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIssuesStatisticsTrendRequest extends AbstractModel {

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 提供给前端使用，当填写本字段时，会覆盖 form_list 的值
    */
    @SerializedName("ParamToken")
    @Expose
    private String ParamToken;

    /**
    * 接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息
    */
    @SerializedName("FormList")
    @Expose
    private String FormList;

    /**
    * 问题Id
    */
    @SerializedName("IssueId")
    @Expose
    private String IssueId;

    /**
    * 问题类型
    */
    @SerializedName("IssueType")
    @Expose
    private Long IssueType;

    /**
    * 时间窗口
    */
    @SerializedName("TimeWindow")
    @Expose
    private Long TimeWindow;

    /**
    * 累计值
    */
    @SerializedName("TotalSize")
    @Expose
    private Boolean TotalSize;

    /**
    * 无
    */
    @SerializedName("Stat")
    @Expose
    private Long Stat;

    /**
    * 指标类型
    */
    @SerializedName("MetricType")
    @Expose
    private Long MetricType;

    /**
    * 拓展字段
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
    * 请求头
    */
    @SerializedName("RequestHeader")
    @Expose
    private String RequestHeader;

    /**
    * 无
    */
    @SerializedName("TrendStat")
    @Expose
    private Long TrendStat;

    /**
     * Get 产品Id 
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 提供给前端使用，当填写本字段时，会覆盖 form_list 的值 
     * @return ParamToken 提供给前端使用，当填写本字段时，会覆盖 form_list 的值
     */
    public String getParamToken() {
        return this.ParamToken;
    }

    /**
     * Set 提供给前端使用，当填写本字段时，会覆盖 form_list 的值
     * @param ParamToken 提供给前端使用，当填写本字段时，会覆盖 form_list 的值
     */
    public void setParamToken(String ParamToken) {
        this.ParamToken = ParamToken;
    }

    /**
     * Get 接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息 
     * @return FormList 接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息
     */
    public String getFormList() {
        return this.FormList;
    }

    /**
     * Set 接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息
     * @param FormList 接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息
     */
    public void setFormList(String FormList) {
        this.FormList = FormList;
    }

    /**
     * Get 问题Id 
     * @return IssueId 问题Id
     */
    public String getIssueId() {
        return this.IssueId;
    }

    /**
     * Set 问题Id
     * @param IssueId 问题Id
     */
    public void setIssueId(String IssueId) {
        this.IssueId = IssueId;
    }

    /**
     * Get 问题类型 
     * @return IssueType 问题类型
     */
    public Long getIssueType() {
        return this.IssueType;
    }

    /**
     * Set 问题类型
     * @param IssueType 问题类型
     */
    public void setIssueType(Long IssueType) {
        this.IssueType = IssueType;
    }

    /**
     * Get 时间窗口 
     * @return TimeWindow 时间窗口
     */
    public Long getTimeWindow() {
        return this.TimeWindow;
    }

    /**
     * Set 时间窗口
     * @param TimeWindow 时间窗口
     */
    public void setTimeWindow(Long TimeWindow) {
        this.TimeWindow = TimeWindow;
    }

    /**
     * Get 累计值 
     * @return TotalSize 累计值
     */
    public Boolean getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 累计值
     * @param TotalSize 累计值
     */
    public void setTotalSize(Boolean TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get 无 
     * @return Stat 无
     */
    public Long getStat() {
        return this.Stat;
    }

    /**
     * Set 无
     * @param Stat 无
     */
    public void setStat(Long Stat) {
        this.Stat = Stat;
    }

    /**
     * Get 指标类型 
     * @return MetricType 指标类型
     */
    public Long getMetricType() {
        return this.MetricType;
    }

    /**
     * Set 指标类型
     * @param MetricType 指标类型
     */
    public void setMetricType(Long MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get 拓展字段 
     * @return ExtraData 拓展字段
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set 拓展字段
     * @param ExtraData 拓展字段
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    /**
     * Get 请求头 
     * @return RequestHeader 请求头
     */
    public String getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set 请求头
     * @param RequestHeader 请求头
     */
    public void setRequestHeader(String RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get 无 
     * @return TrendStat 无
     */
    public Long getTrendStat() {
        return this.TrendStat;
    }

    /**
     * Set 无
     * @param TrendStat 无
     */
    public void setTrendStat(Long TrendStat) {
        this.TrendStat = TrendStat;
    }

    public DescribeIssuesStatisticsTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIssuesStatisticsTrendRequest(DescribeIssuesStatisticsTrendRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ParamToken != null) {
            this.ParamToken = new String(source.ParamToken);
        }
        if (source.FormList != null) {
            this.FormList = new String(source.FormList);
        }
        if (source.IssueId != null) {
            this.IssueId = new String(source.IssueId);
        }
        if (source.IssueType != null) {
            this.IssueType = new Long(source.IssueType);
        }
        if (source.TimeWindow != null) {
            this.TimeWindow = new Long(source.TimeWindow);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Boolean(source.TotalSize);
        }
        if (source.Stat != null) {
            this.Stat = new Long(source.Stat);
        }
        if (source.MetricType != null) {
            this.MetricType = new Long(source.MetricType);
        }
        if (source.ExtraData != null) {
            this.ExtraData = new String(source.ExtraData);
        }
        if (source.RequestHeader != null) {
            this.RequestHeader = new String(source.RequestHeader);
        }
        if (source.TrendStat != null) {
            this.TrendStat = new Long(source.TrendStat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ParamToken", this.ParamToken);
        this.setParamSimple(map, prefix + "FormList", this.FormList);
        this.setParamSimple(map, prefix + "IssueId", this.IssueId);
        this.setParamSimple(map, prefix + "IssueType", this.IssueType);
        this.setParamSimple(map, prefix + "TimeWindow", this.TimeWindow);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamSimple(map, prefix + "Stat", this.Stat);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);
        this.setParamSimple(map, prefix + "RequestHeader", this.RequestHeader);
        this.setParamSimple(map, prefix + "TrendStat", this.TrendStat);

    }
}

