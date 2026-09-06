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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGatewayFlowQosRequest extends AbstractModel {

    /**
    * <p>网关实例ID，目前我们支持的网关实例类型有，<br>专线网关实例ID，形如，<code>dcg-ltjahce6</code>；<br>Nat网关实例ID，形如，<code>nat-ltjahce6</code>；<br>VPN网关实例ID，形如，<code>vpn-ltjahce6</code>。</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>流控带宽值。取值大于0，表示限流到指定的Mbps；取值等于0，表示完全限流；取值为-1，不限流。</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>限流的云服务器内网IP。</p><p>参数格式：10.0.0.2</p>
    */
    @SerializedName("IpAddresses")
    @Expose
    private String [] IpAddresses;

    /**
    * <p>限流方向，取值为In代表入向，Out代表出向。当前仅标准型Nat实例网关流控带宽方向可设置入向限流。</p>
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get <p>网关实例ID，目前我们支持的网关实例类型有，<br>专线网关实例ID，形如，<code>dcg-ltjahce6</code>；<br>Nat网关实例ID，形如，<code>nat-ltjahce6</code>；<br>VPN网关实例ID，形如，<code>vpn-ltjahce6</code>。</p> 
     * @return GatewayId <p>网关实例ID，目前我们支持的网关实例类型有，<br>专线网关实例ID，形如，<code>dcg-ltjahce6</code>；<br>Nat网关实例ID，形如，<code>nat-ltjahce6</code>；<br>VPN网关实例ID，形如，<code>vpn-ltjahce6</code>。</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关实例ID，目前我们支持的网关实例类型有，<br>专线网关实例ID，形如，<code>dcg-ltjahce6</code>；<br>Nat网关实例ID，形如，<code>nat-ltjahce6</code>；<br>VPN网关实例ID，形如，<code>vpn-ltjahce6</code>。</p>
     * @param GatewayId <p>网关实例ID，目前我们支持的网关实例类型有，<br>专线网关实例ID，形如，<code>dcg-ltjahce6</code>；<br>Nat网关实例ID，形如，<code>nat-ltjahce6</code>；<br>VPN网关实例ID，形如，<code>vpn-ltjahce6</code>。</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>流控带宽值。取值大于0，表示限流到指定的Mbps；取值等于0，表示完全限流；取值为-1，不限流。</p> 
     * @return Bandwidth <p>流控带宽值。取值大于0，表示限流到指定的Mbps；取值等于0，表示完全限流；取值为-1，不限流。</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>流控带宽值。取值大于0，表示限流到指定的Mbps；取值等于0，表示完全限流；取值为-1，不限流。</p>
     * @param Bandwidth <p>流控带宽值。取值大于0，表示限流到指定的Mbps；取值等于0，表示完全限流；取值为-1，不限流。</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>限流的云服务器内网IP。</p><p>参数格式：10.0.0.2</p> 
     * @return IpAddresses <p>限流的云服务器内网IP。</p><p>参数格式：10.0.0.2</p>
     */
    public String [] getIpAddresses() {
        return this.IpAddresses;
    }

    /**
     * Set <p>限流的云服务器内网IP。</p><p>参数格式：10.0.0.2</p>
     * @param IpAddresses <p>限流的云服务器内网IP。</p><p>参数格式：10.0.0.2</p>
     */
    public void setIpAddresses(String [] IpAddresses) {
        this.IpAddresses = IpAddresses;
    }

    /**
     * Get <p>限流方向，取值为In代表入向，Out代表出向。当前仅标准型Nat实例网关流控带宽方向可设置入向限流。</p> 
     * @return Direction <p>限流方向，取值为In代表入向，Out代表出向。当前仅标准型Nat实例网关流控带宽方向可设置入向限流。</p>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>限流方向，取值为In代表入向，Out代表出向。当前仅标准型Nat实例网关流控带宽方向可设置入向限流。</p>
     * @param Direction <p>限流方向，取值为In代表入向，Out代表出向。当前仅标准型Nat实例网关流控带宽方向可设置入向限流。</p>
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public ModifyGatewayFlowQosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGatewayFlowQosRequest(ModifyGatewayFlowQosRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.IpAddresses != null) {
            this.IpAddresses = new String[source.IpAddresses.length];
            for (int i = 0; i < source.IpAddresses.length; i++) {
                this.IpAddresses[i] = new String(source.IpAddresses[i]);
            }
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArraySimple(map, prefix + "IpAddresses.", this.IpAddresses);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

