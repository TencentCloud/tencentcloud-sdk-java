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

public class NetworkClusterPodInfo extends AbstractModel{

    /**
    * pod名字
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * pod空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * pod标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private String Labels;

    /**
    * pod类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkloadKind")
    @Expose
    private String WorkloadKind;

    /**
     * Get pod名字 
     * @return PodName pod名字
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set pod名字
     * @param PodName pod名字
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get pod空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace pod空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set pod空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace pod空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get pod标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels pod标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabels() {
        return this.Labels;
    }

    /**
     * Set pod标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels pod标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(String Labels) {
        this.Labels = Labels;
    }

    /**
     * Get pod类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkloadKind pod类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkloadKind() {
        return this.WorkloadKind;
    }

    /**
     * Set pod类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkloadKind pod类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkloadKind(String WorkloadKind) {
        this.WorkloadKind = WorkloadKind;
    }

    public NetworkClusterPodInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkClusterPodInfo(NetworkClusterPodInfo source) {
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Labels != null) {
            this.Labels = new String(source.Labels);
        }
        if (source.WorkloadKind != null) {
            this.WorkloadKind = new String(source.WorkloadKind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Labels", this.Labels);
        this.setParamSimple(map, prefix + "WorkloadKind", this.WorkloadKind);

    }
}

