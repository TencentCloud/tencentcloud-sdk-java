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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachDetail extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例已挂载数据盘的数量。
    */
    @SerializedName("AttachedDiskCount")
    @Expose
    private Long AttachedDiskCount;

    /**
    * 实例最大可挂载数据盘的数量。
    */
    @SerializedName("MaxAttachCount")
    @Expose
    private Long MaxAttachCount;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例已挂载数据盘的数量。 
     * @return AttachedDiskCount 实例已挂载数据盘的数量。
     */
    public Long getAttachedDiskCount() {
        return this.AttachedDiskCount;
    }

    /**
     * Set 实例已挂载数据盘的数量。
     * @param AttachedDiskCount 实例已挂载数据盘的数量。
     */
    public void setAttachedDiskCount(Long AttachedDiskCount) {
        this.AttachedDiskCount = AttachedDiskCount;
    }

    /**
     * Get 实例最大可挂载数据盘的数量。 
     * @return MaxAttachCount 实例最大可挂载数据盘的数量。
     */
    public Long getMaxAttachCount() {
        return this.MaxAttachCount;
    }

    /**
     * Set 实例最大可挂载数据盘的数量。
     * @param MaxAttachCount 实例最大可挂载数据盘的数量。
     */
    public void setMaxAttachCount(Long MaxAttachCount) {
        this.MaxAttachCount = MaxAttachCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AttachedDiskCount", this.AttachedDiskCount);
        this.setParamSimple(map, prefix + "MaxAttachCount", this.MaxAttachCount);

    }
}

