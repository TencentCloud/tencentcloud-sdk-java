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

public class DescribeBlockingTrendRequest extends AbstractModel {

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>服务产品类型，固定为sqlserver。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>查询起始时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss。必须在最近 30 天内，否则返回 InvalidParameterValue。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss，需大于 StartTime。单次查询跨度必须 ≤ 7 天（Trend 走 Druid 原生聚合，跨度比明细类接口更宽泛），否则返回 InvalidParameterValue。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>实例ID。</p> 
     * @return InstanceId <p>实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param InstanceId <p>实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>服务产品类型，固定为sqlserver。</p> 
     * @return Product <p>服务产品类型，固定为sqlserver。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，固定为sqlserver。</p>
     * @param Product <p>服务产品类型，固定为sqlserver。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>查询起始时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss。必须在最近 30 天内，否则返回 InvalidParameterValue。</p> 
     * @return StartTime <p>查询起始时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss。必须在最近 30 天内，否则返回 InvalidParameterValue。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询起始时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss。必须在最近 30 天内，否则返回 InvalidParameterValue。</p>
     * @param StartTime <p>查询起始时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss。必须在最近 30 天内，否则返回 InvalidParameterValue。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss，需大于 StartTime。单次查询跨度必须 ≤ 7 天（Trend 走 Druid 原生聚合，跨度比明细类接口更宽泛），否则返回 InvalidParameterValue。</p> 
     * @return EndTime <p>查询结束时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss，需大于 StartTime。单次查询跨度必须 ≤ 7 天（Trend 走 Druid 原生聚合，跨度比明细类接口更宽泛），否则返回 InvalidParameterValue。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss，需大于 StartTime。单次查询跨度必须 ≤ 7 天（Trend 走 Druid 原生聚合，跨度比明细类接口更宽泛），否则返回 InvalidParameterValue。</p>
     * @param EndTime <p>查询结束时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss，需大于 StartTime。单次查询跨度必须 ≤ 7 天（Trend 走 Druid 原生聚合，跨度比明细类接口更宽泛），否则返回 InvalidParameterValue。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeBlockingTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlockingTrendRequest(DescribeBlockingTrendRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

