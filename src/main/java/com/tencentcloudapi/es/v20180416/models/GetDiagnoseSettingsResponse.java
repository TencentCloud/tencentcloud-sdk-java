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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDiagnoseSettingsResponse extends AbstractModel {

    /**
    * 智能运维诊断项和元信息
    */
    @SerializedName("DiagnoseJobMetas")
    @Expose
    private DiagnoseJobMeta [] DiagnoseJobMetas;

    /**
    * 0：开启智能运维；-1：关闭智能运维
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 智能运维每天定时巡检时间
    */
    @SerializedName("CronTime")
    @Expose
    private String CronTime;

    /**
    * 智能运维当天已手动触发诊断次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 智能运维每天最大可手动触发次数
    */
    @SerializedName("MaxCount")
    @Expose
    private Long MaxCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 智能运维诊断项和元信息 
     * @return DiagnoseJobMetas 智能运维诊断项和元信息
     */
    public DiagnoseJobMeta [] getDiagnoseJobMetas() {
        return this.DiagnoseJobMetas;
    }

    /**
     * Set 智能运维诊断项和元信息
     * @param DiagnoseJobMetas 智能运维诊断项和元信息
     */
    public void setDiagnoseJobMetas(DiagnoseJobMeta [] DiagnoseJobMetas) {
        this.DiagnoseJobMetas = DiagnoseJobMetas;
    }

    /**
     * Get 0：开启智能运维；-1：关闭智能运维 
     * @return Status 0：开启智能运维；-1：关闭智能运维
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0：开启智能运维；-1：关闭智能运维
     * @param Status 0：开启智能运维；-1：关闭智能运维
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 智能运维每天定时巡检时间 
     * @return CronTime 智能运维每天定时巡检时间
     */
    public String getCronTime() {
        return this.CronTime;
    }

    /**
     * Set 智能运维每天定时巡检时间
     * @param CronTime 智能运维每天定时巡检时间
     */
    public void setCronTime(String CronTime) {
        this.CronTime = CronTime;
    }

    /**
     * Get 智能运维当天已手动触发诊断次数 
     * @return Count 智能运维当天已手动触发诊断次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 智能运维当天已手动触发诊断次数
     * @param Count 智能运维当天已手动触发诊断次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 智能运维每天最大可手动触发次数 
     * @return MaxCount 智能运维每天最大可手动触发次数
     */
    public Long getMaxCount() {
        return this.MaxCount;
    }

    /**
     * Set 智能运维每天最大可手动触发次数
     * @param MaxCount 智能运维每天最大可手动触发次数
     */
    public void setMaxCount(Long MaxCount) {
        this.MaxCount = MaxCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetDiagnoseSettingsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDiagnoseSettingsResponse(GetDiagnoseSettingsResponse source) {
        if (source.DiagnoseJobMetas != null) {
            this.DiagnoseJobMetas = new DiagnoseJobMeta[source.DiagnoseJobMetas.length];
            for (int i = 0; i < source.DiagnoseJobMetas.length; i++) {
                this.DiagnoseJobMetas[i] = new DiagnoseJobMeta(source.DiagnoseJobMetas[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CronTime != null) {
            this.CronTime = new String(source.CronTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.MaxCount != null) {
            this.MaxCount = new Long(source.MaxCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DiagnoseJobMetas.", this.DiagnoseJobMetas);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CronTime", this.CronTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "MaxCount", this.MaxCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

