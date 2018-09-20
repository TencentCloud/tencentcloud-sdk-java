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

public class MigrateTask  extends AbstractModel{

    /**
    * 迁移任务ID
    */
    @SerializedName("MigrateId")
    @Expose
    private Integer MigrateId;

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
    private Integer AppId;

    /**
    * 迁移任务所属的地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 迁移源的类型 1:CDB for SQLServer 2:云服务器自建SQLServer数据库 4:SQLServer备份还原 5:SQLServer备份还原（COS方式）
    */
    @SerializedName("SourceType")
    @Expose
    private Integer SourceType;

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
    private Integer Status;

    /**
    * 信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 是否迁移任务经过检查（0:未校验,1:校验成功,2:校验失败,3:校验中）
    */
    @SerializedName("CheckFlag")
    @Expose
    private Integer CheckFlag;

    /**
    * 迁移任务当前进度（单位%）
    */
    @SerializedName("Progress")
    @Expose
    private Integer Progress;

    /**
    * 迁移任务进度细节
    */
    @SerializedName("MigrateDetail")
    @Expose
    private MigrateDetail MigrateDetail;

    /**
     * 获取迁移任务ID
     * @return MigrateId 迁移任务ID
     */
    public Integer getMigrateId() {
        return this.MigrateId;
    }

    /**
     * 设置迁移任务ID
     * @param MigrateId 迁移任务ID
     */
    public void setMigrateId(Integer MigrateId) {
        this.MigrateId = MigrateId;
    }

    /**
     * 获取迁移任务名称
     * @return MigrateName 迁移任务名称
     */
    public String getMigrateName() {
        return this.MigrateName;
    }

    /**
     * 设置迁移任务名称
     * @param MigrateName 迁移任务名称
     */
    public void setMigrateName(String MigrateName) {
        this.MigrateName = MigrateName;
    }

    /**
     * 获取迁移任务所属的用户ID
     * @return AppId 迁移任务所属的用户ID
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * 设置迁移任务所属的用户ID
     * @param AppId 迁移任务所属的用户ID
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取迁移任务所属的地域
     * @return Region 迁移任务所属的地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置迁移任务所属的地域
     * @param Region 迁移任务所属的地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * 获取迁移任务的创建时间
     * @return CreateTime 迁移任务的创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置迁移任务的创建时间
     * @param CreateTime 迁移任务的创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取迁移任务的开始时间
     * @return StartTime 迁移任务的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置迁移任务的开始时间
     * @param StartTime 迁移任务的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取迁移任务的结束时间
     * @return EndTime 迁移任务的结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置迁移任务的结束时间
     * @param EndTime 迁移任务的结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取迁移任务的状态（1:初始化,4:迁移中,5.迁移失败,6.迁移成功）
     * @return Status 迁移任务的状态（1:初始化,4:迁移中,5.迁移失败,6.迁移成功）
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置迁移任务的状态（1:初始化,4:迁移中,5.迁移失败,6.迁移成功）
     * @param Status 迁移任务的状态（1:初始化,4:迁移中,5.迁移失败,6.迁移成功）
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取信息
     * @return Message 信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置信息
     * @param Message 信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取是否迁移任务经过检查（0:未校验,1:校验成功,2:校验失败,3:校验中）
     * @return CheckFlag 是否迁移任务经过检查（0:未校验,1:校验成功,2:校验失败,3:校验中）
     */
    public Integer getCheckFlag() {
        return this.CheckFlag;
    }

    /**
     * 设置是否迁移任务经过检查（0:未校验,1:校验成功,2:校验失败,3:校验中）
     * @param CheckFlag 是否迁移任务经过检查（0:未校验,1:校验成功,2:校验失败,3:校验中）
     */
    public void setCheckFlag(Integer CheckFlag) {
        this.CheckFlag = CheckFlag;
    }

    /**
     * 获取迁移任务当前进度（单位%）
     * @return Progress 迁移任务当前进度（单位%）
     */
    public Integer getProgress() {
        return this.Progress;
    }

    /**
     * 设置迁移任务当前进度（单位%）
     * @param Progress 迁移任务当前进度（单位%）
     */
    public void setProgress(Integer Progress) {
        this.Progress = Progress;
    }

    /**
     * 获取迁移任务进度细节
     * @return MigrateDetail 迁移任务进度细节
     */
    public MigrateDetail getMigrateDetail() {
        return this.MigrateDetail;
    }

    /**
     * 设置迁移任务进度细节
     * @param MigrateDetail 迁移任务进度细节
     */
    public void setMigrateDetail(MigrateDetail MigrateDetail) {
        this.MigrateDetail = MigrateDetail;
    }

    /**
     * 内部实现，用户禁止调用
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
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "CheckFlag", this.CheckFlag);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "MigrateDetail.", this.MigrateDetail);

    }
}

