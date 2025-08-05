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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerAdditionalResourceRequirementMap extends AbstractModel {

    /**
    * Mesh 应用部署时需要的额外资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("M")
    @Expose
    private ContainerAdditionalResourceRequirement M;

    /**
    * 普通应用部署时需要的额外资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("N")
    @Expose
    private ContainerAdditionalResourceRequirement N;

    /**
     * Get Mesh 应用部署时需要的额外资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return M Mesh 应用部署时需要的额外资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContainerAdditionalResourceRequirement getM() {
        return this.M;
    }

    /**
     * Set Mesh 应用部署时需要的额外资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param M Mesh 应用部署时需要的额外资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setM(ContainerAdditionalResourceRequirement M) {
        this.M = M;
    }

    /**
     * Get 普通应用部署时需要的额外资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return N 普通应用部署时需要的额外资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContainerAdditionalResourceRequirement getN() {
        return this.N;
    }

    /**
     * Set 普通应用部署时需要的额外资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param N 普通应用部署时需要的额外资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setN(ContainerAdditionalResourceRequirement N) {
        this.N = N;
    }

    public ContainerAdditionalResourceRequirementMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerAdditionalResourceRequirementMap(ContainerAdditionalResourceRequirementMap source) {
        if (source.M != null) {
            this.M = new ContainerAdditionalResourceRequirement(source.M);
        }
        if (source.N != null) {
            this.N = new ContainerAdditionalResourceRequirement(source.N);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "M.", this.M);
        this.setParamObj(map, prefix + "N.", this.N);

    }
}

