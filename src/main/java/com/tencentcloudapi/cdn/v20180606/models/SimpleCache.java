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

public class SimpleCache extends AbstractModel{

    /**
    * 缓存过期时间规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheRules")
    @Expose
    private SimpleCacheRule [] CacheRules;

    /**
    * 遵循源站 Cache-Control: max-age 配置
on：开启
off：关闭
开启后，未能匹配 CacheRules 规则的资源将根据源站返回的 max-age 值进行节点缓存；匹配了 CacheRules 规则的资源将按照 CacheRules 中设置的缓存过期时间在节点进行缓存
与 CompareMaxAge 冲突，不能同时开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowOrigin")
    @Expose
    private String FollowOrigin;

    /**
    * 强制缓存
on：开启
off：关闭
默认为关闭状态，开启后，源站返回的 no-store、no-cache 资源，也将按照 CacheRules 规则进行缓存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreCacheControl")
    @Expose
    private String IgnoreCacheControl;

    /**
    * 忽略源站的Set-Cookie头部
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreSetCookie")
    @Expose
    private String IgnoreSetCookie;

    /**
    * 高级缓存过期配置，开启时会对比源站返回的 max-age 值与 CacheRules 中设置的缓存过期时间，取最小值在节点进行缓存
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareMaxAge")
    @Expose
    private String CompareMaxAge;

    /**
    * 总是回源站校验
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Revalidate")
    @Expose
    private Revalidate Revalidate;

    /**
     * Get 缓存过期时间规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheRules 缓存过期时间规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SimpleCacheRule [] getCacheRules() {
        return this.CacheRules;
    }

    /**
     * Set 缓存过期时间规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheRules 缓存过期时间规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheRules(SimpleCacheRule [] CacheRules) {
        this.CacheRules = CacheRules;
    }

    /**
     * Get 遵循源站 Cache-Control: max-age 配置
on：开启
off：关闭
开启后，未能匹配 CacheRules 规则的资源将根据源站返回的 max-age 值进行节点缓存；匹配了 CacheRules 规则的资源将按照 CacheRules 中设置的缓存过期时间在节点进行缓存
与 CompareMaxAge 冲突，不能同时开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowOrigin 遵循源站 Cache-Control: max-age 配置
on：开启
off：关闭
开启后，未能匹配 CacheRules 规则的资源将根据源站返回的 max-age 值进行节点缓存；匹配了 CacheRules 规则的资源将按照 CacheRules 中设置的缓存过期时间在节点进行缓存
与 CompareMaxAge 冲突，不能同时开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set 遵循源站 Cache-Control: max-age 配置
on：开启
off：关闭
开启后，未能匹配 CacheRules 规则的资源将根据源站返回的 max-age 值进行节点缓存；匹配了 CacheRules 规则的资源将按照 CacheRules 中设置的缓存过期时间在节点进行缓存
与 CompareMaxAge 冲突，不能同时开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowOrigin 遵循源站 Cache-Control: max-age 配置
on：开启
off：关闭
开启后，未能匹配 CacheRules 规则的资源将根据源站返回的 max-age 值进行节点缓存；匹配了 CacheRules 规则的资源将按照 CacheRules 中设置的缓存过期时间在节点进行缓存
与 CompareMaxAge 冲突，不能同时开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowOrigin(String FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    /**
     * Get 强制缓存
on：开启
off：关闭
默认为关闭状态，开启后，源站返回的 no-store、no-cache 资源，也将按照 CacheRules 规则进行缓存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreCacheControl 强制缓存
on：开启
off：关闭
默认为关闭状态，开启后，源站返回的 no-store、no-cache 资源，也将按照 CacheRules 规则进行缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIgnoreCacheControl() {
        return this.IgnoreCacheControl;
    }

    /**
     * Set 强制缓存
on：开启
off：关闭
默认为关闭状态，开启后，源站返回的 no-store、no-cache 资源，也将按照 CacheRules 规则进行缓存
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreCacheControl 强制缓存
on：开启
off：关闭
默认为关闭状态，开启后，源站返回的 no-store、no-cache 资源，也将按照 CacheRules 规则进行缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreCacheControl(String IgnoreCacheControl) {
        this.IgnoreCacheControl = IgnoreCacheControl;
    }

    /**
     * Get 忽略源站的Set-Cookie头部
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreSetCookie 忽略源站的Set-Cookie头部
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIgnoreSetCookie() {
        return this.IgnoreSetCookie;
    }

    /**
     * Set 忽略源站的Set-Cookie头部
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreSetCookie 忽略源站的Set-Cookie头部
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreSetCookie(String IgnoreSetCookie) {
        this.IgnoreSetCookie = IgnoreSetCookie;
    }

    /**
     * Get 高级缓存过期配置，开启时会对比源站返回的 max-age 值与 CacheRules 中设置的缓存过期时间，取最小值在节点进行缓存
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareMaxAge 高级缓存过期配置，开启时会对比源站返回的 max-age 值与 CacheRules 中设置的缓存过期时间，取最小值在节点进行缓存
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompareMaxAge() {
        return this.CompareMaxAge;
    }

    /**
     * Set 高级缓存过期配置，开启时会对比源站返回的 max-age 值与 CacheRules 中设置的缓存过期时间，取最小值在节点进行缓存
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareMaxAge 高级缓存过期配置，开启时会对比源站返回的 max-age 值与 CacheRules 中设置的缓存过期时间，取最小值在节点进行缓存
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareMaxAge(String CompareMaxAge) {
        this.CompareMaxAge = CompareMaxAge;
    }

    /**
     * Get 总是回源站校验
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Revalidate 总是回源站校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Revalidate getRevalidate() {
        return this.Revalidate;
    }

    /**
     * Set 总是回源站校验
注意：此字段可能返回 null，表示取不到有效值。
     * @param Revalidate 总是回源站校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRevalidate(Revalidate Revalidate) {
        this.Revalidate = Revalidate;
    }

    public SimpleCache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleCache(SimpleCache source) {
        if (source.CacheRules != null) {
            this.CacheRules = new SimpleCacheRule[source.CacheRules.length];
            for (int i = 0; i < source.CacheRules.length; i++) {
                this.CacheRules[i] = new SimpleCacheRule(source.CacheRules[i]);
            }
        }
        if (source.FollowOrigin != null) {
            this.FollowOrigin = new String(source.FollowOrigin);
        }
        if (source.IgnoreCacheControl != null) {
            this.IgnoreCacheControl = new String(source.IgnoreCacheControl);
        }
        if (source.IgnoreSetCookie != null) {
            this.IgnoreSetCookie = new String(source.IgnoreSetCookie);
        }
        if (source.CompareMaxAge != null) {
            this.CompareMaxAge = new String(source.CompareMaxAge);
        }
        if (source.Revalidate != null) {
            this.Revalidate = new Revalidate(source.Revalidate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CacheRules.", this.CacheRules);
        this.setParamSimple(map, prefix + "FollowOrigin", this.FollowOrigin);
        this.setParamSimple(map, prefix + "IgnoreCacheControl", this.IgnoreCacheControl);
        this.setParamSimple(map, prefix + "IgnoreSetCookie", this.IgnoreSetCookie);
        this.setParamSimple(map, prefix + "CompareMaxAge", this.CompareMaxAge);
        this.setParamObj(map, prefix + "Revalidate.", this.Revalidate);

    }
}

