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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCRMonitorRequest extends AbstractModel{

    /**
    * 作品ID
    */
    @SerializedName("WorkId")
    @Expose
    private Long WorkId;

    /**
    * 监测状态：1-开启监测 2-关闭监测
    */
    @SerializedName("MonitorStatus")
    @Expose
    private String MonitorStatus;

    /**
    * 监测截止时间
    */
    @SerializedName("MonitorEnd")
    @Expose
    private String MonitorEnd;

    /**
     * Get 作品ID 
     * @return WorkId 作品ID
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set 作品ID
     * @param WorkId 作品ID
     */
    public void setWorkId(Long WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get 监测状态：1-开启监测 2-关闭监测 
     * @return MonitorStatus 监测状态：1-开启监测 2-关闭监测
     */
    public String getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 监测状态：1-开启监测 2-关闭监测
     * @param MonitorStatus 监测状态：1-开启监测 2-关闭监测
     */
    public void setMonitorStatus(String MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get 监测截止时间 
     * @return MonitorEnd 监测截止时间
     */
    public String getMonitorEnd() {
        return this.MonitorEnd;
    }

    /**
     * Set 监测截止时间
     * @param MonitorEnd 监测截止时间
     */
    public void setMonitorEnd(String MonitorEnd) {
        this.MonitorEnd = MonitorEnd;
    }

    public ModifyCRMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCRMonitorRequest(ModifyCRMonitorRequest source) {
        if (source.WorkId != null) {
            this.WorkId = new Long(source.WorkId);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new String(source.MonitorStatus);
        }
        if (source.MonitorEnd != null) {
            this.MonitorEnd = new String(source.MonitorEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkId", this.WorkId);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "MonitorEnd", this.MonitorEnd);

    }
}

