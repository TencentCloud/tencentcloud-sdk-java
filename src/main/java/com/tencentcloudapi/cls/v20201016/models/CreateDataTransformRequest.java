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

public class CreateDataTransformRequest extends AbstractModel{

    /**
    * 函数类型. DSL:1 SQL:2
    */
    @SerializedName("FuncType")
    @Expose
    private Long FuncType;

    /**
    * 源日志主题
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

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
    * 加工任务目的topic_id以及别名
    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
    * 任务类型.  以SrcTopicId为数据源建立预览任务:1，以PreviewLogStatistics为数据源建立预览任务:2  真实任务:3
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 任务启动状态.   默认为1，正常开启,  2关闭
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * 测试数据
    */
    @SerializedName("PreviewLogStatistics")
    @Expose
    private PreviewLogStatistic [] PreviewLogStatistics;

    /**
     * Get 函数类型. DSL:1 SQL:2 
     * @return FuncType 函数类型. DSL:1 SQL:2
     */
    public Long getFuncType() {
        return this.FuncType;
    }

    /**
     * Set 函数类型. DSL:1 SQL:2
     * @param FuncType 函数类型. DSL:1 SQL:2
     */
    public void setFuncType(Long FuncType) {
        this.FuncType = FuncType;
    }

    /**
     * Get 源日志主题 
     * @return SrcTopicId 源日志主题
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set 源日志主题
     * @param SrcTopicId 源日志主题
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
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

    /**
     * Get 任务类型.  以SrcTopicId为数据源建立预览任务:1，以PreviewLogStatistics为数据源建立预览任务:2  真实任务:3 
     * @return TaskType 任务类型.  以SrcTopicId为数据源建立预览任务:1，以PreviewLogStatistics为数据源建立预览任务:2  真实任务:3
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型.  以SrcTopicId为数据源建立预览任务:1，以PreviewLogStatistics为数据源建立预览任务:2  真实任务:3
     * @param TaskType 任务类型.  以SrcTopicId为数据源建立预览任务:1，以PreviewLogStatistics为数据源建立预览任务:2  真实任务:3
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务启动状态.   默认为1，正常开启,  2关闭 
     * @return EnableFlag 任务启动状态.   默认为1，正常开启,  2关闭
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set 任务启动状态.   默认为1，正常开启,  2关闭
     * @param EnableFlag 任务启动状态.   默认为1，正常开启,  2关闭
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get 测试数据 
     * @return PreviewLogStatistics 测试数据
     */
    public PreviewLogStatistic [] getPreviewLogStatistics() {
        return this.PreviewLogStatistics;
    }

    /**
     * Set 测试数据
     * @param PreviewLogStatistics 测试数据
     */
    public void setPreviewLogStatistics(PreviewLogStatistic [] PreviewLogStatistics) {
        this.PreviewLogStatistics = PreviewLogStatistics;
    }

    public CreateDataTransformRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataTransformRequest(CreateDataTransformRequest source) {
        if (source.FuncType != null) {
            this.FuncType = new Long(source.FuncType);
        }
        if (source.SrcTopicId != null) {
            this.SrcTopicId = new String(source.SrcTopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EtlContent != null) {
            this.EtlContent = new String(source.EtlContent);
        }
        if (source.DstResources != null) {
            this.DstResources = new DataTransformResouceInfo[source.DstResources.length];
            for (int i = 0; i < source.DstResources.length; i++) {
                this.DstResources[i] = new DataTransformResouceInfo(source.DstResources[i]);
            }
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.PreviewLogStatistics != null) {
            this.PreviewLogStatistics = new PreviewLogStatistic[source.PreviewLogStatistics.length];
            for (int i = 0; i < source.PreviewLogStatistics.length; i++) {
                this.PreviewLogStatistics[i] = new PreviewLogStatistic(source.PreviewLogStatistics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FuncType", this.FuncType);
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamArrayObj(map, prefix + "PreviewLogStatistics.", this.PreviewLogStatistics);

    }
}

