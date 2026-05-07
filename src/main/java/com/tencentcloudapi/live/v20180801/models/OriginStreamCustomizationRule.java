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

public class OriginStreamCustomizationRule extends AbstractModel {

    /**
    * <p>匹配规则，可选项如下：<br>.m3u8、.mpd、.ts、.mp4、.m4s、.m4a、.m4i、.m4v、.m4f、.aac、.webm。</p>
    */
    @SerializedName("MatchRule")
    @Expose
    private String MatchRule;

    /**
    * <p>原站地址类型： 1 =&gt; IP 类型。 2 =&gt; 域名类型。</p>
    */
    @SerializedName("OriginAddressType")
    @Expose
    private Long OriginAddressType;

    /**
    * <p>原站 host。</p>
    */
    @SerializedName("OriginHost")
    @Expose
    private String OriginHost;

    /**
    * <p>原站地址信息，每项用冒号分割域名（ip）、端口信息。 端口为空也要带上分号，表示取默认端口。</p>
    */
    @SerializedName("OriginAddress")
    @Expose
    private String [] OriginAddress;

    /**
    * <p>是否透传 http 头信息，可取值：on、off。</p>
    */
    @SerializedName("PassThroughHttpHeader")
    @Expose
    private String PassThroughHttpHeader;

    /**
    * <p>是否透传相应，可取值：on、off。</p>
    */
    @SerializedName("PassThroughResponse")
    @Expose
    private String PassThroughResponse;

    /**
    * <p>是否透传参数，可取值：on、off。</p>
    */
    @SerializedName("PassThroughParam")
    @Expose
    private String PassThroughParam;

    /**
    * <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。 url1、url2 长度限制100，不可包含特殊字符。</p>
    */
    @SerializedName("UrlReplaceRules")
    @Expose
    private String [] UrlReplaceRules;

    /**
    * <p>options 支持，可取值：on、off，默认值：off。</p>
    */
    @SerializedName("OptionsRequest")
    @Expose
    private String OptionsRequest;

    /**
    * <p>回源超时时间，单位 ms，取值范围：1 ～ 60000，默认值：10000。</p>
    */
    @SerializedName("OriginTimeout")
    @Expose
    private Long OriginTimeout;

    /**
    * <p>重试次数，单位 次，取值范围：1 ～ 10。</p>
    */
    @SerializedName("OriginRetryTimes")
    @Expose
    private Long OriginRetryTimes;

    /**
    * <p>状态码缓存，数组元素格式： cacheKey:interval cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。 interval 单位 s。</p>
    */
    @SerializedName("CacheStatusCode")
    @Expose
    private String [] CacheStatusCode;

    /**
    * <p>缓存时间，单位 s，取值范围：0 ～ 31536000。</p>
    */
    @SerializedName("Cache")
    @Expose
    private Long Cache;

    /**
    * <p>缓存键。</p>
    */
    @SerializedName("KeepParam")
    @Expose
    private String [] KeepParam;

    /**
    * <p>设置索引自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下： 头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。 头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p>
    */
    @SerializedName("HttpHeader")
    @Expose
    private String [] HttpHeader;

    /**
    * <p>自定义回源缓存随源配置。<br>0：不开启。<br>1：开启。</p>
    */
    @SerializedName("CustomizationCacheFollowOrigin")
    @Expose
    private Long CustomizationCacheFollowOrigin;

    /**
    * <p>缓存 Http 头部键。</p>
    */
    @SerializedName("KeepHttpHeader")
    @Expose
    private String [] KeepHttpHeader;

    /**
     * Get <p>匹配规则，可选项如下：<br>.m3u8、.mpd、.ts、.mp4、.m4s、.m4a、.m4i、.m4v、.m4f、.aac、.webm。</p> 
     * @return MatchRule <p>匹配规则，可选项如下：<br>.m3u8、.mpd、.ts、.mp4、.m4s、.m4a、.m4i、.m4v、.m4f、.aac、.webm。</p>
     */
    public String getMatchRule() {
        return this.MatchRule;
    }

    /**
     * Set <p>匹配规则，可选项如下：<br>.m3u8、.mpd、.ts、.mp4、.m4s、.m4a、.m4i、.m4v、.m4f、.aac、.webm。</p>
     * @param MatchRule <p>匹配规则，可选项如下：<br>.m3u8、.mpd、.ts、.mp4、.m4s、.m4a、.m4i、.m4v、.m4f、.aac、.webm。</p>
     */
    public void setMatchRule(String MatchRule) {
        this.MatchRule = MatchRule;
    }

    /**
     * Get <p>原站地址类型： 1 =&gt; IP 类型。 2 =&gt; 域名类型。</p> 
     * @return OriginAddressType <p>原站地址类型： 1 =&gt; IP 类型。 2 =&gt; 域名类型。</p>
     */
    public Long getOriginAddressType() {
        return this.OriginAddressType;
    }

    /**
     * Set <p>原站地址类型： 1 =&gt; IP 类型。 2 =&gt; 域名类型。</p>
     * @param OriginAddressType <p>原站地址类型： 1 =&gt; IP 类型。 2 =&gt; 域名类型。</p>
     */
    public void setOriginAddressType(Long OriginAddressType) {
        this.OriginAddressType = OriginAddressType;
    }

    /**
     * Get <p>原站 host。</p> 
     * @return OriginHost <p>原站 host。</p>
     */
    public String getOriginHost() {
        return this.OriginHost;
    }

    /**
     * Set <p>原站 host。</p>
     * @param OriginHost <p>原站 host。</p>
     */
    public void setOriginHost(String OriginHost) {
        this.OriginHost = OriginHost;
    }

    /**
     * Get <p>原站地址信息，每项用冒号分割域名（ip）、端口信息。 端口为空也要带上分号，表示取默认端口。</p> 
     * @return OriginAddress <p>原站地址信息，每项用冒号分割域名（ip）、端口信息。 端口为空也要带上分号，表示取默认端口。</p>
     */
    public String [] getOriginAddress() {
        return this.OriginAddress;
    }

    /**
     * Set <p>原站地址信息，每项用冒号分割域名（ip）、端口信息。 端口为空也要带上分号，表示取默认端口。</p>
     * @param OriginAddress <p>原站地址信息，每项用冒号分割域名（ip）、端口信息。 端口为空也要带上分号，表示取默认端口。</p>
     */
    public void setOriginAddress(String [] OriginAddress) {
        this.OriginAddress = OriginAddress;
    }

    /**
     * Get <p>是否透传 http 头信息，可取值：on、off。</p> 
     * @return PassThroughHttpHeader <p>是否透传 http 头信息，可取值：on、off。</p>
     */
    public String getPassThroughHttpHeader() {
        return this.PassThroughHttpHeader;
    }

    /**
     * Set <p>是否透传 http 头信息，可取值：on、off。</p>
     * @param PassThroughHttpHeader <p>是否透传 http 头信息，可取值：on、off。</p>
     */
    public void setPassThroughHttpHeader(String PassThroughHttpHeader) {
        this.PassThroughHttpHeader = PassThroughHttpHeader;
    }

    /**
     * Get <p>是否透传相应，可取值：on、off。</p> 
     * @return PassThroughResponse <p>是否透传相应，可取值：on、off。</p>
     */
    public String getPassThroughResponse() {
        return this.PassThroughResponse;
    }

    /**
     * Set <p>是否透传相应，可取值：on、off。</p>
     * @param PassThroughResponse <p>是否透传相应，可取值：on、off。</p>
     */
    public void setPassThroughResponse(String PassThroughResponse) {
        this.PassThroughResponse = PassThroughResponse;
    }

    /**
     * Get <p>是否透传参数，可取值：on、off。</p> 
     * @return PassThroughParam <p>是否透传参数，可取值：on、off。</p>
     */
    public String getPassThroughParam() {
        return this.PassThroughParam;
    }

    /**
     * Set <p>是否透传参数，可取值：on、off。</p>
     * @param PassThroughParam <p>是否透传参数，可取值：on、off。</p>
     */
    public void setPassThroughParam(String PassThroughParam) {
        this.PassThroughParam = PassThroughParam;
    }

    /**
     * Get <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。 url1、url2 长度限制100，不可包含特殊字符。</p> 
     * @return UrlReplaceRules <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。 url1、url2 长度限制100，不可包含特殊字符。</p>
     */
    public String [] getUrlReplaceRules() {
        return this.UrlReplaceRules;
    }

    /**
     * Set <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。 url1、url2 长度限制100，不可包含特殊字符。</p>
     * @param UrlReplaceRules <p>url改写， 格式为： url1&lt;|&gt;url2; 其中，&lt;|&gt; 为分隔符。 url1、url2 长度限制100，不可包含特殊字符。</p>
     */
    public void setUrlReplaceRules(String [] UrlReplaceRules) {
        this.UrlReplaceRules = UrlReplaceRules;
    }

    /**
     * Get <p>options 支持，可取值：on、off，默认值：off。</p> 
     * @return OptionsRequest <p>options 支持，可取值：on、off，默认值：off。</p>
     */
    public String getOptionsRequest() {
        return this.OptionsRequest;
    }

    /**
     * Set <p>options 支持，可取值：on、off，默认值：off。</p>
     * @param OptionsRequest <p>options 支持，可取值：on、off，默认值：off。</p>
     */
    public void setOptionsRequest(String OptionsRequest) {
        this.OptionsRequest = OptionsRequest;
    }

    /**
     * Get <p>回源超时时间，单位 ms，取值范围：1 ～ 60000，默认值：10000。</p> 
     * @return OriginTimeout <p>回源超时时间，单位 ms，取值范围：1 ～ 60000，默认值：10000。</p>
     */
    public Long getOriginTimeout() {
        return this.OriginTimeout;
    }

    /**
     * Set <p>回源超时时间，单位 ms，取值范围：1 ～ 60000，默认值：10000。</p>
     * @param OriginTimeout <p>回源超时时间，单位 ms，取值范围：1 ～ 60000，默认值：10000。</p>
     */
    public void setOriginTimeout(Long OriginTimeout) {
        this.OriginTimeout = OriginTimeout;
    }

    /**
     * Get <p>重试次数，单位 次，取值范围：1 ～ 10。</p> 
     * @return OriginRetryTimes <p>重试次数，单位 次，取值范围：1 ～ 10。</p>
     */
    public Long getOriginRetryTimes() {
        return this.OriginRetryTimes;
    }

    /**
     * Set <p>重试次数，单位 次，取值范围：1 ～ 10。</p>
     * @param OriginRetryTimes <p>重试次数，单位 次，取值范围：1 ～ 10。</p>
     */
    public void setOriginRetryTimes(Long OriginRetryTimes) {
        this.OriginRetryTimes = OriginRetryTimes;
    }

    /**
     * Get <p>状态码缓存，数组元素格式： cacheKey:interval cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。 interval 单位 s。</p> 
     * @return CacheStatusCode <p>状态码缓存，数组元素格式： cacheKey:interval cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。 interval 单位 s。</p>
     */
    public String [] getCacheStatusCode() {
        return this.CacheStatusCode;
    }

    /**
     * Set <p>状态码缓存，数组元素格式： cacheKey:interval cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。 interval 单位 s。</p>
     * @param CacheStatusCode <p>状态码缓存，数组元素格式： cacheKey:interval cacheKey 可取值：cache_400_sec、cache_403_sec、cache_404_sec、cache_405_sec、cache_500_sec、cache_503_sec、cache_504_sec。 interval 单位 s。</p>
     */
    public void setCacheStatusCode(String [] CacheStatusCode) {
        this.CacheStatusCode = CacheStatusCode;
    }

    /**
     * Get <p>缓存时间，单位 s，取值范围：0 ～ 31536000。</p> 
     * @return Cache <p>缓存时间，单位 s，取值范围：0 ～ 31536000。</p>
     */
    public Long getCache() {
        return this.Cache;
    }

    /**
     * Set <p>缓存时间，单位 s，取值范围：0 ～ 31536000。</p>
     * @param Cache <p>缓存时间，单位 s，取值范围：0 ～ 31536000。</p>
     */
    public void setCache(Long Cache) {
        this.Cache = Cache;
    }

    /**
     * Get <p>缓存键。</p> 
     * @return KeepParam <p>缓存键。</p>
     */
    public String [] getKeepParam() {
        return this.KeepParam;
    }

    /**
     * Set <p>缓存键。</p>
     * @param KeepParam <p>缓存键。</p>
     */
    public void setKeepParam(String [] KeepParam) {
        this.KeepParam = KeepParam;
    }

    /**
     * Get <p>设置索引自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下： 头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。 头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p> 
     * @return HttpHeader <p>设置索引自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下： 头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。 头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p>
     */
    public String [] getHttpHeader() {
        return this.HttpHeader;
    }

    /**
     * Set <p>设置索引自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下： 头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。 头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p>
     * @param HttpHeader <p>设置索引自定义 header，最大支持 10 组，每一组参数、取值用空格分开，允许字符规则如下： 头部参数：由大小写字母、数字及-组成，长度支持1 ～100个字符，黑名单：Host、Connection、Content-Length、Range。 头部取值：不支持中文、不支持以$开头，长度支持1 ～ 100个字符，不允许有空格。</p>
     */
    public void setHttpHeader(String [] HttpHeader) {
        this.HttpHeader = HttpHeader;
    }

    /**
     * Get <p>自定义回源缓存随源配置。<br>0：不开启。<br>1：开启。</p> 
     * @return CustomizationCacheFollowOrigin <p>自定义回源缓存随源配置。<br>0：不开启。<br>1：开启。</p>
     */
    public Long getCustomizationCacheFollowOrigin() {
        return this.CustomizationCacheFollowOrigin;
    }

    /**
     * Set <p>自定义回源缓存随源配置。<br>0：不开启。<br>1：开启。</p>
     * @param CustomizationCacheFollowOrigin <p>自定义回源缓存随源配置。<br>0：不开启。<br>1：开启。</p>
     */
    public void setCustomizationCacheFollowOrigin(Long CustomizationCacheFollowOrigin) {
        this.CustomizationCacheFollowOrigin = CustomizationCacheFollowOrigin;
    }

    /**
     * Get <p>缓存 Http 头部键。</p> 
     * @return KeepHttpHeader <p>缓存 Http 头部键。</p>
     */
    public String [] getKeepHttpHeader() {
        return this.KeepHttpHeader;
    }

    /**
     * Set <p>缓存 Http 头部键。</p>
     * @param KeepHttpHeader <p>缓存 Http 头部键。</p>
     */
    public void setKeepHttpHeader(String [] KeepHttpHeader) {
        this.KeepHttpHeader = KeepHttpHeader;
    }

    public OriginStreamCustomizationRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginStreamCustomizationRule(OriginStreamCustomizationRule source) {
        if (source.MatchRule != null) {
            this.MatchRule = new String(source.MatchRule);
        }
        if (source.OriginAddressType != null) {
            this.OriginAddressType = new Long(source.OriginAddressType);
        }
        if (source.OriginHost != null) {
            this.OriginHost = new String(source.OriginHost);
        }
        if (source.OriginAddress != null) {
            this.OriginAddress = new String[source.OriginAddress.length];
            for (int i = 0; i < source.OriginAddress.length; i++) {
                this.OriginAddress[i] = new String(source.OriginAddress[i]);
            }
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
        if (source.UrlReplaceRules != null) {
            this.UrlReplaceRules = new String[source.UrlReplaceRules.length];
            for (int i = 0; i < source.UrlReplaceRules.length; i++) {
                this.UrlReplaceRules[i] = new String(source.UrlReplaceRules[i]);
            }
        }
        if (source.OptionsRequest != null) {
            this.OptionsRequest = new String(source.OptionsRequest);
        }
        if (source.OriginTimeout != null) {
            this.OriginTimeout = new Long(source.OriginTimeout);
        }
        if (source.OriginRetryTimes != null) {
            this.OriginRetryTimes = new Long(source.OriginRetryTimes);
        }
        if (source.CacheStatusCode != null) {
            this.CacheStatusCode = new String[source.CacheStatusCode.length];
            for (int i = 0; i < source.CacheStatusCode.length; i++) {
                this.CacheStatusCode[i] = new String(source.CacheStatusCode[i]);
            }
        }
        if (source.Cache != null) {
            this.Cache = new Long(source.Cache);
        }
        if (source.KeepParam != null) {
            this.KeepParam = new String[source.KeepParam.length];
            for (int i = 0; i < source.KeepParam.length; i++) {
                this.KeepParam[i] = new String(source.KeepParam[i]);
            }
        }
        if (source.HttpHeader != null) {
            this.HttpHeader = new String[source.HttpHeader.length];
            for (int i = 0; i < source.HttpHeader.length; i++) {
                this.HttpHeader[i] = new String(source.HttpHeader[i]);
            }
        }
        if (source.CustomizationCacheFollowOrigin != null) {
            this.CustomizationCacheFollowOrigin = new Long(source.CustomizationCacheFollowOrigin);
        }
        if (source.KeepHttpHeader != null) {
            this.KeepHttpHeader = new String[source.KeepHttpHeader.length];
            for (int i = 0; i < source.KeepHttpHeader.length; i++) {
                this.KeepHttpHeader[i] = new String(source.KeepHttpHeader[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchRule", this.MatchRule);
        this.setParamSimple(map, prefix + "OriginAddressType", this.OriginAddressType);
        this.setParamSimple(map, prefix + "OriginHost", this.OriginHost);
        this.setParamArraySimple(map, prefix + "OriginAddress.", this.OriginAddress);
        this.setParamSimple(map, prefix + "PassThroughHttpHeader", this.PassThroughHttpHeader);
        this.setParamSimple(map, prefix + "PassThroughResponse", this.PassThroughResponse);
        this.setParamSimple(map, prefix + "PassThroughParam", this.PassThroughParam);
        this.setParamArraySimple(map, prefix + "UrlReplaceRules.", this.UrlReplaceRules);
        this.setParamSimple(map, prefix + "OptionsRequest", this.OptionsRequest);
        this.setParamSimple(map, prefix + "OriginTimeout", this.OriginTimeout);
        this.setParamSimple(map, prefix + "OriginRetryTimes", this.OriginRetryTimes);
        this.setParamArraySimple(map, prefix + "CacheStatusCode.", this.CacheStatusCode);
        this.setParamSimple(map, prefix + "Cache", this.Cache);
        this.setParamArraySimple(map, prefix + "KeepParam.", this.KeepParam);
        this.setParamArraySimple(map, prefix + "HttpHeader.", this.HttpHeader);
        this.setParamSimple(map, prefix + "CustomizationCacheFollowOrigin", this.CustomizationCacheFollowOrigin);
        this.setParamArraySimple(map, prefix + "KeepHttpHeader.", this.KeepHttpHeader);

    }
}

