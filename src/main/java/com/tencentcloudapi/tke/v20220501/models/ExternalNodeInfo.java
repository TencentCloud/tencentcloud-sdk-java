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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalNodeInfo extends AbstractModel {

    /**
    * 第三方节点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * CPU核数，单位：核
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 节点内存容量，单位：`GB`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 第三方节点kubelet版本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("K8SVersion")
    @Expose
    private String K8SVersion;

    /**
     * Get 第三方节点名称 
     * @return Name 第三方节点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 第三方节点名称
     * @param Name 第三方节点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get CPU核数，单位：核
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CPU CPU核数，单位：核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU核数，单位：核
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPU CPU核数，单位：核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 节点内存容量，单位：`GB`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 节点内存容量，单位：`GB`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 节点内存容量，单位：`GB`
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 节点内存容量，单位：`GB`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 第三方节点kubelet版本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return K8SVersion 第三方节点kubelet版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getK8SVersion() {
        return this.K8SVersion;
    }

    /**
     * Set 第三方节点kubelet版本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param K8SVersion 第三方节点kubelet版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setK8SVersion(String K8SVersion) {
        this.K8SVersion = K8SVersion;
    }

    public ExternalNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalNodeInfo(ExternalNodeInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.K8SVersion != null) {
            this.K8SVersion = new String(source.K8SVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "K8SVersion", this.K8SVersion);

    }
}

