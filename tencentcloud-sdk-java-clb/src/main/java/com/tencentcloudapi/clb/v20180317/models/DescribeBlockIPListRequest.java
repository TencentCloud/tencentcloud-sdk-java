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

public class DescribeBlockIPListRequest extends AbstractModel{

    /**
    * 负载均衡实例 ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 数据偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回IP的最大个数，默认为 100000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 负载均衡实例 ID。 
     * @return LoadBalancerId 负载均衡实例 ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID。
     * @param LoadBalancerId 负载均衡实例 ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 数据偏移量，默认为 0。 
     * @return Offset 数据偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，默认为 0。
     * @param Offset 数据偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回IP的最大个数，默认为 100000。 
     * @return Limit 返回IP的最大个数，默认为 100000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回IP的最大个数，默认为 100000。
     * @param Limit 返回IP的最大个数，默认为 100000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

