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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDeleteDevicesRequest extends AbstractModel{

    /**
    * 目标删除设备所属项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 目标删除设备的设备ID数组
    */
    @SerializedName("DeviceIds")
    @Expose
    private String [] DeviceIds;

    /**
     * Get 目标删除设备所属项目ID 
     * @return ProjectId 目标删除设备所属项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 目标删除设备所属项目ID
     * @param ProjectId 目标删除设备所属项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 目标删除设备的设备ID数组 
     * @return DeviceIds 目标删除设备的设备ID数组
     */
    public String [] getDeviceIds() {
        return this.DeviceIds;
    }

    /**
     * Set 目标删除设备的设备ID数组
     * @param DeviceIds 目标删除设备的设备ID数组
     */
    public void setDeviceIds(String [] DeviceIds) {
        this.DeviceIds = DeviceIds;
    }

    public BatchDeleteDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeleteDevicesRequest(BatchDeleteDevicesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeviceIds != null) {
            this.DeviceIds = new String[source.DeviceIds.length];
            for (int i = 0; i < source.DeviceIds.length; i++) {
                this.DeviceIds[i] = new String(source.DeviceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "DeviceIds.", this.DeviceIds);

    }
}

