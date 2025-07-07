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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoDetailData extends AbstractModel {

    /**
    * 本次活体一比一请求的唯一标记。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seq")
    @Expose
    private String Seq;

    /**
    * 活体视频的base64编码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Video")
    @Expose
    private String Video;

    /**
     * Get 本次活体一比一请求的唯一标记。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seq 本次活体一比一请求的唯一标记。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeq() {
        return this.Seq;
    }

    /**
     * Set 本次活体一比一请求的唯一标记。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seq 本次活体一比一请求的唯一标记。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeq(String Seq) {
        this.Seq = Seq;
    }

    /**
     * Get 活体视频的base64编码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Video 活体视频的base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideo() {
        return this.Video;
    }

    /**
     * Set 活体视频的base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Video 活体视频的base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideo(String Video) {
        this.Video = Video;
    }

    public VideoDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoDetailData(VideoDetailData source) {
        if (source.Seq != null) {
            this.Seq = new String(source.Seq);
        }
        if (source.Video != null) {
            this.Video = new String(source.Video);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Seq", this.Seq);
        this.setParamSimple(map, prefix + "Video", this.Video);

    }
}

