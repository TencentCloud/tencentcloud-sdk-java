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

public class AsrWordsConfigureInfo extends AbstractModel{

    /**
    * 语音关键词识别任务开关，可选值：
<li>ON：开启语音关键词识别任务；</li>
<li>OFF：关闭语音关键词识别任务。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 关键词过滤标签，指定需要返回的关键词的标签。如果未填或者为空，则全部结果都返回。
标签个数最多 10 个，每个标签长度最多 16 个字符。
    */
    @SerializedName("LabelSet")
    @Expose
    private String [] LabelSet;

    /**
     * Get 语音关键词识别任务开关，可选值：
<li>ON：开启语音关键词识别任务；</li>
<li>OFF：关闭语音关键词识别任务。</li> 
     * @return Switch 语音关键词识别任务开关，可选值：
<li>ON：开启语音关键词识别任务；</li>
<li>OFF：关闭语音关键词识别任务。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 语音关键词识别任务开关，可选值：
<li>ON：开启语音关键词识别任务；</li>
<li>OFF：关闭语音关键词识别任务。</li>
     * @param Switch 语音关键词识别任务开关，可选值：
<li>ON：开启语音关键词识别任务；</li>
<li>OFF：关闭语音关键词识别任务。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 关键词过滤标签，指定需要返回的关键词的标签。如果未填或者为空，则全部结果都返回。
标签个数最多 10 个，每个标签长度最多 16 个字符。 
     * @return LabelSet 关键词过滤标签，指定需要返回的关键词的标签。如果未填或者为空，则全部结果都返回。
标签个数最多 10 个，每个标签长度最多 16 个字符。
     */
    public String [] getLabelSet() {
        return this.LabelSet;
    }

    /**
     * Set 关键词过滤标签，指定需要返回的关键词的标签。如果未填或者为空，则全部结果都返回。
标签个数最多 10 个，每个标签长度最多 16 个字符。
     * @param LabelSet 关键词过滤标签，指定需要返回的关键词的标签。如果未填或者为空，则全部结果都返回。
标签个数最多 10 个，每个标签长度最多 16 个字符。
     */
    public void setLabelSet(String [] LabelSet) {
        this.LabelSet = LabelSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "LabelSet.", this.LabelSet);

    }
}

