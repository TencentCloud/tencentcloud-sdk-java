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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyScheduledSqlRequest extends AbstractModel {

    /**
    * 任务ID，通过[获取定时SQL分析任务列表](https://cloud.tencent.com/document/product/614/95519)获取
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 源日志主题，通过[获取定时SQL分析任务列表](https://cloud.tencent.com/document/product/614/95519)获取
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * 任务启动状态.   1开启,  2关闭
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * 定时SQL分析的目标日志主题
    */
    @SerializedName("DstResource")
    @Expose
    private ScheduledSqlResouceInfo DstResource;

    /**
    * 查询语句
    */
    @SerializedName("ScheduledSqlContent")
    @Expose
    private String ScheduledSqlContent;

    /**
    * 调度周期(分钟)，1~1440分钟
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * 单次查询的时间窗口. 例子中为近15分钟
    */
    @SerializedName("ProcessTimeWindow")
    @Expose
    private String ProcessTimeWindow;

    /**
    * 执行延迟(秒)，0~120秒，默认60秒
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * 源topicId的地域信息,支持地域见(https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
    */
    @SerializedName("SrcTopicRegion")
    @Expose
    private String SrcTopicRegion;

    /**
    * 任务名称，0~255字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 语法规则。 默认值为0。 0：Lucene语法，1：CQL语法
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
     * Get 任务ID，通过[获取定时SQL分析任务列表](https://cloud.tencent.com/document/product/614/95519)获取 
     * @return TaskId 任务ID，通过[获取定时SQL分析任务列表](https://cloud.tencent.com/document/product/614/95519)获取
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID，通过[获取定时SQL分析任务列表](https://cloud.tencent.com/document/product/614/95519)获取
     * @param TaskId 任务ID，通过[获取定时SQL分析任务列表](https://cloud.tencent.com/document/product/614/95519)获取
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 源日志主题，通过[获取定时SQL分析任务列表](https://cloud.tencent.com/document/product/614/95519)获取 
     * @return SrcTopicId 源日志主题，通过[获取定时SQL分析任务列表](https://cloud.tencent.com/document/product/614/95519)获取
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set 源日志主题，通过[获取定时SQL分析任务列表](https://cloud.tencent.com/document/product/614/95519)获取
     * @param SrcTopicId 源日志主题，通过[获取定时SQL分析任务列表](https://cloud.tencent.com/document/product/614/95519)获取
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get 任务启动状态.   1开启,  2关闭 
     * @return EnableFlag 任务启动状态.   1开启,  2关闭
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set 任务启动状态.   1开启,  2关闭
     * @param EnableFlag 任务启动状态.   1开启,  2关闭
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get 定时SQL分析的目标日志主题 
     * @return DstResource 定时SQL分析的目标日志主题
     */
    public ScheduledSqlResouceInfo getDstResource() {
        return this.DstResource;
    }

    /**
     * Set 定时SQL分析的目标日志主题
     * @param DstResource 定时SQL分析的目标日志主题
     */
    public void setDstResource(ScheduledSqlResouceInfo DstResource) {
        this.DstResource = DstResource;
    }

    /**
     * Get 查询语句 
     * @return ScheduledSqlContent 查询语句
     */
    public String getScheduledSqlContent() {
        return this.ScheduledSqlContent;
    }

    /**
     * Set 查询语句
     * @param ScheduledSqlContent 查询语句
     */
    public void setScheduledSqlContent(String ScheduledSqlContent) {
        this.ScheduledSqlContent = ScheduledSqlContent;
    }

    /**
     * Get 调度周期(分钟)，1~1440分钟 
     * @return ProcessPeriod 调度周期(分钟)，1~1440分钟
     */
    public Long getProcessPeriod() {
        return this.ProcessPeriod;
    }

    /**
     * Set 调度周期(分钟)，1~1440分钟
     * @param ProcessPeriod 调度周期(分钟)，1~1440分钟
     */
    public void setProcessPeriod(Long ProcessPeriod) {
        this.ProcessPeriod = ProcessPeriod;
    }

    /**
     * Get 单次查询的时间窗口. 例子中为近15分钟 
     * @return ProcessTimeWindow 单次查询的时间窗口. 例子中为近15分钟
     */
    public String getProcessTimeWindow() {
        return this.ProcessTimeWindow;
    }

    /**
     * Set 单次查询的时间窗口. 例子中为近15分钟
     * @param ProcessTimeWindow 单次查询的时间窗口. 例子中为近15分钟
     */
    public void setProcessTimeWindow(String ProcessTimeWindow) {
        this.ProcessTimeWindow = ProcessTimeWindow;
    }

    /**
     * Get 执行延迟(秒)，0~120秒，默认60秒 
     * @return ProcessDelay 执行延迟(秒)，0~120秒，默认60秒
     */
    public Long getProcessDelay() {
        return this.ProcessDelay;
    }

    /**
     * Set 执行延迟(秒)，0~120秒，默认60秒
     * @param ProcessDelay 执行延迟(秒)，0~120秒，默认60秒
     */
    public void setProcessDelay(Long ProcessDelay) {
        this.ProcessDelay = ProcessDelay;
    }

    /**
     * Get 源topicId的地域信息,支持地域见(https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8) 
     * @return SrcTopicRegion 源topicId的地域信息,支持地域见(https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     */
    public String getSrcTopicRegion() {
        return this.SrcTopicRegion;
    }

    /**
     * Set 源topicId的地域信息,支持地域见(https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     * @param SrcTopicRegion 源topicId的地域信息,支持地域见(https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     */
    public void setSrcTopicRegion(String SrcTopicRegion) {
        this.SrcTopicRegion = SrcTopicRegion;
    }

    /**
     * Get 任务名称，0~255字符 
     * @return Name 任务名称，0~255字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称，0~255字符
     * @param Name 任务名称，0~255字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 语法规则。 默认值为0。 0：Lucene语法，1：CQL语法 
     * @return SyntaxRule 语法规则。 默认值为0。 0：Lucene语法，1：CQL语法
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set 语法规则。 默认值为0。 0：Lucene语法，1：CQL语法
     * @param SyntaxRule 语法规则。 默认值为0。 0：Lucene语法，1：CQL语法
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    public ModifyScheduledSqlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyScheduledSqlRequest(ModifyScheduledSqlRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SrcTopicId != null) {
            this.SrcTopicId = new String(source.SrcTopicId);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.DstResource != null) {
            this.DstResource = new ScheduledSqlResouceInfo(source.DstResource);
        }
        if (source.ScheduledSqlContent != null) {
            this.ScheduledSqlContent = new String(source.ScheduledSqlContent);
        }
        if (source.ProcessPeriod != null) {
            this.ProcessPeriod = new Long(source.ProcessPeriod);
        }
        if (source.ProcessTimeWindow != null) {
            this.ProcessTimeWindow = new String(source.ProcessTimeWindow);
        }
        if (source.ProcessDelay != null) {
            this.ProcessDelay = new Long(source.ProcessDelay);
        }
        if (source.SrcTopicRegion != null) {
            this.SrcTopicRegion = new String(source.SrcTopicRegion);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamObj(map, prefix + "DstResource.", this.DstResource);
        this.setParamSimple(map, prefix + "ScheduledSqlContent", this.ScheduledSqlContent);
        this.setParamSimple(map, prefix + "ProcessPeriod", this.ProcessPeriod);
        this.setParamSimple(map, prefix + "ProcessTimeWindow", this.ProcessTimeWindow);
        this.setParamSimple(map, prefix + "ProcessDelay", this.ProcessDelay);
        this.setParamSimple(map, prefix + "SrcTopicRegion", this.SrcTopicRegion);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);

    }
}

