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
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 需要对比的查询条件，没有则不填
    */
    @SerializedName("Compare")
    @Expose
    private CompareCondition Compare;

    /**
    * 查询条件
    */
    @SerializedName("Condition")
    @Expose
    private CompareCondition Condition;

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
    * topN
    */
    @SerializedName("TopNum")
    @Expose
    private Long TopNum;

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
     * Get 需要对比的查询条件，没有则不填 
     * @return Compare 需要对比的查询条件，没有则不填
     */
    public CompareCondition getCompare() {
        return this.Compare;
    }

    /**
     * Set 需要对比的查询条件，没有则不填
     * @param Compare 需要对比的查询条件，没有则不填
     */
    public void setCompare(CompareCondition Compare) {
        this.Compare = Compare;
    }

    /**
     * Get 查询条件 
     * @return Condition 查询条件
     */
    public CompareCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set 查询条件
     * @param Condition 查询条件
     */
    public void setCondition(CompareCondition Condition) {
        this.Condition = Condition;
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
     * Get topN 
     * @return TopNum topN
     */
    public Long getTopNum() {
        return this.TopNum;
    }

    /**
     * Set topN
     * @param TopNum topN
     */
    public void setTopNum(Long TopNum) {
        this.TopNum = TopNum;
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

