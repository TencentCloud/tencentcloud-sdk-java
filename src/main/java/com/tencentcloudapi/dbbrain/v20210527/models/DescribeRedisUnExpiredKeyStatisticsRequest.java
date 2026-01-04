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

public class DescribeRedisUnExpiredKeyStatisticsRequest extends AbstractModel {

    /**
    * 实例 ID。可通过接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务产品类型，支持值包括 "redis" - 云数据库 Redis。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 查询某个日期最新的任务，如2021-05-27，最早可为前30天的日期。该参数与AsyncRequestId参数不可同时为空。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

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
     * Get 实例 ID。可通过接口获取。 
     * @return InstanceId 实例 ID。可通过接口获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。可通过接口获取。
     * @param InstanceId 实例 ID。可通过接口获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get 查询某个日期最新的任务，如2021-05-27，最早可为前30天的日期。该参数与AsyncRequestId参数不可同时为空。 
     * @return Date 查询某个日期最新的任务，如2021-05-27，最早可为前30天的日期。该参数与AsyncRequestId参数不可同时为空。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 查询某个日期最新的任务，如2021-05-27，最早可为前30天的日期。该参数与AsyncRequestId参数不可同时为空。
     * @param Date 查询某个日期最新的任务，如2021-05-27，最早可为前30天的日期。该参数与AsyncRequestId参数不可同时为空。
     */
    public void setDate(String Date) {
        this.Date = Date;
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

    public DescribeRedisUnExpiredKeyStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRedisUnExpiredKeyStatisticsRequest(DescribeRedisUnExpiredKeyStatisticsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
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
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamArraySimple(map, prefix + "ShardIds.", this.ShardIds);

    }
}

