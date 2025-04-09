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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyStatistics extends AbstractModel {

    /**
    * 入站IPv4总数
    */
    @SerializedName("IngressIPv4TotalCount")
    @Expose
    private Long IngressIPv4TotalCount;

    /**
    * 入站IPv6总数
    */
    @SerializedName("IngressIPv6TotalCount")
    @Expose
    private Long IngressIPv6TotalCount;

    /**
    * 出站IPv4总数
    */
    @SerializedName("EgressIPv4TotalCount")
    @Expose
    private Long EgressIPv4TotalCount;

    /**
    * 出站IPv6总数
    */
    @SerializedName("EgressIPv6TotalCount")
    @Expose
    private Long EgressIPv6TotalCount;

    /**
     * Get 入站IPv4总数 
     * @return IngressIPv4TotalCount 入站IPv4总数
     */
    public Long getIngressIPv4TotalCount() {
        return this.IngressIPv4TotalCount;
    }

    /**
     * Set 入站IPv4总数
     * @param IngressIPv4TotalCount 入站IPv4总数
     */
    public void setIngressIPv4TotalCount(Long IngressIPv4TotalCount) {
        this.IngressIPv4TotalCount = IngressIPv4TotalCount;
    }

    /**
     * Get 入站IPv6总数 
     * @return IngressIPv6TotalCount 入站IPv6总数
     */
    public Long getIngressIPv6TotalCount() {
        return this.IngressIPv6TotalCount;
    }

    /**
     * Set 入站IPv6总数
     * @param IngressIPv6TotalCount 入站IPv6总数
     */
    public void setIngressIPv6TotalCount(Long IngressIPv6TotalCount) {
        this.IngressIPv6TotalCount = IngressIPv6TotalCount;
    }

    /**
     * Get 出站IPv4总数 
     * @return EgressIPv4TotalCount 出站IPv4总数
     */
    public Long getEgressIPv4TotalCount() {
        return this.EgressIPv4TotalCount;
    }

    /**
     * Set 出站IPv4总数
     * @param EgressIPv4TotalCount 出站IPv4总数
     */
    public void setEgressIPv4TotalCount(Long EgressIPv4TotalCount) {
        this.EgressIPv4TotalCount = EgressIPv4TotalCount;
    }

    /**
     * Get 出站IPv6总数 
     * @return EgressIPv6TotalCount 出站IPv6总数
     */
    public Long getEgressIPv6TotalCount() {
        return this.EgressIPv6TotalCount;
    }

    /**
     * Set 出站IPv6总数
     * @param EgressIPv6TotalCount 出站IPv6总数
     */
    public void setEgressIPv6TotalCount(Long EgressIPv6TotalCount) {
        this.EgressIPv6TotalCount = EgressIPv6TotalCount;
    }

    public PolicyStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyStatistics(PolicyStatistics source) {
        if (source.IngressIPv4TotalCount != null) {
            this.IngressIPv4TotalCount = new Long(source.IngressIPv4TotalCount);
        }
        if (source.IngressIPv6TotalCount != null) {
            this.IngressIPv6TotalCount = new Long(source.IngressIPv6TotalCount);
        }
        if (source.EgressIPv4TotalCount != null) {
            this.EgressIPv4TotalCount = new Long(source.EgressIPv4TotalCount);
        }
        if (source.EgressIPv6TotalCount != null) {
            this.EgressIPv6TotalCount = new Long(source.EgressIPv6TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IngressIPv4TotalCount", this.IngressIPv4TotalCount);
        this.setParamSimple(map, prefix + "IngressIPv6TotalCount", this.IngressIPv6TotalCount);
        this.setParamSimple(map, prefix + "EgressIPv4TotalCount", this.EgressIPv4TotalCount);
        this.setParamSimple(map, prefix + "EgressIPv6TotalCount", this.EgressIPv6TotalCount);

    }
}

