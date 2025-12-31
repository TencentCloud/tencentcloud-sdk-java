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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionFwStatus extends AbstractModel {

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 引流网络部署状态
1. "NotDeployed"  防火墙集群未部署
2. "Deployed"        防火墙集群已部署，但未创建引流网络
3. "Auto"                防火墙集群已部署，并自动选择网段创建了引流网络
4. "Custom"            防火墙集群已部署，并根据用户自定义网段创建了引流网络
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 引流网络的cidr，如果没有部署引流网络则为空
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 引流网络部署状态
1. "NotDeployed"  防火墙集群未部署
2. "Deployed"        防火墙集群已部署，但未创建引流网络
3. "Auto"                防火墙集群已部署，并自动选择网段创建了引流网络
4. "Custom"            防火墙集群已部署，并根据用户自定义网段创建了引流网络 
     * @return Status 引流网络部署状态
1. "NotDeployed"  防火墙集群未部署
2. "Deployed"        防火墙集群已部署，但未创建引流网络
3. "Auto"                防火墙集群已部署，并自动选择网段创建了引流网络
4. "Custom"            防火墙集群已部署，并根据用户自定义网段创建了引流网络
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 引流网络部署状态
1. "NotDeployed"  防火墙集群未部署
2. "Deployed"        防火墙集群已部署，但未创建引流网络
3. "Auto"                防火墙集群已部署，并自动选择网段创建了引流网络
4. "Custom"            防火墙集群已部署，并根据用户自定义网段创建了引流网络
     * @param Status 引流网络部署状态
1. "NotDeployed"  防火墙集群未部署
2. "Deployed"        防火墙集群已部署，但未创建引流网络
3. "Auto"                防火墙集群已部署，并自动选择网段创建了引流网络
4. "Custom"            防火墙集群已部署，并根据用户自定义网段创建了引流网络
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 引流网络的cidr，如果没有部署引流网络则为空 
     * @return Cidr 引流网络的cidr，如果没有部署引流网络则为空
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set 引流网络的cidr，如果没有部署引流网络则为空
     * @param Cidr 引流网络的cidr，如果没有部署引流网络则为空
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    public RegionFwStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionFwStatus(RegionFwStatus source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Cidr != null) {
            this.Cidr = new String(source.Cidr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);

    }
}

