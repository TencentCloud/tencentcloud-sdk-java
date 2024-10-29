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

public class FollowOrigin extends AbstractModel {

    /**
    * 遵循源站配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 源站未返回 Cache-Control 头时，缓存/不缓存开关。当 Switch 为 on 时，此字段必填，否则此字段不生效。取值有：
<li>on：缓存；</li>
<li>off：不缓存。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultCache")
    @Expose
    private String DefaultCache;

    /**
    * 源站未返回 Cache-Control 头时，使用/不使用默认缓存策略开关。当 DefaultCache 为 on 时，此字段必填，否则此字段不生效；当 DefaultCacheTime 不为 0 时，此字段必须为 off。取值有：
<li>on：使用默认缓存策略；</li>
<li>off：不使用默认缓存策略。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultCacheStrategy")
    @Expose
    private String DefaultCacheStrategy;

    /**
    * 源站未返回 Cache-Control 头时，表示默认的缓存时间，单位为秒，取值：0～315360000。当 DefaultCache 为 on 时，此字段必填，否则此字段不生效；当 DefaultCacheStrategy 为 on 时， 此字段必须为 0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultCacheTime")
    @Expose
    private Long DefaultCacheTime;

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
     * Get 源站未返回 Cache-Control 头时，缓存/不缓存开关。当 Switch 为 on 时，此字段必填，否则此字段不生效。取值有：
<li>on：缓存；</li>
<li>off：不缓存。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultCache 源站未返回 Cache-Control 头时，缓存/不缓存开关。当 Switch 为 on 时，此字段必填，否则此字段不生效。取值有：
<li>on：缓存；</li>
<li>off：不缓存。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultCache() {
        return this.DefaultCache;
    }

    /**
     * Set 源站未返回 Cache-Control 头时，缓存/不缓存开关。当 Switch 为 on 时，此字段必填，否则此字段不生效。取值有：
<li>on：缓存；</li>
<li>off：不缓存。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultCache 源站未返回 Cache-Control 头时，缓存/不缓存开关。当 Switch 为 on 时，此字段必填，否则此字段不生效。取值有：
<li>on：缓存；</li>
<li>off：不缓存。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultCache(String DefaultCache) {
        this.DefaultCache = DefaultCache;
    }

    /**
     * Get 源站未返回 Cache-Control 头时，使用/不使用默认缓存策略开关。当 DefaultCache 为 on 时，此字段必填，否则此字段不生效；当 DefaultCacheTime 不为 0 时，此字段必须为 off。取值有：
<li>on：使用默认缓存策略；</li>
<li>off：不使用默认缓存策略。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultCacheStrategy 源站未返回 Cache-Control 头时，使用/不使用默认缓存策略开关。当 DefaultCache 为 on 时，此字段必填，否则此字段不生效；当 DefaultCacheTime 不为 0 时，此字段必须为 off。取值有：
<li>on：使用默认缓存策略；</li>
<li>off：不使用默认缓存策略。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultCacheStrategy() {
        return this.DefaultCacheStrategy;
    }

    /**
     * Set 源站未返回 Cache-Control 头时，使用/不使用默认缓存策略开关。当 DefaultCache 为 on 时，此字段必填，否则此字段不生效；当 DefaultCacheTime 不为 0 时，此字段必须为 off。取值有：
<li>on：使用默认缓存策略；</li>
<li>off：不使用默认缓存策略。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultCacheStrategy 源站未返回 Cache-Control 头时，使用/不使用默认缓存策略开关。当 DefaultCache 为 on 时，此字段必填，否则此字段不生效；当 DefaultCacheTime 不为 0 时，此字段必须为 off。取值有：
<li>on：使用默认缓存策略；</li>
<li>off：不使用默认缓存策略。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultCacheStrategy(String DefaultCacheStrategy) {
        this.DefaultCacheStrategy = DefaultCacheStrategy;
    }

    /**
     * Get 源站未返回 Cache-Control 头时，表示默认的缓存时间，单位为秒，取值：0～315360000。当 DefaultCache 为 on 时，此字段必填，否则此字段不生效；当 DefaultCacheStrategy 为 on 时， 此字段必须为 0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultCacheTime 源站未返回 Cache-Control 头时，表示默认的缓存时间，单位为秒，取值：0～315360000。当 DefaultCache 为 on 时，此字段必填，否则此字段不生效；当 DefaultCacheStrategy 为 on 时， 此字段必须为 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultCacheTime() {
        return this.DefaultCacheTime;
    }

    /**
     * Set 源站未返回 Cache-Control 头时，表示默认的缓存时间，单位为秒，取值：0～315360000。当 DefaultCache 为 on 时，此字段必填，否则此字段不生效；当 DefaultCacheStrategy 为 on 时， 此字段必须为 0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultCacheTime 源站未返回 Cache-Control 头时，表示默认的缓存时间，单位为秒，取值：0～315360000。当 DefaultCache 为 on 时，此字段必填，否则此字段不生效；当 DefaultCacheStrategy 为 on 时， 此字段必须为 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultCacheTime(Long DefaultCacheTime) {
        this.DefaultCacheTime = DefaultCacheTime;
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
        if (source.DefaultCache != null) {
            this.DefaultCache = new String(source.DefaultCache);
        }
        if (source.DefaultCacheStrategy != null) {
            this.DefaultCacheStrategy = new String(source.DefaultCacheStrategy);
        }
        if (source.DefaultCacheTime != null) {
            this.DefaultCacheTime = new Long(source.DefaultCacheTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "DefaultCache", this.DefaultCache);
        this.setParamSimple(map, prefix + "DefaultCacheStrategy", this.DefaultCacheStrategy);
        this.setParamSimple(map, prefix + "DefaultCacheTime", this.DefaultCacheTime);

    }
}

