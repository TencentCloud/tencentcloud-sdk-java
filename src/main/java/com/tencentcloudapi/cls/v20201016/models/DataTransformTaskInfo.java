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

public class DataTransformTaskInfo extends AbstractModel {

    /**
    * <p>数据加工任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数据加工任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务启用状态，默认为1，正常开启,  2关闭</p>
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * <p>加工任务类型，1： DSL(使用自定义加工语言的加工任务)， 2：SQL(使用sql的加工任务)</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>源日志主题ID,当DataTransformType=1,代表当前任务的类型是前置加工任务,该值和目标日志主题的ID值相同.</p>
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * <p>当前加工任务状态（1准备中/2运行中/3停止中/4已停止）</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近修改时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>最后启用时间，如果需要重建集群，修改该时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("LastEnableTime")
    @Expose
    private String LastEnableTime;

    /**
    * <p>源日志主题名称,当DataTransformType=1,代表当前任务的类型是前置加工任务,该值和目标日志主题名称的值相同.</p>
    */
    @SerializedName("SrcTopicName")
    @Expose
    private String SrcTopicName;

    /**
    * <p>日志集id</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>加工任务目的topic_id以及别名</p>
    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
    * <p>加工逻辑函数。</p>
    */
    @SerializedName("EtlContent")
    @Expose
    private String EtlContent;

    /**
    * <p>兜底topic_id</p>
    */
    @SerializedName("BackupTopicID")
    @Expose
    private String BackupTopicID;

    /**
    * <p>超限之后是否丢弃日志数据</p>
    */
    @SerializedName("BackupGiveUpData")
    @Expose
    private Boolean BackupGiveUpData;

    /**
    * <p>是否开启投递服务日志。 1关闭,2开启</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>任务目标日志主题数量</p>
    */
    @SerializedName("TaskDstCount")
    @Expose
    private Long TaskDstCount;

    /**
    * <p>数据加工类型。0：标准加工任务；1：前置加工任务。当该值=1时, 源日志主题和目标日志主题的名称和ID相同.</p><p>枚举值：</p><ul><li>1： 前置加工任务</li><li>0： 标准加工任务</li></ul>
    */
    @SerializedName("DataTransformType")
    @Expose
    private Long DataTransformType;

    /**
    * <p>保留失败日志状态。 1:不保留，2:保留</p>
    */
    @SerializedName("KeepFailureLog")
    @Expose
    private Long KeepFailureLog;

    /**
    * <p>失败日志的字段名称</p>
    */
    @SerializedName("FailureLogKey")
    @Expose
    private String FailureLogKey;

    /**
    * <p>指定加工数据的开始时间，秒级时间戳。</p><ul><li>日志主题生命周期内的任意时间范围，如果超出了生命周期,只处理生命周期内有数据的部分。</li></ul>
    */
    @SerializedName("ProcessFromTimestamp")
    @Expose
    private Long ProcessFromTimestamp;

    /**
    * <p>指定加工数据的结束时间，秒级时间戳。</p><ol><li>不可指定未来的时间</li><li>不填则表示持续执行</li></ol>
    */
    @SerializedName("ProcessToTimestamp")
    @Expose
    private Long ProcessToTimestamp;

    /**
    * <p>sql数据源信息</p>
    */
    @SerializedName("DataTransformSqlDataSources")
    @Expose
    private DataTransformSqlDataSource [] DataTransformSqlDataSources;

    /**
    * <p>环境变量</p>
    */
    @SerializedName("EnvInfos")
    @Expose
    private EnvInfo [] EnvInfos;

    /**
     * Get <p>数据加工任务名称</p> 
     * @return Name <p>数据加工任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据加工任务名称</p>
     * @param Name <p>数据加工任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>数据加工任务id</p> 
     * @return TaskId <p>数据加工任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>数据加工任务id</p>
     * @param TaskId <p>数据加工任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务启用状态，默认为1，正常开启,  2关闭</p> 
     * @return EnableFlag <p>任务启用状态，默认为1，正常开启,  2关闭</p>
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set <p>任务启用状态，默认为1，正常开启,  2关闭</p>
     * @param EnableFlag <p>任务启用状态，默认为1，正常开启,  2关闭</p>
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get <p>加工任务类型，1： DSL(使用自定义加工语言的加工任务)， 2：SQL(使用sql的加工任务)</p> 
     * @return Type <p>加工任务类型，1： DSL(使用自定义加工语言的加工任务)， 2：SQL(使用sql的加工任务)</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>加工任务类型，1： DSL(使用自定义加工语言的加工任务)， 2：SQL(使用sql的加工任务)</p>
     * @param Type <p>加工任务类型，1： DSL(使用自定义加工语言的加工任务)， 2：SQL(使用sql的加工任务)</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>源日志主题ID,当DataTransformType=1,代表当前任务的类型是前置加工任务,该值和目标日志主题的ID值相同.</p> 
     * @return SrcTopicId <p>源日志主题ID,当DataTransformType=1,代表当前任务的类型是前置加工任务,该值和目标日志主题的ID值相同.</p>
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set <p>源日志主题ID,当DataTransformType=1,代表当前任务的类型是前置加工任务,该值和目标日志主题的ID值相同.</p>
     * @param SrcTopicId <p>源日志主题ID,当DataTransformType=1,代表当前任务的类型是前置加工任务,该值和目标日志主题的ID值相同.</p>
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get <p>当前加工任务状态（1准备中/2运行中/3停止中/4已停止）</p> 
     * @return Status <p>当前加工任务状态（1准备中/2运行中/3停止中/4已停止）</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>当前加工任务状态（1准备中/2运行中/3停止中/4已停止）</p>
     * @param Status <p>当前加工任务状态（1准备中/2运行中/3停止中/4已停止）</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p> 
     * @return CreateTime <p>创建时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     * @param CreateTime <p>创建时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近修改时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p> 
     * @return UpdateTime <p>最近修改时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最近修改时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     * @param UpdateTime <p>最近修改时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>最后启用时间，如果需要重建集群，修改该时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p> 
     * @return LastEnableTime <p>最后启用时间，如果需要重建集群，修改该时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public String getLastEnableTime() {
        return this.LastEnableTime;
    }

    /**
     * Set <p>最后启用时间，如果需要重建集群，修改该时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     * @param LastEnableTime <p>最后启用时间，如果需要重建集群，修改该时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public void setLastEnableTime(String LastEnableTime) {
        this.LastEnableTime = LastEnableTime;
    }

    /**
     * Get <p>源日志主题名称,当DataTransformType=1,代表当前任务的类型是前置加工任务,该值和目标日志主题名称的值相同.</p> 
     * @return SrcTopicName <p>源日志主题名称,当DataTransformType=1,代表当前任务的类型是前置加工任务,该值和目标日志主题名称的值相同.</p>
     */
    public String getSrcTopicName() {
        return this.SrcTopicName;
    }

    /**
     * Set <p>源日志主题名称,当DataTransformType=1,代表当前任务的类型是前置加工任务,该值和目标日志主题名称的值相同.</p>
     * @param SrcTopicName <p>源日志主题名称,当DataTransformType=1,代表当前任务的类型是前置加工任务,该值和目标日志主题名称的值相同.</p>
     */
    public void setSrcTopicName(String SrcTopicName) {
        this.SrcTopicName = SrcTopicName;
    }

    /**
     * Get <p>日志集id</p> 
     * @return LogsetId <p>日志集id</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集id</p>
     * @param LogsetId <p>日志集id</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>加工任务目的topic_id以及别名</p> 
     * @return DstResources <p>加工任务目的topic_id以及别名</p>
     */
    public DataTransformResouceInfo [] getDstResources() {
        return this.DstResources;
    }

    /**
     * Set <p>加工任务目的topic_id以及别名</p>
     * @param DstResources <p>加工任务目的topic_id以及别名</p>
     */
    public void setDstResources(DataTransformResouceInfo [] DstResources) {
        this.DstResources = DstResources;
    }

    /**
     * Get <p>加工逻辑函数。</p> 
     * @return EtlContent <p>加工逻辑函数。</p>
     */
    public String getEtlContent() {
        return this.EtlContent;
    }

    /**
     * Set <p>加工逻辑函数。</p>
     * @param EtlContent <p>加工逻辑函数。</p>
     */
    public void setEtlContent(String EtlContent) {
        this.EtlContent = EtlContent;
    }

    /**
     * Get <p>兜底topic_id</p> 
     * @return BackupTopicID <p>兜底topic_id</p>
     */
    public String getBackupTopicID() {
        return this.BackupTopicID;
    }

    /**
     * Set <p>兜底topic_id</p>
     * @param BackupTopicID <p>兜底topic_id</p>
     */
    public void setBackupTopicID(String BackupTopicID) {
        this.BackupTopicID = BackupTopicID;
    }

    /**
     * Get <p>超限之后是否丢弃日志数据</p> 
     * @return BackupGiveUpData <p>超限之后是否丢弃日志数据</p>
     */
    public Boolean getBackupGiveUpData() {
        return this.BackupGiveUpData;
    }

    /**
     * Set <p>超限之后是否丢弃日志数据</p>
     * @param BackupGiveUpData <p>超限之后是否丢弃日志数据</p>
     */
    public void setBackupGiveUpData(Boolean BackupGiveUpData) {
        this.BackupGiveUpData = BackupGiveUpData;
    }

    /**
     * Get <p>是否开启投递服务日志。 1关闭,2开启</p> 
     * @return HasServicesLog <p>是否开启投递服务日志。 1关闭,2开启</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>是否开启投递服务日志。 1关闭,2开启</p>
     * @param HasServicesLog <p>是否开启投递服务日志。 1关闭,2开启</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get <p>任务目标日志主题数量</p> 
     * @return TaskDstCount <p>任务目标日志主题数量</p>
     */
    public Long getTaskDstCount() {
        return this.TaskDstCount;
    }

    /**
     * Set <p>任务目标日志主题数量</p>
     * @param TaskDstCount <p>任务目标日志主题数量</p>
     */
    public void setTaskDstCount(Long TaskDstCount) {
        this.TaskDstCount = TaskDstCount;
    }

    /**
     * Get <p>数据加工类型。0：标准加工任务；1：前置加工任务。当该值=1时, 源日志主题和目标日志主题的名称和ID相同.</p><p>枚举值：</p><ul><li>1： 前置加工任务</li><li>0： 标准加工任务</li></ul> 
     * @return DataTransformType <p>数据加工类型。0：标准加工任务；1：前置加工任务。当该值=1时, 源日志主题和目标日志主题的名称和ID相同.</p><p>枚举值：</p><ul><li>1： 前置加工任务</li><li>0： 标准加工任务</li></ul>
     */
    public Long getDataTransformType() {
        return this.DataTransformType;
    }

    /**
     * Set <p>数据加工类型。0：标准加工任务；1：前置加工任务。当该值=1时, 源日志主题和目标日志主题的名称和ID相同.</p><p>枚举值：</p><ul><li>1： 前置加工任务</li><li>0： 标准加工任务</li></ul>
     * @param DataTransformType <p>数据加工类型。0：标准加工任务；1：前置加工任务。当该值=1时, 源日志主题和目标日志主题的名称和ID相同.</p><p>枚举值：</p><ul><li>1： 前置加工任务</li><li>0： 标准加工任务</li></ul>
     */
    public void setDataTransformType(Long DataTransformType) {
        this.DataTransformType = DataTransformType;
    }

    /**
     * Get <p>保留失败日志状态。 1:不保留，2:保留</p> 
     * @return KeepFailureLog <p>保留失败日志状态。 1:不保留，2:保留</p>
     */
    public Long getKeepFailureLog() {
        return this.KeepFailureLog;
    }

    /**
     * Set <p>保留失败日志状态。 1:不保留，2:保留</p>
     * @param KeepFailureLog <p>保留失败日志状态。 1:不保留，2:保留</p>
     */
    public void setKeepFailureLog(Long KeepFailureLog) {
        this.KeepFailureLog = KeepFailureLog;
    }

    /**
     * Get <p>失败日志的字段名称</p> 
     * @return FailureLogKey <p>失败日志的字段名称</p>
     */
    public String getFailureLogKey() {
        return this.FailureLogKey;
    }

    /**
     * Set <p>失败日志的字段名称</p>
     * @param FailureLogKey <p>失败日志的字段名称</p>
     */
    public void setFailureLogKey(String FailureLogKey) {
        this.FailureLogKey = FailureLogKey;
    }

    /**
     * Get <p>指定加工数据的开始时间，秒级时间戳。</p><ul><li>日志主题生命周期内的任意时间范围，如果超出了生命周期,只处理生命周期内有数据的部分。</li></ul> 
     * @return ProcessFromTimestamp <p>指定加工数据的开始时间，秒级时间戳。</p><ul><li>日志主题生命周期内的任意时间范围，如果超出了生命周期,只处理生命周期内有数据的部分。</li></ul>
     */
    public Long getProcessFromTimestamp() {
        return this.ProcessFromTimestamp;
    }

    /**
     * Set <p>指定加工数据的开始时间，秒级时间戳。</p><ul><li>日志主题生命周期内的任意时间范围，如果超出了生命周期,只处理生命周期内有数据的部分。</li></ul>
     * @param ProcessFromTimestamp <p>指定加工数据的开始时间，秒级时间戳。</p><ul><li>日志主题生命周期内的任意时间范围，如果超出了生命周期,只处理生命周期内有数据的部分。</li></ul>
     */
    public void setProcessFromTimestamp(Long ProcessFromTimestamp) {
        this.ProcessFromTimestamp = ProcessFromTimestamp;
    }

    /**
     * Get <p>指定加工数据的结束时间，秒级时间戳。</p><ol><li>不可指定未来的时间</li><li>不填则表示持续执行</li></ol> 
     * @return ProcessToTimestamp <p>指定加工数据的结束时间，秒级时间戳。</p><ol><li>不可指定未来的时间</li><li>不填则表示持续执行</li></ol>
     */
    public Long getProcessToTimestamp() {
        return this.ProcessToTimestamp;
    }

    /**
     * Set <p>指定加工数据的结束时间，秒级时间戳。</p><ol><li>不可指定未来的时间</li><li>不填则表示持续执行</li></ol>
     * @param ProcessToTimestamp <p>指定加工数据的结束时间，秒级时间戳。</p><ol><li>不可指定未来的时间</li><li>不填则表示持续执行</li></ol>
     */
    public void setProcessToTimestamp(Long ProcessToTimestamp) {
        this.ProcessToTimestamp = ProcessToTimestamp;
    }

    /**
     * Get <p>sql数据源信息</p> 
     * @return DataTransformSqlDataSources <p>sql数据源信息</p>
     */
    public DataTransformSqlDataSource [] getDataTransformSqlDataSources() {
        return this.DataTransformSqlDataSources;
    }

    /**
     * Set <p>sql数据源信息</p>
     * @param DataTransformSqlDataSources <p>sql数据源信息</p>
     */
    public void setDataTransformSqlDataSources(DataTransformSqlDataSource [] DataTransformSqlDataSources) {
        this.DataTransformSqlDataSources = DataTransformSqlDataSources;
    }

    /**
     * Get <p>环境变量</p> 
     * @return EnvInfos <p>环境变量</p>
     */
    public EnvInfo [] getEnvInfos() {
        return this.EnvInfos;
    }

    /**
     * Set <p>环境变量</p>
     * @param EnvInfos <p>环境变量</p>
     */
    public void setEnvInfos(EnvInfo [] EnvInfos) {
        this.EnvInfos = EnvInfos;
    }

    public DataTransformTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataTransformTaskInfo(DataTransformTaskInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SrcTopicId != null) {
            this.SrcTopicId = new String(source.SrcTopicId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LastEnableTime != null) {
            this.LastEnableTime = new String(source.LastEnableTime);
        }
        if (source.SrcTopicName != null) {
            this.SrcTopicName = new String(source.SrcTopicName);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.DstResources != null) {
            this.DstResources = new DataTransformResouceInfo[source.DstResources.length];
            for (int i = 0; i < source.DstResources.length; i++) {
                this.DstResources[i] = new DataTransformResouceInfo(source.DstResources[i]);
            }
        }
        if (source.EtlContent != null) {
            this.EtlContent = new String(source.EtlContent);
        }
        if (source.BackupTopicID != null) {
            this.BackupTopicID = new String(source.BackupTopicID);
        }
        if (source.BackupGiveUpData != null) {
            this.BackupGiveUpData = new Boolean(source.BackupGiveUpData);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.TaskDstCount != null) {
            this.TaskDstCount = new Long(source.TaskDstCount);
        }
        if (source.DataTransformType != null) {
            this.DataTransformType = new Long(source.DataTransformType);
        }
        if (source.KeepFailureLog != null) {
            this.KeepFailureLog = new Long(source.KeepFailureLog);
        }
        if (source.FailureLogKey != null) {
            this.FailureLogKey = new String(source.FailureLogKey);
        }
        if (source.ProcessFromTimestamp != null) {
            this.ProcessFromTimestamp = new Long(source.ProcessFromTimestamp);
        }
        if (source.ProcessToTimestamp != null) {
            this.ProcessToTimestamp = new Long(source.ProcessToTimestamp);
        }
        if (source.DataTransformSqlDataSources != null) {
            this.DataTransformSqlDataSources = new DataTransformSqlDataSource[source.DataTransformSqlDataSources.length];
            for (int i = 0; i < source.DataTransformSqlDataSources.length; i++) {
                this.DataTransformSqlDataSources[i] = new DataTransformSqlDataSource(source.DataTransformSqlDataSources[i]);
            }
        }
        if (source.EnvInfos != null) {
            this.EnvInfos = new EnvInfo[source.EnvInfos.length];
            for (int i = 0; i < source.EnvInfos.length; i++) {
                this.EnvInfos[i] = new EnvInfo(source.EnvInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LastEnableTime", this.LastEnableTime);
        this.setParamSimple(map, prefix + "SrcTopicName", this.SrcTopicName);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);
        this.setParamSimple(map, prefix + "BackupTopicID", this.BackupTopicID);
        this.setParamSimple(map, prefix + "BackupGiveUpData", this.BackupGiveUpData);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "TaskDstCount", this.TaskDstCount);
        this.setParamSimple(map, prefix + "DataTransformType", this.DataTransformType);
        this.setParamSimple(map, prefix + "KeepFailureLog", this.KeepFailureLog);
        this.setParamSimple(map, prefix + "FailureLogKey", this.FailureLogKey);
        this.setParamSimple(map, prefix + "ProcessFromTimestamp", this.ProcessFromTimestamp);
        this.setParamSimple(map, prefix + "ProcessToTimestamp", this.ProcessToTimestamp);
        this.setParamArrayObj(map, prefix + "DataTransformSqlDataSources.", this.DataTransformSqlDataSources);
        this.setParamArrayObj(map, prefix + "EnvInfos.", this.EnvInfos);

    }
}

