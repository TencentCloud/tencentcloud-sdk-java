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

public class DescribeBackupsRequest extends AbstractModel{

    /**
    * 开始时间(yyyy-MM-dd HH:mm:ss)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间(yyyy-MM-dd HH:mm:ss)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 实例ID，形如mssql-njj2mtpl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分页返回，每页返回的数目，取值为1-100，默认值为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页返回，页编号，默认值为第0页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 按照备份名称筛选，不填则不筛选此项
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * 按照备份策略筛选，0-实例备份，1-多库备份，不填则不筛选此项
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * 按照备份方式筛选，0-后台自动定时备份，1-用户手动临时备份，不填则不筛选此项
    */
    @SerializedName("BackupWay")
    @Expose
    private Long BackupWay;

    /**
    * 按照备份ID筛选，不填则不筛选此项
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
     * Get 开始时间(yyyy-MM-dd HH:mm:ss) 
     * @return StartTime 开始时间(yyyy-MM-dd HH:mm:ss)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间(yyyy-MM-dd HH:mm:ss)
     * @param StartTime 开始时间(yyyy-MM-dd HH:mm:ss)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间(yyyy-MM-dd HH:mm:ss) 
     * @return EndTime 结束时间(yyyy-MM-dd HH:mm:ss)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间(yyyy-MM-dd HH:mm:ss)
     * @param EndTime 结束时间(yyyy-MM-dd HH:mm:ss)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 实例ID，形如mssql-njj2mtpl 
     * @return InstanceId 实例ID，形如mssql-njj2mtpl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如mssql-njj2mtpl
     * @param InstanceId 实例ID，形如mssql-njj2mtpl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分页返回，每页返回的数目，取值为1-100，默认值为20 
     * @return Limit 分页返回，每页返回的数目，取值为1-100，默认值为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回，每页返回的数目，取值为1-100，默认值为20
     * @param Limit 分页返回，每页返回的数目，取值为1-100，默认值为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页返回，页编号，默认值为第0页 
     * @return Offset 分页返回，页编号，默认值为第0页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回，页编号，默认值为第0页
     * @param Offset 分页返回，页编号，默认值为第0页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 按照备份名称筛选，不填则不筛选此项 
     * @return BackupName 按照备份名称筛选，不填则不筛选此项
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 按照备份名称筛选，不填则不筛选此项
     * @param BackupName 按照备份名称筛选，不填则不筛选此项
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get 按照备份策略筛选，0-实例备份，1-多库备份，不填则不筛选此项 
     * @return Strategy 按照备份策略筛选，0-实例备份，1-多库备份，不填则不筛选此项
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 按照备份策略筛选，0-实例备份，1-多库备份，不填则不筛选此项
     * @param Strategy 按照备份策略筛选，0-实例备份，1-多库备份，不填则不筛选此项
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 按照备份方式筛选，0-后台自动定时备份，1-用户手动临时备份，不填则不筛选此项 
     * @return BackupWay 按照备份方式筛选，0-后台自动定时备份，1-用户手动临时备份，不填则不筛选此项
     */
    public Long getBackupWay() {
        return this.BackupWay;
    }

    /**
     * Set 按照备份方式筛选，0-后台自动定时备份，1-用户手动临时备份，不填则不筛选此项
     * @param BackupWay 按照备份方式筛选，0-后台自动定时备份，1-用户手动临时备份，不填则不筛选此项
     */
    public void setBackupWay(Long BackupWay) {
        this.BackupWay = BackupWay;
    }

    /**
     * Get 按照备份ID筛选，不填则不筛选此项 
     * @return BackupId 按照备份ID筛选，不填则不筛选此项
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 按照备份ID筛选，不填则不筛选此项
     * @param BackupId 按照备份ID筛选，不填则不筛选此项
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "BackupWay", this.BackupWay);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);

    }
}

