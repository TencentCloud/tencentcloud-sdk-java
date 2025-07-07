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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePostCKafkaFlowsRequest extends AbstractModel {

    /**
    * 1-访问日志，2-攻击日志，默认为访问日志。
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
     * Get 1-访问日志，2-攻击日志，默认为访问日志。 
     * @return LogType 1-访问日志，2-攻击日志，默认为访问日志。
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set 1-访问日志，2-攻击日志，默认为访问日志。
     * @param LogType 1-访问日志，2-攻击日志，默认为访问日志。
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    public DescribePostCKafkaFlowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePostCKafkaFlowsRequest(DescribePostCKafkaFlowsRequest source) {
        if (source.LogType != null) {
            this.LogType = new Long(source.LogType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);

    }
}

