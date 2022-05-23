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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProbeTasksRequest extends AbstractModel{

    /**
    * 批量任务名-地址
    */
    @SerializedName("BatchTasks")
    @Expose
    private ProbeTaskBasicConfiguration [] BatchTasks;

    /**
    * 任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 拨测节点
    */
    @SerializedName("Nodes")
    @Expose
    private String [] Nodes;

    /**
    * 拨测间隔
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 拨测参数
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * 任务分类
<li>1 = PC</li>
<li> 2 = Mobile </li>
    */
    @SerializedName("TaskCategory")
    @Expose
    private Long TaskCategory;

    /**
    * 定时任务cron表达式
    */
    @SerializedName("Cron")
    @Expose
    private String Cron;

    /**
    * 资源标签值
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * 测试类型，包含定时测试与即时测试
    */
    @SerializedName("ProbeType")
    @Expose
    private Long ProbeType;

    /**
    * 插件类型
    */
    @SerializedName("PluginSource")
    @Expose
    private String PluginSource;

    /**
    * 客户度ID
    */
    @SerializedName("ClientNum")
    @Expose
    private String ClientNum;

    /**
     * Get 批量任务名-地址 
     * @return BatchTasks 批量任务名-地址
     */
    public ProbeTaskBasicConfiguration [] getBatchTasks() {
        return this.BatchTasks;
    }

    /**
     * Set 批量任务名-地址
     * @param BatchTasks 批量任务名-地址
     */
    public void setBatchTasks(ProbeTaskBasicConfiguration [] BatchTasks) {
        this.BatchTasks = BatchTasks;
    }

    /**
     * Get 任务类型 
     * @return TaskType 任务类型
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
     * @param TaskType 任务类型
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 拨测节点 
     * @return Nodes 拨测节点
     */
    public String [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 拨测节点
     * @param Nodes 拨测节点
     */
    public void setNodes(String [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get 拨测间隔 
     * @return Interval 拨测间隔
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 拨测间隔
     * @param Interval 拨测间隔
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 拨测参数 
     * @return Parameters 拨测参数
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 拨测参数
     * @param Parameters 拨测参数
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 任务分类
<li>1 = PC</li>
<li> 2 = Mobile </li> 
     * @return TaskCategory 任务分类
<li>1 = PC</li>
<li> 2 = Mobile </li>
     */
    public Long getTaskCategory() {
        return this.TaskCategory;
    }

    /**
     * Set 任务分类
<li>1 = PC</li>
<li> 2 = Mobile </li>
     * @param TaskCategory 任务分类
<li>1 = PC</li>
<li> 2 = Mobile </li>
     */
    public void setTaskCategory(Long TaskCategory) {
        this.TaskCategory = TaskCategory;
    }

    /**
     * Get 定时任务cron表达式 
     * @return Cron 定时任务cron表达式
     */
    public String getCron() {
        return this.Cron;
    }

    /**
     * Set 定时任务cron表达式
     * @param Cron 定时任务cron表达式
     */
    public void setCron(String Cron) {
        this.Cron = Cron;
    }

    /**
     * Get 资源标签值 
     * @return Tag 资源标签值
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 资源标签值
     * @param Tag 资源标签值
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 测试类型，包含定时测试与即时测试 
     * @return ProbeType 测试类型，包含定时测试与即时测试
     */
    public Long getProbeType() {
        return this.ProbeType;
    }

    /**
     * Set 测试类型，包含定时测试与即时测试
     * @param ProbeType 测试类型，包含定时测试与即时测试
     */
    public void setProbeType(Long ProbeType) {
        this.ProbeType = ProbeType;
    }

    /**
     * Get 插件类型 
     * @return PluginSource 插件类型
     */
    public String getPluginSource() {
        return this.PluginSource;
    }

    /**
     * Set 插件类型
     * @param PluginSource 插件类型
     */
    public void setPluginSource(String PluginSource) {
        this.PluginSource = PluginSource;
    }

    /**
     * Get 客户度ID 
     * @return ClientNum 客户度ID
     */
    public String getClientNum() {
        return this.ClientNum;
    }

    /**
     * Set 客户度ID
     * @param ClientNum 客户度ID
     */
    public void setClientNum(String ClientNum) {
        this.ClientNum = ClientNum;
    }

    public CreateProbeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProbeTasksRequest(CreateProbeTasksRequest source) {
        if (source.BatchTasks != null) {
            this.BatchTasks = new ProbeTaskBasicConfiguration[source.BatchTasks.length];
            for (int i = 0; i < source.BatchTasks.length; i++) {
                this.BatchTasks[i] = new ProbeTaskBasicConfiguration(source.BatchTasks[i]);
            }
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
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
        if (source.TaskCategory != null) {
            this.TaskCategory = new Long(source.TaskCategory);
        }
        if (source.Cron != null) {
            this.Cron = new String(source.Cron);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.ProbeType != null) {
            this.ProbeType = new Long(source.ProbeType);
        }
        if (source.PluginSource != null) {
            this.PluginSource = new String(source.PluginSource);
        }
        if (source.ClientNum != null) {
            this.ClientNum = new String(source.ClientNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BatchTasks.", this.BatchTasks);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "Nodes.", this.Nodes);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "TaskCategory", this.TaskCategory);
        this.setParamSimple(map, prefix + "Cron", this.Cron);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "ProbeType", this.ProbeType);
        this.setParamSimple(map, prefix + "PluginSource", this.PluginSource);
        this.setParamSimple(map, prefix + "ClientNum", this.ClientNum);

    }
}

