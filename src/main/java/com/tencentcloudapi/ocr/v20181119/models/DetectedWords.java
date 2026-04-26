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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectedWords extends AbstractModel {

    /**
    * <p>置信度 0 ~100。</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * <p>候选字Character。</p>
    */
    @SerializedName("Character")
    @Expose
    private String Character;

    /**
     * Get <p>置信度 0 ~100。</p> 
     * @return Confidence <p>置信度 0 ~100。</p>
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>置信度 0 ~100。</p>
     * @param Confidence <p>置信度 0 ~100。</p>
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>候选字Character。</p> 
     * @return Character <p>候选字Character。</p>
     */
    public String getCharacter() {
        return this.Character;
    }

    /**
     * Set <p>候选字Character。</p>
     * @param Character <p>候选字Character。</p>
     */
    public void setCharacter(String Character) {
        this.Character = Character;
    }

    public DetectedWords() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectedWords(DetectedWords source) {
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.Character != null) {
            this.Character = new String(source.Character);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Character", this.Character);

    }
}

