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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PidSelector extends AbstractModel {

    /**
    * 对于含有多音轨的流, 可以通过输入PID来指定需要使用的音轨，PID可以输入1到8191之间的正整数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioPID")
    @Expose
    private Long [] AudioPID;

    /**
    * 对于含有多个视频轨的流，可以通过输入PID来指定需要使用的视频轨，PID可以输入1到8191之间的正整数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoPID")
    @Expose
    private Long [] VideoPID;

    /**
     * Get 对于含有多音轨的流, 可以通过输入PID来指定需要使用的音轨，PID可以输入1到8191之间的正整数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioPID 对于含有多音轨的流, 可以通过输入PID来指定需要使用的音轨，PID可以输入1到8191之间的正整数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAudioPID() {
        return this.AudioPID;
    }

    /**
     * Set 对于含有多音轨的流, 可以通过输入PID来指定需要使用的音轨，PID可以输入1到8191之间的正整数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioPID 对于含有多音轨的流, 可以通过输入PID来指定需要使用的音轨，PID可以输入1到8191之间的正整数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioPID(Long [] AudioPID) {
        this.AudioPID = AudioPID;
    }

    /**
     * Get 对于含有多个视频轨的流，可以通过输入PID来指定需要使用的视频轨，PID可以输入1到8191之间的正整数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoPID 对于含有多个视频轨的流，可以通过输入PID来指定需要使用的视频轨，PID可以输入1到8191之间的正整数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getVideoPID() {
        return this.VideoPID;
    }

    /**
     * Set 对于含有多个视频轨的流，可以通过输入PID来指定需要使用的视频轨，PID可以输入1到8191之间的正整数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoPID 对于含有多个视频轨的流，可以通过输入PID来指定需要使用的视频轨，PID可以输入1到8191之间的正整数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoPID(Long [] VideoPID) {
        this.VideoPID = VideoPID;
    }

    public PidSelector() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PidSelector(PidSelector source) {
        if (source.AudioPID != null) {
            this.AudioPID = new Long[source.AudioPID.length];
            for (int i = 0; i < source.AudioPID.length; i++) {
                this.AudioPID[i] = new Long(source.AudioPID[i]);
            }
        }
        if (source.VideoPID != null) {
            this.VideoPID = new Long[source.VideoPID.length];
            for (int i = 0; i < source.VideoPID.length; i++) {
                this.VideoPID[i] = new Long(source.VideoPID[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AudioPID.", this.AudioPID);
        this.setParamArraySimple(map, prefix + "VideoPID.", this.VideoPID);

    }
}

