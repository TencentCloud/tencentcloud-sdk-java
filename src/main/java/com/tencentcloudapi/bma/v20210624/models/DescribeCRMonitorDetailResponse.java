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

public class DescribeCRMonitorDetailResponse extends AbstractModel{

    /**
    * 侵权数组
    */
    @SerializedName("Torts")
    @Expose
    private MonitorTort [] Torts;

    /**
    * 总记录数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 监测状态
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * 导出地址
    */
    @SerializedName("ExportURL")
    @Expose
    private String ExportURL;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 侵权数组 
     * @return Torts 侵权数组
     */
    public MonitorTort [] getTorts() {
        return this.Torts;
    }

    /**
     * Set 侵权数组
     * @param Torts 侵权数组
     */
    public void setTorts(MonitorTort [] Torts) {
        this.Torts = Torts;
    }

    /**
     * Get 总记录数 
     * @return TotalCount 总记录数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总记录数
     * @param TotalCount 总记录数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 监测状态 
     * @return MonitorStatus 监测状态
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 监测状态
     * @param MonitorStatus 监测状态
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get 导出地址 
     * @return ExportURL 导出地址
     */
    public String getExportURL() {
        return this.ExportURL;
    }

    /**
     * Set 导出地址
     * @param ExportURL 导出地址
     */
    public void setExportURL(String ExportURL) {
        this.ExportURL = ExportURL;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCRMonitorDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCRMonitorDetailResponse(DescribeCRMonitorDetailResponse source) {
        if (source.Torts != null) {
            this.Torts = new MonitorTort[source.Torts.length];
            for (int i = 0; i < source.Torts.length; i++) {
                this.Torts[i] = new MonitorTort(source.Torts[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Long(source.MonitorStatus);
        }
        if (source.ExportURL != null) {
            this.ExportURL = new String(source.ExportURL);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Torts.", this.Torts);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "ExportURL", this.ExportURL);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

