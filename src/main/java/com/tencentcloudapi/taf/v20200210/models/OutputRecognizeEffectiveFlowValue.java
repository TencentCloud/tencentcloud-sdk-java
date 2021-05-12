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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputRecognizeEffectiveFlowValue extends AbstractModel{

    /**
    * 返回标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Lable")
    @Expose
    private String Lable;

    /**
    * 返回分值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
     * Get 返回标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Lable 返回标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLable() {
        return this.Lable;
    }

    /**
     * Set 返回标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Lable 返回标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLable(String Lable) {
        this.Lable = Lable;
    }

    /**
     * Get 返回分值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 返回分值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 返回分值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 返回分值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    public OutputRecognizeEffectiveFlowValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputRecognizeEffectiveFlowValue(OutputRecognizeEffectiveFlowValue source) {
        if (source.Lable != null) {
            this.Lable = new String(source.Lable);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Lable", this.Lable);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

