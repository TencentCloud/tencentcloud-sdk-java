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

public class StoppingCondition extends AbstractModel{

    /**
    * 最长运行运行时间（秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRuntimeInSeconds")
    @Expose
    private Long MaxRuntimeInSeconds;

    /**
    * 最长等待运行时间（秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxWaitTimeInSeconds")
    @Expose
    private Long MaxWaitTimeInSeconds;

    /**
     * Get 最长运行运行时间（秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRuntimeInSeconds 最长运行运行时间（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRuntimeInSeconds() {
        return this.MaxRuntimeInSeconds;
    }

    /**
     * Set 最长运行运行时间（秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRuntimeInSeconds 最长运行运行时间（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRuntimeInSeconds(Long MaxRuntimeInSeconds) {
        this.MaxRuntimeInSeconds = MaxRuntimeInSeconds;
    }

    /**
     * Get 最长等待运行时间（秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxWaitTimeInSeconds 最长等待运行时间（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxWaitTimeInSeconds() {
        return this.MaxWaitTimeInSeconds;
    }

    /**
     * Set 最长等待运行时间（秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxWaitTimeInSeconds 最长等待运行时间（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxWaitTimeInSeconds(Long MaxWaitTimeInSeconds) {
        this.MaxWaitTimeInSeconds = MaxWaitTimeInSeconds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxRuntimeInSeconds", this.MaxRuntimeInSeconds);
        this.setParamSimple(map, prefix + "MaxWaitTimeInSeconds", this.MaxWaitTimeInSeconds);

    }
}

