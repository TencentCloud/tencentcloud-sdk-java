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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogDetailForUser extends AbstractModel{

    /**
    * 日志行号
    */
    @SerializedName("LineNumber")
    @Expose
    private Long LineNumber;

    /**
    * 日志详情
    */
    @SerializedName("LogMessage")
    @Expose
    private String LogMessage;

    /**
     * Get 日志行号 
     * @return LineNumber 日志行号
     */
    public Long getLineNumber() {
        return this.LineNumber;
    }

    /**
     * Set 日志行号
     * @param LineNumber 日志行号
     */
    public void setLineNumber(Long LineNumber) {
        this.LineNumber = LineNumber;
    }

    /**
     * Get 日志详情 
     * @return LogMessage 日志详情
     */
    public String getLogMessage() {
        return this.LogMessage;
    }

    /**
     * Set 日志详情
     * @param LogMessage 日志详情
     */
    public void setLogMessage(String LogMessage) {
        this.LogMessage = LogMessage;
    }

    public LogDetailForUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogDetailForUser(LogDetailForUser source) {
        if (source.LineNumber != null) {
            this.LineNumber = new Long(source.LineNumber);
        }
        if (source.LogMessage != null) {
            this.LogMessage = new String(source.LogMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LineNumber", this.LineNumber);
        this.setParamSimple(map, prefix + "LogMessage", this.LogMessage);

    }
}

