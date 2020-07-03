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

public class MediaAiAnalysisFrameTagSegmentItem extends AbstractModel{

    /**
    * 按帧标签起始的偏移时间。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 按帧标签结束的偏移时间。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 时间片段内的标签列表。
    */
    @SerializedName("TagSet")
    @Expose
    private MediaAiAnalysisFrameTagItem [] TagSet;

    /**
     * Get 按帧标签起始的偏移时间。 
     * @return StartTimeOffset 按帧标签起始的偏移时间。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 按帧标签起始的偏移时间。
     * @param StartTimeOffset 按帧标签起始的偏移时间。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 按帧标签结束的偏移时间。 
     * @return EndTimeOffset 按帧标签结束的偏移时间。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 按帧标签结束的偏移时间。
     * @param EndTimeOffset 按帧标签结束的偏移时间。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get 时间片段内的标签列表。 
     * @return TagSet 时间片段内的标签列表。
     */
    public MediaAiAnalysisFrameTagItem [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 时间片段内的标签列表。
     * @param TagSet 时间片段内的标签列表。
     */
    public void setTagSet(MediaAiAnalysisFrameTagItem [] TagSet) {
        this.TagSet = TagSet;
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

