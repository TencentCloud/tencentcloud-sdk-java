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

public class AffectedWorkloadItem extends AbstractModel{

    /**
    * 集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名字
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 工作负载名称
    */
    @SerializedName("WorkloadName")
    @Expose
    private String WorkloadName;

    /**
    * 工作负载类型
    */
    @SerializedName("WorkloadType")
    @Expose
    private String WorkloadType;

    /**
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 检测结果的验证信息
    */
    @SerializedName("VerifyInfo")
    @Expose
    private String VerifyInfo;

    /**
     * Get 集群Id 
     * @return ClusterId 集群Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群Id
     * @param ClusterId 集群Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名字 
     * @return ClusterName 集群名字
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名字
     * @param ClusterName 集群名字
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 工作负载名称 
     * @return WorkloadName 工作负载名称
     */
    public String getWorkloadName() {
        return this.WorkloadName;
    }

    /**
     * Set 工作负载名称
     * @param WorkloadName 工作负载名称
     */
    public void setWorkloadName(String WorkloadName) {
        this.WorkloadName = WorkloadName;
    }

    /**
     * Get 工作负载类型 
     * @return WorkloadType 工作负载类型
     */
    public String getWorkloadType() {
        return this.WorkloadType;
    }

    /**
     * Set 工作负载类型
     * @param WorkloadType 工作负载类型
     */
    public void setWorkloadType(String WorkloadType) {
        this.WorkloadType = WorkloadType;
    }

    /**
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 检测结果的验证信息 
     * @return VerifyInfo 检测结果的验证信息
     */
    public String getVerifyInfo() {
        return this.VerifyInfo;
    }

    /**
     * Set 检测结果的验证信息
     * @param VerifyInfo 检测结果的验证信息
     */
    public void setVerifyInfo(String VerifyInfo) {
        this.VerifyInfo = VerifyInfo;
    }

    public AffectedWorkloadItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AffectedWorkloadItem(AffectedWorkloadItem source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.WorkloadName != null) {
            this.WorkloadName = new String(source.WorkloadName);
        }
        if (source.WorkloadType != null) {
            this.WorkloadType = new String(source.WorkloadType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VerifyInfo != null) {
            this.VerifyInfo = new String(source.VerifyInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "WorkloadName", this.WorkloadName);
        this.setParamSimple(map, prefix + "WorkloadType", this.WorkloadType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VerifyInfo", this.VerifyInfo);

    }
}

