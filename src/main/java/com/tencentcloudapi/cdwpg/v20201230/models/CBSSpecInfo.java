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

public class CBSSpecInfo extends AbstractModel {

    /**
    * 盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
     * Get 盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskType 盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSize 大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskCount 个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set 个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskCount 个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    public CBSSpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CBSSpecInfo(CBSSpecInfo source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);

    }
}

