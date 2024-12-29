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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeSpecDiskV2 extends AbstractModel {

    /**
    * 数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 指定磁盘大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultDiskSize")
    @Expose
    private Long DefaultDiskSize;

    /**
     * Get 数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskType 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 指定磁盘大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultDiskSize 指定磁盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultDiskSize() {
        return this.DefaultDiskSize;
    }

    /**
     * Set 指定磁盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultDiskSize 指定磁盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultDiskSize(Long DefaultDiskSize) {
        this.DefaultDiskSize = DefaultDiskSize;
    }

    public NodeSpecDiskV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeSpecDiskV2(NodeSpecDiskV2 source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DefaultDiskSize != null) {
            this.DefaultDiskSize = new Long(source.DefaultDiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DefaultDiskSize", this.DefaultDiskSize);

    }
}

