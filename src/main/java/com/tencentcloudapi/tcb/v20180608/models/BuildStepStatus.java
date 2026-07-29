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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BuildStepStatus extends AbstractModel {

    /**
    * <p>构建步骤名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>构建状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>构建耗时</p>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
     * Get <p>构建步骤名称</p> 
     * @return Name <p>构建步骤名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>构建步骤名称</p>
     * @param Name <p>构建步骤名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>构建状态</p> 
     * @return Status <p>构建状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>构建状态</p>
     * @param Status <p>构建状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>构建耗时</p> 
     * @return Duration <p>构建耗时</p>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>构建耗时</p>
     * @param Duration <p>构建耗时</p>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public BuildStepStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildStepStatus(BuildStepStatus source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

