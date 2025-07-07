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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationHttpOriginParameter extends AbstractModel {

    /**
    * HTTP 头部透传信息。
    */
    @SerializedName("HttpHeaderInfo")
    @Expose
    private IncrementalMigrationHttpHeaderInfo HttpHeaderInfo;

    /**
    * 回源协议。取值有：
<li>HTTP：强制 HTTP；</li>
<li>HTTPS：强制 HTTPS；</li>
<li>FOLLOW：跟随请求协议。</li>若不填，默认取值 `FOLLOW`。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 请求参数透传模式。取值有：
<li>FOLLOW：全部透传；</li>
<li>IGNORE：忽略，全部不透传。</li> 默认取值 `FOLLOW`。
    */
    @SerializedName("QueryStringFollowMode")
    @Expose
    private String QueryStringFollowMode;

    /**
    * 重定向的 HTTP Code，目前仅支持 `301`，`302` 和 `307`。默认取值 `302`。
    */
    @SerializedName("HttpRedirectCode")
    @Expose
    private Long HttpRedirectCode;

    /**
    * 源站重定向跟随模式。取值有：
<li>FOLLOW：跟随源站重定向；</li>
<li>IGNORE：忽略源站重定向。</li> 默认取值 `FOLLOW` 跟随源站重定向，即源站返回 `3xx` 时，会默认跟随至对应源站拉取数据。
    */
    @SerializedName("OriginRedirectionFollowMode")
    @Expose
    private String OriginRedirectionFollowMode;

    /**
     * Get HTTP 头部透传信息。 
     * @return HttpHeaderInfo HTTP 头部透传信息。
     */
    public IncrementalMigrationHttpHeaderInfo getHttpHeaderInfo() {
        return this.HttpHeaderInfo;
    }

    /**
     * Set HTTP 头部透传信息。
     * @param HttpHeaderInfo HTTP 头部透传信息。
     */
    public void setHttpHeaderInfo(IncrementalMigrationHttpHeaderInfo HttpHeaderInfo) {
        this.HttpHeaderInfo = HttpHeaderInfo;
    }

    /**
     * Get 回源协议。取值有：
<li>HTTP：强制 HTTP；</li>
<li>HTTPS：强制 HTTPS；</li>
<li>FOLLOW：跟随请求协议。</li>若不填，默认取值 `FOLLOW`。 
     * @return Protocol 回源协议。取值有：
<li>HTTP：强制 HTTP；</li>
<li>HTTPS：强制 HTTPS；</li>
<li>FOLLOW：跟随请求协议。</li>若不填，默认取值 `FOLLOW`。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 回源协议。取值有：
<li>HTTP：强制 HTTP；</li>
<li>HTTPS：强制 HTTPS；</li>
<li>FOLLOW：跟随请求协议。</li>若不填，默认取值 `FOLLOW`。
     * @param Protocol 回源协议。取值有：
<li>HTTP：强制 HTTP；</li>
<li>HTTPS：强制 HTTPS；</li>
<li>FOLLOW：跟随请求协议。</li>若不填，默认取值 `FOLLOW`。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 请求参数透传模式。取值有：
<li>FOLLOW：全部透传；</li>
<li>IGNORE：忽略，全部不透传。</li> 默认取值 `FOLLOW`。 
     * @return QueryStringFollowMode 请求参数透传模式。取值有：
<li>FOLLOW：全部透传；</li>
<li>IGNORE：忽略，全部不透传。</li> 默认取值 `FOLLOW`。
     */
    public String getQueryStringFollowMode() {
        return this.QueryStringFollowMode;
    }

    /**
     * Set 请求参数透传模式。取值有：
<li>FOLLOW：全部透传；</li>
<li>IGNORE：忽略，全部不透传。</li> 默认取值 `FOLLOW`。
     * @param QueryStringFollowMode 请求参数透传模式。取值有：
<li>FOLLOW：全部透传；</li>
<li>IGNORE：忽略，全部不透传。</li> 默认取值 `FOLLOW`。
     */
    public void setQueryStringFollowMode(String QueryStringFollowMode) {
        this.QueryStringFollowMode = QueryStringFollowMode;
    }

    /**
     * Get 重定向的 HTTP Code，目前仅支持 `301`，`302` 和 `307`。默认取值 `302`。 
     * @return HttpRedirectCode 重定向的 HTTP Code，目前仅支持 `301`，`302` 和 `307`。默认取值 `302`。
     */
    public Long getHttpRedirectCode() {
        return this.HttpRedirectCode;
    }

    /**
     * Set 重定向的 HTTP Code，目前仅支持 `301`，`302` 和 `307`。默认取值 `302`。
     * @param HttpRedirectCode 重定向的 HTTP Code，目前仅支持 `301`，`302` 和 `307`。默认取值 `302`。
     */
    public void setHttpRedirectCode(Long HttpRedirectCode) {
        this.HttpRedirectCode = HttpRedirectCode;
    }

    /**
     * Get 源站重定向跟随模式。取值有：
<li>FOLLOW：跟随源站重定向；</li>
<li>IGNORE：忽略源站重定向。</li> 默认取值 `FOLLOW` 跟随源站重定向，即源站返回 `3xx` 时，会默认跟随至对应源站拉取数据。 
     * @return OriginRedirectionFollowMode 源站重定向跟随模式。取值有：
<li>FOLLOW：跟随源站重定向；</li>
<li>IGNORE：忽略源站重定向。</li> 默认取值 `FOLLOW` 跟随源站重定向，即源站返回 `3xx` 时，会默认跟随至对应源站拉取数据。
     */
    public String getOriginRedirectionFollowMode() {
        return this.OriginRedirectionFollowMode;
    }

    /**
     * Set 源站重定向跟随模式。取值有：
<li>FOLLOW：跟随源站重定向；</li>
<li>IGNORE：忽略源站重定向。</li> 默认取值 `FOLLOW` 跟随源站重定向，即源站返回 `3xx` 时，会默认跟随至对应源站拉取数据。
     * @param OriginRedirectionFollowMode 源站重定向跟随模式。取值有：
<li>FOLLOW：跟随源站重定向；</li>
<li>IGNORE：忽略源站重定向。</li> 默认取值 `FOLLOW` 跟随源站重定向，即源站返回 `3xx` 时，会默认跟随至对应源站拉取数据。
     */
    public void setOriginRedirectionFollowMode(String OriginRedirectionFollowMode) {
        this.OriginRedirectionFollowMode = OriginRedirectionFollowMode;
    }

    public IncrementalMigrationHttpOriginParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationHttpOriginParameter(IncrementalMigrationHttpOriginParameter source) {
        if (source.HttpHeaderInfo != null) {
            this.HttpHeaderInfo = new IncrementalMigrationHttpHeaderInfo(source.HttpHeaderInfo);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.QueryStringFollowMode != null) {
            this.QueryStringFollowMode = new String(source.QueryStringFollowMode);
        }
        if (source.HttpRedirectCode != null) {
            this.HttpRedirectCode = new Long(source.HttpRedirectCode);
        }
        if (source.OriginRedirectionFollowMode != null) {
            this.OriginRedirectionFollowMode = new String(source.OriginRedirectionFollowMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HttpHeaderInfo.", this.HttpHeaderInfo);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "QueryStringFollowMode", this.QueryStringFollowMode);
        this.setParamSimple(map, prefix + "HttpRedirectCode", this.HttpRedirectCode);
        this.setParamSimple(map, prefix + "OriginRedirectionFollowMode", this.OriginRedirectionFollowMode);

    }
}

