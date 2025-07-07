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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchCreateDeviceRequest extends AbstractModel {

    /**
    * 工作空间Id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 设备信息项

    */
    @SerializedName("AddDeviceSet")
    @Expose
    private AddDeviceInfo [] AddDeviceSet;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
     * Get 工作空间Id 
     * @return WorkspaceId 工作空间Id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间Id
     * @param WorkspaceId 工作空间Id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 设备信息项
 
     * @return AddDeviceSet 设备信息项

     */
    public AddDeviceInfo [] getAddDeviceSet() {
        return this.AddDeviceSet;
    }

    /**
     * Set 设备信息项

     * @param AddDeviceSet 设备信息项

     */
    public void setAddDeviceSet(AddDeviceInfo [] AddDeviceSet) {
        this.AddDeviceSet = AddDeviceSet;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    public BatchCreateDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateDeviceRequest(BatchCreateDeviceRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.AddDeviceSet != null) {
            this.AddDeviceSet = new AddDeviceInfo[source.AddDeviceSet.length];
            for (int i = 0; i < source.AddDeviceSet.length; i++) {
                this.AddDeviceSet[i] = new AddDeviceInfo(source.AddDeviceSet[i]);
            }
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamArrayObj(map, prefix + "AddDeviceSet.", this.AddDeviceSet);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);

    }
}

