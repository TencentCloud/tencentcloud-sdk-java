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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeExtendedOutput extends AbstractModel {

    /**
    * <p>提示词标识符</p><p>枚举值：</p><ul><li>overview： 内容概述</li><li>scene： 场景关键词</li><li>events： 事件关键词</li><li>objects： 物品关键词</li></ul>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>模型输出的扩展内容文本</p>
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
     * Get <p>提示词标识符</p><p>枚举值：</p><ul><li>overview： 内容概述</li><li>scene： 场景关键词</li><li>events： 事件关键词</li><li>objects： 物品关键词</li></ul> 
     * @return Key <p>提示词标识符</p><p>枚举值：</p><ul><li>overview： 内容概述</li><li>scene： 场景关键词</li><li>events： 事件关键词</li><li>objects： 物品关键词</li></ul>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>提示词标识符</p><p>枚举值：</p><ul><li>overview： 内容概述</li><li>scene： 场景关键词</li><li>events： 事件关键词</li><li>objects： 物品关键词</li></ul>
     * @param Key <p>提示词标识符</p><p>枚举值：</p><ul><li>overview： 内容概述</li><li>scene： 场景关键词</li><li>events： 事件关键词</li><li>objects： 物品关键词</li></ul>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>模型输出的扩展内容文本</p> 
     * @return Output <p>模型输出的扩展内容文本</p>
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set <p>模型输出的扩展内容文本</p>
     * @param Output <p>模型输出的扩展内容文本</p>
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    public SeeExtendedOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeExtendedOutput(SeeExtendedOutput source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Output", this.Output);

    }
}

