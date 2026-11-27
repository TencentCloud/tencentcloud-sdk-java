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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectionPolicy extends AbstractModel {

    /**
    * <p>默认防护配置。</p>
    */
    @SerializedName("DefaultProtection")
    @Expose
    private DefaultProtectionConfig DefaultProtection;

    /**
    * <p>IP 黑白名单规则列表。</p>
    */
    @SerializedName("IPACLRules")
    @Expose
    private IPACLRules IPACLRules;

    /**
    * <p>端口过滤规则列表。</p>
    */
    @SerializedName("PortACLRules")
    @Expose
    private PortACLRules PortACLRules;

    /**
    * <p>限速规则列表。</p>
    */
    @SerializedName("SpeedLimitRules")
    @Expose
    private SpeedLimitRules SpeedLimitRules;

    /**
    * <p>包特征过滤规则列表。</p>
    */
    @SerializedName("PacketFilterRules")
    @Expose
    private PacketFilterRules PacketFilterRules;

    /**
    * <p>区域封禁配置。</p>
    */
    @SerializedName("GeoBlocking")
    @Expose
    private GeoBlockingConfig GeoBlocking;

    /**
    * <p>协议封禁配置。</p>
    */
    @SerializedName("ProtocolBlocking")
    @Expose
    private ProtocolBlockingConfig ProtocolBlocking;

    /**
    * <p>连接类攻击防护配置。</p>
    */
    @SerializedName("ConnectionProtection")
    @Expose
    private ConnectionProtectionConfig ConnectionProtection;

    /**
    * <p>流量签名配置。</p>
    */
    @SerializedName("TrafficSignature")
    @Expose
    private TrafficSignatureConfig TrafficSignature;

    /**
     * Get <p>默认防护配置。</p> 
     * @return DefaultProtection <p>默认防护配置。</p>
     */
    public DefaultProtectionConfig getDefaultProtection() {
        return this.DefaultProtection;
    }

    /**
     * Set <p>默认防护配置。</p>
     * @param DefaultProtection <p>默认防护配置。</p>
     */
    public void setDefaultProtection(DefaultProtectionConfig DefaultProtection) {
        this.DefaultProtection = DefaultProtection;
    }

    /**
     * Get <p>IP 黑白名单规则列表。</p> 
     * @return IPACLRules <p>IP 黑白名单规则列表。</p>
     */
    public IPACLRules getIPACLRules() {
        return this.IPACLRules;
    }

    /**
     * Set <p>IP 黑白名单规则列表。</p>
     * @param IPACLRules <p>IP 黑白名单规则列表。</p>
     */
    public void setIPACLRules(IPACLRules IPACLRules) {
        this.IPACLRules = IPACLRules;
    }

    /**
     * Get <p>端口过滤规则列表。</p> 
     * @return PortACLRules <p>端口过滤规则列表。</p>
     */
    public PortACLRules getPortACLRules() {
        return this.PortACLRules;
    }

    /**
     * Set <p>端口过滤规则列表。</p>
     * @param PortACLRules <p>端口过滤规则列表。</p>
     */
    public void setPortACLRules(PortACLRules PortACLRules) {
        this.PortACLRules = PortACLRules;
    }

    /**
     * Get <p>限速规则列表。</p> 
     * @return SpeedLimitRules <p>限速规则列表。</p>
     */
    public SpeedLimitRules getSpeedLimitRules() {
        return this.SpeedLimitRules;
    }

    /**
     * Set <p>限速规则列表。</p>
     * @param SpeedLimitRules <p>限速规则列表。</p>
     */
    public void setSpeedLimitRules(SpeedLimitRules SpeedLimitRules) {
        this.SpeedLimitRules = SpeedLimitRules;
    }

    /**
     * Get <p>包特征过滤规则列表。</p> 
     * @return PacketFilterRules <p>包特征过滤规则列表。</p>
     */
    public PacketFilterRules getPacketFilterRules() {
        return this.PacketFilterRules;
    }

    /**
     * Set <p>包特征过滤规则列表。</p>
     * @param PacketFilterRules <p>包特征过滤规则列表。</p>
     */
    public void setPacketFilterRules(PacketFilterRules PacketFilterRules) {
        this.PacketFilterRules = PacketFilterRules;
    }

    /**
     * Get <p>区域封禁配置。</p> 
     * @return GeoBlocking <p>区域封禁配置。</p>
     */
    public GeoBlockingConfig getGeoBlocking() {
        return this.GeoBlocking;
    }

    /**
     * Set <p>区域封禁配置。</p>
     * @param GeoBlocking <p>区域封禁配置。</p>
     */
    public void setGeoBlocking(GeoBlockingConfig GeoBlocking) {
        this.GeoBlocking = GeoBlocking;
    }

    /**
     * Get <p>协议封禁配置。</p> 
     * @return ProtocolBlocking <p>协议封禁配置。</p>
     */
    public ProtocolBlockingConfig getProtocolBlocking() {
        return this.ProtocolBlocking;
    }

    /**
     * Set <p>协议封禁配置。</p>
     * @param ProtocolBlocking <p>协议封禁配置。</p>
     */
    public void setProtocolBlocking(ProtocolBlockingConfig ProtocolBlocking) {
        this.ProtocolBlocking = ProtocolBlocking;
    }

    /**
     * Get <p>连接类攻击防护配置。</p> 
     * @return ConnectionProtection <p>连接类攻击防护配置。</p>
     */
    public ConnectionProtectionConfig getConnectionProtection() {
        return this.ConnectionProtection;
    }

    /**
     * Set <p>连接类攻击防护配置。</p>
     * @param ConnectionProtection <p>连接类攻击防护配置。</p>
     */
    public void setConnectionProtection(ConnectionProtectionConfig ConnectionProtection) {
        this.ConnectionProtection = ConnectionProtection;
    }

    /**
     * Get <p>流量签名配置。</p> 
     * @return TrafficSignature <p>流量签名配置。</p>
     */
    public TrafficSignatureConfig getTrafficSignature() {
        return this.TrafficSignature;
    }

    /**
     * Set <p>流量签名配置。</p>
     * @param TrafficSignature <p>流量签名配置。</p>
     */
    public void setTrafficSignature(TrafficSignatureConfig TrafficSignature) {
        this.TrafficSignature = TrafficSignature;
    }

    public ProtectionPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectionPolicy(ProtectionPolicy source) {
        if (source.DefaultProtection != null) {
            this.DefaultProtection = new DefaultProtectionConfig(source.DefaultProtection);
        }
        if (source.IPACLRules != null) {
            this.IPACLRules = new IPACLRules(source.IPACLRules);
        }
        if (source.PortACLRules != null) {
            this.PortACLRules = new PortACLRules(source.PortACLRules);
        }
        if (source.SpeedLimitRules != null) {
            this.SpeedLimitRules = new SpeedLimitRules(source.SpeedLimitRules);
        }
        if (source.PacketFilterRules != null) {
            this.PacketFilterRules = new PacketFilterRules(source.PacketFilterRules);
        }
        if (source.GeoBlocking != null) {
            this.GeoBlocking = new GeoBlockingConfig(source.GeoBlocking);
        }
        if (source.ProtocolBlocking != null) {
            this.ProtocolBlocking = new ProtocolBlockingConfig(source.ProtocolBlocking);
        }
        if (source.ConnectionProtection != null) {
            this.ConnectionProtection = new ConnectionProtectionConfig(source.ConnectionProtection);
        }
        if (source.TrafficSignature != null) {
            this.TrafficSignature = new TrafficSignatureConfig(source.TrafficSignature);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DefaultProtection.", this.DefaultProtection);
        this.setParamObj(map, prefix + "IPACLRules.", this.IPACLRules);
        this.setParamObj(map, prefix + "PortACLRules.", this.PortACLRules);
        this.setParamObj(map, prefix + "SpeedLimitRules.", this.SpeedLimitRules);
        this.setParamObj(map, prefix + "PacketFilterRules.", this.PacketFilterRules);
        this.setParamObj(map, prefix + "GeoBlocking.", this.GeoBlocking);
        this.setParamObj(map, prefix + "ProtocolBlocking.", this.ProtocolBlocking);
        this.setParamObj(map, prefix + "ConnectionProtection.", this.ConnectionProtection);
        this.setParamObj(map, prefix + "TrafficSignature.", this.TrafficSignature);

    }
}

