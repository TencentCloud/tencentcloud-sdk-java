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

public class RuleCacheConfig extends AbstractModel{

    /**
    * 缓存配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cache")
    @Expose
    private CacheConfigCache Cache;

    /**
    * 不缓存配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoCache")
    @Expose
    private CacheConfigNoCache NoCache;

    /**
    * 遵循源站配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowOrigin")
    @Expose
    private CacheConfigFollowOrigin FollowOrigin;

    /**
     * Get 缓存配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cache 缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheConfigCache getCache() {
        return this.Cache;
    }

    /**
     * Set 缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cache 缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCache(CacheConfigCache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get 不缓存配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoCache 不缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheConfigNoCache getNoCache() {
        return this.NoCache;
    }

    /**
     * Set 不缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoCache 不缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoCache(CacheConfigNoCache NoCache) {
        this.NoCache = NoCache;
    }

    /**
     * Get 遵循源站配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowOrigin 遵循源站配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheConfigFollowOrigin getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set 遵循源站配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowOrigin 遵循源站配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowOrigin(CacheConfigFollowOrigin FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    public RuleCacheConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCacheConfig(RuleCacheConfig source) {
        if (source.Cache != null) {
            this.Cache = new CacheConfigCache(source.Cache);
        }
        if (source.NoCache != null) {
            this.NoCache = new CacheConfigNoCache(source.NoCache);
        }
        if (source.FollowOrigin != null) {
            this.FollowOrigin = new CacheConfigFollowOrigin(source.FollowOrigin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "NoCache.", this.NoCache);
        this.setParamObj(map, prefix + "FollowOrigin.", this.FollowOrigin);

    }
}

