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

public class ContainerGroupResourceConfig extends AbstractModel {

    /**
    * 不同类型的应用的容器部署组，部署时的额外资源要求
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdditionalResourceRequirement")
    @Expose
    private ContainerAdditionalResourceRequirementMap AdditionalResourceRequirement;

    /**
     * Get 不同类型的应用的容器部署组，部署时的额外资源要求
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdditionalResourceRequirement 不同类型的应用的容器部署组，部署时的额外资源要求
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContainerAdditionalResourceRequirementMap getAdditionalResourceRequirement() {
        return this.AdditionalResourceRequirement;
    }

    /**
     * Set 不同类型的应用的容器部署组，部署时的额外资源要求
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdditionalResourceRequirement 不同类型的应用的容器部署组，部署时的额外资源要求
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdditionalResourceRequirement(ContainerAdditionalResourceRequirementMap AdditionalResourceRequirement) {
        this.AdditionalResourceRequirement = AdditionalResourceRequirement;
    }

    public ContainerGroupResourceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerGroupResourceConfig(ContainerGroupResourceConfig source) {
        if (source.AdditionalResourceRequirement != null) {
            this.AdditionalResourceRequirement = new ContainerAdditionalResourceRequirementMap(source.AdditionalResourceRequirement);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AdditionalResourceRequirement.", this.AdditionalResourceRequirement);

    }
}

