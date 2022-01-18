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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetAudioParamCommandInput extends AbstractModel{

    /**
    * 规格，取值有：
<li>audio/mi：低规格</li>
<li>audio/lo：中规格</li>
<li>audio/hi：高规格</li>
    */
    @SerializedName("Definition")
    @Expose
    private String Definition;

    /**
    * 音频类型，取值有：
<li>Original：原唱</li>
<li>Accompaniment：伴奏</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 规格，取值有：
<li>audio/mi：低规格</li>
<li>audio/lo：中规格</li>
<li>audio/hi：高规格</li> 
     * @return Definition 规格，取值有：
<li>audio/mi：低规格</li>
<li>audio/lo：中规格</li>
<li>audio/hi：高规格</li>
     */
    public String getDefinition() {
        return this.Definition;
    }

    /**
     * Set 规格，取值有：
<li>audio/mi：低规格</li>
<li>audio/lo：中规格</li>
<li>audio/hi：高规格</li>
     * @param Definition 规格，取值有：
<li>audio/mi：低规格</li>
<li>audio/lo：中规格</li>
<li>audio/hi：高规格</li>
     */
    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 音频类型，取值有：
<li>Original：原唱</li>
<li>Accompaniment：伴奏</li> 
     * @return Type 音频类型，取值有：
<li>Original：原唱</li>
<li>Accompaniment：伴奏</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 音频类型，取值有：
<li>Original：原唱</li>
<li>Accompaniment：伴奏</li>
     * @param Type 音频类型，取值有：
<li>Original：原唱</li>
<li>Accompaniment：伴奏</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public SetAudioParamCommandInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetAudioParamCommandInput(SetAudioParamCommandInput source) {
        if (source.Definition != null) {
            this.Definition = new String(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

