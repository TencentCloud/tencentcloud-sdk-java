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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeNodePodContainerInfo extends AbstractModel{

    /**
    * Pod名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 容器ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 镜像（含版本号）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * CPU Request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * CPU Limit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * Memory Request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemoryRequest")
    @Expose
    private String MemoryRequest;

    /**
    * Memory Limit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemoryLimit")
    @Expose
    private String MemoryLimit;

    /**
    * 重启次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * 容器状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Pod名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name Pod名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Pod名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name Pod名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 容器ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 容器ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 容器ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 容器ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 镜像（含版本号）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image 镜像（含版本号）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 镜像（含版本号）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image 镜像（含版本号）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get CPU Request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuRequest CPU Request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set CPU Request
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuRequest CPU Request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get CPU Limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuLimit CPU Limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set CPU Limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuLimit CPU Limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get Memory Request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemoryRequest Memory Request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemoryRequest() {
        return this.MemoryRequest;
    }

    /**
     * Set Memory Request
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemoryRequest Memory Request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemoryRequest(String MemoryRequest) {
        this.MemoryRequest = MemoryRequest;
    }

    /**
     * Get Memory Limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemoryLimit Memory Limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set Memory Limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemoryLimit Memory Limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemoryLimit(String MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    /**
     * Get 重启次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestartCount 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestartCount 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get 容器状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 容器状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 容器状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 容器状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public EdgeNodePodContainerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeNodePodContainerInfo(EdgeNodePodContainerInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.CpuRequest != null) {
            this.CpuRequest = new String(source.CpuRequest);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new String(source.CpuLimit);
        }
        if (source.MemoryRequest != null) {
            this.MemoryRequest = new String(source.MemoryRequest);
        }
        if (source.MemoryLimit != null) {
            this.MemoryLimit = new String(source.MemoryLimit);
        }
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemoryRequest", this.MemoryRequest);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

