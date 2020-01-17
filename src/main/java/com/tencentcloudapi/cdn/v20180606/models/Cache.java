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

public class Cache extends AbstractModel{

    /**
    * 基础缓存过期时间配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SimpleCache")
    @Expose
    private SimpleCache SimpleCache;

    /**
    * 高级缓存过期时间配置（功能灰度中，尚未全量）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedCache")
    @Expose
    private AdvancedCache AdvancedCache;

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
     * Get 高级缓存过期时间配置（功能灰度中，尚未全量）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedCache 高级缓存过期时间配置（功能灰度中，尚未全量）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedCache getAdvancedCache() {
        return this.AdvancedCache;
    }

    /**
     * Set 高级缓存过期时间配置（功能灰度中，尚未全量）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedCache 高级缓存过期时间配置（功能灰度中，尚未全量）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedCache(AdvancedCache AdvancedCache) {
        this.AdvancedCache = AdvancedCache;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SimpleCache.", this.SimpleCache);
        this.setParamObj(map, prefix + "AdvancedCache.", this.AdvancedCache);

    }
}

