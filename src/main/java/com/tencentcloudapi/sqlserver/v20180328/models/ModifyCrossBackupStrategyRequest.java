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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCrossBackupStrategyRequest extends AbstractModel {

    /**
    * 跨地域备份开关(数据备份&日志备份) enable-开启，disable-关闭
    */
    @SerializedName("CrossBackupEnabled")
    @Expose
    private String CrossBackupEnabled;

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例ID列表
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 跨地域备份保留天数，取值：7~1830，默认7天
    */
    @SerializedName("CrossBackupSaveDays")
    @Expose
    private Long CrossBackupSaveDays;

    /**
    * 跨地域备份的目标地域ID，最多两个，最少一个
    */
    @SerializedName("CrossBackupRegion")
    @Expose
    private String [] CrossBackupRegion;

    /**
    * 是否立即清理跨地域备份(数据备份&日志备份) ，只有在BackupEnabled = disable时有效。1-是，0-否，默认：0
    */
    @SerializedName("CleanUpCrossBackup")
    @Expose
    private Long CleanUpCrossBackup;

    /**
     * Get 跨地域备份开关(数据备份&日志备份) enable-开启，disable-关闭 
     * @return CrossBackupEnabled 跨地域备份开关(数据备份&日志备份) enable-开启，disable-关闭
     */
    public String getCrossBackupEnabled() {
        return this.CrossBackupEnabled;
    }

    /**
     * Set 跨地域备份开关(数据备份&日志备份) enable-开启，disable-关闭
     * @param CrossBackupEnabled 跨地域备份开关(数据备份&日志备份) enable-开启，disable-关闭
     */
    public void setCrossBackupEnabled(String CrossBackupEnabled) {
        this.CrossBackupEnabled = CrossBackupEnabled;
    }

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例ID列表 
     * @return InstanceIdSet 实例ID列表
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 实例ID列表
     * @param InstanceIdSet 实例ID列表
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 跨地域备份保留天数，取值：7~1830，默认7天 
     * @return CrossBackupSaveDays 跨地域备份保留天数，取值：7~1830，默认7天
     */
    public Long getCrossBackupSaveDays() {
        return this.CrossBackupSaveDays;
    }

    /**
     * Set 跨地域备份保留天数，取值：7~1830，默认7天
     * @param CrossBackupSaveDays 跨地域备份保留天数，取值：7~1830，默认7天
     */
    public void setCrossBackupSaveDays(Long CrossBackupSaveDays) {
        this.CrossBackupSaveDays = CrossBackupSaveDays;
    }

    /**
     * Get 跨地域备份的目标地域ID，最多两个，最少一个 
     * @return CrossBackupRegion 跨地域备份的目标地域ID，最多两个，最少一个
     */
    public String [] getCrossBackupRegion() {
        return this.CrossBackupRegion;
    }

    /**
     * Set 跨地域备份的目标地域ID，最多两个，最少一个
     * @param CrossBackupRegion 跨地域备份的目标地域ID，最多两个，最少一个
     */
    public void setCrossBackupRegion(String [] CrossBackupRegion) {
        this.CrossBackupRegion = CrossBackupRegion;
    }

    /**
     * Get 是否立即清理跨地域备份(数据备份&日志备份) ，只有在BackupEnabled = disable时有效。1-是，0-否，默认：0 
     * @return CleanUpCrossBackup 是否立即清理跨地域备份(数据备份&日志备份) ，只有在BackupEnabled = disable时有效。1-是，0-否，默认：0
     */
    public Long getCleanUpCrossBackup() {
        return this.CleanUpCrossBackup;
    }

    /**
     * Set 是否立即清理跨地域备份(数据备份&日志备份) ，只有在BackupEnabled = disable时有效。1-是，0-否，默认：0
     * @param CleanUpCrossBackup 是否立即清理跨地域备份(数据备份&日志备份) ，只有在BackupEnabled = disable时有效。1-是，0-否，默认：0
     */
    public void setCleanUpCrossBackup(Long CleanUpCrossBackup) {
        this.CleanUpCrossBackup = CleanUpCrossBackup;
    }

    public ModifyCrossBackupStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCrossBackupStrategyRequest(ModifyCrossBackupStrategyRequest source) {
        if (source.CrossBackupEnabled != null) {
            this.CrossBackupEnabled = new String(source.CrossBackupEnabled);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.CrossBackupSaveDays != null) {
            this.CrossBackupSaveDays = new Long(source.CrossBackupSaveDays);
        }
        if (source.CrossBackupRegion != null) {
            this.CrossBackupRegion = new String[source.CrossBackupRegion.length];
            for (int i = 0; i < source.CrossBackupRegion.length; i++) {
                this.CrossBackupRegion[i] = new String(source.CrossBackupRegion[i]);
            }
        }
        if (source.CleanUpCrossBackup != null) {
            this.CleanUpCrossBackup = new Long(source.CleanUpCrossBackup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CrossBackupEnabled", this.CrossBackupEnabled);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "CrossBackupSaveDays", this.CrossBackupSaveDays);
        this.setParamArraySimple(map, prefix + "CrossBackupRegion.", this.CrossBackupRegion);
        this.setParamSimple(map, prefix + "CleanUpCrossBackup", this.CleanUpCrossBackup);

    }
}

