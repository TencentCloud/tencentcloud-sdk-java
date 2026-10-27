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

public class CreateDataDiskRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据盘类型，有效值CLOUD_SSD/CLOUD_PREMIUM
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 数据盘大小
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 硬盘快照id
    */
    @SerializedName("SnapShotId")
    @Expose
    private String SnapShotId;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据盘类型，有效值CLOUD_SSD/CLOUD_PREMIUM 
     * @return DiskType 数据盘类型，有效值CLOUD_SSD/CLOUD_PREMIUM
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 数据盘类型，有效值CLOUD_SSD/CLOUD_PREMIUM
     * @param DiskType 数据盘类型，有效值CLOUD_SSD/CLOUD_PREMIUM
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 数据盘大小 
     * @return DiskSize 数据盘大小
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 数据盘大小
     * @param DiskSize 数据盘大小
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 硬盘快照id 
     * @return SnapShotId 硬盘快照id
     */
    public String getSnapShotId() {
        return this.SnapShotId;
    }

    /**
     * Set 硬盘快照id
     * @param SnapShotId 硬盘快照id
     */
    public void setSnapShotId(String SnapShotId) {
        this.SnapShotId = SnapShotId;
    }

    public CreateDataDiskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataDiskRequest(CreateDataDiskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.SnapShotId != null) {
            this.SnapShotId = new String(source.SnapShotId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "SnapShotId", this.SnapShotId);

    }
}

