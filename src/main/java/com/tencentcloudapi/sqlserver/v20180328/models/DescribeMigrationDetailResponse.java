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

public class DescribeMigrationDetailResponse extends AbstractModel{

    /**
    * 迁移任务ID
    */
    @SerializedName("MigrateId")
    @Expose
    private Long MigrateId;

    /**
    * 迁移任务名称
    */
    @SerializedName("MigrateName")
    @Expose
    private String MigrateName;

    /**
    * 迁移任务所属的用户ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 迁移任务所属的地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 迁移源的类型 1:TencentDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式）
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 迁移任务的创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 迁移任务的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 迁移任务的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 迁移任务的状态（1:初始化,4:迁移中,5.迁移失败,6.迁移成功）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 迁移任务当前进度
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 迁移类型（1:结构迁移 2:数据迁移 3:增量同步）
    */
    @SerializedName("MigrateType")
    @Expose
    private Long MigrateType;

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
    * 迁移DB对象 ，离线迁移（SourceType=4或SourceType=5）不使用。
    */
    @SerializedName("MigrateDBSet")
    @Expose
    private MigrateDB [] MigrateDBSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 迁移任务名称 
     * @return MigrateName 迁移任务名称
     */
    public String getMigrateName() {
        return this.MigrateName;
    }

    /**
     * Set 迁移任务名称
     * @param MigrateName 迁移任务名称
     */
    public void setMigrateName(String MigrateName) {
        this.MigrateName = MigrateName;
    }

    /**
     * Get 迁移任务所属的用户ID 
     * @return AppId 迁移任务所属的用户ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 迁移任务所属的用户ID
     * @param AppId 迁移任务所属的用户ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 迁移任务所属的地域 
     * @return Region 迁移任务所属的地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 迁移任务所属的地域
     * @param Region 迁移任务所属的地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 迁移源的类型 1:TencentDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式） 
     * @return SourceType 迁移源的类型 1:TencentDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式）
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 迁移源的类型 1:TencentDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式）
     * @param SourceType 迁移源的类型 1:TencentDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式）
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 迁移任务的创建时间 
     * @return CreateTime 迁移任务的创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 迁移任务的创建时间
     * @param CreateTime 迁移任务的创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 迁移任务的开始时间 
     * @return StartTime 迁移任务的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 迁移任务的开始时间
     * @param StartTime 迁移任务的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 迁移任务的结束时间 
     * @return EndTime 迁移任务的结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 迁移任务的结束时间
     * @param EndTime 迁移任务的结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 迁移任务的状态（1:初始化,4:迁移中,5.迁移失败,6.迁移成功） 
     * @return Status 迁移任务的状态（1:初始化,4:迁移中,5.迁移失败,6.迁移成功）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 迁移任务的状态（1:初始化,4:迁移中,5.迁移失败,6.迁移成功）
     * @param Status 迁移任务的状态（1:初始化,4:迁移中,5.迁移失败,6.迁移成功）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 迁移任务当前进度 
     * @return Progress 迁移任务当前进度
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 迁移任务当前进度
     * @param Progress 迁移任务当前进度
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 迁移类型（1:结构迁移 2:数据迁移 3:增量同步） 
     * @return MigrateType 迁移类型（1:结构迁移 2:数据迁移 3:增量同步）
     */
    public Long getMigrateType() {
        return this.MigrateType;
    }

    /**
     * Set 迁移类型（1:结构迁移 2:数据迁移 3:增量同步）
     * @param MigrateType 迁移类型（1:结构迁移 2:数据迁移 3:增量同步）
     */
    public void setMigrateType(Long MigrateType) {
        this.MigrateType = MigrateType;
    }

    /**
     * Get 迁移源 
     * @return Source 迁移源
     */
    public MigrateSource getSource() {
        return this.Source;
    }

    /**
     * Set 迁移源
     * @param Source 迁移源
     */
    public void setSource(MigrateSource Source) {
        this.Source = Source;
    }

    /**
     * Get 迁移目标 
     * @return Target 迁移目标
     */
    public MigrateTarget getTarget() {
        return this.Target;
    }

    /**
     * Set 迁移目标
     * @param Target 迁移目标
     */
    public void setTarget(MigrateTarget Target) {
        this.Target = Target;
    }

    /**
     * Get 迁移DB对象 ，离线迁移（SourceType=4或SourceType=5）不使用。 
     * @return MigrateDBSet 迁移DB对象 ，离线迁移（SourceType=4或SourceType=5）不使用。
     */
    public MigrateDB [] getMigrateDBSet() {
        return this.MigrateDBSet;
    }

    /**
     * Set 迁移DB对象 ，离线迁移（SourceType=4或SourceType=5）不使用。
     * @param MigrateDBSet 迁移DB对象 ，离线迁移（SourceType=4或SourceType=5）不使用。
     */
    public void setMigrateDBSet(MigrateDB [] MigrateDBSet) {
        this.MigrateDBSet = MigrateDBSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MigrateId", this.MigrateId);
        this.setParamSimple(map, prefix + "MigrateName", this.MigrateName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "MigrateType", this.MigrateType);
        this.setParamObj(map, prefix + "Source.", this.Source);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamArrayObj(map, prefix + "MigrateDBSet.", this.MigrateDBSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

