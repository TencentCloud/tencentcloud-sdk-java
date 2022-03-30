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
package com.tencentcloudapi.thpc.v20211109.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterOverview extends AbstractModel{

    /**
    * 集群ID。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群状态。取值范围：<br><li>PENDING：创建中<br><li>INITING：初始化中<br><li>INIT_FAILED：初始化失败<br><li>RUNNING：运行中<br><li>TERMINATING：销毁中
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * 集群名称。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群位置信息。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 集群创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 集群调度器。
    */
    @SerializedName("SchedulerType")
    @Expose
    private String SchedulerType;

    /**
    * 计算节点数量。
    */
    @SerializedName("ComputeNodeCount")
    @Expose
    private Long ComputeNodeCount;

    /**
    * 计算节点概览。
    */
    @SerializedName("ComputeNodeSet")
    @Expose
    private ComputeNodeOverview [] ComputeNodeSet;

    /**
    * 管控节点数量。
    */
    @SerializedName("ManagerNodeCount")
    @Expose
    private Long ManagerNodeCount;

    /**
    * 管控节点概览。
    */
    @SerializedName("ManagerNodeSet")
    @Expose
    private ManagerNodeOverview [] ManagerNodeSet;

    /**
    * 登录节点概览。
    */
    @SerializedName("LoginNodeSet")
    @Expose
    private LoginNodeOverview [] LoginNodeSet;

    /**
    * 登录节点数量。
    */
    @SerializedName("LoginNodeCount")
    @Expose
    private Long LoginNodeCount;

    /**
     * Get 集群ID。 
     * @return ClusterId 集群ID。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID。
     * @param ClusterId 集群ID。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群状态。取值范围：<br><li>PENDING：创建中<br><li>INITING：初始化中<br><li>INIT_FAILED：初始化失败<br><li>RUNNING：运行中<br><li>TERMINATING：销毁中 
     * @return ClusterStatus 集群状态。取值范围：<br><li>PENDING：创建中<br><li>INITING：初始化中<br><li>INIT_FAILED：初始化失败<br><li>RUNNING：运行中<br><li>TERMINATING：销毁中
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 集群状态。取值范围：<br><li>PENDING：创建中<br><li>INITING：初始化中<br><li>INIT_FAILED：初始化失败<br><li>RUNNING：运行中<br><li>TERMINATING：销毁中
     * @param ClusterStatus 集群状态。取值范围：<br><li>PENDING：创建中<br><li>INITING：初始化中<br><li>INIT_FAILED：初始化失败<br><li>RUNNING：运行中<br><li>TERMINATING：销毁中
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 集群名称。 
     * @return ClusterName 集群名称。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称。
     * @param ClusterName 集群名称。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群位置信息。 
     * @return Placement 集群位置信息。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 集群位置信息。
     * @param Placement 集群位置信息。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 集群创建时间。 
     * @return CreateTime 集群创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 集群创建时间。
     * @param CreateTime 集群创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 集群调度器。 
     * @return SchedulerType 集群调度器。
     */
    public String getSchedulerType() {
        return this.SchedulerType;
    }

    /**
     * Set 集群调度器。
     * @param SchedulerType 集群调度器。
     */
    public void setSchedulerType(String SchedulerType) {
        this.SchedulerType = SchedulerType;
    }

    /**
     * Get 计算节点数量。 
     * @return ComputeNodeCount 计算节点数量。
     */
    public Long getComputeNodeCount() {
        return this.ComputeNodeCount;
    }

    /**
     * Set 计算节点数量。
     * @param ComputeNodeCount 计算节点数量。
     */
    public void setComputeNodeCount(Long ComputeNodeCount) {
        this.ComputeNodeCount = ComputeNodeCount;
    }

    /**
     * Get 计算节点概览。 
     * @return ComputeNodeSet 计算节点概览。
     */
    public ComputeNodeOverview [] getComputeNodeSet() {
        return this.ComputeNodeSet;
    }

    /**
     * Set 计算节点概览。
     * @param ComputeNodeSet 计算节点概览。
     */
    public void setComputeNodeSet(ComputeNodeOverview [] ComputeNodeSet) {
        this.ComputeNodeSet = ComputeNodeSet;
    }

    /**
     * Get 管控节点数量。 
     * @return ManagerNodeCount 管控节点数量。
     */
    public Long getManagerNodeCount() {
        return this.ManagerNodeCount;
    }

    /**
     * Set 管控节点数量。
     * @param ManagerNodeCount 管控节点数量。
     */
    public void setManagerNodeCount(Long ManagerNodeCount) {
        this.ManagerNodeCount = ManagerNodeCount;
    }

    /**
     * Get 管控节点概览。 
     * @return ManagerNodeSet 管控节点概览。
     */
    public ManagerNodeOverview [] getManagerNodeSet() {
        return this.ManagerNodeSet;
    }

    /**
     * Set 管控节点概览。
     * @param ManagerNodeSet 管控节点概览。
     */
    public void setManagerNodeSet(ManagerNodeOverview [] ManagerNodeSet) {
        this.ManagerNodeSet = ManagerNodeSet;
    }

    /**
     * Get 登录节点概览。 
     * @return LoginNodeSet 登录节点概览。
     */
    public LoginNodeOverview [] getLoginNodeSet() {
        return this.LoginNodeSet;
    }

    /**
     * Set 登录节点概览。
     * @param LoginNodeSet 登录节点概览。
     */
    public void setLoginNodeSet(LoginNodeOverview [] LoginNodeSet) {
        this.LoginNodeSet = LoginNodeSet;
    }

    /**
     * Get 登录节点数量。 
     * @return LoginNodeCount 登录节点数量。
     */
    public Long getLoginNodeCount() {
        return this.LoginNodeCount;
    }

    /**
     * Set 登录节点数量。
     * @param LoginNodeCount 登录节点数量。
     */
    public void setLoginNodeCount(Long LoginNodeCount) {
        this.LoginNodeCount = LoginNodeCount;
    }

    public ClusterOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterOverview(ClusterOverview source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SchedulerType != null) {
            this.SchedulerType = new String(source.SchedulerType);
        }
        if (source.ComputeNodeCount != null) {
            this.ComputeNodeCount = new Long(source.ComputeNodeCount);
        }
        if (source.ComputeNodeSet != null) {
            this.ComputeNodeSet = new ComputeNodeOverview[source.ComputeNodeSet.length];
            for (int i = 0; i < source.ComputeNodeSet.length; i++) {
                this.ComputeNodeSet[i] = new ComputeNodeOverview(source.ComputeNodeSet[i]);
            }
        }
        if (source.ManagerNodeCount != null) {
            this.ManagerNodeCount = new Long(source.ManagerNodeCount);
        }
        if (source.ManagerNodeSet != null) {
            this.ManagerNodeSet = new ManagerNodeOverview[source.ManagerNodeSet.length];
            for (int i = 0; i < source.ManagerNodeSet.length; i++) {
                this.ManagerNodeSet[i] = new ManagerNodeOverview(source.ManagerNodeSet[i]);
            }
        }
        if (source.LoginNodeSet != null) {
            this.LoginNodeSet = new LoginNodeOverview[source.LoginNodeSet.length];
            for (int i = 0; i < source.LoginNodeSet.length; i++) {
                this.LoginNodeSet[i] = new LoginNodeOverview(source.LoginNodeSet[i]);
            }
        }
        if (source.LoginNodeCount != null) {
            this.LoginNodeCount = new Long(source.LoginNodeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SchedulerType", this.SchedulerType);
        this.setParamSimple(map, prefix + "ComputeNodeCount", this.ComputeNodeCount);
        this.setParamArrayObj(map, prefix + "ComputeNodeSet.", this.ComputeNodeSet);
        this.setParamSimple(map, prefix + "ManagerNodeCount", this.ManagerNodeCount);
        this.setParamArrayObj(map, prefix + "ManagerNodeSet.", this.ManagerNodeSet);
        this.setParamArrayObj(map, prefix + "LoginNodeSet.", this.LoginNodeSet);
        this.setParamSimple(map, prefix + "LoginNodeCount", this.LoginNodeCount);

    }
}

