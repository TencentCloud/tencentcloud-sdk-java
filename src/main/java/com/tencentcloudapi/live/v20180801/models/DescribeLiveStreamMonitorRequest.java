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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveStreamMonitorRequest extends AbstractModel {

    /**
    * 监播任务ID。
    */
    @SerializedName("MonitorId")
    @Expose
    private String MonitorId;

    /**
     * Get 监播任务ID。 
     * @return MonitorId 监播任务ID。
     */
    public String getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set 监播任务ID。
     * @param MonitorId 监播任务ID。
     */
    public void setMonitorId(String MonitorId) {
        this.MonitorId = MonitorId;
    }

    public DescribeLiveStreamMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveStreamMonitorRequest(DescribeLiveStreamMonitorRequest source) {
        if (source.MonitorId != null) {
            this.MonitorId = new String(source.MonitorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);

    }
}

