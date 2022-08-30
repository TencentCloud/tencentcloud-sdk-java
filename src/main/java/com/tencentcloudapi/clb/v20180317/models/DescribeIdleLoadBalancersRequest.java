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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIdleLoadBalancersRequest extends AbstractModel{

    /**
    * 数据偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回负载均衡实例的数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 负载均衡所在地域。
    */
    @SerializedName("LoadBalancerRegion")
    @Expose
    private String LoadBalancerRegion;

    /**
     * Get 数据偏移量，默认为0。 
     * @return Offset 数据偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，默认为0。
     * @param Offset 数据偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回负载均衡实例的数量，默认为20，最大值为100。 
     * @return Limit 返回负载均衡实例的数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回负载均衡实例的数量，默认为20，最大值为100。
     * @param Limit 返回负载均衡实例的数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 负载均衡所在地域。 
     * @return LoadBalancerRegion 负载均衡所在地域。
     */
    public String getLoadBalancerRegion() {
        return this.LoadBalancerRegion;
    }

    /**
     * Set 负载均衡所在地域。
     * @param LoadBalancerRegion 负载均衡所在地域。
     */
    public void setLoadBalancerRegion(String LoadBalancerRegion) {
        this.LoadBalancerRegion = LoadBalancerRegion;
    }

    public DescribeIdleLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIdleLoadBalancersRequest(DescribeIdleLoadBalancersRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.LoadBalancerRegion != null) {
            this.LoadBalancerRegion = new String(source.LoadBalancerRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "LoadBalancerRegion", this.LoadBalancerRegion);

    }
}

