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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CromwellConfig extends AbstractModel {

    /**
    * 工作流并发数
    */
    @SerializedName("MaxConcurrentWorkflows")
    @Expose
    private Long MaxConcurrentWorkflows;

    /**
    * 作业并发数
    */
    @SerializedName("ConcurrentJobLimit")
    @Expose
    private Long ConcurrentJobLimit;

    /**
     * Get 工作流并发数 
     * @return MaxConcurrentWorkflows 工作流并发数
     */
    public Long getMaxConcurrentWorkflows() {
        return this.MaxConcurrentWorkflows;
    }

    /**
     * Set 工作流并发数
     * @param MaxConcurrentWorkflows 工作流并发数
     */
    public void setMaxConcurrentWorkflows(Long MaxConcurrentWorkflows) {
        this.MaxConcurrentWorkflows = MaxConcurrentWorkflows;
    }

    /**
     * Get 作业并发数 
     * @return ConcurrentJobLimit 作业并发数
     */
    public Long getConcurrentJobLimit() {
        return this.ConcurrentJobLimit;
    }

    /**
     * Set 作业并发数
     * @param ConcurrentJobLimit 作业并发数
     */
    public void setConcurrentJobLimit(Long ConcurrentJobLimit) {
        this.ConcurrentJobLimit = ConcurrentJobLimit;
    }

    public CromwellConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CromwellConfig(CromwellConfig source) {
        if (source.MaxConcurrentWorkflows != null) {
            this.MaxConcurrentWorkflows = new Long(source.MaxConcurrentWorkflows);
        }
        if (source.ConcurrentJobLimit != null) {
            this.ConcurrentJobLimit = new Long(source.ConcurrentJobLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxConcurrentWorkflows", this.MaxConcurrentWorkflows);
        this.setParamSimple(map, prefix + "ConcurrentJobLimit", this.ConcurrentJobLimit);

    }
}

