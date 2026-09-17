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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIAnalysisDataScope extends AbstractModel {

    /**
    * <p>告警AI诊断时查询的数据范围（查询哪些日志主题）</p>
    */
    @SerializedName("DataScopeEntry")
    @Expose
    private AIAnalysisDataScopeEntry [] DataScopeEntry;

    /**
    * <p>告警AI诊断的数据范围类型</p><p>枚举值：</p><ul><li>CLSLogTopic： 日志主题</li></ul><p>默认值：CLSLogTopic</p>
    */
    @SerializedName("DataScopeType")
    @Expose
    private String DataScopeType;

    /**
     * Get <p>告警AI诊断时查询的数据范围（查询哪些日志主题）</p> 
     * @return DataScopeEntry <p>告警AI诊断时查询的数据范围（查询哪些日志主题）</p>
     */
    public AIAnalysisDataScopeEntry [] getDataScopeEntry() {
        return this.DataScopeEntry;
    }

    /**
     * Set <p>告警AI诊断时查询的数据范围（查询哪些日志主题）</p>
     * @param DataScopeEntry <p>告警AI诊断时查询的数据范围（查询哪些日志主题）</p>
     */
    public void setDataScopeEntry(AIAnalysisDataScopeEntry [] DataScopeEntry) {
        this.DataScopeEntry = DataScopeEntry;
    }

    /**
     * Get <p>告警AI诊断的数据范围类型</p><p>枚举值：</p><ul><li>CLSLogTopic： 日志主题</li></ul><p>默认值：CLSLogTopic</p> 
     * @return DataScopeType <p>告警AI诊断的数据范围类型</p><p>枚举值：</p><ul><li>CLSLogTopic： 日志主题</li></ul><p>默认值：CLSLogTopic</p>
     */
    public String getDataScopeType() {
        return this.DataScopeType;
    }

    /**
     * Set <p>告警AI诊断的数据范围类型</p><p>枚举值：</p><ul><li>CLSLogTopic： 日志主题</li></ul><p>默认值：CLSLogTopic</p>
     * @param DataScopeType <p>告警AI诊断的数据范围类型</p><p>枚举值：</p><ul><li>CLSLogTopic： 日志主题</li></ul><p>默认值：CLSLogTopic</p>
     */
    public void setDataScopeType(String DataScopeType) {
        this.DataScopeType = DataScopeType;
    }

    public AIAnalysisDataScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAnalysisDataScope(AIAnalysisDataScope source) {
        if (source.DataScopeEntry != null) {
            this.DataScopeEntry = new AIAnalysisDataScopeEntry[source.DataScopeEntry.length];
            for (int i = 0; i < source.DataScopeEntry.length; i++) {
                this.DataScopeEntry[i] = new AIAnalysisDataScopeEntry(source.DataScopeEntry[i]);
            }
        }
        if (source.DataScopeType != null) {
            this.DataScopeType = new String(source.DataScopeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DataScopeEntry.", this.DataScopeEntry);
        this.setParamSimple(map, prefix + "DataScopeType", this.DataScopeType);

    }
}

