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

public class ModifyOriginStreamInfoRequest extends AbstractModel {

    /**
    * <p>域名。</p>
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p>源站播放协议，可取值：rtmp、flv、hls、dash、hls|dash、customization。</p>
    */
    @SerializedName("OriginStreamPlayType")
    @Expose
    private String OriginStreamPlayType;

    /**
    * <p>播放协议，可取值：rtmp、flv、hls、dash、hls|dash、customization。<br>自定义回源协议填写 customization。</p>
    */
    @SerializedName("CdnStreamPlayType")
    @Expose
    private String [] CdnStreamPlayType;

    /**
    * <p>原站类型：<br>1 =&gt; 直播原站。<br>2 =&gt; mediaPackage。</p>
    */
    @SerializedName("OriginStreamType")
    @Expose
    private Long OriginStreamType;

    /**
    * <p>原站地址信息，每项用冒号分割域名（ip）、端口信息。<br>端口为空也要带上分号，表示取默认端口。<br>自定义回源协议填写 customization。</p>
    */
    @SerializedName("OriginAddress")
    @Expose
    private String [] OriginAddress;

    /**
    * <p>原站地址类型：<br>1 =&gt; IP 类型。<br>2 =&gt; 域名类型。</p>
    */
    @SerializedName("OriginAddressType")
    @Expose
    private Long OriginAddressType;

    /**
    * <p>自定义名称</p>
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * <p>原站 host。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
    */
    @SerializedName("OriginHost")
    @Expose
    private String OriginHost;

    /**
    * <p>超时时间，单位 ms，取值范围：1 ～ 60000，默认值：10000。</p>
    */
    @SerializedName("OriginTimeout")
    @Expose
    private Long OriginTimeout;

    /**
    * <p>重试次数，单位 次，取值范围：1 ～ 10，默认值：10。</p>
    */
    @SerializedName("OriginRetryTimes")
    @Expose
    private Long OriginRetryTimes;

    /**
    * <p>是否透传 http 头信息，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
    */
    @SerializedName("PassThroughHttpHeader")
    @Expose
    private String PassThroughHttpHeader;

    /**
    * <p>是否透传相应，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
    */
    @SerializedName("PassThroughResponse")
    @Expose
    private String PassThroughResponse;

    /**
    * <p>是否透传参数，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
    */
    @SerializedName("PassThroughParam")
    @Expose
    private String PassThroughParam;

    /**
    * <p>索引缓存，单位 ms，取值范围：1 ～ 60000，默认值：10000。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
    */
    @SerializedName("IndexerCache")
    @Expose
    private Long IndexerCache;

    /**
    * <p>分片缓存，单位 ms，取值范围：1 ～ 60000，默认值：10000。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
    */
    @SerializedName("FragmentCache")
    @Expose
    private Long FragmentCache;

    /**
    * <p>分片数，单位 个，取值范围：1 ～ 10，默认值：3。</p>
    */
    @SerializedName("HlsPlayFragmentCount")
    @Expose
    private Long HlsPlayFragmentCount;

    /**
    * <p>分片时长，单位 ms，取值范围：1 ～ 10000，默认值：3000。</p>
    */
    @SerializedName("HlsPlayFragmentDuration")
    @Expose
    private Long HlsPlayFragmentDuration;

    /**
    * <p>时间戳修正，可取值：on、off，默认值：off。<br>当原站播放协议为 rtmp、flv 时，传递该字段才会生效。</p>
    */
    @SerializedName("TimeJitter")
    @Expose
    private String TimeJitter;

    /**
    * <p>https 回源，可取值：on、off，默认值：off。<br>当原站播放协议为flv、hls时，传递此字段才会生效。</p>
    */
    @SerializedName("UsingHttps")
    @Expose
    private String UsingHttps;

    /**
    * <p>遵循原站，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
    */
    @SerializedName("CacheFollowOrigin")
    @Expose
    private String CacheFollowOrigin;

    /**
    * <p>状态码缓存，数组元素格式：<br>cacheKey:interval<br>cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。<br>interval 单位 ms。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
    */
    @SerializedName("CacheStatusCode")
    @Expose
    private String [] CacheStatusCode;

    /**
    * <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。<br>url1、url2 长度限制100，不可包含特殊字符。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
    */
    @SerializedName("UrlReplaceRules")
    @Expose
    private String [] UrlReplaceRules;

    /**
    * <p>options 支持，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
    */
    @SerializedName("OptionsRequest")
    @Expose
    private String OptionsRequest;

    /**
    * <p>follow 301/302，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
    */
    @SerializedName("FollowRedirect")
    @Expose
    private String FollowRedirect;

    /**
    * <p>当 OriginStreamPlayType 为 hls 时生效，设置索引缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
    */
    @SerializedName("IndexerKeepParam")
    @Expose
    private String [] IndexerKeepParam;

    /**
    * <p>当 OriginStreamPlayType 为 hls 时生效，设置分片缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
    */
    @SerializedName("FragmentKeepParam")
    @Expose
    private String [] FragmentKeepParam;

    /**
    * <p>当 OriginStreamType = 2 时有效，表示 mediapackage 具体类型：<br>media_package =&gt; 仅配置普通频道。<br>media_package_pure_ad =&gt; 仅配置广告。<br>media_package_mix_ad =&gt; 同时配置普通频道和广告。<br>注意：配置时候，优先使用 media_package。和 MediaPackageChannelTypes 字段配合使用。</p>
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
    * <p>当 OriginStreamPlayType 为 hls 时生效，设置索引自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下：<br>头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。<br>头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p>
    */
    @SerializedName("IndexerHeader")
    @Expose
    private String [] IndexerHeader;

    /**
    * <p>当 OriginStreamPlayType 为 hls 时生效，设置分片自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下：<br>头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。<br>头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p>
    */
    @SerializedName("FragmentHeader")
    @Expose
    private String [] FragmentHeader;

    /**
    * <p>自定义回源规则列表，当 OriginStreamPlayType 为 customization 时候生效。</p>
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
     * Get <p>域名。</p> 
     * @return DomainName <p>域名。</p>
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p>域名。</p>
     * @param DomainName <p>域名。</p>
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p>源站播放协议，可取值：rtmp、flv、hls、dash、hls|dash、customization。</p> 
     * @return OriginStreamPlayType <p>源站播放协议，可取值：rtmp、flv、hls、dash、hls|dash、customization。</p>
     */
    public String getOriginStreamPlayType() {
        return this.OriginStreamPlayType;
    }

    /**
     * Set <p>源站播放协议，可取值：rtmp、flv、hls、dash、hls|dash、customization。</p>
     * @param OriginStreamPlayType <p>源站播放协议，可取值：rtmp、flv、hls、dash、hls|dash、customization。</p>
     */
    public void setOriginStreamPlayType(String OriginStreamPlayType) {
        this.OriginStreamPlayType = OriginStreamPlayType;
    }

    /**
     * Get <p>播放协议，可取值：rtmp、flv、hls、dash、hls|dash、customization。<br>自定义回源协议填写 customization。</p> 
     * @return CdnStreamPlayType <p>播放协议，可取值：rtmp、flv、hls、dash、hls|dash、customization。<br>自定义回源协议填写 customization。</p>
     */
    public String [] getCdnStreamPlayType() {
        return this.CdnStreamPlayType;
    }

    /**
     * Set <p>播放协议，可取值：rtmp、flv、hls、dash、hls|dash、customization。<br>自定义回源协议填写 customization。</p>
     * @param CdnStreamPlayType <p>播放协议，可取值：rtmp、flv、hls、dash、hls|dash、customization。<br>自定义回源协议填写 customization。</p>
     */
    public void setCdnStreamPlayType(String [] CdnStreamPlayType) {
        this.CdnStreamPlayType = CdnStreamPlayType;
    }

    /**
     * Get <p>原站类型：<br>1 =&gt; 直播原站。<br>2 =&gt; mediaPackage。</p> 
     * @return OriginStreamType <p>原站类型：<br>1 =&gt; 直播原站。<br>2 =&gt; mediaPackage。</p>
     */
    public Long getOriginStreamType() {
        return this.OriginStreamType;
    }

    /**
     * Set <p>原站类型：<br>1 =&gt; 直播原站。<br>2 =&gt; mediaPackage。</p>
     * @param OriginStreamType <p>原站类型：<br>1 =&gt; 直播原站。<br>2 =&gt; mediaPackage。</p>
     */
    public void setOriginStreamType(Long OriginStreamType) {
        this.OriginStreamType = OriginStreamType;
    }

    /**
     * Get <p>原站地址信息，每项用冒号分割域名（ip）、端口信息。<br>端口为空也要带上分号，表示取默认端口。<br>自定义回源协议填写 customization。</p> 
     * @return OriginAddress <p>原站地址信息，每项用冒号分割域名（ip）、端口信息。<br>端口为空也要带上分号，表示取默认端口。<br>自定义回源协议填写 customization。</p>
     */
    public String [] getOriginAddress() {
        return this.OriginAddress;
    }

    /**
     * Set <p>原站地址信息，每项用冒号分割域名（ip）、端口信息。<br>端口为空也要带上分号，表示取默认端口。<br>自定义回源协议填写 customization。</p>
     * @param OriginAddress <p>原站地址信息，每项用冒号分割域名（ip）、端口信息。<br>端口为空也要带上分号，表示取默认端口。<br>自定义回源协议填写 customization。</p>
     */
    public void setOriginAddress(String [] OriginAddress) {
        this.OriginAddress = OriginAddress;
    }

    /**
     * Get <p>原站地址类型：<br>1 =&gt; IP 类型。<br>2 =&gt; 域名类型。</p> 
     * @return OriginAddressType <p>原站地址类型：<br>1 =&gt; IP 类型。<br>2 =&gt; 域名类型。</p>
     */
    public Long getOriginAddressType() {
        return this.OriginAddressType;
    }

    /**
     * Set <p>原站地址类型：<br>1 =&gt; IP 类型。<br>2 =&gt; 域名类型。</p>
     * @param OriginAddressType <p>原站地址类型：<br>1 =&gt; IP 类型。<br>2 =&gt; 域名类型。</p>
     */
    public void setOriginAddressType(Long OriginAddressType) {
        this.OriginAddressType = OriginAddressType;
    }

    /**
     * Get <p>自定义名称</p> 
     * @return CustomerName <p>自定义名称</p>
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set <p>自定义名称</p>
     * @param CustomerName <p>自定义名称</p>
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get <p>原站 host。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p> 
     * @return OriginHost <p>原站 host。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     */
    public String getOriginHost() {
        return this.OriginHost;
    }

    /**
     * Set <p>原站 host。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     * @param OriginHost <p>原站 host。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     */
    public void setOriginHost(String OriginHost) {
        this.OriginHost = OriginHost;
    }

    /**
     * Get <p>超时时间，单位 ms，取值范围：1 ～ 60000，默认值：10000。</p> 
     * @return OriginTimeout <p>超时时间，单位 ms，取值范围：1 ～ 60000，默认值：10000。</p>
     */
    public Long getOriginTimeout() {
        return this.OriginTimeout;
    }

    /**
     * Set <p>超时时间，单位 ms，取值范围：1 ～ 60000，默认值：10000。</p>
     * @param OriginTimeout <p>超时时间，单位 ms，取值范围：1 ～ 60000，默认值：10000。</p>
     */
    public void setOriginTimeout(Long OriginTimeout) {
        this.OriginTimeout = OriginTimeout;
    }

    /**
     * Get <p>重试次数，单位 次，取值范围：1 ～ 10，默认值：10。</p> 
     * @return OriginRetryTimes <p>重试次数，单位 次，取值范围：1 ～ 10，默认值：10。</p>
     */
    public Long getOriginRetryTimes() {
        return this.OriginRetryTimes;
    }

    /**
     * Set <p>重试次数，单位 次，取值范围：1 ～ 10，默认值：10。</p>
     * @param OriginRetryTimes <p>重试次数，单位 次，取值范围：1 ～ 10，默认值：10。</p>
     */
    public void setOriginRetryTimes(Long OriginRetryTimes) {
        this.OriginRetryTimes = OriginRetryTimes;
    }

    /**
     * Get <p>是否透传 http 头信息，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p> 
     * @return PassThroughHttpHeader <p>是否透传 http 头信息，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     */
    public String getPassThroughHttpHeader() {
        return this.PassThroughHttpHeader;
    }

    /**
     * Set <p>是否透传 http 头信息，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     * @param PassThroughHttpHeader <p>是否透传 http 头信息，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     */
    public void setPassThroughHttpHeader(String PassThroughHttpHeader) {
        this.PassThroughHttpHeader = PassThroughHttpHeader;
    }

    /**
     * Get <p>是否透传相应，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p> 
     * @return PassThroughResponse <p>是否透传相应，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     */
    public String getPassThroughResponse() {
        return this.PassThroughResponse;
    }

    /**
     * Set <p>是否透传相应，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     * @param PassThroughResponse <p>是否透传相应，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     */
    public void setPassThroughResponse(String PassThroughResponse) {
        this.PassThroughResponse = PassThroughResponse;
    }

    /**
     * Get <p>是否透传参数，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p> 
     * @return PassThroughParam <p>是否透传参数，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     */
    public String getPassThroughParam() {
        return this.PassThroughParam;
    }

    /**
     * Set <p>是否透传参数，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     * @param PassThroughParam <p>是否透传参数，可取值：on、off。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     */
    public void setPassThroughParam(String PassThroughParam) {
        this.PassThroughParam = PassThroughParam;
    }

    /**
     * Get <p>索引缓存，单位 ms，取值范围：1 ～ 60000，默认值：10000。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p> 
     * @return IndexerCache <p>索引缓存，单位 ms，取值范围：1 ～ 60000，默认值：10000。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     */
    public Long getIndexerCache() {
        return this.IndexerCache;
    }

    /**
     * Set <p>索引缓存，单位 ms，取值范围：1 ～ 60000，默认值：10000。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     * @param IndexerCache <p>索引缓存，单位 ms，取值范围：1 ～ 60000，默认值：10000。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     */
    public void setIndexerCache(Long IndexerCache) {
        this.IndexerCache = IndexerCache;
    }

    /**
     * Get <p>分片缓存，单位 ms，取值范围：1 ～ 60000，默认值：10000。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p> 
     * @return FragmentCache <p>分片缓存，单位 ms，取值范围：1 ～ 60000，默认值：10000。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     */
    public Long getFragmentCache() {
        return this.FragmentCache;
    }

    /**
     * Set <p>分片缓存，单位 ms，取值范围：1 ～ 60000，默认值：10000。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     * @param FragmentCache <p>分片缓存，单位 ms，取值范围：1 ～ 60000，默认值：10000。<br>当原站播放协议为 hls 时，传递该字段才会生效。</p>
     */
    public void setFragmentCache(Long FragmentCache) {
        this.FragmentCache = FragmentCache;
    }

    /**
     * Get <p>分片数，单位 个，取值范围：1 ～ 10，默认值：3。</p> 
     * @return HlsPlayFragmentCount <p>分片数，单位 个，取值范围：1 ～ 10，默认值：3。</p>
     */
    public Long getHlsPlayFragmentCount() {
        return this.HlsPlayFragmentCount;
    }

    /**
     * Set <p>分片数，单位 个，取值范围：1 ～ 10，默认值：3。</p>
     * @param HlsPlayFragmentCount <p>分片数，单位 个，取值范围：1 ～ 10，默认值：3。</p>
     */
    public void setHlsPlayFragmentCount(Long HlsPlayFragmentCount) {
        this.HlsPlayFragmentCount = HlsPlayFragmentCount;
    }

    /**
     * Get <p>分片时长，单位 ms，取值范围：1 ～ 10000，默认值：3000。</p> 
     * @return HlsPlayFragmentDuration <p>分片时长，单位 ms，取值范围：1 ～ 10000，默认值：3000。</p>
     */
    public Long getHlsPlayFragmentDuration() {
        return this.HlsPlayFragmentDuration;
    }

    /**
     * Set <p>分片时长，单位 ms，取值范围：1 ～ 10000，默认值：3000。</p>
     * @param HlsPlayFragmentDuration <p>分片时长，单位 ms，取值范围：1 ～ 10000，默认值：3000。</p>
     */
    public void setHlsPlayFragmentDuration(Long HlsPlayFragmentDuration) {
        this.HlsPlayFragmentDuration = HlsPlayFragmentDuration;
    }

    /**
     * Get <p>时间戳修正，可取值：on、off，默认值：off。<br>当原站播放协议为 rtmp、flv 时，传递该字段才会生效。</p> 
     * @return TimeJitter <p>时间戳修正，可取值：on、off，默认值：off。<br>当原站播放协议为 rtmp、flv 时，传递该字段才会生效。</p>
     */
    public String getTimeJitter() {
        return this.TimeJitter;
    }

    /**
     * Set <p>时间戳修正，可取值：on、off，默认值：off。<br>当原站播放协议为 rtmp、flv 时，传递该字段才会生效。</p>
     * @param TimeJitter <p>时间戳修正，可取值：on、off，默认值：off。<br>当原站播放协议为 rtmp、flv 时，传递该字段才会生效。</p>
     */
    public void setTimeJitter(String TimeJitter) {
        this.TimeJitter = TimeJitter;
    }

    /**
     * Get <p>https 回源，可取值：on、off，默认值：off。<br>当原站播放协议为flv、hls时，传递此字段才会生效。</p> 
     * @return UsingHttps <p>https 回源，可取值：on、off，默认值：off。<br>当原站播放协议为flv、hls时，传递此字段才会生效。</p>
     */
    public String getUsingHttps() {
        return this.UsingHttps;
    }

    /**
     * Set <p>https 回源，可取值：on、off，默认值：off。<br>当原站播放协议为flv、hls时，传递此字段才会生效。</p>
     * @param UsingHttps <p>https 回源，可取值：on、off，默认值：off。<br>当原站播放协议为flv、hls时，传递此字段才会生效。</p>
     */
    public void setUsingHttps(String UsingHttps) {
        this.UsingHttps = UsingHttps;
    }

    /**
     * Get <p>遵循原站，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p> 
     * @return CacheFollowOrigin <p>遵循原站，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     */
    public String getCacheFollowOrigin() {
        return this.CacheFollowOrigin;
    }

    /**
     * Set <p>遵循原站，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     * @param CacheFollowOrigin <p>遵循原站，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     */
    public void setCacheFollowOrigin(String CacheFollowOrigin) {
        this.CacheFollowOrigin = CacheFollowOrigin;
    }

    /**
     * Get <p>状态码缓存，数组元素格式：<br>cacheKey:interval<br>cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。<br>interval 单位 ms。<br>当原站播放协议为hls时，传递此字段才会生效。</p> 
     * @return CacheStatusCode <p>状态码缓存，数组元素格式：<br>cacheKey:interval<br>cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。<br>interval 单位 ms。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     */
    public String [] getCacheStatusCode() {
        return this.CacheStatusCode;
    }

    /**
     * Set <p>状态码缓存，数组元素格式：<br>cacheKey:interval<br>cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。<br>interval 单位 ms。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     * @param CacheStatusCode <p>状态码缓存，数组元素格式：<br>cacheKey:interval<br>cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。<br>interval 单位 ms。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     */
    public void setCacheStatusCode(String [] CacheStatusCode) {
        this.CacheStatusCode = CacheStatusCode;
    }

    /**
     * Get <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。<br>url1、url2 长度限制100，不可包含特殊字符。<br>当原站播放协议为hls时，传递此字段才会生效。</p> 
     * @return UrlReplaceRules <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。<br>url1、url2 长度限制100，不可包含特殊字符。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     */
    public String [] getUrlReplaceRules() {
        return this.UrlReplaceRules;
    }

    /**
     * Set <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。<br>url1、url2 长度限制100，不可包含特殊字符。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     * @param UrlReplaceRules <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。<br>url1、url2 长度限制100，不可包含特殊字符。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     */
    public void setUrlReplaceRules(String [] UrlReplaceRules) {
        this.UrlReplaceRules = UrlReplaceRules;
    }

    /**
     * Get <p>options 支持，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p> 
     * @return OptionsRequest <p>options 支持，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     */
    public String getOptionsRequest() {
        return this.OptionsRequest;
    }

    /**
     * Set <p>options 支持，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     * @param OptionsRequest <p>options 支持，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     */
    public void setOptionsRequest(String OptionsRequest) {
        this.OptionsRequest = OptionsRequest;
    }

    /**
     * Get <p>follow 301/302，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p> 
     * @return FollowRedirect <p>follow 301/302，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     */
    public String getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set <p>follow 301/302，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     * @param FollowRedirect <p>follow 301/302，可取值：on、off，默认值：off。<br>当原站播放协议为hls时，传递此字段才会生效。</p>
     */
    public void setFollowRedirect(String FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get <p>当 OriginStreamPlayType 为 hls 时生效，设置索引缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p> 
     * @return IndexerKeepParam <p>当 OriginStreamPlayType 为 hls 时生效，设置索引缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
     */
    public String [] getIndexerKeepParam() {
        return this.IndexerKeepParam;
    }

    /**
     * Set <p>当 OriginStreamPlayType 为 hls 时生效，设置索引缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
     * @param IndexerKeepParam <p>当 OriginStreamPlayType 为 hls 时生效，设置索引缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
     */
    public void setIndexerKeepParam(String [] IndexerKeepParam) {
        this.IndexerKeepParam = IndexerKeepParam;
    }

    /**
     * Get <p>当 OriginStreamPlayType 为 hls 时生效，设置分片缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p> 
     * @return FragmentKeepParam <p>当 OriginStreamPlayType 为 hls 时生效，设置分片缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
     */
    public String [] getFragmentKeepParam() {
        return this.FragmentKeepParam;
    }

    /**
     * Set <p>当 OriginStreamPlayType 为 hls 时生效，设置分片缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
     * @param FragmentKeepParam <p>当 OriginStreamPlayType 为 hls 时生效，设置分片缓存保留指定参数列表，最多支持 30 组，每个参数小于等于 20 字符。</p>
     */
    public void setFragmentKeepParam(String [] FragmentKeepParam) {
        this.FragmentKeepParam = FragmentKeepParam;
    }

    /**
     * Get <p>当 OriginStreamType = 2 时有效，表示 mediapackage 具体类型：<br>media_package =&gt; 仅配置普通频道。<br>media_package_pure_ad =&gt; 仅配置广告。<br>media_package_mix_ad =&gt; 同时配置普通频道和广告。<br>注意：配置时候，优先使用 media_package。和 MediaPackageChannelTypes 字段配合使用。</p> 
     * @return MediaPackageType <p>当 OriginStreamType = 2 时有效，表示 mediapackage 具体类型：<br>media_package =&gt; 仅配置普通频道。<br>media_package_pure_ad =&gt; 仅配置广告。<br>media_package_mix_ad =&gt; 同时配置普通频道和广告。<br>注意：配置时候，优先使用 media_package。和 MediaPackageChannelTypes 字段配合使用。</p>
     */
    public String getMediaPackageType() {
        return this.MediaPackageType;
    }

    /**
     * Set <p>当 OriginStreamType = 2 时有效，表示 mediapackage 具体类型：<br>media_package =&gt; 仅配置普通频道。<br>media_package_pure_ad =&gt; 仅配置广告。<br>media_package_mix_ad =&gt; 同时配置普通频道和广告。<br>注意：配置时候，优先使用 media_package。和 MediaPackageChannelTypes 字段配合使用。</p>
     * @param MediaPackageType <p>当 OriginStreamType = 2 时有效，表示 mediapackage 具体类型：<br>media_package =&gt; 仅配置普通频道。<br>media_package_pure_ad =&gt; 仅配置广告。<br>media_package_mix_ad =&gt; 同时配置普通频道和广告。<br>注意：配置时候，优先使用 media_package。和 MediaPackageChannelTypes 字段配合使用。</p>
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
     * Get <p>当 OriginStreamPlayType 为 hls 时生效，设置索引自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下：<br>头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。<br>头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p> 
     * @return IndexerHeader <p>当 OriginStreamPlayType 为 hls 时生效，设置索引自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下：<br>头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。<br>头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p>
     */
    public String [] getIndexerHeader() {
        return this.IndexerHeader;
    }

    /**
     * Set <p>当 OriginStreamPlayType 为 hls 时生效，设置索引自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下：<br>头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。<br>头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p>
     * @param IndexerHeader <p>当 OriginStreamPlayType 为 hls 时生效，设置索引自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下：<br>头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。<br>头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p>
     */
    public void setIndexerHeader(String [] IndexerHeader) {
        this.IndexerHeader = IndexerHeader;
    }

    /**
     * Get <p>当 OriginStreamPlayType 为 hls 时生效，设置分片自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下：<br>头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。<br>头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p> 
     * @return FragmentHeader <p>当 OriginStreamPlayType 为 hls 时生效，设置分片自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下：<br>头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。<br>头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p>
     */
    public String [] getFragmentHeader() {
        return this.FragmentHeader;
    }

    /**
     * Set <p>当 OriginStreamPlayType 为 hls 时生效，设置分片自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下：<br>头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。<br>头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p>
     * @param FragmentHeader <p>当 OriginStreamPlayType 为 hls 时生效，设置分片自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下：<br>头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。<br>头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p>
     */
    public void setFragmentHeader(String [] FragmentHeader) {
        this.FragmentHeader = FragmentHeader;
    }

    /**
     * Get <p>自定义回源规则列表，当 OriginStreamPlayType 为 customization 时候生效。</p> 
     * @return CustomizationRules <p>自定义回源规则列表，当 OriginStreamPlayType 为 customization 时候生效。</p>
     */
    public OriginStreamCustomizationRule [] getCustomizationRules() {
        return this.CustomizationRules;
    }

    /**
     * Set <p>自定义回源规则列表，当 OriginStreamPlayType 为 customization 时候生效。</p>
     * @param CustomizationRules <p>自定义回源规则列表，当 OriginStreamPlayType 为 customization 时候生效。</p>
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

    public ModifyOriginStreamInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOriginStreamInfoRequest(ModifyOriginStreamInfoRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.OriginStreamPlayType != null) {
            this.OriginStreamPlayType = new String(source.OriginStreamPlayType);
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
        if (source.OriginAddress != null) {
            this.OriginAddress = new String[source.OriginAddress.length];
            for (int i = 0; i < source.OriginAddress.length; i++) {
                this.OriginAddress[i] = new String(source.OriginAddress[i]);
            }
        }
        if (source.OriginAddressType != null) {
            this.OriginAddressType = new Long(source.OriginAddressType);
        }
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.OriginHost != null) {
            this.OriginHost = new String(source.OriginHost);
        }
        if (source.OriginTimeout != null) {
            this.OriginTimeout = new Long(source.OriginTimeout);
        }
        if (source.OriginRetryTimes != null) {
            this.OriginRetryTimes = new Long(source.OriginRetryTimes);
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
        if (source.IndexerCache != null) {
            this.IndexerCache = new Long(source.IndexerCache);
        }
        if (source.FragmentCache != null) {
            this.FragmentCache = new Long(source.FragmentCache);
        }
        if (source.HlsPlayFragmentCount != null) {
            this.HlsPlayFragmentCount = new Long(source.HlsPlayFragmentCount);
        }
        if (source.HlsPlayFragmentDuration != null) {
            this.HlsPlayFragmentDuration = new Long(source.HlsPlayFragmentDuration);
        }
        if (source.TimeJitter != null) {
            this.TimeJitter = new String(source.TimeJitter);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "OriginStreamPlayType", this.OriginStreamPlayType);
        this.setParamArraySimple(map, prefix + "CdnStreamPlayType.", this.CdnStreamPlayType);
        this.setParamSimple(map, prefix + "OriginStreamType", this.OriginStreamType);
        this.setParamArraySimple(map, prefix + "OriginAddress.", this.OriginAddress);
        this.setParamSimple(map, prefix + "OriginAddressType", this.OriginAddressType);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "OriginHost", this.OriginHost);
        this.setParamSimple(map, prefix + "OriginTimeout", this.OriginTimeout);
        this.setParamSimple(map, prefix + "OriginRetryTimes", this.OriginRetryTimes);
        this.setParamSimple(map, prefix + "PassThroughHttpHeader", this.PassThroughHttpHeader);
        this.setParamSimple(map, prefix + "PassThroughResponse", this.PassThroughResponse);
        this.setParamSimple(map, prefix + "PassThroughParam", this.PassThroughParam);
        this.setParamSimple(map, prefix + "IndexerCache", this.IndexerCache);
        this.setParamSimple(map, prefix + "FragmentCache", this.FragmentCache);
        this.setParamSimple(map, prefix + "HlsPlayFragmentCount", this.HlsPlayFragmentCount);
        this.setParamSimple(map, prefix + "HlsPlayFragmentDuration", this.HlsPlayFragmentDuration);
        this.setParamSimple(map, prefix + "TimeJitter", this.TimeJitter);
        this.setParamSimple(map, prefix + "UsingHttps", this.UsingHttps);
        this.setParamSimple(map, prefix + "CacheFollowOrigin", this.CacheFollowOrigin);
        this.setParamArraySimple(map, prefix + "CacheStatusCode.", this.CacheStatusCode);
        this.setParamArraySimple(map, prefix + "UrlReplaceRules.", this.UrlReplaceRules);
        this.setParamSimple(map, prefix + "OptionsRequest", this.OptionsRequest);
        this.setParamSimple(map, prefix + "FollowRedirect", this.FollowRedirect);
        this.setParamArraySimple(map, prefix + "IndexerKeepParam.", this.IndexerKeepParam);
        this.setParamArraySimple(map, prefix + "FragmentKeepParam.", this.FragmentKeepParam);
        this.setParamSimple(map, prefix + "MediaPackageType", this.MediaPackageType);
        this.setParamArraySimple(map, prefix + "MediaPackageChannelTypes.", this.MediaPackageChannelTypes);
        this.setParamArraySimple(map, prefix + "IndexerHeader.", this.IndexerHeader);
        this.setParamArraySimple(map, prefix + "FragmentHeader.", this.FragmentHeader);
        this.setParamArrayObj(map, prefix + "CustomizationRules.", this.CustomizationRules);
        this.setParamSimple(map, prefix + "CacheFormatRule", this.CacheFormatRule);

    }
}

