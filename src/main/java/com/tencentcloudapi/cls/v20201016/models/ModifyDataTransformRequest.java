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

public class ModifyDataTransformRequest extends AbstractModel {

    /**
    * 数据加工任务ID
- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 加工任务名称
- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务名称。

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
    * 任务启动状态. 默认为1，开启,  2关闭
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
    * 超限之后是否丢弃日志数据
    */
    @SerializedName("BackupGiveUpData")
    @Expose
    private Boolean BackupGiveUpData;

    /**
    * 是否开启投递服务日志。1关闭，2开启
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * 保留失败日志状态。 1:不保留，2:保留
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
    * 外部数据源信息
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
     * Get 数据加工任务ID
- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。 
     * @return TaskId 数据加工任务ID
- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 数据加工任务ID
- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。
     * @param TaskId 数据加工任务ID
- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 加工任务名称
- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务名称。

名称限制
- 不能为空字符串
- 不能包含字符'|'
- 最长 255 个字符 
     * @return Name 加工任务名称
- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务名称。

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
- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务名称。

名称限制
- 不能为空字符串
- 不能包含字符'|'
- 最长 255 个字符
     * @param Name 加工任务名称
- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务名称。

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
     * Get 任务启动状态. 默认为1，开启,  2关闭 
     * @return EnableFlag 任务启动状态. 默认为1，开启,  2关闭
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set 任务启动状态. 默认为1，开启,  2关闭
     * @param EnableFlag 任务启动状态. 默认为1，开启,  2关闭
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

    /**
     * Get 超限之后是否丢弃日志数据 
     * @return BackupGiveUpData 超限之后是否丢弃日志数据
     */
    public Boolean getBackupGiveUpData() {
        return this.BackupGiveUpData;
    }

    /**
     * Set 超限之后是否丢弃日志数据
     * @param BackupGiveUpData 超限之后是否丢弃日志数据
     */
    public void setBackupGiveUpData(Boolean BackupGiveUpData) {
        this.BackupGiveUpData = BackupGiveUpData;
    }

    /**
     * Get 是否开启投递服务日志。1关闭，2开启 
     * @return HasServicesLog 是否开启投递服务日志。1关闭，2开启
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set 是否开启投递服务日志。1关闭，2开启
     * @param HasServicesLog 是否开启投递服务日志。1关闭，2开启
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get 保留失败日志状态。 1:不保留，2:保留 
     * @return KeepFailureLog 保留失败日志状态。 1:不保留，2:保留
     */
    public Long getKeepFailureLog() {
        return this.KeepFailureLog;
    }

    /**
     * Set 保留失败日志状态。 1:不保留，2:保留
     * @param KeepFailureLog 保留失败日志状态。 1:不保留，2:保留
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
     * Get 外部数据源信息 
     * @return DataTransformSqlDataSources 外部数据源信息
     */
    public DataTransformSqlDataSource [] getDataTransformSqlDataSources() {
        return this.DataTransformSqlDataSources;
    }

    /**
     * Set 外部数据源信息
     * @param DataTransformSqlDataSources 外部数据源信息
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
        if (source.BackupGiveUpData != null) {
            this.BackupGiveUpData = new Boolean(source.BackupGiveUpData);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.KeepFailureLog != null) {
            this.KeepFailureLog = new Long(source.KeepFailureLog);
        }
        if (source.FailureLogKey != null) {
            this.FailureLogKey = new String(source.FailureLogKey);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamSimple(map, prefix + "BackupGiveUpData", this.BackupGiveUpData);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "KeepFailureLog", this.KeepFailureLog);
        this.setParamSimple(map, prefix + "FailureLogKey", this.FailureLogKey);
        this.setParamArrayObj(map, prefix + "DataTransformSqlDataSources.", this.DataTransformSqlDataSources);
        this.setParamArrayObj(map, prefix + "EnvInfos.", this.EnvInfos);

    }
}

