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

public class Disk extends AbstractModel {

    /**
    * 数据盘类型，创建EMR容器集群实例可选
<li> SSD云盘: CLOUD_SSD</li>
<li>高效云盘: CLOUD_PREMIUM</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 单块大小GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskCapacity")
    @Expose
    private Long DiskCapacity;

    /**
    * 数据盘数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskNumber")
    @Expose
    private Long DiskNumber;

    /**
     * Get 数据盘类型，创建EMR容器集群实例可选
<li> SSD云盘: CLOUD_SSD</li>
<li>高效云盘: CLOUD_PREMIUM</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskType 数据盘类型，创建EMR容器集群实例可选
<li> SSD云盘: CLOUD_SSD</li>
<li>高效云盘: CLOUD_PREMIUM</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 数据盘类型，创建EMR容器集群实例可选
<li> SSD云盘: CLOUD_SSD</li>
<li>高效云盘: CLOUD_PREMIUM</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 数据盘类型，创建EMR容器集群实例可选
<li> SSD云盘: CLOUD_SSD</li>
<li>高效云盘: CLOUD_PREMIUM</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 单块大小GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskCapacity 单块大小GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskCapacity() {
        return this.DiskCapacity;
    }

    /**
     * Set 单块大小GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskCapacity 单块大小GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskCapacity(Long DiskCapacity) {
        this.DiskCapacity = DiskCapacity;
    }

    /**
     * Get 数据盘数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskNumber 数据盘数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskNumber() {
        return this.DiskNumber;
    }

    /**
     * Set 数据盘数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskNumber 数据盘数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskNumber(Long DiskNumber) {
        this.DiskNumber = DiskNumber;
    }

    public Disk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Disk(Disk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskCapacity != null) {
            this.DiskCapacity = new Long(source.DiskCapacity);
        }
        if (source.DiskNumber != null) {
            this.DiskNumber = new Long(source.DiskNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskCapacity", this.DiskCapacity);
        this.setParamSimple(map, prefix + "DiskNumber", this.DiskNumber);

    }
}

