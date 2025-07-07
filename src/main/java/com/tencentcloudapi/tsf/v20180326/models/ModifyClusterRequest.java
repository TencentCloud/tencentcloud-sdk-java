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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群描述信息
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * 备注名
    */
    @SerializedName("ClusterRemarkName")
    @Expose
    private String ClusterRemarkName;

    /**
    * 是否开启cls日志功能
    */
    @SerializedName("EnableLogCollection")
    @Expose
    private Boolean EnableLogCollection;

    /**
    * 是否修复cls日志功能
    */
    @SerializedName("RepairLog")
    @Expose
    private Boolean RepairLog;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群描述信息 
     * @return ClusterDesc 集群描述信息
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * Set 集群描述信息
     * @param ClusterDesc 集群描述信息
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * Get 备注名 
     * @return ClusterRemarkName 备注名
     */
    public String getClusterRemarkName() {
        return this.ClusterRemarkName;
    }

    /**
     * Set 备注名
     * @param ClusterRemarkName 备注名
     */
    public void setClusterRemarkName(String ClusterRemarkName) {
        this.ClusterRemarkName = ClusterRemarkName;
    }

    /**
     * Get 是否开启cls日志功能 
     * @return EnableLogCollection 是否开启cls日志功能
     */
    public Boolean getEnableLogCollection() {
        return this.EnableLogCollection;
    }

    /**
     * Set 是否开启cls日志功能
     * @param EnableLogCollection 是否开启cls日志功能
     */
    public void setEnableLogCollection(Boolean EnableLogCollection) {
        this.EnableLogCollection = EnableLogCollection;
    }

    /**
     * Get 是否修复cls日志功能 
     * @return RepairLog 是否修复cls日志功能
     */
    public Boolean getRepairLog() {
        return this.RepairLog;
    }

    /**
     * Set 是否修复cls日志功能
     * @param RepairLog 是否修复cls日志功能
     */
    public void setRepairLog(Boolean RepairLog) {
        this.RepairLog = RepairLog;
    }

    public ModifyClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterRequest(ModifyClusterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.ClusterRemarkName != null) {
            this.ClusterRemarkName = new String(source.ClusterRemarkName);
        }
        if (source.EnableLogCollection != null) {
            this.EnableLogCollection = new Boolean(source.EnableLogCollection);
        }
        if (source.RepairLog != null) {
            this.RepairLog = new Boolean(source.RepairLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "ClusterRemarkName", this.ClusterRemarkName);
        this.setParamSimple(map, prefix + "EnableLogCollection", this.EnableLogCollection);
        this.setParamSimple(map, prefix + "RepairLog", this.RepairLog);

    }
}

