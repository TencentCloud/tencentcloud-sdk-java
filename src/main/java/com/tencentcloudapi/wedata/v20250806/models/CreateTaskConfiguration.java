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

public class CreateTaskConfiguration extends AbstractModel {

    /**
    * 资源组ID： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupId
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * 代码内容的Base64编码
    */
    @SerializedName("CodeContent")
    @Expose
    private String CodeContent;

    /**
    * 任务扩展属性配置列表
    */
    @SerializedName("TaskExtConfigurationList")
    @Expose
    private TaskExtParameter [] TaskExtConfigurationList;

    /**
    * 集群ID
    */
    @SerializedName("DataCluster")
    @Expose
    private String DataCluster;

    /**
    * 指定的运行节点
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * 资源池队列名称，需要通过 DescribeProjectClusterQueues 获取
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * 来源数据源ID, 使用 ; 分隔, 需要通过 DescribeDataSourceWithoutInfo 获取
    */
    @SerializedName("SourceServiceId")
    @Expose
    private String SourceServiceId;

    /**
    * 目标数据源ID, 使用 ; 分隔, 需要通过 DescribeDataSourceWithoutInfo 获取
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * 调度参数
    */
    @SerializedName("TaskSchedulingParameterList")
    @Expose
    private TaskSchedulingParameter [] TaskSchedulingParameterList;

    /**
    * Bundle使用的ID
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Bundle信息
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
     * Get 资源组ID： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupId 
     * @return ResourceGroup 资源组ID： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupId
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 资源组ID： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupId
     * @param ResourceGroup 资源组ID： 需要通过 DescribeNormalSchedulerExecutorGroups 获取 ExecutorGroupId
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get 代码内容的Base64编码 
     * @return CodeContent 代码内容的Base64编码
     */
    public String getCodeContent() {
        return this.CodeContent;
    }

    /**
     * Set 代码内容的Base64编码
     * @param CodeContent 代码内容的Base64编码
     */
    public void setCodeContent(String CodeContent) {
        this.CodeContent = CodeContent;
    }

    /**
     * Get 任务扩展属性配置列表 
     * @return TaskExtConfigurationList 任务扩展属性配置列表
     */
    public TaskExtParameter [] getTaskExtConfigurationList() {
        return this.TaskExtConfigurationList;
    }

    /**
     * Set 任务扩展属性配置列表
     * @param TaskExtConfigurationList 任务扩展属性配置列表
     */
    public void setTaskExtConfigurationList(TaskExtParameter [] TaskExtConfigurationList) {
        this.TaskExtConfigurationList = TaskExtConfigurationList;
    }

    /**
     * Get 集群ID 
     * @return DataCluster 集群ID
     */
    public String getDataCluster() {
        return this.DataCluster;
    }

    /**
     * Set 集群ID
     * @param DataCluster 集群ID
     */
    public void setDataCluster(String DataCluster) {
        this.DataCluster = DataCluster;
    }

    /**
     * Get 指定的运行节点 
     * @return BrokerIp 指定的运行节点
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set 指定的运行节点
     * @param BrokerIp 指定的运行节点
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get 资源池队列名称，需要通过 DescribeProjectClusterQueues 获取 
     * @return YarnQueue 资源池队列名称，需要通过 DescribeProjectClusterQueues 获取
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set 资源池队列名称，需要通过 DescribeProjectClusterQueues 获取
     * @param YarnQueue 资源池队列名称，需要通过 DescribeProjectClusterQueues 获取
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get 来源数据源ID, 使用 ; 分隔, 需要通过 DescribeDataSourceWithoutInfo 获取 
     * @return SourceServiceId 来源数据源ID, 使用 ; 分隔, 需要通过 DescribeDataSourceWithoutInfo 获取
     */
    public String getSourceServiceId() {
        return this.SourceServiceId;
    }

    /**
     * Set 来源数据源ID, 使用 ; 分隔, 需要通过 DescribeDataSourceWithoutInfo 获取
     * @param SourceServiceId 来源数据源ID, 使用 ; 分隔, 需要通过 DescribeDataSourceWithoutInfo 获取
     */
    public void setSourceServiceId(String SourceServiceId) {
        this.SourceServiceId = SourceServiceId;
    }

    /**
     * Get 目标数据源ID, 使用 ; 分隔, 需要通过 DescribeDataSourceWithoutInfo 获取 
     * @return TargetServiceId 目标数据源ID, 使用 ; 分隔, 需要通过 DescribeDataSourceWithoutInfo 获取
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set 目标数据源ID, 使用 ; 分隔, 需要通过 DescribeDataSourceWithoutInfo 获取
     * @param TargetServiceId 目标数据源ID, 使用 ; 分隔, 需要通过 DescribeDataSourceWithoutInfo 获取
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get 调度参数 
     * @return TaskSchedulingParameterList 调度参数
     */
    public TaskSchedulingParameter [] getTaskSchedulingParameterList() {
        return this.TaskSchedulingParameterList;
    }

    /**
     * Set 调度参数
     * @param TaskSchedulingParameterList 调度参数
     */
    public void setTaskSchedulingParameterList(TaskSchedulingParameter [] TaskSchedulingParameterList) {
        this.TaskSchedulingParameterList = TaskSchedulingParameterList;
    }

    /**
     * Get Bundle使用的ID 
     * @return BundleId Bundle使用的ID
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set Bundle使用的ID
     * @param BundleId Bundle使用的ID
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Bundle信息 
     * @return BundleInfo Bundle信息
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set Bundle信息
     * @param BundleInfo Bundle信息
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    public CreateTaskConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskConfiguration(CreateTaskConfiguration source) {
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
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
        if (source.TargetServiceId != null) {
            this.TargetServiceId = new String(source.TargetServiceId);
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
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "CodeContent", this.CodeContent);
        this.setParamArrayObj(map, prefix + "TaskExtConfigurationList.", this.TaskExtConfigurationList);
        this.setParamSimple(map, prefix + "DataCluster", this.DataCluster);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "YarnQueue", this.YarnQueue);
        this.setParamSimple(map, prefix + "SourceServiceId", this.SourceServiceId);
        this.setParamSimple(map, prefix + "TargetServiceId", this.TargetServiceId);
        this.setParamArrayObj(map, prefix + "TaskSchedulingParameterList.", this.TaskSchedulingParameterList);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);

    }
}

