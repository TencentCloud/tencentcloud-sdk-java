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
    * <p>默认monitor</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>unix时间戳，单位：s</p>
    */
    @SerializedName("QueryTime")
    @Expose
    private Long QueryTime;

    /**
     * Get <p>默认monitor</p> 
     * @return Module <p>默认monitor</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>默认monitor</p>
     * @param Module <p>默认monitor</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>unix时间戳，单位：s</p> 
     * @return QueryTime <p>unix时间戳，单位：s</p>
     */
    public Long getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set <p>unix时间戳，单位：s</p>
     * @param QueryTime <p>unix时间戳，单位：s</p>
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

