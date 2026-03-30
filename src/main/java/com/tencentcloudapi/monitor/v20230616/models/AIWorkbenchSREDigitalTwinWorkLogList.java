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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIWorkbenchSREDigitalTwinWorkLogList extends AbstractModel {

    /**
    * 工作日志列表
    */
    @SerializedName("WorkLogs")
    @Expose
    private AIWorkbenchSREDigitalTwinWorkLog [] WorkLogs;

    /**
    * 总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get 工作日志列表 
     * @return WorkLogs 工作日志列表
     */
    public AIWorkbenchSREDigitalTwinWorkLog [] getWorkLogs() {
        return this.WorkLogs;
    }

    /**
     * Set 工作日志列表
     * @param WorkLogs 工作日志列表
     */
    public void setWorkLogs(AIWorkbenchSREDigitalTwinWorkLog [] WorkLogs) {
        this.WorkLogs = WorkLogs;
    }

    /**
     * Get 总数 
     * @return Total 总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
     * @param Total 总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public AIWorkbenchSREDigitalTwinWorkLogList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIWorkbenchSREDigitalTwinWorkLogList(AIWorkbenchSREDigitalTwinWorkLogList source) {
        if (source.WorkLogs != null) {
            this.WorkLogs = new AIWorkbenchSREDigitalTwinWorkLog[source.WorkLogs.length];
            for (int i = 0; i < source.WorkLogs.length; i++) {
                this.WorkLogs[i] = new AIWorkbenchSREDigitalTwinWorkLog(source.WorkLogs[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WorkLogs.", this.WorkLogs);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

