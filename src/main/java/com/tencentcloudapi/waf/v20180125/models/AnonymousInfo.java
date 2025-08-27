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

public class AnonymousInfo extends AbstractModel {

    /**
    * 操作列表，支持trackLog(JS/HTTP上传日志  )和realtimeProducer(kafka协议上传日志)
    */
    @SerializedName("Operations")
    @Expose
    private String [] Operations;

    /**
    * 条件列表
    */
    @SerializedName("Conditions")
    @Expose
    private ConditionInfo [] Conditions;

    /**
     * Get 操作列表，支持trackLog(JS/HTTP上传日志  )和realtimeProducer(kafka协议上传日志) 
     * @return Operations 操作列表，支持trackLog(JS/HTTP上传日志  )和realtimeProducer(kafka协议上传日志)
     */
    public String [] getOperations() {
        return this.Operations;
    }

    /**
     * Set 操作列表，支持trackLog(JS/HTTP上传日志  )和realtimeProducer(kafka协议上传日志)
     * @param Operations 操作列表，支持trackLog(JS/HTTP上传日志  )和realtimeProducer(kafka协议上传日志)
     */
    public void setOperations(String [] Operations) {
        this.Operations = Operations;
    }

    /**
     * Get 条件列表 
     * @return Conditions 条件列表
     */
    public ConditionInfo [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 条件列表
     * @param Conditions 条件列表
     */
    public void setConditions(ConditionInfo [] Conditions) {
        this.Conditions = Conditions;
    }

    public AnonymousInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnonymousInfo(AnonymousInfo source) {
        if (source.Operations != null) {
            this.Operations = new String[source.Operations.length];
            for (int i = 0; i < source.Operations.length; i++) {
                this.Operations[i] = new String(source.Operations[i]);
            }
        }
        if (source.Conditions != null) {
            this.Conditions = new ConditionInfo[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new ConditionInfo(source.Conditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Operations.", this.Operations);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);

    }
}

