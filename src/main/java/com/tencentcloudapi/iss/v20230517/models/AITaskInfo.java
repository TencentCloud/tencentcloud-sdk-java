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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AITaskInfo extends AbstractModel{

    /**
    * AI 任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * AI 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * AI 任务描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * AI 任务状态。"on"代表开启了 AI 分析任务，"off"代表停止 AI 分析任务
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 通道 ID 列表
    */
    @SerializedName("ChannelList")
    @Expose
    private String [] ChannelList;

    /**
    * AI 结果回调地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * AI 配置列表
    */
    @SerializedName("Templates")
    @Expose
    private AITemplates [] Templates;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get AI 任务 ID 
     * @return TaskId AI 任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set AI 任务 ID
     * @param TaskId AI 任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get AI 任务名称 
     * @return Name AI 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set AI 任务名称
     * @param Name AI 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get AI 任务描述 
     * @return Desc AI 任务描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set AI 任务描述
     * @param Desc AI 任务描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get AI 任务状态。"on"代表开启了 AI 分析任务，"off"代表停止 AI 分析任务 
     * @return Status AI 任务状态。"on"代表开启了 AI 分析任务，"off"代表停止 AI 分析任务
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set AI 任务状态。"on"代表开启了 AI 分析任务，"off"代表停止 AI 分析任务
     * @param Status AI 任务状态。"on"代表开启了 AI 分析任务，"off"代表停止 AI 分析任务
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 通道 ID 列表 
     * @return ChannelList 通道 ID 列表
     */
    public String [] getChannelList() {
        return this.ChannelList;
    }

    /**
     * Set 通道 ID 列表
     * @param ChannelList 通道 ID 列表
     */
    public void setChannelList(String [] ChannelList) {
        this.ChannelList = ChannelList;
    }

    /**
     * Get AI 结果回调地址 
     * @return CallbackUrl AI 结果回调地址
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set AI 结果回调地址
     * @param CallbackUrl AI 结果回调地址
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get AI 配置列表 
     * @return Templates AI 配置列表
     */
    public AITemplates [] getTemplates() {
        return this.Templates;
    }

    /**
     * Set AI 配置列表
     * @param Templates AI 配置列表
     */
    public void setTemplates(AITemplates [] Templates) {
        this.Templates = Templates;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间 
     * @return UpdatedTime 更新时间
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间
     * @param UpdatedTime 更新时间
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public AITaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AITaskInfo(AITaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ChannelList != null) {
            this.ChannelList = new String[source.ChannelList.length];
            for (int i = 0; i < source.ChannelList.length; i++) {
                this.ChannelList[i] = new String(source.ChannelList[i]);
            }
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.Templates != null) {
            this.Templates = new AITemplates[source.Templates.length];
            for (int i = 0; i < source.Templates.length; i++) {
                this.Templates[i] = new AITemplates(source.Templates[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "ChannelList.", this.ChannelList);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamArrayObj(map, prefix + "Templates.", this.Templates);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

