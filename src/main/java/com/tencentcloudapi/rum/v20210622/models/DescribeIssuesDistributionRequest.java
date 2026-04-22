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
    * <p>产品Id</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息</p>
    */
    @SerializedName("FormListString")
    @Expose
    private String FormListString;

    /**
    * <p>分布维度是自定义维度时，填‘user_custom’</p>
    */
    @SerializedName("DimType")
    @Expose
    private String DimType;

    /**
    * <p>维度，e.g. os_version, app_version, model等</p>
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * <p>数字类型字段的区间范围</p>
    */
    @SerializedName("Intervals")
    @Expose
    private Long [] Intervals;

    /**
    * <p>提供给前端使用，当填写本字段时，会覆盖 form_list 的值</p>
    */
    @SerializedName("ParamToken")
    @Expose
    private String ParamToken;

    /**
    * <p>问题Id</p>
    */
    @SerializedName("IssueId")
    @Expose
    private String IssueId;

    /**
    * <p>问题类型</p>
    */
    @SerializedName("IssueType")
    @Expose
    private Long IssueType;

    /**
    * <p>限制返回的个数，默认返回所有值</p>
    */
    @SerializedName("ParamLimit")
    @Expose
    private Long ParamLimit;

    /**
    * <p>键</p>
    */
    @SerializedName("MapKey")
    @Expose
    private String MapKey;

    /**
    * <p>名称</p>
    */
    @SerializedName("MapName")
    @Expose
    private String MapName;

    /**
    * <p>指标类型</p>
    */
    @SerializedName("MetricType")
    @Expose
    private Long MetricType;

    /**
    * <p>每页数目</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>页码</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>用户自定义维度key</p>
    */
    @SerializedName("UserCustomKey")
    @Expose
    private String UserCustomKey;

    /**
    * <p>拓展字段</p>
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
    * <p>请求头</p>
    */
    @SerializedName("RequestHeader")
    @Expose
    private String RequestHeader;

    /**
     * Get <p>产品Id</p> 
     * @return ProductId <p>产品Id</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品Id</p>
     * @param ProductId <p>产品Id</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息</p> 
     * @return FormListString <p>接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息</p>
     */
    public String getFormListString() {
        return this.FormListString;
    }

    /**
     * Set <p>接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息</p>
     * @param FormListString <p>接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息</p>
     */
    public void setFormListString(String FormListString) {
        this.FormListString = FormListString;
    }

    /**
     * Get <p>分布维度是自定义维度时，填‘user_custom’</p> 
     * @return DimType <p>分布维度是自定义维度时，填‘user_custom’</p>
     */
    public String getDimType() {
        return this.DimType;
    }

    /**
     * Set <p>分布维度是自定义维度时，填‘user_custom’</p>
     * @param DimType <p>分布维度是自定义维度时，填‘user_custom’</p>
     */
    public void setDimType(String DimType) {
        this.DimType = DimType;
    }

    /**
     * Get <p>维度，e.g. os_version, app_version, model等</p> 
     * @return Dimension <p>维度，e.g. os_version, app_version, model等</p>
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set <p>维度，e.g. os_version, app_version, model等</p>
     * @param Dimension <p>维度，e.g. os_version, app_version, model等</p>
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get <p>数字类型字段的区间范围</p> 
     * @return Intervals <p>数字类型字段的区间范围</p>
     */
    public Long [] getIntervals() {
        return this.Intervals;
    }

    /**
     * Set <p>数字类型字段的区间范围</p>
     * @param Intervals <p>数字类型字段的区间范围</p>
     */
    public void setIntervals(Long [] Intervals) {
        this.Intervals = Intervals;
    }

    /**
     * Get <p>提供给前端使用，当填写本字段时，会覆盖 form_list 的值</p> 
     * @return ParamToken <p>提供给前端使用，当填写本字段时，会覆盖 form_list 的值</p>
     */
    public String getParamToken() {
        return this.ParamToken;
    }

    /**
     * Set <p>提供给前端使用，当填写本字段时，会覆盖 form_list 的值</p>
     * @param ParamToken <p>提供给前端使用，当填写本字段时，会覆盖 form_list 的值</p>
     */
    public void setParamToken(String ParamToken) {
        this.ParamToken = ParamToken;
    }

    /**
     * Get <p>问题Id</p> 
     * @return IssueId <p>问题Id</p>
     */
    public String getIssueId() {
        return this.IssueId;
    }

    /**
     * Set <p>问题Id</p>
     * @param IssueId <p>问题Id</p>
     */
    public void setIssueId(String IssueId) {
        this.IssueId = IssueId;
    }

    /**
     * Get <p>问题类型</p> 
     * @return IssueType <p>问题类型</p>
     */
    public Long getIssueType() {
        return this.IssueType;
    }

    /**
     * Set <p>问题类型</p>
     * @param IssueType <p>问题类型</p>
     */
    public void setIssueType(Long IssueType) {
        this.IssueType = IssueType;
    }

    /**
     * Get <p>限制返回的个数，默认返回所有值</p> 
     * @return ParamLimit <p>限制返回的个数，默认返回所有值</p>
     */
    public Long getParamLimit() {
        return this.ParamLimit;
    }

    /**
     * Set <p>限制返回的个数，默认返回所有值</p>
     * @param ParamLimit <p>限制返回的个数，默认返回所有值</p>
     */
    public void setParamLimit(Long ParamLimit) {
        this.ParamLimit = ParamLimit;
    }

    /**
     * Get <p>键</p> 
     * @return MapKey <p>键</p>
     */
    public String getMapKey() {
        return this.MapKey;
    }

    /**
     * Set <p>键</p>
     * @param MapKey <p>键</p>
     */
    public void setMapKey(String MapKey) {
        this.MapKey = MapKey;
    }

    /**
     * Get <p>名称</p> 
     * @return MapName <p>名称</p>
     */
    public String getMapName() {
        return this.MapName;
    }

    /**
     * Set <p>名称</p>
     * @param MapName <p>名称</p>
     */
    public void setMapName(String MapName) {
        this.MapName = MapName;
    }

    /**
     * Get <p>指标类型</p> 
     * @return MetricType <p>指标类型</p>
     */
    public Long getMetricType() {
        return this.MetricType;
    }

    /**
     * Set <p>指标类型</p>
     * @param MetricType <p>指标类型</p>
     */
    public void setMetricType(Long MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get <p>每页数目</p> 
     * @return PageSize <p>每页数目</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数目</p>
     * @param PageSize <p>每页数目</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>页码</p> 
     * @return PageNumber <p>页码</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码</p>
     * @param PageNumber <p>页码</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>用户自定义维度key</p> 
     * @return UserCustomKey <p>用户自定义维度key</p>
     */
    public String getUserCustomKey() {
        return this.UserCustomKey;
    }

    /**
     * Set <p>用户自定义维度key</p>
     * @param UserCustomKey <p>用户自定义维度key</p>
     */
    public void setUserCustomKey(String UserCustomKey) {
        this.UserCustomKey = UserCustomKey;
    }

    /**
     * Get <p>拓展字段</p> 
     * @return ExtraData <p>拓展字段</p>
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set <p>拓展字段</p>
     * @param ExtraData <p>拓展字段</p>
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    /**
     * Get <p>请求头</p> 
     * @return RequestHeader <p>请求头</p>
     */
    public String getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set <p>请求头</p>
     * @param RequestHeader <p>请求头</p>
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

