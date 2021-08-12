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
on：开启全路径缓存（即关闭参数忽略）
off：关闭全路径缓存（即开启参数忽略）
    */
    @SerializedName("FullUrlCache")
    @Expose
    private String FullUrlCache;

    /**
    * 是否忽略大小写缓存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreCase")
    @Expose
    private String IgnoreCase;

    /**
    * CacheKey中包含请求参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryString")
    @Expose
    private QueryStringKey QueryString;

    /**
    * CacheKey中包含Cookie
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cookie")
    @Expose
    private CookieKey Cookie;

    /**
    * CacheKey中包含请求头部
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Header")
    @Expose
    private HeaderKey Header;

    /**
    * CacheKey中包含自定义字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheTag")
    @Expose
    private CacheTagKey CacheTag;

    /**
    * CacheKey中包含请求协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scheme")
    @Expose
    private SchemeKey Scheme;

    /**
    * 分路径缓存键配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyRules")
    @Expose
    private KeyRule [] KeyRules;

    /**
     * Get 是否开启全路径缓存
on：开启全路径缓存（即关闭参数忽略）
off：关闭全路径缓存（即开启参数忽略） 
     * @return FullUrlCache 是否开启全路径缓存
on：开启全路径缓存（即关闭参数忽略）
off：关闭全路径缓存（即开启参数忽略）
     */
    public String getFullUrlCache() {
        return this.FullUrlCache;
    }

    /**
     * Set 是否开启全路径缓存
on：开启全路径缓存（即关闭参数忽略）
off：关闭全路径缓存（即开启参数忽略）
     * @param FullUrlCache 是否开启全路径缓存
on：开启全路径缓存（即关闭参数忽略）
off：关闭全路径缓存（即开启参数忽略）
     */
    public void setFullUrlCache(String FullUrlCache) {
        this.FullUrlCache = FullUrlCache;
    }

    /**
     * Get 是否忽略大小写缓存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreCase 是否忽略大小写缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIgnoreCase() {
        return this.IgnoreCase;
    }

    /**
     * Set 是否忽略大小写缓存
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreCase 是否忽略大小写缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreCase(String IgnoreCase) {
        this.IgnoreCase = IgnoreCase;
    }

    /**
     * Get CacheKey中包含请求参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryString CacheKey中包含请求参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QueryStringKey getQueryString() {
        return this.QueryString;
    }

    /**
     * Set CacheKey中包含请求参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryString CacheKey中包含请求参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryString(QueryStringKey QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get CacheKey中包含Cookie
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cookie CacheKey中包含Cookie
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CookieKey getCookie() {
        return this.Cookie;
    }

    /**
     * Set CacheKey中包含Cookie
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cookie CacheKey中包含Cookie
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCookie(CookieKey Cookie) {
        this.Cookie = Cookie;
    }

    /**
     * Get CacheKey中包含请求头部
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Header CacheKey中包含请求头部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HeaderKey getHeader() {
        return this.Header;
    }

    /**
     * Set CacheKey中包含请求头部
注意：此字段可能返回 null，表示取不到有效值。
     * @param Header CacheKey中包含请求头部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeader(HeaderKey Header) {
        this.Header = Header;
    }

    /**
     * Get CacheKey中包含自定义字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheTag CacheKey中包含自定义字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheTagKey getCacheTag() {
        return this.CacheTag;
    }

    /**
     * Set CacheKey中包含自定义字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheTag CacheKey中包含自定义字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheTag(CacheTagKey CacheTag) {
        this.CacheTag = CacheTag;
    }

    /**
     * Get CacheKey中包含请求协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scheme CacheKey中包含请求协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SchemeKey getScheme() {
        return this.Scheme;
    }

    /**
     * Set CacheKey中包含请求协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scheme CacheKey中包含请求协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheme(SchemeKey Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get 分路径缓存键配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyRules 分路径缓存键配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyRule [] getKeyRules() {
        return this.KeyRules;
    }

    /**
     * Set 分路径缓存键配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyRules 分路径缓存键配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyRules(KeyRule [] KeyRules) {
        this.KeyRules = KeyRules;
    }

    public CacheKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheKey(CacheKey source) {
        if (source.FullUrlCache != null) {
            this.FullUrlCache = new String(source.FullUrlCache);
        }
        if (source.IgnoreCase != null) {
            this.IgnoreCase = new String(source.IgnoreCase);
        }
        if (source.QueryString != null) {
            this.QueryString = new QueryStringKey(source.QueryString);
        }
        if (source.Cookie != null) {
            this.Cookie = new CookieKey(source.Cookie);
        }
        if (source.Header != null) {
            this.Header = new HeaderKey(source.Header);
        }
        if (source.CacheTag != null) {
            this.CacheTag = new CacheTagKey(source.CacheTag);
        }
        if (source.Scheme != null) {
            this.Scheme = new SchemeKey(source.Scheme);
        }
        if (source.KeyRules != null) {
            this.KeyRules = new KeyRule[source.KeyRules.length];
            for (int i = 0; i < source.KeyRules.length; i++) {
                this.KeyRules[i] = new KeyRule(source.KeyRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullUrlCache", this.FullUrlCache);
        this.setParamSimple(map, prefix + "IgnoreCase", this.IgnoreCase);
        this.setParamObj(map, prefix + "QueryString.", this.QueryString);
        this.setParamObj(map, prefix + "Cookie.", this.Cookie);
        this.setParamObj(map, prefix + "Header.", this.Header);
        this.setParamObj(map, prefix + "CacheTag.", this.CacheTag);
        this.setParamObj(map, prefix + "Scheme.", this.Scheme);
        this.setParamArrayObj(map, prefix + "KeyRules.", this.KeyRules);

    }
}

