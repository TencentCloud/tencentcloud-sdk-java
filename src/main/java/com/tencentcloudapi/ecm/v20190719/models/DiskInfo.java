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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskInfo extends AbstractModel{

    /**
    * 磁盘类型：LOCAL_BASIC
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 磁盘ID
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 磁盘大小（GB）
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get 磁盘类型：LOCAL_BASIC 
     * @return DiskType 磁盘类型：LOCAL_BASIC
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型：LOCAL_BASIC
     * @param DiskType 磁盘类型：LOCAL_BASIC
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 磁盘ID 
     * @return DiskId 磁盘ID
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 磁盘ID
     * @param DiskId 磁盘ID
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 磁盘大小（GB） 
     * @return DiskSize 磁盘大小（GB）
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 磁盘大小（GB）
     * @param DiskSize 磁盘大小（GB）
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public DiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskInfo(DiskInfo source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

