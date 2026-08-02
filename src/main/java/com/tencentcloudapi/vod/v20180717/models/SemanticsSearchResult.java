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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SemanticsSearchResult extends AbstractModel {

    /**
    * <p>媒体文件唯一标识 ID。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>智能媒资为当前片段生成的标题</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>视频在本次检索中的得分，得分越高和检索值越相似，取值范围[0,1]</p>
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * <p>视频片段的开始时间，单位：秒</p>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * <p>视频片段的结束时间，单位：秒</p>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get <p>媒体文件唯一标识 ID。</p> 
     * @return FileId <p>媒体文件唯一标识 ID。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>媒体文件唯一标识 ID。</p>
     * @param FileId <p>媒体文件唯一标识 ID。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>智能媒资为当前片段生成的标题</p> 
     * @return Title <p>智能媒资为当前片段生成的标题</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>智能媒资为当前片段生成的标题</p>
     * @param Title <p>智能媒资为当前片段生成的标题</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>视频在本次检索中的得分，得分越高和检索值越相似，取值范围[0,1]</p> 
     * @return Score <p>视频在本次检索中的得分，得分越高和检索值越相似，取值范围[0,1]</p>
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set <p>视频在本次检索中的得分，得分越高和检索值越相似，取值范围[0,1]</p>
     * @param Score <p>视频在本次检索中的得分，得分越高和检索值越相似，取值范围[0,1]</p>
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get <p>视频片段的开始时间，单位：秒</p> 
     * @return StartTimeOffset <p>视频片段的开始时间，单位：秒</p>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set <p>视频片段的开始时间，单位：秒</p>
     * @param StartTimeOffset <p>视频片段的开始时间，单位：秒</p>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get <p>视频片段的结束时间，单位：秒</p> 
     * @return EndTimeOffset <p>视频片段的结束时间，单位：秒</p>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set <p>视频片段的结束时间，单位：秒</p>
     * @param EndTimeOffset <p>视频片段的结束时间，单位：秒</p>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    public SemanticsSearchResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SemanticsSearchResult(SemanticsSearchResult source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

