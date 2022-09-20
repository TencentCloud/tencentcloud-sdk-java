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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSRule extends AbstractModel{

    /**
    * DDoS防护等级。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDoSStatusInfo")
    @Expose
    private DDoSStatusInfo DDoSStatusInfo;

    /**
    * DDoS地域封禁。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDoSGeoIp")
    @Expose
    private DDoSGeoIp DDoSGeoIp;

    /**
    * DDoS黑白名单。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDoSAllowBlock")
    @Expose
    private DDoSAllowBlock DDoSAllowBlock;

    /**
    * DDoS 协议封禁+连接防护。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDoSAntiPly")
    @Expose
    private DDoSAntiPly DDoSAntiPly;

    /**
    * DDoS特征过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDoSPacketFilter")
    @Expose
    private DDoSPacketFilter DDoSPacketFilter;

    /**
    * DDoS端口过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDoSAcl")
    @Expose
    private DDoSAcl DDoSAcl;

    /**
    * DDoS开关，取值有:
<li>on ：开启 ；</li>
<li>off ：关闭 。</li>如果为null，默认使用历史配置。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * UDP分片功能是否支持，取值有:
<li>on ：支持 ；</li>
<li>off ：不支持 。</li>仅出参字段，入参无需填写。
    */
    @SerializedName("UdpShardOpen")
    @Expose
    private String UdpShardOpen;

    /**
    * DDoS源站访问速率限制。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDoSSpeedLimit")
    @Expose
    private DDoSSpeedLimit DDoSSpeedLimit;

    /**
     * Get DDoS防护等级。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDoSStatusInfo DDoS防护等级。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSStatusInfo getDDoSStatusInfo() {
        return this.DDoSStatusInfo;
    }

    /**
     * Set DDoS防护等级。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDoSStatusInfo DDoS防护等级。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDoSStatusInfo(DDoSStatusInfo DDoSStatusInfo) {
        this.DDoSStatusInfo = DDoSStatusInfo;
    }

    /**
     * Get DDoS地域封禁。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDoSGeoIp DDoS地域封禁。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSGeoIp getDDoSGeoIp() {
        return this.DDoSGeoIp;
    }

    /**
     * Set DDoS地域封禁。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDoSGeoIp DDoS地域封禁。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDoSGeoIp(DDoSGeoIp DDoSGeoIp) {
        this.DDoSGeoIp = DDoSGeoIp;
    }

    /**
     * Get DDoS黑白名单。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDoSAllowBlock DDoS黑白名单。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSAllowBlock getDDoSAllowBlock() {
        return this.DDoSAllowBlock;
    }

    /**
     * Set DDoS黑白名单。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDoSAllowBlock DDoS黑白名单。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDoSAllowBlock(DDoSAllowBlock DDoSAllowBlock) {
        this.DDoSAllowBlock = DDoSAllowBlock;
    }

    /**
     * Get DDoS 协议封禁+连接防护。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDoSAntiPly DDoS 协议封禁+连接防护。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSAntiPly getDDoSAntiPly() {
        return this.DDoSAntiPly;
    }

    /**
     * Set DDoS 协议封禁+连接防护。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDoSAntiPly DDoS 协议封禁+连接防护。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDoSAntiPly(DDoSAntiPly DDoSAntiPly) {
        this.DDoSAntiPly = DDoSAntiPly;
    }

    /**
     * Get DDoS特征过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDoSPacketFilter DDoS特征过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSPacketFilter getDDoSPacketFilter() {
        return this.DDoSPacketFilter;
    }

    /**
     * Set DDoS特征过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDoSPacketFilter DDoS特征过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDoSPacketFilter(DDoSPacketFilter DDoSPacketFilter) {
        this.DDoSPacketFilter = DDoSPacketFilter;
    }

    /**
     * Get DDoS端口过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDoSAcl DDoS端口过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSAcl getDDoSAcl() {
        return this.DDoSAcl;
    }

    /**
     * Set DDoS端口过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDoSAcl DDoS端口过滤。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDoSAcl(DDoSAcl DDoSAcl) {
        this.DDoSAcl = DDoSAcl;
    }

    /**
     * Get DDoS开关，取值有:
<li>on ：开启 ；</li>
<li>off ：关闭 。</li>如果为null，默认使用历史配置。 
     * @return Switch DDoS开关，取值有:
<li>on ：开启 ；</li>
<li>off ：关闭 。</li>如果为null，默认使用历史配置。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set DDoS开关，取值有:
<li>on ：开启 ；</li>
<li>off ：关闭 。</li>如果为null，默认使用历史配置。
     * @param Switch DDoS开关，取值有:
<li>on ：开启 ；</li>
<li>off ：关闭 。</li>如果为null，默认使用历史配置。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get UDP分片功能是否支持，取值有:
<li>on ：支持 ；</li>
<li>off ：不支持 。</li>仅出参字段，入参无需填写。 
     * @return UdpShardOpen UDP分片功能是否支持，取值有:
<li>on ：支持 ；</li>
<li>off ：不支持 。</li>仅出参字段，入参无需填写。
     */
    public String getUdpShardOpen() {
        return this.UdpShardOpen;
    }

    /**
     * Set UDP分片功能是否支持，取值有:
<li>on ：支持 ；</li>
<li>off ：不支持 。</li>仅出参字段，入参无需填写。
     * @param UdpShardOpen UDP分片功能是否支持，取值有:
<li>on ：支持 ；</li>
<li>off ：不支持 。</li>仅出参字段，入参无需填写。
     */
    public void setUdpShardOpen(String UdpShardOpen) {
        this.UdpShardOpen = UdpShardOpen;
    }

    /**
     * Get DDoS源站访问速率限制。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDoSSpeedLimit DDoS源站访问速率限制。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSSpeedLimit getDDoSSpeedLimit() {
        return this.DDoSSpeedLimit;
    }

    /**
     * Set DDoS源站访问速率限制。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDoSSpeedLimit DDoS源站访问速率限制。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDoSSpeedLimit(DDoSSpeedLimit DDoSSpeedLimit) {
        this.DDoSSpeedLimit = DDoSSpeedLimit;
    }

    public DDoSRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSRule(DDoSRule source) {
        if (source.DDoSStatusInfo != null) {
            this.DDoSStatusInfo = new DDoSStatusInfo(source.DDoSStatusInfo);
        }
        if (source.DDoSGeoIp != null) {
            this.DDoSGeoIp = new DDoSGeoIp(source.DDoSGeoIp);
        }
        if (source.DDoSAllowBlock != null) {
            this.DDoSAllowBlock = new DDoSAllowBlock(source.DDoSAllowBlock);
        }
        if (source.DDoSAntiPly != null) {
            this.DDoSAntiPly = new DDoSAntiPly(source.DDoSAntiPly);
        }
        if (source.DDoSPacketFilter != null) {
            this.DDoSPacketFilter = new DDoSPacketFilter(source.DDoSPacketFilter);
        }
        if (source.DDoSAcl != null) {
            this.DDoSAcl = new DDoSAcl(source.DDoSAcl);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.UdpShardOpen != null) {
            this.UdpShardOpen = new String(source.UdpShardOpen);
        }
        if (source.DDoSSpeedLimit != null) {
            this.DDoSSpeedLimit = new DDoSSpeedLimit(source.DDoSSpeedLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DDoSStatusInfo.", this.DDoSStatusInfo);
        this.setParamObj(map, prefix + "DDoSGeoIp.", this.DDoSGeoIp);
        this.setParamObj(map, prefix + "DDoSAllowBlock.", this.DDoSAllowBlock);
        this.setParamObj(map, prefix + "DDoSAntiPly.", this.DDoSAntiPly);
        this.setParamObj(map, prefix + "DDoSPacketFilter.", this.DDoSPacketFilter);
        this.setParamObj(map, prefix + "DDoSAcl.", this.DDoSAcl);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "UdpShardOpen", this.UdpShardOpen);
        this.setParamObj(map, prefix + "DDoSSpeedLimit.", this.DDoSSpeedLimit);

    }
}

