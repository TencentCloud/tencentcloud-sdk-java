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

public class AddCdnDomainRequest extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 加速域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 源站配置
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * 项目 ID，默认为 0，代表【默认项目】
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

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
    * 301/302 回源跟随配置。
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
    * Ipv6 配置（功能灰度中，尚未全量）
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * 地域属性特殊配置
适用于域名境内加速、境外加速配置不一致场景
    */
    @SerializedName("SpecificConfig")
    @Expose
    private SpecificConfig SpecificConfig;

    /**
    * 域名加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
使用中国境外加速、全球加速时，需要先开通中国境外加速服务
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
     * Get 加速域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速 
     * @return ServiceType 加速域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 加速域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速
     * @param ServiceType 加速域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
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
     * Get 项目 ID，默认为 0，代表【默认项目】 
     * @return ProjectId 项目 ID，默认为 0，代表【默认项目】
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID，默认为 0，代表【默认项目】
     * @param ProjectId 项目 ID，默认为 0，代表【默认项目】
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 301/302 回源跟随配置。 
     * @return FollowRedirect 301/302 回源跟随配置。
     */
    public FollowRedirect getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set 301/302 回源跟随配置。
     * @param FollowRedirect 301/302 回源跟随配置。
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
     * Get Ipv6 配置（功能灰度中，尚未全量） 
     * @return Ipv6 Ipv6 配置（功能灰度中，尚未全量）
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6 配置（功能灰度中，尚未全量）
     * @param Ipv6 Ipv6 配置（功能灰度中，尚未全量）
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
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
     * Get 域名加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
使用中国境外加速、全球加速时，需要先开通中国境外加速服务 
     * @return Area 域名加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
使用中国境外加速、全球加速时，需要先开通中国境外加速服务
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 域名加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
使用中国境外加速、全球加速时，需要先开通中国境外加速服务
     * @param Area 域名加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
使用中国境外加速、全球加速时，需要先开通中国境外加速服务
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
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
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamObj(map, prefix + "SpecificConfig.", this.SpecificConfig);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamObj(map, prefix + "OriginPullTimeout.", this.OriginPullTimeout);

    }
}

