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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkGroupInfo extends AbstractModel{

    /**
    * 查询到的工作组唯一Id
    */
    @SerializedName("WorkGroupId")
    @Expose
    private Long WorkGroupId;

    /**
    * 工作组名称
    */
    @SerializedName("WorkGroupName")
    @Expose
    private String WorkGroupName;

    /**
    * 工作组描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkGroupDescription")
    @Expose
    private String WorkGroupDescription;

    /**
    * 工作组关联的用户数量
    */
    @SerializedName("UserNum")
    @Expose
    private Long UserNum;

    /**
    * 工作组关联的用户集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserSet")
    @Expose
    private UserMessage [] UserSet;

    /**
    * 工作组绑定的权限集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicySet")
    @Expose
    private Policy [] PolicySet;

    /**
    * 工作组的创建人
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 工作组的创建时间，形如2021-07-28 16:19:32
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 查询到的工作组唯一Id 
     * @return WorkGroupId 查询到的工作组唯一Id
     */
    public Long getWorkGroupId() {
        return this.WorkGroupId;
    }

    /**
     * Set 查询到的工作组唯一Id
     * @param WorkGroupId 查询到的工作组唯一Id
     */
    public void setWorkGroupId(Long WorkGroupId) {
        this.WorkGroupId = WorkGroupId;
    }

    /**
     * Get 工作组名称 
     * @return WorkGroupName 工作组名称
     */
    public String getWorkGroupName() {
        return this.WorkGroupName;
    }

    /**
     * Set 工作组名称
     * @param WorkGroupName 工作组名称
     */
    public void setWorkGroupName(String WorkGroupName) {
        this.WorkGroupName = WorkGroupName;
    }

    /**
     * Get 工作组描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkGroupDescription 工作组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkGroupDescription() {
        return this.WorkGroupDescription;
    }

    /**
     * Set 工作组描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkGroupDescription 工作组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkGroupDescription(String WorkGroupDescription) {
        this.WorkGroupDescription = WorkGroupDescription;
    }

    /**
     * Get 工作组关联的用户数量 
     * @return UserNum 工作组关联的用户数量
     */
    public Long getUserNum() {
        return this.UserNum;
    }

    /**
     * Set 工作组关联的用户数量
     * @param UserNum 工作组关联的用户数量
     */
    public void setUserNum(Long UserNum) {
        this.UserNum = UserNum;
    }

    /**
     * Get 工作组关联的用户集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserSet 工作组关联的用户集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserMessage [] getUserSet() {
        return this.UserSet;
    }

    /**
     * Set 工作组关联的用户集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserSet 工作组关联的用户集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserSet(UserMessage [] UserSet) {
        this.UserSet = UserSet;
    }

    /**
     * Get 工作组绑定的权限集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicySet 工作组绑定的权限集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Policy [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set 工作组绑定的权限集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicySet 工作组绑定的权限集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicySet(Policy [] PolicySet) {
        this.PolicySet = PolicySet;
    }

    /**
     * Get 工作组的创建人 
     * @return Creator 工作组的创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 工作组的创建人
     * @param Creator 工作组的创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 工作组的创建时间，形如2021-07-28 16:19:32 
     * @return CreateTime 工作组的创建时间，形如2021-07-28 16:19:32
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 工作组的创建时间，形如2021-07-28 16:19:32
     * @param CreateTime 工作组的创建时间，形如2021-07-28 16:19:32
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public WorkGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkGroupInfo(WorkGroupInfo source) {
        if (source.WorkGroupId != null) {
            this.WorkGroupId = new Long(source.WorkGroupId);
        }
        if (source.WorkGroupName != null) {
            this.WorkGroupName = new String(source.WorkGroupName);
        }
        if (source.WorkGroupDescription != null) {
            this.WorkGroupDescription = new String(source.WorkGroupDescription);
        }
        if (source.UserNum != null) {
            this.UserNum = new Long(source.UserNum);
        }
        if (source.UserSet != null) {
            this.UserSet = new UserMessage[source.UserSet.length];
            for (int i = 0; i < source.UserSet.length; i++) {
                this.UserSet[i] = new UserMessage(source.UserSet[i]);
            }
        }
        if (source.PolicySet != null) {
            this.PolicySet = new Policy[source.PolicySet.length];
            for (int i = 0; i < source.PolicySet.length; i++) {
                this.PolicySet[i] = new Policy(source.PolicySet[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkGroupId", this.WorkGroupId);
        this.setParamSimple(map, prefix + "WorkGroupName", this.WorkGroupName);
        this.setParamSimple(map, prefix + "WorkGroupDescription", this.WorkGroupDescription);
        this.setParamSimple(map, prefix + "UserNum", this.UserNum);
        this.setParamArrayObj(map, prefix + "UserSet.", this.UserSet);
        this.setParamArrayObj(map, prefix + "PolicySet.", this.PolicySet);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

