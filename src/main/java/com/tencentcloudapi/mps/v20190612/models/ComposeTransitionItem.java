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

public class ComposeTransitionItem extends AbstractModel{

    /**
    * 元素时长，时间支持：<li>以 s 结尾，表示时间点单位为秒，如 3s 表示时间点为第3秒。</li>
默认：1s
注意：
<li>必须是整数s，否则向下取整。</li>
<li>转场 前后必须紧挨着两个不为 Empty 的元素。</li>
<li>转场 Duration 必须小于前一个元素的 Duration，同时必须小于后一个元素的 Duration。</li>
<li>进行转场处理的两个元素，第二个元素在轨道上的起始时间会自动调整为前一个元素的结束时间减去转场的 Duration。</li>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 转场操作列表。
默认：淡入淡出。
注意：图像转场操作和音频转场操作各自最多支持一个。
    */
    @SerializedName("Transitions")
    @Expose
    private ComposeTransitionOperation [] Transitions;

    /**
     * Get 元素时长，时间支持：<li>以 s 结尾，表示时间点单位为秒，如 3s 表示时间点为第3秒。</li>
默认：1s
注意：
<li>必须是整数s，否则向下取整。</li>
<li>转场 前后必须紧挨着两个不为 Empty 的元素。</li>
<li>转场 Duration 必须小于前一个元素的 Duration，同时必须小于后一个元素的 Duration。</li>
<li>进行转场处理的两个元素，第二个元素在轨道上的起始时间会自动调整为前一个元素的结束时间减去转场的 Duration。</li> 
     * @return Duration 元素时长，时间支持：<li>以 s 结尾，表示时间点单位为秒，如 3s 表示时间点为第3秒。</li>
默认：1s
注意：
<li>必须是整数s，否则向下取整。</li>
<li>转场 前后必须紧挨着两个不为 Empty 的元素。</li>
<li>转场 Duration 必须小于前一个元素的 Duration，同时必须小于后一个元素的 Duration。</li>
<li>进行转场处理的两个元素，第二个元素在轨道上的起始时间会自动调整为前一个元素的结束时间减去转场的 Duration。</li>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 元素时长，时间支持：<li>以 s 结尾，表示时间点单位为秒，如 3s 表示时间点为第3秒。</li>
默认：1s
注意：
<li>必须是整数s，否则向下取整。</li>
<li>转场 前后必须紧挨着两个不为 Empty 的元素。</li>
<li>转场 Duration 必须小于前一个元素的 Duration，同时必须小于后一个元素的 Duration。</li>
<li>进行转场处理的两个元素，第二个元素在轨道上的起始时间会自动调整为前一个元素的结束时间减去转场的 Duration。</li>
     * @param Duration 元素时长，时间支持：<li>以 s 结尾，表示时间点单位为秒，如 3s 表示时间点为第3秒。</li>
默认：1s
注意：
<li>必须是整数s，否则向下取整。</li>
<li>转场 前后必须紧挨着两个不为 Empty 的元素。</li>
<li>转场 Duration 必须小于前一个元素的 Duration，同时必须小于后一个元素的 Duration。</li>
<li>进行转场处理的两个元素，第二个元素在轨道上的起始时间会自动调整为前一个元素的结束时间减去转场的 Duration。</li>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 转场操作列表。
默认：淡入淡出。
注意：图像转场操作和音频转场操作各自最多支持一个。 
     * @return Transitions 转场操作列表。
默认：淡入淡出。
注意：图像转场操作和音频转场操作各自最多支持一个。
     */
    public ComposeTransitionOperation [] getTransitions() {
        return this.Transitions;
    }

    /**
     * Set 转场操作列表。
默认：淡入淡出。
注意：图像转场操作和音频转场操作各自最多支持一个。
     * @param Transitions 转场操作列表。
默认：淡入淡出。
注意：图像转场操作和音频转场操作各自最多支持一个。
     */
    public void setTransitions(ComposeTransitionOperation [] Transitions) {
        this.Transitions = Transitions;
    }

    public ComposeTransitionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeTransitionItem(ComposeTransitionItem source) {
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.Transitions != null) {
            this.Transitions = new ComposeTransitionOperation[source.Transitions.length];
            for (int i = 0; i < source.Transitions.length; i++) {
                this.Transitions[i] = new ComposeTransitionOperation(source.Transitions[i]);
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

