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
    * 任务类型. 1: 指定主题；2:动态创建
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
    * 加工语句
    */
    @SerializedName("EtlContent")
    @Expose
    private String EtlContent;

    /**
    * 加工类型  1 使用源日志主题中的随机数据，进行加工预览 :2 使用用户自定义测试数据，进行加工预览 3 创建真实加工任务
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 任务启动状态.   默认为1:开启,  2:关闭
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * 加工任务目的topic_id以及别名,当FuncType=1时，该参数必填，当FuncType=2时，无需填写
    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
    * 用于预览加工结果的测试数据
    */
    @SerializedName("PreviewLogStatistics")
    @Expose
    private PreviewLogStatistic [] PreviewLogStatistics;

    /**
     * Get 任务类型. 1: 指定主题；2:动态创建 
     * @return FuncType 任务类型. 1: 指定主题；2:动态创建
     */
    public Long getFuncType() {
        return this.FuncType;
    }

    /**
     * Set 任务类型. 1: 指定主题；2:动态创建
     * @param FuncType 任务类型. 1: 指定主题；2:动态创建
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
     * Get 加工语句 
     * @return EtlContent 加工语句
     */
    public String getEtlContent() {
        return this.EtlContent;
    }

    /**
     * Set 加工语句
     * @param EtlContent 加工语句
     */
    public void setEtlContent(String EtlContent) {
        this.EtlContent = EtlContent;
    }

    /**
     * Get 加工类型  1 使用源日志主题中的随机数据，进行加工预览 :2 使用用户自定义测试数据，进行加工预览 3 创建真实加工任务 
     * @return TaskType 加工类型  1 使用源日志主题中的随机数据，进行加工预览 :2 使用用户自定义测试数据，进行加工预览 3 创建真实加工任务
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 加工类型  1 使用源日志主题中的随机数据，进行加工预览 :2 使用用户自定义测试数据，进行加工预览 3 创建真实加工任务
     * @param TaskType 加工类型  1 使用源日志主题中的随机数据，进行加工预览 :2 使用用户自定义测试数据，进行加工预览 3 创建真实加工任务
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务启动状态.   默认为1:开启,  2:关闭 
     * @return EnableFlag 任务启动状态.   默认为1:开启,  2:关闭
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set 任务启动状态.   默认为1:开启,  2:关闭
     * @param EnableFlag 任务启动状态.   默认为1:开启,  2:关闭
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get 加工任务目的topic_id以及别名,当FuncType=1时，该参数必填，当FuncType=2时，无需填写 
     * @return DstResources 加工任务目的topic_id以及别名,当FuncType=1时，该参数必填，当FuncType=2时，无需填写
     */
    public DataTransformResouceInfo [] getDstResources() {
        return this.DstResources;
    }

    /**
     * Set 加工任务目的topic_id以及别名,当FuncType=1时，该参数必填，当FuncType=2时，无需填写
     * @param DstResources 加工任务目的topic_id以及别名,当FuncType=1时，该参数必填，当FuncType=2时，无需填写
     */
    public void setDstResources(DataTransformResouceInfo [] DstResources) {
        this.DstResources = DstResources;
    }

    /**
     * Get 用于预览加工结果的测试数据 
     * @return PreviewLogStatistics 用于预览加工结果的测试数据
     */
    public PreviewLogStatistic [] getPreviewLogStatistics() {
        return this.PreviewLogStatistics;
    }

    /**
     * Set 用于预览加工结果的测试数据
     * @param PreviewLogStatistics 用于预览加工结果的测试数据
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
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
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
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamArrayObj(map, prefix + "PreviewLogStatistics.", this.PreviewLogStatistics);

    }
}

