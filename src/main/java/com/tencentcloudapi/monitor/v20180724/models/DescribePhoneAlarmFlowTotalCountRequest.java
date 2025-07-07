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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePhoneAlarmFlowTotalCountRequest extends AbstractModel {

    /**
    * 默认monitor
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * unix时间戳，单位：s
    */
    @SerializedName("QueryTime")
    @Expose
    private Long QueryTime;

    /**
     * Get 默认monitor 
     * @return Module 默认monitor
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 默认monitor
     * @param Module 默认monitor
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get unix时间戳，单位：s 
     * @return QueryTime unix时间戳，单位：s
     */
    public Long getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set unix时间戳，单位：s
     * @param QueryTime unix时间戳，单位：s
     */
    public void setQueryTime(Long QueryTime) {
        this.QueryTime = QueryTime;
    }

    public DescribePhoneAlarmFlowTotalCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePhoneAlarmFlowTotalCountRequest(DescribePhoneAlarmFlowTotalCountRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.QueryTime != null) {
            this.QueryTime = new Long(source.QueryTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);

    }
}

