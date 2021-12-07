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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceContainerDetailInfo extends AbstractModel{

    /**
    * 容器在主机上的ID。
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 容器所属的Pod的名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
     * Get 容器在主机上的ID。 
     * @return ContainerId 容器在主机上的ID。
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器在主机上的ID。
     * @param ContainerId 容器在主机上的ID。
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get 容器所属的Pod的名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodName 容器所属的Pod的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set 容器所属的Pod的名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodName 容器所属的Pod的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    public ComplianceContainerDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceContainerDetailInfo(ComplianceContainerDetailInfo source) {
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "PodName", this.PodName);

    }
}

