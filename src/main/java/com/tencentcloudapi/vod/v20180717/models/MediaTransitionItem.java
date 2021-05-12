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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaTransitionItem extends AbstractModel{

    /**
    * 转场持续时间，单位为秒。进行转场处理的两个媒体片段，第二个片段在轨道上的起始时间会自动进行调整，设置为前面一个片段的结束时间减去转场的持续时间。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 转场操作列表。图像转场操作和音频转场操作各自最多支持一个。
    */
    @SerializedName("Transitions")
    @Expose
    private TransitionOpertion [] Transitions;

    /**
     * Get 转场持续时间，单位为秒。进行转场处理的两个媒体片段，第二个片段在轨道上的起始时间会自动进行调整，设置为前面一个片段的结束时间减去转场的持续时间。 
     * @return Duration 转场持续时间，单位为秒。进行转场处理的两个媒体片段，第二个片段在轨道上的起始时间会自动进行调整，设置为前面一个片段的结束时间减去转场的持续时间。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 转场持续时间，单位为秒。进行转场处理的两个媒体片段，第二个片段在轨道上的起始时间会自动进行调整，设置为前面一个片段的结束时间减去转场的持续时间。
     * @param Duration 转场持续时间，单位为秒。进行转场处理的两个媒体片段，第二个片段在轨道上的起始时间会自动进行调整，设置为前面一个片段的结束时间减去转场的持续时间。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 转场操作列表。图像转场操作和音频转场操作各自最多支持一个。 
     * @return Transitions 转场操作列表。图像转场操作和音频转场操作各自最多支持一个。
     */
    public TransitionOpertion [] getTransitions() {
        return this.Transitions;
    }

    /**
     * Set 转场操作列表。图像转场操作和音频转场操作各自最多支持一个。
     * @param Transitions 转场操作列表。图像转场操作和音频转场操作各自最多支持一个。
     */
    public void setTransitions(TransitionOpertion [] Transitions) {
        this.Transitions = Transitions;
    }

    public MediaTransitionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaTransitionItem(MediaTransitionItem source) {
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Transitions != null) {
            this.Transitions = new TransitionOpertion[source.Transitions.length];
            for (int i = 0; i < source.Transitions.length; i++) {
                this.Transitions[i] = new TransitionOpertion(source.Transitions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "Transitions.", this.Transitions);

    }
}

