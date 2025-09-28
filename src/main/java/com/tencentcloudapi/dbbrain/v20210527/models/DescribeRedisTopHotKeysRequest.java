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

public class DescribeRedisTopHotKeysRequest extends AbstractModel {

    /**
    * 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间，如“2024-09-22T00:00:00+00:00”。0天 < 当前服务器时间 - 开始时间 <= 10天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，如“2024-09-22T01:00:00+00:00”，0天 < 结束时间 - 开始时间 <= 10天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 服务产品类型，仅仅支持值 "redis" - 云数据库 Redis。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Redis 节点数组。
    */
    @SerializedName("InstanceNodeIds")
    @Expose
    private String [] InstanceNodeIds;

    /**
    * top 数目，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get 开始时间，如“2024-09-22T00:00:00+00:00”。0天 < 当前服务器时间 - 开始时间 <= 10天。 
     * @return StartTime 开始时间，如“2024-09-22T00:00:00+00:00”。0天 < 当前服务器时间 - 开始时间 <= 10天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，如“2024-09-22T00:00:00+00:00”。0天 < 当前服务器时间 - 开始时间 <= 10天。
     * @param StartTime 开始时间，如“2024-09-22T00:00:00+00:00”。0天 < 当前服务器时间 - 开始时间 <= 10天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，如“2024-09-22T01:00:00+00:00”，0天 < 结束时间 - 开始时间 <= 10天。 
     * @return EndTime 结束时间，如“2024-09-22T01:00:00+00:00”，0天 < 结束时间 - 开始时间 <= 10天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，如“2024-09-22T01:00:00+00:00”，0天 < 结束时间 - 开始时间 <= 10天。
     * @param EndTime 结束时间，如“2024-09-22T01:00:00+00:00”，0天 < 结束时间 - 开始时间 <= 10天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 服务产品类型，仅仅支持值 "redis" - 云数据库 Redis。 
     * @return Product 服务产品类型，仅仅支持值 "redis" - 云数据库 Redis。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，仅仅支持值 "redis" - 云数据库 Redis。
     * @param Product 服务产品类型，仅仅支持值 "redis" - 云数据库 Redis。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Redis 节点数组。 
     * @return InstanceNodeIds Redis 节点数组。
     */
    public String [] getInstanceNodeIds() {
        return this.InstanceNodeIds;
    }

    /**
     * Set Redis 节点数组。
     * @param InstanceNodeIds Redis 节点数组。
     */
    public void setInstanceNodeIds(String [] InstanceNodeIds) {
        this.InstanceNodeIds = InstanceNodeIds;
    }

    /**
     * Get top 数目，默认为20，最大值为100。 
     * @return Limit top 数目，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set top 数目，默认为20，最大值为100。
     * @param Limit top 数目，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeRedisTopHotKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRedisTopHotKeysRequest(DescribeRedisTopHotKeysRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.InstanceNodeIds != null) {
            this.InstanceNodeIds = new String[source.InstanceNodeIds.length];
            for (int i = 0; i < source.InstanceNodeIds.length; i++) {
                this.InstanceNodeIds[i] = new String(source.InstanceNodeIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "InstanceNodeIds.", this.InstanceNodeIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

