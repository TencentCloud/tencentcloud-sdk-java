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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateLocationRequest extends AbstractModel {

    /**
    * 存储位置名，必填
    */
    @SerializedName("LocationName")
    @Expose
    private String LocationName;

    /**
    * 更新location的操作列表，必填
    */
    @SerializedName("Updates")
    @Expose
    private LocationUpdate [] Updates;

    /**
    * 调用时所在workspace唯一id，必填
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
     * Get 存储位置名，必填 
     * @return LocationName 存储位置名，必填
     */
    public String getLocationName() {
        return this.LocationName;
    }

    /**
     * Set 存储位置名，必填
     * @param LocationName 存储位置名，必填
     */
    public void setLocationName(String LocationName) {
        this.LocationName = LocationName;
    }

    /**
     * Get 更新location的操作列表，必填 
     * @return Updates 更新location的操作列表，必填
     */
    public LocationUpdate [] getUpdates() {
        return this.Updates;
    }

    /**
     * Set 更新location的操作列表，必填
     * @param Updates 更新location的操作列表，必填
     */
    public void setUpdates(LocationUpdate [] Updates) {
        this.Updates = Updates;
    }

    /**
     * Get 调用时所在workspace唯一id，必填 
     * @return WorkspaceId 调用时所在workspace唯一id，必填
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 调用时所在workspace唯一id，必填
     * @param WorkspaceId 调用时所在workspace唯一id，必填
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    public UpdateLocationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateLocationRequest(UpdateLocationRequest source) {
        if (source.LocationName != null) {
            this.LocationName = new String(source.LocationName);
        }
        if (source.Updates != null) {
            this.Updates = new LocationUpdate[source.Updates.length];
            for (int i = 0; i < source.Updates.length; i++) {
                this.Updates[i] = new LocationUpdate(source.Updates[i]);
            }
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocationName", this.LocationName);
        this.setParamArrayObj(map, prefix + "Updates.", this.Updates);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);

    }
}

