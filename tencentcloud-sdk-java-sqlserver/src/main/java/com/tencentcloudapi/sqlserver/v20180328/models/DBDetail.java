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

public class DBDetail extends AbstractModel{

    /**
    * 数据库名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字符集
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 数据库创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 数据库状态。1--创建中， 2--运行中， 3--修改中，-1--删除中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 数据库账号权限信息
    */
    @SerializedName("Accounts")
    @Expose
    private AccountPrivilege [] Accounts;

    /**
    * 内部状态。ONLINE表示运行中
    */
    @SerializedName("InternalStatus")
    @Expose
    private String InternalStatus;

    /**
     * Get 数据库名称 
     * @return Name 数据库名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据库名称
     * @param Name 数据库名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字符集 
     * @return Charset 字符集
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set 字符集
     * @param Charset 字符集
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 数据库创建时间 
     * @return CreateTime 数据库创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 数据库创建时间
     * @param CreateTime 数据库创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 数据库状态。1--创建中， 2--运行中， 3--修改中，-1--删除中 
     * @return Status 数据库状态。1--创建中， 2--运行中， 3--修改中，-1--删除中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 数据库状态。1--创建中， 2--运行中， 3--修改中，-1--删除中
     * @param Status 数据库状态。1--创建中， 2--运行中， 3--修改中，-1--删除中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 数据库账号权限信息 
     * @return Accounts 数据库账号权限信息
     */
    public AccountPrivilege [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set 数据库账号权限信息
     * @param Accounts 数据库账号权限信息
     */
    public void setAccounts(AccountPrivilege [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get 内部状态。ONLINE表示运行中 
     * @return InternalStatus 内部状态。ONLINE表示运行中
     */
    public String getInternalStatus() {
        return this.InternalStatus;
    }

    /**
     * Set 内部状态。ONLINE表示运行中
     * @param InternalStatus 内部状态。ONLINE表示运行中
     */
    public void setInternalStatus(String InternalStatus) {
        this.InternalStatus = InternalStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamSimple(map, prefix + "InternalStatus", this.InternalStatus);

    }
}

