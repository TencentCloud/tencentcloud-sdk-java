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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIPStrategyApisStatusRequest extends AbstractModel{

    /**
    * 服务唯一ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 策略唯一ID。
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * 策略所在环境。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 返回数量，默认为 20，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。支持 ApiPath、ApiName、KeyWord（模糊查询Path 和Name）。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 服务唯一ID。 
     * @return ServiceId 服务唯一ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务唯一ID。
     * @param ServiceId 服务唯一ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 策略唯一ID。 
     * @return StrategyId 策略唯一ID。
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略唯一ID。
     * @param StrategyId 策略唯一ID。
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 策略所在环境。 
     * @return EnvironmentName 策略所在环境。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 策略所在环境。
     * @param EnvironmentName 策略所在环境。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 返回数量，默认为 20，最大值为 100。 
     * @return Limit 返回数量，默认为 20，最大值为 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 100。
     * @param Limit 返回数量，默认为 20，最大值为 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为 0。 
     * @return Offset 偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0。
     * @param Offset 偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。支持 ApiPath、ApiName、KeyWord（模糊查询Path 和Name）。 
     * @return Filters 过滤条件。支持 ApiPath、ApiName、KeyWord（模糊查询Path 和Name）。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。支持 ApiPath、ApiName、KeyWord（模糊查询Path 和Name）。
     * @param Filters 过滤条件。支持 ApiPath、ApiName、KeyWord（模糊查询Path 和Name）。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeIPStrategyApisStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIPStrategyApisStatusRequest(DescribeIPStrategyApisStatusRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

