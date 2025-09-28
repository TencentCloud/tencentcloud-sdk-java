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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRedisTopBigKeysRequest extends AbstractModel {

    /**
    * 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询日期，如2021-05-27，最早可为前30天的日期。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 服务产品类型，支持值包括 "redis" - 云数据库 Redis。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 排序字段，取值包括Capacity - 内存，ItemCount - 元素数量，默认为Capacity。
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * key类型筛选条件，默认为不进行筛选，取值包括string, list, set, hash, sortedset, stream。
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
    * 查询数目，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 异步任务ID。当为空时，选择最近任务的ID。
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * 分片节点序号列表。当列表为空时，选择所有分片节点。
    */
    @SerializedName("ShardIds")
    @Expose
    private Long [] ShardIds;

    /**
     * Get 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。 
     * @return InstanceId 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
     * @param InstanceId 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 查询日期，如2021-05-27，最早可为前30天的日期。 
     * @return Date 查询日期，如2021-05-27，最早可为前30天的日期。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 查询日期，如2021-05-27，最早可为前30天的日期。
     * @param Date 查询日期，如2021-05-27，最早可为前30天的日期。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 服务产品类型，支持值包括 "redis" - 云数据库 Redis。 
     * @return Product 服务产品类型，支持值包括 "redis" - 云数据库 Redis。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括 "redis" - 云数据库 Redis。
     * @param Product 服务产品类型，支持值包括 "redis" - 云数据库 Redis。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 排序字段，取值包括Capacity - 内存，ItemCount - 元素数量，默认为Capacity。 
     * @return SortBy 排序字段，取值包括Capacity - 内存，ItemCount - 元素数量，默认为Capacity。
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段，取值包括Capacity - 内存，ItemCount - 元素数量，默认为Capacity。
     * @param SortBy 排序字段，取值包括Capacity - 内存，ItemCount - 元素数量，默认为Capacity。
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get key类型筛选条件，默认为不进行筛选，取值包括string, list, set, hash, sortedset, stream。 
     * @return KeyType key类型筛选条件，默认为不进行筛选，取值包括string, list, set, hash, sortedset, stream。
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set key类型筛选条件，默认为不进行筛选，取值包括string, list, set, hash, sortedset, stream。
     * @param KeyType key类型筛选条件，默认为不进行筛选，取值包括string, list, set, hash, sortedset, stream。
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get 查询数目，默认为20，最大值为100。 
     * @return Limit 查询数目，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询数目，默认为20，最大值为100。
     * @param Limit 查询数目，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 异步任务ID。当为空时，选择最近任务的ID。 
     * @return AsyncRequestId 异步任务ID。当为空时，选择最近任务的ID。
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set 异步任务ID。当为空时，选择最近任务的ID。
     * @param AsyncRequestId 异步任务ID。当为空时，选择最近任务的ID。
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get 分片节点序号列表。当列表为空时，选择所有分片节点。 
     * @return ShardIds 分片节点序号列表。当列表为空时，选择所有分片节点。
     */
    public Long [] getShardIds() {
        return this.ShardIds;
    }

    /**
     * Set 分片节点序号列表。当列表为空时，选择所有分片节点。
     * @param ShardIds 分片节点序号列表。当列表为空时，选择所有分片节点。
     */
    public void setShardIds(Long [] ShardIds) {
        this.ShardIds = ShardIds;
    }

    public DescribeRedisTopBigKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRedisTopBigKeysRequest(DescribeRedisTopBigKeysRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.KeyType != null) {
            this.KeyType = new String(source.KeyType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new Long(source.AsyncRequestId);
        }
        if (source.ShardIds != null) {
            this.ShardIds = new Long[source.ShardIds.length];
            for (int i = 0; i < source.ShardIds.length; i++) {
                this.ShardIds[i] = new Long(source.ShardIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamArraySimple(map, prefix + "ShardIds.", this.ShardIds);

    }
}

