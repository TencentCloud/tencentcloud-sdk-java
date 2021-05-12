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
package com.tencentcloudapi.asw.v20200722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopExecutionRequest extends AbstractModel{

    /**
    * 执行名称
    */
    @SerializedName("ExecutionQrn")
    @Expose
    private String ExecutionQrn;

    /**
     * Get 执行名称 
     * @return ExecutionQrn 执行名称
     */
    public String getExecutionQrn() {
        return this.ExecutionQrn;
    }

    /**
     * Set 执行名称
     * @param ExecutionQrn 执行名称
     */
    public void setExecutionQrn(String ExecutionQrn) {
        this.ExecutionQrn = ExecutionQrn;
    }

    public StopExecutionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopExecutionRequest(StopExecutionRequest source) {
        if (source.ExecutionQrn != null) {
            this.ExecutionQrn = new String(source.ExecutionQrn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionQrn", this.ExecutionQrn);

    }
}

