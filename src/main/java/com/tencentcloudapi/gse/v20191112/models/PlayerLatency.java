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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayerLatency extends AbstractModel{

    /**
    * 玩家Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * 延迟对应的区域名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionIdentifier")
    @Expose
    private String RegionIdentifier;

    /**
    * 毫秒级延迟
    */
    @SerializedName("LatencyInMilliseconds")
    @Expose
    private Long LatencyInMilliseconds;

    /**
     * Get 玩家Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlayerId 玩家Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set 玩家Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlayerId 玩家Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get 延迟对应的区域名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionIdentifier 延迟对应的区域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionIdentifier() {
        return this.RegionIdentifier;
    }

    /**
     * Set 延迟对应的区域名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionIdentifier 延迟对应的区域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionIdentifier(String RegionIdentifier) {
        this.RegionIdentifier = RegionIdentifier;
    }

    /**
     * Get 毫秒级延迟 
     * @return LatencyInMilliseconds 毫秒级延迟
     */
    public Long getLatencyInMilliseconds() {
        return this.LatencyInMilliseconds;
    }

    /**
     * Set 毫秒级延迟
     * @param LatencyInMilliseconds 毫秒级延迟
     */
    public void setLatencyInMilliseconds(Long LatencyInMilliseconds) {
        this.LatencyInMilliseconds = LatencyInMilliseconds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamSimple(map, prefix + "RegionIdentifier", this.RegionIdentifier);
        this.setParamSimple(map, prefix + "LatencyInMilliseconds", this.LatencyInMilliseconds);

    }
}

