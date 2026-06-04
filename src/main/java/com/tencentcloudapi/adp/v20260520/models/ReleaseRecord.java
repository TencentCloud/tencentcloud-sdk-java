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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseRecord extends AbstractModel {

    /**
    * 是否可导出
    */
    @SerializedName("CanExport")
    @Expose
    private Boolean CanExport;

    /**
    * 是否可回滚
    */
    @SerializedName("CanRollback")
    @Expose
    private Boolean CanRollback;

    /**
    * 发布描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 发布失败数
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * 失败原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 发布ID
    */
    @SerializedName("ReleaseId")
    @Expose
    private String ReleaseId;

    /**
    * 发布版本
    */
    @SerializedName("ReleaseVersion")
    @Expose
    private String ReleaseVersion;

    /**
    * 发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 状态描述
    */
    @SerializedName("StatusDescription")
    @Expose
    private String StatusDescription;

    /**
    * 发布成功数
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 更新时间 (Unix时间戳,秒级)
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 发布人
    */
    @SerializedName("Updater")
    @Expose
    private String Updater;

    /**
     * Get 是否可导出 
     * @return CanExport 是否可导出
     */
    public Boolean getCanExport() {
        return this.CanExport;
    }

    /**
     * Set 是否可导出
     * @param CanExport 是否可导出
     */
    public void setCanExport(Boolean CanExport) {
        this.CanExport = CanExport;
    }

    /**
     * Get 是否可回滚 
     * @return CanRollback 是否可回滚
     */
    public Boolean getCanRollback() {
        return this.CanRollback;
    }

    /**
     * Set 是否可回滚
     * @param CanRollback 是否可回滚
     */
    public void setCanRollback(Boolean CanRollback) {
        this.CanRollback = CanRollback;
    }

    /**
     * Get 发布描述 
     * @return Description 发布描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 发布描述
     * @param Description 发布描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 发布失败数 
     * @return FailCount 发布失败数
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 发布失败数
     * @param FailCount 发布失败数
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get 失败原因 
     * @return Reason 失败原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 失败原因
     * @param Reason 失败原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 发布ID 
     * @return ReleaseId 发布ID
     */
    public String getReleaseId() {
        return this.ReleaseId;
    }

    /**
     * Set 发布ID
     * @param ReleaseId 发布ID
     */
    public void setReleaseId(String ReleaseId) {
        this.ReleaseId = ReleaseId;
    }

    /**
     * Get 发布版本 
     * @return ReleaseVersion 发布版本
     */
    public String getReleaseVersion() {
        return this.ReleaseVersion;
    }

    /**
     * Set 发布版本
     * @param ReleaseVersion 发布版本
     */
    public void setReleaseVersion(String ReleaseVersion) {
        this.ReleaseVersion = ReleaseVersion;
    }

    /**
     * Get 发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过 
     * @return Status 发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过
     * @param Status 发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述 
     * @return StatusDescription 状态描述
     */
    public String getStatusDescription() {
        return this.StatusDescription;
    }

    /**
     * Set 状态描述
     * @param StatusDescription 状态描述
     */
    public void setStatusDescription(String StatusDescription) {
        this.StatusDescription = StatusDescription;
    }

    /**
     * Get 发布成功数 
     * @return SuccessCount 发布成功数
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 发布成功数
     * @param SuccessCount 发布成功数
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 更新时间 (Unix时间戳,秒级) 
     * @return UpdateTime 更新时间 (Unix时间戳,秒级)
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间 (Unix时间戳,秒级)
     * @param UpdateTime 更新时间 (Unix时间戳,秒级)
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 发布人 
     * @return Updater 发布人
     */
    public String getUpdater() {
        return this.Updater;
    }

    /**
     * Set 发布人
     * @param Updater 发布人
     */
    public void setUpdater(String Updater) {
        this.Updater = Updater;
    }

    public ReleaseRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseRecord(ReleaseRecord source) {
        if (source.CanExport != null) {
            this.CanExport = new Boolean(source.CanExport);
        }
        if (source.CanRollback != null) {
            this.CanRollback = new Boolean(source.CanRollback);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.ReleaseId != null) {
            this.ReleaseId = new String(source.ReleaseId);
        }
        if (source.ReleaseVersion != null) {
            this.ReleaseVersion = new String(source.ReleaseVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDescription != null) {
            this.StatusDescription = new String(source.StatusDescription);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Updater != null) {
            this.Updater = new String(source.Updater);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanExport", this.CanExport);
        this.setParamSimple(map, prefix + "CanRollback", this.CanRollback);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "ReleaseId", this.ReleaseId);
        this.setParamSimple(map, prefix + "ReleaseVersion", this.ReleaseVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDescription", this.StatusDescription);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Updater", this.Updater);

    }
}

