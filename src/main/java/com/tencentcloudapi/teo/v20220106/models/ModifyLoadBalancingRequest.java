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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoadBalancingRequest extends AbstractModel{

    /**
    * 站点ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 负载均衡ID
    */
    @SerializedName("LoadBalancingId")
    @Expose
    private String LoadBalancingId;

    /**
    * 代理模式：
dns_only: 仅DNS
proxied: 开启代理
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 使用的源站组ID
    */
    @SerializedName("OriginId")
    @Expose
    private String [] OriginId;

    /**
    * 当Type=dns_only表示DNS的TTL时间
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
     * Get 站点ID 
     * @return ZoneId 站点ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID
     * @param ZoneId 站点ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 负载均衡ID 
     * @return LoadBalancingId 负载均衡ID
     */
    public String getLoadBalancingId() {
        return this.LoadBalancingId;
    }

    /**
     * Set 负载均衡ID
     * @param LoadBalancingId 负载均衡ID
     */
    public void setLoadBalancingId(String LoadBalancingId) {
        this.LoadBalancingId = LoadBalancingId;
    }

    /**
     * Get 代理模式：
dns_only: 仅DNS
proxied: 开启代理 
     * @return Type 代理模式：
dns_only: 仅DNS
proxied: 开启代理
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 代理模式：
dns_only: 仅DNS
proxied: 开启代理
     * @param Type 代理模式：
dns_only: 仅DNS
proxied: 开启代理
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 使用的源站组ID 
     * @return OriginId 使用的源站组ID
     */
    public String [] getOriginId() {
        return this.OriginId;
    }

    /**
     * Set 使用的源站组ID
     * @param OriginId 使用的源站组ID
     */
    public void setOriginId(String [] OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get 当Type=dns_only表示DNS的TTL时间 
     * @return TTL 当Type=dns_only表示DNS的TTL时间
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 当Type=dns_only表示DNS的TTL时间
     * @param TTL 当Type=dns_only表示DNS的TTL时间
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    public ModifyLoadBalancingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancingRequest(ModifyLoadBalancingRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.LoadBalancingId != null) {
            this.LoadBalancingId = new String(source.LoadBalancingId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.OriginId != null) {
            this.OriginId = new String[source.OriginId.length];
            for (int i = 0; i < source.OriginId.length; i++) {
                this.OriginId[i] = new String(source.OriginId[i]);
            }
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "LoadBalancingId", this.LoadBalancingId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "OriginId.", this.OriginId);
        this.setParamSimple(map, prefix + "TTL", this.TTL);

    }
}

