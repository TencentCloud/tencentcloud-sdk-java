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

public class ModelChatInputAudio extends AbstractModel {

    /**
    * <p>媒体文件输入</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private ModelChatMediaInputInfo InputInfo;

    /**
    * <p>音频格式</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get <p>媒体文件输入</p> 
     * @return InputInfo <p>媒体文件输入</p>
     */
    public ModelChatMediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>媒体文件输入</p>
     * @param InputInfo <p>媒体文件输入</p>
     */
    public void setInputInfo(ModelChatMediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get <p>音频格式</p> 
     * @return Format <p>音频格式</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>音频格式</p>
     * @param Format <p>音频格式</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public ModelChatInputAudio() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelChatInputAudio(ModelChatInputAudio source) {
        if (source.InputInfo != null) {
            this.InputInfo = new ModelChatMediaInputInfo(source.InputInfo);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

