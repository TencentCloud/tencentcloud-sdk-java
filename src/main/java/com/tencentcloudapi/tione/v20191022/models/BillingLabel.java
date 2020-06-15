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

public class BillingLabel extends AbstractModel{

    /**
    * 计费项标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 存储大小
    */
    @SerializedName("VolumeSize")
    @Expose
    private Long VolumeSize;

    /**
    * 计费状态
None: 不计费
StorageOnly: 仅存储计费
Computing: 计算和存储都计费
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 计费项标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 计费项标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 计费项标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 计费项标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 存储大小 
     * @return VolumeSize 存储大小
     */
    public Long getVolumeSize() {
        return this.VolumeSize;
    }

    /**
     * Set 存储大小
     * @param VolumeSize 存储大小
     */
    public void setVolumeSize(Long VolumeSize) {
        this.VolumeSize = VolumeSize;
    }

    /**
     * Get 计费状态
None: 不计费
StorageOnly: 仅存储计费
Computing: 计算和存储都计费 
     * @return Status 计费状态
None: 不计费
StorageOnly: 仅存储计费
Computing: 计算和存储都计费
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 计费状态
None: 不计费
StorageOnly: 仅存储计费
Computing: 计算和存储都计费
     * @param Status 计费状态
None: 不计费
StorageOnly: 仅存储计费
Computing: 计算和存储都计费
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "VolumeSize", this.VolumeSize);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

