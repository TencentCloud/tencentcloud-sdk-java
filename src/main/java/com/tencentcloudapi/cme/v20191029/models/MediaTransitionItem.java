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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaTransitionItem extends AbstractModel{

    /**
    * 转场 Id 。暂只支持一个转场。
    */
    @SerializedName("TransitionId")
    @Expose
    private String TransitionId;

    /**
    * 转场持续时间，单位为秒，默认为2秒。进行转场处理的两个媒体片段，第二个片段在轨道上的起始时间会自动进行调整，设置为前面一个片段的结束时间减去转场的持续时间。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
     * Get 转场 Id 。暂只支持一个转场。 
     * @return TransitionId 转场 Id 。暂只支持一个转场。
     */
    public String getTransitionId() {
        return this.TransitionId;
    }

    /**
     * Set 转场 Id 。暂只支持一个转场。
     * @param TransitionId 转场 Id 。暂只支持一个转场。
     */
    public void setTransitionId(String TransitionId) {
        this.TransitionId = TransitionId;
    }

    /**
     * Get 转场持续时间，单位为秒，默认为2秒。进行转场处理的两个媒体片段，第二个片段在轨道上的起始时间会自动进行调整，设置为前面一个片段的结束时间减去转场的持续时间。 
     * @return Duration 转场持续时间，单位为秒，默认为2秒。进行转场处理的两个媒体片段，第二个片段在轨道上的起始时间会自动进行调整，设置为前面一个片段的结束时间减去转场的持续时间。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 转场持续时间，单位为秒，默认为2秒。进行转场处理的两个媒体片段，第二个片段在轨道上的起始时间会自动进行调整，设置为前面一个片段的结束时间减去转场的持续时间。
     * @param Duration 转场持续时间，单位为秒，默认为2秒。进行转场处理的两个媒体片段，第二个片段在轨道上的起始时间会自动进行调整，设置为前面一个片段的结束时间减去转场的持续时间。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    public MediaTransitionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaTransitionItem(MediaTransitionItem source) {
        if (source.TransitionId != null) {
            this.TransitionId = new String(source.TransitionId);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransitionId", this.TransitionId);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

