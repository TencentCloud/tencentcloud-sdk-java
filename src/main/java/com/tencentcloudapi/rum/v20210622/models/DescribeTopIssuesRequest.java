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

public class DescribeTopIssuesRequest extends AbstractModel {

    /**
    * <p>产品Id</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>需要对比的查询条件，没有则不填</p>
    */
    @SerializedName("Compare")
    @Expose
    private CompareCondition Compare;

    /**
    * <p>查询条件</p>
    */
    @SerializedName("Condition")
    @Expose
    private CompareCondition Condition;

    /**
    * <p>问题类型</p>
    */
    @SerializedName("IssueType")
    @Expose
    private Long IssueType;

    /**
    * <p>排序字段</p>
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * <p>排序方式</p>
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * <p>topN</p>
    */
    @SerializedName("TopNum")
    @Expose
    private Long TopNum;

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
     * Get <p>需要对比的查询条件，没有则不填</p> 
     * @return Compare <p>需要对比的查询条件，没有则不填</p>
     */
    public CompareCondition getCompare() {
        return this.Compare;
    }

    /**
     * Set <p>需要对比的查询条件，没有则不填</p>
     * @param Compare <p>需要对比的查询条件，没有则不填</p>
     */
    public void setCompare(CompareCondition Compare) {
        this.Compare = Compare;
    }

    /**
     * Get <p>查询条件</p> 
     * @return Condition <p>查询条件</p>
     */
    public CompareCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>查询条件</p>
     * @param Condition <p>查询条件</p>
     */
    public void setCondition(CompareCondition Condition) {
        this.Condition = Condition;
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
     * Get <p>排序方式</p> 
     * @return SortType <p>排序方式</p>
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set <p>排序方式</p>
     * @param SortType <p>排序方式</p>
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get <p>topN</p> 
     * @return TopNum <p>topN</p>
     */
    public Long getTopNum() {
        return this.TopNum;
    }

    /**
     * Set <p>topN</p>
     * @param TopNum <p>topN</p>
     */
    public void setTopNum(Long TopNum) {
        this.TopNum = TopNum;
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

    public DescribeTopIssuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopIssuesRequest(DescribeTopIssuesRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Compare != null) {
            this.Compare = new CompareCondition(source.Compare);
        }
        if (source.Condition != null) {
            this.Condition = new CompareCondition(source.Condition);
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
        if (source.TopNum != null) {
            this.TopNum = new Long(source.TopNum);
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
        this.setParamObj(map, prefix + "Compare.", this.Compare);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamSimple(map, prefix + "IssueType", this.IssueType);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "TopNum", this.TopNum);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);
        this.setParamSimple(map, prefix + "RequestHeader", this.RequestHeader);

    }
}

