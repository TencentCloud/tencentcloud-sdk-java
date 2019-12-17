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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Account extends AbstractModel{

    /**
    * 唯一ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 云镜客户端唯一Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机内网IP。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机名称。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 帐号名。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 帐号所属组。
    */
    @SerializedName("Groups")
    @Expose
    private String Groups;

    /**
    * 帐号类型。
<li>ORDINARY：普通帐号</li>
<li>SUPPER：超级管理员帐号</li>
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * 帐号创建时间。
    */
    @SerializedName("AccountCreateTime")
    @Expose
    private String AccountCreateTime;

    /**
    * 帐号最后登录时间。
    */
    @SerializedName("LastLoginTime")
    @Expose
    private String LastLoginTime;

    /**
     * Get 唯一ID。 
     * @return Id 唯一ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 唯一ID。
     * @param Id 唯一ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 云镜客户端唯一Uuid 
     * @return Uuid 云镜客户端唯一Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 云镜客户端唯一Uuid
     * @param Uuid 云镜客户端唯一Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机内网IP。 
     * @return MachineIp 主机内网IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机内网IP。
     * @param MachineIp 主机内网IP。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 主机名称。 
     * @return MachineName 主机名称。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名称。
     * @param MachineName 主机名称。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 帐号名。 
     * @return Username 帐号名。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 帐号名。
     * @param Username 帐号名。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 帐号所属组。 
     * @return Groups 帐号所属组。
     */
    public String getGroups() {
        return this.Groups;
    }

    /**
     * Set 帐号所属组。
     * @param Groups 帐号所属组。
     */
    public void setGroups(String Groups) {
        this.Groups = Groups;
    }

    /**
     * Get 帐号类型。
<li>ORDINARY：普通帐号</li>
<li>SUPPER：超级管理员帐号</li> 
     * @return Privilege 帐号类型。
<li>ORDINARY：普通帐号</li>
<li>SUPPER：超级管理员帐号</li>
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 帐号类型。
<li>ORDINARY：普通帐号</li>
<li>SUPPER：超级管理员帐号</li>
     * @param Privilege 帐号类型。
<li>ORDINARY：普通帐号</li>
<li>SUPPER：超级管理员帐号</li>
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get 帐号创建时间。 
     * @return AccountCreateTime 帐号创建时间。
     */
    public String getAccountCreateTime() {
        return this.AccountCreateTime;
    }

    /**
     * Set 帐号创建时间。
     * @param AccountCreateTime 帐号创建时间。
     */
    public void setAccountCreateTime(String AccountCreateTime) {
        this.AccountCreateTime = AccountCreateTime;
    }

    /**
     * Get 帐号最后登录时间。 
     * @return LastLoginTime 帐号最后登录时间。
     */
    public String getLastLoginTime() {
        return this.LastLoginTime;
    }

    /**
     * Set 帐号最后登录时间。
     * @param LastLoginTime 帐号最后登录时间。
     */
    public void setLastLoginTime(String LastLoginTime) {
        this.LastLoginTime = LastLoginTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Groups", this.Groups);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "AccountCreateTime", this.AccountCreateTime);
        this.setParamSimple(map, prefix + "LastLoginTime", this.LastLoginTime);

    }
}

