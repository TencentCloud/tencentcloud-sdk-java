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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountInfo  extends AbstractModel{

    /**
    * 实例ID，形如postgres-lnp6j617
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 帐号
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 帐号备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 帐号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，-1-删除中
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 帐号创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 帐号最后一次更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * 获取实例ID，形如postgres-lnp6j617
     * @return DBInstanceId 实例ID，形如postgres-lnp6j617
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * 设置实例ID，形如postgres-lnp6j617
     * @param DBInstanceId 实例ID，形如postgres-lnp6j617
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * 获取帐号
     * @return UserName 帐号
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置帐号
     * @param UserName 帐号
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取帐号备注
     * @return Remark 帐号备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * 设置帐号备注
     * @param Remark 帐号备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * 获取帐号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，-1-删除中
     * @return Status 帐号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，-1-删除中
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置帐号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，-1-删除中
     * @param Status 帐号状态。 1-创建中，2-正常，3-修改中，4-密码重置中，-1-删除中
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取帐号创建时间
     * @return CreateTime 帐号创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置帐号创建时间
     * @param CreateTime 帐号创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取帐号最后一次更新时间
     * @return UpdateTime 帐号最后一次更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置帐号最后一次更新时间
     * @param UpdateTime 帐号最后一次更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

