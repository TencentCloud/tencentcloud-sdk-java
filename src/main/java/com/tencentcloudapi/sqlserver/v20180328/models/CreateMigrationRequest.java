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

public class CreateMigrationRequest  extends AbstractModel{

    /**
    * 迁移任务的名称
    */
    @SerializedName("MigrateName")
    @Expose
    private String MigrateName;

    /**
    * 迁移类型（1:结构迁移 2:数据迁移 3:增量同步）
    */
    @SerializedName("MigrateType")
    @Expose
    private Integer MigrateType;

    /**
    * 迁移源的类型 1:CDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式）
    */
    @SerializedName("SourceType")
    @Expose
    private Integer SourceType;

    /**
    * 迁移源
    */
    @SerializedName("Source")
    @Expose
    private MigrateSource Source;

    /**
    * 迁移目标
    */
    @SerializedName("Target")
    @Expose
    private MigrateTarget Target;

    /**
    * 迁移DB对象 ，离线迁移不使用（SourceType=4或SourceType=5）。
    */
    @SerializedName("MigrateDBSet")
    @Expose
    private MigrateDB [] MigrateDBSet;

    /**
     * 获取迁移任务的名称
     * @return MigrateName 迁移任务的名称
     */
    public String getMigrateName() {
        return this.MigrateName;
    }

    /**
     * 设置迁移任务的名称
     * @param MigrateName 迁移任务的名称
     */
    public void setMigrateName(String MigrateName) {
        this.MigrateName = MigrateName;
    }

    /**
     * 获取迁移类型（1:结构迁移 2:数据迁移 3:增量同步）
     * @return MigrateType 迁移类型（1:结构迁移 2:数据迁移 3:增量同步）
     */
    public Integer getMigrateType() {
        return this.MigrateType;
    }

    /**
     * 设置迁移类型（1:结构迁移 2:数据迁移 3:增量同步）
     * @param MigrateType 迁移类型（1:结构迁移 2:数据迁移 3:增量同步）
     */
    public void setMigrateType(Integer MigrateType) {
        this.MigrateType = MigrateType;
    }

    /**
     * 获取迁移源的类型 1:CDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式）
     * @return SourceType 迁移源的类型 1:CDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式）
     */
    public Integer getSourceType() {
        return this.SourceType;
    }

    /**
     * 设置迁移源的类型 1:CDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式）
     * @param SourceType 迁移源的类型 1:CDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式）
     */
    public void setSourceType(Integer SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * 获取迁移源
     * @return Source 迁移源
     */
    public MigrateSource getSource() {
        return this.Source;
    }

    /**
     * 设置迁移源
     * @param Source 迁移源
     */
    public void setSource(MigrateSource Source) {
        this.Source = Source;
    }

    /**
     * 获取迁移目标
     * @return Target 迁移目标
     */
    public MigrateTarget getTarget() {
        return this.Target;
    }

    /**
     * 设置迁移目标
     * @param Target 迁移目标
     */
    public void setTarget(MigrateTarget Target) {
        this.Target = Target;
    }

    /**
     * 获取迁移DB对象 ，离线迁移不使用（SourceType=4或SourceType=5）。
     * @return MigrateDBSet 迁移DB对象 ，离线迁移不使用（SourceType=4或SourceType=5）。
     */
    public MigrateDB [] getMigrateDBSet() {
        return this.MigrateDBSet;
    }

    /**
     * 设置迁移DB对象 ，离线迁移不使用（SourceType=4或SourceType=5）。
     * @param MigrateDBSet 迁移DB对象 ，离线迁移不使用（SourceType=4或SourceType=5）。
     */
    public void setMigrateDBSet(MigrateDB [] MigrateDBSet) {
        this.MigrateDBSet = MigrateDBSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MigrateName", this.MigrateName);
        this.setParamSimple(map, prefix + "MigrateType", this.MigrateType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamObj(map, prefix + "Source.", this.Source);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamArrayObj(map, prefix + "MigrateDBSet.", this.MigrateDBSet);

    }
}

