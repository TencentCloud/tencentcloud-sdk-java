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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BitRateInfo extends AbstractModel {

    /**
    * 通道Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 码率,单位:kbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bitrate")
    @Expose
    private Float Bitrate;

    /**
     * Get 通道Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelId 通道Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelId 通道Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 码率,单位:kbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bitrate 码率,单位:kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 码率,单位:kbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bitrate 码率,单位:kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitrate(Float Bitrate) {
        this.Bitrate = Bitrate;
    }

    public BitRateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BitRateInfo(BitRateInfo source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Float(source.Bitrate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);

    }
}

