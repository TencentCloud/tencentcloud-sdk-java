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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailDomain extends AbstractModel{

    /**
    * 域名 ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 腾讯云账号ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 加速域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名对应的 CNAME 地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 加速服务状态
rejected：域名审核未通过，域名备案过期/被注销导致
processing：部署中
online：已启动
offline：已关闭
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 项目 ID，可前往腾讯云项目管理页面查看
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 加速域名业务类型
web：网页小文件
download：下载大文件
media：音视频点播
hybrid:  动静加速
dynamic:  动态加速
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 域名创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 域名更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 源站配置
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * IP 黑白名单配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * IP 访问限频配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpFreqLimit")
    @Expose
    private IpFreqLimit IpFreqLimit;

    /**
    * 状态码缓存配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusCodeCache")
    @Expose
    private StatusCodeCache StatusCodeCache;

    /**
    * 智能压缩配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * 带宽封顶配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthAlert")
    @Expose
    private BandwidthAlert BandwidthAlert;

    /**
    * Range 回源配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RangeOriginPull")
    @Expose
    private RangeOriginPull RangeOriginPull;

    /**
    * 301/302 回源自动跟随配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowRedirect")
    @Expose
    private FollowRedirect FollowRedirect;

    /**
    * 自定义错误页面配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorPage")
    @Expose
    private ErrorPage ErrorPage;

    /**
    * 自定义请求头部配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestHeader")
    @Expose
    private RequestHeader RequestHeader;

    /**
    * 自定义响应头部配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * 单链接下行限速配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownstreamCapping")
    @Expose
    private DownstreamCapping DownstreamCapping;

    /**
    * 带参/不带参缓存配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * 源站头部缓存配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseHeaderCache")
    @Expose
    private ResponseHeaderCache ResponseHeaderCache;

    /**
    * 视频拖拽配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoSeek")
    @Expose
    private VideoSeek VideoSeek;

    /**
    * 节点缓存过期规则配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * 跨国链路优化配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginPullOptimization")
    @Expose
    private OriginPullOptimization OriginPullOptimization;

    /**
    * Https 加速相关配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * 时间戳防盗链配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Authentication")
    @Expose
    private Authentication Authentication;

    /**
    * SEO 优化配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seo")
    @Expose
    private Seo Seo;

    /**
    * 域名封禁状态
normal：正常状态
overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务
malicious：域名出现恶意行为，强制关闭加速服务
ddos：域名被大规模 DDoS 攻击，关闭加速服务
idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务
unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务
capping：触发配置的带宽阈值上限
readonly：域名存在特殊配置，被锁定
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disable")
    @Expose
    private String Disable;

    /**
    * 访问协议强制跳转配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Referer 防盗链配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Referer")
    @Expose
    private Referer Referer;

    /**
    * 浏览器缓存过期规则配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * Ipv6 回源配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * 是否兼容旧版本配置（内部兼容性字段）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compatibility")
    @Expose
    private Compatibility Compatibility;

    /**
    * 区域特殊配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecificConfig")
    @Expose
    private SpecificConfig SpecificConfig;

    /**
    * 加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 域名锁定状态
normal：未锁定
mainland：中国境内锁定
overseas：中国境外锁定
global：全球锁定
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Readonly")
    @Expose
    private String Readonly;

    /**
    * 回源超时配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginPullTimeout")
    @Expose
    private OriginPullTimeout OriginPullTimeout;

    /**
    * 回源S3鉴权配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AwsPrivateAccess")
    @Expose
    private AwsPrivateAccess AwsPrivateAccess;

    /**
    * Scdn配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityConfig")
    @Expose
    private SecurityConfig SecurityConfig;

    /**
    * ImageOptimization配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageOptimization")
    @Expose
    private ImageOptimization ImageOptimization;

    /**
    * UA黑白名单配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAgentFilter")
    @Expose
    private UserAgentFilter UserAgentFilter;

    /**
    * 访问控制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessControl")
    @Expose
    private AccessControl AccessControl;

    /**
    * 是否支持高级配置项
on：支持
off：不支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Advance")
    @Expose
    private String Advance;

    /**
    * URL重定向配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UrlRedirect")
    @Expose
    private UrlRedirect UrlRedirect;

    /**
    * 访问端口配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessPort")
    @Expose
    private Long [] AccessPort;

    /**
    * 标签配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * 时间戳防盗链高级配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedAuthentication")
    @Expose
    private AdvancedAuthentication AdvancedAuthentication;

    /**
    * 回源鉴权高级配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginAuthentication")
    @Expose
    private OriginAuthentication OriginAuthentication;

    /**
    * Ipv6访问配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6Access")
    @Expose
    private Ipv6Access Ipv6Access;

    /**
    * 高级配置集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvanceSet")
    @Expose
    private AdvanceConfig [] AdvanceSet;

    /**
    * 离线缓存（功能灰度中，尚未全量，请等待后续全量发布）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * 合并回源（白名单功能）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginCombine")
    @Expose
    private OriginCombine OriginCombine;

    /**
    * POST上传配置项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostSize PostMaxSize;

    /**
    * Quic配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * 回源OSS私有鉴权
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OssPrivateAccess")
    @Expose
    private OssPrivateAccess OssPrivateAccess;

    /**
    * WebSocket配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * 远程鉴权配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteAuthentication")
    @Expose
    private RemoteAuthentication RemoteAuthentication;

    /**
    * 共享CNAME配置（白名单功能）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShareCname")
    @Expose
    private ShareCname ShareCname;

    /**
    * 规则引擎
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleEngine")
    @Expose
    private RuleEngine RuleEngine;

    /**
    * 主域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentHost")
    @Expose
    private String ParentHost;

    /**
    * 华为云对象存储回源鉴权
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HwPrivateAccess")
    @Expose
    private HwPrivateAccess HwPrivateAccess;

    /**
    * 七牛云对象存储回源鉴权
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QnPrivateAccess")
    @Expose
    private QnPrivateAccess QnPrivateAccess;

    /**
     * Get 域名 ID 
     * @return ResourceId 域名 ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 域名 ID
     * @param ResourceId 域名 ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 腾讯云账号ID 
     * @return AppId 腾讯云账号ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 腾讯云账号ID
     * @param AppId 腾讯云账号ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 加速域名 
     * @return Domain 加速域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 加速域名
     * @param Domain 加速域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名对应的 CNAME 地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cname 域名对应的 CNAME 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 域名对应的 CNAME 地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cname 域名对应的 CNAME 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 加速服务状态
rejected：域名审核未通过，域名备案过期/被注销导致
processing：部署中
online：已启动
offline：已关闭 
     * @return Status 加速服务状态
rejected：域名审核未通过，域名备案过期/被注销导致
processing：部署中
online：已启动
offline：已关闭
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 加速服务状态
rejected：域名审核未通过，域名备案过期/被注销导致
processing：部署中
online：已启动
offline：已关闭
     * @param Status 加速服务状态
rejected：域名审核未通过，域名备案过期/被注销导致
processing：部署中
online：已启动
offline：已关闭
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 项目 ID，可前往腾讯云项目管理页面查看 
     * @return ProjectId 项目 ID，可前往腾讯云项目管理页面查看
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID，可前往腾讯云项目管理页面查看
     * @param ProjectId 项目 ID，可前往腾讯云项目管理页面查看
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 加速域名业务类型
web：网页小文件
download：下载大文件
media：音视频点播
hybrid:  动静加速
dynamic:  动态加速 
     * @return ServiceType 加速域名业务类型
web：网页小文件
download：下载大文件
media：音视频点播
hybrid:  动静加速
dynamic:  动态加速
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 加速域名业务类型
web：网页小文件
download：下载大文件
media：音视频点播
hybrid:  动静加速
dynamic:  动态加速
     * @param ServiceType 加速域名业务类型
web：网页小文件
download：下载大文件
media：音视频点播
hybrid:  动静加速
dynamic:  动态加速
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 域名创建时间 
     * @return CreateTime 域名创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 域名创建时间
     * @param CreateTime 域名创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 域名更新时间 
     * @return UpdateTime 域名更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 域名更新时间
     * @param UpdateTime 域名更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 源站配置 
     * @return Origin 源站配置
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站配置
     * @param Origin 源站配置
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get IP 黑白名单配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpFilter IP 黑白名单配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP 黑白名单配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpFilter IP 黑白名单配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get IP 访问限频配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpFreqLimit IP 访问限频配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpFreqLimit getIpFreqLimit() {
        return this.IpFreqLimit;
    }

    /**
     * Set IP 访问限频配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpFreqLimit IP 访问限频配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpFreqLimit(IpFreqLimit IpFreqLimit) {
        this.IpFreqLimit = IpFreqLimit;
    }

    /**
     * Get 状态码缓存配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusCodeCache 状态码缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatusCodeCache getStatusCodeCache() {
        return this.StatusCodeCache;
    }

    /**
     * Set 状态码缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusCodeCache 状态码缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusCodeCache(StatusCodeCache StatusCodeCache) {
        this.StatusCodeCache = StatusCodeCache;
    }

    /**
     * Get 智能压缩配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compression 智能压缩配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set 智能压缩配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compression 智能压缩配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get 带宽封顶配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthAlert 带宽封顶配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BandwidthAlert getBandwidthAlert() {
        return this.BandwidthAlert;
    }

    /**
     * Set 带宽封顶配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthAlert 带宽封顶配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthAlert(BandwidthAlert BandwidthAlert) {
        this.BandwidthAlert = BandwidthAlert;
    }

    /**
     * Get Range 回源配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RangeOriginPull Range 回源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RangeOriginPull getRangeOriginPull() {
        return this.RangeOriginPull;
    }

    /**
     * Set Range 回源配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param RangeOriginPull Range 回源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRangeOriginPull(RangeOriginPull RangeOriginPull) {
        this.RangeOriginPull = RangeOriginPull;
    }

    /**
     * Get 301/302 回源自动跟随配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowRedirect 301/302 回源自动跟随配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FollowRedirect getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set 301/302 回源自动跟随配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowRedirect 301/302 回源自动跟随配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowRedirect(FollowRedirect FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get 自定义错误页面配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorPage 自定义错误页面配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set 自定义错误页面配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorPage 自定义错误页面配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorPage(ErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    /**
     * Get 自定义请求头部配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestHeader 自定义请求头部配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RequestHeader getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set 自定义请求头部配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestHeader 自定义请求头部配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestHeader(RequestHeader RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get 自定义响应头部配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseHeader 自定义响应头部配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set 自定义响应头部配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseHeader 自定义响应头部配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get 单链接下行限速配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownstreamCapping 单链接下行限速配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DownstreamCapping getDownstreamCapping() {
        return this.DownstreamCapping;
    }

    /**
     * Set 单链接下行限速配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownstreamCapping 单链接下行限速配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownstreamCapping(DownstreamCapping DownstreamCapping) {
        this.DownstreamCapping = DownstreamCapping;
    }

    /**
     * Get 带参/不带参缓存配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheKey 带参/不带参缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set 带参/不带参缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheKey 带参/不带参缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get 源站头部缓存配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseHeaderCache 源站头部缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResponseHeaderCache getResponseHeaderCache() {
        return this.ResponseHeaderCache;
    }

    /**
     * Set 源站头部缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseHeaderCache 源站头部缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseHeaderCache(ResponseHeaderCache ResponseHeaderCache) {
        this.ResponseHeaderCache = ResponseHeaderCache;
    }

    /**
     * Get 视频拖拽配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoSeek 视频拖拽配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoSeek getVideoSeek() {
        return this.VideoSeek;
    }

    /**
     * Set 视频拖拽配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoSeek 视频拖拽配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoSeek(VideoSeek VideoSeek) {
        this.VideoSeek = VideoSeek;
    }

    /**
     * Get 节点缓存过期规则配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cache 节点缓存过期规则配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set 节点缓存过期规则配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cache 节点缓存过期规则配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get 跨国链路优化配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginPullOptimization 跨国链路优化配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginPullOptimization getOriginPullOptimization() {
        return this.OriginPullOptimization;
    }

    /**
     * Set 跨国链路优化配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginPullOptimization 跨国链路优化配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginPullOptimization(OriginPullOptimization OriginPullOptimization) {
        this.OriginPullOptimization = OriginPullOptimization;
    }

    /**
     * Get Https 加速相关配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Https Https 加速相关配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Https 加速相关配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Https Https 加速相关配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get 时间戳防盗链配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Authentication 时间戳防盗链配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Authentication getAuthentication() {
        return this.Authentication;
    }

    /**
     * Set 时间戳防盗链配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Authentication 时间戳防盗链配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthentication(Authentication Authentication) {
        this.Authentication = Authentication;
    }

    /**
     * Get SEO 优化配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seo SEO 优化配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Seo getSeo() {
        return this.Seo;
    }

    /**
     * Set SEO 优化配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seo SEO 优化配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeo(Seo Seo) {
        this.Seo = Seo;
    }

    /**
     * Get 域名封禁状态
normal：正常状态
overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务
malicious：域名出现恶意行为，强制关闭加速服务
ddos：域名被大规模 DDoS 攻击，关闭加速服务
idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务
unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务
capping：触发配置的带宽阈值上限
readonly：域名存在特殊配置，被锁定
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disable 域名封禁状态
normal：正常状态
overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务
malicious：域名出现恶意行为，强制关闭加速服务
ddos：域名被大规模 DDoS 攻击，关闭加速服务
idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务
unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务
capping：触发配置的带宽阈值上限
readonly：域名存在特殊配置，被锁定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisable() {
        return this.Disable;
    }

    /**
     * Set 域名封禁状态
normal：正常状态
overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务
malicious：域名出现恶意行为，强制关闭加速服务
ddos：域名被大规模 DDoS 攻击，关闭加速服务
idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务
unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务
capping：触发配置的带宽阈值上限
readonly：域名存在特殊配置，被锁定
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disable 域名封禁状态
normal：正常状态
overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务
malicious：域名出现恶意行为，强制关闭加速服务
ddos：域名被大规模 DDoS 攻击，关闭加速服务
idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务
unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务
capping：触发配置的带宽阈值上限
readonly：域名存在特殊配置，被锁定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisable(String Disable) {
        this.Disable = Disable;
    }

    /**
     * Get 访问协议强制跳转配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForceRedirect 访问协议强制跳转配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set 访问协议强制跳转配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForceRedirect 访问协议强制跳转配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Referer 防盗链配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Referer Referer 防盗链配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Referer getReferer() {
        return this.Referer;
    }

    /**
     * Set Referer 防盗链配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Referer Referer 防盗链配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReferer(Referer Referer) {
        this.Referer = Referer;
    }

    /**
     * Get 浏览器缓存过期规则配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxAge 浏览器缓存过期规则配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set 浏览器缓存过期规则配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxAge 浏览器缓存过期规则配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Ipv6 回源配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6 Ipv6 回源配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6 回源配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6 Ipv6 回源配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get 是否兼容旧版本配置（内部兼容性字段）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compatibility 是否兼容旧版本配置（内部兼容性字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Compatibility getCompatibility() {
        return this.Compatibility;
    }

    /**
     * Set 是否兼容旧版本配置（内部兼容性字段）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compatibility 是否兼容旧版本配置（内部兼容性字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompatibility(Compatibility Compatibility) {
        this.Compatibility = Compatibility;
    }

    /**
     * Get 区域特殊配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecificConfig 区域特殊配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SpecificConfig getSpecificConfig() {
        return this.SpecificConfig;
    }

    /**
     * Set 区域特殊配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecificConfig 区域特殊配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecificConfig(SpecificConfig SpecificConfig) {
        this.SpecificConfig = SpecificConfig;
    }

    /**
     * Get 加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Area 加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
注意：此字段可能返回 null，表示取不到有效值。
     * @param Area 加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 域名锁定状态
normal：未锁定
mainland：中国境内锁定
overseas：中国境外锁定
global：全球锁定
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Readonly 域名锁定状态
normal：未锁定
mainland：中国境内锁定
overseas：中国境外锁定
global：全球锁定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReadonly() {
        return this.Readonly;
    }

    /**
     * Set 域名锁定状态
normal：未锁定
mainland：中国境内锁定
overseas：中国境外锁定
global：全球锁定
注意：此字段可能返回 null，表示取不到有效值。
     * @param Readonly 域名锁定状态
normal：未锁定
mainland：中国境内锁定
overseas：中国境外锁定
global：全球锁定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadonly(String Readonly) {
        this.Readonly = Readonly;
    }

    /**
     * Get 回源超时配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginPullTimeout 回源超时配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginPullTimeout getOriginPullTimeout() {
        return this.OriginPullTimeout;
    }

    /**
     * Set 回源超时配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginPullTimeout 回源超时配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginPullTimeout(OriginPullTimeout OriginPullTimeout) {
        this.OriginPullTimeout = OriginPullTimeout;
    }

    /**
     * Get 回源S3鉴权配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AwsPrivateAccess 回源S3鉴权配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AwsPrivateAccess getAwsPrivateAccess() {
        return this.AwsPrivateAccess;
    }

    /**
     * Set 回源S3鉴权配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AwsPrivateAccess 回源S3鉴权配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAwsPrivateAccess(AwsPrivateAccess AwsPrivateAccess) {
        this.AwsPrivateAccess = AwsPrivateAccess;
    }

    /**
     * Get Scdn配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityConfig Scdn配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityConfig getSecurityConfig() {
        return this.SecurityConfig;
    }

    /**
     * Set Scdn配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityConfig Scdn配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityConfig(SecurityConfig SecurityConfig) {
        this.SecurityConfig = SecurityConfig;
    }

    /**
     * Get ImageOptimization配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageOptimization ImageOptimization配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageOptimization getImageOptimization() {
        return this.ImageOptimization;
    }

    /**
     * Set ImageOptimization配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageOptimization ImageOptimization配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageOptimization(ImageOptimization ImageOptimization) {
        this.ImageOptimization = ImageOptimization;
    }

    /**
     * Get UA黑白名单配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAgentFilter UA黑白名单配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserAgentFilter getUserAgentFilter() {
        return this.UserAgentFilter;
    }

    /**
     * Set UA黑白名单配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAgentFilter UA黑白名单配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAgentFilter(UserAgentFilter UserAgentFilter) {
        this.UserAgentFilter = UserAgentFilter;
    }

    /**
     * Get 访问控制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessControl 访问控制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccessControl getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set 访问控制
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessControl 访问控制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessControl(AccessControl AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get 是否支持高级配置项
on：支持
off：不支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Advance 是否支持高级配置项
on：支持
off：不支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdvance() {
        return this.Advance;
    }

    /**
     * Set 是否支持高级配置项
on：支持
off：不支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param Advance 是否支持高级配置项
on：支持
off：不支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvance(String Advance) {
        this.Advance = Advance;
    }

    /**
     * Get URL重定向配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UrlRedirect URL重定向配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UrlRedirect getUrlRedirect() {
        return this.UrlRedirect;
    }

    /**
     * Set URL重定向配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param UrlRedirect URL重定向配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrlRedirect(UrlRedirect UrlRedirect) {
        this.UrlRedirect = UrlRedirect;
    }

    /**
     * Get 访问端口配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessPort 访问端口配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAccessPort() {
        return this.AccessPort;
    }

    /**
     * Set 访问端口配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessPort 访问端口配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessPort(Long [] AccessPort) {
        this.AccessPort = AccessPort;
    }

    /**
     * Get 标签配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 标签配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 标签配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 时间戳防盗链高级配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedAuthentication 时间戳防盗链高级配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedAuthentication getAdvancedAuthentication() {
        return this.AdvancedAuthentication;
    }

    /**
     * Set 时间戳防盗链高级配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedAuthentication 时间戳防盗链高级配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedAuthentication(AdvancedAuthentication AdvancedAuthentication) {
        this.AdvancedAuthentication = AdvancedAuthentication;
    }

    /**
     * Get 回源鉴权高级配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginAuthentication 回源鉴权高级配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginAuthentication getOriginAuthentication() {
        return this.OriginAuthentication;
    }

    /**
     * Set 回源鉴权高级配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginAuthentication 回源鉴权高级配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginAuthentication(OriginAuthentication OriginAuthentication) {
        this.OriginAuthentication = OriginAuthentication;
    }

    /**
     * Get Ipv6访问配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6Access Ipv6访问配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Ipv6Access getIpv6Access() {
        return this.Ipv6Access;
    }

    /**
     * Set Ipv6访问配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6Access Ipv6访问配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6Access(Ipv6Access Ipv6Access) {
        this.Ipv6Access = Ipv6Access;
    }

    /**
     * Get 高级配置集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvanceSet 高级配置集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvanceConfig [] getAdvanceSet() {
        return this.AdvanceSet;
    }

    /**
     * Set 高级配置集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvanceSet 高级配置集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvanceSet(AdvanceConfig [] AdvanceSet) {
        this.AdvanceSet = AdvanceSet;
    }

    /**
     * Get 离线缓存（功能灰度中，尚未全量，请等待后续全量发布）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineCache 离线缓存（功能灰度中，尚未全量，请等待后续全量发布）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OfflineCache getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set 离线缓存（功能灰度中，尚未全量，请等待后续全量发布）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineCache 离线缓存（功能灰度中，尚未全量，请等待后续全量发布）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineCache(OfflineCache OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get 合并回源（白名单功能）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginCombine 合并回源（白名单功能）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginCombine getOriginCombine() {
        return this.OriginCombine;
    }

    /**
     * Set 合并回源（白名单功能）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginCombine 合并回源（白名单功能）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginCombine(OriginCombine OriginCombine) {
        this.OriginCombine = OriginCombine;
    }

    /**
     * Get POST上传配置项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostMaxSize POST上传配置项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PostSize getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set POST上传配置项
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostMaxSize POST上传配置项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostMaxSize(PostSize PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get Quic配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quic Quic配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set Quic配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quic Quic配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get 回源OSS私有鉴权
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OssPrivateAccess 回源OSS私有鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OssPrivateAccess getOssPrivateAccess() {
        return this.OssPrivateAccess;
    }

    /**
     * Set 回源OSS私有鉴权
注意：此字段可能返回 null，表示取不到有效值。
     * @param OssPrivateAccess 回源OSS私有鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOssPrivateAccess(OssPrivateAccess OssPrivateAccess) {
        this.OssPrivateAccess = OssPrivateAccess;
    }

    /**
     * Get WebSocket配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebSocket WebSocket配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebSocket getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebSocket WebSocket配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebSocket(WebSocket WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get 远程鉴权配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteAuthentication 远程鉴权配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RemoteAuthentication getRemoteAuthentication() {
        return this.RemoteAuthentication;
    }

    /**
     * Set 远程鉴权配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteAuthentication 远程鉴权配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteAuthentication(RemoteAuthentication RemoteAuthentication) {
        this.RemoteAuthentication = RemoteAuthentication;
    }

    /**
     * Get 共享CNAME配置（白名单功能）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShareCname 共享CNAME配置（白名单功能）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ShareCname getShareCname() {
        return this.ShareCname;
    }

    /**
     * Set 共享CNAME配置（白名单功能）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShareCname 共享CNAME配置（白名单功能）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShareCname(ShareCname ShareCname) {
        this.ShareCname = ShareCname;
    }

    /**
     * Get 规则引擎
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleEngine 规则引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleEngine getRuleEngine() {
        return this.RuleEngine;
    }

    /**
     * Set 规则引擎
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleEngine 规则引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleEngine(RuleEngine RuleEngine) {
        this.RuleEngine = RuleEngine;
    }

    /**
     * Get 主域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentHost 主域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentHost() {
        return this.ParentHost;
    }

    /**
     * Set 主域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentHost 主域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentHost(String ParentHost) {
        this.ParentHost = ParentHost;
    }

    /**
     * Get 华为云对象存储回源鉴权
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HwPrivateAccess 华为云对象存储回源鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HwPrivateAccess getHwPrivateAccess() {
        return this.HwPrivateAccess;
    }

    /**
     * Set 华为云对象存储回源鉴权
注意：此字段可能返回 null，表示取不到有效值。
     * @param HwPrivateAccess 华为云对象存储回源鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHwPrivateAccess(HwPrivateAccess HwPrivateAccess) {
        this.HwPrivateAccess = HwPrivateAccess;
    }

    /**
     * Get 七牛云对象存储回源鉴权
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QnPrivateAccess 七牛云对象存储回源鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QnPrivateAccess getQnPrivateAccess() {
        return this.QnPrivateAccess;
    }

    /**
     * Set 七牛云对象存储回源鉴权
注意：此字段可能返回 null，表示取不到有效值。
     * @param QnPrivateAccess 七牛云对象存储回源鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQnPrivateAccess(QnPrivateAccess QnPrivateAccess) {
        this.QnPrivateAccess = QnPrivateAccess;
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

    }
}

