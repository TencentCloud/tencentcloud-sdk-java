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

public class LiveActivityResult extends AbstractModel {

    /**
    * 原子任务类型。
<li>LiveRecord：直播录制。</li>
<li>AiQualityControl：媒体质检。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * 原子任务输出。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveActivityResItem")
    @Expose
    private LiveActivityResItem LiveActivityResItem;

    /**
     * Get 原子任务类型。
<li>LiveRecord：直播录制。</li>
<li>AiQualityControl：媒体质检。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityType 原子任务类型。
<li>LiveRecord：直播录制。</li>
<li>AiQualityControl：媒体质检。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set 原子任务类型。
<li>LiveRecord：直播录制。</li>
<li>AiQualityControl：媒体质检。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityType 原子任务类型。
<li>LiveRecord：直播录制。</li>
<li>AiQualityControl：媒体质检。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get 原子任务输出。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveActivityResItem 原子任务输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveActivityResItem getLiveActivityResItem() {
        return this.LiveActivityResItem;
    }

    /**
     * Set 原子任务输出。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveActivityResItem 原子任务输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveActivityResItem(LiveActivityResItem LiveActivityResItem) {
        this.LiveActivityResItem = LiveActivityResItem;
    }

    public LiveActivityResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveActivityResult(LiveActivityResult source) {
        if (source.ActivityType != null) {
            this.ActivityType = new String(source.ActivityType);
        }
        if (source.LiveActivityResItem != null) {
            this.LiveActivityResItem = new LiveActivityResItem(source.LiveActivityResItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamObj(map, prefix + "LiveActivityResItem.", this.LiveActivityResItem);

    }
}

