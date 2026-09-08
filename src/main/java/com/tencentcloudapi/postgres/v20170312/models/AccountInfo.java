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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountInfo extends AbstractModel {

    /**
    * <p>实例ID，形如postgres-lnp6j617</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>账号</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>账号备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>账号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，5-锁定中，-1-删除中</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>账号创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>账号最后一次更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>账号密码最近一次修改时间。</p><p>此字段只在2025-10-31后才生效，之前无论是否修改密码，该值统一为默认值：0000-00-00 00:00:00<br>同时仅通过云API或者管控控制台修改密码，才会更新该字段。</p>
    */
    @SerializedName("PasswordUpdateTime")
    @Expose
    private String PasswordUpdateTime;

    /**
    * <p>账号类型。支持normal、tencentDBSuper。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。</p>
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * <p>用户账号是否启用CAM验证</p>
    */
    @SerializedName("OpenCam")
    @Expose
    private Boolean OpenCam;

    /**
    * <p>该账号实际加入了哪些预设角色</p>
    */
    @SerializedName("PGRoles")
    @Expose
    private String [] PGRoles;

    /**
     * Get <p>实例ID，形如postgres-lnp6j617</p> 
     * @return DBInstanceId <p>实例ID，形如postgres-lnp6j617</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例ID，形如postgres-lnp6j617</p>
     * @param DBInstanceId <p>实例ID，形如postgres-lnp6j617</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>账号</p> 
     * @return UserName <p>账号</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>账号</p>
     * @param UserName <p>账号</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>账号备注</p> 
     * @return Remark <p>账号备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>账号备注</p>
     * @param Remark <p>账号备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>账号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，5-锁定中，-1-删除中</p> 
     * @return Status <p>账号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，5-锁定中，-1-删除中</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>账号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，5-锁定中，-1-删除中</p>
     * @param Status <p>账号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，5-锁定中，-1-删除中</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>账号创建时间</p> 
     * @return CreateTime <p>账号创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>账号创建时间</p>
     * @param CreateTime <p>账号创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>账号最后一次更新时间</p> 
     * @return UpdateTime <p>账号最后一次更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>账号最后一次更新时间</p>
     * @param UpdateTime <p>账号最后一次更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>账号密码最近一次修改时间。</p><p>此字段只在2025-10-31后才生效，之前无论是否修改密码，该值统一为默认值：0000-00-00 00:00:00<br>同时仅通过云API或者管控控制台修改密码，才会更新该字段。</p> 
     * @return PasswordUpdateTime <p>账号密码最近一次修改时间。</p><p>此字段只在2025-10-31后才生效，之前无论是否修改密码，该值统一为默认值：0000-00-00 00:00:00<br>同时仅通过云API或者管控控制台修改密码，才会更新该字段。</p>
     */
    public String getPasswordUpdateTime() {
        return this.PasswordUpdateTime;
    }

    /**
     * Set <p>账号密码最近一次修改时间。</p><p>此字段只在2025-10-31后才生效，之前无论是否修改密码，该值统一为默认值：0000-00-00 00:00:00<br>同时仅通过云API或者管控控制台修改密码，才会更新该字段。</p>
     * @param PasswordUpdateTime <p>账号密码最近一次修改时间。</p><p>此字段只在2025-10-31后才生效，之前无论是否修改密码，该值统一为默认值：0000-00-00 00:00:00<br>同时仅通过云API或者管控控制台修改密码，才会更新该字段。</p>
     */
    public void setPasswordUpdateTime(String PasswordUpdateTime) {
        this.PasswordUpdateTime = PasswordUpdateTime;
    }

    /**
     * Get <p>账号类型。支持normal、tencentDBSuper。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。</p> 
     * @return UserType <p>账号类型。支持normal、tencentDBSuper。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。</p>
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>账号类型。支持normal、tencentDBSuper。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。</p>
     * @param UserType <p>账号类型。支持normal、tencentDBSuper。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。</p>
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get <p>用户账号是否启用CAM验证</p> 
     * @return OpenCam <p>用户账号是否启用CAM验证</p>
     */
    public Boolean getOpenCam() {
        return this.OpenCam;
    }

    /**
     * Set <p>用户账号是否启用CAM验证</p>
     * @param OpenCam <p>用户账号是否启用CAM验证</p>
     */
    public void setOpenCam(Boolean OpenCam) {
        this.OpenCam = OpenCam;
    }

    /**
     * Get <p>该账号实际加入了哪些预设角色</p> 
     * @return PGRoles <p>该账号实际加入了哪些预设角色</p>
     */
    public String [] getPGRoles() {
        return this.PGRoles;
    }

    /**
     * Set <p>该账号实际加入了哪些预设角色</p>
     * @param PGRoles <p>该账号实际加入了哪些预设角色</p>
     */
    public void setPGRoles(String [] PGRoles) {
        this.PGRoles = PGRoles;
    }

    public AccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountInfo(AccountInfo source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.PasswordUpdateTime != null) {
            this.PasswordUpdateTime = new String(source.PasswordUpdateTime);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.OpenCam != null) {
            this.OpenCam = new Boolean(source.OpenCam);
        }
        if (source.PGRoles != null) {
            this.PGRoles = new String[source.PGRoles.length];
            for (int i = 0; i < source.PGRoles.length; i++) {
                this.PGRoles[i] = new String(source.PGRoles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PasswordUpdateTime", this.PasswordUpdateTime);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "OpenCam", this.OpenCam);
        this.setParamArraySimple(map, prefix + "PGRoles.", this.PGRoles);

    }
}

