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

public class NatFwClusterRegionStatus extends AbstractModel {

    /**
    * <p>NAT网关ID</p>
    */
    @SerializedName("NatInsId")
    @Expose
    private String NatInsId;

    /**
    * <p>云联网ID</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>地域，如 ap-guangzhou</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>地域集群状态，取值：<br>NotDeployed-未部署集群，<br>Deployed-已部署集群但未创建引流网络，<br>DeployedCustomOnly-已部署集群但内网段被覆盖，无法自动选择引流网段，需自定义设置引流网段<br>Auto-已创建引流网络(自动分配CIDR)，<br>Custom-已创建引流网络(自定义CIDR)</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>引流网络 CIDR，仅当 Status 为 Auto 或 Custom 时有值</p>
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
    * <p>引流路由方法，0-多路由表模式，1-策略路由模式</p>
    */
    @SerializedName("RoutingMode")
    @Expose
    private Long RoutingMode;

    /**
     * Get <p>NAT网关ID</p> 
     * @return NatInsId <p>NAT网关ID</p>
     */
    public String getNatInsId() {
        return this.NatInsId;
    }

    /**
     * Set <p>NAT网关ID</p>
     * @param NatInsId <p>NAT网关ID</p>
     */
    public void setNatInsId(String NatInsId) {
        this.NatInsId = NatInsId;
    }

    /**
     * Get <p>云联网ID</p> 
     * @return CcnId <p>云联网ID</p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>云联网ID</p>
     * @param CcnId <p>云联网ID</p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>地域，如 ap-guangzhou</p> 
     * @return Region <p>地域，如 ap-guangzhou</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域，如 ap-guangzhou</p>
     * @param Region <p>地域，如 ap-guangzhou</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>地域集群状态，取值：<br>NotDeployed-未部署集群，<br>Deployed-已部署集群但未创建引流网络，<br>DeployedCustomOnly-已部署集群但内网段被覆盖，无法自动选择引流网段，需自定义设置引流网段<br>Auto-已创建引流网络(自动分配CIDR)，<br>Custom-已创建引流网络(自定义CIDR)</p> 
     * @return Status <p>地域集群状态，取值：<br>NotDeployed-未部署集群，<br>Deployed-已部署集群但未创建引流网络，<br>DeployedCustomOnly-已部署集群但内网段被覆盖，无法自动选择引流网段，需自定义设置引流网段<br>Auto-已创建引流网络(自动分配CIDR)，<br>Custom-已创建引流网络(自定义CIDR)</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>地域集群状态，取值：<br>NotDeployed-未部署集群，<br>Deployed-已部署集群但未创建引流网络，<br>DeployedCustomOnly-已部署集群但内网段被覆盖，无法自动选择引流网段，需自定义设置引流网段<br>Auto-已创建引流网络(自动分配CIDR)，<br>Custom-已创建引流网络(自定义CIDR)</p>
     * @param Status <p>地域集群状态，取值：<br>NotDeployed-未部署集群，<br>Deployed-已部署集群但未创建引流网络，<br>DeployedCustomOnly-已部署集群但内网段被覆盖，无法自动选择引流网段，需自定义设置引流网段<br>Auto-已创建引流网络(自动分配CIDR)，<br>Custom-已创建引流网络(自定义CIDR)</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>引流网络 CIDR，仅当 Status 为 Auto 或 Custom 时有值</p> 
     * @return Cidr <p>引流网络 CIDR，仅当 Status 为 Auto 或 Custom 时有值</p>
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set <p>引流网络 CIDR，仅当 Status 为 Auto 或 Custom 时有值</p>
     * @param Cidr <p>引流网络 CIDR，仅当 Status 为 Auto 或 Custom 时有值</p>
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    /**
     * Get <p>引流路由方法，0-多路由表模式，1-策略路由模式</p> 
     * @return RoutingMode <p>引流路由方法，0-多路由表模式，1-策略路由模式</p>
     */
    public Long getRoutingMode() {
        return this.RoutingMode;
    }

    /**
     * Set <p>引流路由方法，0-多路由表模式，1-策略路由模式</p>
     * @param RoutingMode <p>引流路由方法，0-多路由表模式，1-策略路由模式</p>
     */
    public void setRoutingMode(Long RoutingMode) {
        this.RoutingMode = RoutingMode;
    }

    public NatFwClusterRegionStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatFwClusterRegionStatus(NatFwClusterRegionStatus source) {
        if (source.NatInsId != null) {
            this.NatInsId = new String(source.NatInsId);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Cidr != null) {
            this.Cidr = new String(source.Cidr);
        }
        if (source.RoutingMode != null) {
            this.RoutingMode = new Long(source.RoutingMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatInsId", this.NatInsId);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);
        this.setParamSimple(map, prefix + "RoutingMode", this.RoutingMode);

    }
}

