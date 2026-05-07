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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOriginStreamInfoResponse extends AbstractModel {

    /**
    * <p>配置状态信息：0 配置中，1 成功，2 关闭中，3 关闭成功。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>播放类型。</p>
    */
    @SerializedName("CdnStreamPlayType")
    @Expose
    private String [] CdnStreamPlayType;

    /**
    * <p>原站配置类型：1 直播原站。<br>2 streamPackage。</p>
    */
    @SerializedName("OriginStreamType")
    @Expose
    private Long OriginStreamType;

    /**
    * <p>原站播放类型。</p>
    */
    @SerializedName("OriginStreamPlayType")
    @Expose
    private String OriginStreamPlayType;

    /**
    * <p>原站地址类型：1 ip，2 域名。</p>
    */
    @SerializedName("OriginAddressType")
    @Expose
    private Long OriginAddressType;

    /**
    * <p>原站地址信息，每项用分号分割域名（ip）、端口信息。<br>端口为空也要带上分号，表示取默认端口。</p>
    */
    @SerializedName("OriginAddress")
    @Expose
    private String [] OriginAddress;

    /**
    * <p>超时时间，单位 ms。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginTimeout")
    @Expose
    private Long OriginTimeout;

    /**
    * <p>重试次数，单位 次。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginRetryTimes")
    @Expose
    private Long OriginRetryTimes;

    /**
    * <p>时间戳修正，可取值：on、off。<br>当原站播放协议为 rtmp、flv 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeJitter")
    @Expose
    private String TimeJitter;

    /**
    * <p>分片数，单位 个。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HlsPlayFragmentCount")
    @Expose
    private Long HlsPlayFragmentCount;

    /**
    * <p>分片时长，单位 ms。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HlsPlayFragmentDuration")
    @Expose
    private Long HlsPlayFragmentDuration;

    /**
    * <p>是否透传 http 头信息，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassThroughHttpHeader")
    @Expose
    private String PassThroughHttpHeader;

    /**
    * <p>是否透传相应，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassThroughResponse")
    @Expose
    private String PassThroughResponse;

    /**
    * <p>是否透传参数，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassThroughParam")
    @Expose
    private String PassThroughParam;

    /**
    * <p>原站 host。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginHost")
    @Expose
    private String OriginHost;

    /**
    * <p>索引缓存，单位 ms。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexerCache")
    @Expose
    private Long IndexerCache;

    /**
    * <p>分片缓存，单位 ms。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FragmentCache")
    @Expose
    private Long FragmentCache;

    /**
    * <p>域名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p>https 回源，可取值：on、off。<br>当原站播放协议为flv、hls时，传递此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsingHttps")
    @Expose
    private String UsingHttps;

    /**
    * <p>是否遵循原站，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheFollowOrigin")
    @Expose
    private String CacheFollowOrigin;

    /**
    * <p>状态码缓存，数组元素格式：<br>cacheKey:interval<br>cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。<br>interval 单位 ms。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheStatusCode")
    @Expose
    private String [] CacheStatusCode;

    /**
    * <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。<br>url1、url2 长度限制100，不可包含特殊字符。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UrlReplaceRules")
    @Expose
    private String [] UrlReplaceRules;

    /**
    * <p>是否 options 支持，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OptionsRequest")
    @Expose
    private String OptionsRequest;

    /**
    * <p>是否 follow 301/302，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowRedirect")
    @Expose
    private String FollowRedirect;

    /**
    * <p>源站类型 OriginStreamType 为 2 时，该字段有效。 代表源站地址 OriginAddress 对应的地区 region。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamPackageRegion")
    @Expose
    private String [] StreamPackageRegion;

    /**
    * <p>客户名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * <p>当 OriginStreamPlayType 为 hls 时生效，设置索引缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexerKeepParam")
    @Expose
    private String [] IndexerKeepParam;

    /**
    * <p>当 OriginStreamPlayType 为 hls 时生效，设置分片缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FragmentKeepParam")
    @Expose
    private String [] FragmentKeepParam;

    /**
    * <p>当 OriginStreamType = 2 时有效，表示 mediapackage 具体类型：<br>media_package =&gt; 仅配置普通频道。<br>media_package_pure_ad =&gt; 仅配置广告。<br>media_package_mix_ad =&gt; 同时配置普通频道和广告。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaPackageType")
    @Expose
    private String MediaPackageType;

    /**
    * <p>当 OriginStreamType = 2 且 MediaPackageType = media_package 时有效，表示 mediapackage 频道类型，可组合如下值：normal（频道）、ssai（广告）、linear_assembly（线性组装）。</p>
    */
    @SerializedName("MediaPackageChannelTypes")
    @Expose
    private String [] MediaPackageChannelTypes;

    /**
    * <p>当 OriginStreamPlayType 为 hls 时生效，设置索引自定义 header，每一组参数、取值用空格分开。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexerHeader")
    @Expose
    private String [] IndexerHeader;

    /**
    * <p>当 OriginStreamPlayType 为 hls 时生效，设置分片自定义 header，每一组参数、取值用空格分开。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FragmentHeader")
    @Expose
    private String [] FragmentHeader;

    /**
    * <p>自定义规则列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomizationRules")
    @Expose
    private OriginStreamCustomizationRule [] CustomizationRules;

    /**
    * <p>缓存格式规则。<br>0：默认格式。<br>1：云直播源站格式。<br>当 OriginStreamPlayType 为 customization 时候生效。</p>
    */
    @SerializedName("CacheFormatRule")
    @Expose
    private Long CacheFormatRule;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>配置状态信息：0 配置中，1 成功，2 关闭中，3 关闭成功。</p> 
     * @return Status <p>配置状态信息：0 配置中，1 成功，2 关闭中，3 关闭成功。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>配置状态信息：0 配置中，1 成功，2 关闭中，3 关闭成功。</p>
     * @param Status <p>配置状态信息：0 配置中，1 成功，2 关闭中，3 关闭成功。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>播放类型。</p> 
     * @return CdnStreamPlayType <p>播放类型。</p>
     */
    public String [] getCdnStreamPlayType() {
        return this.CdnStreamPlayType;
    }

    /**
     * Set <p>播放类型。</p>
     * @param CdnStreamPlayType <p>播放类型。</p>
     */
    public void setCdnStreamPlayType(String [] CdnStreamPlayType) {
        this.CdnStreamPlayType = CdnStreamPlayType;
    }

    /**
     * Get <p>原站配置类型：1 直播原站。<br>2 streamPackage。</p> 
     * @return OriginStreamType <p>原站配置类型：1 直播原站。<br>2 streamPackage。</p>
     */
    public Long getOriginStreamType() {
        return this.OriginStreamType;
    }

    /**
     * Set <p>原站配置类型：1 直播原站。<br>2 streamPackage。</p>
     * @param OriginStreamType <p>原站配置类型：1 直播原站。<br>2 streamPackage。</p>
     */
    public void setOriginStreamType(Long OriginStreamType) {
        this.OriginStreamType = OriginStreamType;
    }

    /**
     * Get <p>原站播放类型。</p> 
     * @return OriginStreamPlayType <p>原站播放类型。</p>
     */
    public String getOriginStreamPlayType() {
        return this.OriginStreamPlayType;
    }

    /**
     * Set <p>原站播放类型。</p>
     * @param OriginStreamPlayType <p>原站播放类型。</p>
     */
    public void setOriginStreamPlayType(String OriginStreamPlayType) {
        this.OriginStreamPlayType = OriginStreamPlayType;
    }

    /**
     * Get <p>原站地址类型：1 ip，2 域名。</p> 
     * @return OriginAddressType <p>原站地址类型：1 ip，2 域名。</p>
     */
    public Long getOriginAddressType() {
        return this.OriginAddressType;
    }

    /**
     * Set <p>原站地址类型：1 ip，2 域名。</p>
     * @param OriginAddressType <p>原站地址类型：1 ip，2 域名。</p>
     */
    public void setOriginAddressType(Long OriginAddressType) {
        this.OriginAddressType = OriginAddressType;
    }

    /**
     * Get <p>原站地址信息，每项用分号分割域名（ip）、端口信息。<br>端口为空也要带上分号，表示取默认端口。</p> 
     * @return OriginAddress <p>原站地址信息，每项用分号分割域名（ip）、端口信息。<br>端口为空也要带上分号，表示取默认端口。</p>
     */
    public String [] getOriginAddress() {
        return this.OriginAddress;
    }

    /**
     * Set <p>原站地址信息，每项用分号分割域名（ip）、端口信息。<br>端口为空也要带上分号，表示取默认端口。</p>
     * @param OriginAddress <p>原站地址信息，每项用分号分割域名（ip）、端口信息。<br>端口为空也要带上分号，表示取默认端口。</p>
     */
    public void setOriginAddress(String [] OriginAddress) {
        this.OriginAddress = OriginAddress;
    }

    /**
     * Get <p>超时时间，单位 ms。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginTimeout <p>超时时间，单位 ms。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOriginTimeout() {
        return this.OriginTimeout;
    }

    /**
     * Set <p>超时时间，单位 ms。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginTimeout <p>超时时间，单位 ms。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginTimeout(Long OriginTimeout) {
        this.OriginTimeout = OriginTimeout;
    }

    /**
     * Get <p>重试次数，单位 次。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginRetryTimes <p>重试次数，单位 次。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOriginRetryTimes() {
        return this.OriginRetryTimes;
    }

    /**
     * Set <p>重试次数，单位 次。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginRetryTimes <p>重试次数，单位 次。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginRetryTimes(Long OriginRetryTimes) {
        this.OriginRetryTimes = OriginRetryTimes;
    }

    /**
     * Get <p>时间戳修正，可取值：on、off。<br>当原站播放协议为 rtmp、flv 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeJitter <p>时间戳修正，可取值：on、off。<br>当原站播放协议为 rtmp、flv 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeJitter() {
        return this.TimeJitter;
    }

    /**
     * Set <p>时间戳修正，可取值：on、off。<br>当原站播放协议为 rtmp、flv 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeJitter <p>时间戳修正，可取值：on、off。<br>当原站播放协议为 rtmp、flv 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeJitter(String TimeJitter) {
        this.TimeJitter = TimeJitter;
    }

    /**
     * Get <p>分片数，单位 个。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HlsPlayFragmentCount <p>分片数，单位 个。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHlsPlayFragmentCount() {
        return this.HlsPlayFragmentCount;
    }

    /**
     * Set <p>分片数，单位 个。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HlsPlayFragmentCount <p>分片数，单位 个。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHlsPlayFragmentCount(Long HlsPlayFragmentCount) {
        this.HlsPlayFragmentCount = HlsPlayFragmentCount;
    }

    /**
     * Get <p>分片时长，单位 ms。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HlsPlayFragmentDuration <p>分片时长，单位 ms。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHlsPlayFragmentDuration() {
        return this.HlsPlayFragmentDuration;
    }

    /**
     * Set <p>分片时长，单位 ms。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HlsPlayFragmentDuration <p>分片时长，单位 ms。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHlsPlayFragmentDuration(Long HlsPlayFragmentDuration) {
        this.HlsPlayFragmentDuration = HlsPlayFragmentDuration;
    }

    /**
     * Get <p>是否透传 http 头信息，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassThroughHttpHeader <p>是否透传 http 头信息，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassThroughHttpHeader() {
        return this.PassThroughHttpHeader;
    }

    /**
     * Set <p>是否透传 http 头信息，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassThroughHttpHeader <p>是否透传 http 头信息，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassThroughHttpHeader(String PassThroughHttpHeader) {
        this.PassThroughHttpHeader = PassThroughHttpHeader;
    }

    /**
     * Get <p>是否透传相应，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassThroughResponse <p>是否透传相应，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassThroughResponse() {
        return this.PassThroughResponse;
    }

    /**
     * Set <p>是否透传相应，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassThroughResponse <p>是否透传相应，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassThroughResponse(String PassThroughResponse) {
        this.PassThroughResponse = PassThroughResponse;
    }

    /**
     * Get <p>是否透传参数，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassThroughParam <p>是否透传参数，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassThroughParam() {
        return this.PassThroughParam;
    }

    /**
     * Set <p>是否透传参数，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassThroughParam <p>是否透传参数，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassThroughParam(String PassThroughParam) {
        this.PassThroughParam = PassThroughParam;
    }

    /**
     * Get <p>原站 host。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginHost <p>原站 host。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginHost() {
        return this.OriginHost;
    }

    /**
     * Set <p>原站 host。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginHost <p>原站 host。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginHost(String OriginHost) {
        this.OriginHost = OriginHost;
    }

    /**
     * Get <p>索引缓存，单位 ms。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexerCache <p>索引缓存，单位 ms。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndexerCache() {
        return this.IndexerCache;
    }

    /**
     * Set <p>索引缓存，单位 ms。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexerCache <p>索引缓存，单位 ms。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexerCache(Long IndexerCache) {
        this.IndexerCache = IndexerCache;
    }

    /**
     * Get <p>分片缓存，单位 ms。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FragmentCache <p>分片缓存，单位 ms。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFragmentCache() {
        return this.FragmentCache;
    }

    /**
     * Set <p>分片缓存，单位 ms。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FragmentCache <p>分片缓存，单位 ms。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFragmentCache(Long FragmentCache) {
        this.FragmentCache = FragmentCache;
    }

    /**
     * Get <p>域名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainName <p>域名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p>域名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainName <p>域名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p>https 回源，可取值：on、off。<br>当原站播放协议为flv、hls时，传递此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsingHttps <p>https 回源，可取值：on、off。<br>当原站播放协议为flv、hls时，传递此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsingHttps() {
        return this.UsingHttps;
    }

    /**
     * Set <p>https 回源，可取值：on、off。<br>当原站播放协议为flv、hls时，传递此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsingHttps <p>https 回源，可取值：on、off。<br>当原站播放协议为flv、hls时，传递此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsingHttps(String UsingHttps) {
        this.UsingHttps = UsingHttps;
    }

    /**
     * Get <p>是否遵循原站，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheFollowOrigin <p>是否遵循原站，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCacheFollowOrigin() {
        return this.CacheFollowOrigin;
    }

    /**
     * Set <p>是否遵循原站，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheFollowOrigin <p>是否遵循原站，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheFollowOrigin(String CacheFollowOrigin) {
        this.CacheFollowOrigin = CacheFollowOrigin;
    }

    /**
     * Get <p>状态码缓存，数组元素格式：<br>cacheKey:interval<br>cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。<br>interval 单位 ms。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheStatusCode <p>状态码缓存，数组元素格式：<br>cacheKey:interval<br>cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。<br>interval 单位 ms。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCacheStatusCode() {
        return this.CacheStatusCode;
    }

    /**
     * Set <p>状态码缓存，数组元素格式：<br>cacheKey:interval<br>cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。<br>interval 单位 ms。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheStatusCode <p>状态码缓存，数组元素格式：<br>cacheKey:interval<br>cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。<br>interval 单位 ms。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheStatusCode(String [] CacheStatusCode) {
        this.CacheStatusCode = CacheStatusCode;
    }

    /**
     * Get <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。<br>url1、url2 长度限制100，不可包含特殊字符。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UrlReplaceRules <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。<br>url1、url2 长度限制100，不可包含特殊字符。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUrlReplaceRules() {
        return this.UrlReplaceRules;
    }

    /**
     * Set <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。<br>url1、url2 长度限制100，不可包含特殊字符。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UrlReplaceRules <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。<br>url1、url2 长度限制100，不可包含特殊字符。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrlReplaceRules(String [] UrlReplaceRules) {
        this.UrlReplaceRules = UrlReplaceRules;
    }

    /**
     * Get <p>是否 options 支持，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OptionsRequest <p>是否 options 支持，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOptionsRequest() {
        return this.OptionsRequest;
    }

    /**
     * Set <p>是否 options 支持，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OptionsRequest <p>是否 options 支持，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptionsRequest(String OptionsRequest) {
        this.OptionsRequest = OptionsRequest;
    }

    /**
     * Get <p>是否 follow 301/302，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowRedirect <p>是否 follow 301/302，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set <p>是否 follow 301/302，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowRedirect <p>是否 follow 301/302，可取值：on、off。<br>当原站播放协议为hls时，此字段才会生效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowRedirect(String FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get <p>源站类型 OriginStreamType 为 2 时，该字段有效。 代表源站地址 OriginAddress 对应的地区 region。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamPackageRegion <p>源站类型 OriginStreamType 为 2 时，该字段有效。 代表源站地址 OriginAddress 对应的地区 region。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getStreamPackageRegion() {
        return this.StreamPackageRegion;
    }

    /**
     * Set <p>源站类型 OriginStreamType 为 2 时，该字段有效。 代表源站地址 OriginAddress 对应的地区 region。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamPackageRegion <p>源站类型 OriginStreamType 为 2 时，该字段有效。 代表源站地址 OriginAddress 对应的地区 region。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamPackageRegion(String [] StreamPackageRegion) {
        this.StreamPackageRegion = StreamPackageRegion;
    }

    /**
     * Get <p>客户名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomerName <p>客户名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set <p>客户名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomerName <p>客户名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get <p>当 OriginStreamPlayType 为 hls 时生效，设置索引缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexerKeepParam <p>当 OriginStreamPlayType 为 hls 时生效，设置索引缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIndexerKeepParam() {
        return this.IndexerKeepParam;
    }

    /**
     * Set <p>当 OriginStreamPlayType 为 hls 时生效，设置索引缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexerKeepParam <p>当 OriginStreamPlayType 为 hls 时生效，设置索引缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexerKeepParam(String [] IndexerKeepParam) {
        this.IndexerKeepParam = IndexerKeepParam;
    }

    /**
     * Get <p>当 OriginStreamPlayType 为 hls 时生效，设置分片缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FragmentKeepParam <p>当 OriginStreamPlayType 为 hls 时生效，设置分片缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFragmentKeepParam() {
        return this.FragmentKeepParam;
    }

    /**
     * Set <p>当 OriginStreamPlayType 为 hls 时生效，设置分片缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FragmentKeepParam <p>当 OriginStreamPlayType 为 hls 时生效，设置分片缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFragmentKeepParam(String [] FragmentKeepParam) {
        this.FragmentKeepParam = FragmentKeepParam;
    }

    /**
     * Get <p>当 OriginStreamType = 2 时有效，表示 mediapackage 具体类型：<br>media_package =&gt; 仅配置普通频道。<br>media_package_pure_ad =&gt; 仅配置广告。<br>media_package_mix_ad =&gt; 同时配置普通频道和广告。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaPackageType <p>当 OriginStreamType = 2 时有效，表示 mediapackage 具体类型：<br>media_package =&gt; 仅配置普通频道。<br>media_package_pure_ad =&gt; 仅配置广告。<br>media_package_mix_ad =&gt; 同时配置普通频道和广告。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMediaPackageType() {
        return this.MediaPackageType;
    }

    /**
     * Set <p>当 OriginStreamType = 2 时有效，表示 mediapackage 具体类型：<br>media_package =&gt; 仅配置普通频道。<br>media_package_pure_ad =&gt; 仅配置广告。<br>media_package_mix_ad =&gt; 同时配置普通频道和广告。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaPackageType <p>当 OriginStreamType = 2 时有效，表示 mediapackage 具体类型：<br>media_package =&gt; 仅配置普通频道。<br>media_package_pure_ad =&gt; 仅配置广告。<br>media_package_mix_ad =&gt; 同时配置普通频道和广告。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaPackageType(String MediaPackageType) {
        this.MediaPackageType = MediaPackageType;
    }

    /**
     * Get <p>当 OriginStreamType = 2 且 MediaPackageType = media_package 时有效，表示 mediapackage 频道类型，可组合如下值：normal（频道）、ssai（广告）、linear_assembly（线性组装）。</p> 
     * @return MediaPackageChannelTypes <p>当 OriginStreamType = 2 且 MediaPackageType = media_package 时有效，表示 mediapackage 频道类型，可组合如下值：normal（频道）、ssai（广告）、linear_assembly（线性组装）。</p>
     */
    public String [] getMediaPackageChannelTypes() {
        return this.MediaPackageChannelTypes;
    }

    /**
     * Set <p>当 OriginStreamType = 2 且 MediaPackageType = media_package 时有效，表示 mediapackage 频道类型，可组合如下值：normal（频道）、ssai（广告）、linear_assembly（线性组装）。</p>
     * @param MediaPackageChannelTypes <p>当 OriginStreamType = 2 且 MediaPackageType = media_package 时有效，表示 mediapackage 频道类型，可组合如下值：normal（频道）、ssai（广告）、linear_assembly（线性组装）。</p>
     */
    public void setMediaPackageChannelTypes(String [] MediaPackageChannelTypes) {
        this.MediaPackageChannelTypes = MediaPackageChannelTypes;
    }

    /**
     * Get <p>当 OriginStreamPlayType 为 hls 时生效，设置索引自定义 header，每一组参数、取值用空格分开。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexerHeader <p>当 OriginStreamPlayType 为 hls 时生效，设置索引自定义 header，每一组参数、取值用空格分开。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIndexerHeader() {
        return this.IndexerHeader;
    }

    /**
     * Set <p>当 OriginStreamPlayType 为 hls 时生效，设置索引自定义 header，每一组参数、取值用空格分开。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexerHeader <p>当 OriginStreamPlayType 为 hls 时生效，设置索引自定义 header，每一组参数、取值用空格分开。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexerHeader(String [] IndexerHeader) {
        this.IndexerHeader = IndexerHeader;
    }

    /**
     * Get <p>当 OriginStreamPlayType 为 hls 时生效，设置分片自定义 header，每一组参数、取值用空格分开。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FragmentHeader <p>当 OriginStreamPlayType 为 hls 时生效，设置分片自定义 header，每一组参数、取值用空格分开。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFragmentHeader() {
        return this.FragmentHeader;
    }

    /**
     * Set <p>当 OriginStreamPlayType 为 hls 时生效，设置分片自定义 header，每一组参数、取值用空格分开。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FragmentHeader <p>当 OriginStreamPlayType 为 hls 时生效，设置分片自定义 header，每一组参数、取值用空格分开。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFragmentHeader(String [] FragmentHeader) {
        this.FragmentHeader = FragmentHeader;
    }

    /**
     * Get <p>自定义规则列表。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomizationRules <p>自定义规则列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginStreamCustomizationRule [] getCustomizationRules() {
        return this.CustomizationRules;
    }

    /**
     * Set <p>自定义规则列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomizationRules <p>自定义规则列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomizationRules(OriginStreamCustomizationRule [] CustomizationRules) {
        this.CustomizationRules = CustomizationRules;
    }

    /**
     * Get <p>缓存格式规则。<br>0：默认格式。<br>1：云直播源站格式。<br>当 OriginStreamPlayType 为 customization 时候生效。</p> 
     * @return CacheFormatRule <p>缓存格式规则。<br>0：默认格式。<br>1：云直播源站格式。<br>当 OriginStreamPlayType 为 customization 时候生效。</p>
     */
    public Long getCacheFormatRule() {
        return this.CacheFormatRule;
    }

    /**
     * Set <p>缓存格式规则。<br>0：默认格式。<br>1：云直播源站格式。<br>当 OriginStreamPlayType 为 customization 时候生效。</p>
     * @param CacheFormatRule <p>缓存格式规则。<br>0：默认格式。<br>1：云直播源站格式。<br>当 OriginStreamPlayType 为 customization 时候生效。</p>
     */
    public void setCacheFormatRule(Long CacheFormatRule) {
        this.CacheFormatRule = CacheFormatRule;
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

    public DescribeOriginStreamInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOriginStreamInfoResponse(DescribeOriginStreamInfoResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CdnStreamPlayType != null) {
            this.CdnStreamPlayType = new String[source.CdnStreamPlayType.length];
            for (int i = 0; i < source.CdnStreamPlayType.length; i++) {
                this.CdnStreamPlayType[i] = new String(source.CdnStreamPlayType[i]);
            }
        }
        if (source.OriginStreamType != null) {
            this.OriginStreamType = new Long(source.OriginStreamType);
        }
        if (source.OriginStreamPlayType != null) {
            this.OriginStreamPlayType = new String(source.OriginStreamPlayType);
        }
        if (source.OriginAddressType != null) {
            this.OriginAddressType = new Long(source.OriginAddressType);
        }
        if (source.OriginAddress != null) {
            this.OriginAddress = new String[source.OriginAddress.length];
            for (int i = 0; i < source.OriginAddress.length; i++) {
                this.OriginAddress[i] = new String(source.OriginAddress[i]);
            }
        }
        if (source.OriginTimeout != null) {
            this.OriginTimeout = new Long(source.OriginTimeout);
        }
        if (source.OriginRetryTimes != null) {
            this.OriginRetryTimes = new Long(source.OriginRetryTimes);
        }
        if (source.TimeJitter != null) {
            this.TimeJitter = new String(source.TimeJitter);
        }
        if (source.HlsPlayFragmentCount != null) {
            this.HlsPlayFragmentCount = new Long(source.HlsPlayFragmentCount);
        }
        if (source.HlsPlayFragmentDuration != null) {
            this.HlsPlayFragmentDuration = new Long(source.HlsPlayFragmentDuration);
        }
        if (source.PassThroughHttpHeader != null) {
            this.PassThroughHttpHeader = new String(source.PassThroughHttpHeader);
        }
        if (source.PassThroughResponse != null) {
            this.PassThroughResponse = new String(source.PassThroughResponse);
        }
        if (source.PassThroughParam != null) {
            this.PassThroughParam = new String(source.PassThroughParam);
        }
        if (source.OriginHost != null) {
            this.OriginHost = new String(source.OriginHost);
        }
        if (source.IndexerCache != null) {
            this.IndexerCache = new Long(source.IndexerCache);
        }
        if (source.FragmentCache != null) {
            this.FragmentCache = new Long(source.FragmentCache);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.UsingHttps != null) {
            this.UsingHttps = new String(source.UsingHttps);
        }
        if (source.CacheFollowOrigin != null) {
            this.CacheFollowOrigin = new String(source.CacheFollowOrigin);
        }
        if (source.CacheStatusCode != null) {
            this.CacheStatusCode = new String[source.CacheStatusCode.length];
            for (int i = 0; i < source.CacheStatusCode.length; i++) {
                this.CacheStatusCode[i] = new String(source.CacheStatusCode[i]);
            }
        }
        if (source.UrlReplaceRules != null) {
            this.UrlReplaceRules = new String[source.UrlReplaceRules.length];
            for (int i = 0; i < source.UrlReplaceRules.length; i++) {
                this.UrlReplaceRules[i] = new String(source.UrlReplaceRules[i]);
            }
        }
        if (source.OptionsRequest != null) {
            this.OptionsRequest = new String(source.OptionsRequest);
        }
        if (source.FollowRedirect != null) {
            this.FollowRedirect = new String(source.FollowRedirect);
        }
        if (source.StreamPackageRegion != null) {
            this.StreamPackageRegion = new String[source.StreamPackageRegion.length];
            for (int i = 0; i < source.StreamPackageRegion.length; i++) {
                this.StreamPackageRegion[i] = new String(source.StreamPackageRegion[i]);
            }
        }
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.IndexerKeepParam != null) {
            this.IndexerKeepParam = new String[source.IndexerKeepParam.length];
            for (int i = 0; i < source.IndexerKeepParam.length; i++) {
                this.IndexerKeepParam[i] = new String(source.IndexerKeepParam[i]);
            }
        }
        if (source.FragmentKeepParam != null) {
            this.FragmentKeepParam = new String[source.FragmentKeepParam.length];
            for (int i = 0; i < source.FragmentKeepParam.length; i++) {
                this.FragmentKeepParam[i] = new String(source.FragmentKeepParam[i]);
            }
        }
        if (source.MediaPackageType != null) {
            this.MediaPackageType = new String(source.MediaPackageType);
        }
        if (source.MediaPackageChannelTypes != null) {
            this.MediaPackageChannelTypes = new String[source.MediaPackageChannelTypes.length];
            for (int i = 0; i < source.MediaPackageChannelTypes.length; i++) {
                this.MediaPackageChannelTypes[i] = new String(source.MediaPackageChannelTypes[i]);
            }
        }
        if (source.IndexerHeader != null) {
            this.IndexerHeader = new String[source.IndexerHeader.length];
            for (int i = 0; i < source.IndexerHeader.length; i++) {
                this.IndexerHeader[i] = new String(source.IndexerHeader[i]);
            }
        }
        if (source.FragmentHeader != null) {
            this.FragmentHeader = new String[source.FragmentHeader.length];
            for (int i = 0; i < source.FragmentHeader.length; i++) {
                this.FragmentHeader[i] = new String(source.FragmentHeader[i]);
            }
        }
        if (source.CustomizationRules != null) {
            this.CustomizationRules = new OriginStreamCustomizationRule[source.CustomizationRules.length];
            for (int i = 0; i < source.CustomizationRules.length; i++) {
                this.CustomizationRules[i] = new OriginStreamCustomizationRule(source.CustomizationRules[i]);
            }
        }
        if (source.CacheFormatRule != null) {
            this.CacheFormatRule = new Long(source.CacheFormatRule);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "CdnStreamPlayType.", this.CdnStreamPlayType);
        this.setParamSimple(map, prefix + "OriginStreamType", this.OriginStreamType);
        this.setParamSimple(map, prefix + "OriginStreamPlayType", this.OriginStreamPlayType);
        this.setParamSimple(map, prefix + "OriginAddressType", this.OriginAddressType);
        this.setParamArraySimple(map, prefix + "OriginAddress.", this.OriginAddress);
        this.setParamSimple(map, prefix + "OriginTimeout", this.OriginTimeout);
        this.setParamSimple(map, prefix + "OriginRetryTimes", this.OriginRetryTimes);
        this.setParamSimple(map, prefix + "TimeJitter", this.TimeJitter);
        this.setParamSimple(map, prefix + "HlsPlayFragmentCount", this.HlsPlayFragmentCount);
        this.setParamSimple(map, prefix + "HlsPlayFragmentDuration", this.HlsPlayFragmentDuration);
        this.setParamSimple(map, prefix + "PassThroughHttpHeader", this.PassThroughHttpHeader);
        this.setParamSimple(map, prefix + "PassThroughResponse", this.PassThroughResponse);
        this.setParamSimple(map, prefix + "PassThroughParam", this.PassThroughParam);
        this.setParamSimple(map, prefix + "OriginHost", this.OriginHost);
        this.setParamSimple(map, prefix + "IndexerCache", this.IndexerCache);
        this.setParamSimple(map, prefix + "FragmentCache", this.FragmentCache);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "UsingHttps", this.UsingHttps);
        this.setParamSimple(map, prefix + "CacheFollowOrigin", this.CacheFollowOrigin);
        this.setParamArraySimple(map, prefix + "CacheStatusCode.", this.CacheStatusCode);
        this.setParamArraySimple(map, prefix + "UrlReplaceRules.", this.UrlReplaceRules);
        this.setParamSimple(map, prefix + "OptionsRequest", this.OptionsRequest);
        this.setParamSimple(map, prefix + "FollowRedirect", this.FollowRedirect);
        this.setParamArraySimple(map, prefix + "StreamPackageRegion.", this.StreamPackageRegion);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamArraySimple(map, prefix + "IndexerKeepParam.", this.IndexerKeepParam);
        this.setParamArraySimple(map, prefix + "FragmentKeepParam.", this.FragmentKeepParam);
        this.setParamSimple(map, prefix + "MediaPackageType", this.MediaPackageType);
        this.setParamArraySimple(map, prefix + "MediaPackageChannelTypes.", this.MediaPackageChannelTypes);
        this.setParamArraySimple(map, prefix + "IndexerHeader.", this.IndexerHeader);
        this.setParamArraySimple(map, prefix + "FragmentHeader.", this.FragmentHeader);
        this.setParamArrayObj(map, prefix + "CustomizationRules.", this.CustomizationRules);
        this.setParamSimple(map, prefix + "CacheFormatRule", this.CacheFormatRule);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

