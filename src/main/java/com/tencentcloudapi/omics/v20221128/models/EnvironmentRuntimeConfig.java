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

public class EnvironmentRuntimeConfig extends AbstractModel {

    /**
    * Cromwell工作流引擎设置
    */
    @SerializedName("CromwellConfig")
    @Expose
    private CromwellConfig CromwellConfig;

    /**
    * Nextflow工作流引擎设置
    */
    @SerializedName("NextflowConfig")
    @Expose
    private NextflowConfig NextflowConfig;

    /**
     * Get Cromwell工作流引擎设置 
     * @return CromwellConfig Cromwell工作流引擎设置
     */
    public CromwellConfig getCromwellConfig() {
        return this.CromwellConfig;
    }

    /**
     * Set Cromwell工作流引擎设置
     * @param CromwellConfig Cromwell工作流引擎设置
     */
    public void setCromwellConfig(CromwellConfig CromwellConfig) {
        this.CromwellConfig = CromwellConfig;
    }

    /**
     * Get Nextflow工作流引擎设置 
     * @return NextflowConfig Nextflow工作流引擎设置
     */
    public NextflowConfig getNextflowConfig() {
        return this.NextflowConfig;
    }

    /**
     * Set Nextflow工作流引擎设置
     * @param NextflowConfig Nextflow工作流引擎设置
     */
    public void setNextflowConfig(NextflowConfig NextflowConfig) {
        this.NextflowConfig = NextflowConfig;
    }

    public EnvironmentRuntimeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvironmentRuntimeConfig(EnvironmentRuntimeConfig source) {
        if (source.CromwellConfig != null) {
            this.CromwellConfig = new CromwellConfig(source.CromwellConfig);
        }
        if (source.NextflowConfig != null) {
            this.NextflowConfig = new NextflowConfig(source.NextflowConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CromwellConfig.", this.CromwellConfig);
        this.setParamObj(map, prefix + "NextflowConfig.", this.NextflowConfig);

    }
}

