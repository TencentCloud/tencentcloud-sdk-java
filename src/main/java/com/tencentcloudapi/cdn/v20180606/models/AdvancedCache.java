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

public class AdvancedCache extends AbstractModel{

    /**
    * 缓存过期规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheRules")
    @Expose
    private AdvanceCacheRule [] CacheRules;

    /**
    * 强制缓存配置
on：开启
off：关闭
开启时，源站返回 no-cache、no-store 头部时，仍按照缓存过期规则进行节点缓存
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreCacheControl")
    @Expose
    private String IgnoreCacheControl;

    /**
    * 当源站返回Set-Cookie头部时，节点是否缓存该头部及body
on：开启，不缓存该头部及body
off：关闭，遵循用户自定义的节点缓存规则
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreSetCookie")
    @Expose
    private String IgnoreSetCookie;

    /**
     * Get 缓存过期规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheRules 缓存过期规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvanceCacheRule [] getCacheRules() {
        return this.CacheRules;
    }

    /**
     * Set 缓存过期规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheRules 缓存过期规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheRules(AdvanceCacheRule [] CacheRules) {
        this.CacheRules = CacheRules;
    }

    /**
     * Get 强制缓存配置
on：开启
off：关闭
开启时，源站返回 no-cache、no-store 头部时，仍按照缓存过期规则进行节点缓存
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreCacheControl 强制缓存配置
on：开启
off：关闭
开启时，源站返回 no-cache、no-store 头部时，仍按照缓存过期规则进行节点缓存
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIgnoreCacheControl() {
        return this.IgnoreCacheControl;
    }

    /**
     * Set 强制缓存配置
on：开启
off：关闭
开启时，源站返回 no-cache、no-store 头部时，仍按照缓存过期规则进行节点缓存
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreCacheControl 强制缓存配置
on：开启
off：关闭
开启时，源站返回 no-cache、no-store 头部时，仍按照缓存过期规则进行节点缓存
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreCacheControl(String IgnoreCacheControl) {
        this.IgnoreCacheControl = IgnoreCacheControl;
    }

    /**
     * Get 当源站返回Set-Cookie头部时，节点是否缓存该头部及body
on：开启，不缓存该头部及body
off：关闭，遵循用户自定义的节点缓存规则
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreSetCookie 当源站返回Set-Cookie头部时，节点是否缓存该头部及body
on：开启，不缓存该头部及body
off：关闭，遵循用户自定义的节点缓存规则
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIgnoreSetCookie() {
        return this.IgnoreSetCookie;
    }

    /**
     * Set 当源站返回Set-Cookie头部时，节点是否缓存该头部及body
on：开启，不缓存该头部及body
off：关闭，遵循用户自定义的节点缓存规则
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreSetCookie 当源站返回Set-Cookie头部时，节点是否缓存该头部及body
on：开启，不缓存该头部及body
off：关闭，遵循用户自定义的节点缓存规则
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreSetCookie(String IgnoreSetCookie) {
        this.IgnoreSetCookie = IgnoreSetCookie;
    }

    public AdvancedCache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedCache(AdvancedCache source) {
        if (source.CacheRules != null) {
            this.CacheRules = new AdvanceCacheRule[source.CacheRules.length];
            for (int i = 0; i < source.CacheRules.length; i++) {
                this.CacheRules[i] = new AdvanceCacheRule(source.CacheRules[i]);
            }
        }
        if (source.IgnoreCacheControl != null) {
            this.IgnoreCacheControl = new String(source.IgnoreCacheControl);
        }
        if (source.IgnoreSetCookie != null) {
            this.IgnoreSetCookie = new String(source.IgnoreSetCookie);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CacheRules.", this.CacheRules);
        this.setParamSimple(map, prefix + "IgnoreCacheControl", this.IgnoreCacheControl);
        this.setParamSimple(map, prefix + "IgnoreSetCookie", this.IgnoreSetCookie);

    }
}

