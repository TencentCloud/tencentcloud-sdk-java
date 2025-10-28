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
    * 实例ID，形如postgres-lnp6j617
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 账号
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 账号备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 账号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，5-锁定中，-1-删除中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 账号创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 账号最后一次更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 账号密码最近一次修改时间。

此字段只在2025-10-31后才生效，之前无论是否修改密码，该值统一为默认值：0000-00-00 00:00:00
同时仅通过云API或者管控控制台修改密码，才会更新该字段。
    */
    @SerializedName("PasswordUpdateTime")
    @Expose
    private String PasswordUpdateTime;

    /**
    * 账号类型。支持normal、tencentDBSuper。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 用户账号是否启用CAM验证
    */
    @SerializedName("OpenCam")
    @Expose
    private Boolean OpenCam;

    /**
     * Get 实例ID，形如postgres-lnp6j617 
     * @return DBInstanceId 实例ID，形如postgres-lnp6j617
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID，形如postgres-lnp6j617
     * @param DBInstanceId 实例ID，形如postgres-lnp6j617
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 账号 
     * @return UserName 账号
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 账号
     * @param UserName 账号
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 账号备注 
     * @return Remark 账号备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 账号备注
     * @param Remark 账号备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 账号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，5-锁定中，-1-删除中 
     * @return Status 账号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，5-锁定中，-1-删除中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 账号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，5-锁定中，-1-删除中
     * @param Status 账号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，5-锁定中，-1-删除中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 账号创建时间 
     * @return CreateTime 账号创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 账号创建时间
     * @param CreateTime 账号创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 账号最后一次更新时间 
     * @return UpdateTime 账号最后一次更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 账号最后一次更新时间
     * @param UpdateTime 账号最后一次更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 账号密码最近一次修改时间。

此字段只在2025-10-31后才生效，之前无论是否修改密码，该值统一为默认值：0000-00-00 00:00:00
同时仅通过云API或者管控控制台修改密码，才会更新该字段。 
     * @return PasswordUpdateTime 账号密码最近一次修改时间。

此字段只在2025-10-31后才生效，之前无论是否修改密码，该值统一为默认值：0000-00-00 00:00:00
同时仅通过云API或者管控控制台修改密码，才会更新该字段。
     */
    public String getPasswordUpdateTime() {
        return this.PasswordUpdateTime;
    }

    /**
     * Set 账号密码最近一次修改时间。

此字段只在2025-10-31后才生效，之前无论是否修改密码，该值统一为默认值：0000-00-00 00:00:00
同时仅通过云API或者管控控制台修改密码，才会更新该字段。
     * @param PasswordUpdateTime 账号密码最近一次修改时间。

此字段只在2025-10-31后才生效，之前无论是否修改密码，该值统一为默认值：0000-00-00 00:00:00
同时仅通过云API或者管控控制台修改密码，才会更新该字段。
     */
    public void setPasswordUpdateTime(String PasswordUpdateTime) {
        this.PasswordUpdateTime = PasswordUpdateTime;
    }

    /**
     * Get 账号类型。支持normal、tencentDBSuper。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。 
     * @return UserType 账号类型。支持normal、tencentDBSuper。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 账号类型。支持normal、tencentDBSuper。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。
     * @param UserType 账号类型。支持normal、tencentDBSuper。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 用户账号是否启用CAM验证 
     * @return OpenCam 用户账号是否启用CAM验证
     */
    public Boolean getOpenCam() {
        return this.OpenCam;
    }

    /**
     * Set 用户账号是否启用CAM验证
     * @param OpenCam 用户账号是否启用CAM验证
     */
    public void setOpenCam(Boolean OpenCam) {
        this.OpenCam = OpenCam;
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

    }
}

