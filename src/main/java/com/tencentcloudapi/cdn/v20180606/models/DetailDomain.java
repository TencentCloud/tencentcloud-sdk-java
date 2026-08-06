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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailDomain extends AbstractModel {

    /**
    * <p>域名 ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>腾讯云账号ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>加速域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>域名对应的 CNAME 地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * <p>加速服务状态<br>rejected：域名审核未通过，域名备案过期/被注销导致<br>processing：部署中<br>closing：关闭中<br>online：已启动<br>offline：已关闭</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>项目 ID，可前往腾讯云项目管理页面查看</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>加速域名业务类型<br>web：网页小文件<br>download：下载大文件<br>media：音视频点播<br>hybrid:  动静加速<br>dynamic:  动态加速</p>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>域名创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>域名更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>源站配置</p>
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * <p>IP 黑白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * <p>IP 访问限频配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpFreqLimit")
    @Expose
    private IpFreqLimit IpFreqLimit;

    /**
    * <p>状态码缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusCodeCache")
    @Expose
    private StatusCodeCache StatusCodeCache;

    /**
    * <p>智能压缩配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * <p>带宽封顶配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthAlert")
    @Expose
    private BandwidthAlert BandwidthAlert;

    /**
    * <p>Range 回源配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RangeOriginPull")
    @Expose
    private RangeOriginPull RangeOriginPull;

    /**
    * <p>301/302 回源自动跟随配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowRedirect")
    @Expose
    private FollowRedirect FollowRedirect;

    /**
    * <p>自定义错误页面配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorPage")
    @Expose
    private ErrorPage ErrorPage;

    /**
    * <p>自定义请求头部配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestHeader")
    @Expose
    private RequestHeader RequestHeader;

    /**
    * <p>自定义响应头部配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * <p>单链接下行限速配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownstreamCapping")
    @Expose
    private DownstreamCapping DownstreamCapping;

    /**
    * <p>带参/不带参缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * <p>源站头部缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseHeaderCache")
    @Expose
    private ResponseHeaderCache ResponseHeaderCache;

    /**
    * <p>视频拖拽配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoSeek")
    @Expose
    private VideoSeek VideoSeek;

    /**
    * <p>节点缓存过期规则配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * <p>跨国链路优化配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginPullOptimization")
    @Expose
    private OriginPullOptimization OriginPullOptimization;

    /**
    * <p>Https 加速相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * <p>时间戳防盗链配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Authentication")
    @Expose
    private Authentication Authentication;

    /**
    * <p>SEO 优化配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seo")
    @Expose
    private Seo Seo;

    /**
    * <p>域名封禁状态<br>normal：正常状态<br>overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务<br>malicious：域名出现恶意行为，强制关闭加速服务<br>ddos：域名被大规模 DDoS 攻击，关闭加速服务<br>ddos_risk: 域名存在ddos攻击风险<br>idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务<br>unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务<br>capping：触发配置的带宽阈值上限<br>readonly：域名存在特殊配置，被锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disable")
    @Expose
    private String Disable;

    /**
    * <p>访问协议强制跳转配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * <p>Referer 防盗链配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Referer")
    @Expose
    private Referer Referer;

    /**
    * <p>浏览器缓存过期规则配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * <p>Ipv6 回源配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * <p>是否兼容旧版本配置（内部兼容性字段）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compatibility")
    @Expose
    private Compatibility Compatibility;

    /**
    * <p>区域特殊配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecificConfig")
    @Expose
    private SpecificConfig SpecificConfig;

    /**
    * <p>加速区域<br>mainland：中国境内加速<br>overseas：中国境外加速<br>global：全球加速</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>域名锁定状态<br>normal：未锁定<br>mainland：中国境内锁定<br>overseas：中国境外锁定<br>global：全球锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Readonly")
    @Expose
    private String Readonly;

    /**
    * <p>回源超时配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginPullTimeout")
    @Expose
    private OriginPullTimeout OriginPullTimeout;

    /**
    * <p>回源S3鉴权配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AwsPrivateAccess")
    @Expose
    private AwsPrivateAccess AwsPrivateAccess;

    /**
    * <p>Scdn配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityConfig")
    @Expose
    private SecurityConfig SecurityConfig;

    /**
    * <p>ImageOptimization配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageOptimization")
    @Expose
    private ImageOptimization ImageOptimization;

    /**
    * <p>UA黑白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAgentFilter")
    @Expose
    private UserAgentFilter UserAgentFilter;

    /**
    * <p>访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessControl")
    @Expose
    private AccessControl AccessControl;

    /**
    * <p>是否支持高级配置项<br>on：支持<br>off：不支持</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Advance")
    @Expose
    private String Advance;

    /**
    * <p>URL重定向配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UrlRedirect")
    @Expose
    private UrlRedirect UrlRedirect;

    /**
    * <p>访问端口配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessPort")
    @Expose
    private Long [] AccessPort;

    /**
    * <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * <p>时间戳防盗链高级配置，白名单功能</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedAuthentication")
    @Expose
    private AdvancedAuthentication AdvancedAuthentication;

    /**
    * <p>回源鉴权高级配置，白名单功能</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginAuthentication")
    @Expose
    private OriginAuthentication OriginAuthentication;

    /**
    * <p>Ipv6访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6Access")
    @Expose
    private Ipv6Access Ipv6Access;

    /**
    * <p>高级配置集合</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvanceSet")
    @Expose
    private AdvanceConfig [] AdvanceSet;

    /**
    * <p>离线缓存（功能灰度中，尚未全量，请等待后续全量发布）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * <p>合并回源（白名单功能）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginCombine")
    @Expose
    private OriginCombine OriginCombine;

    /**
    * <p>POST上传配置项</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostSize PostMaxSize;

    /**
    * <p>Quic配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * <p>回源OSS私有鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OssPrivateAccess")
    @Expose
    private OssPrivateAccess OssPrivateAccess;

    /**
    * <p>WebSocket配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * <p>远程鉴权配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteAuthentication")
    @Expose
    private RemoteAuthentication RemoteAuthentication;

    /**
    * <p>共享CNAME配置（白名单功能）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShareCname")
    @Expose
    private ShareCname ShareCname;

    /**
    * <p>规则引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleEngine")
    @Expose
    private RuleEngine RuleEngine;

    /**
    * <p>主域名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentHost")
    @Expose
    private String ParentHost;

    /**
    * <p>华为云对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HwPrivateAccess")
    @Expose
    private HwPrivateAccess HwPrivateAccess;

    /**
    * <p>七牛云对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QnPrivateAccess")
    @Expose
    private QnPrivateAccess QnPrivateAccess;

    /**
    * <p>HTTPS服务，缺省时默认开启</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpsBilling")
    @Expose
    private HttpsBilling HttpsBilling;

    /**
    * <p>其他厂商对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OthersPrivateAccess")
    @Expose
    private OthersPrivateAccess OthersPrivateAccess;

    /**
    * <p>参数黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamFilter")
    @Expose
    private ParamFilter ParamFilter;

    /**
    * <p>流量一键防盗刷配置</p>
    */
    @SerializedName("AutoGuard")
    @Expose
    private AutoGuard AutoGuard;

    /**
    * <p>区域访问控制配置</p>
    */
    @SerializedName("GeoBlocker")
    @Expose
    private GeoBlocker GeoBlocker;

    /**
     * Get <p>域名 ID</p> 
     * @return ResourceId <p>域名 ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>域名 ID</p>
     * @param ResourceId <p>域名 ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>腾讯云账号ID</p> 
     * @return AppId <p>腾讯云账号ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>腾讯云账号ID</p>
     * @param AppId <p>腾讯云账号ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>加速域名</p> 
     * @return Domain <p>加速域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>加速域名</p>
     * @param Domain <p>加速域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>域名对应的 CNAME 地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cname <p>域名对应的 CNAME 地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set <p>域名对应的 CNAME 地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cname <p>域名对应的 CNAME 地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get <p>加速服务状态<br>rejected：域名审核未通过，域名备案过期/被注销导致<br>processing：部署中<br>closing：关闭中<br>online：已启动<br>offline：已关闭</p> 
     * @return Status <p>加速服务状态<br>rejected：域名审核未通过，域名备案过期/被注销导致<br>processing：部署中<br>closing：关闭中<br>online：已启动<br>offline：已关闭</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>加速服务状态<br>rejected：域名审核未通过，域名备案过期/被注销导致<br>processing：部署中<br>closing：关闭中<br>online：已启动<br>offline：已关闭</p>
     * @param Status <p>加速服务状态<br>rejected：域名审核未通过，域名备案过期/被注销导致<br>processing：部署中<br>closing：关闭中<br>online：已启动<br>offline：已关闭</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>项目 ID，可前往腾讯云项目管理页面查看</p> 
     * @return ProjectId <p>项目 ID，可前往腾讯云项目管理页面查看</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID，可前往腾讯云项目管理页面查看</p>
     * @param ProjectId <p>项目 ID，可前往腾讯云项目管理页面查看</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>加速域名业务类型<br>web：网页小文件<br>download：下载大文件<br>media：音视频点播<br>hybrid:  动静加速<br>dynamic:  动态加速</p> 
     * @return ServiceType <p>加速域名业务类型<br>web：网页小文件<br>download：下载大文件<br>media：音视频点播<br>hybrid:  动静加速<br>dynamic:  动态加速</p>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>加速域名业务类型<br>web：网页小文件<br>download：下载大文件<br>media：音视频点播<br>hybrid:  动静加速<br>dynamic:  动态加速</p>
     * @param ServiceType <p>加速域名业务类型<br>web：网页小文件<br>download：下载大文件<br>media：音视频点播<br>hybrid:  动静加速<br>dynamic:  动态加速</p>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>域名创建时间</p> 
     * @return CreateTime <p>域名创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>域名创建时间</p>
     * @param CreateTime <p>域名创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>域名更新时间</p> 
     * @return UpdateTime <p>域名更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>域名更新时间</p>
     * @param UpdateTime <p>域名更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>源站配置</p> 
     * @return Origin <p>源站配置</p>
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set <p>源站配置</p>
     * @param Origin <p>源站配置</p>
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get <p>IP 黑白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpFilter <p>IP 黑白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set <p>IP 黑白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpFilter <p>IP 黑白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get <p>IP 访问限频配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpFreqLimit <p>IP 访问限频配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpFreqLimit getIpFreqLimit() {
        return this.IpFreqLimit;
    }

    /**
     * Set <p>IP 访问限频配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpFreqLimit <p>IP 访问限频配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpFreqLimit(IpFreqLimit IpFreqLimit) {
        this.IpFreqLimit = IpFreqLimit;
    }

    /**
     * Get <p>状态码缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusCodeCache <p>状态码缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatusCodeCache getStatusCodeCache() {
        return this.StatusCodeCache;
    }

    /**
     * Set <p>状态码缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusCodeCache <p>状态码缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusCodeCache(StatusCodeCache StatusCodeCache) {
        this.StatusCodeCache = StatusCodeCache;
    }

    /**
     * Get <p>智能压缩配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compression <p>智能压缩配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set <p>智能压缩配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compression <p>智能压缩配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get <p>带宽封顶配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthAlert <p>带宽封顶配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BandwidthAlert getBandwidthAlert() {
        return this.BandwidthAlert;
    }

    /**
     * Set <p>带宽封顶配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthAlert <p>带宽封顶配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthAlert(BandwidthAlert BandwidthAlert) {
        this.BandwidthAlert = BandwidthAlert;
    }

    /**
     * Get <p>Range 回源配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RangeOriginPull <p>Range 回源配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RangeOriginPull getRangeOriginPull() {
        return this.RangeOriginPull;
    }

    /**
     * Set <p>Range 回源配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RangeOriginPull <p>Range 回源配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRangeOriginPull(RangeOriginPull RangeOriginPull) {
        this.RangeOriginPull = RangeOriginPull;
    }

    /**
     * Get <p>301/302 回源自动跟随配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowRedirect <p>301/302 回源自动跟随配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FollowRedirect getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set <p>301/302 回源自动跟随配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowRedirect <p>301/302 回源自动跟随配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowRedirect(FollowRedirect FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get <p>自定义错误页面配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorPage <p>自定义错误页面配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set <p>自定义错误页面配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorPage <p>自定义错误页面配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorPage(ErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    /**
     * Get <p>自定义请求头部配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestHeader <p>自定义请求头部配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RequestHeader getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set <p>自定义请求头部配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestHeader <p>自定义请求头部配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestHeader(RequestHeader RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get <p>自定义响应头部配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseHeader <p>自定义响应头部配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set <p>自定义响应头部配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseHeader <p>自定义响应头部配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get <p>单链接下行限速配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownstreamCapping <p>单链接下行限速配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DownstreamCapping getDownstreamCapping() {
        return this.DownstreamCapping;
    }

    /**
     * Set <p>单链接下行限速配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownstreamCapping <p>单链接下行限速配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownstreamCapping(DownstreamCapping DownstreamCapping) {
        this.DownstreamCapping = DownstreamCapping;
    }

    /**
     * Get <p>带参/不带参缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheKey <p>带参/不带参缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set <p>带参/不带参缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheKey <p>带参/不带参缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get <p>源站头部缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseHeaderCache <p>源站头部缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResponseHeaderCache getResponseHeaderCache() {
        return this.ResponseHeaderCache;
    }

    /**
     * Set <p>源站头部缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseHeaderCache <p>源站头部缓存配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseHeaderCache(ResponseHeaderCache ResponseHeaderCache) {
        this.ResponseHeaderCache = ResponseHeaderCache;
    }

    /**
     * Get <p>视频拖拽配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoSeek <p>视频拖拽配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoSeek getVideoSeek() {
        return this.VideoSeek;
    }

    /**
     * Set <p>视频拖拽配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoSeek <p>视频拖拽配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoSeek(VideoSeek VideoSeek) {
        this.VideoSeek = VideoSeek;
    }

    /**
     * Get <p>节点缓存过期规则配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cache <p>节点缓存过期规则配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set <p>节点缓存过期规则配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cache <p>节点缓存过期规则配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get <p>跨国链路优化配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginPullOptimization <p>跨国链路优化配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginPullOptimization getOriginPullOptimization() {
        return this.OriginPullOptimization;
    }

    /**
     * Set <p>跨国链路优化配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginPullOptimization <p>跨国链路优化配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginPullOptimization(OriginPullOptimization OriginPullOptimization) {
        this.OriginPullOptimization = OriginPullOptimization;
    }

    /**
     * Get <p>Https 加速相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Https <p>Https 加速相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set <p>Https 加速相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Https <p>Https 加速相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get <p>时间戳防盗链配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Authentication <p>时间戳防盗链配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Authentication getAuthentication() {
        return this.Authentication;
    }

    /**
     * Set <p>时间戳防盗链配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Authentication <p>时间戳防盗链配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthentication(Authentication Authentication) {
        this.Authentication = Authentication;
    }

    /**
     * Get <p>SEO 优化配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seo <p>SEO 优化配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Seo getSeo() {
        return this.Seo;
    }

    /**
     * Set <p>SEO 优化配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seo <p>SEO 优化配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeo(Seo Seo) {
        this.Seo = Seo;
    }

    /**
     * Get <p>域名封禁状态<br>normal：正常状态<br>overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务<br>malicious：域名出现恶意行为，强制关闭加速服务<br>ddos：域名被大规模 DDoS 攻击，关闭加速服务<br>ddos_risk: 域名存在ddos攻击风险<br>idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务<br>unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务<br>capping：触发配置的带宽阈值上限<br>readonly：域名存在特殊配置，被锁定</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disable <p>域名封禁状态<br>normal：正常状态<br>overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务<br>malicious：域名出现恶意行为，强制关闭加速服务<br>ddos：域名被大规模 DDoS 攻击，关闭加速服务<br>ddos_risk: 域名存在ddos攻击风险<br>idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务<br>unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务<br>capping：触发配置的带宽阈值上限<br>readonly：域名存在特殊配置，被锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisable() {
        return this.Disable;
    }

    /**
     * Set <p>域名封禁状态<br>normal：正常状态<br>overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务<br>malicious：域名出现恶意行为，强制关闭加速服务<br>ddos：域名被大规模 DDoS 攻击，关闭加速服务<br>ddos_risk: 域名存在ddos攻击风险<br>idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务<br>unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务<br>capping：触发配置的带宽阈值上限<br>readonly：域名存在特殊配置，被锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disable <p>域名封禁状态<br>normal：正常状态<br>overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务<br>malicious：域名出现恶意行为，强制关闭加速服务<br>ddos：域名被大规模 DDoS 攻击，关闭加速服务<br>ddos_risk: 域名存在ddos攻击风险<br>idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务<br>unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务<br>capping：触发配置的带宽阈值上限<br>readonly：域名存在特殊配置，被锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisable(String Disable) {
        this.Disable = Disable;
    }

    /**
     * Get <p>访问协议强制跳转配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForceRedirect <p>访问协议强制跳转配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set <p>访问协议强制跳转配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForceRedirect <p>访问协议强制跳转配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get <p>Referer 防盗链配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Referer <p>Referer 防盗链配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Referer getReferer() {
        return this.Referer;
    }

    /**
     * Set <p>Referer 防盗链配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Referer <p>Referer 防盗链配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReferer(Referer Referer) {
        this.Referer = Referer;
    }

    /**
     * Get <p>浏览器缓存过期规则配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxAge <p>浏览器缓存过期规则配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set <p>浏览器缓存过期规则配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxAge <p>浏览器缓存过期规则配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get <p>Ipv6 回源配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6 <p>Ipv6 回源配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set <p>Ipv6 回源配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6 <p>Ipv6 回源配置（功能灰度中，敬请期待）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get <p>是否兼容旧版本配置（内部兼容性字段）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compatibility <p>是否兼容旧版本配置（内部兼容性字段）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Compatibility getCompatibility() {
        return this.Compatibility;
    }

    /**
     * Set <p>是否兼容旧版本配置（内部兼容性字段）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compatibility <p>是否兼容旧版本配置（内部兼容性字段）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompatibility(Compatibility Compatibility) {
        this.Compatibility = Compatibility;
    }

    /**
     * Get <p>区域特殊配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecificConfig <p>区域特殊配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SpecificConfig getSpecificConfig() {
        return this.SpecificConfig;
    }

    /**
     * Set <p>区域特殊配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecificConfig <p>区域特殊配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecificConfig(SpecificConfig SpecificConfig) {
        this.SpecificConfig = SpecificConfig;
    }

    /**
     * Get <p>加速区域<br>mainland：中国境内加速<br>overseas：中国境外加速<br>global：全球加速</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Area <p>加速区域<br>mainland：中国境内加速<br>overseas：中国境外加速<br>global：全球加速</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>加速区域<br>mainland：中国境内加速<br>overseas：中国境外加速<br>global：全球加速</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Area <p>加速区域<br>mainland：中国境内加速<br>overseas：中国境外加速<br>global：全球加速</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>域名锁定状态<br>normal：未锁定<br>mainland：中国境内锁定<br>overseas：中国境外锁定<br>global：全球锁定</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Readonly <p>域名锁定状态<br>normal：未锁定<br>mainland：中国境内锁定<br>overseas：中国境外锁定<br>global：全球锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReadonly() {
        return this.Readonly;
    }

    /**
     * Set <p>域名锁定状态<br>normal：未锁定<br>mainland：中国境内锁定<br>overseas：中国境外锁定<br>global：全球锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Readonly <p>域名锁定状态<br>normal：未锁定<br>mainland：中国境内锁定<br>overseas：中国境外锁定<br>global：全球锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadonly(String Readonly) {
        this.Readonly = Readonly;
    }

    /**
     * Get <p>回源超时配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginPullTimeout <p>回源超时配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginPullTimeout getOriginPullTimeout() {
        return this.OriginPullTimeout;
    }

    /**
     * Set <p>回源超时配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginPullTimeout <p>回源超时配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginPullTimeout(OriginPullTimeout OriginPullTimeout) {
        this.OriginPullTimeout = OriginPullTimeout;
    }

    /**
     * Get <p>回源S3鉴权配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AwsPrivateAccess <p>回源S3鉴权配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AwsPrivateAccess getAwsPrivateAccess() {
        return this.AwsPrivateAccess;
    }

    /**
     * Set <p>回源S3鉴权配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AwsPrivateAccess <p>回源S3鉴权配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAwsPrivateAccess(AwsPrivateAccess AwsPrivateAccess) {
        this.AwsPrivateAccess = AwsPrivateAccess;
    }

    /**
     * Get <p>Scdn配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityConfig <p>Scdn配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityConfig getSecurityConfig() {
        return this.SecurityConfig;
    }

    /**
     * Set <p>Scdn配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityConfig <p>Scdn配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityConfig(SecurityConfig SecurityConfig) {
        this.SecurityConfig = SecurityConfig;
    }

    /**
     * Get <p>ImageOptimization配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageOptimization <p>ImageOptimization配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageOptimization getImageOptimization() {
        return this.ImageOptimization;
    }

    /**
     * Set <p>ImageOptimization配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageOptimization <p>ImageOptimization配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageOptimization(ImageOptimization ImageOptimization) {
        this.ImageOptimization = ImageOptimization;
    }

    /**
     * Get <p>UA黑白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAgentFilter <p>UA黑白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserAgentFilter getUserAgentFilter() {
        return this.UserAgentFilter;
    }

    /**
     * Set <p>UA黑白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAgentFilter <p>UA黑白名单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAgentFilter(UserAgentFilter UserAgentFilter) {
        this.UserAgentFilter = UserAgentFilter;
    }

    /**
     * Get <p>访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessControl <p>访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccessControl getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set <p>访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessControl <p>访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessControl(AccessControl AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get <p>是否支持高级配置项<br>on：支持<br>off：不支持</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Advance <p>是否支持高级配置项<br>on：支持<br>off：不支持</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdvance() {
        return this.Advance;
    }

    /**
     * Set <p>是否支持高级配置项<br>on：支持<br>off：不支持</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Advance <p>是否支持高级配置项<br>on：支持<br>off：不支持</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvance(String Advance) {
        this.Advance = Advance;
    }

    /**
     * Get <p>URL重定向配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UrlRedirect <p>URL重定向配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UrlRedirect getUrlRedirect() {
        return this.UrlRedirect;
    }

    /**
     * Set <p>URL重定向配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UrlRedirect <p>URL重定向配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrlRedirect(UrlRedirect UrlRedirect) {
        this.UrlRedirect = UrlRedirect;
    }

    /**
     * Get <p>访问端口配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessPort <p>访问端口配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAccessPort() {
        return this.AccessPort;
    }

    /**
     * Set <p>访问端口配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessPort <p>访问端口配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessPort(Long [] AccessPort) {
        this.AccessPort = AccessPort;
    }

    /**
     * Get <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>时间戳防盗链高级配置，白名单功能</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedAuthentication <p>时间戳防盗链高级配置，白名单功能</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedAuthentication getAdvancedAuthentication() {
        return this.AdvancedAuthentication;
    }

    /**
     * Set <p>时间戳防盗链高级配置，白名单功能</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedAuthentication <p>时间戳防盗链高级配置，白名单功能</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedAuthentication(AdvancedAuthentication AdvancedAuthentication) {
        this.AdvancedAuthentication = AdvancedAuthentication;
    }

    /**
     * Get <p>回源鉴权高级配置，白名单功能</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginAuthentication <p>回源鉴权高级配置，白名单功能</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginAuthentication getOriginAuthentication() {
        return this.OriginAuthentication;
    }

    /**
     * Set <p>回源鉴权高级配置，白名单功能</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginAuthentication <p>回源鉴权高级配置，白名单功能</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginAuthentication(OriginAuthentication OriginAuthentication) {
        this.OriginAuthentication = OriginAuthentication;
    }

    /**
     * Get <p>Ipv6访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6Access <p>Ipv6访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Ipv6Access getIpv6Access() {
        return this.Ipv6Access;
    }

    /**
     * Set <p>Ipv6访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6Access <p>Ipv6访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6Access(Ipv6Access Ipv6Access) {
        this.Ipv6Access = Ipv6Access;
    }

    /**
     * Get <p>高级配置集合</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvanceSet <p>高级配置集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvanceConfig [] getAdvanceSet() {
        return this.AdvanceSet;
    }

    /**
     * Set <p>高级配置集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvanceSet <p>高级配置集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvanceSet(AdvanceConfig [] AdvanceSet) {
        this.AdvanceSet = AdvanceSet;
    }

    /**
     * Get <p>离线缓存（功能灰度中，尚未全量，请等待后续全量发布）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineCache <p>离线缓存（功能灰度中，尚未全量，请等待后续全量发布）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OfflineCache getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set <p>离线缓存（功能灰度中，尚未全量，请等待后续全量发布）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineCache <p>离线缓存（功能灰度中，尚未全量，请等待后续全量发布）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineCache(OfflineCache OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get <p>合并回源（白名单功能）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginCombine <p>合并回源（白名单功能）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginCombine getOriginCombine() {
        return this.OriginCombine;
    }

    /**
     * Set <p>合并回源（白名单功能）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginCombine <p>合并回源（白名单功能）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginCombine(OriginCombine OriginCombine) {
        this.OriginCombine = OriginCombine;
    }

    /**
     * Get <p>POST上传配置项</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostMaxSize <p>POST上传配置项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PostSize getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set <p>POST上传配置项</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostMaxSize <p>POST上传配置项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostMaxSize(PostSize PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get <p>Quic配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quic <p>Quic配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set <p>Quic配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quic <p>Quic配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get <p>回源OSS私有鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OssPrivateAccess <p>回源OSS私有鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OssPrivateAccess getOssPrivateAccess() {
        return this.OssPrivateAccess;
    }

    /**
     * Set <p>回源OSS私有鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OssPrivateAccess <p>回源OSS私有鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOssPrivateAccess(OssPrivateAccess OssPrivateAccess) {
        this.OssPrivateAccess = OssPrivateAccess;
    }

    /**
     * Get <p>WebSocket配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebSocket <p>WebSocket配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebSocket getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set <p>WebSocket配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebSocket <p>WebSocket配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebSocket(WebSocket WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get <p>远程鉴权配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteAuthentication <p>远程鉴权配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RemoteAuthentication getRemoteAuthentication() {
        return this.RemoteAuthentication;
    }

    /**
     * Set <p>远程鉴权配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteAuthentication <p>远程鉴权配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteAuthentication(RemoteAuthentication RemoteAuthentication) {
        this.RemoteAuthentication = RemoteAuthentication;
    }

    /**
     * Get <p>共享CNAME配置（白名单功能）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShareCname <p>共享CNAME配置（白名单功能）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ShareCname getShareCname() {
        return this.ShareCname;
    }

    /**
     * Set <p>共享CNAME配置（白名单功能）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShareCname <p>共享CNAME配置（白名单功能）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShareCname(ShareCname ShareCname) {
        this.ShareCname = ShareCname;
    }

    /**
     * Get <p>规则引擎</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleEngine <p>规则引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleEngine getRuleEngine() {
        return this.RuleEngine;
    }

    /**
     * Set <p>规则引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleEngine <p>规则引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleEngine(RuleEngine RuleEngine) {
        this.RuleEngine = RuleEngine;
    }

    /**
     * Get <p>主域名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentHost <p>主域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentHost() {
        return this.ParentHost;
    }

    /**
     * Set <p>主域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentHost <p>主域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentHost(String ParentHost) {
        this.ParentHost = ParentHost;
    }

    /**
     * Get <p>华为云对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HwPrivateAccess <p>华为云对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HwPrivateAccess getHwPrivateAccess() {
        return this.HwPrivateAccess;
    }

    /**
     * Set <p>华为云对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HwPrivateAccess <p>华为云对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHwPrivateAccess(HwPrivateAccess HwPrivateAccess) {
        this.HwPrivateAccess = HwPrivateAccess;
    }

    /**
     * Get <p>七牛云对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QnPrivateAccess <p>七牛云对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QnPrivateAccess getQnPrivateAccess() {
        return this.QnPrivateAccess;
    }

    /**
     * Set <p>七牛云对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QnPrivateAccess <p>七牛云对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQnPrivateAccess(QnPrivateAccess QnPrivateAccess) {
        this.QnPrivateAccess = QnPrivateAccess;
    }

    /**
     * Get <p>HTTPS服务，缺省时默认开启</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpsBilling <p>HTTPS服务，缺省时默认开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HttpsBilling getHttpsBilling() {
        return this.HttpsBilling;
    }

    /**
     * Set <p>HTTPS服务，缺省时默认开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpsBilling <p>HTTPS服务，缺省时默认开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpsBilling(HttpsBilling HttpsBilling) {
        this.HttpsBilling = HttpsBilling;
    }

    /**
     * Get <p>其他厂商对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OthersPrivateAccess <p>其他厂商对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OthersPrivateAccess getOthersPrivateAccess() {
        return this.OthersPrivateAccess;
    }

    /**
     * Set <p>其他厂商对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OthersPrivateAccess <p>其他厂商对象存储回源鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOthersPrivateAccess(OthersPrivateAccess OthersPrivateAccess) {
        this.OthersPrivateAccess = OthersPrivateAccess;
    }

    /**
     * Get <p>参数黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamFilter <p>参数黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamFilter getParamFilter() {
        return this.ParamFilter;
    }

    /**
     * Set <p>参数黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamFilter <p>参数黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamFilter(ParamFilter ParamFilter) {
        this.ParamFilter = ParamFilter;
    }

    /**
     * Get <p>流量一键防盗刷配置</p> 
     * @return AutoGuard <p>流量一键防盗刷配置</p>
     */
    public AutoGuard getAutoGuard() {
        return this.AutoGuard;
    }

    /**
     * Set <p>流量一键防盗刷配置</p>
     * @param AutoGuard <p>流量一键防盗刷配置</p>
     */
    public void setAutoGuard(AutoGuard AutoGuard) {
        this.AutoGuard = AutoGuard;
    }

    /**
     * Get <p>区域访问控制配置</p> 
     * @return GeoBlocker <p>区域访问控制配置</p>
     */
    public GeoBlocker getGeoBlocker() {
        return this.GeoBlocker;
    }

    /**
     * Set <p>区域访问控制配置</p>
     * @param GeoBlocker <p>区域访问控制配置</p>
     */
    public void setGeoBlocker(GeoBlocker GeoBlocker) {
        this.GeoBlocker = GeoBlocker;
    }

    public DetailDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailDomain(DetailDomain source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.IpFilter != null) {
            this.IpFilter = new IpFilter(source.IpFilter);
        }
        if (source.IpFreqLimit != null) {
            this.IpFreqLimit = new IpFreqLimit(source.IpFreqLimit);
        }
        if (source.StatusCodeCache != null) {
            this.StatusCodeCache = new StatusCodeCache(source.StatusCodeCache);
        }
        if (source.Compression != null) {
            this.Compression = new Compression(source.Compression);
        }
        if (source.BandwidthAlert != null) {
            this.BandwidthAlert = new BandwidthAlert(source.BandwidthAlert);
        }
        if (source.RangeOriginPull != null) {
            this.RangeOriginPull = new RangeOriginPull(source.RangeOriginPull);
        }
        if (source.FollowRedirect != null) {
            this.FollowRedirect = new FollowRedirect(source.FollowRedirect);
        }
        if (source.ErrorPage != null) {
            this.ErrorPage = new ErrorPage(source.ErrorPage);
        }
        if (source.RequestHeader != null) {
            this.RequestHeader = new RequestHeader(source.RequestHeader);
        }
        if (source.ResponseHeader != null) {
            this.ResponseHeader = new ResponseHeader(source.ResponseHeader);
        }
        if (source.DownstreamCapping != null) {
            this.DownstreamCapping = new DownstreamCapping(source.DownstreamCapping);
        }
        if (source.CacheKey != null) {
            this.CacheKey = new CacheKey(source.CacheKey);
        }
        if (source.ResponseHeaderCache != null) {
            this.ResponseHeaderCache = new ResponseHeaderCache(source.ResponseHeaderCache);
        }
        if (source.VideoSeek != null) {
            this.VideoSeek = new VideoSeek(source.VideoSeek);
        }
        if (source.Cache != null) {
            this.Cache = new Cache(source.Cache);
        }
        if (source.OriginPullOptimization != null) {
            this.OriginPullOptimization = new OriginPullOptimization(source.OriginPullOptimization);
        }
        if (source.Https != null) {
            this.Https = new Https(source.Https);
        }
        if (source.Authentication != null) {
            this.Authentication = new Authentication(source.Authentication);
        }
        if (source.Seo != null) {
            this.Seo = new Seo(source.Seo);
        }
        if (source.Disable != null) {
            this.Disable = new String(source.Disable);
        }
        if (source.ForceRedirect != null) {
            this.ForceRedirect = new ForceRedirect(source.ForceRedirect);
        }
        if (source.Referer != null) {
            this.Referer = new Referer(source.Referer);
        }
        if (source.MaxAge != null) {
            this.MaxAge = new MaxAge(source.MaxAge);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6(source.Ipv6);
        }
        if (source.Compatibility != null) {
            this.Compatibility = new Compatibility(source.Compatibility);
        }
        if (source.SpecificConfig != null) {
            this.SpecificConfig = new SpecificConfig(source.SpecificConfig);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Readonly != null) {
            this.Readonly = new String(source.Readonly);
        }
        if (source.OriginPullTimeout != null) {
            this.OriginPullTimeout = new OriginPullTimeout(source.OriginPullTimeout);
        }
        if (source.AwsPrivateAccess != null) {
            this.AwsPrivateAccess = new AwsPrivateAccess(source.AwsPrivateAccess);
        }
        if (source.SecurityConfig != null) {
            this.SecurityConfig = new SecurityConfig(source.SecurityConfig);
        }
        if (source.ImageOptimization != null) {
            this.ImageOptimization = new ImageOptimization(source.ImageOptimization);
        }
        if (source.UserAgentFilter != null) {
            this.UserAgentFilter = new UserAgentFilter(source.UserAgentFilter);
        }
        if (source.AccessControl != null) {
            this.AccessControl = new AccessControl(source.AccessControl);
        }
        if (source.Advance != null) {
            this.Advance = new String(source.Advance);
        }
        if (source.UrlRedirect != null) {
            this.UrlRedirect = new UrlRedirect(source.UrlRedirect);
        }
        if (source.AccessPort != null) {
            this.AccessPort = new Long[source.AccessPort.length];
            for (int i = 0; i < source.AccessPort.length; i++) {
                this.AccessPort[i] = new Long(source.AccessPort[i]);
            }
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.AdvancedAuthentication != null) {
            this.AdvancedAuthentication = new AdvancedAuthentication(source.AdvancedAuthentication);
        }
        if (source.OriginAuthentication != null) {
            this.OriginAuthentication = new OriginAuthentication(source.OriginAuthentication);
        }
        if (source.Ipv6Access != null) {
            this.Ipv6Access = new Ipv6Access(source.Ipv6Access);
        }
        if (source.AdvanceSet != null) {
            this.AdvanceSet = new AdvanceConfig[source.AdvanceSet.length];
            for (int i = 0; i < source.AdvanceSet.length; i++) {
                this.AdvanceSet[i] = new AdvanceConfig(source.AdvanceSet[i]);
            }
        }
        if (source.OfflineCache != null) {
            this.OfflineCache = new OfflineCache(source.OfflineCache);
        }
        if (source.OriginCombine != null) {
            this.OriginCombine = new OriginCombine(source.OriginCombine);
        }
        if (source.PostMaxSize != null) {
            this.PostMaxSize = new PostSize(source.PostMaxSize);
        }
        if (source.Quic != null) {
            this.Quic = new Quic(source.Quic);
        }
        if (source.OssPrivateAccess != null) {
            this.OssPrivateAccess = new OssPrivateAccess(source.OssPrivateAccess);
        }
        if (source.WebSocket != null) {
            this.WebSocket = new WebSocket(source.WebSocket);
        }
        if (source.RemoteAuthentication != null) {
            this.RemoteAuthentication = new RemoteAuthentication(source.RemoteAuthentication);
        }
        if (source.ShareCname != null) {
            this.ShareCname = new ShareCname(source.ShareCname);
        }
        if (source.RuleEngine != null) {
            this.RuleEngine = new RuleEngine(source.RuleEngine);
        }
        if (source.ParentHost != null) {
            this.ParentHost = new String(source.ParentHost);
        }
        if (source.HwPrivateAccess != null) {
            this.HwPrivateAccess = new HwPrivateAccess(source.HwPrivateAccess);
        }
        if (source.QnPrivateAccess != null) {
            this.QnPrivateAccess = new QnPrivateAccess(source.QnPrivateAccess);
        }
        if (source.HttpsBilling != null) {
            this.HttpsBilling = new HttpsBilling(source.HttpsBilling);
        }
        if (source.OthersPrivateAccess != null) {
            this.OthersPrivateAccess = new OthersPrivateAccess(source.OthersPrivateAccess);
        }
        if (source.ParamFilter != null) {
            this.ParamFilter = new ParamFilter(source.ParamFilter);
        }
        if (source.AutoGuard != null) {
            this.AutoGuard = new AutoGuard(source.AutoGuard);
        }
        if (source.GeoBlocker != null) {
            this.GeoBlocker = new GeoBlocker(source.GeoBlocker);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamObj(map, prefix + "IpFilter.", this.IpFilter);
        this.setParamObj(map, prefix + "IpFreqLimit.", this.IpFreqLimit);
        this.setParamObj(map, prefix + "StatusCodeCache.", this.StatusCodeCache);
        this.setParamObj(map, prefix + "Compression.", this.Compression);
        this.setParamObj(map, prefix + "BandwidthAlert.", this.BandwidthAlert);
        this.setParamObj(map, prefix + "RangeOriginPull.", this.RangeOriginPull);
        this.setParamObj(map, prefix + "FollowRedirect.", this.FollowRedirect);
        this.setParamObj(map, prefix + "ErrorPage.", this.ErrorPage);
        this.setParamObj(map, prefix + "RequestHeader.", this.RequestHeader);
        this.setParamObj(map, prefix + "ResponseHeader.", this.ResponseHeader);
        this.setParamObj(map, prefix + "DownstreamCapping.", this.DownstreamCapping);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "ResponseHeaderCache.", this.ResponseHeaderCache);
        this.setParamObj(map, prefix + "VideoSeek.", this.VideoSeek);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "OriginPullOptimization.", this.OriginPullOptimization);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamObj(map, prefix + "Authentication.", this.Authentication);
        this.setParamObj(map, prefix + "Seo.", this.Seo);
        this.setParamSimple(map, prefix + "Disable", this.Disable);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamObj(map, prefix + "Referer.", this.Referer);
        this.setParamObj(map, prefix + "MaxAge.", this.MaxAge);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamObj(map, prefix + "Compatibility.", this.Compatibility);
        this.setParamObj(map, prefix + "SpecificConfig.", this.SpecificConfig);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Readonly", this.Readonly);
        this.setParamObj(map, prefix + "OriginPullTimeout.", this.OriginPullTimeout);
        this.setParamObj(map, prefix + "AwsPrivateAccess.", this.AwsPrivateAccess);
        this.setParamObj(map, prefix + "SecurityConfig.", this.SecurityConfig);
        this.setParamObj(map, prefix + "ImageOptimization.", this.ImageOptimization);
        this.setParamObj(map, prefix + "UserAgentFilter.", this.UserAgentFilter);
        this.setParamObj(map, prefix + "AccessControl.", this.AccessControl);
        this.setParamSimple(map, prefix + "Advance", this.Advance);
        this.setParamObj(map, prefix + "UrlRedirect.", this.UrlRedirect);
        this.setParamArraySimple(map, prefix + "AccessPort.", this.AccessPort);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamObj(map, prefix + "AdvancedAuthentication.", this.AdvancedAuthentication);
        this.setParamObj(map, prefix + "OriginAuthentication.", this.OriginAuthentication);
        this.setParamObj(map, prefix + "Ipv6Access.", this.Ipv6Access);
        this.setParamArrayObj(map, prefix + "AdvanceSet.", this.AdvanceSet);
        this.setParamObj(map, prefix + "OfflineCache.", this.OfflineCache);
        this.setParamObj(map, prefix + "OriginCombine.", this.OriginCombine);
        this.setParamObj(map, prefix + "PostMaxSize.", this.PostMaxSize);
        this.setParamObj(map, prefix + "Quic.", this.Quic);
        this.setParamObj(map, prefix + "OssPrivateAccess.", this.OssPrivateAccess);
        this.setParamObj(map, prefix + "WebSocket.", this.WebSocket);
        this.setParamObj(map, prefix + "RemoteAuthentication.", this.RemoteAuthentication);
        this.setParamObj(map, prefix + "ShareCname.", this.ShareCname);
        this.setParamObj(map, prefix + "RuleEngine.", this.RuleEngine);
        this.setParamSimple(map, prefix + "ParentHost", this.ParentHost);
        this.setParamObj(map, prefix + "HwPrivateAccess.", this.HwPrivateAccess);
        this.setParamObj(map, prefix + "QnPrivateAccess.", this.QnPrivateAccess);
        this.setParamObj(map, prefix + "HttpsBilling.", this.HttpsBilling);
        this.setParamObj(map, prefix + "OthersPrivateAccess.", this.OthersPrivateAccess);
        this.setParamObj(map, prefix + "ParamFilter.", this.ParamFilter);
        this.setParamObj(map, prefix + "AutoGuard.", this.AutoGuard);
        this.setParamObj(map, prefix + "GeoBlocker.", this.GeoBlocker);

    }
}

