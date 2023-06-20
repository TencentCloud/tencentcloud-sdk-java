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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrestoMonitorMetrics extends AbstractModel{

    /**
    * 	Alluxio本地缓存命中率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalCacheHitRate")
    @Expose
    private Float LocalCacheHitRate;

    /**
    * Fragment缓存命中率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FragmentCacheHitRate")
    @Expose
    private Float FragmentCacheHitRate;

    /**
     * Get 	Alluxio本地缓存命中率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalCacheHitRate 	Alluxio本地缓存命中率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLocalCacheHitRate() {
        return this.LocalCacheHitRate;
    }

    /**
     * Set 	Alluxio本地缓存命中率
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalCacheHitRate 	Alluxio本地缓存命中率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalCacheHitRate(Float LocalCacheHitRate) {
        this.LocalCacheHitRate = LocalCacheHitRate;
    }

    /**
     * Get Fragment缓存命中率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FragmentCacheHitRate Fragment缓存命中率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFragmentCacheHitRate() {
        return this.FragmentCacheHitRate;
    }

    /**
     * Set Fragment缓存命中率
注意：此字段可能返回 null，表示取不到有效值。
     * @param FragmentCacheHitRate Fragment缓存命中率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFragmentCacheHitRate(Float FragmentCacheHitRate) {
        this.FragmentCacheHitRate = FragmentCacheHitRate;
    }

    public PrestoMonitorMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrestoMonitorMetrics(PrestoMonitorMetrics source) {
        if (source.LocalCacheHitRate != null) {
            this.LocalCacheHitRate = new Float(source.LocalCacheHitRate);
        }
        if (source.FragmentCacheHitRate != null) {
            this.FragmentCacheHitRate = new Float(source.FragmentCacheHitRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalCacheHitRate", this.LocalCacheHitRate);
        this.setParamSimple(map, prefix + "FragmentCacheHitRate", this.FragmentCacheHitRate);

    }
}

