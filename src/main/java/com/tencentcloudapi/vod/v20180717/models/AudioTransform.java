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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioTransform extends AbstractModel {

    /**
    * 音频操作类型，取值有：
<li>Volume：音量调节。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 音量调节参数， 当 Type = Volume 时有效。
    */
    @SerializedName("VolumeParam")
    @Expose
    private AudioVolumeParam VolumeParam;

    /**
     * Get 音频操作类型，取值有：
<li>Volume：音量调节。</li> 
     * @return Type 音频操作类型，取值有：
<li>Volume：音量调节。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 音频操作类型，取值有：
<li>Volume：音量调节。</li>
     * @param Type 音频操作类型，取值有：
<li>Volume：音量调节。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 音量调节参数， 当 Type = Volume 时有效。 
     * @return VolumeParam 音量调节参数， 当 Type = Volume 时有效。
     */
    public AudioVolumeParam getVolumeParam() {
        return this.VolumeParam;
    }

    /**
     * Set 音量调节参数， 当 Type = Volume 时有效。
     * @param VolumeParam 音量调节参数， 当 Type = Volume 时有效。
     */
    public void setVolumeParam(AudioVolumeParam VolumeParam) {
        this.VolumeParam = VolumeParam;
    }

    public AudioTransform() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTransform(AudioTransform source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VolumeParam != null) {
            this.VolumeParam = new AudioVolumeParam(source.VolumeParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "VolumeParam.", this.VolumeParam);

    }
}

