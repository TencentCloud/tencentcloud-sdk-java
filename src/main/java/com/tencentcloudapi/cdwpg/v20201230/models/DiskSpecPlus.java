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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskSpecPlus extends AbstractModel {

    /**
    * 磁盘个数
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * 磁盘最大值
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * 磁盘最小值
    */
    @SerializedName("MinDiskSize")
    @Expose
    private Long MinDiskSize;

    /**
    * 磁盘类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 磁盘类型详情
    */
    @SerializedName("DiskDesc")
    @Expose
    private String DiskDesc;

    /**
    * 机型类型
    */
    @SerializedName("CvmClass")
    @Expose
    private String CvmClass;

    /**
     * Get 磁盘个数 
     * @return DiskCount 磁盘个数
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set 磁盘个数
     * @param DiskCount 磁盘个数
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get 磁盘最大值 
     * @return MaxDiskSize 磁盘最大值
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set 磁盘最大值
     * @param MaxDiskSize 磁盘最大值
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get 磁盘最小值 
     * @return MinDiskSize 磁盘最小值
     */
    public Long getMinDiskSize() {
        return this.MinDiskSize;
    }

    /**
     * Set 磁盘最小值
     * @param MinDiskSize 磁盘最小值
     */
    public void setMinDiskSize(Long MinDiskSize) {
        this.MinDiskSize = MinDiskSize;
    }

    /**
     * Get 磁盘类型 
     * @return DiskType 磁盘类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型
     * @param DiskType 磁盘类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 磁盘类型详情 
     * @return DiskDesc 磁盘类型详情
     */
    public String getDiskDesc() {
        return this.DiskDesc;
    }

    /**
     * Set 磁盘类型详情
     * @param DiskDesc 磁盘类型详情
     */
    public void setDiskDesc(String DiskDesc) {
        this.DiskDesc = DiskDesc;
    }

    /**
     * Get 机型类型 
     * @return CvmClass 机型类型
     */
    public String getCvmClass() {
        return this.CvmClass;
    }

    /**
     * Set 机型类型
     * @param CvmClass 机型类型
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

