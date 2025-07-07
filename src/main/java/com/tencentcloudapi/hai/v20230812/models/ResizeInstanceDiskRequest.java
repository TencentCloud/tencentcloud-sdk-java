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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResizeInstanceDiskRequest extends AbstractModel {

    /**
    * 需要扩容云盘的HAI实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 扩容云硬盘大小，单位为GB，必须大于当前云硬盘大小。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get 需要扩容云盘的HAI实例ID 
     * @return InstanceId 需要扩容云盘的HAI实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 需要扩容云盘的HAI实例ID
     * @param InstanceId 需要扩容云盘的HAI实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 扩容云硬盘大小，单位为GB，必须大于当前云硬盘大小。 
     * @return DiskSize 扩容云硬盘大小，单位为GB，必须大于当前云硬盘大小。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 扩容云硬盘大小，单位为GB，必须大于当前云硬盘大小。
     * @param DiskSize 扩容云硬盘大小，单位为GB，必须大于当前云硬盘大小。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public ResizeInstanceDiskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResizeInstanceDiskRequest(ResizeInstanceDiskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

