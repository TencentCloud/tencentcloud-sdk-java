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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpartaProtectionInfoResponse extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * cname取值
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 源IP地址列表
    */
    @SerializedName("SrcList")
    @Expose
    private String [] SrcList;

    /**
    * 证书类型
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * 证书
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * 私有密钥
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * ssl的id
    */
    @SerializedName("Sslid")
    @Expose
    private String Sslid;

    /**
    * 是否是cdn
    */
    @SerializedName("IsCdn")
    @Expose
    private String IsCdn;

    /**
    * 灰度区域列表
    */
    @SerializedName("GrayAreas")
    @Expose
    private String [] GrayAreas;

    /**
    * 引擎
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * HTTPS重写
    */
    @SerializedName("HttpsRewrite")
    @Expose
    private String HttpsRewrite;

    /**
    * upstreamType取值
    */
    @SerializedName("UpstreamType")
    @Expose
    private String UpstreamType;

    /**
    * upstreamDomain取值
    */
    @SerializedName("UpstreamDomain")
    @Expose
    private String UpstreamDomain;

    /**
    * upstreamScheme取值
    */
    @SerializedName("UpstreamScheme")
    @Expose
    private String UpstreamScheme;

    /**
    * 是否是HTTP2
    */
    @SerializedName("IsHttp2")
    @Expose
    private String IsHttp2;

    /**
    * 是否含有websocket
    */
    @SerializedName("IsWebsocket")
    @Expose
    private String IsWebsocket;

    /**
    * loadBalance信息
    */
    @SerializedName("LoadBalance")
    @Expose
    private String LoadBalance;

    /**
    * httpsUpstreamPort取值
    */
    @SerializedName("HttpsUpstreamPort")
    @Expose
    private String HttpsUpstreamPort;

    /**
    * port信息
    */
    @SerializedName("Ports")
    @Expose
    private PortItem [] Ports;

    /**
    * 是否灰度
    */
    @SerializedName("IsGray")
    @Expose
    private String IsGray;

    /**
    * 模式
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 防御等级,100,200,300
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 与源站是否保持长连接
    */
    @SerializedName("IsKeepAlive")
    @Expose
    private String IsKeepAlive;

    /**
    * 0：BGP 1：Anycast
    */
    @SerializedName("Anycast")
    @Expose
    private String Anycast;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名ID 
     * @return DomainId 域名ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID
     * @param DomainId 域名ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get cname取值 
     * @return Cname cname取值
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set cname取值
     * @param Cname cname取值
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 源IP地址列表 
     * @return SrcList 源IP地址列表
     */
    public String [] getSrcList() {
        return this.SrcList;
    }

    /**
     * Set 源IP地址列表
     * @param SrcList 源IP地址列表
     */
    public void setSrcList(String [] SrcList) {
        this.SrcList = SrcList;
    }

    /**
     * Get 证书类型 
     * @return CertType 证书类型
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型
     * @param CertType 证书类型
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 证书 
     * @return Cert 证书
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set 证书
     * @param Cert 证书
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get 私有密钥 
     * @return PrivateKey 私有密钥
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 私有密钥
     * @param PrivateKey 私有密钥
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get ssl的id 
     * @return Sslid ssl的id
     */
    public String getSslid() {
        return this.Sslid;
    }

    /**
     * Set ssl的id
     * @param Sslid ssl的id
     */
    public void setSslid(String Sslid) {
        this.Sslid = Sslid;
    }

    /**
     * Get 是否是cdn 
     * @return IsCdn 是否是cdn
     */
    public String getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set 是否是cdn
     * @param IsCdn 是否是cdn
     */
    public void setIsCdn(String IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get 灰度区域列表 
     * @return GrayAreas 灰度区域列表
     */
    public String [] getGrayAreas() {
        return this.GrayAreas;
    }

    /**
     * Set 灰度区域列表
     * @param GrayAreas 灰度区域列表
     */
    public void setGrayAreas(String [] GrayAreas) {
        this.GrayAreas = GrayAreas;
    }

    /**
     * Get 引擎 
     * @return Engine 引擎
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 引擎
     * @param Engine 引擎
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get HTTPS重写 
     * @return HttpsRewrite HTTPS重写
     */
    public String getHttpsRewrite() {
        return this.HttpsRewrite;
    }

    /**
     * Set HTTPS重写
     * @param HttpsRewrite HTTPS重写
     */
    public void setHttpsRewrite(String HttpsRewrite) {
        this.HttpsRewrite = HttpsRewrite;
    }

    /**
     * Get upstreamType取值 
     * @return UpstreamType upstreamType取值
     */
    public String getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set upstreamType取值
     * @param UpstreamType upstreamType取值
     */
    public void setUpstreamType(String UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get upstreamDomain取值 
     * @return UpstreamDomain upstreamDomain取值
     */
    public String getUpstreamDomain() {
        return this.UpstreamDomain;
    }

    /**
     * Set upstreamDomain取值
     * @param UpstreamDomain upstreamDomain取值
     */
    public void setUpstreamDomain(String UpstreamDomain) {
        this.UpstreamDomain = UpstreamDomain;
    }

    /**
     * Get upstreamScheme取值 
     * @return UpstreamScheme upstreamScheme取值
     */
    public String getUpstreamScheme() {
        return this.UpstreamScheme;
    }

    /**
     * Set upstreamScheme取值
     * @param UpstreamScheme upstreamScheme取值
     */
    public void setUpstreamScheme(String UpstreamScheme) {
        this.UpstreamScheme = UpstreamScheme;
    }

    /**
     * Get 是否是HTTP2 
     * @return IsHttp2 是否是HTTP2
     */
    public String getIsHttp2() {
        return this.IsHttp2;
    }

    /**
     * Set 是否是HTTP2
     * @param IsHttp2 是否是HTTP2
     */
    public void setIsHttp2(String IsHttp2) {
        this.IsHttp2 = IsHttp2;
    }

    /**
     * Get 是否含有websocket 
     * @return IsWebsocket 是否含有websocket
     */
    public String getIsWebsocket() {
        return this.IsWebsocket;
    }

    /**
     * Set 是否含有websocket
     * @param IsWebsocket 是否含有websocket
     */
    public void setIsWebsocket(String IsWebsocket) {
        this.IsWebsocket = IsWebsocket;
    }

    /**
     * Get loadBalance信息 
     * @return LoadBalance loadBalance信息
     */
    public String getLoadBalance() {
        return this.LoadBalance;
    }

    /**
     * Set loadBalance信息
     * @param LoadBalance loadBalance信息
     */
    public void setLoadBalance(String LoadBalance) {
        this.LoadBalance = LoadBalance;
    }

    /**
     * Get httpsUpstreamPort取值 
     * @return HttpsUpstreamPort httpsUpstreamPort取值
     */
    public String getHttpsUpstreamPort() {
        return this.HttpsUpstreamPort;
    }

    /**
     * Set httpsUpstreamPort取值
     * @param HttpsUpstreamPort httpsUpstreamPort取值
     */
    public void setHttpsUpstreamPort(String HttpsUpstreamPort) {
        this.HttpsUpstreamPort = HttpsUpstreamPort;
    }

    /**
     * Get port信息 
     * @return Ports port信息
     */
    public PortItem [] getPorts() {
        return this.Ports;
    }

    /**
     * Set port信息
     * @param Ports port信息
     */
    public void setPorts(PortItem [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 是否灰度 
     * @return IsGray 是否灰度
     */
    public String getIsGray() {
        return this.IsGray;
    }

    /**
     * Set 是否灰度
     * @param IsGray 是否灰度
     */
    public void setIsGray(String IsGray) {
        this.IsGray = IsGray;
    }

    /**
     * Get 模式 
     * @return Mode 模式
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 模式
     * @param Mode 模式
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 防御等级,100,200,300 
     * @return Level 防御等级,100,200,300
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 防御等级,100,200,300
     * @param Level 防御等级,100,200,300
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 与源站是否保持长连接 
     * @return IsKeepAlive 与源站是否保持长连接
     */
    public String getIsKeepAlive() {
        return this.IsKeepAlive;
    }

    /**
     * Set 与源站是否保持长连接
     * @param IsKeepAlive 与源站是否保持长连接
     */
    public void setIsKeepAlive(String IsKeepAlive) {
        this.IsKeepAlive = IsKeepAlive;
    }

    /**
     * Get 0：BGP 1：Anycast 
     * @return Anycast 0：BGP 1：Anycast
     */
    public String getAnycast() {
        return this.Anycast;
    }

    /**
     * Set 0：BGP 1：Anycast
     * @param Anycast 0：BGP 1：Anycast
     */
    public void setAnycast(String Anycast) {
        this.Anycast = Anycast;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSpartaProtectionInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpartaProtectionInfoResponse(DescribeSpartaProtectionInfoResponse source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SrcList != null) {
            this.SrcList = new String[source.SrcList.length];
            for (int i = 0; i < source.SrcList.length; i++) {
                this.SrcList[i] = new String(source.SrcList[i]);
            }
        }
        if (source.CertType != null) {
            this.CertType = new String(source.CertType);
        }
        if (source.Cert != null) {
            this.Cert = new String(source.Cert);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.Sslid != null) {
            this.Sslid = new String(source.Sslid);
        }
        if (source.IsCdn != null) {
            this.IsCdn = new String(source.IsCdn);
        }
        if (source.GrayAreas != null) {
            this.GrayAreas = new String[source.GrayAreas.length];
            for (int i = 0; i < source.GrayAreas.length; i++) {
                this.GrayAreas[i] = new String(source.GrayAreas[i]);
            }
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.HttpsRewrite != null) {
            this.HttpsRewrite = new String(source.HttpsRewrite);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new String(source.UpstreamType);
        }
        if (source.UpstreamDomain != null) {
            this.UpstreamDomain = new String(source.UpstreamDomain);
        }
        if (source.UpstreamScheme != null) {
            this.UpstreamScheme = new String(source.UpstreamScheme);
        }
        if (source.IsHttp2 != null) {
            this.IsHttp2 = new String(source.IsHttp2);
        }
        if (source.IsWebsocket != null) {
            this.IsWebsocket = new String(source.IsWebsocket);
        }
        if (source.LoadBalance != null) {
            this.LoadBalance = new String(source.LoadBalance);
        }
        if (source.HttpsUpstreamPort != null) {
            this.HttpsUpstreamPort = new String(source.HttpsUpstreamPort);
        }
        if (source.Ports != null) {
            this.Ports = new PortItem[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new PortItem(source.Ports[i]);
            }
        }
        if (source.IsGray != null) {
            this.IsGray = new String(source.IsGray);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.IsKeepAlive != null) {
            this.IsKeepAlive = new String(source.IsKeepAlive);
        }
        if (source.Anycast != null) {
            this.Anycast = new String(source.Anycast);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SrcList.", this.SrcList);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "Sslid", this.Sslid);
        this.setParamSimple(map, prefix + "IsCdn", this.IsCdn);
        this.setParamArraySimple(map, prefix + "GrayAreas.", this.GrayAreas);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "HttpsRewrite", this.HttpsRewrite);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamSimple(map, prefix + "UpstreamDomain", this.UpstreamDomain);
        this.setParamSimple(map, prefix + "UpstreamScheme", this.UpstreamScheme);
        this.setParamSimple(map, prefix + "IsHttp2", this.IsHttp2);
        this.setParamSimple(map, prefix + "IsWebsocket", this.IsWebsocket);
        this.setParamSimple(map, prefix + "LoadBalance", this.LoadBalance);
        this.setParamSimple(map, prefix + "HttpsUpstreamPort", this.HttpsUpstreamPort);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "IsGray", this.IsGray);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "IsKeepAlive", this.IsKeepAlive);
        this.setParamSimple(map, prefix + "Anycast", this.Anycast);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

