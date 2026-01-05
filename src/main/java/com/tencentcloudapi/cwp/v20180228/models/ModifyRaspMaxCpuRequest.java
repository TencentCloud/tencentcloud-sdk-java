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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRaspMaxCpuRequest extends AbstractModel {

    /**
    * rasp当前最大cpu限制，大于0，小于等于100，默认100表示不限制
    */
    @SerializedName("RaspMaxCpu")
    @Expose
    private Long RaspMaxCpu;

    /**
     * Get rasp当前最大cpu限制，大于0，小于等于100，默认100表示不限制 
     * @return RaspMaxCpu rasp当前最大cpu限制，大于0，小于等于100，默认100表示不限制
     */
    public Long getRaspMaxCpu() {
        return this.RaspMaxCpu;
    }

    /**
     * Set rasp当前最大cpu限制，大于0，小于等于100，默认100表示不限制
     * @param RaspMaxCpu rasp当前最大cpu限制，大于0，小于等于100，默认100表示不限制
     */
    public void setRaspMaxCpu(Long RaspMaxCpu) {
        this.RaspMaxCpu = RaspMaxCpu;
    }

    public ModifyRaspMaxCpuRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRaspMaxCpuRequest(ModifyRaspMaxCpuRequest source) {
        if (source.RaspMaxCpu != null) {
            this.RaspMaxCpu = new Long(source.RaspMaxCpu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RaspMaxCpu", this.RaspMaxCpu);

    }
}

