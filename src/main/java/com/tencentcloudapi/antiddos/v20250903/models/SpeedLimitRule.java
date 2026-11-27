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

public class SpeedLimitRule extends AbstractModel {

    /**
    * <p>IP 协议号。取值参考 <a href="https://en.wikipedia.org/wiki/List_of_IP_protocol_numbers">IP 协议号列表</a> 。</p><p>参数格式：0-255 范围的数字。支持单个 IP 协议号和 IP 协议号范围。</p><p><code>0-255</code> 表示全部协议。</p>
    */
    @SerializedName("IPProtocolNumbers")
    @Expose
    private String [] IPProtocolNumbers;

    /**
    * <p>目的端口范围列表。</p>
    */
    @SerializedName("DestinationPortRanges")
    @Expose
    private PortRange [] DestinationPortRanges;

    /**
    * <p>限速统计维度。</p><p>枚举值：</p><ul><li>destination_ip： 按目的 IP 维度统计。</li><li>source_destination_ip： 按源 IP + 目的 IP 维度统计。</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>流量带宽限制。</p><p>取值范围：[0, 4294967295]</p><p>单位：bps</p><p>为 0 时表示不限制。BandwidthLimit 和 PacketRateLimit 至少需要设置一个大于 0 的值。</p>
    */
    @SerializedName("BandwidthLimit")
    @Expose
    private Long BandwidthLimit;

    /**
    * <p>包速率限制。</p><p>取值范围：[0, 4294967295]</p><p>单位：pps</p><p>为 0 时表示不限制。BandwidthLimit 和 PacketRateLimit 至少需要设置一个大于 0 的值。</p>
    */
    @SerializedName("PacketRateLimit")
    @Expose
    private Long PacketRateLimit;

    /**
     * Get <p>IP 协议号。取值参考 <a href="https://en.wikipedia.org/wiki/List_of_IP_protocol_numbers">IP 协议号列表</a> 。</p><p>参数格式：0-255 范围的数字。支持单个 IP 协议号和 IP 协议号范围。</p><p><code>0-255</code> 表示全部协议。</p> 
     * @return IPProtocolNumbers <p>IP 协议号。取值参考 <a href="https://en.wikipedia.org/wiki/List_of_IP_protocol_numbers">IP 协议号列表</a> 。</p><p>参数格式：0-255 范围的数字。支持单个 IP 协议号和 IP 协议号范围。</p><p><code>0-255</code> 表示全部协议。</p>
     */
    public String [] getIPProtocolNumbers() {
        return this.IPProtocolNumbers;
    }

    /**
     * Set <p>IP 协议号。取值参考 <a href="https://en.wikipedia.org/wiki/List_of_IP_protocol_numbers">IP 协议号列表</a> 。</p><p>参数格式：0-255 范围的数字。支持单个 IP 协议号和 IP 协议号范围。</p><p><code>0-255</code> 表示全部协议。</p>
     * @param IPProtocolNumbers <p>IP 协议号。取值参考 <a href="https://en.wikipedia.org/wiki/List_of_IP_protocol_numbers">IP 协议号列表</a> 。</p><p>参数格式：0-255 范围的数字。支持单个 IP 协议号和 IP 协议号范围。</p><p><code>0-255</code> 表示全部协议。</p>
     */
    public void setIPProtocolNumbers(String [] IPProtocolNumbers) {
        this.IPProtocolNumbers = IPProtocolNumbers;
    }

    /**
     * Get <p>目的端口范围列表。</p> 
     * @return DestinationPortRanges <p>目的端口范围列表。</p>
     */
    public PortRange [] getDestinationPortRanges() {
        return this.DestinationPortRanges;
    }

    /**
     * Set <p>目的端口范围列表。</p>
     * @param DestinationPortRanges <p>目的端口范围列表。</p>
     */
    public void setDestinationPortRanges(PortRange [] DestinationPortRanges) {
        this.DestinationPortRanges = DestinationPortRanges;
    }

    /**
     * Get <p>限速统计维度。</p><p>枚举值：</p><ul><li>destination_ip： 按目的 IP 维度统计。</li><li>source_destination_ip： 按源 IP + 目的 IP 维度统计。</li></ul> 
     * @return Mode <p>限速统计维度。</p><p>枚举值：</p><ul><li>destination_ip： 按目的 IP 维度统计。</li><li>source_destination_ip： 按源 IP + 目的 IP 维度统计。</li></ul>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>限速统计维度。</p><p>枚举值：</p><ul><li>destination_ip： 按目的 IP 维度统计。</li><li>source_destination_ip： 按源 IP + 目的 IP 维度统计。</li></ul>
     * @param Mode <p>限速统计维度。</p><p>枚举值：</p><ul><li>destination_ip： 按目的 IP 维度统计。</li><li>source_destination_ip： 按源 IP + 目的 IP 维度统计。</li></ul>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>流量带宽限制。</p><p>取值范围：[0, 4294967295]</p><p>单位：bps</p><p>为 0 时表示不限制。BandwidthLimit 和 PacketRateLimit 至少需要设置一个大于 0 的值。</p> 
     * @return BandwidthLimit <p>流量带宽限制。</p><p>取值范围：[0, 4294967295]</p><p>单位：bps</p><p>为 0 时表示不限制。BandwidthLimit 和 PacketRateLimit 至少需要设置一个大于 0 的值。</p>
     */
    public Long getBandwidthLimit() {
        return this.BandwidthLimit;
    }

    /**
     * Set <p>流量带宽限制。</p><p>取值范围：[0, 4294967295]</p><p>单位：bps</p><p>为 0 时表示不限制。BandwidthLimit 和 PacketRateLimit 至少需要设置一个大于 0 的值。</p>
     * @param BandwidthLimit <p>流量带宽限制。</p><p>取值范围：[0, 4294967295]</p><p>单位：bps</p><p>为 0 时表示不限制。BandwidthLimit 和 PacketRateLimit 至少需要设置一个大于 0 的值。</p>
     */
    public void setBandwidthLimit(Long BandwidthLimit) {
        this.BandwidthLimit = BandwidthLimit;
    }

    /**
     * Get <p>包速率限制。</p><p>取值范围：[0, 4294967295]</p><p>单位：pps</p><p>为 0 时表示不限制。BandwidthLimit 和 PacketRateLimit 至少需要设置一个大于 0 的值。</p> 
     * @return PacketRateLimit <p>包速率限制。</p><p>取值范围：[0, 4294967295]</p><p>单位：pps</p><p>为 0 时表示不限制。BandwidthLimit 和 PacketRateLimit 至少需要设置一个大于 0 的值。</p>
     */
    public Long getPacketRateLimit() {
        return this.PacketRateLimit;
    }

    /**
     * Set <p>包速率限制。</p><p>取值范围：[0, 4294967295]</p><p>单位：pps</p><p>为 0 时表示不限制。BandwidthLimit 和 PacketRateLimit 至少需要设置一个大于 0 的值。</p>
     * @param PacketRateLimit <p>包速率限制。</p><p>取值范围：[0, 4294967295]</p><p>单位：pps</p><p>为 0 时表示不限制。BandwidthLimit 和 PacketRateLimit 至少需要设置一个大于 0 的值。</p>
     */
    public void setPacketRateLimit(Long PacketRateLimit) {
        this.PacketRateLimit = PacketRateLimit;
    }

    public SpeedLimitRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedLimitRule(SpeedLimitRule source) {
        if (source.IPProtocolNumbers != null) {
            this.IPProtocolNumbers = new String[source.IPProtocolNumbers.length];
            for (int i = 0; i < source.IPProtocolNumbers.length; i++) {
                this.IPProtocolNumbers[i] = new String(source.IPProtocolNumbers[i]);
            }
        }
        if (source.DestinationPortRanges != null) {
            this.DestinationPortRanges = new PortRange[source.DestinationPortRanges.length];
            for (int i = 0; i < source.DestinationPortRanges.length; i++) {
                this.DestinationPortRanges[i] = new PortRange(source.DestinationPortRanges[i]);
            }
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.BandwidthLimit != null) {
            this.BandwidthLimit = new Long(source.BandwidthLimit);
        }
        if (source.PacketRateLimit != null) {
            this.PacketRateLimit = new Long(source.PacketRateLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IPProtocolNumbers.", this.IPProtocolNumbers);
        this.setParamArrayObj(map, prefix + "DestinationPortRanges.", this.DestinationPortRanges);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "BandwidthLimit", this.BandwidthLimit);
        this.setParamSimple(map, prefix + "PacketRateLimit", this.PacketRateLimit);

    }
}

