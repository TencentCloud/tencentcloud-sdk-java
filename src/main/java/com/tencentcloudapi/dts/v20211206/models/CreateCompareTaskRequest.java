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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCompareTaskRequest extends AbstractModel {

    /**
    * 任务 Id，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 数据对比任务名称，若为空则默认给CompareTaskId相同值
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 数据对比对象模式，sameAsMigrate(全部迁移对象， 默认为此项配置)，custom(自定义模式)
    */
    @SerializedName("ObjectMode")
    @Expose
    private String ObjectMode;

    /**
    * 数据对比对象，当ObjectMode为custom时，此项需要填写。
    */
    @SerializedName("Objects")
    @Expose
    private CompareObject Objects;

    /**
    * 一致性校验选项
    */
    @SerializedName("Options")
    @Expose
    private CompareOptions Options;

    /**
     * Get 任务 Id，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。
 
     * @return JobId 任务 Id，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务 Id，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     * @param JobId 任务 Id，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 数据对比任务名称，若为空则默认给CompareTaskId相同值 
     * @return TaskName 数据对比任务名称，若为空则默认给CompareTaskId相同值
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 数据对比任务名称，若为空则默认给CompareTaskId相同值
     * @param TaskName 数据对比任务名称，若为空则默认给CompareTaskId相同值
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 数据对比对象模式，sameAsMigrate(全部迁移对象， 默认为此项配置)，custom(自定义模式) 
     * @return ObjectMode 数据对比对象模式，sameAsMigrate(全部迁移对象， 默认为此项配置)，custom(自定义模式)
     */
    public String getObjectMode() {
        return this.ObjectMode;
    }

    /**
     * Set 数据对比对象模式，sameAsMigrate(全部迁移对象， 默认为此项配置)，custom(自定义模式)
     * @param ObjectMode 数据对比对象模式，sameAsMigrate(全部迁移对象， 默认为此项配置)，custom(自定义模式)
     */
    public void setObjectMode(String ObjectMode) {
        this.ObjectMode = ObjectMode;
    }

    /**
     * Get 数据对比对象，当ObjectMode为custom时，此项需要填写。 
     * @return Objects 数据对比对象，当ObjectMode为custom时，此项需要填写。
     */
    public CompareObject getObjects() {
        return this.Objects;
    }

    /**
     * Set 数据对比对象，当ObjectMode为custom时，此项需要填写。
     * @param Objects 数据对比对象，当ObjectMode为custom时，此项需要填写。
     */
    public void setObjects(CompareObject Objects) {
        this.Objects = Objects;
    }

    /**
     * Get 一致性校验选项 
     * @return Options 一致性校验选项
     */
    public CompareOptions getOptions() {
        return this.Options;
    }

    /**
     * Set 一致性校验选项
     * @param Options 一致性校验选项
     */
    public void setOptions(CompareOptions Options) {
        this.Options = Options;
    }

    public CreateCompareTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCompareTaskRequest(CreateCompareTaskRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ObjectMode != null) {
            this.ObjectMode = new String(source.ObjectMode);
        }
        if (source.Objects != null) {
            this.Objects = new CompareObject(source.Objects);
        }
        if (source.Options != null) {
            this.Options = new CompareOptions(source.Options);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ObjectMode", this.ObjectMode);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamObj(map, prefix + "Options.", this.Options);

    }
}

