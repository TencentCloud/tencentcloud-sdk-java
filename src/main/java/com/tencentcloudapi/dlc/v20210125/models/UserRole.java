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

public class UserRole extends AbstractModel{

    /**
    * 角色ID
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * 用户app ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 角色权限
    */
    @SerializedName("Arn")
    @Expose
    private String Arn;

    /**
    * 最近修改时间戳
    */
    @SerializedName("ModifyTime")
    @Expose
    private Long ModifyTime;

    /**
    * 角色描述信息
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 角色名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * cos授权路径列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosPermissionList")
    @Expose
    private CosPermission [] CosPermissionList;

    /**
    * cam策略json
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PermissionJson")
    @Expose
    private String PermissionJson;

    /**
     * Get 角色ID 
     * @return RoleId 角色ID
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色ID
     * @param RoleId 角色ID
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 用户app ID 
     * @return AppId 用户app ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户app ID
     * @param AppId 用户app ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户ID 
     * @return Uin 用户ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户ID
     * @param Uin 用户ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 角色权限 
     * @return Arn 角色权限
     */
    public String getArn() {
        return this.Arn;
    }

    /**
     * Set 角色权限
     * @param Arn 角色权限
     */
    public void setArn(String Arn) {
        this.Arn = Arn;
    }

    /**
     * Get 最近修改时间戳 
     * @return ModifyTime 最近修改时间戳
     */
    public Long getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最近修改时间戳
     * @param ModifyTime 最近修改时间戳
     */
    public void setModifyTime(Long ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 角色描述信息 
     * @return Desc 角色描述信息
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 角色描述信息
     * @param Desc 角色描述信息
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 角色名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleName 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleName 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get cos授权路径列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosPermissionList cos授权路径列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosPermission [] getCosPermissionList() {
        return this.CosPermissionList;
    }

    /**
     * Set cos授权路径列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosPermissionList cos授权路径列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosPermissionList(CosPermission [] CosPermissionList) {
        this.CosPermissionList = CosPermissionList;
    }

    /**
     * Get cam策略json
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PermissionJson cam策略json
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPermissionJson() {
        return this.PermissionJson;
    }

    /**
     * Set cam策略json
注意：此字段可能返回 null，表示取不到有效值。
     * @param PermissionJson cam策略json
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermissionJson(String PermissionJson) {
        this.PermissionJson = PermissionJson;
    }

    public UserRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserRole(UserRole source) {
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Arn != null) {
            this.Arn = new String(source.Arn);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new Long(source.ModifyTime);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CosPermissionList != null) {
            this.CosPermissionList = new CosPermission[source.CosPermissionList.length];
            for (int i = 0; i < source.CosPermissionList.length; i++) {
                this.CosPermissionList[i] = new CosPermission(source.CosPermissionList[i]);
            }
        }
        if (source.PermissionJson != null) {
            this.PermissionJson = new String(source.PermissionJson);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Arn", this.Arn);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamArrayObj(map, prefix + "CosPermissionList.", this.CosPermissionList);
        this.setParamSimple(map, prefix + "PermissionJson", this.PermissionJson);

    }
}

