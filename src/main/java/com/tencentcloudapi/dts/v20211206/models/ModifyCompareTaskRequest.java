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

public class ModifyCompareTaskRequest extends AbstractModel {

    /**
    * 任务 Id，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 数据对比对象模式，sameAsMigrate(全部迁移对象， 默认为此项配置)、custom(自定义)，注意自定义对比对象必须是迁移对象的子集
    */
    @SerializedName("ObjectMode")
    @Expose
    private String ObjectMode;

    /**
    * 对比对象，若CompareObjectMode取值为custom，则此项必填
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
     * Get 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。
 
     * @return CompareTaskId 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     * @param CompareTaskId 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9，可通过[DescribeMigrationJobs](https://cloud.tencent.com/document/product/571/82084)接口获取。

     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 数据对比对象模式，sameAsMigrate(全部迁移对象， 默认为此项配置)、custom(自定义)，注意自定义对比对象必须是迁移对象的子集 
     * @return ObjectMode 数据对比对象模式，sameAsMigrate(全部迁移对象， 默认为此项配置)、custom(自定义)，注意自定义对比对象必须是迁移对象的子集
     */
    public String getObjectMode() {
        return this.ObjectMode;
    }

    /**
     * Set 数据对比对象模式，sameAsMigrate(全部迁移对象， 默认为此项配置)、custom(自定义)，注意自定义对比对象必须是迁移对象的子集
     * @param ObjectMode 数据对比对象模式，sameAsMigrate(全部迁移对象， 默认为此项配置)、custom(自定义)，注意自定义对比对象必须是迁移对象的子集
     */
    public void setObjectMode(String ObjectMode) {
        this.ObjectMode = ObjectMode;
    }

    /**
     * Get 对比对象，若CompareObjectMode取值为custom，则此项必填 
     * @return Objects 对比对象，若CompareObjectMode取值为custom，则此项必填
     */
    public CompareObject getObjects() {
        return this.Objects;
    }

    /**
     * Set 对比对象，若CompareObjectMode取值为custom，则此项必填
     * @param Objects 对比对象，若CompareObjectMode取值为custom，则此项必填
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

    public ModifyCompareTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCompareTaskRequest(ModifyCompareTaskRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
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
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ObjectMode", this.ObjectMode);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamObj(map, prefix + "Options.", this.Options);

    }
}

