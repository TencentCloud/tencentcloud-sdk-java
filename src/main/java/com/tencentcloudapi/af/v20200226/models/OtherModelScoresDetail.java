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
package com.tencentcloudapi.af.v20200226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtherModelScoresDetail extends AbstractModel{

    /**
    * 模型版本号；默认顺序为 0、1、2、3、…其中：0=主模型，跟 RiskScore 保持一致；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 模型版本对应的评分结果；Found=1 时：模型版本对应的评分结果，0~100 分
区间；Found=-1（未查到）时：全部模型结果返回-1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelScore")
    @Expose
    private String ModelScore;

    /**
     * Get 模型版本号；默认顺序为 0、1、2、3、…其中：0=主模型，跟 RiskScore 保持一致；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelId 模型版本号；默认顺序为 0、1、2、3、…其中：0=主模型，跟 RiskScore 保持一致；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型版本号；默认顺序为 0、1、2、3、…其中：0=主模型，跟 RiskScore 保持一致；
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelId 模型版本号；默认顺序为 0、1、2、3、…其中：0=主模型，跟 RiskScore 保持一致；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 模型版本对应的评分结果；Found=1 时：模型版本对应的评分结果，0~100 分
区间；Found=-1（未查到）时：全部模型结果返回-1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelScore 模型版本对应的评分结果；Found=1 时：模型版本对应的评分结果，0~100 分
区间；Found=-1（未查到）时：全部模型结果返回-1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelScore() {
        return this.ModelScore;
    }

    /**
     * Set 模型版本对应的评分结果；Found=1 时：模型版本对应的评分结果，0~100 分
区间；Found=-1（未查到）时：全部模型结果返回-1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelScore 模型版本对应的评分结果；Found=1 时：模型版本对应的评分结果，0~100 分
区间；Found=-1（未查到）时：全部模型结果返回-1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelScore(String ModelScore) {
        this.ModelScore = ModelScore;
    }

    public OtherModelScoresDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherModelScoresDetail(OtherModelScoresDetail source) {
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

