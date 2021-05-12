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

public class UpdateDeviceGroupRequest extends AbstractModel{

    /**
    * 分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组描述
    */
    @SerializedName("GroupDescribe")
    @Expose
    private String GroupDescribe;

    /**
    * 新父分组ID，用于修改分组路径
    */
    @SerializedName("NewParentId")
    @Expose
    private String NewParentId;

    /**
     * Get 分组名称 
     * @return GroupName 分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称
     * @param GroupName 分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
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
     * Get 分组描述 
     * @return GroupDescribe 分组描述
     */
    public String getGroupDescribe() {
        return this.GroupDescribe;
    }

    /**
     * Set 分组描述
     * @param GroupDescribe 分组描述
     */
    public void setGroupDescribe(String GroupDescribe) {
        this.GroupDescribe = GroupDescribe;
    }

    /**
     * Get 新父分组ID，用于修改分组路径 
     * @return NewParentId 新父分组ID，用于修改分组路径
     */
    public String getNewParentId() {
        return this.NewParentId;
    }

    /**
     * Set 新父分组ID，用于修改分组路径
     * @param NewParentId 新父分组ID，用于修改分组路径
     */
    public void setNewParentId(String NewParentId) {
        this.NewParentId = NewParentId;
    }

    public UpdateDeviceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDeviceGroupRequest(UpdateDeviceGroupRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupDescribe != null) {
            this.GroupDescribe = new String(source.GroupDescribe);
        }
        if (source.NewParentId != null) {
            this.NewParentId = new String(source.NewParentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupDescribe", this.GroupDescribe);
        this.setParamSimple(map, prefix + "NewParentId", this.NewParentId);

    }
}

