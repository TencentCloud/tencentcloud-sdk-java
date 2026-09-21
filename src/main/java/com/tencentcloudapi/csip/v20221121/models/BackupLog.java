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
    * <p>索引</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>索引开始时间</p>
    */
    @SerializedName("IndexStartTime")
    @Expose
    private Long IndexStartTime;

    /**
    * <p>索引结束时间</p>
    */
    @SerializedName("IndexEndTime")
    @Expose
    private Long IndexEndTime;

    /**
    * <p>备份后压缩的大小，单位M</p>
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * <p>日志状态 0备份未完成， 1备份文件，2恢复中，3已恢复，4.已删除</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>恢复剩余的分钟数，分钟，需要前端转换</p>
    */
    @SerializedName("RestoreProcessRemindTime")
    @Expose
    private Long RestoreProcessRemindTime;

    /**
    * <p>恢复日志保留的时间</p>
    */
    @SerializedName("RestoreRemindTime")
    @Expose
    private Long RestoreRemindTime;

    /**
    * <p>恢复索引大小</p>
    */
    @SerializedName("RestoreIndexSize")
    @Expose
    private Long RestoreIndexSize;

    /**
    * <p>恢复日志执行结束时间</p>
    */
    @SerializedName("RestoreEndTime")
    @Expose
    private Long RestoreEndTime;

    /**
    * <p>备份所属的appId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>备份所属的资产ID</p>
    */
    @SerializedName("AssetId")
    @Expose
    private Long AssetId;

    /**
    * <p>账号昵称</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>资产所属账号uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例类型</p><p>枚举值：</p><ul><li>cdb：  cdb</li><li>mariadb： mariadb</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
     * Get <p>索引</p> 
     * @return Id <p>索引</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>索引</p>
     * @param Id <p>索引</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>索引开始时间</p> 
     * @return IndexStartTime <p>索引开始时间</p>
     */
    public Long getIndexStartTime() {
        return this.IndexStartTime;
    }

    /**
     * Set <p>索引开始时间</p>
     * @param IndexStartTime <p>索引开始时间</p>
     */
    public void setIndexStartTime(Long IndexStartTime) {
        this.IndexStartTime = IndexStartTime;
    }

    /**
     * Get <p>索引结束时间</p> 
     * @return IndexEndTime <p>索引结束时间</p>
     */
    public Long getIndexEndTime() {
        return this.IndexEndTime;
    }

    /**
     * Set <p>索引结束时间</p>
     * @param IndexEndTime <p>索引结束时间</p>
     */
    public void setIndexEndTime(Long IndexEndTime) {
        this.IndexEndTime = IndexEndTime;
    }

    /**
     * Get <p>备份后压缩的大小，单位M</p> 
     * @return BackupSize <p>备份后压缩的大小，单位M</p>
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set <p>备份后压缩的大小，单位M</p>
     * @param BackupSize <p>备份后压缩的大小，单位M</p>
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get <p>日志状态 0备份未完成， 1备份文件，2恢复中，3已恢复，4.已删除</p> 
     * @return Status <p>日志状态 0备份未完成， 1备份文件，2恢复中，3已恢复，4.已删除</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>日志状态 0备份未完成， 1备份文件，2恢复中，3已恢复，4.已删除</p>
     * @param Status <p>日志状态 0备份未完成， 1备份文件，2恢复中，3已恢复，4.已删除</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>恢复剩余的分钟数，分钟，需要前端转换</p> 
     * @return RestoreProcessRemindTime <p>恢复剩余的分钟数，分钟，需要前端转换</p>
     */
    public Long getRestoreProcessRemindTime() {
        return this.RestoreProcessRemindTime;
    }

    /**
     * Set <p>恢复剩余的分钟数，分钟，需要前端转换</p>
     * @param RestoreProcessRemindTime <p>恢复剩余的分钟数，分钟，需要前端转换</p>
     */
    public void setRestoreProcessRemindTime(Long RestoreProcessRemindTime) {
        this.RestoreProcessRemindTime = RestoreProcessRemindTime;
    }

    /**
     * Get <p>恢复日志保留的时间</p> 
     * @return RestoreRemindTime <p>恢复日志保留的时间</p>
     */
    public Long getRestoreRemindTime() {
        return this.RestoreRemindTime;
    }

    /**
     * Set <p>恢复日志保留的时间</p>
     * @param RestoreRemindTime <p>恢复日志保留的时间</p>
     */
    public void setRestoreRemindTime(Long RestoreRemindTime) {
        this.RestoreRemindTime = RestoreRemindTime;
    }

    /**
     * Get <p>恢复索引大小</p> 
     * @return RestoreIndexSize <p>恢复索引大小</p>
     */
    public Long getRestoreIndexSize() {
        return this.RestoreIndexSize;
    }

    /**
     * Set <p>恢复索引大小</p>
     * @param RestoreIndexSize <p>恢复索引大小</p>
     */
    public void setRestoreIndexSize(Long RestoreIndexSize) {
        this.RestoreIndexSize = RestoreIndexSize;
    }

    /**
     * Get <p>恢复日志执行结束时间</p> 
     * @return RestoreEndTime <p>恢复日志执行结束时间</p>
     */
    public Long getRestoreEndTime() {
        return this.RestoreEndTime;
    }

    /**
     * Set <p>恢复日志执行结束时间</p>
     * @param RestoreEndTime <p>恢复日志执行结束时间</p>
     */
    public void setRestoreEndTime(Long RestoreEndTime) {
        this.RestoreEndTime = RestoreEndTime;
    }

    /**
     * Get <p>备份所属的appId</p> 
     * @return AppId <p>备份所属的appId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>备份所属的appId</p>
     * @param AppId <p>备份所属的appId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>备份所属的资产ID</p> 
     * @return AssetId <p>备份所属的资产ID</p>
     */
    public Long getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>备份所属的资产ID</p>
     * @param AssetId <p>备份所属的资产ID</p>
     */
    public void setAssetId(Long AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>账号昵称</p> 
     * @return NickName <p>账号昵称</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>账号昵称</p>
     * @param NickName <p>账号昵称</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>资产所属账号uin</p> 
     * @return Uin <p>资产所属账号uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>资产所属账号uin</p>
     * @param Uin <p>资产所属账号uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例类型</p><p>枚举值：</p><ul><li>cdb：  cdb</li><li>mariadb： mariadb</li></ul> 
     * @return AssetType <p>实例类型</p><p>枚举值：</p><ul><li>cdb：  cdb</li><li>mariadb： mariadb</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>实例类型</p><p>枚举值：</p><ul><li>cdb：  cdb</li><li>mariadb： mariadb</li></ul>
     * @param AssetType <p>实例类型</p><p>枚举值：</p><ul><li>cdb：  cdb</li><li>mariadb： mariadb</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
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
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);

    }
}

