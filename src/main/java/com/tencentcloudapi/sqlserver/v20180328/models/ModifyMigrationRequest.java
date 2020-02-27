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

public class ModifyMigrationRequest extends AbstractModel{

    /**
    * 迁移任务ID
    */
    @SerializedName("MigrateId")
    @Expose
    private Long MigrateId;

    /**
    * 新的迁移任务的名称，若不填则不修改
    */
    @SerializedName("MigrateName")
    @Expose
    private String MigrateName;

    /**
    * 新的迁移类型（1:结构迁移 2:数据迁移 3:增量同步），若不填则不修改
    */
    @SerializedName("MigrateType")
    @Expose
    private Long MigrateType;

    /**
    * 迁移源的类型 1:TencentDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式），若不填则不修改
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 迁移源，若不填则不修改
    */
    @SerializedName("Source")
    @Expose
    private MigrateSource Source;

    /**
    * 迁移目标，若不填则不修改
    */
    @SerializedName("Target")
    @Expose
    private MigrateTarget Target;

    /**
    * 迁移DB对象 ，离线迁移（SourceType=4或SourceType=5）不使用，若不填则不修改
    */
    @SerializedName("MigrateDBSet")
    @Expose
    private MigrateDB [] MigrateDBSet;

    /**
     * Get 迁移任务ID 
     * @return MigrateId 迁移任务ID
     */
    public Long getMigrateId() {
        return this.MigrateId;
    }

    /**
     * Set 迁移任务ID
     * @param MigrateId 迁移任务ID
     */
    public void setMigrateId(Long MigrateId) {
        this.MigrateId = MigrateId;
    }

    /**
     * Get 新的迁移任务的名称，若不填则不修改 
     * @return MigrateName 新的迁移任务的名称，若不填则不修改
     */
    public String getMigrateName() {
        return this.MigrateName;
    }

    /**
     * Set 新的迁移任务的名称，若不填则不修改
     * @param MigrateName 新的迁移任务的名称，若不填则不修改
     */
    public void setMigrateName(String MigrateName) {
        this.MigrateName = MigrateName;
    }

    /**
     * Get 新的迁移类型（1:结构迁移 2:数据迁移 3:增量同步），若不填则不修改 
     * @return MigrateType 新的迁移类型（1:结构迁移 2:数据迁移 3:增量同步），若不填则不修改
     */
    public Long getMigrateType() {
        return this.MigrateType;
    }

    /**
     * Set 新的迁移类型（1:结构迁移 2:数据迁移 3:增量同步），若不填则不修改
     * @param MigrateType 新的迁移类型（1:结构迁移 2:数据迁移 3:增量同步），若不填则不修改
     */
    public void setMigrateType(Long MigrateType) {
        this.MigrateType = MigrateType;
    }

    /**
     * Get 迁移源的类型 1:TencentDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式），若不填则不修改 
     * @return SourceType 迁移源的类型 1:TencentDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式），若不填则不修改
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 迁移源的类型 1:TencentDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式），若不填则不修改
     * @param SourceType 迁移源的类型 1:TencentDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式），若不填则不修改
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 迁移源，若不填则不修改 
     * @return Source 迁移源，若不填则不修改
     */
    public MigrateSource getSource() {
        return this.Source;
    }

    /**
     * Set 迁移源，若不填则不修改
     * @param Source 迁移源，若不填则不修改
     */
    public void setSource(MigrateSource Source) {
        this.Source = Source;
    }

    /**
     * Get 迁移目标，若不填则不修改 
     * @return Target 迁移目标，若不填则不修改
     */
    public MigrateTarget getTarget() {
        return this.Target;
    }

    /**
     * Set 迁移目标，若不填则不修改
     * @param Target 迁移目标，若不填则不修改
     */
    public void setTarget(MigrateTarget Target) {
        this.Target = Target;
    }

    /**
     * Get 迁移DB对象 ，离线迁移（SourceType=4或SourceType=5）不使用，若不填则不修改 
     * @return MigrateDBSet 迁移DB对象 ，离线迁移（SourceType=4或SourceType=5）不使用，若不填则不修改
     */
    public MigrateDB [] getMigrateDBSet() {
        return this.MigrateDBSet;
    }

    /**
     * Set 迁移DB对象 ，离线迁移（SourceType=4或SourceType=5）不使用，若不填则不修改
     * @param MigrateDBSet 迁移DB对象 ，离线迁移（SourceType=4或SourceType=5）不使用，若不填则不修改
     */
    public void setMigrateDBSet(MigrateDB [] MigrateDBSet) {
        this.MigrateDBSet = MigrateDBSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MigrateId", this.MigrateId);
        this.setParamSimple(map, prefix + "MigrateName", this.MigrateName);
        this.setParamSimple(map, prefix + "MigrateType", this.MigrateType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamObj(map, prefix + "Source.", this.Source);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamArrayObj(map, prefix + "MigrateDBSet.", this.MigrateDBSet);

    }
}

