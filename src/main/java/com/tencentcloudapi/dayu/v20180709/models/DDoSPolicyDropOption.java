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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSPolicyDropOption extends AbstractModel{

    /**
    * 禁用TCP协议，取值范围[0,1]
    */
    @SerializedName("DropTcp")
    @Expose
    private Long DropTcp;

    /**
    * 禁用UDP协议，取值范围[0,1]
    */
    @SerializedName("DropUdp")
    @Expose
    private Long DropUdp;

    /**
    * 禁用ICMP协议，取值范围[0,1]
    */
    @SerializedName("DropIcmp")
    @Expose
    private Long DropIcmp;

    /**
    * 禁用其他协议，取值范围[0,1]
    */
    @SerializedName("DropOther")
    @Expose
    private Long DropOther;

    /**
    * 拒绝海外流量，取值范围[0,1]
    */
    @SerializedName("DropAbroad")
    @Expose
    private Long DropAbroad;

    /**
    * 空连接防护，取值范围[0,1]
    */
    @SerializedName("CheckSyncConn")
    @Expose
    private Long CheckSyncConn;

    /**
    * 基于来源IP及目的IP的新建连接抑制，取值范围[0,4294967295]
    */
    @SerializedName("SdNewLimit")
    @Expose
    private Long SdNewLimit;

    /**
    * 基于目的IP的新建连接抑制，取值范围[0,4294967295]
    */
    @SerializedName("DstNewLimit")
    @Expose
    private Long DstNewLimit;

    /**
    * 基于来源IP及目的IP的并发连接抑制，取值范围[0,4294967295]
    */
    @SerializedName("SdConnLimit")
    @Expose
    private Long SdConnLimit;

    /**
    * 基于目的IP的并发连接抑制，取值范围[0,4294967295]
    */
    @SerializedName("DstConnLimit")
    @Expose
    private Long DstConnLimit;

    /**
    * 基于连接抑制触发阈值，取值范围[0,4294967295]
    */
    @SerializedName("BadConnThreshold")
    @Expose
    private Long BadConnThreshold;

    /**
    * 异常连接检测条件，空连接防护开关，，取值范围[0,1]
    */
    @SerializedName("NullConnEnable")
    @Expose
    private Long NullConnEnable;

    /**
    * 异常连接检测条件，连接超时，，取值范围[0,65535]
    */
    @SerializedName("ConnTimeout")
    @Expose
    private Long ConnTimeout;

    /**
    * 异常连接检测条件，syn占比ack百分比，，取值范围[0,100]
    */
    @SerializedName("SynRate")
    @Expose
    private Long SynRate;

    /**
    * 异常连接检测条件，syn阈值，取值范围[0,100]
    */
    @SerializedName("SynLimit")
    @Expose
    private Long SynLimit;

    /**
    * tcp限速，取值范围[0,4294967295]
    */
    @SerializedName("DTcpMbpsLimit")
    @Expose
    private Long DTcpMbpsLimit;

    /**
    * udp限速，取值范围[0,4294967295]
    */
    @SerializedName("DUdpMbpsLimit")
    @Expose
    private Long DUdpMbpsLimit;

    /**
    * icmp限速，取值范围[0,4294967295]
    */
    @SerializedName("DIcmpMbpsLimit")
    @Expose
    private Long DIcmpMbpsLimit;

    /**
    * other协议限速，取值范围[0,4294967295]
    */
    @SerializedName("DOtherMbpsLimit")
    @Expose
    private Long DOtherMbpsLimit;

    /**
     * Get 禁用TCP协议，取值范围[0,1] 
     * @return DropTcp 禁用TCP协议，取值范围[0,1]
     */
    public Long getDropTcp() {
        return this.DropTcp;
    }

    /**
     * Set 禁用TCP协议，取值范围[0,1]
     * @param DropTcp 禁用TCP协议，取值范围[0,1]
     */
    public void setDropTcp(Long DropTcp) {
        this.DropTcp = DropTcp;
    }

    /**
     * Get 禁用UDP协议，取值范围[0,1] 
     * @return DropUdp 禁用UDP协议，取值范围[0,1]
     */
    public Long getDropUdp() {
        return this.DropUdp;
    }

    /**
     * Set 禁用UDP协议，取值范围[0,1]
     * @param DropUdp 禁用UDP协议，取值范围[0,1]
     */
    public void setDropUdp(Long DropUdp) {
        this.DropUdp = DropUdp;
    }

    /**
     * Get 禁用ICMP协议，取值范围[0,1] 
     * @return DropIcmp 禁用ICMP协议，取值范围[0,1]
     */
    public Long getDropIcmp() {
        return this.DropIcmp;
    }

    /**
     * Set 禁用ICMP协议，取值范围[0,1]
     * @param DropIcmp 禁用ICMP协议，取值范围[0,1]
     */
    public void setDropIcmp(Long DropIcmp) {
        this.DropIcmp = DropIcmp;
    }

    /**
     * Get 禁用其他协议，取值范围[0,1] 
     * @return DropOther 禁用其他协议，取值范围[0,1]
     */
    public Long getDropOther() {
        return this.DropOther;
    }

    /**
     * Set 禁用其他协议，取值范围[0,1]
     * @param DropOther 禁用其他协议，取值范围[0,1]
     */
    public void setDropOther(Long DropOther) {
        this.DropOther = DropOther;
    }

    /**
     * Get 拒绝海外流量，取值范围[0,1] 
     * @return DropAbroad 拒绝海外流量，取值范围[0,1]
     */
    public Long getDropAbroad() {
        return this.DropAbroad;
    }

    /**
     * Set 拒绝海外流量，取值范围[0,1]
     * @param DropAbroad 拒绝海外流量，取值范围[0,1]
     */
    public void setDropAbroad(Long DropAbroad) {
        this.DropAbroad = DropAbroad;
    }

    /**
     * Get 空连接防护，取值范围[0,1] 
     * @return CheckSyncConn 空连接防护，取值范围[0,1]
     */
    public Long getCheckSyncConn() {
        return this.CheckSyncConn;
    }

    /**
     * Set 空连接防护，取值范围[0,1]
     * @param CheckSyncConn 空连接防护，取值范围[0,1]
     */
    public void setCheckSyncConn(Long CheckSyncConn) {
        this.CheckSyncConn = CheckSyncConn;
    }

    /**
     * Get 基于来源IP及目的IP的新建连接抑制，取值范围[0,4294967295] 
     * @return SdNewLimit 基于来源IP及目的IP的新建连接抑制，取值范围[0,4294967295]
     */
    public Long getSdNewLimit() {
        return this.SdNewLimit;
    }

    /**
     * Set 基于来源IP及目的IP的新建连接抑制，取值范围[0,4294967295]
     * @param SdNewLimit 基于来源IP及目的IP的新建连接抑制，取值范围[0,4294967295]
     */
    public void setSdNewLimit(Long SdNewLimit) {
        this.SdNewLimit = SdNewLimit;
    }

    /**
     * Get 基于目的IP的新建连接抑制，取值范围[0,4294967295] 
     * @return DstNewLimit 基于目的IP的新建连接抑制，取值范围[0,4294967295]
     */
    public Long getDstNewLimit() {
        return this.DstNewLimit;
    }

    /**
     * Set 基于目的IP的新建连接抑制，取值范围[0,4294967295]
     * @param DstNewLimit 基于目的IP的新建连接抑制，取值范围[0,4294967295]
     */
    public void setDstNewLimit(Long DstNewLimit) {
        this.DstNewLimit = DstNewLimit;
    }

    /**
     * Get 基于来源IP及目的IP的并发连接抑制，取值范围[0,4294967295] 
     * @return SdConnLimit 基于来源IP及目的IP的并发连接抑制，取值范围[0,4294967295]
     */
    public Long getSdConnLimit() {
        return this.SdConnLimit;
    }

    /**
     * Set 基于来源IP及目的IP的并发连接抑制，取值范围[0,4294967295]
     * @param SdConnLimit 基于来源IP及目的IP的并发连接抑制，取值范围[0,4294967295]
     */
    public void setSdConnLimit(Long SdConnLimit) {
        this.SdConnLimit = SdConnLimit;
    }

    /**
     * Get 基于目的IP的并发连接抑制，取值范围[0,4294967295] 
     * @return DstConnLimit 基于目的IP的并发连接抑制，取值范围[0,4294967295]
     */
    public Long getDstConnLimit() {
        return this.DstConnLimit;
    }

    /**
     * Set 基于目的IP的并发连接抑制，取值范围[0,4294967295]
     * @param DstConnLimit 基于目的IP的并发连接抑制，取值范围[0,4294967295]
     */
    public void setDstConnLimit(Long DstConnLimit) {
        this.DstConnLimit = DstConnLimit;
    }

    /**
     * Get 基于连接抑制触发阈值，取值范围[0,4294967295] 
     * @return BadConnThreshold 基于连接抑制触发阈值，取值范围[0,4294967295]
     */
    public Long getBadConnThreshold() {
        return this.BadConnThreshold;
    }

    /**
     * Set 基于连接抑制触发阈值，取值范围[0,4294967295]
     * @param BadConnThreshold 基于连接抑制触发阈值，取值范围[0,4294967295]
     */
    public void setBadConnThreshold(Long BadConnThreshold) {
        this.BadConnThreshold = BadConnThreshold;
    }

    /**
     * Get 异常连接检测条件，空连接防护开关，，取值范围[0,1] 
     * @return NullConnEnable 异常连接检测条件，空连接防护开关，，取值范围[0,1]
     */
    public Long getNullConnEnable() {
        return this.NullConnEnable;
    }

    /**
     * Set 异常连接检测条件，空连接防护开关，，取值范围[0,1]
     * @param NullConnEnable 异常连接检测条件，空连接防护开关，，取值范围[0,1]
     */
    public void setNullConnEnable(Long NullConnEnable) {
        this.NullConnEnable = NullConnEnable;
    }

    /**
     * Get 异常连接检测条件，连接超时，，取值范围[0,65535] 
     * @return ConnTimeout 异常连接检测条件，连接超时，，取值范围[0,65535]
     */
    public Long getConnTimeout() {
        return this.ConnTimeout;
    }

    /**
     * Set 异常连接检测条件，连接超时，，取值范围[0,65535]
     * @param ConnTimeout 异常连接检测条件，连接超时，，取值范围[0,65535]
     */
    public void setConnTimeout(Long ConnTimeout) {
        this.ConnTimeout = ConnTimeout;
    }

    /**
     * Get 异常连接检测条件，syn占比ack百分比，，取值范围[0,100] 
     * @return SynRate 异常连接检测条件，syn占比ack百分比，，取值范围[0,100]
     */
    public Long getSynRate() {
        return this.SynRate;
    }

    /**
     * Set 异常连接检测条件，syn占比ack百分比，，取值范围[0,100]
     * @param SynRate 异常连接检测条件，syn占比ack百分比，，取值范围[0,100]
     */
    public void setSynRate(Long SynRate) {
        this.SynRate = SynRate;
    }

    /**
     * Get 异常连接检测条件，syn阈值，取值范围[0,100] 
     * @return SynLimit 异常连接检测条件，syn阈值，取值范围[0,100]
     */
    public Long getSynLimit() {
        return this.SynLimit;
    }

    /**
     * Set 异常连接检测条件，syn阈值，取值范围[0,100]
     * @param SynLimit 异常连接检测条件，syn阈值，取值范围[0,100]
     */
    public void setSynLimit(Long SynLimit) {
        this.SynLimit = SynLimit;
    }

    /**
     * Get tcp限速，取值范围[0,4294967295] 
     * @return DTcpMbpsLimit tcp限速，取值范围[0,4294967295]
     */
    public Long getDTcpMbpsLimit() {
        return this.DTcpMbpsLimit;
    }

    /**
     * Set tcp限速，取值范围[0,4294967295]
     * @param DTcpMbpsLimit tcp限速，取值范围[0,4294967295]
     */
    public void setDTcpMbpsLimit(Long DTcpMbpsLimit) {
        this.DTcpMbpsLimit = DTcpMbpsLimit;
    }

    /**
     * Get udp限速，取值范围[0,4294967295] 
     * @return DUdpMbpsLimit udp限速，取值范围[0,4294967295]
     */
    public Long getDUdpMbpsLimit() {
        return this.DUdpMbpsLimit;
    }

    /**
     * Set udp限速，取值范围[0,4294967295]
     * @param DUdpMbpsLimit udp限速，取值范围[0,4294967295]
     */
    public void setDUdpMbpsLimit(Long DUdpMbpsLimit) {
        this.DUdpMbpsLimit = DUdpMbpsLimit;
    }

    /**
     * Get icmp限速，取值范围[0,4294967295] 
     * @return DIcmpMbpsLimit icmp限速，取值范围[0,4294967295]
     */
    public Long getDIcmpMbpsLimit() {
        return this.DIcmpMbpsLimit;
    }

    /**
     * Set icmp限速，取值范围[0,4294967295]
     * @param DIcmpMbpsLimit icmp限速，取值范围[0,4294967295]
     */
    public void setDIcmpMbpsLimit(Long DIcmpMbpsLimit) {
        this.DIcmpMbpsLimit = DIcmpMbpsLimit;
    }

    /**
     * Get other协议限速，取值范围[0,4294967295] 
     * @return DOtherMbpsLimit other协议限速，取值范围[0,4294967295]
     */
    public Long getDOtherMbpsLimit() {
        return this.DOtherMbpsLimit;
    }

    /**
     * Set other协议限速，取值范围[0,4294967295]
     * @param DOtherMbpsLimit other协议限速，取值范围[0,4294967295]
     */
    public void setDOtherMbpsLimit(Long DOtherMbpsLimit) {
        this.DOtherMbpsLimit = DOtherMbpsLimit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DropTcp", this.DropTcp);
        this.setParamSimple(map, prefix + "DropUdp", this.DropUdp);
        this.setParamSimple(map, prefix + "DropIcmp", this.DropIcmp);
        this.setParamSimple(map, prefix + "DropOther", this.DropOther);
        this.setParamSimple(map, prefix + "DropAbroad", this.DropAbroad);
        this.setParamSimple(map, prefix + "CheckSyncConn", this.CheckSyncConn);
        this.setParamSimple(map, prefix + "SdNewLimit", this.SdNewLimit);
        this.setParamSimple(map, prefix + "DstNewLimit", this.DstNewLimit);
        this.setParamSimple(map, prefix + "SdConnLimit", this.SdConnLimit);
        this.setParamSimple(map, prefix + "DstConnLimit", this.DstConnLimit);
        this.setParamSimple(map, prefix + "BadConnThreshold", this.BadConnThreshold);
        this.setParamSimple(map, prefix + "NullConnEnable", this.NullConnEnable);
        this.setParamSimple(map, prefix + "ConnTimeout", this.ConnTimeout);
        this.setParamSimple(map, prefix + "SynRate", this.SynRate);
        this.setParamSimple(map, prefix + "SynLimit", this.SynLimit);
        this.setParamSimple(map, prefix + "DTcpMbpsLimit", this.DTcpMbpsLimit);
        this.setParamSimple(map, prefix + "DUdpMbpsLimit", this.DUdpMbpsLimit);
        this.setParamSimple(map, prefix + "DIcmpMbpsLimit", this.DIcmpMbpsLimit);
        this.setParamSimple(map, prefix + "DOtherMbpsLimit", this.DOtherMbpsLimit);

    }
}

