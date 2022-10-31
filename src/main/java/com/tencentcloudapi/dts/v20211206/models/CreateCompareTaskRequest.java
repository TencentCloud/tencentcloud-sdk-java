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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCompareTaskRequest extends AbstractModel{

    /**
    * 迁移任务 Id
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
    * 一致性对比对象配置
    */
    @SerializedName("Objects")
    @Expose
    private CompareObject Objects;

    /**
     * Get 迁移任务 Id 
     * @return JobId 迁移任务 Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 迁移任务 Id
     * @param JobId 迁移任务 Id
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
     * Get 一致性对比对象配置 
     * @return Objects 一致性对比对象配置
     */
    public CompareObject getObjects() {
        return this.Objects;
    }

    /**
     * Set 一致性对比对象配置
     * @param Objects 一致性对比对象配置
     */
    public void setObjects(CompareObject Objects) {
        this.Objects = Objects;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ObjectMode", this.ObjectMode);
        this.setParamObj(map, prefix + "Objects.", this.Objects);

    }
}

