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

public class GroupInfo extends AbstractModel{

    /**
    * 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 分组类型
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

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
    * 分组描述
    */
    @SerializedName("GroupDescribe")
    @Expose
    private String GroupDescribe;

    /**
    * 扩展信息
    */
    @SerializedName("ExtraInformation")
    @Expose
    private String ExtraInformation;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 分组状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupStatus")
    @Expose
    private Long GroupStatus;

    /**
    * 设备不存在时产生的错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private String Error;

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
     * Get 分组类型 
     * @return GroupType 分组类型
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 分组类型
     * @param GroupType 分组类型
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
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
     * Get 扩展信息 
     * @return ExtraInformation 扩展信息
     */
    public String getExtraInformation() {
        return this.ExtraInformation;
    }

    /**
     * Set 扩展信息
     * @param ExtraInformation 扩展信息
     */
    public void setExtraInformation(String ExtraInformation) {
        this.ExtraInformation = ExtraInformation;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 分组状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupStatus 分组状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupStatus() {
        return this.GroupStatus;
    }

    /**
     * Set 分组状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupStatus 分组状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupStatus(Long GroupStatus) {
        this.GroupStatus = GroupStatus;
    }

    /**
     * Get 设备不存在时产生的错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Error 设备不存在时产生的错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 设备不存在时产生的错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 设备不存在时产生的错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(String Error) {
        this.Error = Error;
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
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.GroupPath != null) {
            this.GroupPath = new String(source.GroupPath);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.GroupDescribe != null) {
            this.GroupDescribe = new String(source.GroupDescribe);
        }
        if (source.ExtraInformation != null) {
            this.ExtraInformation = new String(source.ExtraInformation);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.GroupStatus != null) {
            this.GroupStatus = new Long(source.GroupStatus);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "GroupPath", this.GroupPath);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "GroupDescribe", this.GroupDescribe);
        this.setParamSimple(map, prefix + "ExtraInformation", this.ExtraInformation);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "GroupStatus", this.GroupStatus);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

