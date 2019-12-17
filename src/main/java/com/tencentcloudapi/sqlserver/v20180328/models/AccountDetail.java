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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountDetail extends AbstractModel{

    /**
    * 账户名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 账户备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 账户创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 账户状态，1-创建中，2-正常，3-修改中，4-密码重置中，-1-删除中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 账户更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 密码更新时间
    */
    @SerializedName("PassTime")
    @Expose
    private String PassTime;

    /**
    * 账户内部状态，正常为enable
    */
    @SerializedName("InternalStatus")
    @Expose
    private String InternalStatus;

    /**
    * 该账户对相关db的读写权限信息
    */
    @SerializedName("Dbs")
    @Expose
    private DBPrivilege [] Dbs;

    /**
     * Get 账户名 
     * @return Name 账户名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 账户名
     * @param Name 账户名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 账户备注 
     * @return Remark 账户备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 账户备注
     * @param Remark 账户备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 账户创建时间 
     * @return CreateTime 账户创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 账户创建时间
     * @param CreateTime 账户创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 账户状态，1-创建中，2-正常，3-修改中，4-密码重置中，-1-删除中 
     * @return Status 账户状态，1-创建中，2-正常，3-修改中，4-密码重置中，-1-删除中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 账户状态，1-创建中，2-正常，3-修改中，4-密码重置中，-1-删除中
     * @param Status 账户状态，1-创建中，2-正常，3-修改中，4-密码重置中，-1-删除中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 账户更新时间 
     * @return UpdateTime 账户更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 账户更新时间
     * @param UpdateTime 账户更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 密码更新时间 
     * @return PassTime 密码更新时间
     */
    public String getPassTime() {
        return this.PassTime;
    }

    /**
     * Set 密码更新时间
     * @param PassTime 密码更新时间
     */
    public void setPassTime(String PassTime) {
        this.PassTime = PassTime;
    }

    /**
     * Get 账户内部状态，正常为enable 
     * @return InternalStatus 账户内部状态，正常为enable
     */
    public String getInternalStatus() {
        return this.InternalStatus;
    }

    /**
     * Set 账户内部状态，正常为enable
     * @param InternalStatus 账户内部状态，正常为enable
     */
    public void setInternalStatus(String InternalStatus) {
        this.InternalStatus = InternalStatus;
    }

    /**
     * Get 该账户对相关db的读写权限信息 
     * @return Dbs 该账户对相关db的读写权限信息
     */
    public DBPrivilege [] getDbs() {
        return this.Dbs;
    }

    /**
     * Set 该账户对相关db的读写权限信息
     * @param Dbs 该账户对相关db的读写权限信息
     */
    public void setDbs(DBPrivilege [] Dbs) {
        this.Dbs = Dbs;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PassTime", this.PassTime);
        this.setParamSimple(map, prefix + "InternalStatus", this.InternalStatus);
        this.setParamArrayObj(map, prefix + "Dbs.", this.Dbs);

    }
}

