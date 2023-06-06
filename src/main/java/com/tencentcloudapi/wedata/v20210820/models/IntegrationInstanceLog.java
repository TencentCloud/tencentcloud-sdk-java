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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationInstanceLog extends AbstractModel{

    /**
    * 任务日志信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogInfo")
    @Expose
    private String LogInfo;

    /**
     * Get 任务日志信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogInfo 任务日志信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogInfo() {
        return this.LogInfo;
    }

    /**
     * Set 任务日志信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogInfo 任务日志信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogInfo(String LogInfo) {
        this.LogInfo = LogInfo;
    }

    public IntegrationInstanceLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationInstanceLog(IntegrationInstanceLog source) {
        if (source.LogInfo != null) {
            this.LogInfo = new String(source.LogInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogInfo", this.LogInfo);

    }
}

