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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetClusterListItem extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群状态
CSR_RUNNING: 运行中
CSR_EXCEPTION:异常
CSR_DEL:已经删除
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 绑定规则名称
    */
    @SerializedName("BindRuleName")
    @Expose
    private String BindRuleName;

    /**
    * 集群类型:
CT_TKE:TKE集群;
CT_USER_CREATE:用户自建集群;
CT_TKE_SERVERLESS:TKE Serverless集群;
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群版本
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 内存量
    */
    @SerializedName("MemLimit")
    @Expose
    private Long MemLimit;

    /**
    * cpu
    */
    @SerializedName("CpuLimit")
    @Expose
    private Long CpuLimit;

    /**
     * Get 集群ID 
     * @return ClusterID 集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
     * @param ClusterID 集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
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
     * Get 集群状态
CSR_RUNNING: 运行中
CSR_EXCEPTION:异常
CSR_DEL:已经删除 
     * @return Status 集群状态
CSR_RUNNING: 运行中
CSR_EXCEPTION:异常
CSR_DEL:已经删除
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态
CSR_RUNNING: 运行中
CSR_EXCEPTION:异常
CSR_DEL:已经删除
     * @param Status 集群状态
CSR_RUNNING: 运行中
CSR_EXCEPTION:异常
CSR_DEL:已经删除
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 绑定规则名称 
     * @return BindRuleName 绑定规则名称
     */
    public String getBindRuleName() {
        return this.BindRuleName;
    }

    /**
     * Set 绑定规则名称
     * @param BindRuleName 绑定规则名称
     */
    public void setBindRuleName(String BindRuleName) {
        this.BindRuleName = BindRuleName;
    }

    /**
     * Get 集群类型:
CT_TKE:TKE集群;
CT_USER_CREATE:用户自建集群;
CT_TKE_SERVERLESS:TKE Serverless集群; 
     * @return ClusterType 集群类型:
CT_TKE:TKE集群;
CT_USER_CREATE:用户自建集群;
CT_TKE_SERVERLESS:TKE Serverless集群;
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型:
CT_TKE:TKE集群;
CT_USER_CREATE:用户自建集群;
CT_TKE_SERVERLESS:TKE Serverless集群;
     * @param ClusterType 集群类型:
CT_TKE:TKE集群;
CT_USER_CREATE:用户自建集群;
CT_TKE_SERVERLESS:TKE Serverless集群;
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 集群版本 
     * @return ClusterVersion 集群版本
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群版本
     * @param ClusterVersion 集群版本
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 内存量 
     * @return MemLimit 内存量
     */
    public Long getMemLimit() {
        return this.MemLimit;
    }

    /**
     * Set 内存量
     * @param MemLimit 内存量
     */
    public void setMemLimit(Long MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * Get cpu 
     * @return CpuLimit cpu
     */
    public Long getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set cpu
     * @param CpuLimit cpu
     */
    public void setCpuLimit(Long CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    public AssetClusterListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetClusterListItem(AssetClusterListItem source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BindRuleName != null) {
            this.BindRuleName = new String(source.BindRuleName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.MemLimit != null) {
            this.MemLimit = new Long(source.MemLimit);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new Long(source.CpuLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BindRuleName", this.BindRuleName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "MemLimit", this.MemLimit);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);

    }
}

