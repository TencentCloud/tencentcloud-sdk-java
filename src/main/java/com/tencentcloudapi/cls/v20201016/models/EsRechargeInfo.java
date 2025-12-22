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

public class EsRechargeInfo extends AbstractModel {

    /**
    * 任务id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 主账号id。
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 配置名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * es索引。
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * es查询语句。
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * es集群信息。
    */
    @SerializedName("EsInfo")
    @Expose
    private EsInfo EsInfo;

    /**
    * es导入信息。
    */
    @SerializedName("ImportInfo")
    @Expose
    private EsImportInfo ImportInfo;

    /**
    * es导入时间配置信息。
    */
    @SerializedName("TimeInfo")
    @Expose
    private EsTimeInfo TimeInfo;

    /**
    * 任务状态。
1. 运行中
2. 暂停
3. 完成
4. 异常
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务进度 0~100 百分比。100：表示完成。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 子账号id。
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 修改时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 是否开启投递服务日志。1：关闭，2：开启。
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get 任务id。 
     * @return TaskId 任务id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id。
     * @param TaskId 任务id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 主账号id。 
     * @return Uin 主账号id。
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号id。
     * @param Uin 主账号id。
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。 
     * @return TopicId 日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。
     * @param TopicId 日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 配置名称。 
     * @return Name 配置名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置名称。
     * @param Name 配置名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get es索引。 
     * @return Index es索引。
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set es索引。
     * @param Index es索引。
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get es查询语句。 
     * @return Query es查询语句。
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set es查询语句。
     * @param Query es查询语句。
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get es集群信息。 
     * @return EsInfo es集群信息。
     */
    public EsInfo getEsInfo() {
        return this.EsInfo;
    }

    /**
     * Set es集群信息。
     * @param EsInfo es集群信息。
     */
    public void setEsInfo(EsInfo EsInfo) {
        this.EsInfo = EsInfo;
    }

    /**
     * Get es导入信息。 
     * @return ImportInfo es导入信息。
     */
    public EsImportInfo getImportInfo() {
        return this.ImportInfo;
    }

    /**
     * Set es导入信息。
     * @param ImportInfo es导入信息。
     */
    public void setImportInfo(EsImportInfo ImportInfo) {
        this.ImportInfo = ImportInfo;
    }

    /**
     * Get es导入时间配置信息。 
     * @return TimeInfo es导入时间配置信息。
     */
    public EsTimeInfo getTimeInfo() {
        return this.TimeInfo;
    }

    /**
     * Set es导入时间配置信息。
     * @param TimeInfo es导入时间配置信息。
     */
    public void setTimeInfo(EsTimeInfo TimeInfo) {
        this.TimeInfo = TimeInfo;
    }

    /**
     * Get 任务状态。
1. 运行中
2. 暂停
3. 完成
4. 异常 
     * @return Status 任务状态。
1. 运行中
2. 暂停
3. 完成
4. 异常
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。
1. 运行中
2. 暂停
3. 完成
4. 异常
     * @param Status 任务状态。
1. 运行中
2. 暂停
3. 完成
4. 异常
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务进度 0~100 百分比。100：表示完成。 
     * @return Progress 任务进度 0~100 百分比。100：表示完成。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务进度 0~100 百分比。100：表示完成。
     * @param Progress 任务进度 0~100 百分比。100：表示完成。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 子账号id。 
     * @return SubUin 子账号id。
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 子账号id。
     * @param SubUin 子账号id。
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间。 
     * @return UpdateTime 修改时间。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间。
     * @param UpdateTime 修改时间。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    public EsRechargeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsRechargeInfo(EsRechargeInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.EsInfo != null) {
            this.EsInfo = new EsInfo(source.EsInfo);
        }
        if (source.ImportInfo != null) {
            this.ImportInfo = new EsImportInfo(source.ImportInfo);
        }
        if (source.TimeInfo != null) {
            this.TimeInfo = new EsTimeInfo(source.TimeInfo);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamObj(map, prefix + "EsInfo.", this.EsInfo);
        this.setParamObj(map, prefix + "ImportInfo.", this.ImportInfo);
        this.setParamObj(map, prefix + "TimeInfo.", this.TimeInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}

