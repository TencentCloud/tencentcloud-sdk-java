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

public class DescribeIssuesListRequest extends AbstractModel {

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 接口调试专用，当 token 为空时，以这里的 value 作为筛选表单信息
    */
    @SerializedName("FormList")
    @Expose
    private String FormList;

    /**
    * 接口调试专用，对比模式下条件A，当 token 为空时，以这里的 value 作为筛选表单信息
    */
    @SerializedName("FormListA")
    @Expose
    private String FormListA;

    /**
    * 接口调试专用，对比模式下条件B，当 token 为空时，以这里的 value 作为筛选表单信息
    */
    @SerializedName("FormListB")
    @Expose
    private String FormListB;

    /**
    * 提供给前端使用，当填写本字段时，会覆盖 form_list 的值
    */
    @SerializedName("ParamToken")
    @Expose
    private String ParamToken;

    /**
    * 问题类型
    */
    @SerializedName("IssueType")
    @Expose
    private Long IssueType;

    /**
    * 排序字段
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * 排序方式
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

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
    * 问题对比列表模式下，用于标识是按照sort_field字段的A值排序还是B值还是ratio值
    */
    @SerializedName("SortABRatio")
    @Expose
    private String SortABRatio;

    /**
    * 模式：false:问题列表模式，true:对比列表模式
    */
    @SerializedName("Compare")
    @Expose
    private Boolean Compare;

    /**
    * 对比状态 0:所有 1:新增 2：遗留 3:已解决
    */
    @SerializedName("CompareStatus")
    @Expose
    private Long CompareStatus;

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
     * Get 接口调试专用，对比模式下条件A，当 token 为空时，以这里的 value 作为筛选表单信息 
     * @return FormListA 接口调试专用，对比模式下条件A，当 token 为空时，以这里的 value 作为筛选表单信息
     */
    public String getFormListA() {
        return this.FormListA;
    }

    /**
     * Set 接口调试专用，对比模式下条件A，当 token 为空时，以这里的 value 作为筛选表单信息
     * @param FormListA 接口调试专用，对比模式下条件A，当 token 为空时，以这里的 value 作为筛选表单信息
     */
    public void setFormListA(String FormListA) {
        this.FormListA = FormListA;
    }

    /**
     * Get 接口调试专用，对比模式下条件B，当 token 为空时，以这里的 value 作为筛选表单信息 
     * @return FormListB 接口调试专用，对比模式下条件B，当 token 为空时，以这里的 value 作为筛选表单信息
     */
    public String getFormListB() {
        return this.FormListB;
    }

    /**
     * Set 接口调试专用，对比模式下条件B，当 token 为空时，以这里的 value 作为筛选表单信息
     * @param FormListB 接口调试专用，对比模式下条件B，当 token 为空时，以这里的 value 作为筛选表单信息
     */
    public void setFormListB(String FormListB) {
        this.FormListB = FormListB;
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
     * Get 排序字段 
     * @return SortField 排序字段
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set 排序字段
     * @param SortField 排序字段
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get 排序方式 
     * @return SortType 排序方式
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 排序方式
     * @param SortType 排序方式
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
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
     * Get 问题对比列表模式下，用于标识是按照sort_field字段的A值排序还是B值还是ratio值 
     * @return SortABRatio 问题对比列表模式下，用于标识是按照sort_field字段的A值排序还是B值还是ratio值
     */
    public String getSortABRatio() {
        return this.SortABRatio;
    }

    /**
     * Set 问题对比列表模式下，用于标识是按照sort_field字段的A值排序还是B值还是ratio值
     * @param SortABRatio 问题对比列表模式下，用于标识是按照sort_field字段的A值排序还是B值还是ratio值
     */
    public void setSortABRatio(String SortABRatio) {
        this.SortABRatio = SortABRatio;
    }

    /**
     * Get 模式：false:问题列表模式，true:对比列表模式 
     * @return Compare 模式：false:问题列表模式，true:对比列表模式
     */
    public Boolean getCompare() {
        return this.Compare;
    }

    /**
     * Set 模式：false:问题列表模式，true:对比列表模式
     * @param Compare 模式：false:问题列表模式，true:对比列表模式
     */
    public void setCompare(Boolean Compare) {
        this.Compare = Compare;
    }

    /**
     * Get 对比状态 0:所有 1:新增 2：遗留 3:已解决 
     * @return CompareStatus 对比状态 0:所有 1:新增 2：遗留 3:已解决
     */
    public Long getCompareStatus() {
        return this.CompareStatus;
    }

    /**
     * Set 对比状态 0:所有 1:新增 2：遗留 3:已解决
     * @param CompareStatus 对比状态 0:所有 1:新增 2：遗留 3:已解决
     */
    public void setCompareStatus(Long CompareStatus) {
        this.CompareStatus = CompareStatus;
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

    public DescribeIssuesListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIssuesListRequest(DescribeIssuesListRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.FormList != null) {
            this.FormList = new String(source.FormList);
        }
        if (source.FormListA != null) {
            this.FormListA = new String(source.FormListA);
        }
        if (source.FormListB != null) {
            this.FormListB = new String(source.FormListB);
        }
        if (source.ParamToken != null) {
            this.ParamToken = new String(source.ParamToken);
        }
        if (source.IssueType != null) {
            this.IssueType = new Long(source.IssueType);
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.SortABRatio != null) {
            this.SortABRatio = new String(source.SortABRatio);
        }
        if (source.Compare != null) {
            this.Compare = new Boolean(source.Compare);
        }
        if (source.CompareStatus != null) {
            this.CompareStatus = new Long(source.CompareStatus);
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
        this.setParamSimple(map, prefix + "FormList", this.FormList);
        this.setParamSimple(map, prefix + "FormListA", this.FormListA);
        this.setParamSimple(map, prefix + "FormListB", this.FormListB);
        this.setParamSimple(map, prefix + "ParamToken", this.ParamToken);
        this.setParamSimple(map, prefix + "IssueType", this.IssueType);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "SortABRatio", this.SortABRatio);
        this.setParamSimple(map, prefix + "Compare", this.Compare);
        this.setParamSimple(map, prefix + "CompareStatus", this.CompareStatus);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);
        this.setParamSimple(map, prefix + "RequestHeader", this.RequestHeader);

    }
}

