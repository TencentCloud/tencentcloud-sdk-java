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

public class UpdateProbeTaskConfigurationListRequest extends AbstractModel{

    /**
    * 任务 ID
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

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
    * 定时任务cron表达式
    */
    @SerializedName("Cron")
    @Expose
    private String Cron;

    /**
     * Get 任务 ID 
     * @return TaskIds 任务 ID
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 任务 ID
     * @param TaskIds 任务 ID
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
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

    }
}

