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

public class CreateDDoSPolicyCaseRequest  extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 策略场景名，字符串长度小于64
    */
    @SerializedName("CaseName")
    @Expose
    private String CaseName;

    /**
    * 开发平台，取值[PC（PC客户端）， MOBILE（移动端）， TV（电视端）， SERVER（主机）]
    */
    @SerializedName("PlatformTypes")
    @Expose
    private String [] PlatformTypes;

    /**
    * 细分品类，取值[WEB（网站）， GAME（游戏）， APP（应用）， OTHER（其他）]
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * 应用协议，取值[tcp（TCP协议），udp（UDP协议），icmp（ICMP协议），all（其他协议）]
    */
    @SerializedName("AppProtocols")
    @Expose
    private String [] AppProtocols;

    /**
    * TCP业务起始端口，取值(0, 65535]
    */
    @SerializedName("TcpSportStart")
    @Expose
    private String TcpSportStart;

    /**
    * TCP业务结束端口，取值(0, 65535]，必须大于等于TCP业务起始端口
    */
    @SerializedName("TcpSportEnd")
    @Expose
    private String TcpSportEnd;

    /**
    * UDP业务起始端口，取值范围(0, 65535]
    */
    @SerializedName("UdpSportStart")
    @Expose
    private String UdpSportStart;

    /**
    * UDP业务结束端口，取值范围(0, 65535)，必须大于等于UDP业务起始端口
    */
    @SerializedName("UdpSportEnd")
    @Expose
    private String UdpSportEnd;

    /**
    * 是否有海外客户，取值[no（没有）, yes（有）]
    */
    @SerializedName("HasAbroad")
    @Expose
    private String HasAbroad;

    /**
    * 是否会主动对外发起TCP请求，取值[no（不会）, yes（会）]
    */
    @SerializedName("HasInitiateTcp")
    @Expose
    private String HasInitiateTcp;

    /**
    * 是否会主动对外发起UDP业务请求，取值[no（不会）, yes（会）]
    */
    @SerializedName("HasInitiateUdp")
    @Expose
    private String HasInitiateUdp;

    /**
    * 主动发起TCP请求的端口，取值范围(0, 65535]
    */
    @SerializedName("PeerTcpPort")
    @Expose
    private String PeerTcpPort;

    /**
    * 主动发起UDP请求的端口，取值范围(0, 65535]
    */
    @SerializedName("PeerUdpPort")
    @Expose
    private String PeerUdpPort;

    /**
    * TCP载荷的固定特征码，字符串长度小于512
    */
    @SerializedName("TcpFootprint")
    @Expose
    private String TcpFootprint;

    /**
    * UDP载荷的固定特征码，字符串长度小于512
    */
    @SerializedName("UdpFootprint")
    @Expose
    private String UdpFootprint;

    /**
    * Web业务的API的URL
    */
    @SerializedName("WebApiUrl")
    @Expose
    private String [] WebApiUrl;

    /**
    * TCP业务报文长度最小值，取值范围(0, 1500)
    */
    @SerializedName("MinTcpPackageLen")
    @Expose
    private String MinTcpPackageLen;

    /**
    * TCP业务报文长度最大值，取值范围(0, 1500)，必须大于等于TCP业务报文长度最小值
    */
    @SerializedName("MaxTcpPackageLen")
    @Expose
    private String MaxTcpPackageLen;

    /**
    * UDP业务报文长度最小值，取值范围(0, 1500)
    */
    @SerializedName("MinUdpPackageLen")
    @Expose
    private String MinUdpPackageLen;

    /**
    * UDP业务报文长度最大值，取值范围(0, 1500)，必须大于等于UDP业务报文长度最小值
    */
    @SerializedName("MaxUdpPackageLen")
    @Expose
    private String MaxUdpPackageLen;

    /**
    * 是否有VPN业务，取值[no（没有）, yes（有）]
    */
    @SerializedName("HasVPN")
    @Expose
    private String HasVPN;

    /**
     * 获取大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * 设置大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * 获取策略场景名，字符串长度小于64
     * @return CaseName 策略场景名，字符串长度小于64
     */
    public String getCaseName() {
        return this.CaseName;
    }

    /**
     * 设置策略场景名，字符串长度小于64
     * @param CaseName 策略场景名，字符串长度小于64
     */
    public void setCaseName(String CaseName) {
        this.CaseName = CaseName;
    }

    /**
     * 获取开发平台，取值[PC（PC客户端）， MOBILE（移动端）， TV（电视端）， SERVER（主机）]
     * @return PlatformTypes 开发平台，取值[PC（PC客户端）， MOBILE（移动端）， TV（电视端）， SERVER（主机）]
     */
    public String [] getPlatformTypes() {
        return this.PlatformTypes;
    }

    /**
     * 设置开发平台，取值[PC（PC客户端）， MOBILE（移动端）， TV（电视端）， SERVER（主机）]
     * @param PlatformTypes 开发平台，取值[PC（PC客户端）， MOBILE（移动端）， TV（电视端）， SERVER（主机）]
     */
    public void setPlatformTypes(String [] PlatformTypes) {
        this.PlatformTypes = PlatformTypes;
    }

    /**
     * 获取细分品类，取值[WEB（网站）， GAME（游戏）， APP（应用）， OTHER（其他）]
     * @return AppType 细分品类，取值[WEB（网站）， GAME（游戏）， APP（应用）， OTHER（其他）]
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * 设置细分品类，取值[WEB（网站）， GAME（游戏）， APP（应用）， OTHER（其他）]
     * @param AppType 细分品类，取值[WEB（网站）， GAME（游戏）， APP（应用）， OTHER（其他）]
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * 获取应用协议，取值[tcp（TCP协议），udp（UDP协议），icmp（ICMP协议），all（其他协议）]
     * @return AppProtocols 应用协议，取值[tcp（TCP协议），udp（UDP协议），icmp（ICMP协议），all（其他协议）]
     */
    public String [] getAppProtocols() {
        return this.AppProtocols;
    }

    /**
     * 设置应用协议，取值[tcp（TCP协议），udp（UDP协议），icmp（ICMP协议），all（其他协议）]
     * @param AppProtocols 应用协议，取值[tcp（TCP协议），udp（UDP协议），icmp（ICMP协议），all（其他协议）]
     */
    public void setAppProtocols(String [] AppProtocols) {
        this.AppProtocols = AppProtocols;
    }

    /**
     * 获取TCP业务起始端口，取值(0, 65535]
     * @return TcpSportStart TCP业务起始端口，取值(0, 65535]
     */
    public String getTcpSportStart() {
        return this.TcpSportStart;
    }

    /**
     * 设置TCP业务起始端口，取值(0, 65535]
     * @param TcpSportStart TCP业务起始端口，取值(0, 65535]
     */
    public void setTcpSportStart(String TcpSportStart) {
        this.TcpSportStart = TcpSportStart;
    }

    /**
     * 获取TCP业务结束端口，取值(0, 65535]，必须大于等于TCP业务起始端口
     * @return TcpSportEnd TCP业务结束端口，取值(0, 65535]，必须大于等于TCP业务起始端口
     */
    public String getTcpSportEnd() {
        return this.TcpSportEnd;
    }

    /**
     * 设置TCP业务结束端口，取值(0, 65535]，必须大于等于TCP业务起始端口
     * @param TcpSportEnd TCP业务结束端口，取值(0, 65535]，必须大于等于TCP业务起始端口
     */
    public void setTcpSportEnd(String TcpSportEnd) {
        this.TcpSportEnd = TcpSportEnd;
    }

    /**
     * 获取UDP业务起始端口，取值范围(0, 65535]
     * @return UdpSportStart UDP业务起始端口，取值范围(0, 65535]
     */
    public String getUdpSportStart() {
        return this.UdpSportStart;
    }

    /**
     * 设置UDP业务起始端口，取值范围(0, 65535]
     * @param UdpSportStart UDP业务起始端口，取值范围(0, 65535]
     */
    public void setUdpSportStart(String UdpSportStart) {
        this.UdpSportStart = UdpSportStart;
    }

    /**
     * 获取UDP业务结束端口，取值范围(0, 65535)，必须大于等于UDP业务起始端口
     * @return UdpSportEnd UDP业务结束端口，取值范围(0, 65535)，必须大于等于UDP业务起始端口
     */
    public String getUdpSportEnd() {
        return this.UdpSportEnd;
    }

    /**
     * 设置UDP业务结束端口，取值范围(0, 65535)，必须大于等于UDP业务起始端口
     * @param UdpSportEnd UDP业务结束端口，取值范围(0, 65535)，必须大于等于UDP业务起始端口
     */
    public void setUdpSportEnd(String UdpSportEnd) {
        this.UdpSportEnd = UdpSportEnd;
    }

    /**
     * 获取是否有海外客户，取值[no（没有）, yes（有）]
     * @return HasAbroad 是否有海外客户，取值[no（没有）, yes（有）]
     */
    public String getHasAbroad() {
        return this.HasAbroad;
    }

    /**
     * 设置是否有海外客户，取值[no（没有）, yes（有）]
     * @param HasAbroad 是否有海外客户，取值[no（没有）, yes（有）]
     */
    public void setHasAbroad(String HasAbroad) {
        this.HasAbroad = HasAbroad;
    }

    /**
     * 获取是否会主动对外发起TCP请求，取值[no（不会）, yes（会）]
     * @return HasInitiateTcp 是否会主动对外发起TCP请求，取值[no（不会）, yes（会）]
     */
    public String getHasInitiateTcp() {
        return this.HasInitiateTcp;
    }

    /**
     * 设置是否会主动对外发起TCP请求，取值[no（不会）, yes（会）]
     * @param HasInitiateTcp 是否会主动对外发起TCP请求，取值[no（不会）, yes（会）]
     */
    public void setHasInitiateTcp(String HasInitiateTcp) {
        this.HasInitiateTcp = HasInitiateTcp;
    }

    /**
     * 获取是否会主动对外发起UDP业务请求，取值[no（不会）, yes（会）]
     * @return HasInitiateUdp 是否会主动对外发起UDP业务请求，取值[no（不会）, yes（会）]
     */
    public String getHasInitiateUdp() {
        return this.HasInitiateUdp;
    }

    /**
     * 设置是否会主动对外发起UDP业务请求，取值[no（不会）, yes（会）]
     * @param HasInitiateUdp 是否会主动对外发起UDP业务请求，取值[no（不会）, yes（会）]
     */
    public void setHasInitiateUdp(String HasInitiateUdp) {
        this.HasInitiateUdp = HasInitiateUdp;
    }

    /**
     * 获取主动发起TCP请求的端口，取值范围(0, 65535]
     * @return PeerTcpPort 主动发起TCP请求的端口，取值范围(0, 65535]
     */
    public String getPeerTcpPort() {
        return this.PeerTcpPort;
    }

    /**
     * 设置主动发起TCP请求的端口，取值范围(0, 65535]
     * @param PeerTcpPort 主动发起TCP请求的端口，取值范围(0, 65535]
     */
    public void setPeerTcpPort(String PeerTcpPort) {
        this.PeerTcpPort = PeerTcpPort;
    }

    /**
     * 获取主动发起UDP请求的端口，取值范围(0, 65535]
     * @return PeerUdpPort 主动发起UDP请求的端口，取值范围(0, 65535]
     */
    public String getPeerUdpPort() {
        return this.PeerUdpPort;
    }

    /**
     * 设置主动发起UDP请求的端口，取值范围(0, 65535]
     * @param PeerUdpPort 主动发起UDP请求的端口，取值范围(0, 65535]
     */
    public void setPeerUdpPort(String PeerUdpPort) {
        this.PeerUdpPort = PeerUdpPort;
    }

    /**
     * 获取TCP载荷的固定特征码，字符串长度小于512
     * @return TcpFootprint TCP载荷的固定特征码，字符串长度小于512
     */
    public String getTcpFootprint() {
        return this.TcpFootprint;
    }

    /**
     * 设置TCP载荷的固定特征码，字符串长度小于512
     * @param TcpFootprint TCP载荷的固定特征码，字符串长度小于512
     */
    public void setTcpFootprint(String TcpFootprint) {
        this.TcpFootprint = TcpFootprint;
    }

    /**
     * 获取UDP载荷的固定特征码，字符串长度小于512
     * @return UdpFootprint UDP载荷的固定特征码，字符串长度小于512
     */
    public String getUdpFootprint() {
        return this.UdpFootprint;
    }

    /**
     * 设置UDP载荷的固定特征码，字符串长度小于512
     * @param UdpFootprint UDP载荷的固定特征码，字符串长度小于512
     */
    public void setUdpFootprint(String UdpFootprint) {
        this.UdpFootprint = UdpFootprint;
    }

    /**
     * 获取Web业务的API的URL
     * @return WebApiUrl Web业务的API的URL
     */
    public String [] getWebApiUrl() {
        return this.WebApiUrl;
    }

    /**
     * 设置Web业务的API的URL
     * @param WebApiUrl Web业务的API的URL
     */
    public void setWebApiUrl(String [] WebApiUrl) {
        this.WebApiUrl = WebApiUrl;
    }

    /**
     * 获取TCP业务报文长度最小值，取值范围(0, 1500)
     * @return MinTcpPackageLen TCP业务报文长度最小值，取值范围(0, 1500)
     */
    public String getMinTcpPackageLen() {
        return this.MinTcpPackageLen;
    }

    /**
     * 设置TCP业务报文长度最小值，取值范围(0, 1500)
     * @param MinTcpPackageLen TCP业务报文长度最小值，取值范围(0, 1500)
     */
    public void setMinTcpPackageLen(String MinTcpPackageLen) {
        this.MinTcpPackageLen = MinTcpPackageLen;
    }

    /**
     * 获取TCP业务报文长度最大值，取值范围(0, 1500)，必须大于等于TCP业务报文长度最小值
     * @return MaxTcpPackageLen TCP业务报文长度最大值，取值范围(0, 1500)，必须大于等于TCP业务报文长度最小值
     */
    public String getMaxTcpPackageLen() {
        return this.MaxTcpPackageLen;
    }

    /**
     * 设置TCP业务报文长度最大值，取值范围(0, 1500)，必须大于等于TCP业务报文长度最小值
     * @param MaxTcpPackageLen TCP业务报文长度最大值，取值范围(0, 1500)，必须大于等于TCP业务报文长度最小值
     */
    public void setMaxTcpPackageLen(String MaxTcpPackageLen) {
        this.MaxTcpPackageLen = MaxTcpPackageLen;
    }

    /**
     * 获取UDP业务报文长度最小值，取值范围(0, 1500)
     * @return MinUdpPackageLen UDP业务报文长度最小值，取值范围(0, 1500)
     */
    public String getMinUdpPackageLen() {
        return this.MinUdpPackageLen;
    }

    /**
     * 设置UDP业务报文长度最小值，取值范围(0, 1500)
     * @param MinUdpPackageLen UDP业务报文长度最小值，取值范围(0, 1500)
     */
    public void setMinUdpPackageLen(String MinUdpPackageLen) {
        this.MinUdpPackageLen = MinUdpPackageLen;
    }

    /**
     * 获取UDP业务报文长度最大值，取值范围(0, 1500)，必须大于等于UDP业务报文长度最小值
     * @return MaxUdpPackageLen UDP业务报文长度最大值，取值范围(0, 1500)，必须大于等于UDP业务报文长度最小值
     */
    public String getMaxUdpPackageLen() {
        return this.MaxUdpPackageLen;
    }

    /**
     * 设置UDP业务报文长度最大值，取值范围(0, 1500)，必须大于等于UDP业务报文长度最小值
     * @param MaxUdpPackageLen UDP业务报文长度最大值，取值范围(0, 1500)，必须大于等于UDP业务报文长度最小值
     */
    public void setMaxUdpPackageLen(String MaxUdpPackageLen) {
        this.MaxUdpPackageLen = MaxUdpPackageLen;
    }

    /**
     * 获取是否有VPN业务，取值[no（没有）, yes（有）]
     * @return HasVPN 是否有VPN业务，取值[no（没有）, yes（有）]
     */
    public String getHasVPN() {
        return this.HasVPN;
    }

    /**
     * 设置是否有VPN业务，取值[no（没有）, yes（有）]
     * @param HasVPN 是否有VPN业务，取值[no（没有）, yes（有）]
     */
    public void setHasVPN(String HasVPN) {
        this.HasVPN = HasVPN;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "CaseName", this.CaseName);
        this.setParamArraySimple(map, prefix + "PlatformTypes.", this.PlatformTypes);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamArraySimple(map, prefix + "AppProtocols.", this.AppProtocols);
        this.setParamSimple(map, prefix + "TcpSportStart", this.TcpSportStart);
        this.setParamSimple(map, prefix + "TcpSportEnd", this.TcpSportEnd);
        this.setParamSimple(map, prefix + "UdpSportStart", this.UdpSportStart);
        this.setParamSimple(map, prefix + "UdpSportEnd", this.UdpSportEnd);
        this.setParamSimple(map, prefix + "HasAbroad", this.HasAbroad);
        this.setParamSimple(map, prefix + "HasInitiateTcp", this.HasInitiateTcp);
        this.setParamSimple(map, prefix + "HasInitiateUdp", this.HasInitiateUdp);
        this.setParamSimple(map, prefix + "PeerTcpPort", this.PeerTcpPort);
        this.setParamSimple(map, prefix + "PeerUdpPort", this.PeerUdpPort);
        this.setParamSimple(map, prefix + "TcpFootprint", this.TcpFootprint);
        this.setParamSimple(map, prefix + "UdpFootprint", this.UdpFootprint);
        this.setParamArraySimple(map, prefix + "WebApiUrl.", this.WebApiUrl);
        this.setParamSimple(map, prefix + "MinTcpPackageLen", this.MinTcpPackageLen);
        this.setParamSimple(map, prefix + "MaxTcpPackageLen", this.MaxTcpPackageLen);
        this.setParamSimple(map, prefix + "MinUdpPackageLen", this.MinUdpPackageLen);
        this.setParamSimple(map, prefix + "MaxUdpPackageLen", this.MaxUdpPackageLen);
        this.setParamSimple(map, prefix + "HasVPN", this.HasVPN);

    }
}

