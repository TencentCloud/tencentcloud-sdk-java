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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CBSVolume extends AbstractModel {

    /**
    * 存储卷名称
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
    *  cbs 盘类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * cbs 大小（GB）
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * cbs 数量
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
     * Get 存储卷名称 
     * @return VolumeName 存储卷名称
     */
    public String getVolumeName() {
        return this.VolumeName;
    }

    /**
     * Set 存储卷名称
     * @param VolumeName 存储卷名称
     */
    public void setVolumeName(String VolumeName) {
        this.VolumeName = VolumeName;
    }

    /**
     * Get  cbs 盘类型 
     * @return DiskType  cbs 盘类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set  cbs 盘类型
     * @param DiskType  cbs 盘类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get cbs 大小（GB） 
     * @return DiskSize cbs 大小（GB）
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set cbs 大小（GB）
     * @param DiskSize cbs 大小（GB）
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get cbs 数量 
     * @return DiskCount cbs 数量
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set cbs 数量
     * @param DiskCount cbs 数量
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    public CBSVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CBSVolume(CBSVolume source) {
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
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
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);

    }
}

