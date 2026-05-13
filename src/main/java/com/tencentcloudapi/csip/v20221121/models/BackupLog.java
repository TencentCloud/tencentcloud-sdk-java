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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupLog extends AbstractModel {

    /**
    * 索引
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 索引开始时间
    */
    @SerializedName("IndexStartTime")
    @Expose
    private Long IndexStartTime;

    /**
    * 索引结束时间
    */
    @SerializedName("IndexEndTime")
    @Expose
    private Long IndexEndTime;

    /**
    * 备份后压缩的大小，单位M
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * 日志状态 0备份未完成， 1备份文件，2恢复中，3已恢复，4.已删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 恢复剩余的分钟数，分钟，需要前端转换
    */
    @SerializedName("RestoreProcessRemindTime")
    @Expose
    private Long RestoreProcessRemindTime;

    /**
    * 恢复日志保留的时间
    */
    @SerializedName("RestoreRemindTime")
    @Expose
    private Long RestoreRemindTime;

    /**
    * 恢复索引大小
    */
    @SerializedName("RestoreIndexSize")
    @Expose
    private Long RestoreIndexSize;

    /**
    * 恢复日志执行结束时间
    */
    @SerializedName("RestoreEndTime")
    @Expose
    private Long RestoreEndTime;

    /**
    * 备份所属的appId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 备份所属的资产ID
    */
    @SerializedName("AssetId")
    @Expose
    private Long AssetId;

    /**
    * 账号昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 资产所属账号uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get 索引 
     * @return Id 索引
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 索引
     * @param Id 索引
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 索引开始时间 
     * @return IndexStartTime 索引开始时间
     */
    public Long getIndexStartTime() {
        return this.IndexStartTime;
    }

    /**
     * Set 索引开始时间
     * @param IndexStartTime 索引开始时间
     */
    public void setIndexStartTime(Long IndexStartTime) {
        this.IndexStartTime = IndexStartTime;
    }

    /**
     * Get 索引结束时间 
     * @return IndexEndTime 索引结束时间
     */
    public Long getIndexEndTime() {
        return this.IndexEndTime;
    }

    /**
     * Set 索引结束时间
     * @param IndexEndTime 索引结束时间
     */
    public void setIndexEndTime(Long IndexEndTime) {
        this.IndexEndTime = IndexEndTime;
    }

    /**
     * Get 备份后压缩的大小，单位M 
     * @return BackupSize 备份后压缩的大小，单位M
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set 备份后压缩的大小，单位M
     * @param BackupSize 备份后压缩的大小，单位M
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get 日志状态 0备份未完成， 1备份文件，2恢复中，3已恢复，4.已删除 
     * @return Status 日志状态 0备份未完成， 1备份文件，2恢复中，3已恢复，4.已删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 日志状态 0备份未完成， 1备份文件，2恢复中，3已恢复，4.已删除
     * @param Status 日志状态 0备份未完成， 1备份文件，2恢复中，3已恢复，4.已删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 恢复剩余的分钟数，分钟，需要前端转换 
     * @return RestoreProcessRemindTime 恢复剩余的分钟数，分钟，需要前端转换
     */
    public Long getRestoreProcessRemindTime() {
        return this.RestoreProcessRemindTime;
    }

    /**
     * Set 恢复剩余的分钟数，分钟，需要前端转换
     * @param RestoreProcessRemindTime 恢复剩余的分钟数，分钟，需要前端转换
     */
    public void setRestoreProcessRemindTime(Long RestoreProcessRemindTime) {
        this.RestoreProcessRemindTime = RestoreProcessRemindTime;
    }

    /**
     * Get 恢复日志保留的时间 
     * @return RestoreRemindTime 恢复日志保留的时间
     */
    public Long getRestoreRemindTime() {
        return this.RestoreRemindTime;
    }

    /**
     * Set 恢复日志保留的时间
     * @param RestoreRemindTime 恢复日志保留的时间
     */
    public void setRestoreRemindTime(Long RestoreRemindTime) {
        this.RestoreRemindTime = RestoreRemindTime;
    }

    /**
     * Get 恢复索引大小 
     * @return RestoreIndexSize 恢复索引大小
     */
    public Long getRestoreIndexSize() {
        return this.RestoreIndexSize;
    }

    /**
     * Set 恢复索引大小
     * @param RestoreIndexSize 恢复索引大小
     */
    public void setRestoreIndexSize(Long RestoreIndexSize) {
        this.RestoreIndexSize = RestoreIndexSize;
    }

    /**
     * Get 恢复日志执行结束时间 
     * @return RestoreEndTime 恢复日志执行结束时间
     */
    public Long getRestoreEndTime() {
        return this.RestoreEndTime;
    }

    /**
     * Set 恢复日志执行结束时间
     * @param RestoreEndTime 恢复日志执行结束时间
     */
    public void setRestoreEndTime(Long RestoreEndTime) {
        this.RestoreEndTime = RestoreEndTime;
    }

    /**
     * Get 备份所属的appId 
     * @return AppId 备份所属的appId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 备份所属的appId
     * @param AppId 备份所属的appId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 备份所属的资产ID 
     * @return AssetId 备份所属的资产ID
     */
    public Long getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 备份所属的资产ID
     * @param AssetId 备份所属的资产ID
     */
    public void setAssetId(Long AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 账号昵称 
     * @return NickName 账号昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 账号昵称
     * @param NickName 账号昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 资产所属账号uin 
     * @return Uin 资产所属账号uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 资产所属账号uin
     * @param Uin 资产所属账号uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public BackupLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupLog(BackupLog source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.IndexStartTime != null) {
            this.IndexStartTime = new Long(source.IndexStartTime);
        }
        if (source.IndexEndTime != null) {
            this.IndexEndTime = new Long(source.IndexEndTime);
        }
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RestoreProcessRemindTime != null) {
            this.RestoreProcessRemindTime = new Long(source.RestoreProcessRemindTime);
        }
        if (source.RestoreRemindTime != null) {
            this.RestoreRemindTime = new Long(source.RestoreRemindTime);
        }
        if (source.RestoreIndexSize != null) {
            this.RestoreIndexSize = new Long(source.RestoreIndexSize);
        }
        if (source.RestoreEndTime != null) {
            this.RestoreEndTime = new Long(source.RestoreEndTime);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AssetId != null) {
            this.AssetId = new Long(source.AssetId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IndexStartTime", this.IndexStartTime);
        this.setParamSimple(map, prefix + "IndexEndTime", this.IndexEndTime);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RestoreProcessRemindTime", this.RestoreProcessRemindTime);
        this.setParamSimple(map, prefix + "RestoreRemindTime", this.RestoreRemindTime);
        this.setParamSimple(map, prefix + "RestoreIndexSize", this.RestoreIndexSize);
        this.setParamSimple(map, prefix + "RestoreEndTime", this.RestoreEndTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

