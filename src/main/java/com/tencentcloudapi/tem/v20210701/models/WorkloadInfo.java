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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkloadInfo extends AbstractModel {

    /**
    * 资源 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 应用名
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 版本名称
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Ready实例数
    */
    @SerializedName("ReadyReplicas")
    @Expose
    private Long ReadyReplicas;

    /**
    * 实例数
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * Updated实例数
    */
    @SerializedName("UpdatedReplicas")
    @Expose
    private Long UpdatedReplicas;

    /**
    * UpdatedReady实例数
    */
    @SerializedName("UpdatedReadyReplicas")
    @Expose
    private Long UpdatedReadyReplicas;

    /**
    * 更新版本
    */
    @SerializedName("UpdateRevision")
    @Expose
    private String UpdateRevision;

    /**
    * 当前版本
    */
    @SerializedName("CurrentRevision")
    @Expose
    private String CurrentRevision;

    /**
     * Get 资源 ID 
     * @return ClusterId 资源 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 资源 ID
     * @param ClusterId 资源 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 应用名 
     * @return ApplicationName 应用名
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名
     * @param ApplicationName 应用名
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 版本名称 
     * @return VersionName 版本名称
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称
     * @param VersionName 版本名称
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Ready实例数 
     * @return ReadyReplicas Ready实例数
     */
    public Long getReadyReplicas() {
        return this.ReadyReplicas;
    }

    /**
     * Set Ready实例数
     * @param ReadyReplicas Ready实例数
     */
    public void setReadyReplicas(Long ReadyReplicas) {
        this.ReadyReplicas = ReadyReplicas;
    }

    /**
     * Get 实例数 
     * @return Replicas 实例数
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 实例数
     * @param Replicas 实例数
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get Updated实例数 
     * @return UpdatedReplicas Updated实例数
     */
    public Long getUpdatedReplicas() {
        return this.UpdatedReplicas;
    }

    /**
     * Set Updated实例数
     * @param UpdatedReplicas Updated实例数
     */
    public void setUpdatedReplicas(Long UpdatedReplicas) {
        this.UpdatedReplicas = UpdatedReplicas;
    }

    /**
     * Get UpdatedReady实例数 
     * @return UpdatedReadyReplicas UpdatedReady实例数
     */
    public Long getUpdatedReadyReplicas() {
        return this.UpdatedReadyReplicas;
    }

    /**
     * Set UpdatedReady实例数
     * @param UpdatedReadyReplicas UpdatedReady实例数
     */
    public void setUpdatedReadyReplicas(Long UpdatedReadyReplicas) {
        this.UpdatedReadyReplicas = UpdatedReadyReplicas;
    }

    /**
     * Get 更新版本 
     * @return UpdateRevision 更新版本
     */
    public String getUpdateRevision() {
        return this.UpdateRevision;
    }

    /**
     * Set 更新版本
     * @param UpdateRevision 更新版本
     */
    public void setUpdateRevision(String UpdateRevision) {
        this.UpdateRevision = UpdateRevision;
    }

    /**
     * Get 当前版本 
     * @return CurrentRevision 当前版本
     */
    public String getCurrentRevision() {
        return this.CurrentRevision;
    }

    /**
     * Set 当前版本
     * @param CurrentRevision 当前版本
     */
    public void setCurrentRevision(String CurrentRevision) {
        this.CurrentRevision = CurrentRevision;
    }

    public WorkloadInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkloadInfo(WorkloadInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.ReadyReplicas != null) {
            this.ReadyReplicas = new Long(source.ReadyReplicas);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.UpdatedReplicas != null) {
            this.UpdatedReplicas = new Long(source.UpdatedReplicas);
        }
        if (source.UpdatedReadyReplicas != null) {
            this.UpdatedReadyReplicas = new Long(source.UpdatedReadyReplicas);
        }
        if (source.UpdateRevision != null) {
            this.UpdateRevision = new String(source.UpdateRevision);
        }
        if (source.CurrentRevision != null) {
            this.CurrentRevision = new String(source.CurrentRevision);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "ReadyReplicas", this.ReadyReplicas);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "UpdatedReplicas", this.UpdatedReplicas);
        this.setParamSimple(map, prefix + "UpdatedReadyReplicas", this.UpdatedReadyReplicas);
        this.setParamSimple(map, prefix + "UpdateRevision", this.UpdateRevision);
        this.setParamSimple(map, prefix + "CurrentRevision", this.CurrentRevision);

    }
}

