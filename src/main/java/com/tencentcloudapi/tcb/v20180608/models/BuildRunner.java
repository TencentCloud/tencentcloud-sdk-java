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

public class BuildRunner extends AbstractModel {

    /**
    * <p>构建服务所需 CPU 规格</p>
    */
    @SerializedName("Cpus")
    @Expose
    private Long Cpus;

    /**
     * Get <p>构建服务所需 CPU 规格</p> 
     * @return Cpus <p>构建服务所需 CPU 规格</p>
     */
    public Long getCpus() {
        return this.Cpus;
    }

    /**
     * Set <p>构建服务所需 CPU 规格</p>
     * @param Cpus <p>构建服务所需 CPU 规格</p>
     */
    public void setCpus(Long Cpus) {
        this.Cpus = Cpus;
    }

    public BuildRunner() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildRunner(BuildRunner source) {
        if (source.Cpus != null) {
            this.Cpus = new Long(source.Cpus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpus", this.Cpus);

    }
}

