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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectInfoVideoData extends AbstractModel{

    /**
    * 活体视频的base64编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessVideo")
    @Expose
    private String LivenessVideo;

    /**
     * Get 活体视频的base64编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessVideo 活体视频的base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLivenessVideo() {
        return this.LivenessVideo;
    }

    /**
     * Set 活体视频的base64编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessVideo 活体视频的base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivenessVideo(String LivenessVideo) {
        this.LivenessVideo = LivenessVideo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LivenessVideo", this.LivenessVideo);

    }
}

