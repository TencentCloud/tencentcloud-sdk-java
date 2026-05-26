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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMemoryPlusSpacesRequest extends AbstractModel {

    /**
    * <p>查询列表的起始位置（偏移量）。用于分页查询，指明从符合条件的第几条数据开始返回。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>单次查询返回的记录数量上限（分页大小）。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>查询实例名称或者实例id</p>
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * <p>实例状态</p><p>枚举值：</p><ul><li>1： 运行中</li><li>2： 创建中</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 隔离中</li><li>6： 已隔离（进入回收站）</li><li>7： 恢复中（从回收站恢复）</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * <p>资源标签</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>排序字段</p>
    */
    @SerializedName("Orderby")
    @Expose
    private String Orderby;

    /**
    * <p>排序方向</p><p>枚举值：</p><ul><li>ASC： 升序</li><li>DESC： 降序</li></ul>
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get <p>查询列表的起始位置（偏移量）。用于分页查询，指明从符合条件的第几条数据开始返回。</p> 
     * @return Offset <p>查询列表的起始位置（偏移量）。用于分页查询，指明从符合条件的第几条数据开始返回。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>查询列表的起始位置（偏移量）。用于分页查询，指明从符合条件的第几条数据开始返回。</p>
     * @param Offset <p>查询列表的起始位置（偏移量）。用于分页查询，指明从符合条件的第几条数据开始返回。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>单次查询返回的记录数量上限（分页大小）。</p> 
     * @return Limit <p>单次查询返回的记录数量上限（分页大小）。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次查询返回的记录数量上限（分页大小）。</p>
     * @param Limit <p>单次查询返回的记录数量上限（分页大小）。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>查询实例名称或者实例id</p> 
     * @return SearchKeys <p>查询实例名称或者实例id</p>
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set <p>查询实例名称或者实例id</p>
     * @param SearchKeys <p>查询实例名称或者实例id</p>
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get <p>实例状态</p><p>枚举值：</p><ul><li>1： 运行中</li><li>2： 创建中</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 隔离中</li><li>6： 已隔离（进入回收站）</li><li>7： 恢复中（从回收站恢复）</li></ul> 
     * @return Status <p>实例状态</p><p>枚举值：</p><ul><li>1： 运行中</li><li>2： 创建中</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 隔离中</li><li>6： 已隔离（进入回收站）</li><li>7： 恢复中（从回收站恢复）</li></ul>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态</p><p>枚举值：</p><ul><li>1： 运行中</li><li>2： 创建中</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 隔离中</li><li>6： 已隔离（进入回收站）</li><li>7： 恢复中（从回收站恢复）</li></ul>
     * @param Status <p>实例状态</p><p>枚举值：</p><ul><li>1： 运行中</li><li>2： 创建中</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 隔离中</li><li>6： 已隔离（进入回收站）</li><li>7： 恢复中（从回收站恢复）</li></ul>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>资源标签</p> 
     * @return ResourceTags <p>资源标签</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>资源标签</p>
     * @param ResourceTags <p>资源标签</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>排序字段</p> 
     * @return Orderby <p>排序字段</p>
     */
    public String getOrderby() {
        return this.Orderby;
    }

    /**
     * Set <p>排序字段</p>
     * @param Orderby <p>排序字段</p>
     */
    public void setOrderby(String Orderby) {
        this.Orderby = Orderby;
    }

    /**
     * Get <p>排序方向</p><p>枚举值：</p><ul><li>ASC： 升序</li><li>DESC： 降序</li></ul> 
     * @return OrderDirection <p>排序方向</p><p>枚举值：</p><ul><li>ASC： 升序</li><li>DESC： 降序</li></ul>
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set <p>排序方向</p><p>枚举值：</p><ul><li>ASC： 升序</li><li>DESC： 降序</li></ul>
     * @param OrderDirection <p>排序方向</p><p>枚举值：</p><ul><li>ASC： 升序</li><li>DESC： 降序</li></ul>
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribeMemoryPlusSpacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMemoryPlusSpacesRequest(DescribeMemoryPlusSpacesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchKeys != null) {
            this.SearchKeys = new String[source.SearchKeys.length];
            for (int i = 0; i < source.SearchKeys.length; i++) {
                this.SearchKeys[i] = new String(source.SearchKeys[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.Orderby != null) {
            this.Orderby = new String(source.Orderby);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "SearchKeys.", this.SearchKeys);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Orderby", this.Orderby);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

