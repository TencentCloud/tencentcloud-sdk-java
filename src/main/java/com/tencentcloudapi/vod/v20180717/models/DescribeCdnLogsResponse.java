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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCdnLogsResponse extends AbstractModel{

    /**
    * 国内CDN节点的日志下载列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomesticCdnLogs")
    @Expose
    private CdnLogInfo [] DomesticCdnLogs;

    /**
    * 海外CDN节点的日志下载列表。如果域名没有开启海外加速，忽略该参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OverseaCdnLogs")
    @Expose
    private CdnLogInfo [] OverseaCdnLogs;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 国内CDN节点的日志下载列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomesticCdnLogs 国内CDN节点的日志下载列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CdnLogInfo [] getDomesticCdnLogs() {
        return this.DomesticCdnLogs;
    }

    /**
     * Set 国内CDN节点的日志下载列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomesticCdnLogs 国内CDN节点的日志下载列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomesticCdnLogs(CdnLogInfo [] DomesticCdnLogs) {
        this.DomesticCdnLogs = DomesticCdnLogs;
    }

    /**
     * Get 海外CDN节点的日志下载列表。如果域名没有开启海外加速，忽略该参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OverseaCdnLogs 海外CDN节点的日志下载列表。如果域名没有开启海外加速，忽略该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CdnLogInfo [] getOverseaCdnLogs() {
        return this.OverseaCdnLogs;
    }

    /**
     * Set 海外CDN节点的日志下载列表。如果域名没有开启海外加速，忽略该参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OverseaCdnLogs 海外CDN节点的日志下载列表。如果域名没有开启海外加速，忽略该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverseaCdnLogs(CdnLogInfo [] OverseaCdnLogs) {
        this.OverseaCdnLogs = OverseaCdnLogs;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DomesticCdnLogs.", this.DomesticCdnLogs);
        this.setParamArrayObj(map, prefix + "OverseaCdnLogs.", this.OverseaCdnLogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

