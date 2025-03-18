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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBAutonomyEventsRequest extends AbstractModel {

    /**
    * 服务产品类型，支持值包括： "redis" - 云数据库 Redis。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 实列ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页参数，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数，默认值为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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

    /**
     * Get 实列ID。 
     * @return InstanceId 实列ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实列ID。
     * @param InstanceId 实列ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间。 
     * @return StartTime 开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。
     * @param StartTime 开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。 
     * @return EndTime 结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。
     * @param EndTime 结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页参数，默认值为0。 
     * @return Offset 分页参数，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，默认值为0。
     * @param Offset 分页参数，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数，默认值为20。 
     * @return Limit 分页参数，默认值为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，默认值为20。
     * @param Limit 分页参数，默认值为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDBAutonomyEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBAutonomyEventsRequest(DescribeDBAutonomyEventsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

