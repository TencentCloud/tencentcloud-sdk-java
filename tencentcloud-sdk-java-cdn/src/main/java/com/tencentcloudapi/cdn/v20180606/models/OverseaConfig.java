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

public class OverseaConfig extends AbstractModel{

    /**
    * 时间戳防盗链配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Authentication")
    @Expose
    private Authentication Authentication;

    /**
    * 带宽封顶配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthAlert")
    @Expose
    private BandwidthAlert BandwidthAlert;

    /**
    * 缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * 缓存相关配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * 下载限速配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownstreamCapping")
    @Expose
    private DownstreamCapping DownstreamCapping;

    /**
    * 错误码重定向配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorPage")
    @Expose
    private ErrorPage ErrorPage;

    /**
    * 301和302自动回源跟随配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowRedirect")
    @Expose
    private FollowRedirect FollowRedirect;

    /**
    * 访问协议强制跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Https配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * IP黑白名单配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * IP限频配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpFreqLimit")
    @Expose
    private IpFreqLimit IpFreqLimit;

    /**
    * 浏览器缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * 源站配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * 跨国优化配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginPullOptimization")
    @Expose
    private OriginPullOptimization OriginPullOptimization;

    /**
    * Range回源配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RangeOriginPull")
    @Expose
    private RangeOriginPull RangeOriginPull;

    /**
    * 防盗链配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Referer")
    @Expose
    private Referer Referer;

    /**
    * 回源请求头部配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestHeader")
    @Expose
    private RequestHeader RequestHeader;

    /**
    * 源站响应头部配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * 遵循源站缓存头部配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseHeaderCache")
    @Expose
    private ResponseHeaderCache ResponseHeaderCache;

    /**
    * seo优化配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seo")
    @Expose
    private Seo Seo;

    /**
    * 域名业务类型，web，download，media分别表示静态加速，下载加速和流媒体加速。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 状态码缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusCodeCache")
    @Expose
    private StatusCodeCache StatusCodeCache;

    /**
    * 视频拖拽配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoSeek")
    @Expose
    private VideoSeek VideoSeek;

    /**
     * Get 时间戳防盗链配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Authentication 时间戳防盗链配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Authentication getAuthentication() {
        return this.Authentication;
    }

    /**
     * Set 时间戳防盗链配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Authentication 时间戳防盗链配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthentication(Authentication Authentication) {
        this.Authentication = Authentication;
    }

    /**
     * Get 带宽封顶配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthAlert 带宽封顶配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BandwidthAlert getBandwidthAlert() {
        return this.BandwidthAlert;
    }

    /**
     * Set 带宽封顶配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthAlert 带宽封顶配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthAlert(BandwidthAlert BandwidthAlert) {
        this.BandwidthAlert = BandwidthAlert;
    }

    /**
     * Get 缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cache 缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set 缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cache 缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get 缓存相关配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheKey 缓存相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set 缓存相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheKey 缓存相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compression 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compression 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get 下载限速配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownstreamCapping 下载限速配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DownstreamCapping getDownstreamCapping() {
        return this.DownstreamCapping;
    }

    /**
     * Set 下载限速配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownstreamCapping 下载限速配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownstreamCapping(DownstreamCapping DownstreamCapping) {
        this.DownstreamCapping = DownstreamCapping;
    }

    /**
     * Get 错误码重定向配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorPage 错误码重定向配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set 错误码重定向配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorPage 错误码重定向配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorPage(ErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    /**
     * Get 301和302自动回源跟随配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowRedirect 301和302自动回源跟随配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FollowRedirect getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set 301和302自动回源跟随配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowRedirect 301和302自动回源跟随配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowRedirect(FollowRedirect FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get 访问协议强制跳转配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForceRedirect 访问协议强制跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set 访问协议强制跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForceRedirect 访问协议强制跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Https配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Https Https配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Https配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Https Https配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get IP黑白名单配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpFilter IP黑白名单配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP黑白名单配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpFilter IP黑白名单配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get IP限频配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpFreqLimit IP限频配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpFreqLimit getIpFreqLimit() {
        return this.IpFreqLimit;
    }

    /**
     * Set IP限频配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpFreqLimit IP限频配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpFreqLimit(IpFreqLimit IpFreqLimit) {
        this.IpFreqLimit = IpFreqLimit;
    }

    /**
     * Get 浏览器缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxAge 浏览器缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set 浏览器缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxAge 浏览器缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get 源站配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Origin 源站配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Origin 源站配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 跨国优化配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginPullOptimization 跨国优化配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginPullOptimization getOriginPullOptimization() {
        return this.OriginPullOptimization;
    }

    /**
     * Set 跨国优化配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginPullOptimization 跨国优化配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginPullOptimization(OriginPullOptimization OriginPullOptimization) {
        this.OriginPullOptimization = OriginPullOptimization;
    }

    /**
     * Get Range回源配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RangeOriginPull Range回源配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RangeOriginPull getRangeOriginPull() {
        return this.RangeOriginPull;
    }

    /**
     * Set Range回源配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RangeOriginPull Range回源配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRangeOriginPull(RangeOriginPull RangeOriginPull) {
        this.RangeOriginPull = RangeOriginPull;
    }

    /**
     * Get 防盗链配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Referer 防盗链配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Referer getReferer() {
        return this.Referer;
    }

    /**
     * Set 防盗链配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Referer 防盗链配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReferer(Referer Referer) {
        this.Referer = Referer;
    }

    /**
     * Get 回源请求头部配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestHeader 回源请求头部配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RequestHeader getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set 回源请求头部配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestHeader 回源请求头部配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestHeader(RequestHeader RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get 源站响应头部配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseHeader 源站响应头部配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set 源站响应头部配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseHeader 源站响应头部配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get 遵循源站缓存头部配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseHeaderCache 遵循源站缓存头部配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResponseHeaderCache getResponseHeaderCache() {
        return this.ResponseHeaderCache;
    }

    /**
     * Set 遵循源站缓存头部配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseHeaderCache 遵循源站缓存头部配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseHeaderCache(ResponseHeaderCache ResponseHeaderCache) {
        this.ResponseHeaderCache = ResponseHeaderCache;
    }

    /**
     * Get seo优化配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seo seo优化配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Seo getSeo() {
        return this.Seo;
    }

    /**
     * Set seo优化配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seo seo优化配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeo(Seo Seo) {
        this.Seo = Seo;
    }

    /**
     * Get 域名业务类型，web，download，media分别表示静态加速，下载加速和流媒体加速。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceType 域名业务类型，web，download，media分别表示静态加速，下载加速和流媒体加速。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 域名业务类型，web，download，media分别表示静态加速，下载加速和流媒体加速。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceType 域名业务类型，web，download，media分别表示静态加速，下载加速和流媒体加速。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 状态码缓存配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusCodeCache 状态码缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatusCodeCache getStatusCodeCache() {
        return this.StatusCodeCache;
    }

    /**
     * Set 状态码缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusCodeCache 状态码缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusCodeCache(StatusCodeCache StatusCodeCache) {
        this.StatusCodeCache = StatusCodeCache;
    }

    /**
     * Get 视频拖拽配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoSeek 视频拖拽配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoSeek getVideoSeek() {
        return this.VideoSeek;
    }

    /**
     * Set 视频拖拽配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoSeek 视频拖拽配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoSeek(VideoSeek VideoSeek) {
        this.VideoSeek = VideoSeek;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Authentication.", this.Authentication);
        this.setParamObj(map, prefix + "BandwidthAlert.", this.BandwidthAlert);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "Compression.", this.Compression);
        this.setParamObj(map, prefix + "DownstreamCapping.", this.DownstreamCapping);
        this.setParamObj(map, prefix + "ErrorPage.", this.ErrorPage);
        this.setParamObj(map, prefix + "FollowRedirect.", this.FollowRedirect);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamObj(map, prefix + "IpFilter.", this.IpFilter);
        this.setParamObj(map, prefix + "IpFreqLimit.", this.IpFreqLimit);
        this.setParamObj(map, prefix + "MaxAge.", this.MaxAge);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamObj(map, prefix + "OriginPullOptimization.", this.OriginPullOptimization);
        this.setParamObj(map, prefix + "RangeOriginPull.", this.RangeOriginPull);
        this.setParamObj(map, prefix + "Referer.", this.Referer);
        this.setParamObj(map, prefix + "RequestHeader.", this.RequestHeader);
        this.setParamObj(map, prefix + "ResponseHeader.", this.ResponseHeader);
        this.setParamObj(map, prefix + "ResponseHeaderCache.", this.ResponseHeaderCache);
        this.setParamObj(map, prefix + "Seo.", this.Seo);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamObj(map, prefix + "StatusCodeCache.", this.StatusCodeCache);
        this.setParamObj(map, prefix + "VideoSeek.", this.VideoSeek);

    }
}

