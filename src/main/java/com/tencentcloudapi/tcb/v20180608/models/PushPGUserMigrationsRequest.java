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

public class PushPGUserMigrationsRequest extends AbstractModel {

    /**
    * <p>云开发环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>结构化 SQL migration 列表；每项包含 Query SQL 内容</p>
    */
    @SerializedName("Migrations")
    @Expose
    private MigrationInput [] Migrations;

    /**
    * <p>等待获取数据库锁的最长时间</p><p>单位：毫秒</p><p>默认值：5000</p>
    */
    @SerializedName("LockTimeoutMs")
    @Expose
    private Long LockTimeoutMs;

    /**
    * <p>单条 SQL 执行最长时间，超过后由 PostgreSQL 取消该语句</p><p>单位：毫秒</p><p>默认值：300000</p>
    */
    @SerializedName("StatementTimeoutMs")
    @Expose
    private Long StatementTimeoutMs;

    /**
    * <p>标记请求来源</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

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
     * Get <p>结构化 SQL migration 列表；每项包含 Query SQL 内容</p> 
     * @return Migrations <p>结构化 SQL migration 列表；每项包含 Query SQL 内容</p>
     */
    public MigrationInput [] getMigrations() {
        return this.Migrations;
    }

    /**
     * Set <p>结构化 SQL migration 列表；每项包含 Query SQL 内容</p>
     * @param Migrations <p>结构化 SQL migration 列表；每项包含 Query SQL 内容</p>
     */
    public void setMigrations(MigrationInput [] Migrations) {
        this.Migrations = Migrations;
    }

    /**
     * Get <p>等待获取数据库锁的最长时间</p><p>单位：毫秒</p><p>默认值：5000</p> 
     * @return LockTimeoutMs <p>等待获取数据库锁的最长时间</p><p>单位：毫秒</p><p>默认值：5000</p>
     */
    public Long getLockTimeoutMs() {
        return this.LockTimeoutMs;
    }

    /**
     * Set <p>等待获取数据库锁的最长时间</p><p>单位：毫秒</p><p>默认值：5000</p>
     * @param LockTimeoutMs <p>等待获取数据库锁的最长时间</p><p>单位：毫秒</p><p>默认值：5000</p>
     */
    public void setLockTimeoutMs(Long LockTimeoutMs) {
        this.LockTimeoutMs = LockTimeoutMs;
    }

    /**
     * Get <p>单条 SQL 执行最长时间，超过后由 PostgreSQL 取消该语句</p><p>单位：毫秒</p><p>默认值：300000</p> 
     * @return StatementTimeoutMs <p>单条 SQL 执行最长时间，超过后由 PostgreSQL 取消该语句</p><p>单位：毫秒</p><p>默认值：300000</p>
     */
    public Long getStatementTimeoutMs() {
        return this.StatementTimeoutMs;
    }

    /**
     * Set <p>单条 SQL 执行最长时间，超过后由 PostgreSQL 取消该语句</p><p>单位：毫秒</p><p>默认值：300000</p>
     * @param StatementTimeoutMs <p>单条 SQL 执行最长时间，超过后由 PostgreSQL 取消该语句</p><p>单位：毫秒</p><p>默认值：300000</p>
     */
    public void setStatementTimeoutMs(Long StatementTimeoutMs) {
        this.StatementTimeoutMs = StatementTimeoutMs;
    }

    /**
     * Get <p>标记请求来源</p> 
     * @return Source <p>标记请求来源</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>标记请求来源</p>
     * @param Source <p>标记请求来源</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public PushPGUserMigrationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PushPGUserMigrationsRequest(PushPGUserMigrationsRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Migrations != null) {
            this.Migrations = new MigrationInput[source.Migrations.length];
            for (int i = 0; i < source.Migrations.length; i++) {
                this.Migrations[i] = new MigrationInput(source.Migrations[i]);
            }
        }
        if (source.LockTimeoutMs != null) {
            this.LockTimeoutMs = new Long(source.LockTimeoutMs);
        }
        if (source.StatementTimeoutMs != null) {
            this.StatementTimeoutMs = new Long(source.StatementTimeoutMs);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArrayObj(map, prefix + "Migrations.", this.Migrations);
        this.setParamSimple(map, prefix + "LockTimeoutMs", this.LockTimeoutMs);
        this.setParamSimple(map, prefix + "StatementTimeoutMs", this.StatementTimeoutMs);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

