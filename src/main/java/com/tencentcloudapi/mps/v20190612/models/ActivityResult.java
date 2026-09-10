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

public class ActivityResult extends AbstractModel {

    /**
    * <p>原子任务类型。</p><li>Transcode：转码。</li><li>SampleSnapshot：采样截图。</li><li>AnimatedGraphics：转动图。</li><li>SnapshotByTimeOffset：时间点截图。</li><li>ImageSprites：雪碧图。</li><li>AdaptiveDynamicStreaming：自适应码流。</li><li>AiContentReview：内容审核。</li><li>AIRecognition：智能识别。</li><li>AIAnalysis：智能分析。</li><li>AiQualityControl：媒体质检。</li><li>SmartSubtitles：智能字幕。</li><li>SmartErase：智能擦除。</li><li>Dubbing: AI配音</li>
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * <p>原子任务输出。</p>
    */
    @SerializedName("ActivityResItem")
    @Expose
    private ActivityResItem ActivityResItem;

    /**
     * Get <p>原子任务类型。</p><li>Transcode：转码。</li><li>SampleSnapshot：采样截图。</li><li>AnimatedGraphics：转动图。</li><li>SnapshotByTimeOffset：时间点截图。</li><li>ImageSprites：雪碧图。</li><li>AdaptiveDynamicStreaming：自适应码流。</li><li>AiContentReview：内容审核。</li><li>AIRecognition：智能识别。</li><li>AIAnalysis：智能分析。</li><li>AiQualityControl：媒体质检。</li><li>SmartSubtitles：智能字幕。</li><li>SmartErase：智能擦除。</li><li>Dubbing: AI配音</li> 
     * @return ActivityType <p>原子任务类型。</p><li>Transcode：转码。</li><li>SampleSnapshot：采样截图。</li><li>AnimatedGraphics：转动图。</li><li>SnapshotByTimeOffset：时间点截图。</li><li>ImageSprites：雪碧图。</li><li>AdaptiveDynamicStreaming：自适应码流。</li><li>AiContentReview：内容审核。</li><li>AIRecognition：智能识别。</li><li>AIAnalysis：智能分析。</li><li>AiQualityControl：媒体质检。</li><li>SmartSubtitles：智能字幕。</li><li>SmartErase：智能擦除。</li><li>Dubbing: AI配音</li>
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set <p>原子任务类型。</p><li>Transcode：转码。</li><li>SampleSnapshot：采样截图。</li><li>AnimatedGraphics：转动图。</li><li>SnapshotByTimeOffset：时间点截图。</li><li>ImageSprites：雪碧图。</li><li>AdaptiveDynamicStreaming：自适应码流。</li><li>AiContentReview：内容审核。</li><li>AIRecognition：智能识别。</li><li>AIAnalysis：智能分析。</li><li>AiQualityControl：媒体质检。</li><li>SmartSubtitles：智能字幕。</li><li>SmartErase：智能擦除。</li><li>Dubbing: AI配音</li>
     * @param ActivityType <p>原子任务类型。</p><li>Transcode：转码。</li><li>SampleSnapshot：采样截图。</li><li>AnimatedGraphics：转动图。</li><li>SnapshotByTimeOffset：时间点截图。</li><li>ImageSprites：雪碧图。</li><li>AdaptiveDynamicStreaming：自适应码流。</li><li>AiContentReview：内容审核。</li><li>AIRecognition：智能识别。</li><li>AIAnalysis：智能分析。</li><li>AiQualityControl：媒体质检。</li><li>SmartSubtitles：智能字幕。</li><li>SmartErase：智能擦除。</li><li>Dubbing: AI配音</li>
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get <p>原子任务输出。</p> 
     * @return ActivityResItem <p>原子任务输出。</p>
     */
    public ActivityResItem getActivityResItem() {
        return this.ActivityResItem;
    }

    /**
     * Set <p>原子任务输出。</p>
     * @param ActivityResItem <p>原子任务输出。</p>
     */
    public void setActivityResItem(ActivityResItem ActivityResItem) {
        this.ActivityResItem = ActivityResItem;
    }

    public ActivityResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivityResult(ActivityResult source) {
        if (source.ActivityType != null) {
            this.ActivityType = new String(source.ActivityType);
        }
        if (source.ActivityResItem != null) {
            this.ActivityResItem = new ActivityResItem(source.ActivityResItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamObj(map, prefix + "ActivityResItem.", this.ActivityResItem);

    }
}

