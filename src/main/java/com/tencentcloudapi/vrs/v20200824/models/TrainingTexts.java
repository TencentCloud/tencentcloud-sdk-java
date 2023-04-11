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
package com.tencentcloudapi.vrs.v20200824.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrainingTexts extends AbstractModel{

    /**
    * 训练文本列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingTextList")
    @Expose
    private TrainingText [] TrainingTextList;

    /**
     * Get 训练文本列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingTextList 训练文本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TrainingText [] getTrainingTextList() {
        return this.TrainingTextList;
    }

    /**
     * Set 训练文本列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingTextList 训练文本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingTextList(TrainingText [] TrainingTextList) {
        this.TrainingTextList = TrainingTextList;
    }

    public TrainingTexts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainingTexts(TrainingTexts source) {
        if (source.TrainingTextList != null) {
            this.TrainingTextList = new TrainingText[source.TrainingTextList.length];
            for (int i = 0; i < source.TrainingTextList.length; i++) {
                this.TrainingTextList[i] = new TrainingText(source.TrainingTextList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TrainingTextList.", this.TrainingTextList);

    }
}

