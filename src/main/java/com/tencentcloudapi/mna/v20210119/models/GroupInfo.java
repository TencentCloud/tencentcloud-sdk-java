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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfo extends AbstractModel {

    /**
    * 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组名
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 分组创建的时间，单位：ms	
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 分组更新的时间，单位：ms	
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 分组描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 分组中的设备数量
    */
    @SerializedName("DeviceNum")
    @Expose
    private Long DeviceNum;

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
     * Get 分组名 
     * @return GroupName 分组名
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名
     * @param GroupName 分组名
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 分组创建的时间，单位：ms	 
     * @return CreateTime 分组创建的时间，单位：ms	
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 分组创建的时间，单位：ms	
     * @param CreateTime 分组创建的时间，单位：ms	
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 分组更新的时间，单位：ms	 
     * @return UpdateTime 分组更新的时间，单位：ms	
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 分组更新的时间，单位：ms	
     * @param UpdateTime 分组更新的时间，单位：ms	
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 分组描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 分组中的设备数量 
     * @return DeviceNum 分组中的设备数量
     */
    public Long getDeviceNum() {
        return this.DeviceNum;
    }

    /**
     * Set 分组中的设备数量
     * @param DeviceNum 分组中的设备数量
     */
    public void setDeviceNum(Long DeviceNum) {
        this.DeviceNum = DeviceNum;
    }

    public GroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfo(GroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DeviceNum != null) {
            this.DeviceNum = new Long(source.DeviceNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DeviceNum", this.DeviceNum);

    }
}

