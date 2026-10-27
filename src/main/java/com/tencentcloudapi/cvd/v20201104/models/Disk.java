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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Disk extends AbstractModel {

    /**
    * <p>磁盘类型：<br>CLOUD_SSD：SSD云硬盘<br>CLOUD_PREMIUM：高性能云硬盘</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>磁盘大小（单位G）<br>系统盘最小值50，最大值500<br>数据盘最小值10，最大值32000。最小调整步长为10G</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>磁盘id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
     * Get <p>磁盘类型：<br>CLOUD_SSD：SSD云硬盘<br>CLOUD_PREMIUM：高性能云硬盘</p> 
     * @return DiskType <p>磁盘类型：<br>CLOUD_SSD：SSD云硬盘<br>CLOUD_PREMIUM：高性能云硬盘</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>磁盘类型：<br>CLOUD_SSD：SSD云硬盘<br>CLOUD_PREMIUM：高性能云硬盘</p>
     * @param DiskType <p>磁盘类型：<br>CLOUD_SSD：SSD云硬盘<br>CLOUD_PREMIUM：高性能云硬盘</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>磁盘大小（单位G）<br>系统盘最小值50，最大值500<br>数据盘最小值10，最大值32000。最小调整步长为10G</p> 
     * @return DiskSize <p>磁盘大小（单位G）<br>系统盘最小值50，最大值500<br>数据盘最小值10，最大值32000。最小调整步长为10G</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>磁盘大小（单位G）<br>系统盘最小值50，最大值500<br>数据盘最小值10，最大值32000。最小调整步长为10G</p>
     * @param DiskSize <p>磁盘大小（单位G）<br>系统盘最小值50，最大值500<br>数据盘最小值10，最大值32000。最小调整步长为10G</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>磁盘id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskId <p>磁盘id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set <p>磁盘id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskId <p>磁盘id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
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
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);

    }
}

