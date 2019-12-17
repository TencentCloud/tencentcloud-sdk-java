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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionType extends AbstractModel{

    /**
    * 置信度
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 动作类别
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 置信度 
     * @return Confidence 置信度
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度
     * @param Confidence 置信度
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 动作类别 
     * @return Type 动作类别
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 动作类别
     * @param Type 动作类别
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

