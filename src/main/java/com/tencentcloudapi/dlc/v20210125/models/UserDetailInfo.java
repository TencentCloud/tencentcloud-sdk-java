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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserDetailInfo extends AbstractModel {

    /**
    * 用户Id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 返回的信息类型，Group：返回的当前用户的工作组信息；DataAuth：返回的当前用户的数据权限信息；EngineAuth：返回的当前用户的引擎权限信息
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 用户类型：ADMIN：管理员 COMMON：一般用户
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 用户描述信息
    */
    @SerializedName("UserDescription")
    @Expose
    private String UserDescription;

    /**
    * 数据权限信息集合
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
    * 绑定到该用户的工作组集合信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkGroupInfo")
    @Expose
    private WorkGroups WorkGroupInfo;

    /**
    * 用户别名
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * 行过滤集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowFilterInfo")
    @Expose
    private Policys RowFilterInfo;

    /**
    * 账号类型
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * 数据源权限集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogPolicyInfo")
    @Expose
    private Policys CatalogPolicyInfo;

    /**
    * 模型权限集合
    */
    @SerializedName("ModelPolicyInfo")
    @Expose
    private Policys ModelPolicyInfo;

    /**
     * Get 用户Id 
     * @return UserId 用户Id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户Id
     * @param UserId 用户Id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 返回的信息类型，Group：返回的当前用户的工作组信息；DataAuth：返回的当前用户的数据权限信息；EngineAuth：返回的当前用户的引擎权限信息 
     * @return Type 返回的信息类型，Group：返回的当前用户的工作组信息；DataAuth：返回的当前用户的数据权限信息；EngineAuth：返回的当前用户的引擎权限信息
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 返回的信息类型，Group：返回的当前用户的工作组信息；DataAuth：返回的当前用户的数据权限信息；EngineAuth：返回的当前用户的引擎权限信息
     * @param Type 返回的信息类型，Group：返回的当前用户的工作组信息；DataAuth：返回的当前用户的数据权限信息；EngineAuth：返回的当前用户的引擎权限信息
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 用户类型：ADMIN：管理员 COMMON：一般用户 
     * @return UserType 用户类型：ADMIN：管理员 COMMON：一般用户
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型：ADMIN：管理员 COMMON：一般用户
     * @param UserType 用户类型：ADMIN：管理员 COMMON：一般用户
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 用户描述信息 
     * @return UserDescription 用户描述信息
     */
    public String getUserDescription() {
        return this.UserDescription;
    }

    /**
     * Set 用户描述信息
     * @param UserDescription 用户描述信息
     */
    public void setUserDescription(String UserDescription) {
        this.UserDescription = UserDescription;
    }

    /**
     * Get 数据权限信息集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataPolicyInfo 数据权限信息集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Policys getDataPolicyInfo() {
        return this.DataPolicyInfo;
    }

    /**
     * Set 数据权限信息集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataPolicyInfo 数据权限信息集合
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
     * Get 绑定到该用户的工作组集合信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkGroupInfo 绑定到该用户的工作组集合信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkGroups getWorkGroupInfo() {
        return this.WorkGroupInfo;
    }

    /**
     * Set 绑定到该用户的工作组集合信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkGroupInfo 绑定到该用户的工作组集合信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkGroupInfo(WorkGroups WorkGroupInfo) {
        this.WorkGroupInfo = WorkGroupInfo;
    }

    /**
     * Get 用户别名 
     * @return UserAlias 用户别名
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set 用户别名
     * @param UserAlias 用户别名
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get 行过滤集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowFilterInfo 行过滤集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Policys getRowFilterInfo() {
        return this.RowFilterInfo;
    }

    /**
     * Set 行过滤集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowFilterInfo 行过滤集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowFilterInfo(Policys RowFilterInfo) {
        this.RowFilterInfo = RowFilterInfo;
    }

    /**
     * Get 账号类型 
     * @return AccountType 账号类型
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 账号类型
     * @param AccountType 账号类型
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 数据源权限集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogPolicyInfo 数据源权限集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Policys getCatalogPolicyInfo() {
        return this.CatalogPolicyInfo;
    }

    /**
     * Set 数据源权限集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogPolicyInfo 数据源权限集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogPolicyInfo(Policys CatalogPolicyInfo) {
        this.CatalogPolicyInfo = CatalogPolicyInfo;
    }

    /**
     * Get 模型权限集合 
     * @return ModelPolicyInfo 模型权限集合
     */
    public Policys getModelPolicyInfo() {
        return this.ModelPolicyInfo;
    }

    /**
     * Set 模型权限集合
     * @param ModelPolicyInfo 模型权限集合
     */
    public void setModelPolicyInfo(Policys ModelPolicyInfo) {
        this.ModelPolicyInfo = ModelPolicyInfo;
    }

    public UserDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDetailInfo(UserDetailInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.UserDescription != null) {
            this.UserDescription = new String(source.UserDescription);
        }
        if (source.DataPolicyInfo != null) {
            this.DataPolicyInfo = new Policys(source.DataPolicyInfo);
        }
        if (source.EnginePolicyInfo != null) {
            this.EnginePolicyInfo = new Policys(source.EnginePolicyInfo);
        }
        if (source.WorkGroupInfo != null) {
            this.WorkGroupInfo = new WorkGroups(source.WorkGroupInfo);
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
        if (source.RowFilterInfo != null) {
            this.RowFilterInfo = new Policys(source.RowFilterInfo);
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
        if (source.CatalogPolicyInfo != null) {
            this.CatalogPolicyInfo = new Policys(source.CatalogPolicyInfo);
        }
        if (source.ModelPolicyInfo != null) {
            this.ModelPolicyInfo = new Policys(source.ModelPolicyInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserDescription", this.UserDescription);
        this.setParamObj(map, prefix + "DataPolicyInfo.", this.DataPolicyInfo);
        this.setParamObj(map, prefix + "EnginePolicyInfo.", this.EnginePolicyInfo);
        this.setParamObj(map, prefix + "WorkGroupInfo.", this.WorkGroupInfo);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);
        this.setParamObj(map, prefix + "RowFilterInfo.", this.RowFilterInfo);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamObj(map, prefix + "CatalogPolicyInfo.", this.CatalogPolicyInfo);
        this.setParamObj(map, prefix + "ModelPolicyInfo.", this.ModelPolicyInfo);

    }
}

