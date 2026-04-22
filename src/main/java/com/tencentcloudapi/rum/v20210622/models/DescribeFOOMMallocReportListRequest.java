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

public class DescribeFOOMMallocReportListRequest extends AbstractModel {

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
    * <p>提供给前端使用，当填写本字段时，会覆盖 formlist 的值</p>
    */
    @SerializedName("ParamToken")
    @Expose
    private String ParamToken;

    /**
    * <p>特征</p>
    */
    @SerializedName("Feature")
    @Expose
    private String Feature;

    /**
    * <p>当前页码</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页展示最大数量</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>排序字段</p>
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * <p>排序类型</p>
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * <p>拓展数据</p>
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
     * Get <p>提供给前端使用，当填写本字段时，会覆盖 formlist 的值</p> 
     * @return ParamToken <p>提供给前端使用，当填写本字段时，会覆盖 formlist 的值</p>
     */
    public String getParamToken() {
        return this.ParamToken;
    }

    /**
     * Set <p>提供给前端使用，当填写本字段时，会覆盖 formlist 的值</p>
     * @param ParamToken <p>提供给前端使用，当填写本字段时，会覆盖 formlist 的值</p>
     */
    public void setParamToken(String ParamToken) {
        this.ParamToken = ParamToken;
    }

    /**
     * Get <p>特征</p> 
     * @return Feature <p>特征</p>
     */
    public String getFeature() {
        return this.Feature;
    }

    /**
     * Set <p>特征</p>
     * @param Feature <p>特征</p>
     */
    public void setFeature(String Feature) {
        this.Feature = Feature;
    }

    /**
     * Get <p>当前页码</p> 
     * @return PageNumber <p>当前页码</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>当前页码</p>
     * @param PageNumber <p>当前页码</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页展示最大数量</p> 
     * @return PageSize <p>每页展示最大数量</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页展示最大数量</p>
     * @param PageSize <p>每页展示最大数量</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>排序字段</p> 
     * @return SortField <p>排序字段</p>
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set <p>排序字段</p>
     * @param SortField <p>排序字段</p>
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get <p>排序类型</p> 
     * @return SortType <p>排序类型</p>
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set <p>排序类型</p>
     * @param SortType <p>排序类型</p>
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get <p>拓展数据</p> 
     * @return ExtraData <p>拓展数据</p>
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set <p>拓展数据</p>
     * @param ExtraData <p>拓展数据</p>
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

    public DescribeFOOMMallocReportListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFOOMMallocReportListRequest(DescribeFOOMMallocReportListRequest source) {
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
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
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
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);
        this.setParamSimple(map, prefix + "RequestHeader", this.RequestHeader);

    }
}

