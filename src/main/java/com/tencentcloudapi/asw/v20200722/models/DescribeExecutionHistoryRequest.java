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

public class DescribeExecutionHistoryRequest extends AbstractModel{

    /**
    * 执行资源名
    */
    @SerializedName("ExecutionResourceName")
    @Expose
    private String ExecutionResourceName;

    /**
     * Get 执行资源名 
     * @return ExecutionResourceName 执行资源名
     */
    public String getExecutionResourceName() {
        return this.ExecutionResourceName;
    }

    /**
     * Set 执行资源名
     * @param ExecutionResourceName 执行资源名
     */
    public void setExecutionResourceName(String ExecutionResourceName) {
        this.ExecutionResourceName = ExecutionResourceName;
    }

    public DescribeExecutionHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExecutionHistoryRequest(DescribeExecutionHistoryRequest source) {
        if (source.ExecutionResourceName != null) {
            this.ExecutionResourceName = new String(source.ExecutionResourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionResourceName", this.ExecutionResourceName);

    }
}

