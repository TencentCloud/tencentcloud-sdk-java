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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineGroupInfo extends AbstractModel{

    /**
    * 机器组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 机器组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 机器组类型
    */
    @SerializedName("MachineGroupType")
    @Expose
    private MachineGroupTypeInfo MachineGroupType;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 机器组绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 是否开启机器组自动更新
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoUpdate")
    @Expose
    private String AutoUpdate;

    /**
    * 升级开始时间，建议业务低峰期升级LogListener
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateStartTime")
    @Expose
    private String UpdateStartTime;

    /**
    * 升级结束时间，建议业务低峰期升级LogListener
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateEndTime")
    @Expose
    private String UpdateEndTime;

    /**
    * 是否开启服务日志，用于记录因Loglistener 服务自身产生的log，开启后，会创建内部日志集cls_service_logging和日志主题loglistener_status,loglistener_alarm,loglistener_business，不产生计费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceLogging")
    @Expose
    private Boolean ServiceLogging;

    /**
     * Get 机器组ID 
     * @return GroupId 机器组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 机器组ID
     * @param GroupId 机器组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 机器组名称 
     * @return GroupName 机器组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 机器组名称
     * @param GroupName 机器组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 机器组类型 
     * @return MachineGroupType 机器组类型
     */
    public MachineGroupTypeInfo getMachineGroupType() {
        return this.MachineGroupType;
    }

    /**
     * Set 机器组类型
     * @param MachineGroupType 机器组类型
     */
    public void setMachineGroupType(MachineGroupTypeInfo MachineGroupType) {
        this.MachineGroupType = MachineGroupType;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 机器组绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 机器组绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 机器组绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 机器组绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否开启机器组自动更新
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoUpdate 是否开启机器组自动更新
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoUpdate() {
        return this.AutoUpdate;
    }

    /**
     * Set 是否开启机器组自动更新
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoUpdate 是否开启机器组自动更新
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoUpdate(String AutoUpdate) {
        this.AutoUpdate = AutoUpdate;
    }

    /**
     * Get 升级开始时间，建议业务低峰期升级LogListener
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateStartTime 升级开始时间，建议业务低峰期升级LogListener
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateStartTime() {
        return this.UpdateStartTime;
    }

    /**
     * Set 升级开始时间，建议业务低峰期升级LogListener
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateStartTime 升级开始时间，建议业务低峰期升级LogListener
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateStartTime(String UpdateStartTime) {
        this.UpdateStartTime = UpdateStartTime;
    }

    /**
     * Get 升级结束时间，建议业务低峰期升级LogListener
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateEndTime 升级结束时间，建议业务低峰期升级LogListener
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateEndTime() {
        return this.UpdateEndTime;
    }

    /**
     * Set 升级结束时间，建议业务低峰期升级LogListener
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateEndTime 升级结束时间，建议业务低峰期升级LogListener
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateEndTime(String UpdateEndTime) {
        this.UpdateEndTime = UpdateEndTime;
    }

    /**
     * Get 是否开启服务日志，用于记录因Loglistener 服务自身产生的log，开启后，会创建内部日志集cls_service_logging和日志主题loglistener_status,loglistener_alarm,loglistener_business，不产生计费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceLogging 是否开启服务日志，用于记录因Loglistener 服务自身产生的log，开启后，会创建内部日志集cls_service_logging和日志主题loglistener_status,loglistener_alarm,loglistener_business，不产生计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getServiceLogging() {
        return this.ServiceLogging;
    }

    /**
     * Set 是否开启服务日志，用于记录因Loglistener 服务自身产生的log，开启后，会创建内部日志集cls_service_logging和日志主题loglistener_status,loglistener_alarm,loglistener_business，不产生计费
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceLogging 是否开启服务日志，用于记录因Loglistener 服务自身产生的log，开启后，会创建内部日志集cls_service_logging和日志主题loglistener_status,loglistener_alarm,loglistener_business，不产生计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceLogging(Boolean ServiceLogging) {
        this.ServiceLogging = ServiceLogging;
    }

    public MachineGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineGroupInfo(MachineGroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.MachineGroupType != null) {
            this.MachineGroupType = new MachineGroupTypeInfo(source.MachineGroupType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AutoUpdate != null) {
            this.AutoUpdate = new String(source.AutoUpdate);
        }
        if (source.UpdateStartTime != null) {
            this.UpdateStartTime = new String(source.UpdateStartTime);
        }
        if (source.UpdateEndTime != null) {
            this.UpdateEndTime = new String(source.UpdateEndTime);
        }
        if (source.ServiceLogging != null) {
            this.ServiceLogging = new Boolean(source.ServiceLogging);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamObj(map, prefix + "MachineGroupType.", this.MachineGroupType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoUpdate", this.AutoUpdate);
        this.setParamSimple(map, prefix + "UpdateStartTime", this.UpdateStartTime);
        this.setParamSimple(map, prefix + "UpdateEndTime", this.UpdateEndTime);
        this.setParamSimple(map, prefix + "ServiceLogging", this.ServiceLogging);

    }
}

