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

public class TalkTTSConfig extends AbstractModel {

    /**
    * TTS的类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Flow TTS 的具体配置
    */
    @SerializedName("Flow")
    @Expose
    private TalkTTSFlow Flow;

    /**
     * Get TTS的类型 
     * @return Type TTS的类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set TTS的类型
     * @param Type TTS的类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Flow TTS 的具体配置 
     * @return Flow Flow TTS 的具体配置
     */
    public TalkTTSFlow getFlow() {
        return this.Flow;
    }

    /**
     * Set Flow TTS 的具体配置
     * @param Flow Flow TTS 的具体配置
     */
    public void setFlow(TalkTTSFlow Flow) {
        this.Flow = Flow;
    }

    public TalkTTSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkTTSConfig(TalkTTSConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Flow != null) {
            this.Flow = new TalkTTSFlow(source.Flow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Flow.", this.Flow);

    }
}

