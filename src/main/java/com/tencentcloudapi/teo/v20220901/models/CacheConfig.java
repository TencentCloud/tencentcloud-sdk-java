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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheConfig extends AbstractModel {

    /**
    * 缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * 不缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoCache")
    @Expose
    private NoCache NoCache;

    /**
    * 遵循源站配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowOrigin")
    @Expose
    private FollowOrigin FollowOrigin;

    /**
     * Get 缓存配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cache 缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set 缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cache 缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get 不缓存配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoCache 不缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NoCache getNoCache() {
        return this.NoCache;
    }

    /**
     * Set 不缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoCache 不缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoCache(NoCache NoCache) {
        this.NoCache = NoCache;
    }

    /**
     * Get 遵循源站配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowOrigin 遵循源站配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FollowOrigin getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set 遵循源站配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowOrigin 遵循源站配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowOrigin(FollowOrigin FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    public CacheConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheConfig(CacheConfig source) {
        if (source.Cache != null) {
            this.Cache = new Cache(source.Cache);
        }
        if (source.NoCache != null) {
            this.NoCache = new NoCache(source.NoCache);
        }
        if (source.FollowOrigin != null) {
            this.FollowOrigin = new FollowOrigin(source.FollowOrigin);
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

