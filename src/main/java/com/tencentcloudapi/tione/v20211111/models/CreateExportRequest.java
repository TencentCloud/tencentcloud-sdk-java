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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateExportRequest extends AbstractModel {

    /**
    * 服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测枚举值：- TRAIN- NOTEBOOK- INFER- BATCH
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：- Service类型为TRAIN：  调用[DescribeTrainingTask接口](/document/product/851/75089)查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId- Service类型为NOTEBOOK：  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName- Service类型为INFER：  调用[DescribeModelServiceGroup接口](/document/product/851/82285)查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId- Service类型为BATCH：  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 日志查询结束时间（RFC3339格式的时间字符串），开始时间和结束时间必须同时填或同时不填，默认值为当前时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 日志导出数据格式。json，csv，默认为csv
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：- Service类型为TRAIN：  调用[DescribeTrainingTaskPods接口](/document/product/851/75088)查询训练任务pod列表，PodName为接口返回值中Response.PodNames- Service类型为NOTEBOOK：  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName- Service类型为INFER：  调用[DescribeModelService接口](/document/product/851/82287)查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos- Service类型为BATCH：  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList注：支持结尾通配符*
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 描述任务的类型
    */
    @SerializedName("JobCategory")
    @Expose
    private String JobCategory;

    /**
    * 实例的类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 查实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志类型： PLATFORM_INIT, PLATFORM_SANITY_CHECK, USER
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测枚举值：- TRAIN- NOTEBOOK- INFER- BATCH 
     * @return Service 服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测枚举值：- TRAIN- NOTEBOOK- INFER- BATCH
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测枚举值：- TRAIN- NOTEBOOK- INFER- BATCH
     * @param Service 服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测枚举值：- TRAIN- NOTEBOOK- INFER- BATCH
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：- Service类型为TRAIN：  调用[DescribeTrainingTask接口](/document/product/851/75089)查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId- Service类型为NOTEBOOK：  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName- Service类型为INFER：  调用[DescribeModelServiceGroup接口](/document/product/851/82285)查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId- Service类型为BATCH：  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId 
     * @return ServiceId 服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：- Service类型为TRAIN：  调用[DescribeTrainingTask接口](/document/product/851/75089)查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId- Service类型为NOTEBOOK：  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName- Service类型为INFER：  调用[DescribeModelServiceGroup接口](/document/product/851/82285)查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId- Service类型为BATCH：  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：- Service类型为TRAIN：  调用[DescribeTrainingTask接口](/document/product/851/75089)查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId- Service类型为NOTEBOOK：  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName- Service类型为INFER：  调用[DescribeModelServiceGroup接口](/document/product/851/82285)查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId- Service类型为BATCH：  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId
     * @param ServiceId 服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：- Service类型为TRAIN：  调用[DescribeTrainingTask接口](/document/product/851/75089)查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId- Service类型为NOTEBOOK：  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName- Service类型为INFER：  调用[DescribeModelServiceGroup接口](/document/product/851/82285)查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId- Service类型为BATCH：  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时 
     * @return StartTime 日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时
     * @param StartTime 日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 日志查询结束时间（RFC3339格式的时间字符串），开始时间和结束时间必须同时填或同时不填，默认值为当前时间 
     * @return EndTime 日志查询结束时间（RFC3339格式的时间字符串），开始时间和结束时间必须同时填或同时不填，默认值为当前时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 日志查询结束时间（RFC3339格式的时间字符串），开始时间和结束时间必须同时填或同时不填，默认值为当前时间
     * @param EndTime 日志查询结束时间（RFC3339格式的时间字符串），开始时间和结束时间必须同时填或同时不填，默认值为当前时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 日志导出数据格式。json，csv，默认为csv 
     * @return Format 日志导出数据格式。json，csv，默认为csv
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 日志导出数据格式。json，csv，默认为csv
     * @param Format 日志导出数据格式。json，csv，默认为csv
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：- Service类型为TRAIN：  调用[DescribeTrainingTaskPods接口](/document/product/851/75088)查询训练任务pod列表，PodName为接口返回值中Response.PodNames- Service类型为NOTEBOOK：  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName- Service类型为INFER：  调用[DescribeModelService接口](/document/product/851/82287)查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos- Service类型为BATCH：  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList注：支持结尾通配符* 
     * @return PodName Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：- Service类型为TRAIN：  调用[DescribeTrainingTaskPods接口](/document/product/851/75088)查询训练任务pod列表，PodName为接口返回值中Response.PodNames- Service类型为NOTEBOOK：  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName- Service类型为INFER：  调用[DescribeModelService接口](/document/product/851/82287)查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos- Service类型为BATCH：  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList注：支持结尾通配符*
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：- Service类型为TRAIN：  调用[DescribeTrainingTaskPods接口](/document/product/851/75088)查询训练任务pod列表，PodName为接口返回值中Response.PodNames- Service类型为NOTEBOOK：  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName- Service类型为INFER：  调用[DescribeModelService接口](/document/product/851/82287)查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos- Service类型为BATCH：  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList注：支持结尾通配符*
     * @param PodName Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：- Service类型为TRAIN：  调用[DescribeTrainingTaskPods接口](/document/product/851/75088)查询训练任务pod列表，PodName为接口返回值中Response.PodNames- Service类型为NOTEBOOK：  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName- Service类型为INFER：  调用[DescribeModelService接口](/document/product/851/82287)查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos- Service类型为BATCH：  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList注：支持结尾通配符*
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 描述任务的类型 
     * @return JobCategory 描述任务的类型
     */
    public String getJobCategory() {
        return this.JobCategory;
    }

    /**
     * Set 描述任务的类型
     * @param JobCategory 描述任务的类型
     */
    public void setJobCategory(String JobCategory) {
        this.JobCategory = JobCategory;
    }

    /**
     * Get 实例的类型 
     * @return InstanceType 实例的类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例的类型
     * @param InstanceType 实例的类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 查实例Id 
     * @return InstanceId 查实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 查实例Id
     * @param InstanceId 查实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 日志类型： PLATFORM_INIT, PLATFORM_SANITY_CHECK, USER 
     * @return Type 日志类型： PLATFORM_INIT, PLATFORM_SANITY_CHECK, USER
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 日志类型： PLATFORM_INIT, PLATFORM_SANITY_CHECK, USER
     * @param Type 日志类型： PLATFORM_INIT, PLATFORM_SANITY_CHECK, USER
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CreateExportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExportRequest(CreateExportRequest source) {
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.JobCategory != null) {
            this.JobCategory = new String(source.JobCategory);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "JobCategory", this.JobCategory);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

