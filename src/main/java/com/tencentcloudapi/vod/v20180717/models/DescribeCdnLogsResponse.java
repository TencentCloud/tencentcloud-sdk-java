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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCdnLogsResponse extends AbstractModel {

    /**
    * 日志下载链接总数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 海外CDN节点的日志下载列表。如果域名没有开启海外加速，忽略该参数。
    */
    @SerializedName("OverseaCdnLogs")
    @Expose
    private CdnLogInfo [] OverseaCdnLogs;

    /**
    * 国内CDN节点的日志下载列表。
    */
    @SerializedName("DomesticCdnLogs")
    @Expose
    private CdnLogInfo [] DomesticCdnLogs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志下载链接总数量。 
     * @return TotalCount 日志下载链接总数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 日志下载链接总数量。
     * @param TotalCount 日志下载链接总数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 海外CDN节点的日志下载列表。如果域名没有开启海外加速，忽略该参数。 
     * @return OverseaCdnLogs 海外CDN节点的日志下载列表。如果域名没有开启海外加速，忽略该参数。
     */
    public CdnLogInfo [] getOverseaCdnLogs() {
        return this.OverseaCdnLogs;
    }

    /**
     * Set 海外CDN节点的日志下载列表。如果域名没有开启海外加速，忽略该参数。
     * @param OverseaCdnLogs 海外CDN节点的日志下载列表。如果域名没有开启海外加速，忽略该参数。
     */
    public void setOverseaCdnLogs(CdnLogInfo [] OverseaCdnLogs) {
        this.OverseaCdnLogs = OverseaCdnLogs;
    }

    /**
     * Get 国内CDN节点的日志下载列表。 
     * @return DomesticCdnLogs 国内CDN节点的日志下载列表。
     */
    public CdnLogInfo [] getDomesticCdnLogs() {
        return this.DomesticCdnLogs;
    }

    /**
     * Set 国内CDN节点的日志下载列表。
     * @param DomesticCdnLogs 国内CDN节点的日志下载列表。
     */
    public void setDomesticCdnLogs(CdnLogInfo [] DomesticCdnLogs) {
        this.DomesticCdnLogs = DomesticCdnLogs;
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

    public DescribeCdnLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCdnLogsResponse(DescribeCdnLogsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.OverseaCdnLogs != null) {
            this.OverseaCdnLogs = new CdnLogInfo[source.OverseaCdnLogs.length];
            for (int i = 0; i < source.OverseaCdnLogs.length; i++) {
                this.OverseaCdnLogs[i] = new CdnLogInfo(source.OverseaCdnLogs[i]);
            }
        }
        if (source.DomesticCdnLogs != null) {
            this.DomesticCdnLogs = new CdnLogInfo[source.DomesticCdnLogs.length];
            for (int i = 0; i < source.DomesticCdnLogs.length; i++) {
                this.DomesticCdnLogs[i] = new CdnLogInfo(source.DomesticCdnLogs[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "OverseaCdnLogs.", this.OverseaCdnLogs);
        this.setParamArrayObj(map, prefix + "DomesticCdnLogs.", this.DomesticCdnLogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

