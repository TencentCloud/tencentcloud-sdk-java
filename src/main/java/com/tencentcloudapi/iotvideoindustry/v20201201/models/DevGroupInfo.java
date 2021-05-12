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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DevGroupInfo extends AbstractModel{

    /**
    * 设备唯一标识
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组路径
    */
    @SerializedName("GroupPath")
    @Expose
    private String GroupPath;

    /**
    * 父分组ID
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 设备错误，仅在用户没权限或者设备已删除时返回具体结果
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get 设备唯一标识 
     * @return DeviceId 设备唯一标识
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备唯一标识
     * @param DeviceId 设备唯一标识
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 分组ID 
     * @return GroupId 分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID
     * @param GroupId 分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 分组路径 
     * @return GroupPath 分组路径
     */
    public String getGroupPath() {
        return this.GroupPath;
    }

    /**
     * Set 分组路径
     * @param GroupPath 分组路径
     */
    public void setGroupPath(String GroupPath) {
        this.GroupPath = GroupPath;
    }

    /**
     * Get 父分组ID 
     * @return ParentId 父分组ID
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父分组ID
     * @param ParentId 父分组ID
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 设备错误，仅在用户没权限或者设备已删除时返回具体结果 
     * @return Error 设备错误，仅在用户没权限或者设备已删除时返回具体结果
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 设备错误，仅在用户没权限或者设备已删除时返回具体结果
     * @param Error 设备错误，仅在用户没权限或者设备已删除时返回具体结果
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public DevGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DevGroupInfo(DevGroupInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupPath != null) {
            this.GroupPath = new String(source.GroupPath);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupPath", this.GroupPath);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

