/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNotebookInstancesRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 排序方式
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * 创建时间晚于
    */
    @SerializedName("CreationTimeAfter")
    @Expose
    private String CreationTimeAfter;

    /**
    * 创建时间早于
    */
    @SerializedName("CreationTimeBefore")
    @Expose
    private String CreationTimeBefore;

    /**
    * 最近修改时间晚于
    */
    @SerializedName("LastModifiedTimeAfter")
    @Expose
    private String LastModifiedTimeAfter;

    /**
    * 最近修改时间早于
    */
    @SerializedName("LastModifiedTimeBefore")
    @Expose
    private String LastModifiedTimeBefore;

    /**
    * 根据名称过滤
    */
    @SerializedName("NameContains")
    @Expose
    private String NameContains;

    /**
    * 根据状态过滤
    */
    @SerializedName("StatusEquals")
    @Expose
    private String StatusEquals;

    /**
    * 最大返回个数
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目 
     * @return Limit 限制数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段 
     * @return SortBy 排序字段
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段
     * @param SortBy 排序字段
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 排序方式 
     * @return SortOrder 排序方式
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 排序方式
     * @param SortOrder 排序方式
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get 创建时间晚于 
     * @return CreationTimeAfter 创建时间晚于
     */
    public String getCreationTimeAfter() {
        return this.CreationTimeAfter;
    }

    /**
     * Set 创建时间晚于
     * @param CreationTimeAfter 创建时间晚于
     */
    public void setCreationTimeAfter(String CreationTimeAfter) {
        this.CreationTimeAfter = CreationTimeAfter;
    }

    /**
     * Get 创建时间早于 
     * @return CreationTimeBefore 创建时间早于
     */
    public String getCreationTimeBefore() {
        return this.CreationTimeBefore;
    }

    /**
     * Set 创建时间早于
     * @param CreationTimeBefore 创建时间早于
     */
    public void setCreationTimeBefore(String CreationTimeBefore) {
        this.CreationTimeBefore = CreationTimeBefore;
    }

    /**
     * Get 最近修改时间晚于 
     * @return LastModifiedTimeAfter 最近修改时间晚于
     */
    public String getLastModifiedTimeAfter() {
        return this.LastModifiedTimeAfter;
    }

    /**
     * Set 最近修改时间晚于
     * @param LastModifiedTimeAfter 最近修改时间晚于
     */
    public void setLastModifiedTimeAfter(String LastModifiedTimeAfter) {
        this.LastModifiedTimeAfter = LastModifiedTimeAfter;
    }

    /**
     * Get 最近修改时间早于 
     * @return LastModifiedTimeBefore 最近修改时间早于
     */
    public String getLastModifiedTimeBefore() {
        return this.LastModifiedTimeBefore;
    }

    /**
     * Set 最近修改时间早于
     * @param LastModifiedTimeBefore 最近修改时间早于
     */
    public void setLastModifiedTimeBefore(String LastModifiedTimeBefore) {
        this.LastModifiedTimeBefore = LastModifiedTimeBefore;
    }

    /**
     * Get 根据名称过滤 
     * @return NameContains 根据名称过滤
     */
    public String getNameContains() {
        return this.NameContains;
    }

    /**
     * Set 根据名称过滤
     * @param NameContains 根据名称过滤
     */
    public void setNameContains(String NameContains) {
        this.NameContains = NameContains;
    }

    /**
     * Get 根据状态过滤 
     * @return StatusEquals 根据状态过滤
     */
    public String getStatusEquals() {
        return this.StatusEquals;
    }

    /**
     * Set 根据状态过滤
     * @param StatusEquals 根据状态过滤
     */
    public void setStatusEquals(String StatusEquals) {
        this.StatusEquals = StatusEquals;
    }

    /**
     * Get 最大返回个数 
     * @return MaxResults 最大返回个数
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 最大返回个数
     * @param MaxResults 最大返回个数
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "CreationTimeAfter", this.CreationTimeAfter);
        this.setParamSimple(map, prefix + "CreationTimeBefore", this.CreationTimeBefore);
        this.setParamSimple(map, prefix + "LastModifiedTimeAfter", this.LastModifiedTimeAfter);
        this.setParamSimple(map, prefix + "LastModifiedTimeBefore", this.LastModifiedTimeBefore);
        this.setParamSimple(map, prefix + "NameContains", this.NameContains);
        this.setParamSimple(map, prefix + "StatusEquals", this.StatusEquals);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);

    }
}

