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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LimitRange extends AbstractModel {

    /**
    * 最大CPU设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxCPU")
    @Expose
    private String MaxCPU;

    /**
    * 最大内存设置（单位：Mi，Gi，Ti，M，G，T）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxMemory")
    @Expose
    private String MaxMemory;

    /**
     * Get 最大CPU设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxCPU 最大CPU设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaxCPU() {
        return this.MaxCPU;
    }

    /**
     * Set 最大CPU设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxCPU 最大CPU设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxCPU(String MaxCPU) {
        this.MaxCPU = MaxCPU;
    }

    /**
     * Get 最大内存设置（单位：Mi，Gi，Ti，M，G，T）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxMemory 最大内存设置（单位：Mi，Gi，Ti，M，G，T）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaxMemory() {
        return this.MaxMemory;
    }

    /**
     * Set 最大内存设置（单位：Mi，Gi，Ti，M，G，T）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxMemory 最大内存设置（单位：Mi，Gi，Ti，M，G，T）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxMemory(String MaxMemory) {
        this.MaxMemory = MaxMemory;
    }

    public LimitRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LimitRange(LimitRange source) {
        if (source.MaxCPU != null) {
            this.MaxCPU = new String(source.MaxCPU);
        }
        if (source.MaxMemory != null) {
            this.MaxMemory = new String(source.MaxMemory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxCPU", this.MaxCPU);
        this.setParamSimple(map, prefix + "MaxMemory", this.MaxMemory);

    }
}

