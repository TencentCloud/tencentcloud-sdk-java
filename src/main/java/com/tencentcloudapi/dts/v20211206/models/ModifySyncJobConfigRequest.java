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

public class ModifySyncJobConfigRequest extends AbstractModel{

    /**
    * 同步任务id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 修改后的同步对象
    */
    @SerializedName("DynamicObjects")
    @Expose
    private Objects DynamicObjects;

    /**
    * 修改后的同步任务选项
    */
    @SerializedName("DynamicOptions")
    @Expose
    private DynamicOptions DynamicOptions;

    /**
     * Get 同步任务id 
     * @return JobId 同步任务id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 同步任务id
     * @param JobId 同步任务id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 修改后的同步对象 
     * @return DynamicObjects 修改后的同步对象
     */
    public Objects getDynamicObjects() {
        return this.DynamicObjects;
    }

    /**
     * Set 修改后的同步对象
     * @param DynamicObjects 修改后的同步对象
     */
    public void setDynamicObjects(Objects DynamicObjects) {
        this.DynamicObjects = DynamicObjects;
    }

    /**
     * Get 修改后的同步任务选项 
     * @return DynamicOptions 修改后的同步任务选项
     */
    public DynamicOptions getDynamicOptions() {
        return this.DynamicOptions;
    }

    /**
     * Set 修改后的同步任务选项
     * @param DynamicOptions 修改后的同步任务选项
     */
    public void setDynamicOptions(DynamicOptions DynamicOptions) {
        this.DynamicOptions = DynamicOptions;
    }

    public ModifySyncJobConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySyncJobConfigRequest(ModifySyncJobConfigRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.DynamicObjects != null) {
            this.DynamicObjects = new Objects(source.DynamicObjects);
        }
        if (source.DynamicOptions != null) {
            this.DynamicOptions = new DynamicOptions(source.DynamicOptions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamObj(map, prefix + "DynamicObjects.", this.DynamicObjects);
        this.setParamObj(map, prefix + "DynamicOptions.", this.DynamicOptions);

    }
}

