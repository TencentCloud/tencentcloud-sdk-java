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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleItem extends AbstractModel {

    /**
    * 角色名称
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 是否开启消费
    */
    @SerializedName("PermRead")
    @Expose
    private Boolean PermRead;

    /**
    * 是否开启生产
    */
    @SerializedName("PermWrite")
    @Expose
    private Boolean PermWrite;

    /**
    * Access Key
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * Secret Key
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 角色的创建时间，**Unix时间戳（毫秒）**
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * 角色的更新时间，**Unix时间戳（毫秒）**
    */
    @SerializedName("ModifiedTime")
    @Expose
    private Long ModifiedTime;

    /**
    * 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别）
    */
    @SerializedName("PermType")
    @Expose
    private String PermType;

    /**
    * Topic和Group维度权限配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailedRolePerms")
    @Expose
    private DetailedRolePerm [] DetailedRolePerms;

    /**
     * Get 角色名称 
     * @return RoleName 角色名称
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称
     * @param RoleName 角色名称
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 是否开启消费 
     * @return PermRead 是否开启消费
     */
    public Boolean getPermRead() {
        return this.PermRead;
    }

    /**
     * Set 是否开启消费
     * @param PermRead 是否开启消费
     */
    public void setPermRead(Boolean PermRead) {
        this.PermRead = PermRead;
    }

    /**
     * Get 是否开启生产 
     * @return PermWrite 是否开启生产
     */
    public Boolean getPermWrite() {
        return this.PermWrite;
    }

    /**
     * Set 是否开启生产
     * @param PermWrite 是否开启生产
     */
    public void setPermWrite(Boolean PermWrite) {
        this.PermWrite = PermWrite;
    }

    /**
     * Get Access Key 
     * @return AccessKey Access Key
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set Access Key
     * @param AccessKey Access Key
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get Secret Key 
     * @return SecretKey Secret Key
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Secret Key
     * @param SecretKey Secret Key
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 角色的创建时间，**Unix时间戳（毫秒）** 
     * @return CreatedTime 角色的创建时间，**Unix时间戳（毫秒）**
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 角色的创建时间，**Unix时间戳（毫秒）**
     * @param CreatedTime 角色的创建时间，**Unix时间戳（毫秒）**
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 角色的更新时间，**Unix时间戳（毫秒）** 
     * @return ModifiedTime 角色的更新时间，**Unix时间戳（毫秒）**
     */
    public Long getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 角色的更新时间，**Unix时间戳（毫秒）**
     * @param ModifiedTime 角色的更新时间，**Unix时间戳（毫秒）**
     */
    public void setModifiedTime(Long ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别） 
     * @return PermType 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别）
     */
    public String getPermType() {
        return this.PermType;
    }

    /**
     * Set 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别）
     * @param PermType 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别）
     */
    public void setPermType(String PermType) {
        this.PermType = PermType;
    }

    /**
     * Get Topic和Group维度权限配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailedRolePerms Topic和Group维度权限配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailedRolePerm [] getDetailedRolePerms() {
        return this.DetailedRolePerms;
    }

    /**
     * Set Topic和Group维度权限配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailedRolePerms Topic和Group维度权限配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailedRolePerms(DetailedRolePerm [] DetailedRolePerms) {
        this.DetailedRolePerms = DetailedRolePerms;
    }

    public RoleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleItem(RoleItem source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.PermRead != null) {
            this.PermRead = new Boolean(source.PermRead);
        }
        if (source.PermWrite != null) {
            this.PermWrite = new Boolean(source.PermWrite);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new Long(source.ModifiedTime);
        }
        if (source.PermType != null) {
            this.PermType = new String(source.PermType);
        }
        if (source.DetailedRolePerms != null) {
            this.DetailedRolePerms = new DetailedRolePerm[source.DetailedRolePerms.length];
            for (int i = 0; i < source.DetailedRolePerms.length; i++) {
                this.DetailedRolePerms[i] = new DetailedRolePerm(source.DetailedRolePerms[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "PermRead", this.PermRead);
        this.setParamSimple(map, prefix + "PermWrite", this.PermWrite);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "PermType", this.PermType);
        this.setParamArrayObj(map, prefix + "DetailedRolePerms.", this.DetailedRolePerms);

    }
}

