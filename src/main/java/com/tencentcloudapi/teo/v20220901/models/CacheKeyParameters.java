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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheKeyParameters extends AbstractModel {

    /**
    * 查询字符串全部保留开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。此字段和 QueryString.Switch 必须同时设置，但不能同为 on。
    */
    @SerializedName("FullURLCache")
    @Expose
    private String FullURLCache;

    /**
    * 查询字符串保留配置参数。此字段和 FullURLCache 必须同时设置，但不能同为 on。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryString")
    @Expose
    private CacheKeyQueryString QueryString;

    /**
    * 忽略大小写开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
    */
    @SerializedName("IgnoreCase")
    @Expose
    private String IgnoreCase;

    /**
    * HTTP 请求头配置参数。FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Header")
    @Expose
    private CacheKeyHeader Header;

    /**
    * 请求协议开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * Cookie 配置参数。FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cookie")
    @Expose
    private CacheKeyCookie Cookie;

    /**
     * Get 查询字符串全部保留开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。此字段和 QueryString.Switch 必须同时设置，但不能同为 on。 
     * @return FullURLCache 查询字符串全部保留开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。此字段和 QueryString.Switch 必须同时设置，但不能同为 on。
     */
    public String getFullURLCache() {
        return this.FullURLCache;
    }

    /**
     * Set 查询字符串全部保留开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。此字段和 QueryString.Switch 必须同时设置，但不能同为 on。
     * @param FullURLCache 查询字符串全部保留开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。此字段和 QueryString.Switch 必须同时设置，但不能同为 on。
     */
    public void setFullURLCache(String FullURLCache) {
        this.FullURLCache = FullURLCache;
    }

    /**
     * Get 查询字符串保留配置参数。此字段和 FullURLCache 必须同时设置，但不能同为 on。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryString 查询字符串保留配置参数。此字段和 FullURLCache 必须同时设置，但不能同为 on。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheKeyQueryString getQueryString() {
        return this.QueryString;
    }

    /**
     * Set 查询字符串保留配置参数。此字段和 FullURLCache 必须同时设置，但不能同为 on。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryString 查询字符串保留配置参数。此字段和 FullURLCache 必须同时设置，但不能同为 on。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryString(CacheKeyQueryString QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get 忽略大小写开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。 
     * @return IgnoreCase 忽略大小写开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
     */
    public String getIgnoreCase() {
        return this.IgnoreCase;
    }

    /**
     * Set 忽略大小写开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
     * @param IgnoreCase 忽略大小写开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
     */
    public void setIgnoreCase(String IgnoreCase) {
        this.IgnoreCase = IgnoreCase;
    }

    /**
     * Get HTTP 请求头配置参数。FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Header HTTP 请求头配置参数。FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheKeyHeader getHeader() {
        return this.Header;
    }

    /**
     * Set HTTP 请求头配置参数。FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Header HTTP 请求头配置参数。FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeader(CacheKeyHeader Header) {
        this.Header = Header;
    }

    /**
     * Get 请求协议开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。 
     * @return Scheme 请求协议开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set 请求协议开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
     * @param Scheme 请求协议开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>注意：FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get Cookie 配置参数。FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cookie Cookie 配置参数。FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheKeyCookie getCookie() {
        return this.Cookie;
    }

    /**
     * Set Cookie 配置参数。FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cookie Cookie 配置参数。FullURLCache、IgnoreCase、Header、Scheme、Cookie 至少设置一个配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCookie(CacheKeyCookie Cookie) {
        this.Cookie = Cookie;
    }

    public CacheKeyParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheKeyParameters(CacheKeyParameters source) {
        if (source.FullURLCache != null) {
            this.FullURLCache = new String(source.FullURLCache);
        }
        if (source.QueryString != null) {
            this.QueryString = new CacheKeyQueryString(source.QueryString);
        }
        if (source.IgnoreCase != null) {
            this.IgnoreCase = new String(source.IgnoreCase);
        }
        if (source.Header != null) {
            this.Header = new CacheKeyHeader(source.Header);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.Cookie != null) {
            this.Cookie = new CacheKeyCookie(source.Cookie);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullURLCache", this.FullURLCache);
        this.setParamObj(map, prefix + "QueryString.", this.QueryString);
        this.setParamSimple(map, prefix + "IgnoreCase", this.IgnoreCase);
        this.setParamObj(map, prefix + "Header.", this.Header);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamObj(map, prefix + "Cookie.", this.Cookie);

    }
}

