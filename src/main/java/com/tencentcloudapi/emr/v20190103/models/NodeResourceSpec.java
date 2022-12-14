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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeResourceSpec extends AbstractModel{

    /**
    * 规格类型，如S2.MEDIUM8
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 系统盘，系统盘个数不超过1块
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemDisk")
    @Expose
    private DiskSpecInfo [] SystemDisk;

    /**
    * 需要绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 云数据盘，云数据盘总个数不超过15块
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDisk")
    @Expose
    private DiskSpecInfo [] DataDisk;

    /**
    * 本地数据盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalDataDisk")
    @Expose
    private DiskSpecInfo [] LocalDataDisk;

    /**
     * Get 规格类型，如S2.MEDIUM8
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 规格类型，如S2.MEDIUM8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 规格类型，如S2.MEDIUM8
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 规格类型，如S2.MEDIUM8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 系统盘，系统盘个数不超过1块
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemDisk 系统盘，系统盘个数不超过1块
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskSpecInfo [] getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 系统盘，系统盘个数不超过1块
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemDisk 系统盘，系统盘个数不超过1块
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemDisk(DiskSpecInfo [] SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 需要绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 需要绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 需要绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 需要绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 云数据盘，云数据盘总个数不超过15块
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDisk 云数据盘，云数据盘总个数不超过15块
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskSpecInfo [] getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set 云数据盘，云数据盘总个数不超过15块
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDisk 云数据盘，云数据盘总个数不超过15块
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDisk(DiskSpecInfo [] DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get 本地数据盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalDataDisk 本地数据盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskSpecInfo [] getLocalDataDisk() {
        return this.LocalDataDisk;
    }

    /**
     * Set 本地数据盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalDataDisk 本地数据盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalDataDisk(DiskSpecInfo [] LocalDataDisk) {
        this.LocalDataDisk = LocalDataDisk;
    }

    public NodeResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeResourceSpec(NodeResourceSpec source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new DiskSpecInfo[source.SystemDisk.length];
            for (int i = 0; i < source.SystemDisk.length; i++) {
                this.SystemDisk[i] = new DiskSpecInfo(source.SystemDisk[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DataDisk != null) {
            this.DataDisk = new DiskSpecInfo[source.DataDisk.length];
            for (int i = 0; i < source.DataDisk.length; i++) {
                this.DataDisk[i] = new DiskSpecInfo(source.DataDisk[i]);
            }
        }
        if (source.LocalDataDisk != null) {
            this.LocalDataDisk = new DiskSpecInfo[source.LocalDataDisk.length];
            for (int i = 0; i < source.LocalDataDisk.length; i++) {
                this.LocalDataDisk[i] = new DiskSpecInfo(source.LocalDataDisk[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "DataDisk.", this.DataDisk);
        this.setParamArrayObj(map, prefix + "LocalDataDisk.", this.LocalDataDisk);

    }
}

