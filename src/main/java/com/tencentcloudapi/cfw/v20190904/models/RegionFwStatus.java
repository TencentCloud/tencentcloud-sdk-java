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
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>引流网络部署状态</p><ol><li>&quot;NotDeployed&quot;  防火墙集群未部署</li><li>&quot;Deployed&quot;        防火墙集群已部署，但未创建引流网络</li><li>&quot;DeployedCustomOnly&quot;  防火墙集群已部署，但内网段被全覆盖，无法自动选择引流网络，需自定义设置引流网段</li><li>&quot;Auto&quot;                防火墙集群已部署，并自动选择网段创建了引流网络</li><li>&quot;Custom&quot;            防火墙集群已部署，并根据用户自定义网段创建了引流网络</li></ol>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>引流网络的cidr，如果没有部署引流网络则为空</p>
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>引流网络部署状态</p><ol><li>&quot;NotDeployed&quot;  防火墙集群未部署</li><li>&quot;Deployed&quot;        防火墙集群已部署，但未创建引流网络</li><li>&quot;DeployedCustomOnly&quot;  防火墙集群已部署，但内网段被全覆盖，无法自动选择引流网络，需自定义设置引流网段</li><li>&quot;Auto&quot;                防火墙集群已部署，并自动选择网段创建了引流网络</li><li>&quot;Custom&quot;            防火墙集群已部署，并根据用户自定义网段创建了引流网络</li></ol> 
     * @return Status <p>引流网络部署状态</p><ol><li>&quot;NotDeployed&quot;  防火墙集群未部署</li><li>&quot;Deployed&quot;        防火墙集群已部署，但未创建引流网络</li><li>&quot;DeployedCustomOnly&quot;  防火墙集群已部署，但内网段被全覆盖，无法自动选择引流网络，需自定义设置引流网段</li><li>&quot;Auto&quot;                防火墙集群已部署，并自动选择网段创建了引流网络</li><li>&quot;Custom&quot;            防火墙集群已部署，并根据用户自定义网段创建了引流网络</li></ol>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>引流网络部署状态</p><ol><li>&quot;NotDeployed&quot;  防火墙集群未部署</li><li>&quot;Deployed&quot;        防火墙集群已部署，但未创建引流网络</li><li>&quot;DeployedCustomOnly&quot;  防火墙集群已部署，但内网段被全覆盖，无法自动选择引流网络，需自定义设置引流网段</li><li>&quot;Auto&quot;                防火墙集群已部署，并自动选择网段创建了引流网络</li><li>&quot;Custom&quot;            防火墙集群已部署，并根据用户自定义网段创建了引流网络</li></ol>
     * @param Status <p>引流网络部署状态</p><ol><li>&quot;NotDeployed&quot;  防火墙集群未部署</li><li>&quot;Deployed&quot;        防火墙集群已部署，但未创建引流网络</li><li>&quot;DeployedCustomOnly&quot;  防火墙集群已部署，但内网段被全覆盖，无法自动选择引流网络，需自定义设置引流网段</li><li>&quot;Auto&quot;                防火墙集群已部署，并自动选择网段创建了引流网络</li><li>&quot;Custom&quot;            防火墙集群已部署，并根据用户自定义网段创建了引流网络</li></ol>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>引流网络的cidr，如果没有部署引流网络则为空</p> 
     * @return Cidr <p>引流网络的cidr，如果没有部署引流网络则为空</p>
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set <p>引流网络的cidr，如果没有部署引流网络则为空</p>
     * @param Cidr <p>引流网络的cidr，如果没有部署引流网络则为空</p>
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

