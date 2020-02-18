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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVulsReportRequest extends AbstractModel{

    /**
    * 站点ID
    */
    @SerializedName("SiteId")
    @Expose
    private Long SiteId;

    /**
    * 监控任务ID
    */
    @SerializedName("MonitorId")
    @Expose
    private Long MonitorId;

    /**
     * Get 站点ID 
     * @return SiteId 站点ID
     */
    public Long getSiteId() {
        return this.SiteId;
    }

    /**
     * Set 站点ID
     * @param SiteId 站点ID
     */
    public void setSiteId(Long SiteId) {
        this.SiteId = SiteId;
    }

    /**
     * Get 监控任务ID 
     * @return MonitorId 监控任务ID
     */
    public Long getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set 监控任务ID
     * @param MonitorId 监控任务ID
     */
    public void setMonitorId(Long MonitorId) {
        this.MonitorId = MonitorId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);

    }
}

