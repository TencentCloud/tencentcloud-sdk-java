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

public class UpdateDomainConfigRequest extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 项目 ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 源站配置
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * IP 黑白名单配置
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * IP 限频配置
    */
    @SerializedName("IpFreqLimit")
    @Expose
    private IpFreqLimit IpFreqLimit;

    /**
    * 状态码缓存配置
    */
    @SerializedName("StatusCodeCache")
    @Expose
    private StatusCodeCache StatusCodeCache;

    /**
    * 智能压缩配置
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * 带宽封顶配置
    */
    @SerializedName("BandwidthAlert")
    @Expose
    private BandwidthAlert BandwidthAlert;

    /**
    * Range 回源配置
    */
    @SerializedName("RangeOriginPull")
    @Expose
    private RangeOriginPull RangeOriginPull;

    /**
    * 301/302 回源跟随配置
    */
    @SerializedName("FollowRedirect")
    @Expose
    private FollowRedirect FollowRedirect;

    /**
    * 错误码重定向配置（功能灰度中，尚未全量）
    */
    @SerializedName("ErrorPage")
    @Expose
    private ErrorPage ErrorPage;

    /**
    * 请求头部配置
    */
    @SerializedName("RequestHeader")
    @Expose
    private RequestHeader RequestHeader;

    /**
    * 响应头部配置
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * 下载速度配置
    */
    @SerializedName("DownstreamCapping")
    @Expose
    private DownstreamCapping DownstreamCapping;

    /**
    * 节点缓存键配置
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * 头部缓存配置
    */
    @SerializedName("ResponseHeaderCache")
    @Expose
    private ResponseHeaderCache ResponseHeaderCache;

    /**
    * 视频拖拽配置
    */
    @SerializedName("VideoSeek")
    @Expose
    private VideoSeek VideoSeek;

    /**
    * 缓存过期时间配置
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * 跨国链路优化配置
    */
    @SerializedName("OriginPullOptimization")
    @Expose
    private OriginPullOptimization OriginPullOptimization;

    /**
    * Https 加速配置
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * 时间戳防盗链配置
    */
    @SerializedName("Authentication")
    @Expose
    private Authentication Authentication;

    /**
    * SEO 优化配置
    */
    @SerializedName("Seo")
    @Expose
    private Seo Seo;

    /**
    * 访问协议强制跳转配置
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Referer 防盗链配置
    */
    @SerializedName("Referer")
    @Expose
    private Referer Referer;

    /**
    * 浏览器缓存配置（功能灰度中，尚未全量）
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * 地域属性特殊配置
适用于域名境内加速、境外加速配置不一致场景
    */
    @SerializedName("SpecificConfig")
    @Expose
    private SpecificConfig SpecificConfig;

    /**
    * 域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 域名加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
从mainland/overseas修改至global时，域名的配置将被同步至overseas/mainland。若域名含有后端特殊配置，此类配置的同步过程有一定延时，请耐心等待
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 回源超时配置
    */
    @SerializedName("OriginPullTimeout")
    @Expose
    private OriginPullTimeout OriginPullTimeout;

    /**
    * 回源S3私有鉴权
    */
    @SerializedName("AwsPrivateAccess")
    @Expose
    private AwsPrivateAccess AwsPrivateAccess;

    /**
    * UA黑白名单配置
    */
    @SerializedName("UserAgentFilter")
    @Expose
    private UserAgentFilter UserAgentFilter;

    /**
    * 访问控制
    */
    @SerializedName("AccessControl")
    @Expose
    private AccessControl AccessControl;

    /**
    * 访问URL重写配置
    */
    @SerializedName("UrlRedirect")
    @Expose
    private UrlRedirect UrlRedirect;

    /**
    * 访问端口配置
    */
    @SerializedName("AccessPort")
    @Expose
    private Long [] AccessPort;

    /**
    * 时间戳防盗链高级版配置，白名单功能
    */
    @SerializedName("AdvancedAuthentication")
    @Expose
    private AdvancedAuthentication AdvancedAuthentication;

    /**
    * 回源鉴权高级版配置，白名单功能
    */
    @SerializedName("OriginAuthentication")
    @Expose
    private OriginAuthentication OriginAuthentication;

    /**
    * Ipv6 访问配置
    */
    @SerializedName("Ipv6Access")
    @Expose
    private Ipv6Access Ipv6Access;

    /**
    * 离线缓存
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * 合并回源
    */
    @SerializedName("OriginCombine")
    @Expose
    private OriginCombine OriginCombine;

    /**
    * POST请求传输配置
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostSize PostMaxSize;

    /**
    * Quic访问（收费服务，详见计费说明和产品文档）
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * 回源OSS私有鉴权
    */
    @SerializedName("OssPrivateAccess")
    @Expose
    private OssPrivateAccess OssPrivateAccess;

    /**
    * WebSocket配置
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * 远程鉴权配置
    */
    @SerializedName("RemoteAuthentication")
    @Expose
    private RemoteAuthentication RemoteAuthentication;

    /**
    * 共享CNAME配置，白名单功能
    */
    @SerializedName("ShareCname")
    @Expose
    private ShareCname ShareCname;

    /**
    * 华为云对象存储回源鉴权
    */
    @SerializedName("HwPrivateAccess")
    @Expose
    private HwPrivateAccess HwPrivateAccess;

    /**
    * 七牛云对象存储回源鉴权
    */
    @SerializedName("QnPrivateAccess")
    @Expose
    private QnPrivateAccess QnPrivateAccess;

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
     * Get 项目 ID 
     * @return ProjectId 项目 ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID
     * @param ProjectId 项目 ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * @return IpFilter IP 黑白名单配置
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP 黑白名单配置
     * @param IpFilter IP 黑白名单配置
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get IP 限频配置 
     * @return IpFreqLimit IP 限频配置
     */
    public IpFreqLimit getIpFreqLimit() {
        return this.IpFreqLimit;
    }

    /**
     * Set IP 限频配置
     * @param IpFreqLimit IP 限频配置
     */
    public void setIpFreqLimit(IpFreqLimit IpFreqLimit) {
        this.IpFreqLimit = IpFreqLimit;
    }

    /**
     * Get 状态码缓存配置 
     * @return StatusCodeCache 状态码缓存配置
     */
    public StatusCodeCache getStatusCodeCache() {
        return this.StatusCodeCache;
    }

    /**
     * Set 状态码缓存配置
     * @param StatusCodeCache 状态码缓存配置
     */
    public void setStatusCodeCache(StatusCodeCache StatusCodeCache) {
        this.StatusCodeCache = StatusCodeCache;
    }

    /**
     * Get 智能压缩配置 
     * @return Compression 智能压缩配置
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set 智能压缩配置
     * @param Compression 智能压缩配置
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get 带宽封顶配置 
     * @return BandwidthAlert 带宽封顶配置
     */
    public BandwidthAlert getBandwidthAlert() {
        return this.BandwidthAlert;
    }

    /**
     * Set 带宽封顶配置
     * @param BandwidthAlert 带宽封顶配置
     */
    public void setBandwidthAlert(BandwidthAlert BandwidthAlert) {
        this.BandwidthAlert = BandwidthAlert;
    }

    /**
     * Get Range 回源配置 
     * @return RangeOriginPull Range 回源配置
     */
    public RangeOriginPull getRangeOriginPull() {
        return this.RangeOriginPull;
    }

    /**
     * Set Range 回源配置
     * @param RangeOriginPull Range 回源配置
     */
    public void setRangeOriginPull(RangeOriginPull RangeOriginPull) {
        this.RangeOriginPull = RangeOriginPull;
    }

    /**
     * Get 301/302 回源跟随配置 
     * @return FollowRedirect 301/302 回源跟随配置
     */
    public FollowRedirect getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set 301/302 回源跟随配置
     * @param FollowRedirect 301/302 回源跟随配置
     */
    public void setFollowRedirect(FollowRedirect FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get 错误码重定向配置（功能灰度中，尚未全量） 
     * @return ErrorPage 错误码重定向配置（功能灰度中，尚未全量）
     */
    public ErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set 错误码重定向配置（功能灰度中，尚未全量）
     * @param ErrorPage 错误码重定向配置（功能灰度中，尚未全量）
     */
    public void setErrorPage(ErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    /**
     * Get 请求头部配置 
     * @return RequestHeader 请求头部配置
     */
    public RequestHeader getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set 请求头部配置
     * @param RequestHeader 请求头部配置
     */
    public void setRequestHeader(RequestHeader RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get 响应头部配置 
     * @return ResponseHeader 响应头部配置
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set 响应头部配置
     * @param ResponseHeader 响应头部配置
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get 下载速度配置 
     * @return DownstreamCapping 下载速度配置
     */
    public DownstreamCapping getDownstreamCapping() {
        return this.DownstreamCapping;
    }

    /**
     * Set 下载速度配置
     * @param DownstreamCapping 下载速度配置
     */
    public void setDownstreamCapping(DownstreamCapping DownstreamCapping) {
        this.DownstreamCapping = DownstreamCapping;
    }

    /**
     * Get 节点缓存键配置 
     * @return CacheKey 节点缓存键配置
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set 节点缓存键配置
     * @param CacheKey 节点缓存键配置
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get 头部缓存配置 
     * @return ResponseHeaderCache 头部缓存配置
     */
    public ResponseHeaderCache getResponseHeaderCache() {
        return this.ResponseHeaderCache;
    }

    /**
     * Set 头部缓存配置
     * @param ResponseHeaderCache 头部缓存配置
     */
    public void setResponseHeaderCache(ResponseHeaderCache ResponseHeaderCache) {
        this.ResponseHeaderCache = ResponseHeaderCache;
    }

    /**
     * Get 视频拖拽配置 
     * @return VideoSeek 视频拖拽配置
     */
    public VideoSeek getVideoSeek() {
        return this.VideoSeek;
    }

    /**
     * Set 视频拖拽配置
     * @param VideoSeek 视频拖拽配置
     */
    public void setVideoSeek(VideoSeek VideoSeek) {
        this.VideoSeek = VideoSeek;
    }

    /**
     * Get 缓存过期时间配置 
     * @return Cache 缓存过期时间配置
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set 缓存过期时间配置
     * @param Cache 缓存过期时间配置
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get 跨国链路优化配置 
     * @return OriginPullOptimization 跨国链路优化配置
     */
    public OriginPullOptimization getOriginPullOptimization() {
        return this.OriginPullOptimization;
    }

    /**
     * Set 跨国链路优化配置
     * @param OriginPullOptimization 跨国链路优化配置
     */
    public void setOriginPullOptimization(OriginPullOptimization OriginPullOptimization) {
        this.OriginPullOptimization = OriginPullOptimization;
    }

    /**
     * Get Https 加速配置 
     * @return Https Https 加速配置
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Https 加速配置
     * @param Https Https 加速配置
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get 时间戳防盗链配置 
     * @return Authentication 时间戳防盗链配置
     */
    public Authentication getAuthentication() {
        return this.Authentication;
    }

    /**
     * Set 时间戳防盗链配置
     * @param Authentication 时间戳防盗链配置
     */
    public void setAuthentication(Authentication Authentication) {
        this.Authentication = Authentication;
    }

    /**
     * Get SEO 优化配置 
     * @return Seo SEO 优化配置
     */
    public Seo getSeo() {
        return this.Seo;
    }

    /**
     * Set SEO 优化配置
     * @param Seo SEO 优化配置
     */
    public void setSeo(Seo Seo) {
        this.Seo = Seo;
    }

    /**
     * Get 访问协议强制跳转配置 
     * @return ForceRedirect 访问协议强制跳转配置
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set 访问协议强制跳转配置
     * @param ForceRedirect 访问协议强制跳转配置
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Referer 防盗链配置 
     * @return Referer Referer 防盗链配置
     */
    public Referer getReferer() {
        return this.Referer;
    }

    /**
     * Set Referer 防盗链配置
     * @param Referer Referer 防盗链配置
     */
    public void setReferer(Referer Referer) {
        this.Referer = Referer;
    }

    /**
     * Get 浏览器缓存配置（功能灰度中，尚未全量） 
     * @return MaxAge 浏览器缓存配置（功能灰度中，尚未全量）
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set 浏览器缓存配置（功能灰度中，尚未全量）
     * @param MaxAge 浏览器缓存配置（功能灰度中，尚未全量）
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get 地域属性特殊配置
适用于域名境内加速、境外加速配置不一致场景 
     * @return SpecificConfig 地域属性特殊配置
适用于域名境内加速、境外加速配置不一致场景
     */
    public SpecificConfig getSpecificConfig() {
        return this.SpecificConfig;
    }

    /**
     * Set 地域属性特殊配置
适用于域名境内加速、境外加速配置不一致场景
     * @param SpecificConfig 地域属性特殊配置
适用于域名境内加速、境外加速配置不一致场景
     */
    public void setSpecificConfig(SpecificConfig SpecificConfig) {
        this.SpecificConfig = SpecificConfig;
    }

    /**
     * Get 域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速 
     * @return ServiceType 域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速
     * @param ServiceType 域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 域名加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
从mainland/overseas修改至global时，域名的配置将被同步至overseas/mainland。若域名含有后端特殊配置，此类配置的同步过程有一定延时，请耐心等待 
     * @return Area 域名加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
从mainland/overseas修改至global时，域名的配置将被同步至overseas/mainland。若域名含有后端特殊配置，此类配置的同步过程有一定延时，请耐心等待
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 域名加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
从mainland/overseas修改至global时，域名的配置将被同步至overseas/mainland。若域名含有后端特殊配置，此类配置的同步过程有一定延时，请耐心等待
     * @param Area 域名加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
从mainland/overseas修改至global时，域名的配置将被同步至overseas/mainland。若域名含有后端特殊配置，此类配置的同步过程有一定延时，请耐心等待
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 回源超时配置 
     * @return OriginPullTimeout 回源超时配置
     */
    public OriginPullTimeout getOriginPullTimeout() {
        return this.OriginPullTimeout;
    }

    /**
     * Set 回源超时配置
     * @param OriginPullTimeout 回源超时配置
     */
    public void setOriginPullTimeout(OriginPullTimeout OriginPullTimeout) {
        this.OriginPullTimeout = OriginPullTimeout;
    }

    /**
     * Get 回源S3私有鉴权 
     * @return AwsPrivateAccess 回源S3私有鉴权
     */
    public AwsPrivateAccess getAwsPrivateAccess() {
        return this.AwsPrivateAccess;
    }

    /**
     * Set 回源S3私有鉴权
     * @param AwsPrivateAccess 回源S3私有鉴权
     */
    public void setAwsPrivateAccess(AwsPrivateAccess AwsPrivateAccess) {
        this.AwsPrivateAccess = AwsPrivateAccess;
    }

    /**
     * Get UA黑白名单配置 
     * @return UserAgentFilter UA黑白名单配置
     */
    public UserAgentFilter getUserAgentFilter() {
        return this.UserAgentFilter;
    }

    /**
     * Set UA黑白名单配置
     * @param UserAgentFilter UA黑白名单配置
     */
    public void setUserAgentFilter(UserAgentFilter UserAgentFilter) {
        this.UserAgentFilter = UserAgentFilter;
    }

    /**
     * Get 访问控制 
     * @return AccessControl 访问控制
     */
    public AccessControl getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set 访问控制
     * @param AccessControl 访问控制
     */
    public void setAccessControl(AccessControl AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get 访问URL重写配置 
     * @return UrlRedirect 访问URL重写配置
     */
    public UrlRedirect getUrlRedirect() {
        return this.UrlRedirect;
    }

    /**
     * Set 访问URL重写配置
     * @param UrlRedirect 访问URL重写配置
     */
    public void setUrlRedirect(UrlRedirect UrlRedirect) {
        this.UrlRedirect = UrlRedirect;
    }

    /**
     * Get 访问端口配置 
     * @return AccessPort 访问端口配置
     */
    public Long [] getAccessPort() {
        return this.AccessPort;
    }

    /**
     * Set 访问端口配置
     * @param AccessPort 访问端口配置
     */
    public void setAccessPort(Long [] AccessPort) {
        this.AccessPort = AccessPort;
    }

    /**
     * Get 时间戳防盗链高级版配置，白名单功能 
     * @return AdvancedAuthentication 时间戳防盗链高级版配置，白名单功能
     */
    public AdvancedAuthentication getAdvancedAuthentication() {
        return this.AdvancedAuthentication;
    }

    /**
     * Set 时间戳防盗链高级版配置，白名单功能
     * @param AdvancedAuthentication 时间戳防盗链高级版配置，白名单功能
     */
    public void setAdvancedAuthentication(AdvancedAuthentication AdvancedAuthentication) {
        this.AdvancedAuthentication = AdvancedAuthentication;
    }

    /**
     * Get 回源鉴权高级版配置，白名单功能 
     * @return OriginAuthentication 回源鉴权高级版配置，白名单功能
     */
    public OriginAuthentication getOriginAuthentication() {
        return this.OriginAuthentication;
    }

    /**
     * Set 回源鉴权高级版配置，白名单功能
     * @param OriginAuthentication 回源鉴权高级版配置，白名单功能
     */
    public void setOriginAuthentication(OriginAuthentication OriginAuthentication) {
        this.OriginAuthentication = OriginAuthentication;
    }

    /**
     * Get Ipv6 访问配置 
     * @return Ipv6Access Ipv6 访问配置
     */
    public Ipv6Access getIpv6Access() {
        return this.Ipv6Access;
    }

    /**
     * Set Ipv6 访问配置
     * @param Ipv6Access Ipv6 访问配置
     */
    public void setIpv6Access(Ipv6Access Ipv6Access) {
        this.Ipv6Access = Ipv6Access;
    }

    /**
     * Get 离线缓存 
     * @return OfflineCache 离线缓存
     */
    public OfflineCache getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set 离线缓存
     * @param OfflineCache 离线缓存
     */
    public void setOfflineCache(OfflineCache OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get 合并回源 
     * @return OriginCombine 合并回源
     */
    public OriginCombine getOriginCombine() {
        return this.OriginCombine;
    }

    /**
     * Set 合并回源
     * @param OriginCombine 合并回源
     */
    public void setOriginCombine(OriginCombine OriginCombine) {
        this.OriginCombine = OriginCombine;
    }

    /**
     * Get POST请求传输配置 
     * @return PostMaxSize POST请求传输配置
     */
    public PostSize getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set POST请求传输配置
     * @param PostMaxSize POST请求传输配置
     */
    public void setPostMaxSize(PostSize PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get Quic访问（收费服务，详见计费说明和产品文档） 
     * @return Quic Quic访问（收费服务，详见计费说明和产品文档）
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set Quic访问（收费服务，详见计费说明和产品文档）
     * @param Quic Quic访问（收费服务，详见计费说明和产品文档）
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get 回源OSS私有鉴权 
     * @return OssPrivateAccess 回源OSS私有鉴权
     */
    public OssPrivateAccess getOssPrivateAccess() {
        return this.OssPrivateAccess;
    }

    /**
     * Set 回源OSS私有鉴权
     * @param OssPrivateAccess 回源OSS私有鉴权
     */
    public void setOssPrivateAccess(OssPrivateAccess OssPrivateAccess) {
        this.OssPrivateAccess = OssPrivateAccess;
    }

    /**
     * Get WebSocket配置 
     * @return WebSocket WebSocket配置
     */
    public WebSocket getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket配置
     * @param WebSocket WebSocket配置
     */
    public void setWebSocket(WebSocket WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get 远程鉴权配置 
     * @return RemoteAuthentication 远程鉴权配置
     */
    public RemoteAuthentication getRemoteAuthentication() {
        return this.RemoteAuthentication;
    }

    /**
     * Set 远程鉴权配置
     * @param RemoteAuthentication 远程鉴权配置
     */
    public void setRemoteAuthentication(RemoteAuthentication RemoteAuthentication) {
        this.RemoteAuthentication = RemoteAuthentication;
    }

    /**
     * Get 共享CNAME配置，白名单功能 
     * @return ShareCname 共享CNAME配置，白名单功能
     */
    public ShareCname getShareCname() {
        return this.ShareCname;
    }

    /**
     * Set 共享CNAME配置，白名单功能
     * @param ShareCname 共享CNAME配置，白名单功能
     */
    public void setShareCname(ShareCname ShareCname) {
        this.ShareCname = ShareCname;
    }

    /**
     * Get 华为云对象存储回源鉴权 
     * @return HwPrivateAccess 华为云对象存储回源鉴权
     */
    public HwPrivateAccess getHwPrivateAccess() {
        return this.HwPrivateAccess;
    }

    /**
     * Set 华为云对象存储回源鉴权
     * @param HwPrivateAccess 华为云对象存储回源鉴权
     */
    public void setHwPrivateAccess(HwPrivateAccess HwPrivateAccess) {
        this.HwPrivateAccess = HwPrivateAccess;
    }

    /**
     * Get 七牛云对象存储回源鉴权 
     * @return QnPrivateAccess 七牛云对象存储回源鉴权
     */
    public QnPrivateAccess getQnPrivateAccess() {
        return this.QnPrivateAccess;
    }

    /**
     * Set 七牛云对象存储回源鉴权
     * @param QnPrivateAccess 七牛云对象存储回源鉴权
     */
    public void setQnPrivateAccess(QnPrivateAccess QnPrivateAccess) {
        this.QnPrivateAccess = QnPrivateAccess;
    }

    public UpdateDomainConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDomainConfigRequest(UpdateDomainConfigRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
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
        if (source.ForceRedirect != null) {
            this.ForceRedirect = new ForceRedirect(source.ForceRedirect);
        }
        if (source.Referer != null) {
            this.Referer = new Referer(source.Referer);
        }
        if (source.MaxAge != null) {
            this.MaxAge = new MaxAge(source.MaxAge);
        }
        if (source.SpecificConfig != null) {
            this.SpecificConfig = new SpecificConfig(source.SpecificConfig);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.OriginPullTimeout != null) {
            this.OriginPullTimeout = new OriginPullTimeout(source.OriginPullTimeout);
        }
        if (source.AwsPrivateAccess != null) {
            this.AwsPrivateAccess = new AwsPrivateAccess(source.AwsPrivateAccess);
        }
        if (source.UserAgentFilter != null) {
            this.UserAgentFilter = new UserAgentFilter(source.UserAgentFilter);
        }
        if (source.AccessControl != null) {
            this.AccessControl = new AccessControl(source.AccessControl);
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
        if (source.AdvancedAuthentication != null) {
            this.AdvancedAuthentication = new AdvancedAuthentication(source.AdvancedAuthentication);
        }
        if (source.OriginAuthentication != null) {
            this.OriginAuthentication = new OriginAuthentication(source.OriginAuthentication);
        }
        if (source.Ipv6Access != null) {
            this.Ipv6Access = new Ipv6Access(source.Ipv6Access);
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
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
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
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamObj(map, prefix + "Referer.", this.Referer);
        this.setParamObj(map, prefix + "MaxAge.", this.MaxAge);
        this.setParamObj(map, prefix + "SpecificConfig.", this.SpecificConfig);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamObj(map, prefix + "OriginPullTimeout.", this.OriginPullTimeout);
        this.setParamObj(map, prefix + "AwsPrivateAccess.", this.AwsPrivateAccess);
        this.setParamObj(map, prefix + "UserAgentFilter.", this.UserAgentFilter);
        this.setParamObj(map, prefix + "AccessControl.", this.AccessControl);
        this.setParamObj(map, prefix + "UrlRedirect.", this.UrlRedirect);
        this.setParamArraySimple(map, prefix + "AccessPort.", this.AccessPort);
        this.setParamObj(map, prefix + "AdvancedAuthentication.", this.AdvancedAuthentication);
        this.setParamObj(map, prefix + "OriginAuthentication.", this.OriginAuthentication);
        this.setParamObj(map, prefix + "Ipv6Access.", this.Ipv6Access);
        this.setParamObj(map, prefix + "OfflineCache.", this.OfflineCache);
        this.setParamObj(map, prefix + "OriginCombine.", this.OriginCombine);
        this.setParamObj(map, prefix + "PostMaxSize.", this.PostMaxSize);
        this.setParamObj(map, prefix + "Quic.", this.Quic);
        this.setParamObj(map, prefix + "OssPrivateAccess.", this.OssPrivateAccess);
        this.setParamObj(map, prefix + "WebSocket.", this.WebSocket);
        this.setParamObj(map, prefix + "RemoteAuthentication.", this.RemoteAuthentication);
        this.setParamObj(map, prefix + "ShareCname.", this.ShareCname);
        this.setParamObj(map, prefix + "HwPrivateAccess.", this.HwPrivateAccess);
        this.setParamObj(map, prefix + "QnPrivateAccess.", this.QnPrivateAccess);

    }
}

