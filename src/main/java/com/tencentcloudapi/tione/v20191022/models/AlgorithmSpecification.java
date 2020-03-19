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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlgorithmSpecification extends AbstractModel{

    /**
    * 镜像名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingImageName")
    @Expose
    private String TrainingImageName;

    /**
    * 输入模式File|Pipe
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingInputMode")
    @Expose
    private String TrainingInputMode;

    /**
    * 算法名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlgorithmName")
    @Expose
    private String AlgorithmName;

    /**
     * Get 镜像名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingImageName 镜像名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingImageName() {
        return this.TrainingImageName;
    }

    /**
     * Set 镜像名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingImageName 镜像名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingImageName(String TrainingImageName) {
        this.TrainingImageName = TrainingImageName;
    }

    /**
     * Get 输入模式File|Pipe
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingInputMode 输入模式File|Pipe
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingInputMode() {
        return this.TrainingInputMode;
    }

    /**
     * Set 输入模式File|Pipe
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingInputMode 输入模式File|Pipe
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingInputMode(String TrainingInputMode) {
        this.TrainingInputMode = TrainingInputMode;
    }

    /**
     * Get 算法名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlgorithmName 算法名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlgorithmName() {
        return this.AlgorithmName;
    }

    /**
     * Set 算法名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlgorithmName 算法名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlgorithmName(String AlgorithmName) {
        this.AlgorithmName = AlgorithmName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrainingImageName", this.TrainingImageName);
        this.setParamSimple(map, prefix + "TrainingInputMode", this.TrainingInputMode);
        this.setParamSimple(map, prefix + "AlgorithmName", this.AlgorithmName);

    }
}

