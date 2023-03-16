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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachCBSSpec extends AbstractModel{

    /**
    * 节点磁盘类型，例如“CLOUD_SSD”\"CLOUD_PREMIUM"
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 磁盘容量，单位G
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 磁盘总数
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * 描述
    */
    @SerializedName("DiskDesc")
    @Expose
    private String DiskDesc;

    /**
     * Get 节点磁盘类型，例如“CLOUD_SSD”\"CLOUD_PREMIUM" 
     * @return DiskType 节点磁盘类型，例如“CLOUD_SSD”\"CLOUD_PREMIUM"
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 节点磁盘类型，例如“CLOUD_SSD”\"CLOUD_PREMIUM"
     * @param DiskType 节点磁盘类型，例如“CLOUD_SSD”\"CLOUD_PREMIUM"
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 磁盘容量，单位G 
     * @return DiskSize 磁盘容量，单位G
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 磁盘容量，单位G
     * @param DiskSize 磁盘容量，单位G
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 磁盘总数 
     * @return DiskCount 磁盘总数
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set 磁盘总数
     * @param DiskCount 磁盘总数
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get 描述 
     * @return DiskDesc 描述
     */
    public String getDiskDesc() {
        return this.DiskDesc;
    }

    /**
     * Set 描述
     * @param DiskDesc 描述
     */
    public void setDiskDesc(String DiskDesc) {
        this.DiskDesc = DiskDesc;
    }

    public AttachCBSSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachCBSSpec(AttachCBSSpec source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.DiskDesc != null) {
            this.DiskDesc = new String(source.DiskDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "DiskDesc", this.DiskDesc);

    }
}

