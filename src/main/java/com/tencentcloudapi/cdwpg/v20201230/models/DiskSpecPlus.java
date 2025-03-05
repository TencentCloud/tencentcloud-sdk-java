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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskSpecPlus extends AbstractModel {

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinDiskSize")
    @Expose
    private Long MinDiskSize;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskDesc")
    @Expose
    private String DiskDesc;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CvmClass")
    @Expose
    private String CvmClass;

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskCount 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskCount 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxDiskSize 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxDiskSize 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinDiskSize 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinDiskSize() {
        return this.MinDiskSize;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinDiskSize 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinDiskSize(Long MinDiskSize) {
        this.MinDiskSize = MinDiskSize;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskType 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskDesc 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskDesc() {
        return this.DiskDesc;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskDesc 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskDesc(String DiskDesc) {
        this.DiskDesc = DiskDesc;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvmClass 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCvmClass() {
        return this.CvmClass;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvmClass 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvmClass(String CvmClass) {
        this.CvmClass = CvmClass;
    }

    public DiskSpecPlus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskSpecPlus(DiskSpecPlus source) {
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.MaxDiskSize != null) {
            this.MaxDiskSize = new Long(source.MaxDiskSize);
        }
        if (source.MinDiskSize != null) {
            this.MinDiskSize = new Long(source.MinDiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskDesc != null) {
            this.DiskDesc = new String(source.DiskDesc);
        }
        if (source.CvmClass != null) {
            this.CvmClass = new String(source.CvmClass);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);
        this.setParamSimple(map, prefix + "MinDiskSize", this.MinDiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskDesc", this.DiskDesc);
        this.setParamSimple(map, prefix + "CvmClass", this.CvmClass);

    }
}

