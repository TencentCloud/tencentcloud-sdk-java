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

public class MediaAiAnalysisFrameTagSegmentItem extends AbstractModel {

    /**
    * <p>按帧标签起始的偏移时间。</p><p>单位：秒</p>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * <p>按帧标签结束的偏移时间。</p><p>单位：秒</p>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * <p>时间片段内的标签列表。</p>
    */
    @SerializedName("TagSet")
    @Expose
    private MediaAiAnalysisFrameTagItem [] TagSet;

    /**
     * Get <p>按帧标签起始的偏移时间。</p><p>单位：秒</p> 
     * @return StartTimeOffset <p>按帧标签起始的偏移时间。</p><p>单位：秒</p>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set <p>按帧标签起始的偏移时间。</p><p>单位：秒</p>
     * @param StartTimeOffset <p>按帧标签起始的偏移时间。</p><p>单位：秒</p>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get <p>按帧标签结束的偏移时间。</p><p>单位：秒</p> 
     * @return EndTimeOffset <p>按帧标签结束的偏移时间。</p><p>单位：秒</p>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set <p>按帧标签结束的偏移时间。</p><p>单位：秒</p>
     * @param EndTimeOffset <p>按帧标签结束的偏移时间。</p><p>单位：秒</p>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get <p>时间片段内的标签列表。</p> 
     * @return TagSet <p>时间片段内的标签列表。</p>
     */
    public MediaAiAnalysisFrameTagItem [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>时间片段内的标签列表。</p>
     * @param TagSet <p>时间片段内的标签列表。</p>
     */
    public void setTagSet(MediaAiAnalysisFrameTagItem [] TagSet) {
        this.TagSet = TagSet;
    }

    public MediaAiAnalysisFrameTagSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAiAnalysisFrameTagSegmentItem(MediaAiAnalysisFrameTagSegmentItem source) {
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.TagSet != null) {
            this.TagSet = new MediaAiAnalysisFrameTagItem[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new MediaAiAnalysisFrameTagItem(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

