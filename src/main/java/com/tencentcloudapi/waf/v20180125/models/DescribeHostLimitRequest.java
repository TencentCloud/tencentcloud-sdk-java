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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostLimitRequest extends AbstractModel {

    /**
    * 添加的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 实例id
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 流量来源类型，'clb'表示CLB负载均衡，'apisix'表示自建网关（含Kong），'tsegw'表示TSE云原生网关
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
     * Get 添加的域名 
     * @return Domain 添加的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 添加的域名
     * @param Domain 添加的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 实例id 
     * @return InstanceID 实例id
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例id
     * @param InstanceID 实例id
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 流量来源类型，'clb'表示CLB负载均衡，'apisix'表示自建网关（含Kong），'tsegw'表示TSE云原生网关 
     * @return AlbType 流量来源类型，'clb'表示CLB负载均衡，'apisix'表示自建网关（含Kong），'tsegw'表示TSE云原生网关
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set 流量来源类型，'clb'表示CLB负载均衡，'apisix'表示自建网关（含Kong），'tsegw'表示TSE云原生网关
     * @param AlbType 流量来源类型，'clb'表示CLB负载均衡，'apisix'表示自建网关（含Kong），'tsegw'表示TSE云原生网关
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    public DescribeHostLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostLimitRequest(DescribeHostLimitRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.AlbType != null) {
            this.AlbType = new String(source.AlbType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "AlbType", this.AlbType);

    }
}

