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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FollowOrigin extends AbstractModel{

    /**
    * 遵循源站配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 源站未返回 Cache-Control 头时, 设置默认的缓存时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultCacheTime")
    @Expose
    private Long DefaultCacheTime;

    /**
    * 源站未返回 Cache-Control 头时, 设置缓存/不缓存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultCache")
    @Expose
    private String DefaultCache;

    /**
     * Get 遵循源站配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch 遵循源站配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 遵循源站配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch 遵循源站配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 源站未返回 Cache-Control 头时, 设置默认的缓存时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultCacheTime 源站未返回 Cache-Control 头时, 设置默认的缓存时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultCacheTime() {
        return this.DefaultCacheTime;
    }

    /**
     * Set 源站未返回 Cache-Control 头时, 设置默认的缓存时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultCacheTime 源站未返回 Cache-Control 头时, 设置默认的缓存时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultCacheTime(Long DefaultCacheTime) {
        this.DefaultCacheTime = DefaultCacheTime;
    }

    /**
     * Get 源站未返回 Cache-Control 头时, 设置缓存/不缓存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultCache 源站未返回 Cache-Control 头时, 设置缓存/不缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultCache() {
        return this.DefaultCache;
    }

    /**
     * Set 源站未返回 Cache-Control 头时, 设置缓存/不缓存
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultCache 源站未返回 Cache-Control 头时, 设置缓存/不缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultCache(String DefaultCache) {
        this.DefaultCache = DefaultCache;
    }

    public FollowOrigin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FollowOrigin(FollowOrigin source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.DefaultCacheTime != null) {
            this.DefaultCacheTime = new Long(source.DefaultCacheTime);
        }
        if (source.DefaultCache != null) {
            this.DefaultCache = new String(source.DefaultCache);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "DefaultCacheTime", this.DefaultCacheTime);
        this.setParamSimple(map, prefix + "DefaultCache", this.DefaultCache);

    }
}

