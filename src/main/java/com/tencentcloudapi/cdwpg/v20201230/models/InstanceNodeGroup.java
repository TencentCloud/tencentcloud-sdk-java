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

public class InstanceNodeGroup extends AbstractModel {

    /**
    * 机型
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 磁盘信息
    */
    @SerializedName("DataDisk")
    @Expose
    private DiskSpecPlus DataDisk;

    /**
    * 机器个数
    */
    @SerializedName("CvmCount")
    @Expose
    private Long CvmCount;

    /**
     * Get 机型 
     * @return SpecName 机型
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 机型
     * @param SpecName 机型
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 磁盘信息 
     * @return DataDisk 磁盘信息
     */
    public DiskSpecPlus getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set 磁盘信息
     * @param DataDisk 磁盘信息
     */
    public void setDataDisk(DiskSpecPlus DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get 机器个数 
     * @return CvmCount 机器个数
     */
    public Long getCvmCount() {
        return this.CvmCount;
    }

    /**
     * Set 机器个数
     * @param CvmCount 机器个数
     */
    public void setCvmCount(Long CvmCount) {
        this.CvmCount = CvmCount;
    }

    public InstanceNodeGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNodeGroup(InstanceNodeGroup source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.DataDisk != null) {
            this.DataDisk = new DiskSpecPlus(source.DataDisk);
        }
        if (source.CvmCount != null) {
            this.CvmCount = new Long(source.CvmCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamObj(map, prefix + "DataDisk.", this.DataDisk);
        this.setParamSimple(map, prefix + "CvmCount", this.CvmCount);

    }
}

