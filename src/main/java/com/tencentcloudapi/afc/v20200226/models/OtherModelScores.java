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
package com.tencentcloudapi.afc.v20200226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtherModelScores extends AbstractModel{

    /**
    * 模型类型
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 该模型评分
    */
    @SerializedName("ModelScore")
    @Expose
    private String ModelScore;

    /**
     * Get 模型类型 
     * @return ModelId 模型类型
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型类型
     * @param ModelId 模型类型
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 该模型评分 
     * @return ModelScore 该模型评分
     */
    public String getModelScore() {
        return this.ModelScore;
    }

    /**
     * Set 该模型评分
     * @param ModelScore 该模型评分
     */
    public void setModelScore(String ModelScore) {
        this.ModelScore = ModelScore;
    }

    public OtherModelScores() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherModelScores(OtherModelScores source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelScore != null) {
            this.ModelScore = new String(source.ModelScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelScore", this.ModelScore);

    }
}

