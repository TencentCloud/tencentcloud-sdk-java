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

public class DescribeLagANRProblemFeatureAccountsRequest extends AbstractModel {

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
    * 提供给前端使用，当填写本字段时，会覆盖 formlist 的值
    */
    @SerializedName("ParamToken")
    @Expose
    private String ParamToken;

    /**
    * 问题特征
    */
    @SerializedName("Feature")
    @Expose
    private String Feature;

    /**
    * 排序字段
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * 排序类型
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 当前页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页展示最大数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 拓展数据
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
     * Get 提供给前端使用，当填写本字段时，会覆盖 formlist 的值 
     * @return ParamToken 提供给前端使用，当填写本字段时，会覆盖 formlist 的值
     */
    public String getParamToken() {
        return this.ParamToken;
    }

    /**
     * Set 提供给前端使用，当填写本字段时，会覆盖 formlist 的值
     * @param ParamToken 提供给前端使用，当填写本字段时，会覆盖 formlist 的值
     */
    public void setParamToken(String ParamToken) {
        this.ParamToken = ParamToken;
    }

    /**
     * Get 问题特征 
     * @return Feature 问题特征
     */
    public String getFeature() {
        return this.Feature;
    }

    /**
     * Set 问题特征
     * @param Feature 问题特征
     */
    public void setFeature(String Feature) {
        this.Feature = Feature;
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
     * Get 排序类型 
     * @return SortType 排序类型
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 排序类型
     * @param SortType 排序类型
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 当前页码 
     * @return PageNumber 当前页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页码
     * @param PageNumber 当前页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页展示最大数量 
     * @return PageSize 每页展示最大数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页展示最大数量
     * @param PageSize 每页展示最大数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 拓展数据 
     * @return ExtraData 拓展数据
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set 拓展数据
     * @param ExtraData 拓展数据
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

    public DescribeLagANRProblemFeatureAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLagANRProblemFeatureAccountsRequest(DescribeLagANRProblemFeatureAccountsRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.FormListString != null) {
            this.FormListString = new String(source.FormListString);
        }
        if (source.ParamToken != null) {
            this.ParamToken = new String(source.ParamToken);
        }
        if (source.Feature != null) {
            this.Feature = new String(source.Feature);
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        this.setParamSimple(map, prefix + "ParamToken", this.ParamToken);
        this.setParamSimple(map, prefix + "Feature", this.Feature);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);
        this.setParamSimple(map, prefix + "RequestHeader", this.RequestHeader);

    }
}

