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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOnlineDDLJobRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 要执行的 DDL 语句。常用的在线DDL参考此API文档示例部分
    */
    @SerializedName("Alter")
    @Expose
    private String Alter;

    /**
    * 要修改的数据库	
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 要修改的表
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 指定账号执行DDL，需确保账号有 ALTER, CREATE, INSERT, UPDATE, DROP, DELETE, INDEX, CREATE TEMPORARY TABLES, LOCK TABLES, TRIGGER, REPLICATION CLIENT, REPLICATION SLAVE 等相关权限 （若不填写将默认使用系统账号）
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 指定账号的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 运行线程数大于此值时，将终止DDL。不填则默认58
    */
    @SerializedName("CriticalLoad")
    @Expose
    private Long CriticalLoad;

    /**
    * 是否检查自增字段。为1则不允许修改自增字段，0或不填写则不检查
    */
    @SerializedName("CheckAutoInc")
    @Expose
    private Long CheckAutoInc;

    /**
    * 允许的主备延迟时间(单位s)，0或不填写则不检查延迟
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * 是否使用pt-osc工具做DDL
    */
    @SerializedName("UsePt")
    @Expose
    private Long UsePt;

    /**
    * 开始执行时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 要执行的 DDL 语句。常用的在线DDL参考此API文档示例部分 
     * @return Alter 要执行的 DDL 语句。常用的在线DDL参考此API文档示例部分
     */
    public String getAlter() {
        return this.Alter;
    }

    /**
     * Set 要执行的 DDL 语句。常用的在线DDL参考此API文档示例部分
     * @param Alter 要执行的 DDL 语句。常用的在线DDL参考此API文档示例部分
     */
    public void setAlter(String Alter) {
        this.Alter = Alter;
    }

    /**
     * Get 要修改的数据库	 
     * @return DbName 要修改的数据库	
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 要修改的数据库	
     * @param DbName 要修改的数据库	
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 要修改的表 
     * @return Table 要修改的表
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 要修改的表
     * @param Table 要修改的表
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 指定账号执行DDL，需确保账号有 ALTER, CREATE, INSERT, UPDATE, DROP, DELETE, INDEX, CREATE TEMPORARY TABLES, LOCK TABLES, TRIGGER, REPLICATION CLIENT, REPLICATION SLAVE 等相关权限 （若不填写将默认使用系统账号） 
     * @return User 指定账号执行DDL，需确保账号有 ALTER, CREATE, INSERT, UPDATE, DROP, DELETE, INDEX, CREATE TEMPORARY TABLES, LOCK TABLES, TRIGGER, REPLICATION CLIENT, REPLICATION SLAVE 等相关权限 （若不填写将默认使用系统账号）
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 指定账号执行DDL，需确保账号有 ALTER, CREATE, INSERT, UPDATE, DROP, DELETE, INDEX, CREATE TEMPORARY TABLES, LOCK TABLES, TRIGGER, REPLICATION CLIENT, REPLICATION SLAVE 等相关权限 （若不填写将默认使用系统账号）
     * @param User 指定账号执行DDL，需确保账号有 ALTER, CREATE, INSERT, UPDATE, DROP, DELETE, INDEX, CREATE TEMPORARY TABLES, LOCK TABLES, TRIGGER, REPLICATION CLIENT, REPLICATION SLAVE 等相关权限 （若不填写将默认使用系统账号）
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 指定账号的密码 
     * @return Password 指定账号的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 指定账号的密码
     * @param Password 指定账号的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 运行线程数大于此值时，将终止DDL。不填则默认58 
     * @return CriticalLoad 运行线程数大于此值时，将终止DDL。不填则默认58
     */
    public Long getCriticalLoad() {
        return this.CriticalLoad;
    }

    /**
     * Set 运行线程数大于此值时，将终止DDL。不填则默认58
     * @param CriticalLoad 运行线程数大于此值时，将终止DDL。不填则默认58
     */
    public void setCriticalLoad(Long CriticalLoad) {
        this.CriticalLoad = CriticalLoad;
    }

    /**
     * Get 是否检查自增字段。为1则不允许修改自增字段，0或不填写则不检查 
     * @return CheckAutoInc 是否检查自增字段。为1则不允许修改自增字段，0或不填写则不检查
     */
    public Long getCheckAutoInc() {
        return this.CheckAutoInc;
    }

    /**
     * Set 是否检查自增字段。为1则不允许修改自增字段，0或不填写则不检查
     * @param CheckAutoInc 是否检查自增字段。为1则不允许修改自增字段，0或不填写则不检查
     */
    public void setCheckAutoInc(Long CheckAutoInc) {
        this.CheckAutoInc = CheckAutoInc;
    }

    /**
     * Get 允许的主备延迟时间(单位s)，0或不填写则不检查延迟 
     * @return MaxDelay 允许的主备延迟时间(单位s)，0或不填写则不检查延迟
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set 允许的主备延迟时间(单位s)，0或不填写则不检查延迟
     * @param MaxDelay 允许的主备延迟时间(单位s)，0或不填写则不检查延迟
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get 是否使用pt-osc工具做DDL 
     * @return UsePt 是否使用pt-osc工具做DDL
     */
    public Long getUsePt() {
        return this.UsePt;
    }

    /**
     * Set 是否使用pt-osc工具做DDL
     * @param UsePt 是否使用pt-osc工具做DDL
     */
    public void setUsePt(Long UsePt) {
        this.UsePt = UsePt;
    }

    /**
     * Get 开始执行时间 
     * @return StartTime 开始执行时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始执行时间
     * @param StartTime 开始执行时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public CreateOnlineDDLJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOnlineDDLJobRequest(CreateOnlineDDLJobRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Alter != null) {
            this.Alter = new String(source.Alter);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.CriticalLoad != null) {
            this.CriticalLoad = new Long(source.CriticalLoad);
        }
        if (source.CheckAutoInc != null) {
            this.CheckAutoInc = new Long(source.CheckAutoInc);
        }
        if (source.MaxDelay != null) {
            this.MaxDelay = new Long(source.MaxDelay);
        }
        if (source.UsePt != null) {
            this.UsePt = new Long(source.UsePt);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Alter", this.Alter);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "CriticalLoad", this.CriticalLoad);
        this.setParamSimple(map, prefix + "CheckAutoInc", this.CheckAutoInc);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "UsePt", this.UsePt);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

