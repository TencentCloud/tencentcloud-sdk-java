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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerTaskConfiguration extends AbstractModel {

    /**
    * 代码内容的Base64编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeContent")
    @Expose
    private String CodeContent;

    /**
    * 任务扩展属性配置列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskExtConfigurationList")
    @Expose
    private TaskExtParameter [] TaskExtConfigurationList;

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataCluster")
    @Expose
    private String DataCluster;

    /**
    * 指定的运行节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * 资源池队列名称，需要通过 DescribeProjectClusterQueues 获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * 来源数据源ID,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServiceId")
    @Expose
    private String SourceServiceId;

    /**
    * 来源数据源类型,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServiceType")
    @Expose
    private String SourceServiceType;

    /**
    * 来源数据源名称, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServiceName")
    @Expose
    private String SourceServiceName;

    /**
    * 目标数据源ID, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * 目标数据源类型,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServiceType")
    @Expose
    private String TargetServiceType;

    /**
    * 目标数据源名称, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServiceName")
    @Expose
    private String TargetServiceName;

    /**
    * 资源组ID： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * 资源组名称： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 调度参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskSchedulingParameterList")
    @Expose
    private TaskSchedulingParameter [] TaskSchedulingParameterList;

    /**
    * Bundle使用的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Bundle信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
     * Get 代码内容的Base64编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeContent 代码内容的Base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeContent() {
        return this.CodeContent;
    }

    /**
     * Set 代码内容的Base64编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeContent 代码内容的Base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeContent(String CodeContent) {
        this.CodeContent = CodeContent;
    }

    /**
     * Get 任务扩展属性配置列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskExtConfigurationList 任务扩展属性配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskExtParameter [] getTaskExtConfigurationList() {
        return this.TaskExtConfigurationList;
    }

    /**
     * Set 任务扩展属性配置列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskExtConfigurationList 任务扩展属性配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskExtConfigurationList(TaskExtParameter [] TaskExtConfigurationList) {
        this.TaskExtConfigurationList = TaskExtConfigurationList;
    }

    /**
     * Get 集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataCluster 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataCluster() {
        return this.DataCluster;
    }

    /**
     * Set 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataCluster 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataCluster(String DataCluster) {
        this.DataCluster = DataCluster;
    }

    /**
     * Get 指定的运行节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerIp 指定的运行节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set 指定的运行节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerIp 指定的运行节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get 资源池队列名称，需要通过 DescribeProjectClusterQueues 获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YarnQueue 资源池队列名称，需要通过 DescribeProjectClusterQueues 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set 资源池队列名称，需要通过 DescribeProjectClusterQueues 获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param YarnQueue 资源池队列名称，需要通过 DescribeProjectClusterQueues 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get 来源数据源ID,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceServiceId 来源数据源ID,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceServiceId() {
        return this.SourceServiceId;
    }

    /**
     * Set 来源数据源ID,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceServiceId 来源数据源ID,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceServiceId(String SourceServiceId) {
        this.SourceServiceId = SourceServiceId;
    }

    /**
     * Get 来源数据源类型,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceServiceType 来源数据源类型,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceServiceType() {
        return this.SourceServiceType;
    }

    /**
     * Set 来源数据源类型,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceServiceType 来源数据源类型,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceServiceType(String SourceServiceType) {
        this.SourceServiceType = SourceServiceType;
    }

    /**
     * Get 来源数据源名称, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceServiceName 来源数据源名称, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceServiceName() {
        return this.SourceServiceName;
    }

    /**
     * Set 来源数据源名称, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceServiceName 来源数据源名称, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceServiceName(String SourceServiceName) {
        this.SourceServiceName = SourceServiceName;
    }

    /**
     * Get 目标数据源ID, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServiceId 目标数据源ID, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set 目标数据源ID, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServiceId 目标数据源ID, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get 目标数据源类型,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServiceType 目标数据源类型,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServiceType() {
        return this.TargetServiceType;
    }

    /**
     * Set 目标数据源类型,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServiceType 目标数据源类型,  需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServiceType(String TargetServiceType) {
        this.TargetServiceType = TargetServiceType;
    }

    /**
     * Get 目标数据源名称, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServiceName 目标数据源名称, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServiceName() {
        return this.TargetServiceName;
    }

    /**
     * Set 目标数据源名称, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServiceName 目标数据源名称, 需要通过 DescribeDataSourceWithoutInfo 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServiceName(String TargetServiceName) {
        this.TargetServiceName = TargetServiceName;
    }

    /**
     * Get 资源组ID： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroup 资源组ID： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 资源组ID： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupId
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroup 资源组ID： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get 资源组名称： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName 资源组名称： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 资源组名称： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupName
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName 资源组名称： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get 调度参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskSchedulingParameterList 调度参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskSchedulingParameter [] getTaskSchedulingParameterList() {
        return this.TaskSchedulingParameterList;
    }

    /**
     * Set 调度参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskSchedulingParameterList 调度参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskSchedulingParameterList(TaskSchedulingParameter [] TaskSchedulingParameterList) {
        this.TaskSchedulingParameterList = TaskSchedulingParameterList;
    }

    /**
     * Get Bundle使用的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleId Bundle使用的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set Bundle使用的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleId Bundle使用的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Bundle信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleInfo Bundle信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set Bundle信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleInfo Bundle信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    public TriggerTaskConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskConfiguration(TriggerTaskConfiguration source) {
        if (source.CodeContent != null) {
            this.CodeContent = new String(source.CodeContent);
        }
        if (source.TaskExtConfigurationList != null) {
            this.TaskExtConfigurationList = new TaskExtParameter[source.TaskExtConfigurationList.length];
            for (int i = 0; i < source.TaskExtConfigurationList.length; i++) {
                this.TaskExtConfigurationList[i] = new TaskExtParameter(source.TaskExtConfigurationList[i]);
            }
        }
        if (source.DataCluster != null) {
            this.DataCluster = new String(source.DataCluster);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.YarnQueue != null) {
            this.YarnQueue = new String(source.YarnQueue);
        }
        if (source.SourceServiceId != null) {
            this.SourceServiceId = new String(source.SourceServiceId);
        }
        if (source.SourceServiceType != null) {
            this.SourceServiceType = new String(source.SourceServiceType);
        }
        if (source.SourceServiceName != null) {
            this.SourceServiceName = new String(source.SourceServiceName);
        }
        if (source.TargetServiceId != null) {
            this.TargetServiceId = new String(source.TargetServiceId);
        }
        if (source.TargetServiceType != null) {
            this.TargetServiceType = new String(source.TargetServiceType);
        }
        if (source.TargetServiceName != null) {
            this.TargetServiceName = new String(source.TargetServiceName);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.TaskSchedulingParameterList != null) {
            this.TaskSchedulingParameterList = new TaskSchedulingParameter[source.TaskSchedulingParameterList.length];
            for (int i = 0; i < source.TaskSchedulingParameterList.length; i++) {
                this.TaskSchedulingParameterList[i] = new TaskSchedulingParameter(source.TaskSchedulingParameterList[i]);
            }
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CodeContent", this.CodeContent);
        this.setParamArrayObj(map, prefix + "TaskExtConfigurationList.", this.TaskExtConfigurationList);
        this.setParamSimple(map, prefix + "DataCluster", this.DataCluster);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "YarnQueue", this.YarnQueue);
        this.setParamSimple(map, prefix + "SourceServiceId", this.SourceServiceId);
        this.setParamSimple(map, prefix + "SourceServiceType", this.SourceServiceType);
        this.setParamSimple(map, prefix + "SourceServiceName", this.SourceServiceName);
        this.setParamSimple(map, prefix + "TargetServiceId", this.TargetServiceId);
        this.setParamSimple(map, prefix + "TargetServiceType", this.TargetServiceType);
        this.setParamSimple(map, prefix + "TargetServiceName", this.TargetServiceName);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamArrayObj(map, prefix + "TaskSchedulingParameterList.", this.TaskSchedulingParameterList);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);

    }
}

