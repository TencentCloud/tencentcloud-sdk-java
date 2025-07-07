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

public class ComplexAdaptiveDynamicStreamingTaskInput extends AbstractModel {

    /**
    * 自适应码流参数。
    */
    @SerializedName("StreamPara")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskStreamPara StreamPara;

    /**
     * Get 自适应码流参数。 
     * @return StreamPara 自适应码流参数。
     */
    public ComplexAdaptiveDynamicStreamingTaskStreamPara getStreamPara() {
        return this.StreamPara;
    }

    /**
     * Set 自适应码流参数。
     * @param StreamPara 自适应码流参数。
     */
    public void setStreamPara(ComplexAdaptiveDynamicStreamingTaskStreamPara StreamPara) {
        this.StreamPara = StreamPara;
    }

    public ComplexAdaptiveDynamicStreamingTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexAdaptiveDynamicStreamingTaskInput(ComplexAdaptiveDynamicStreamingTaskInput source) {
        if (source.StreamPara != null) {
            this.StreamPara = new ComplexAdaptiveDynamicStreamingTaskStreamPara(source.StreamPara);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "StreamPara.", this.StreamPara);

    }
}

