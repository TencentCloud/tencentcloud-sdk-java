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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RepairPGUserMigrationHistoryRequest extends AbstractModel {

    /**
    * <p>云开发环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>migration版本</p><p>参数格式：14位时间格式</p><p>入参限制：纯数字</p>
    */
    @SerializedName("MigrationVersion")
    @Expose
    private String MigrationVersion;

    /**
    * <p>migration 版本名</p><p>入参限制：限制小写字母和下划线</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>状态</p><p>枚举值：</p><ul><li>applied： 已应用</li><li>reverted： 表示删除 history 记录</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>修复原因</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>applied的时候填写，记录应用的sql语句</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get <p>云开发环境ID</p> 
     * @return EnvId <p>云开发环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>云开发环境ID</p>
     * @param EnvId <p>云开发环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>migration版本</p><p>参数格式：14位时间格式</p><p>入参限制：纯数字</p> 
     * @return MigrationVersion <p>migration版本</p><p>参数格式：14位时间格式</p><p>入参限制：纯数字</p>
     */
    public String getMigrationVersion() {
        return this.MigrationVersion;
    }

    /**
     * Set <p>migration版本</p><p>参数格式：14位时间格式</p><p>入参限制：纯数字</p>
     * @param MigrationVersion <p>migration版本</p><p>参数格式：14位时间格式</p><p>入参限制：纯数字</p>
     */
    public void setMigrationVersion(String MigrationVersion) {
        this.MigrationVersion = MigrationVersion;
    }

    /**
     * Get <p>migration 版本名</p><p>入参限制：限制小写字母和下划线</p> 
     * @return Name <p>migration 版本名</p><p>入参限制：限制小写字母和下划线</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>migration 版本名</p><p>入参限制：限制小写字母和下划线</p>
     * @param Name <p>migration 版本名</p><p>入参限制：限制小写字母和下划线</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>状态</p><p>枚举值：</p><ul><li>applied： 已应用</li><li>reverted： 表示删除 history 记录</li></ul> 
     * @return Status <p>状态</p><p>枚举值：</p><ul><li>applied： 已应用</li><li>reverted： 表示删除 history 记录</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p><p>枚举值：</p><ul><li>applied： 已应用</li><li>reverted： 表示删除 history 记录</li></ul>
     * @param Status <p>状态</p><p>枚举值：</p><ul><li>applied： 已应用</li><li>reverted： 表示删除 history 记录</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>修复原因</p> 
     * @return Reason <p>修复原因</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>修复原因</p>
     * @param Reason <p>修复原因</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>applied的时候填写，记录应用的sql语句</p> 
     * @return Query <p>applied的时候填写，记录应用的sql语句</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>applied的时候填写，记录应用的sql语句</p>
     * @param Query <p>applied的时候填写，记录应用的sql语句</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public RepairPGUserMigrationHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepairPGUserMigrationHistoryRequest(RepairPGUserMigrationHistoryRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.MigrationVersion != null) {
            this.MigrationVersion = new String(source.MigrationVersion);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "MigrationVersion", this.MigrationVersion);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

