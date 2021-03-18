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

public class GroupItem extends AbstractModel{

    /**
    * 分组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 父分组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 分组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupPath")
    @Expose
    private String GroupPath;

    /**
    * 分组描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupDescribe")
    @Expose
    private String GroupDescribe;

    /**
    * 分组绑定设备数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceNum")
    @Expose
    private Long DeviceNum;

    /**
    * 子分组数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubGroupNum")
    @Expose
    private Long SubGroupNum;

    /**
    * 分组附加信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInformation")
    @Expose
    private String ExtraInformation;

    /**
    * 分组类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get 分组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 父分组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId 父分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父分组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId 父分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 分组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 分组路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupPath 分组路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupPath() {
        return this.GroupPath;
    }

    /**
     * Set 分组路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupPath 分组路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupPath(String GroupPath) {
        this.GroupPath = GroupPath;
    }

    /**
     * Get 分组描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupDescribe 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupDescribe() {
        return this.GroupDescribe;
    }

    /**
     * Set 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupDescribe 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupDescribe(String GroupDescribe) {
        this.GroupDescribe = GroupDescribe;
    }

    /**
     * Get 分组绑定设备数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceNum 分组绑定设备数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeviceNum() {
        return this.DeviceNum;
    }

    /**
     * Set 分组绑定设备数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceNum 分组绑定设备数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceNum(Long DeviceNum) {
        this.DeviceNum = DeviceNum;
    }

    /**
     * Get 子分组数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubGroupNum 子分组数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubGroupNum() {
        return this.SubGroupNum;
    }

    /**
     * Set 子分组数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubGroupNum 子分组数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubGroupNum(Long SubGroupNum) {
        this.SubGroupNum = SubGroupNum;
    }

    /**
     * Get 分组附加信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInformation 分组附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInformation() {
        return this.ExtraInformation;
    }

    /**
     * Set 分组附加信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInformation 分组附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInformation(String ExtraInformation) {
        this.ExtraInformation = ExtraInformation;
    }

    /**
     * Get 分组类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupType 分组类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 分组类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupType 分组类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupPath", this.GroupPath);
        this.setParamSimple(map, prefix + "GroupDescribe", this.GroupDescribe);
        this.setParamSimple(map, prefix + "DeviceNum", this.DeviceNum);
        this.setParamSimple(map, prefix + "SubGroupNum", this.SubGroupNum);
        this.setParamSimple(map, prefix + "ExtraInformation", this.ExtraInformation);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

