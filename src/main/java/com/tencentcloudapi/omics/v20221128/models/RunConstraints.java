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

public class RunConstraints extends AbstractModel {

    /**
    * <p>运行时可选的Nextflow版本</p>
    */
    @SerializedName("NextflowVersion")
    @Expose
    private String [] NextflowVersion;

    /**
     * Get <p>运行时可选的Nextflow版本</p> 
     * @return NextflowVersion <p>运行时可选的Nextflow版本</p>
     */
    public String [] getNextflowVersion() {
        return this.NextflowVersion;
    }

    /**
     * Set <p>运行时可选的Nextflow版本</p>
     * @param NextflowVersion <p>运行时可选的Nextflow版本</p>
     */
    public void setNextflowVersion(String [] NextflowVersion) {
        this.NextflowVersion = NextflowVersion;
    }

    public RunConstraints() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunConstraints(RunConstraints source) {
        if (source.NextflowVersion != null) {
            this.NextflowVersion = new String[source.NextflowVersion.length];
            for (int i = 0; i < source.NextflowVersion.length; i++) {
                this.NextflowVersion[i] = new String(source.NextflowVersion[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NextflowVersion.", this.NextflowVersion);

    }
}

