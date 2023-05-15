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
package com.tencentcloudapi.eis.v20210601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListRuntimesMCRequest extends AbstractModel{

    /**
    * 环境运行类型：0:运行时类型、1:api类型
    */
    @SerializedName("RuntimeClass")
    @Expose
    private Long RuntimeClass;

    /**
    * 计划类型：0-pro 1-lite
    */
    @SerializedName("PlanType")
    @Expose
    private Long PlanType;

    /**
     * Get 环境运行类型：0:运行时类型、1:api类型 
     * @return RuntimeClass 环境运行类型：0:运行时类型、1:api类型
     */
    public Long getRuntimeClass() {
        return this.RuntimeClass;
    }

    /**
     * Set 环境运行类型：0:运行时类型、1:api类型
     * @param RuntimeClass 环境运行类型：0:运行时类型、1:api类型
     */
    public void setRuntimeClass(Long RuntimeClass) {
        this.RuntimeClass = RuntimeClass;
    }

    /**
     * Get 计划类型：0-pro 1-lite 
     * @return PlanType 计划类型：0-pro 1-lite
     */
    public Long getPlanType() {
        return this.PlanType;
    }

    /**
     * Set 计划类型：0-pro 1-lite
     * @param PlanType 计划类型：0-pro 1-lite
     */
    public void setPlanType(Long PlanType) {
        this.PlanType = PlanType;
    }

    public ListRuntimesMCRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRuntimesMCRequest(ListRuntimesMCRequest source) {
        if (source.RuntimeClass != null) {
            this.RuntimeClass = new Long(source.RuntimeClass);
        }
        if (source.PlanType != null) {
            this.PlanType = new Long(source.PlanType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuntimeClass", this.RuntimeClass);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);

    }
}

