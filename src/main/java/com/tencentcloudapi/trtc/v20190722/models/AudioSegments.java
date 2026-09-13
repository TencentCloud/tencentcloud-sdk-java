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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioSegments extends AbstractModel {

    /**
    * <p>该参数用于返回对应语种标签的片段在音频文件内的开始时间，单位为秒。 示例值：0</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * <p>该参数用于返回对应语种标签的片段在音频文件内的结束时间，单位为秒。 示例值：15</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private Float FinishTime;

    /**
     * Get <p>该参数用于返回对应语种标签的片段在音频文件内的开始时间，单位为秒。 示例值：0</p> 
     * @return StartTime <p>该参数用于返回对应语种标签的片段在音频文件内的开始时间，单位为秒。 示例值：0</p>
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>该参数用于返回对应语种标签的片段在音频文件内的开始时间，单位为秒。 示例值：0</p>
     * @param StartTime <p>该参数用于返回对应语种标签的片段在音频文件内的开始时间，单位为秒。 示例值：0</p>
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>该参数用于返回对应语种标签的片段在音频文件内的结束时间，单位为秒。 示例值：15</p> 
     * @return FinishTime <p>该参数用于返回对应语种标签的片段在音频文件内的结束时间，单位为秒。 示例值：15</p>
     */
    public Float getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>该参数用于返回对应语种标签的片段在音频文件内的结束时间，单位为秒。 示例值：15</p>
     * @param FinishTime <p>该参数用于返回对应语种标签的片段在音频文件内的结束时间，单位为秒。 示例值：15</p>
     */
    public void setFinishTime(Float FinishTime) {
        this.FinishTime = FinishTime;
    }

    public AudioSegments() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioSegments(AudioSegments source) {
        if (source.StartTime != null) {
            this.StartTime = new Float(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new Float(source.FinishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

