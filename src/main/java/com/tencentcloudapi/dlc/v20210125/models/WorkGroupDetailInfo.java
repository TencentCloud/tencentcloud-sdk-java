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

public class WorkGroupDetailInfo extends AbstractModel{

    /**
    * 工作组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkGroupId")
    @Expose
    private Long WorkGroupId;

    /**
    * 工作组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkGroupName")
    @Expose
    private String WorkGroupName;

    /**
    * 包含的信息类型。User：用户信息；DataAuth：数据权限；EngineAuth:引擎权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 工作组上绑定的用户集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserInfo")
    @Expose
    private Users UserInfo;

    /**
    * 数据权限集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataPolicyInfo")
    @Expose
    private Policys DataPolicyInfo;

    /**
    * 引擎权限集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnginePolicyInfo")
    @Expose
    private Policys EnginePolicyInfo;

    /**
    * 工作组描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkGroupDescription")
    @Expose
    private String WorkGroupDescription;

    /**
    * 行过滤信息集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowFilterInfo")
    @Expose
    private Policys RowFilterInfo;

    /**
     * Get 工作组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkGroupId 工作组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWorkGroupId() {
        return this.WorkGroupId;
    }

    /**
     * Set 工作组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkGroupId 工作组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkGroupId(Long WorkGroupId) {
        this.WorkGroupId = WorkGroupId;
    }

    /**
     * Get 工作组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkGroupName 工作组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkGroupName() {
        return this.WorkGroupName;
    }

    /**
     * Set 工作组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkGroupName 工作组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkGroupName(String WorkGroupName) {
        this.WorkGroupName = WorkGroupName;
    }

    /**
     * Get 包含的信息类型。User：用户信息；DataAuth：数据权限；EngineAuth:引擎权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 包含的信息类型。User：用户信息；DataAuth：数据权限；EngineAuth:引擎权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 包含的信息类型。User：用户信息；DataAuth：数据权限；EngineAuth:引擎权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 包含的信息类型。User：用户信息；DataAuth：数据权限；EngineAuth:引擎权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 工作组上绑定的用户集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserInfo 工作组上绑定的用户集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Users getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 工作组上绑定的用户集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserInfo 工作组上绑定的用户集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserInfo(Users UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get 数据权限集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataPolicyInfo 数据权限集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Policys getDataPolicyInfo() {
        return this.DataPolicyInfo;
    }

    /**
     * Set 数据权限集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataPolicyInfo 数据权限集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataPolicyInfo(Policys DataPolicyInfo) {
        this.DataPolicyInfo = DataPolicyInfo;
    }

    /**
     * Get 引擎权限集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnginePolicyInfo 引擎权限集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Policys getEnginePolicyInfo() {
        return this.EnginePolicyInfo;
    }

    /**
     * Set 引擎权限集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnginePolicyInfo 引擎权限集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnginePolicyInfo(Policys EnginePolicyInfo) {
        this.EnginePolicyInfo = EnginePolicyInfo;
    }

    /**
     * Get 工作组描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkGroupDescription 工作组描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkGroupDescription() {
        return this.WorkGroupDescription;
    }

    /**
     * Set 工作组描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkGroupDescription 工作组描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkGroupDescription(String WorkGroupDescription) {
        this.WorkGroupDescription = WorkGroupDescription;
    }

    /**
     * Get 行过滤信息集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowFilterInfo 行过滤信息集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Policys getRowFilterInfo() {
        return this.RowFilterInfo;
    }

    /**
     * Set 行过滤信息集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowFilterInfo 行过滤信息集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowFilterInfo(Policys RowFilterInfo) {
        this.RowFilterInfo = RowFilterInfo;
    }

    public WorkGroupDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkGroupDetailInfo(WorkGroupDetailInfo source) {
        if (source.WorkGroupId != null) {
            this.WorkGroupId = new Long(source.WorkGroupId);
        }
        if (source.WorkGroupName != null) {
            this.WorkGroupName = new String(source.WorkGroupName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new Users(source.UserInfo);
        }
        if (source.DataPolicyInfo != null) {
            this.DataPolicyInfo = new Policys(source.DataPolicyInfo);
        }
        if (source.EnginePolicyInfo != null) {
            this.EnginePolicyInfo = new Policys(source.EnginePolicyInfo);
        }
        if (source.WorkGroupDescription != null) {
            this.WorkGroupDescription = new String(source.WorkGroupDescription);
        }
        if (source.RowFilterInfo != null) {
            this.RowFilterInfo = new Policys(source.RowFilterInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkGroupId", this.WorkGroupId);
        this.setParamSimple(map, prefix + "WorkGroupName", this.WorkGroupName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamObj(map, prefix + "DataPolicyInfo.", this.DataPolicyInfo);
        this.setParamObj(map, prefix + "EnginePolicyInfo.", this.EnginePolicyInfo);
        this.setParamSimple(map, prefix + "WorkGroupDescription", this.WorkGroupDescription);
        this.setParamObj(map, prefix + "RowFilterInfo.", this.RowFilterInfo);

    }
}

