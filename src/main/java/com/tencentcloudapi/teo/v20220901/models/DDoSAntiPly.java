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

public class DDoSAntiPly extends AbstractModel{

    /**
    * tcp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
    */
    @SerializedName("DropTcp")
    @Expose
    private String DropTcp;

    /**
    * udp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
    */
    @SerializedName("DropUdp")
    @Expose
    private String DropUdp;

    /**
    * icmp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
    */
    @SerializedName("DropIcmp")
    @Expose
    private String DropIcmp;

    /**
    * 其他协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
    */
    @SerializedName("DropOther")
    @Expose
    private String DropOther;

    /**
    * 源站每秒新连接限速，取值范围0-4294967295。
    */
    @SerializedName("SourceCreateLimit")
    @Expose
    private Long SourceCreateLimit;

    /**
    * 源站并发连接控制，取值范围0-4294967295。
    */
    @SerializedName("SourceConnectLimit")
    @Expose
    private Long SourceConnectLimit;

    /**
    * 目的端口每秒新连接限速，取值范围0-4294967295。
    */
    @SerializedName("DestinationCreateLimit")
    @Expose
    private Long DestinationCreateLimit;

    /**
    * 目的端口并发连接控制，取值范围0-4294967295。
    */
    @SerializedName("DestinationConnectLimit")
    @Expose
    private Long DestinationConnectLimit;

    /**
    * 每秒异常连接数阈值，取值范围0-4294967295。
    */
    @SerializedName("AbnormalConnectNum")
    @Expose
    private Long AbnormalConnectNum;

    /**
    * 异常syn报文百分比阈值，取值范围0-100。
    */
    @SerializedName("AbnormalSynRatio")
    @Expose
    private Long AbnormalSynRatio;

    /**
    * 异常syn报文阈值，取值范围0-65535。
    */
    @SerializedName("AbnormalSynNum")
    @Expose
    private Long AbnormalSynNum;

    /**
    * 每秒连接超时检测，取值范围0-65535。
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * 空连接防护开启，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
    */
    @SerializedName("EmptyConnectProtect")
    @Expose
    private String EmptyConnectProtect;

    /**
    * UDP分片开关，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
    */
    @SerializedName("UdpShard")
    @Expose
    private String UdpShard;

    /**
     * Get tcp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li> 
     * @return DropTcp tcp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     */
    public String getDropTcp() {
        return this.DropTcp;
    }

    /**
     * Set tcp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     * @param DropTcp tcp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     */
    public void setDropTcp(String DropTcp) {
        this.DropTcp = DropTcp;
    }

    /**
     * Get udp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li> 
     * @return DropUdp udp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     */
    public String getDropUdp() {
        return this.DropUdp;
    }

    /**
     * Set udp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     * @param DropUdp udp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     */
    public void setDropUdp(String DropUdp) {
        this.DropUdp = DropUdp;
    }

    /**
     * Get icmp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li> 
     * @return DropIcmp icmp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     */
    public String getDropIcmp() {
        return this.DropIcmp;
    }

    /**
     * Set icmp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     * @param DropIcmp icmp协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     */
    public void setDropIcmp(String DropIcmp) {
        this.DropIcmp = DropIcmp;
    }

    /**
     * Get 其他协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li> 
     * @return DropOther 其他协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     */
    public String getDropOther() {
        return this.DropOther;
    }

    /**
     * Set 其他协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     * @param DropOther 其他协议封禁，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     */
    public void setDropOther(String DropOther) {
        this.DropOther = DropOther;
    }

    /**
     * Get 源站每秒新连接限速，取值范围0-4294967295。 
     * @return SourceCreateLimit 源站每秒新连接限速，取值范围0-4294967295。
     */
    public Long getSourceCreateLimit() {
        return this.SourceCreateLimit;
    }

    /**
     * Set 源站每秒新连接限速，取值范围0-4294967295。
     * @param SourceCreateLimit 源站每秒新连接限速，取值范围0-4294967295。
     */
    public void setSourceCreateLimit(Long SourceCreateLimit) {
        this.SourceCreateLimit = SourceCreateLimit;
    }

    /**
     * Get 源站并发连接控制，取值范围0-4294967295。 
     * @return SourceConnectLimit 源站并发连接控制，取值范围0-4294967295。
     */
    public Long getSourceConnectLimit() {
        return this.SourceConnectLimit;
    }

    /**
     * Set 源站并发连接控制，取值范围0-4294967295。
     * @param SourceConnectLimit 源站并发连接控制，取值范围0-4294967295。
     */
    public void setSourceConnectLimit(Long SourceConnectLimit) {
        this.SourceConnectLimit = SourceConnectLimit;
    }

    /**
     * Get 目的端口每秒新连接限速，取值范围0-4294967295。 
     * @return DestinationCreateLimit 目的端口每秒新连接限速，取值范围0-4294967295。
     */
    public Long getDestinationCreateLimit() {
        return this.DestinationCreateLimit;
    }

    /**
     * Set 目的端口每秒新连接限速，取值范围0-4294967295。
     * @param DestinationCreateLimit 目的端口每秒新连接限速，取值范围0-4294967295。
     */
    public void setDestinationCreateLimit(Long DestinationCreateLimit) {
        this.DestinationCreateLimit = DestinationCreateLimit;
    }

    /**
     * Get 目的端口并发连接控制，取值范围0-4294967295。 
     * @return DestinationConnectLimit 目的端口并发连接控制，取值范围0-4294967295。
     */
    public Long getDestinationConnectLimit() {
        return this.DestinationConnectLimit;
    }

    /**
     * Set 目的端口并发连接控制，取值范围0-4294967295。
     * @param DestinationConnectLimit 目的端口并发连接控制，取值范围0-4294967295。
     */
    public void setDestinationConnectLimit(Long DestinationConnectLimit) {
        this.DestinationConnectLimit = DestinationConnectLimit;
    }

    /**
     * Get 每秒异常连接数阈值，取值范围0-4294967295。 
     * @return AbnormalConnectNum 每秒异常连接数阈值，取值范围0-4294967295。
     */
    public Long getAbnormalConnectNum() {
        return this.AbnormalConnectNum;
    }

    /**
     * Set 每秒异常连接数阈值，取值范围0-4294967295。
     * @param AbnormalConnectNum 每秒异常连接数阈值，取值范围0-4294967295。
     */
    public void setAbnormalConnectNum(Long AbnormalConnectNum) {
        this.AbnormalConnectNum = AbnormalConnectNum;
    }

    /**
     * Get 异常syn报文百分比阈值，取值范围0-100。 
     * @return AbnormalSynRatio 异常syn报文百分比阈值，取值范围0-100。
     */
    public Long getAbnormalSynRatio() {
        return this.AbnormalSynRatio;
    }

    /**
     * Set 异常syn报文百分比阈值，取值范围0-100。
     * @param AbnormalSynRatio 异常syn报文百分比阈值，取值范围0-100。
     */
    public void setAbnormalSynRatio(Long AbnormalSynRatio) {
        this.AbnormalSynRatio = AbnormalSynRatio;
    }

    /**
     * Get 异常syn报文阈值，取值范围0-65535。 
     * @return AbnormalSynNum 异常syn报文阈值，取值范围0-65535。
     */
    public Long getAbnormalSynNum() {
        return this.AbnormalSynNum;
    }

    /**
     * Set 异常syn报文阈值，取值范围0-65535。
     * @param AbnormalSynNum 异常syn报文阈值，取值范围0-65535。
     */
    public void setAbnormalSynNum(Long AbnormalSynNum) {
        this.AbnormalSynNum = AbnormalSynNum;
    }

    /**
     * Get 每秒连接超时检测，取值范围0-65535。 
     * @return ConnectTimeout 每秒连接超时检测，取值范围0-65535。
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set 每秒连接超时检测，取值范围0-65535。
     * @param ConnectTimeout 每秒连接超时检测，取值范围0-65535。
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get 空连接防护开启，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li> 
     * @return EmptyConnectProtect 空连接防护开启，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     */
    public String getEmptyConnectProtect() {
        return this.EmptyConnectProtect;
    }

    /**
     * Set 空连接防护开启，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     * @param EmptyConnectProtect 空连接防护开启，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     */
    public void setEmptyConnectProtect(String EmptyConnectProtect) {
        this.EmptyConnectProtect = EmptyConnectProtect;
    }

    /**
     * Get UDP分片开关，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li> 
     * @return UdpShard UDP分片开关，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     */
    public String getUdpShard() {
        return this.UdpShard;
    }

    /**
     * Set UDP分片开关，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     * @param UdpShard UDP分片开关，取值有：
<li>off ：关闭 ；</li>
<li>on ：开启 。</li>
     */
    public void setUdpShard(String UdpShard) {
        this.UdpShard = UdpShard;
    }

    public DDoSAntiPly() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAntiPly(DDoSAntiPly source) {
        if (source.DropTcp != null) {
            this.DropTcp = new String(source.DropTcp);
        }
        if (source.DropUdp != null) {
            this.DropUdp = new String(source.DropUdp);
        }
        if (source.DropIcmp != null) {
            this.DropIcmp = new String(source.DropIcmp);
        }
        if (source.DropOther != null) {
            this.DropOther = new String(source.DropOther);
        }
        if (source.SourceCreateLimit != null) {
            this.SourceCreateLimit = new Long(source.SourceCreateLimit);
        }
        if (source.SourceConnectLimit != null) {
            this.SourceConnectLimit = new Long(source.SourceConnectLimit);
        }
        if (source.DestinationCreateLimit != null) {
            this.DestinationCreateLimit = new Long(source.DestinationCreateLimit);
        }
        if (source.DestinationConnectLimit != null) {
            this.DestinationConnectLimit = new Long(source.DestinationConnectLimit);
        }
        if (source.AbnormalConnectNum != null) {
            this.AbnormalConnectNum = new Long(source.AbnormalConnectNum);
        }
        if (source.AbnormalSynRatio != null) {
            this.AbnormalSynRatio = new Long(source.AbnormalSynRatio);
        }
        if (source.AbnormalSynNum != null) {
            this.AbnormalSynNum = new Long(source.AbnormalSynNum);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.EmptyConnectProtect != null) {
            this.EmptyConnectProtect = new String(source.EmptyConnectProtect);
        }
        if (source.UdpShard != null) {
            this.UdpShard = new String(source.UdpShard);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DropTcp", this.DropTcp);
        this.setParamSimple(map, prefix + "DropUdp", this.DropUdp);
        this.setParamSimple(map, prefix + "DropIcmp", this.DropIcmp);
        this.setParamSimple(map, prefix + "DropOther", this.DropOther);
        this.setParamSimple(map, prefix + "SourceCreateLimit", this.SourceCreateLimit);
        this.setParamSimple(map, prefix + "SourceConnectLimit", this.SourceConnectLimit);
        this.setParamSimple(map, prefix + "DestinationCreateLimit", this.DestinationCreateLimit);
        this.setParamSimple(map, prefix + "DestinationConnectLimit", this.DestinationConnectLimit);
        this.setParamSimple(map, prefix + "AbnormalConnectNum", this.AbnormalConnectNum);
        this.setParamSimple(map, prefix + "AbnormalSynRatio", this.AbnormalSynRatio);
        this.setParamSimple(map, prefix + "AbnormalSynNum", this.AbnormalSynNum);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "EmptyConnectProtect", this.EmptyConnectProtect);
        this.setParamSimple(map, prefix + "UdpShard", this.UdpShard);

    }
}

