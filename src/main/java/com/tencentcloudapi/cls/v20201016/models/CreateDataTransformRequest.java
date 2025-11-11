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

public class CreateDataTransformRequest extends AbstractModel {

    /**
    * 任务类型. 1: 指定主题；2:动态创建。详情请参考[创建加工任务文档](https://cloud.tencent.com/document/product/614/63940)。
    */
    @SerializedName("FuncType")
    @Expose
    private Long FuncType;

    /**
    * 日志主题ID
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * 加工任务名称
名称限制
- 不能为空字符串
- 不能包含字符'|'
- 最长 255 个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 加工语句。 当FuncType为2时，EtlContent必须使用[log_auto_output](https://cloud.tencent.com/document/product/614/70733#b3c58797-4825-4807-bef4-68106e25024f) 

其他参考文档：

- [创建加工任务](https://cloud.tencent.com/document/product/614/63940) 
-  [函数总览](https://cloud.tencent.com/document/product/614/70395)
    */
    @SerializedName("EtlContent")
    @Expose
    private String EtlContent;

    /**
    * 加工类型。
1：使用源日志主题中的随机数据，进行加工预览；2：使用用户自定义测试数据，进行加工预览；3：创建真实加工任务。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 加工任务目标topic_id以及别名,当FuncType=1时，该参数必填，当FuncType=2时，无需填写。
目标topic_id，通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
别名限制 1.不能为空字符串，2. 不能包含字符'|'。

    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
    * 任务启动状态.   默认为1:开启,  2:关闭
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * 用于预览加工结果的测试数据
目标日志主题ID通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
    */
    @SerializedName("PreviewLogStatistics")
    @Expose
    private PreviewLogStatistic [] PreviewLogStatistics;

    /**
    * 当FuncType为2时，动态创建的日志集、日志主题的个数超出产品规格限制是否丢弃数据， 默认为false。

false：创建兜底日志集、日志主题并将日志写入兜底主题；
true：丢弃日志数据。
    */
    @SerializedName("BackupGiveUpData")
    @Expose
    private Boolean BackupGiveUpData;

    /**
    * 是否开启投递服务日志。1：关闭，2：开启。
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * 数据加工类型。0：标准加工任务； 1：前置加工任务。前置加工任务将采集的日志处理完成后，再写入日志主题。
    */
    @SerializedName("DataTransformType")
    @Expose
    private Long DataTransformType;

    /**
    * 保留失败日志状态，1:不保留(默认)，2:保留。
    */
    @SerializedName("KeepFailureLog")
    @Expose
    private Long KeepFailureLog;

    /**
    * 失败日志的字段名称
    */
    @SerializedName("FailureLogKey")
    @Expose
    private String FailureLogKey;

    /**
    * 指定加工数据的开始时间, 秒级时间戳。
 - 日志主题生命周期内的任意时间范围，如果超出了生命周期,只处理生命周期内有数据的部分。
    */
    @SerializedName("ProcessFromTimestamp")
    @Expose
    private Long ProcessFromTimestamp;

    /**
    * 指定加工数据的结束时间，秒级时间戳。

-  不可指定未来的时间
-  不填则表示持续执行
    */
    @SerializedName("ProcessToTimestamp")
    @Expose
    private Long ProcessToTimestamp;

    /**
    * 对已经创建的并且使用了关联外部数据库能力的任务预览（TaskType 为 1 或 2）时，该值必传
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 关联的数据源信息
    */
    @SerializedName("DataTransformSqlDataSources")
    @Expose
    private DataTransformSqlDataSource [] DataTransformSqlDataSources;

    /**
    * 设置的环境变量
    */
    @SerializedName("EnvInfos")
    @Expose
    private EnvInfo [] EnvInfos;

    /**
     * Get 任务类型. 1: 指定主题；2:动态创建。详情请参考[创建加工任务文档](https://cloud.tencent.com/document/product/614/63940)。 
     * @return FuncType 任务类型. 1: 指定主题；2:动态创建。详情请参考[创建加工任务文档](https://cloud.tencent.com/document/product/614/63940)。
     */
    public Long getFuncType() {
        return this.FuncType;
    }

    /**
     * Set 任务类型. 1: 指定主题；2:动态创建。详情请参考[创建加工任务文档](https://cloud.tencent.com/document/product/614/63940)。
     * @param FuncType 任务类型. 1: 指定主题；2:动态创建。详情请参考[创建加工任务文档](https://cloud.tencent.com/document/product/614/63940)。
     */
    public void setFuncType(Long FuncType) {
        this.FuncType = FuncType;
    }

    /**
     * Get 日志主题ID
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。 
     * @return SrcTopicId 日志主题ID
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set 日志主题ID
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     * @param SrcTopicId 日志主题ID
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get 加工任务名称
名称限制
- 不能为空字符串
- 不能包含字符'|'
- 最长 255 个字符 
     * @return Name 加工任务名称
名称限制
- 不能为空字符串
- 不能包含字符'|'
- 最长 255 个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 加工任务名称
名称限制
- 不能为空字符串
- 不能包含字符'|'
- 最长 255 个字符
     * @param Name 加工任务名称
名称限制
- 不能为空字符串
- 不能包含字符'|'
- 最长 255 个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 加工语句。 当FuncType为2时，EtlContent必须使用[log_auto_output](https://cloud.tencent.com/document/product/614/70733#b3c58797-4825-4807-bef4-68106e25024f) 

其他参考文档：

- [创建加工任务](https://cloud.tencent.com/document/product/614/63940) 
-  [函数总览](https://cloud.tencent.com/document/product/614/70395) 
     * @return EtlContent 加工语句。 当FuncType为2时，EtlContent必须使用[log_auto_output](https://cloud.tencent.com/document/product/614/70733#b3c58797-4825-4807-bef4-68106e25024f) 

其他参考文档：

- [创建加工任务](https://cloud.tencent.com/document/product/614/63940) 
-  [函数总览](https://cloud.tencent.com/document/product/614/70395)
     */
    public String getEtlContent() {
        return this.EtlContent;
    }

    /**
     * Set 加工语句。 当FuncType为2时，EtlContent必须使用[log_auto_output](https://cloud.tencent.com/document/product/614/70733#b3c58797-4825-4807-bef4-68106e25024f) 

其他参考文档：

- [创建加工任务](https://cloud.tencent.com/document/product/614/63940) 
-  [函数总览](https://cloud.tencent.com/document/product/614/70395)
     * @param EtlContent 加工语句。 当FuncType为2时，EtlContent必须使用[log_auto_output](https://cloud.tencent.com/document/product/614/70733#b3c58797-4825-4807-bef4-68106e25024f) 

其他参考文档：

- [创建加工任务](https://cloud.tencent.com/document/product/614/63940) 
-  [函数总览](https://cloud.tencent.com/document/product/614/70395)
     */
    public void setEtlContent(String EtlContent) {
        this.EtlContent = EtlContent;
    }

    /**
     * Get 加工类型。
1：使用源日志主题中的随机数据，进行加工预览；2：使用用户自定义测试数据，进行加工预览；3：创建真实加工任务。 
     * @return TaskType 加工类型。
1：使用源日志主题中的随机数据，进行加工预览；2：使用用户自定义测试数据，进行加工预览；3：创建真实加工任务。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 加工类型。
1：使用源日志主题中的随机数据，进行加工预览；2：使用用户自定义测试数据，进行加工预览；3：创建真实加工任务。
     * @param TaskType 加工类型。
1：使用源日志主题中的随机数据，进行加工预览；2：使用用户自定义测试数据，进行加工预览；3：创建真实加工任务。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 加工任务目标topic_id以及别名,当FuncType=1时，该参数必填，当FuncType=2时，无需填写。
目标topic_id，通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
别名限制 1.不能为空字符串，2. 不能包含字符'|'。
 
     * @return DstResources 加工任务目标topic_id以及别名,当FuncType=1时，该参数必填，当FuncType=2时，无需填写。
目标topic_id，通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
别名限制 1.不能为空字符串，2. 不能包含字符'|'。

     */
    public DataTransformResouceInfo [] getDstResources() {
        return this.DstResources;
    }

    /**
     * Set 加工任务目标topic_id以及别名,当FuncType=1时，该参数必填，当FuncType=2时，无需填写。
目标topic_id，通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
别名限制 1.不能为空字符串，2. 不能包含字符'|'。

     * @param DstResources 加工任务目标topic_id以及别名,当FuncType=1时，该参数必填，当FuncType=2时，无需填写。
目标topic_id，通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
别名限制 1.不能为空字符串，2. 不能包含字符'|'。

     */
    public void setDstResources(DataTransformResouceInfo [] DstResources) {
        this.DstResources = DstResources;
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
     * Get 用于预览加工结果的测试数据
目标日志主题ID通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。 
     * @return PreviewLogStatistics 用于预览加工结果的测试数据
目标日志主题ID通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public PreviewLogStatistic [] getPreviewLogStatistics() {
        return this.PreviewLogStatistics;
    }

    /**
     * Set 用于预览加工结果的测试数据
目标日志主题ID通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     * @param PreviewLogStatistics 用于预览加工结果的测试数据
目标日志主题ID通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public void setPreviewLogStatistics(PreviewLogStatistic [] PreviewLogStatistics) {
        this.PreviewLogStatistics = PreviewLogStatistics;
    }

    /**
     * Get 当FuncType为2时，动态创建的日志集、日志主题的个数超出产品规格限制是否丢弃数据， 默认为false。

false：创建兜底日志集、日志主题并将日志写入兜底主题；
true：丢弃日志数据。 
     * @return BackupGiveUpData 当FuncType为2时，动态创建的日志集、日志主题的个数超出产品规格限制是否丢弃数据， 默认为false。

false：创建兜底日志集、日志主题并将日志写入兜底主题；
true：丢弃日志数据。
     */
    public Boolean getBackupGiveUpData() {
        return this.BackupGiveUpData;
    }

    /**
     * Set 当FuncType为2时，动态创建的日志集、日志主题的个数超出产品规格限制是否丢弃数据， 默认为false。

false：创建兜底日志集、日志主题并将日志写入兜底主题；
true：丢弃日志数据。
     * @param BackupGiveUpData 当FuncType为2时，动态创建的日志集、日志主题的个数超出产品规格限制是否丢弃数据， 默认为false。

false：创建兜底日志集、日志主题并将日志写入兜底主题；
true：丢弃日志数据。
     */
    public void setBackupGiveUpData(Boolean BackupGiveUpData) {
        this.BackupGiveUpData = BackupGiveUpData;
    }

    /**
     * Get 是否开启投递服务日志。1：关闭，2：开启。 
     * @return HasServicesLog 是否开启投递服务日志。1：关闭，2：开启。
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set 是否开启投递服务日志。1：关闭，2：开启。
     * @param HasServicesLog 是否开启投递服务日志。1：关闭，2：开启。
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get 数据加工类型。0：标准加工任务； 1：前置加工任务。前置加工任务将采集的日志处理完成后，再写入日志主题。 
     * @return DataTransformType 数据加工类型。0：标准加工任务； 1：前置加工任务。前置加工任务将采集的日志处理完成后，再写入日志主题。
     */
    public Long getDataTransformType() {
        return this.DataTransformType;
    }

    /**
     * Set 数据加工类型。0：标准加工任务； 1：前置加工任务。前置加工任务将采集的日志处理完成后，再写入日志主题。
     * @param DataTransformType 数据加工类型。0：标准加工任务； 1：前置加工任务。前置加工任务将采集的日志处理完成后，再写入日志主题。
     */
    public void setDataTransformType(Long DataTransformType) {
        this.DataTransformType = DataTransformType;
    }

    /**
     * Get 保留失败日志状态，1:不保留(默认)，2:保留。 
     * @return KeepFailureLog 保留失败日志状态，1:不保留(默认)，2:保留。
     */
    public Long getKeepFailureLog() {
        return this.KeepFailureLog;
    }

    /**
     * Set 保留失败日志状态，1:不保留(默认)，2:保留。
     * @param KeepFailureLog 保留失败日志状态，1:不保留(默认)，2:保留。
     */
    public void setKeepFailureLog(Long KeepFailureLog) {
        this.KeepFailureLog = KeepFailureLog;
    }

    /**
     * Get 失败日志的字段名称 
     * @return FailureLogKey 失败日志的字段名称
     */
    public String getFailureLogKey() {
        return this.FailureLogKey;
    }

    /**
     * Set 失败日志的字段名称
     * @param FailureLogKey 失败日志的字段名称
     */
    public void setFailureLogKey(String FailureLogKey) {
        this.FailureLogKey = FailureLogKey;
    }

    /**
     * Get 指定加工数据的开始时间, 秒级时间戳。
 - 日志主题生命周期内的任意时间范围，如果超出了生命周期,只处理生命周期内有数据的部分。 
     * @return ProcessFromTimestamp 指定加工数据的开始时间, 秒级时间戳。
 - 日志主题生命周期内的任意时间范围，如果超出了生命周期,只处理生命周期内有数据的部分。
     */
    public Long getProcessFromTimestamp() {
        return this.ProcessFromTimestamp;
    }

    /**
     * Set 指定加工数据的开始时间, 秒级时间戳。
 - 日志主题生命周期内的任意时间范围，如果超出了生命周期,只处理生命周期内有数据的部分。
     * @param ProcessFromTimestamp 指定加工数据的开始时间, 秒级时间戳。
 - 日志主题生命周期内的任意时间范围，如果超出了生命周期,只处理生命周期内有数据的部分。
     */
    public void setProcessFromTimestamp(Long ProcessFromTimestamp) {
        this.ProcessFromTimestamp = ProcessFromTimestamp;
    }

    /**
     * Get 指定加工数据的结束时间，秒级时间戳。

-  不可指定未来的时间
-  不填则表示持续执行 
     * @return ProcessToTimestamp 指定加工数据的结束时间，秒级时间戳。

-  不可指定未来的时间
-  不填则表示持续执行
     */
    public Long getProcessToTimestamp() {
        return this.ProcessToTimestamp;
    }

    /**
     * Set 指定加工数据的结束时间，秒级时间戳。

-  不可指定未来的时间
-  不填则表示持续执行
     * @param ProcessToTimestamp 指定加工数据的结束时间，秒级时间戳。

-  不可指定未来的时间
-  不填则表示持续执行
     */
    public void setProcessToTimestamp(Long ProcessToTimestamp) {
        this.ProcessToTimestamp = ProcessToTimestamp;
    }

    /**
     * Get 对已经创建的并且使用了关联外部数据库能力的任务预览（TaskType 为 1 或 2）时，该值必传
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。 
     * @return TaskId 对已经创建的并且使用了关联外部数据库能力的任务预览（TaskType 为 1 或 2）时，该值必传
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 对已经创建的并且使用了关联外部数据库能力的任务预览（TaskType 为 1 或 2）时，该值必传
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。
     * @param TaskId 对已经创建的并且使用了关联外部数据库能力的任务预览（TaskType 为 1 或 2）时，该值必传
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 关联的数据源信息 
     * @return DataTransformSqlDataSources 关联的数据源信息
     */
    public DataTransformSqlDataSource [] getDataTransformSqlDataSources() {
        return this.DataTransformSqlDataSources;
    }

    /**
     * Set 关联的数据源信息
     * @param DataTransformSqlDataSources 关联的数据源信息
     */
    public void setDataTransformSqlDataSources(DataTransformSqlDataSource [] DataTransformSqlDataSources) {
        this.DataTransformSqlDataSources = DataTransformSqlDataSources;
    }

    /**
     * Get 设置的环境变量 
     * @return EnvInfos 设置的环境变量
     */
    public EnvInfo [] getEnvInfos() {
        return this.EnvInfos;
    }

    /**
     * Set 设置的环境变量
     * @param EnvInfos 设置的环境变量
     */
    public void setEnvInfos(EnvInfo [] EnvInfos) {
        this.EnvInfos = EnvInfos;
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
        if (source.DstResources != null) {
            this.DstResources = new DataTransformResouceInfo[source.DstResources.length];
            for (int i = 0; i < source.DstResources.length; i++) {
                this.DstResources[i] = new DataTransformResouceInfo(source.DstResources[i]);
            }
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
        if (source.BackupGiveUpData != null) {
            this.BackupGiveUpData = new Boolean(source.BackupGiveUpData);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
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
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        this.setParamSimple(map, prefix + "FuncType", this.FuncType);
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamArrayObj(map, prefix + "PreviewLogStatistics.", this.PreviewLogStatistics);
        this.setParamSimple(map, prefix + "BackupGiveUpData", this.BackupGiveUpData);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "DataTransformType", this.DataTransformType);
        this.setParamSimple(map, prefix + "KeepFailureLog", this.KeepFailureLog);
        this.setParamSimple(map, prefix + "FailureLogKey", this.FailureLogKey);
        this.setParamSimple(map, prefix + "ProcessFromTimestamp", this.ProcessFromTimestamp);
        this.setParamSimple(map, prefix + "ProcessToTimestamp", this.ProcessToTimestamp);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "DataTransformSqlDataSources.", this.DataTransformSqlDataSources);
        this.setParamArrayObj(map, prefix + "EnvInfos.", this.EnvInfos);

    }
}

