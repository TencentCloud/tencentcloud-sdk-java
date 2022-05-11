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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Layer4Rule extends AbstractModel{

    /**
    * 源站端口，取值1~65535
    */
    @SerializedName("BackendPort")
    @Expose
    private Long BackendPort;

    /**
    * 转发端口，取值1~65535
    */
    @SerializedName("FrontendPort")
    @Expose
    private Long FrontendPort;

    /**
    * 转发协议，取值[
TCP(TCP协议)
UDP(UDP协议)
]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 源站列表
    */
    @SerializedName("RealServers")
    @Expose
    private SourceServer [] RealServers;

    /**
    * 资源实例
    */
    @SerializedName("InstanceDetails")
    @Expose
    private InstanceRelation [] InstanceDetails;

    /**
    * 规则所属的资源实例
    */
    @SerializedName("InstanceDetailRule")
    @Expose
    private RuleInstanceRelation [] InstanceDetailRule;

    /**
     * Get 源站端口，取值1~65535 
     * @return BackendPort 源站端口，取值1~65535
     */
    public Long getBackendPort() {
        return this.BackendPort;
    }

    /**
     * Set 源站端口，取值1~65535
     * @param BackendPort 源站端口，取值1~65535
     */
    public void setBackendPort(Long BackendPort) {
        this.BackendPort = BackendPort;
    }

    /**
     * Get 转发端口，取值1~65535 
     * @return FrontendPort 转发端口，取值1~65535
     */
    public Long getFrontendPort() {
        return this.FrontendPort;
    }

    /**
     * Set 转发端口，取值1~65535
     * @param FrontendPort 转发端口，取值1~65535
     */
    public void setFrontendPort(Long FrontendPort) {
        this.FrontendPort = FrontendPort;
    }

    /**
     * Get 转发协议，取值[
TCP(TCP协议)
UDP(UDP协议)
] 
     * @return Protocol 转发协议，取值[
TCP(TCP协议)
UDP(UDP协议)
]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 转发协议，取值[
TCP(TCP协议)
UDP(UDP协议)
]
     * @param Protocol 转发协议，取值[
TCP(TCP协议)
UDP(UDP协议)
]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 源站列表 
     * @return RealServers 源站列表
     */
    public SourceServer [] getRealServers() {
        return this.RealServers;
    }

    /**
     * Set 源站列表
     * @param RealServers 源站列表
     */
    public void setRealServers(SourceServer [] RealServers) {
        this.RealServers = RealServers;
    }

    /**
     * Get 资源实例 
     * @return InstanceDetails 资源实例
     */
    public InstanceRelation [] getInstanceDetails() {
        return this.InstanceDetails;
    }

    /**
     * Set 资源实例
     * @param InstanceDetails 资源实例
     */
    public void setInstanceDetails(InstanceRelation [] InstanceDetails) {
        this.InstanceDetails = InstanceDetails;
    }

    /**
     * Get 规则所属的资源实例 
     * @return InstanceDetailRule 规则所属的资源实例
     */
    public RuleInstanceRelation [] getInstanceDetailRule() {
        return this.InstanceDetailRule;
    }

    /**
     * Set 规则所属的资源实例
     * @param InstanceDetailRule 规则所属的资源实例
     */
    public void setInstanceDetailRule(RuleInstanceRelation [] InstanceDetailRule) {
        this.InstanceDetailRule = InstanceDetailRule;
    }

    public Layer4Rule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Layer4Rule(Layer4Rule source) {
        if (source.BackendPort != null) {
            this.BackendPort = new Long(source.BackendPort);
        }
        if (source.FrontendPort != null) {
            this.FrontendPort = new Long(source.FrontendPort);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RealServers != null) {
            this.RealServers = new SourceServer[source.RealServers.length];
            for (int i = 0; i < source.RealServers.length; i++) {
                this.RealServers[i] = new SourceServer(source.RealServers[i]);
            }
        }
        if (source.InstanceDetails != null) {
            this.InstanceDetails = new InstanceRelation[source.InstanceDetails.length];
            for (int i = 0; i < source.InstanceDetails.length; i++) {
                this.InstanceDetails[i] = new InstanceRelation(source.InstanceDetails[i]);
            }
        }
        if (source.InstanceDetailRule != null) {
            this.InstanceDetailRule = new RuleInstanceRelation[source.InstanceDetailRule.length];
            for (int i = 0; i < source.InstanceDetailRule.length; i++) {
                this.InstanceDetailRule[i] = new RuleInstanceRelation(source.InstanceDetailRule[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackendPort", this.BackendPort);
        this.setParamSimple(map, prefix + "FrontendPort", this.FrontendPort);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "RealServers.", this.RealServers);
        this.setParamArrayObj(map, prefix + "InstanceDetails.", this.InstanceDetails);
        this.setParamArrayObj(map, prefix + "InstanceDetailRule.", this.InstanceDetailRule);

    }
}

