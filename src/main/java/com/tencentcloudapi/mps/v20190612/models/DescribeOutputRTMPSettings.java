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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOutputRTMPSettings extends AbstractModel{

    /**
    * 空闲超时时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
    * Chunk大小。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChunkSize")
    @Expose
    private Long ChunkSize;

    /**
    * 转推RTMP的目标地址信息列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Destinations")
    @Expose
    private RTMPAddressDestination [] Destinations;

    /**
     * Get 空闲超时时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdleTimeout 空闲超时时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set 空闲超时时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdleTimeout 空闲超时时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    /**
     * Get Chunk大小。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChunkSize Chunk大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChunkSize() {
        return this.ChunkSize;
    }

    /**
     * Set Chunk大小。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChunkSize Chunk大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChunkSize(Long ChunkSize) {
        this.ChunkSize = ChunkSize;
    }

    /**
     * Get 转推RTMP的目标地址信息列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Destinations 转推RTMP的目标地址信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RTMPAddressDestination [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set 转推RTMP的目标地址信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Destinations 转推RTMP的目标地址信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestinations(RTMPAddressDestination [] Destinations) {
        this.Destinations = Destinations;
    }

    public DescribeOutputRTMPSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOutputRTMPSettings(DescribeOutputRTMPSettings source) {
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
        }
        if (source.ChunkSize != null) {
            this.ChunkSize = new Long(source.ChunkSize);
        }
        if (source.Destinations != null) {
            this.Destinations = new RTMPAddressDestination[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new RTMPAddressDestination(source.Destinations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "ChunkSize", this.ChunkSize);
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);

    }
}

