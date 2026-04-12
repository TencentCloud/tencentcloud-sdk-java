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

public class DescribeIssuesDistributionRequest extends AbstractModel {

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息
    */
    @SerializedName("FormListString")
    @Expose
    private String FormListString;

    /**
    * 分布维度是自定义维度时，填‘user_custom’
    */
    @SerializedName("DimType")
    @Expose
    private String DimType;

    /**
    * 维度，e.g. os_version, app_version, model等
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * 数字类型字段的区间范围
    */
    @SerializedName("Intervals")
    @Expose
    private Long [] Intervals;

    /**
    * 提供给前端使用，当填写本字段时，会覆盖 form_list 的值
    */
    @SerializedName("ParamToken")
    @Expose
    private String ParamToken;

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
    * 限制返回的个数，默认返回所有值
    */
    @SerializedName("ParamLimit")
    @Expose
    private Long ParamLimit;

    /**
    * 键
    */
    @SerializedName("MapKey")
    @Expose
    private String MapKey;

    /**
    * 名称
    */
    @SerializedName("MapName")
    @Expose
    private String MapName;

    /**
    * 指标类型
    */
    @SerializedName("MetricType")
    @Expose
    private Long MetricType;

    /**
    * 每页数目
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 用户自定义维度key
    */
    @SerializedName("UserCustomKey")
    @Expose
    private String UserCustomKey;

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
     * Get 接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息 
     * @return FormListString 接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息
     */
    public String getFormListString() {
        return this.FormListString;
    }

    /**
     * Set 接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息
     * @param FormListString 接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息
     */
    public void setFormListString(String FormListString) {
        this.FormListString = FormListString;
    }

    /**
     * Get 分布维度是自定义维度时，填‘user_custom’ 
     * @return DimType 分布维度是自定义维度时，填‘user_custom’
     */
    public String getDimType() {
        return this.DimType;
    }

    /**
     * Set 分布维度是自定义维度时，填‘user_custom’
     * @param DimType 分布维度是自定义维度时，填‘user_custom’
     */
    public void setDimType(String DimType) {
        this.DimType = DimType;
    }

    /**
     * Get 维度，e.g. os_version, app_version, model等 
     * @return Dimension 维度，e.g. os_version, app_version, model等
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set 维度，e.g. os_version, app_version, model等
     * @param Dimension 维度，e.g. os_version, app_version, model等
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get 数字类型字段的区间范围 
     * @return Intervals 数字类型字段的区间范围
     */
    public Long [] getIntervals() {
        return this.Intervals;
    }

    /**
     * Set 数字类型字段的区间范围
     * @param Intervals 数字类型字段的区间范围
     */
    public void setIntervals(Long [] Intervals) {
        this.Intervals = Intervals;
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
     * Get 限制返回的个数，默认返回所有值 
     * @return ParamLimit 限制返回的个数，默认返回所有值
     */
    public Long getParamLimit() {
        return this.ParamLimit;
    }

    /**
     * Set 限制返回的个数，默认返回所有值
     * @param ParamLimit 限制返回的个数，默认返回所有值
     */
    public void setParamLimit(Long ParamLimit) {
        this.ParamLimit = ParamLimit;
    }

    /**
     * Get 键 
     * @return MapKey 键
     */
    public String getMapKey() {
        return this.MapKey;
    }

    /**
     * Set 键
     * @param MapKey 键
     */
    public void setMapKey(String MapKey) {
        this.MapKey = MapKey;
    }

    /**
     * Get 名称 
     * @return MapName 名称
     */
    public String getMapName() {
        return this.MapName;
    }

    /**
     * Set 名称
     * @param MapName 名称
     */
    public void setMapName(String MapName) {
        this.MapName = MapName;
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
     * Get 每页数目 
     * @return PageSize 每页数目
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数目
     * @param PageSize 每页数目
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 用户自定义维度key 
     * @return UserCustomKey 用户自定义维度key
     */
    public String getUserCustomKey() {
        return this.UserCustomKey;
    }

    /**
     * Set 用户自定义维度key
     * @param UserCustomKey 用户自定义维度key
     */
    public void setUserCustomKey(String UserCustomKey) {
        this.UserCustomKey = UserCustomKey;
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

    public DescribeIssuesDistributionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIssuesDistributionRequest(DescribeIssuesDistributionRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.FormListString != null) {
            this.FormListString = new String(source.FormListString);
        }
        if (source.DimType != null) {
            this.DimType = new String(source.DimType);
        }
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.Intervals != null) {
            this.Intervals = new Long[source.Intervals.length];
            for (int i = 0; i < source.Intervals.length; i++) {
                this.Intervals[i] = new Long(source.Intervals[i]);
            }
        }
        if (source.ParamToken != null) {
            this.ParamToken = new String(source.ParamToken);
        }
        if (source.IssueId != null) {
            this.IssueId = new String(source.IssueId);
        }
        if (source.IssueType != null) {
            this.IssueType = new Long(source.IssueType);
        }
        if (source.ParamLimit != null) {
            this.ParamLimit = new Long(source.ParamLimit);
        }
        if (source.MapKey != null) {
            this.MapKey = new String(source.MapKey);
        }
        if (source.MapName != null) {
            this.MapName = new String(source.MapName);
        }
        if (source.MetricType != null) {
            this.MetricType = new Long(source.MetricType);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.UserCustomKey != null) {
            this.UserCustomKey = new String(source.UserCustomKey);
        }
        if (source.ExtraData != null) {
            this.ExtraData = new String(source.ExtraData);
        }
        if (source.RequestHeader != null) {
            this.RequestHeader = new String(source.RequestHeader);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "FormListString", this.FormListString);
        this.setParamSimple(map, prefix + "DimType", this.DimType);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamArraySimple(map, prefix + "Intervals.", this.Intervals);
        this.setParamSimple(map, prefix + "ParamToken", this.ParamToken);
        this.setParamSimple(map, prefix + "IssueId", this.IssueId);
        this.setParamSimple(map, prefix + "IssueType", this.IssueType);
        this.setParamSimple(map, prefix + "ParamLimit", this.ParamLimit);
        this.setParamSimple(map, prefix + "MapKey", this.MapKey);
        this.setParamSimple(map, prefix + "MapName", this.MapName);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "UserCustomKey", this.UserCustomKey);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);
        this.setParamSimple(map, prefix + "RequestHeader", this.RequestHeader);

    }
}

