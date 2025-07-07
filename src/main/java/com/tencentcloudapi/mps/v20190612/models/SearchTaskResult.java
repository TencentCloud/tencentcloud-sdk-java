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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchTaskResult extends AbstractModel {

    /**
    * 视频在本次检索中的得分，得分越高和检索值越相似，取值范围[0,1]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 检索获得的视频ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoId")
    @Expose
    private String VideoId;

    /**
     * Get 视频在本次检索中的得分，得分越高和检索值越相似，取值范围[0,1]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 视频在本次检索中的得分，得分越高和检索值越相似，取值范围[0,1]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 视频在本次检索中的得分，得分越高和检索值越相似，取值范围[0,1]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 视频在本次检索中的得分，得分越高和检索值越相似，取值范围[0,1]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 检索获得的视频ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoId 检索获得的视频ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoId() {
        return this.VideoId;
    }

    /**
     * Set 检索获得的视频ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoId 检索获得的视频ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoId(String VideoId) {
        this.VideoId = VideoId;
    }

    public SearchTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchTaskResult(SearchTaskResult source) {
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.VideoId != null) {
            this.VideoId = new String(source.VideoId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "VideoId", this.VideoId);

    }
}

