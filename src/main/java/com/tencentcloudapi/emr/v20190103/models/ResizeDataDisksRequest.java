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

public class ResizeDataDisksRequest extends AbstractModel {

    /**
    * EMR集群实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要扩容的云盘ID
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 需要扩充的容量值，容量值需要大于原容量，并且为10的整数倍
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 需要扩容的节点ID列表
    */
    @SerializedName("CvmInstanceIds")
    @Expose
    private String [] CvmInstanceIds;

    /**
     * Get EMR集群实例ID 
     * @return InstanceId EMR集群实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EMR集群实例ID
     * @param InstanceId EMR集群实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要扩容的云盘ID 
     * @return DiskIds 需要扩容的云盘ID
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 需要扩容的云盘ID
     * @param DiskIds 需要扩容的云盘ID
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 需要扩充的容量值，容量值需要大于原容量，并且为10的整数倍 
     * @return DiskSize 需要扩充的容量值，容量值需要大于原容量，并且为10的整数倍
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 需要扩充的容量值，容量值需要大于原容量，并且为10的整数倍
     * @param DiskSize 需要扩充的容量值，容量值需要大于原容量，并且为10的整数倍
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 需要扩容的节点ID列表 
     * @return CvmInstanceIds 需要扩容的节点ID列表
     */
    public String [] getCvmInstanceIds() {
        return this.CvmInstanceIds;
    }

    /**
     * Set 需要扩容的节点ID列表
     * @param CvmInstanceIds 需要扩容的节点ID列表
     */
    public void setCvmInstanceIds(String [] CvmInstanceIds) {
        this.CvmInstanceIds = CvmInstanceIds;
    }

    public ResizeDataDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResizeDataDisksRequest(ResizeDataDisksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.CvmInstanceIds != null) {
            this.CvmInstanceIds = new String[source.CvmInstanceIds.length];
            for (int i = 0; i < source.CvmInstanceIds.length; i++) {
                this.CvmInstanceIds[i] = new String(source.CvmInstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamArraySimple(map, prefix + "CvmInstanceIds.", this.CvmInstanceIds);

    }
}

