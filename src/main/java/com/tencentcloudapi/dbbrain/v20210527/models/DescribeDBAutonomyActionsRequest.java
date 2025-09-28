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

public class DescribeDBAutonomyActionsRequest extends AbstractModel {

    /**
    * 事件ID。可通过 [DescribeDBDiagHistory](https://cloud.tencent.com/document/product/1130/39559) 接口获取。
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务产品类型，支持值包括： "redis" - 云数据库 Redis。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 事件ID。可通过 [DescribeDBDiagHistory](https://cloud.tencent.com/document/product/1130/39559) 接口获取。 
     * @return EventId 事件ID。可通过 [DescribeDBDiagHistory](https://cloud.tencent.com/document/product/1130/39559) 接口获取。
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件ID。可通过 [DescribeDBDiagHistory](https://cloud.tencent.com/document/product/1130/39559) 接口获取。
     * @param EventId 事件ID。可通过 [DescribeDBDiagHistory](https://cloud.tencent.com/document/product/1130/39559) 接口获取。
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

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
     * Get 服务产品类型，支持值包括： "redis" - 云数据库 Redis。 
     * @return Product 服务产品类型，支持值包括： "redis" - 云数据库 Redis。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "redis" - 云数据库 Redis。
     * @param Product 服务产品类型，支持值包括： "redis" - 云数据库 Redis。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeDBAutonomyActionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBAutonomyActionsRequest(DescribeDBAutonomyActionsRequest source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

