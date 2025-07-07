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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMonitorDetailRequest extends AbstractModel {

    /**
    * 监控器id
    */
    @SerializedName("MonitorId")
    @Expose
    private Long MonitorId;

    /**
     * Get 监控器id 
     * @return MonitorId 监控器id
     */
    public Long getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set 监控器id
     * @param MonitorId 监控器id
     */
    public void setMonitorId(Long MonitorId) {
        this.MonitorId = MonitorId;
    }

    public DescribeMonitorDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMonitorDetailRequest(DescribeMonitorDetailRequest source) {
        if (source.MonitorId != null) {
            this.MonitorId = new Long(source.MonitorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);

    }
}

