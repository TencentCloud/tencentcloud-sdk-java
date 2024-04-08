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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadAudioInfo extends AbstractModel {

    /**
    * 文件别名（可重复）
    */
    @SerializedName("CustomFileName")
    @Expose
    private String CustomFileName;

    /**
    * 音频文件链接。(支持mp3和wav格式，文件不超过5MB)
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
     * Get 文件别名（可重复） 
     * @return CustomFileName 文件别名（可重复）
     */
    public String getCustomFileName() {
        return this.CustomFileName;
    }

    /**
     * Set 文件别名（可重复）
     * @param CustomFileName 文件别名（可重复）
     */
    public void setCustomFileName(String CustomFileName) {
        this.CustomFileName = CustomFileName;
    }

    /**
     * Get 音频文件链接。(支持mp3和wav格式，文件不超过5MB) 
     * @return AudioUrl 音频文件链接。(支持mp3和wav格式，文件不超过5MB)
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set 音频文件链接。(支持mp3和wav格式，文件不超过5MB)
     * @param AudioUrl 音频文件链接。(支持mp3和wav格式，文件不超过5MB)
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    public UploadAudioInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadAudioInfo(UploadAudioInfo source) {
        if (source.CustomFileName != null) {
            this.CustomFileName = new String(source.CustomFileName);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomFileName", this.CustomFileName);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);

    }
}

