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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoteBackupInfo extends AbstractModel{

    /**
    * 异地备份子任务的ID
    */
    @SerializedName("SubBackupId")
    @Expose
    private Long [] SubBackupId;

    /**
    * 异地备份所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 备份任务状态。可能的值有 "SUCCESS": 备份成功， "FAILED": 备份失败， "RUNNING": 备份进行中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 异地备份任务的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 异地备份任务的结束时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 下载地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 异地备份子任务的ID 
     * @return SubBackupId 异地备份子任务的ID
     */
    public Long [] getSubBackupId() {
        return this.SubBackupId;
    }

    /**
     * Set 异地备份子任务的ID
     * @param SubBackupId 异地备份子任务的ID
     */
    public void setSubBackupId(Long [] SubBackupId) {
        this.SubBackupId = SubBackupId;
    }

    /**
     * Get 异地备份所在地域 
     * @return Region 异地备份所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 异地备份所在地域
     * @param Region 异地备份所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 备份任务状态。可能的值有 "SUCCESS": 备份成功， "FAILED": 备份失败， "RUNNING": 备份进行中。 
     * @return Status 备份任务状态。可能的值有 "SUCCESS": 备份成功， "FAILED": 备份失败， "RUNNING": 备份进行中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 备份任务状态。可能的值有 "SUCCESS": 备份成功， "FAILED": 备份失败， "RUNNING": 备份进行中。
     * @param Status 备份任务状态。可能的值有 "SUCCESS": 备份成功， "FAILED": 备份失败， "RUNNING": 备份进行中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 异地备份任务的开始时间 
     * @return StartTime 异地备份任务的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 异地备份任务的开始时间
     * @param StartTime 异地备份任务的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 异地备份任务的结束时间 
     * @return FinishTime 异地备份任务的结束时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 异地备份任务的结束时间
     * @param FinishTime 异地备份任务的结束时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 下载地址 
     * @return Url 下载地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 下载地址
     * @param Url 下载地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public RemoteBackupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoteBackupInfo(RemoteBackupInfo source) {
        if (source.SubBackupId != null) {
            this.SubBackupId = new Long[source.SubBackupId.length];
            for (int i = 0; i < source.SubBackupId.length; i++) {
                this.SubBackupId[i] = new Long(source.SubBackupId[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SubBackupId.", this.SubBackupId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

