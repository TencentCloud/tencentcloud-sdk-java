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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSAntiPly extends AbstractModel{

    /**
    * tcp协议封禁 on-开；off-关
    */
    @SerializedName("DropTcp")
    @Expose
    private String DropTcp;

    /**
    * udp协议封禁 on-开；off-关
    */
    @SerializedName("DropUdp")
    @Expose
    private String DropUdp;

    /**
    * icmp协议封禁 on-开；off-关
    */
    @SerializedName("DropIcmp")
    @Expose
    private String DropIcmp;

    /**
    * 其他协议封禁 on-开；off-关
    */
    @SerializedName("DropOther")
    @Expose
    private String DropOther;

    /**
    * 源每秒新建数限制  0-4294967295
    */
    @SerializedName("SourceCreateLimit")
    @Expose
    private Long SourceCreateLimit;

    /**
    * 源并发连接控制 0-4294967295
    */
    @SerializedName("SourceConnectLimit")
    @Expose
    private Long SourceConnectLimit;

    /**
    * 目的每秒新建数限制 0-4294967295
    */
    @SerializedName("DestinationCreateLimit")
    @Expose
    private Long DestinationCreateLimit;

    /**
    * 目的端口的并发连接控制 0-4294967295
    */
    @SerializedName("DestinationConnectLimit")
    @Expose
    private Long DestinationConnectLimit;

    /**
    * 异常连接数阈值  0-4294967295
    */
    @SerializedName("AbnormalConnectNum")
    @Expose
    private Long AbnormalConnectNum;

    /**
    * syn占比异常阈值 0-100
    */
    @SerializedName("AbnormalSynRatio")
    @Expose
    private Long AbnormalSynRatio;

    /**
    * syn个数异常阈值 0-65535
    */
    @SerializedName("AbnormalSynNum")
    @Expose
    private Long AbnormalSynNum;

    /**
    * 连接超时检测 0-65535
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * 空连接防护开启 0-1
    */
    @SerializedName("EmptyConnectProtect")
    @Expose
    private String EmptyConnectProtect;

    /**
     * Get tcp协议封禁 on-开；off-关 
     * @return DropTcp tcp协议封禁 on-开；off-关
     */
    public String getDropTcp() {
        return this.DropTcp;
    }

    /**
     * Set tcp协议封禁 on-开；off-关
     * @param DropTcp tcp协议封禁 on-开；off-关
     */
    public void setDropTcp(String DropTcp) {
        this.DropTcp = DropTcp;
    }

    /**
     * Get udp协议封禁 on-开；off-关 
     * @return DropUdp udp协议封禁 on-开；off-关
     */
    public String getDropUdp() {
        return this.DropUdp;
    }

    /**
     * Set udp协议封禁 on-开；off-关
     * @param DropUdp udp协议封禁 on-开；off-关
     */
    public void setDropUdp(String DropUdp) {
        this.DropUdp = DropUdp;
    }

    /**
     * Get icmp协议封禁 on-开；off-关 
     * @return DropIcmp icmp协议封禁 on-开；off-关
     */
    public String getDropIcmp() {
        return this.DropIcmp;
    }

    /**
     * Set icmp协议封禁 on-开；off-关
     * @param DropIcmp icmp协议封禁 on-开；off-关
     */
    public void setDropIcmp(String DropIcmp) {
        this.DropIcmp = DropIcmp;
    }

    /**
     * Get 其他协议封禁 on-开；off-关 
     * @return DropOther 其他协议封禁 on-开；off-关
     */
    public String getDropOther() {
        return this.DropOther;
    }

    /**
     * Set 其他协议封禁 on-开；off-关
     * @param DropOther 其他协议封禁 on-开；off-关
     */
    public void setDropOther(String DropOther) {
        this.DropOther = DropOther;
    }

    /**
     * Get 源每秒新建数限制  0-4294967295 
     * @return SourceCreateLimit 源每秒新建数限制  0-4294967295
     */
    public Long getSourceCreateLimit() {
        return this.SourceCreateLimit;
    }

    /**
     * Set 源每秒新建数限制  0-4294967295
     * @param SourceCreateLimit 源每秒新建数限制  0-4294967295
     */
    public void setSourceCreateLimit(Long SourceCreateLimit) {
        this.SourceCreateLimit = SourceCreateLimit;
    }

    /**
     * Get 源并发连接控制 0-4294967295 
     * @return SourceConnectLimit 源并发连接控制 0-4294967295
     */
    public Long getSourceConnectLimit() {
        return this.SourceConnectLimit;
    }

    /**
     * Set 源并发连接控制 0-4294967295
     * @param SourceConnectLimit 源并发连接控制 0-4294967295
     */
    public void setSourceConnectLimit(Long SourceConnectLimit) {
        this.SourceConnectLimit = SourceConnectLimit;
    }

    /**
     * Get 目的每秒新建数限制 0-4294967295 
     * @return DestinationCreateLimit 目的每秒新建数限制 0-4294967295
     */
    public Long getDestinationCreateLimit() {
        return this.DestinationCreateLimit;
    }

    /**
     * Set 目的每秒新建数限制 0-4294967295
     * @param DestinationCreateLimit 目的每秒新建数限制 0-4294967295
     */
    public void setDestinationCreateLimit(Long DestinationCreateLimit) {
        this.DestinationCreateLimit = DestinationCreateLimit;
    }

    /**
     * Get 目的端口的并发连接控制 0-4294967295 
     * @return DestinationConnectLimit 目的端口的并发连接控制 0-4294967295
     */
    public Long getDestinationConnectLimit() {
        return this.DestinationConnectLimit;
    }

    /**
     * Set 目的端口的并发连接控制 0-4294967295
     * @param DestinationConnectLimit 目的端口的并发连接控制 0-4294967295
     */
    public void setDestinationConnectLimit(Long DestinationConnectLimit) {
        this.DestinationConnectLimit = DestinationConnectLimit;
    }

    /**
     * Get 异常连接数阈值  0-4294967295 
     * @return AbnormalConnectNum 异常连接数阈值  0-4294967295
     */
    public Long getAbnormalConnectNum() {
        return this.AbnormalConnectNum;
    }

    /**
     * Set 异常连接数阈值  0-4294967295
     * @param AbnormalConnectNum 异常连接数阈值  0-4294967295
     */
    public void setAbnormalConnectNum(Long AbnormalConnectNum) {
        this.AbnormalConnectNum = AbnormalConnectNum;
    }

    /**
     * Get syn占比异常阈值 0-100 
     * @return AbnormalSynRatio syn占比异常阈值 0-100
     */
    public Long getAbnormalSynRatio() {
        return this.AbnormalSynRatio;
    }

    /**
     * Set syn占比异常阈值 0-100
     * @param AbnormalSynRatio syn占比异常阈值 0-100
     */
    public void setAbnormalSynRatio(Long AbnormalSynRatio) {
        this.AbnormalSynRatio = AbnormalSynRatio;
    }

    /**
     * Get syn个数异常阈值 0-65535 
     * @return AbnormalSynNum syn个数异常阈值 0-65535
     */
    public Long getAbnormalSynNum() {
        return this.AbnormalSynNum;
    }

    /**
     * Set syn个数异常阈值 0-65535
     * @param AbnormalSynNum syn个数异常阈值 0-65535
     */
    public void setAbnormalSynNum(Long AbnormalSynNum) {
        this.AbnormalSynNum = AbnormalSynNum;
    }

    /**
     * Get 连接超时检测 0-65535 
     * @return ConnectTimeout 连接超时检测 0-65535
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set 连接超时检测 0-65535
     * @param ConnectTimeout 连接超时检测 0-65535
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get 空连接防护开启 0-1 
     * @return EmptyConnectProtect 空连接防护开启 0-1
     */
    public String getEmptyConnectProtect() {
        return this.EmptyConnectProtect;
    }

    /**
     * Set 空连接防护开启 0-1
     * @param EmptyConnectProtect 空连接防护开启 0-1
     */
    public void setEmptyConnectProtect(String EmptyConnectProtect) {
        this.EmptyConnectProtect = EmptyConnectProtect;
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

    }
}

