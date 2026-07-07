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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelRouterResourcePackageDeductionRequest extends AbstractModel {

    /**
    * <p>抵扣起始时间</p>
    */
    @SerializedName("DeductionTimeBegin")
    @Expose
    private String DeductionTimeBegin;

    /**
    * <p>抵扣截止时间</p>
    */
    @SerializedName("DeductionTimeEnd")
    @Expose
    private String DeductionTimeEnd;

    /**
    * <p>模型路由资源包Id</p>
    */
    @SerializedName("ModelRouterResourcePackageId")
    @Expose
    private String ModelRouterResourcePackageId;

    /**
    * <p>返回的数量</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>数据偏移量</p><p>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序方式：asc，desc</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
     * Get <p>抵扣起始时间</p> 
     * @return DeductionTimeBegin <p>抵扣起始时间</p>
     */
    public String getDeductionTimeBegin() {
        return this.DeductionTimeBegin;
    }

    /**
     * Set <p>抵扣起始时间</p>
     * @param DeductionTimeBegin <p>抵扣起始时间</p>
     */
    public void setDeductionTimeBegin(String DeductionTimeBegin) {
        this.DeductionTimeBegin = DeductionTimeBegin;
    }

    /**
     * Get <p>抵扣截止时间</p> 
     * @return DeductionTimeEnd <p>抵扣截止时间</p>
     */
    public String getDeductionTimeEnd() {
        return this.DeductionTimeEnd;
    }

    /**
     * Set <p>抵扣截止时间</p>
     * @param DeductionTimeEnd <p>抵扣截止时间</p>
     */
    public void setDeductionTimeEnd(String DeductionTimeEnd) {
        this.DeductionTimeEnd = DeductionTimeEnd;
    }

    /**
     * Get <p>模型路由资源包Id</p> 
     * @return ModelRouterResourcePackageId <p>模型路由资源包Id</p>
     */
    public String getModelRouterResourcePackageId() {
        return this.ModelRouterResourcePackageId;
    }

    /**
     * Set <p>模型路由资源包Id</p>
     * @param ModelRouterResourcePackageId <p>模型路由资源包Id</p>
     */
    public void setModelRouterResourcePackageId(String ModelRouterResourcePackageId) {
        this.ModelRouterResourcePackageId = ModelRouterResourcePackageId;
    }

    /**
     * Get <p>返回的数量</p><p>取值范围：[0, 100]</p><p>默认值：20</p> 
     * @return Limit <p>返回的数量</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回的数量</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
     * @param Limit <p>返回的数量</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>数据偏移量</p><p>默认值：0</p> 
     * @return Offset <p>数据偏移量</p><p>默认值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>数据偏移量</p><p>默认值：0</p>
     * @param Offset <p>数据偏移量</p><p>默认值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序方式：asc，desc</p> 
     * @return SortBy <p>排序方式：asc，desc</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>排序方式：asc，desc</p>
     * @param SortBy <p>排序方式：asc，desc</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    public DescribeModelRouterResourcePackageDeductionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelRouterResourcePackageDeductionRequest(DescribeModelRouterResourcePackageDeductionRequest source) {
        if (source.DeductionTimeBegin != null) {
            this.DeductionTimeBegin = new String(source.DeductionTimeBegin);
        }
        if (source.DeductionTimeEnd != null) {
            this.DeductionTimeEnd = new String(source.DeductionTimeEnd);
        }
        if (source.ModelRouterResourcePackageId != null) {
            this.ModelRouterResourcePackageId = new String(source.ModelRouterResourcePackageId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeductionTimeBegin", this.DeductionTimeBegin);
        this.setParamSimple(map, prefix + "DeductionTimeEnd", this.DeductionTimeEnd);
        this.setParamSimple(map, prefix + "ModelRouterResourcePackageId", this.ModelRouterResourcePackageId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);

    }
}

