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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceConf extends AbstractModel {

    /**
    * 当为TCLake优化资源时，优化任务的并行度
    */
    @SerializedName("Parallelism")
    @Expose
    private Long Parallelism;

    /**
     * Get 当为TCLake优化资源时，优化任务的并行度 
     * @return Parallelism 当为TCLake优化资源时，优化任务的并行度
     */
    public Long getParallelism() {
        return this.Parallelism;
    }

    /**
     * Set 当为TCLake优化资源时，优化任务的并行度
     * @param Parallelism 当为TCLake优化资源时，优化任务的并行度
     */
    public void setParallelism(Long Parallelism) {
        this.Parallelism = Parallelism;
    }

    public ResourceConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceConf(ResourceConf source) {
        if (source.Parallelism != null) {
            this.Parallelism = new Long(source.Parallelism);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Parallelism", this.Parallelism);

    }
}

