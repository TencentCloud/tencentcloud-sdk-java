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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCdnDomainLogsResponse extends AbstractModel {

    /**
    * 日志包下载链接。
下载内容是gz后缀的压缩包，解压后是无扩展名的文本文件。链接有效期1天。
    */
    @SerializedName("DomainLogs")
    @Expose
    private DomainLog [] DomainLogs;

    /**
    * 查询到的总条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志包下载链接。
下载内容是gz后缀的压缩包，解压后是无扩展名的文本文件。链接有效期1天。 
     * @return DomainLogs 日志包下载链接。
下载内容是gz后缀的压缩包，解压后是无扩展名的文本文件。链接有效期1天。
     */
    public DomainLog [] getDomainLogs() {
        return this.DomainLogs;
    }

    /**
     * Set 日志包下载链接。
下载内容是gz后缀的压缩包，解压后是无扩展名的文本文件。链接有效期1天。
     * @param DomainLogs 日志包下载链接。
下载内容是gz后缀的压缩包，解压后是无扩展名的文本文件。链接有效期1天。
     */
    public void setDomainLogs(DomainLog [] DomainLogs) {
        this.DomainLogs = DomainLogs;
    }

    /**
     * Get 查询到的总条数 
     * @return TotalCount 查询到的总条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询到的总条数
     * @param TotalCount 查询到的总条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeCdnDomainLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCdnDomainLogsResponse(DescribeCdnDomainLogsResponse source) {
        if (source.DomainLogs != null) {
            this.DomainLogs = new DomainLog[source.DomainLogs.length];
            for (int i = 0; i < source.DomainLogs.length; i++) {
                this.DomainLogs[i] = new DomainLog(source.DomainLogs[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DomainLogs.", this.DomainLogs);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

