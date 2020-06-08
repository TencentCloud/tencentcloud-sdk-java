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

public class CacheKey extends AbstractModel{

    /**
    * 是否开启全路径缓存
on：开启全路径缓存（即关闭参数过滤）
off：关闭全路径缓存（即开启参数过滤）
    */
    @SerializedName("FullUrlCache")
    @Expose
    private String FullUrlCache;

    /**
    * 是否使用请求参数作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryString")
    @Expose
    private QueryStringKey QueryString;

    /**
    * 是否使用请求头部作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Header")
    @Expose
    private HeaderKey Header;

    /**
    * 是否使用Cookie作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cookie")
    @Expose
    private CookieKey Cookie;

    /**
    * 是否使用请求协议作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scheme")
    @Expose
    private SchemeKey Scheme;

    /**
    * 是否使用自定义字符串作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheTag")
    @Expose
    private CacheTagKey CacheTag;

    /**
    * 缓存是否忽略大小写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CaseSensitive")
    @Expose
    private String CaseSensitive;

    /**
     * Get 是否开启全路径缓存
on：开启全路径缓存（即关闭参数过滤）
off：关闭全路径缓存（即开启参数过滤） 
     * @return FullUrlCache 是否开启全路径缓存
on：开启全路径缓存（即关闭参数过滤）
off：关闭全路径缓存（即开启参数过滤）
     */
    public String getFullUrlCache() {
        return this.FullUrlCache;
    }

    /**
     * Set 是否开启全路径缓存
on：开启全路径缓存（即关闭参数过滤）
off：关闭全路径缓存（即开启参数过滤）
     * @param FullUrlCache 是否开启全路径缓存
on：开启全路径缓存（即关闭参数过滤）
off：关闭全路径缓存（即开启参数过滤）
     */
    public void setFullUrlCache(String FullUrlCache) {
        this.FullUrlCache = FullUrlCache;
    }

    /**
     * Get 是否使用请求参数作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryString 是否使用请求参数作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QueryStringKey getQueryString() {
        return this.QueryString;
    }

    /**
     * Set 是否使用请求参数作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryString 是否使用请求参数作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryString(QueryStringKey QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get 是否使用请求头部作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Header 是否使用请求头部作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HeaderKey getHeader() {
        return this.Header;
    }

    /**
     * Set 是否使用请求头部作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     * @param Header 是否使用请求头部作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeader(HeaderKey Header) {
        this.Header = Header;
    }

    /**
     * Get 是否使用Cookie作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cookie 是否使用Cookie作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CookieKey getCookie() {
        return this.Cookie;
    }

    /**
     * Set 是否使用Cookie作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cookie 是否使用Cookie作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCookie(CookieKey Cookie) {
        this.Cookie = Cookie;
    }

    /**
     * Get 是否使用请求协议作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scheme 是否使用请求协议作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SchemeKey getScheme() {
        return this.Scheme;
    }

    /**
     * Set 是否使用请求协议作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scheme 是否使用请求协议作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheme(SchemeKey Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get 是否使用自定义字符串作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheTag 是否使用自定义字符串作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheTagKey getCacheTag() {
        return this.CacheTag;
    }

    /**
     * Set 是否使用自定义字符串作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheTag 是否使用自定义字符串作为CacheKey的一部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheTag(CacheTagKey CacheTag) {
        this.CacheTag = CacheTag;
    }

    /**
     * Get 缓存是否忽略大小写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CaseSensitive 缓存是否忽略大小写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set 缓存是否忽略大小写
注意：此字段可能返回 null，表示取不到有效值。
     * @param CaseSensitive 缓存是否忽略大小写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCaseSensitive(String CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullUrlCache", this.FullUrlCache);
        this.setParamObj(map, prefix + "QueryString.", this.QueryString);
        this.setParamObj(map, prefix + "Header.", this.Header);
        this.setParamObj(map, prefix + "Cookie.", this.Cookie);
        this.setParamObj(map, prefix + "Scheme.", this.Scheme);
        this.setParamObj(map, prefix + "CacheTag.", this.CacheTag);
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);

    }
}

