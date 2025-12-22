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

public class ModifyEsRechargeRequest extends AbstractModel {

    /**
    * 导入任务id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 名称：长度不超过64字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 索引信息。不同索引可以通过英文逗号分隔，支持*通配符
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
    * es集群配置信息。
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
    * es导入时间字段信息。
    */
    @SerializedName("TimeInfo")
    @Expose
    private EsTimeInfo TimeInfo;

    /**
    * 任务状态。1:运行， 2:暂停
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否开启投递服务日志。1：关闭，2：开启。
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get 导入任务id。 
     * @return TaskId 导入任务id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 导入任务id。
     * @param TaskId 导入任务id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
     * Get 名称：长度不超过64字符。 
     * @return Name 名称：长度不超过64字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称：长度不超过64字符。
     * @param Name 名称：长度不超过64字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 索引信息。不同索引可以通过英文逗号分隔，支持*通配符 
     * @return Index 索引信息。不同索引可以通过英文逗号分隔，支持*通配符
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 索引信息。不同索引可以通过英文逗号分隔，支持*通配符
     * @param Index 索引信息。不同索引可以通过英文逗号分隔，支持*通配符
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
     * Get es集群配置信息。 
     * @return EsInfo es集群配置信息。
     */
    public EsInfo getEsInfo() {
        return this.EsInfo;
    }

    /**
     * Set es集群配置信息。
     * @param EsInfo es集群配置信息。
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
     * Get es导入时间字段信息。 
     * @return TimeInfo es导入时间字段信息。
     */
    public EsTimeInfo getTimeInfo() {
        return this.TimeInfo;
    }

    /**
     * Set es导入时间字段信息。
     * @param TimeInfo es导入时间字段信息。
     */
    public void setTimeInfo(EsTimeInfo TimeInfo) {
        this.TimeInfo = TimeInfo;
    }

    /**
     * Get 任务状态。1:运行， 2:暂停 
     * @return Status 任务状态。1:运行， 2:暂停
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。1:运行， 2:暂停
     * @param Status 任务状态。1:运行， 2:暂停
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public ModifyEsRechargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEsRechargeRequest(ModifyEsRechargeRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamObj(map, prefix + "EsInfo.", this.EsInfo);
        this.setParamObj(map, prefix + "ImportInfo.", this.ImportInfo);
        this.setParamObj(map, prefix + "TimeInfo.", this.TimeInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}

