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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDataTransformRequest extends AbstractModel{

    /**
    * 加工任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 加工任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 加工逻辑函数
    */
    @SerializedName("EtlContent")
    @Expose
    private String EtlContent;

    /**
    * 任务启动状态. 默认为1，正常开启,  2关闭
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * 加工任务目的topic_id以及别名
    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
     * Get 加工任务id 
     * @return TaskId 加工任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 加工任务id
     * @param TaskId 加工任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 加工任务名称 
     * @return Name 加工任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 加工任务名称
     * @param Name 加工任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 加工逻辑函数 
     * @return EtlContent 加工逻辑函数
     */
    public String getEtlContent() {
        return this.EtlContent;
    }

    /**
     * Set 加工逻辑函数
     * @param EtlContent 加工逻辑函数
     */
    public void setEtlContent(String EtlContent) {
        this.EtlContent = EtlContent;
    }

    /**
     * Get 任务启动状态. 默认为1，正常开启,  2关闭 
     * @return EnableFlag 任务启动状态. 默认为1，正常开启,  2关闭
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set 任务启动状态. 默认为1，正常开启,  2关闭
     * @param EnableFlag 任务启动状态. 默认为1，正常开启,  2关闭
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get 加工任务目的topic_id以及别名 
     * @return DstResources 加工任务目的topic_id以及别名
     */
    public DataTransformResouceInfo [] getDstResources() {
        return this.DstResources;
    }

    /**
     * Set 加工任务目的topic_id以及别名
     * @param DstResources 加工任务目的topic_id以及别名
     */
    public void setDstResources(DataTransformResouceInfo [] DstResources) {
        this.DstResources = DstResources;
    }

    public ModifyDataTransformRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDataTransformRequest(ModifyDataTransformRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EtlContent != null) {
            this.EtlContent = new String(source.EtlContent);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.DstResources != null) {
            this.DstResources = new DataTransformResouceInfo[source.DstResources.length];
            for (int i = 0; i < source.DstResources.length; i++) {
                this.DstResources[i] = new DataTransformResouceInfo(source.DstResources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);

    }
}

