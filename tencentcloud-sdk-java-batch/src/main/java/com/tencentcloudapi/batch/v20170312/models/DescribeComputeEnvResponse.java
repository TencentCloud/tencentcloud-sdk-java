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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComputeEnvResponse extends AbstractModel{

    /**
    * 计算环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 计算环境名称
    */
    @SerializedName("EnvName")
    @Expose
    private String EnvName;

    /**
    * 位置信息
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 计算环境创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 计算节点列表信息
    */
    @SerializedName("ComputeNodeSet")
    @Expose
    private ComputeNode [] ComputeNodeSet;

    /**
    * 计算节点统计指标
    */
    @SerializedName("ComputeNodeMetrics")
    @Expose
    private ComputeNodeMetrics ComputeNodeMetrics;

    /**
    * 计算节点期望个数
    */
    @SerializedName("DesiredComputeNodeCount")
    @Expose
    private Long DesiredComputeNodeCount;

    /**
    * 计算环境类型
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * 计算环境资源类型，当前为CVM和CPM（黑石）
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 下一步动作
    */
    @SerializedName("NextAction")
    @Expose
    private String NextAction;

    /**
    * 用户添加到计算环境中的计算节点个数
    */
    @SerializedName("AttachedComputeNodeCount")
    @Expose
    private Long AttachedComputeNodeCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 计算环境ID 
     * @return EnvId 计算环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 计算环境ID
     * @param EnvId 计算环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 计算环境名称 
     * @return EnvName 计算环境名称
     */
    public String getEnvName() {
        return this.EnvName;
    }

    /**
     * Set 计算环境名称
     * @param EnvName 计算环境名称
     */
    public void setEnvName(String EnvName) {
        this.EnvName = EnvName;
    }

    /**
     * Get 位置信息 
     * @return Placement 位置信息
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 位置信息
     * @param Placement 位置信息
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 计算环境创建时间 
     * @return CreateTime 计算环境创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 计算环境创建时间
     * @param CreateTime 计算环境创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 计算节点列表信息 
     * @return ComputeNodeSet 计算节点列表信息
     */
    public ComputeNode [] getComputeNodeSet() {
        return this.ComputeNodeSet;
    }

    /**
     * Set 计算节点列表信息
     * @param ComputeNodeSet 计算节点列表信息
     */
    public void setComputeNodeSet(ComputeNode [] ComputeNodeSet) {
        this.ComputeNodeSet = ComputeNodeSet;
    }

    /**
     * Get 计算节点统计指标 
     * @return ComputeNodeMetrics 计算节点统计指标
     */
    public ComputeNodeMetrics getComputeNodeMetrics() {
        return this.ComputeNodeMetrics;
    }

    /**
     * Set 计算节点统计指标
     * @param ComputeNodeMetrics 计算节点统计指标
     */
    public void setComputeNodeMetrics(ComputeNodeMetrics ComputeNodeMetrics) {
        this.ComputeNodeMetrics = ComputeNodeMetrics;
    }

    /**
     * Get 计算节点期望个数 
     * @return DesiredComputeNodeCount 计算节点期望个数
     */
    public Long getDesiredComputeNodeCount() {
        return this.DesiredComputeNodeCount;
    }

    /**
     * Set 计算节点期望个数
     * @param DesiredComputeNodeCount 计算节点期望个数
     */
    public void setDesiredComputeNodeCount(Long DesiredComputeNodeCount) {
        this.DesiredComputeNodeCount = DesiredComputeNodeCount;
    }

    /**
     * Get 计算环境类型 
     * @return EnvType 计算环境类型
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set 计算环境类型
     * @param EnvType 计算环境类型
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get 计算环境资源类型，当前为CVM和CPM（黑石） 
     * @return ResourceType 计算环境资源类型，当前为CVM和CPM（黑石）
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 计算环境资源类型，当前为CVM和CPM（黑石）
     * @param ResourceType 计算环境资源类型，当前为CVM和CPM（黑石）
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 下一步动作 
     * @return NextAction 下一步动作
     */
    public String getNextAction() {
        return this.NextAction;
    }

    /**
     * Set 下一步动作
     * @param NextAction 下一步动作
     */
    public void setNextAction(String NextAction) {
        this.NextAction = NextAction;
    }

    /**
     * Get 用户添加到计算环境中的计算节点个数 
     * @return AttachedComputeNodeCount 用户添加到计算环境中的计算节点个数
     */
    public Long getAttachedComputeNodeCount() {
        return this.AttachedComputeNodeCount;
    }

    /**
     * Set 用户添加到计算环境中的计算节点个数
     * @param AttachedComputeNodeCount 用户添加到计算环境中的计算节点个数
     */
    public void setAttachedComputeNodeCount(Long AttachedComputeNodeCount) {
        this.AttachedComputeNodeCount = AttachedComputeNodeCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "EnvName", this.EnvName);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "ComputeNodeSet.", this.ComputeNodeSet);
        this.setParamObj(map, prefix + "ComputeNodeMetrics.", this.ComputeNodeMetrics);
        this.setParamSimple(map, prefix + "DesiredComputeNodeCount", this.DesiredComputeNodeCount);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "NextAction", this.NextAction);
        this.setParamSimple(map, prefix + "AttachedComputeNodeCount", this.AttachedComputeNodeCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

