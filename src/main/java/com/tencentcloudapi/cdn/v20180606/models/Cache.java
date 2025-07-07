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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cache extends AbstractModel {

    /**
    * 基础缓存过期时间配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SimpleCache")
    @Expose
    private SimpleCache SimpleCache;

    /**
    * 高级缓存过期时间配置（已弃用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedCache")
    @Expose
    private AdvancedCache AdvancedCache;

    /**
    * 高级路径缓存配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleCache")
    @Expose
    private RuleCache [] RuleCache;

    /**
     * Get 基础缓存过期时间配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SimpleCache 基础缓存过期时间配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SimpleCache getSimpleCache() {
        return this.SimpleCache;
    }

    /**
     * Set 基础缓存过期时间配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param SimpleCache 基础缓存过期时间配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSimpleCache(SimpleCache SimpleCache) {
        this.SimpleCache = SimpleCache;
    }

    /**
     * Get 高级缓存过期时间配置（已弃用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedCache 高级缓存过期时间配置（已弃用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedCache getAdvancedCache() {
        return this.AdvancedCache;
    }

    /**
     * Set 高级缓存过期时间配置（已弃用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedCache 高级缓存过期时间配置（已弃用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedCache(AdvancedCache AdvancedCache) {
        this.AdvancedCache = AdvancedCache;
    }

    /**
     * Get 高级路径缓存配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleCache 高级路径缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleCache [] getRuleCache() {
        return this.RuleCache;
    }

    /**
     * Set 高级路径缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleCache 高级路径缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleCache(RuleCache [] RuleCache) {
        this.RuleCache = RuleCache;
    }

    public Cache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cache(Cache source) {
        if (source.SimpleCache != null) {
            this.SimpleCache = new SimpleCache(source.SimpleCache);
        }
        if (source.AdvancedCache != null) {
            this.AdvancedCache = new AdvancedCache(source.AdvancedCache);
        }
        if (source.RuleCache != null) {
            this.RuleCache = new RuleCache[source.RuleCache.length];
            for (int i = 0; i < source.RuleCache.length; i++) {
                this.RuleCache[i] = new RuleCache(source.RuleCache[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SimpleCache.", this.SimpleCache);
        this.setParamObj(map, prefix + "AdvancedCache.", this.AdvancedCache);
        this.setParamArrayObj(map, prefix + "RuleCache.", this.RuleCache);

    }
}

