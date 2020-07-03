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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorInfo extends AbstractModel{

    /**
    * 具体的报错日志, 包含错误码和错误信息
    */
    @SerializedName("ErrorLog")
    @Expose
    private String ErrorLog;

    /**
    * 报错对应的帮助文档Ur
    */
    @SerializedName("HelpDoc")
    @Expose
    private String HelpDoc;

    /**
     * Get 具体的报错日志, 包含错误码和错误信息 
     * @return ErrorLog 具体的报错日志, 包含错误码和错误信息
     */
    public String getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set 具体的报错日志, 包含错误码和错误信息
     * @param ErrorLog 具体的报错日志, 包含错误码和错误信息
     */
    public void setErrorLog(String ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    /**
     * Get 报错对应的帮助文档Ur 
     * @return HelpDoc 报错对应的帮助文档Ur
     */
    public String getHelpDoc() {
        return this.HelpDoc;
    }

    /**
     * Set 报错对应的帮助文档Ur
     * @param HelpDoc 报错对应的帮助文档Ur
     */
    public void setHelpDoc(String HelpDoc) {
        this.HelpDoc = HelpDoc;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorLog", this.ErrorLog);
        this.setParamSimple(map, prefix + "HelpDoc", this.HelpDoc);

    }
}

