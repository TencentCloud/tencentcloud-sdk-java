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

public class TalkTTSFlow extends AbstractModel {

    /**
    * <p>精品音色 ID 或克隆音色 ID：具体可参考https://cloud.tencent.com/document/product/647/115414</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>语速，范围 0.5–2.0；为 0 表示采用默认值</p>
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
     * Get <p>精品音色 ID 或克隆音色 ID：具体可参考https://cloud.tencent.com/document/product/647/115414</p> 
     * @return VoiceId <p>精品音色 ID 或克隆音色 ID：具体可参考https://cloud.tencent.com/document/product/647/115414</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>精品音色 ID 或克隆音色 ID：具体可参考https://cloud.tencent.com/document/product/647/115414</p>
     * @param VoiceId <p>精品音色 ID 或克隆音色 ID：具体可参考https://cloud.tencent.com/document/product/647/115414</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>语速，范围 0.5–2.0；为 0 表示采用默认值</p> 
     * @return Speed <p>语速，范围 0.5–2.0；为 0 表示采用默认值</p>
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set <p>语速，范围 0.5–2.0；为 0 表示采用默认值</p>
     * @param Speed <p>语速，范围 0.5–2.0；为 0 表示采用默认值</p>
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    public TalkTTSFlow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkTTSFlow(TalkTTSFlow source) {
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.Speed != null) {
            this.Speed = new Float(source.Speed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Speed", this.Speed);

    }
}

