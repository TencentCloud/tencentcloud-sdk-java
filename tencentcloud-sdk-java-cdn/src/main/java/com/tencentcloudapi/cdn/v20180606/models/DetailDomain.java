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
    * 域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速
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
    * 自定义错误页面配置（功能灰度中，敬请期待）
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
    * Ipv6 配置（功能灰度中，敬请期待）
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
     * Get 自定义错误页面配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorPage 自定义错误页面配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set 自定义错误页面配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorPage 自定义错误页面配置（功能灰度中，敬请期待）
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
     * Get Ipv6 配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6 Ipv6 配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6 配置（功能灰度中，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6 Ipv6 配置（功能灰度中，敬请期待）
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

    }
}

