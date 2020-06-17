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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Words extends AbstractModel{

    /**
    * 置信度 0 ~100
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 候选字Character
    */
    @SerializedName("Character")
    @Expose
    private String Character;

    /**
     * Get 置信度 0 ~100 
     * @return Confidence 置信度 0 ~100
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度 0 ~100
     * @param Confidence 置信度 0 ~100
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 候选字Character 
     * @return Character 候选字Character
     */
    public String getCharacter() {
        return this.Character;
    }

    /**
     * Set 候选字Character
     * @param Character 候选字Character
     */
    public void setCharacter(String Character) {
        this.Character = Character;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Character", this.Character);

    }
}

