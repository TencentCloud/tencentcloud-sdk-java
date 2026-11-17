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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupPlanSourceInfoRequest extends AbstractModel {

    /**
    * 备份计划 ID。
    */
    @SerializedName("BackupPlanId")
    @Expose
    private String BackupPlanId;

    /**
    * 新的备份源实例信息。
    */
    @SerializedName("SourceEndPoint")
    @Expose
    private BackupEndpoint SourceEndPoint;

    /**
    * 新的备份名称。
    */
    @SerializedName("BackupPlanName")
    @Expose
    private String BackupPlanName;

    /**
    * 新的备份对象信息。
    */
    @SerializedName("BackupObject")
    @Expose
    private BackupObject BackupObject;

    /**
    * 是否立即启动新的备份任务。支持的取值为：1 - 立即启动；0 - 按备份策略配置的时间启动。
    */
    @SerializedName("BackupNow")
    @Expose
    private Long BackupNow;

    /**
     * Get 备份计划 ID。 
     * @return BackupPlanId 备份计划 ID。
     */
    public String getBackupPlanId() {
        return this.BackupPlanId;
    }

    /**
     * Set 备份计划 ID。
     * @param BackupPlanId 备份计划 ID。
     */
    public void setBackupPlanId(String BackupPlanId) {
        this.BackupPlanId = BackupPlanId;
    }

    /**
     * Get 新的备份源实例信息。 
     * @return SourceEndPoint 新的备份源实例信息。
     */
    public BackupEndpoint getSourceEndPoint() {
        return this.SourceEndPoint;
    }

    /**
     * Set 新的备份源实例信息。
     * @param SourceEndPoint 新的备份源实例信息。
     */
    public void setSourceEndPoint(BackupEndpoint SourceEndPoint) {
        this.SourceEndPoint = SourceEndPoint;
    }

    /**
     * Get 新的备份名称。 
     * @return BackupPlanName 新的备份名称。
     */
    public String getBackupPlanName() {
        return this.BackupPlanName;
    }

    /**
     * Set 新的备份名称。
     * @param BackupPlanName 新的备份名称。
     */
    public void setBackupPlanName(String BackupPlanName) {
        this.BackupPlanName = BackupPlanName;
    }

    /**
     * Get 新的备份对象信息。 
     * @return BackupObject 新的备份对象信息。
     */
    public BackupObject getBackupObject() {
        return this.BackupObject;
    }

    /**
     * Set 新的备份对象信息。
     * @param BackupObject 新的备份对象信息。
     */
    public void setBackupObject(BackupObject BackupObject) {
        this.BackupObject = BackupObject;
    }

    /**
     * Get 是否立即启动新的备份任务。支持的取值为：1 - 立即启动；0 - 按备份策略配置的时间启动。 
     * @return BackupNow 是否立即启动新的备份任务。支持的取值为：1 - 立即启动；0 - 按备份策略配置的时间启动。
     */
    public Long getBackupNow() {
        return this.BackupNow;
    }

    /**
     * Set 是否立即启动新的备份任务。支持的取值为：1 - 立即启动；0 - 按备份策略配置的时间启动。
     * @param BackupNow 是否立即启动新的备份任务。支持的取值为：1 - 立即启动；0 - 按备份策略配置的时间启动。
     */
    public void setBackupNow(Long BackupNow) {
        this.BackupNow = BackupNow;
    }

    public ModifyBackupPlanSourceInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupPlanSourceInfoRequest(ModifyBackupPlanSourceInfoRequest source) {
        if (source.BackupPlanId != null) {
            this.BackupPlanId = new String(source.BackupPlanId);
        }
        if (source.SourceEndPoint != null) {
            this.SourceEndPoint = new BackupEndpoint(source.SourceEndPoint);
        }
        if (source.BackupPlanName != null) {
            this.BackupPlanName = new String(source.BackupPlanName);
        }
        if (source.BackupObject != null) {
            this.BackupObject = new BackupObject(source.BackupObject);
        }
        if (source.BackupNow != null) {
            this.BackupNow = new Long(source.BackupNow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupPlanId", this.BackupPlanId);
        this.setParamObj(map, prefix + "SourceEndPoint.", this.SourceEndPoint);
        this.setParamSimple(map, prefix + "BackupPlanName", this.BackupPlanName);
        this.setParamObj(map, prefix + "BackupObject.", this.BackupObject);
        this.setParamSimple(map, prefix + "BackupNow", this.BackupNow);

    }
}

