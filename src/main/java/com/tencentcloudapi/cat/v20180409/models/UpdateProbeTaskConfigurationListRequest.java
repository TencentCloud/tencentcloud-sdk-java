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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateProbeTaskConfigurationListRequest extends AbstractModel {

    /**
    * <p>任务 ID，如task-n1wchki8</p>
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * <p>拨测节点，如10001，详细地区运营商拨测编号请联系云拨测。</p>
    */
    @SerializedName("Nodes")
    @Expose
    private String [] Nodes;

    /**
    * <p>拨测间隔，如30，单位为分钟。</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>拨测参数，详细参数配置可参考云拨测官网文档。</p>
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * <p>定时任务cron表达式</p>
    */
    @SerializedName("Cron")
    @Expose
    private String Cron;

    /**
    * <p>预付费套餐id<br>需要与taskId对应</p>
    */
    @SerializedName("ResourceIDs")
    @Expose
    private String [] ResourceIDs;

    /**
    * <p>拨测节点的IP类型，0-不限，1-IPv4，2-IPv6</p>
    */
    @SerializedName("NodeIpType")
    @Expose
    private Long NodeIpType;

    /**
    * <p>批量任务名-地址</p>
    */
    @SerializedName("BatchTasks")
    @Expose
    private ProbeTaskBasicConfiguration [] BatchTasks;

    /**
     * Get <p>任务 ID，如task-n1wchki8</p> 
     * @return TaskIds <p>任务 ID，如task-n1wchki8</p>
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set <p>任务 ID，如task-n1wchki8</p>
     * @param TaskIds <p>任务 ID，如task-n1wchki8</p>
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get <p>拨测节点，如10001，详细地区运营商拨测编号请联系云拨测。</p> 
     * @return Nodes <p>拨测节点，如10001，详细地区运营商拨测编号请联系云拨测。</p>
     */
    public String [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set <p>拨测节点，如10001，详细地区运营商拨测编号请联系云拨测。</p>
     * @param Nodes <p>拨测节点，如10001，详细地区运营商拨测编号请联系云拨测。</p>
     */
    public void setNodes(String [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get <p>拨测间隔，如30，单位为分钟。</p> 
     * @return Interval <p>拨测间隔，如30，单位为分钟。</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>拨测间隔，如30，单位为分钟。</p>
     * @param Interval <p>拨测间隔，如30，单位为分钟。</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>拨测参数，详细参数配置可参考云拨测官网文档。</p> 
     * @return Parameters <p>拨测参数，详细参数配置可参考云拨测官网文档。</p>
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set <p>拨测参数，详细参数配置可参考云拨测官网文档。</p>
     * @param Parameters <p>拨测参数，详细参数配置可参考云拨测官网文档。</p>
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get <p>定时任务cron表达式</p> 
     * @return Cron <p>定时任务cron表达式</p>
     */
    public String getCron() {
        return this.Cron;
    }

    /**
     * Set <p>定时任务cron表达式</p>
     * @param Cron <p>定时任务cron表达式</p>
     */
    public void setCron(String Cron) {
        this.Cron = Cron;
    }

    /**
     * Get <p>预付费套餐id<br>需要与taskId对应</p> 
     * @return ResourceIDs <p>预付费套餐id<br>需要与taskId对应</p>
     */
    public String [] getResourceIDs() {
        return this.ResourceIDs;
    }

    /**
     * Set <p>预付费套餐id<br>需要与taskId对应</p>
     * @param ResourceIDs <p>预付费套餐id<br>需要与taskId对应</p>
     */
    public void setResourceIDs(String [] ResourceIDs) {
        this.ResourceIDs = ResourceIDs;
    }

    /**
     * Get <p>拨测节点的IP类型，0-不限，1-IPv4，2-IPv6</p> 
     * @return NodeIpType <p>拨测节点的IP类型，0-不限，1-IPv4，2-IPv6</p>
     */
    public Long getNodeIpType() {
        return this.NodeIpType;
    }

    /**
     * Set <p>拨测节点的IP类型，0-不限，1-IPv4，2-IPv6</p>
     * @param NodeIpType <p>拨测节点的IP类型，0-不限，1-IPv4，2-IPv6</p>
     */
    public void setNodeIpType(Long NodeIpType) {
        this.NodeIpType = NodeIpType;
    }

    /**
     * Get <p>批量任务名-地址</p> 
     * @return BatchTasks <p>批量任务名-地址</p>
     */
    public ProbeTaskBasicConfiguration [] getBatchTasks() {
        return this.BatchTasks;
    }

    /**
     * Set <p>批量任务名-地址</p>
     * @param BatchTasks <p>批量任务名-地址</p>
     */
    public void setBatchTasks(ProbeTaskBasicConfiguration [] BatchTasks) {
        this.BatchTasks = BatchTasks;
    }

    public UpdateProbeTaskConfigurationListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateProbeTaskConfigurationListRequest(UpdateProbeTaskConfigurationListRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.Nodes != null) {
            this.Nodes = new String[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new String(source.Nodes[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.Cron != null) {
            this.Cron = new String(source.Cron);
        }
        if (source.ResourceIDs != null) {
            this.ResourceIDs = new String[source.ResourceIDs.length];
            for (int i = 0; i < source.ResourceIDs.length; i++) {
                this.ResourceIDs[i] = new String(source.ResourceIDs[i]);
            }
        }
        if (source.NodeIpType != null) {
            this.NodeIpType = new Long(source.NodeIpType);
        }
        if (source.BatchTasks != null) {
            this.BatchTasks = new ProbeTaskBasicConfiguration[source.BatchTasks.length];
            for (int i = 0; i < source.BatchTasks.length; i++) {
                this.BatchTasks[i] = new ProbeTaskBasicConfiguration(source.BatchTasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArraySimple(map, prefix + "Nodes.", this.Nodes);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "Cron", this.Cron);
        this.setParamArraySimple(map, prefix + "ResourceIDs.", this.ResourceIDs);
        this.setParamSimple(map, prefix + "NodeIpType", this.NodeIpType);
        this.setParamArrayObj(map, prefix + "BatchTasks.", this.BatchTasks);

    }
}

