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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditLogListResponse extends AbstractModel {

    /**
    * <p>操作日志列表</p>
    */
    @SerializedName("AuditLogList")
    @Expose
    private AuditLog [] AuditLogList;

    /**
    * <p>es查询起始位置</p><p>用于入参查询下一页</p>
    */
    @SerializedName("SearchAfter")
    @Expose
    private String [] SearchAfter;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>操作日志列表</p> 
     * @return AuditLogList <p>操作日志列表</p>
     */
    public AuditLog [] getAuditLogList() {
        return this.AuditLogList;
    }

    /**
     * Set <p>操作日志列表</p>
     * @param AuditLogList <p>操作日志列表</p>
     */
    public void setAuditLogList(AuditLog [] AuditLogList) {
        this.AuditLogList = AuditLogList;
    }

    /**
     * Get <p>es查询起始位置</p><p>用于入参查询下一页</p> 
     * @return SearchAfter <p>es查询起始位置</p><p>用于入参查询下一页</p>
     */
    public String [] getSearchAfter() {
        return this.SearchAfter;
    }

    /**
     * Set <p>es查询起始位置</p><p>用于入参查询下一页</p>
     * @param SearchAfter <p>es查询起始位置</p><p>用于入参查询下一页</p>
     */
    public void setSearchAfter(String [] SearchAfter) {
        this.SearchAfter = SearchAfter;
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

    public DescribeAuditLogListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditLogListResponse(DescribeAuditLogListResponse source) {
        if (source.AuditLogList != null) {
            this.AuditLogList = new AuditLog[source.AuditLogList.length];
            for (int i = 0; i < source.AuditLogList.length; i++) {
                this.AuditLogList[i] = new AuditLog(source.AuditLogList[i]);
            }
        }
        if (source.SearchAfter != null) {
            this.SearchAfter = new String[source.SearchAfter.length];
            for (int i = 0; i < source.SearchAfter.length; i++) {
                this.SearchAfter[i] = new String(source.SearchAfter[i]);
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
        this.setParamArrayObj(map, prefix + "AuditLogList.", this.AuditLogList);
        this.setParamArraySimple(map, prefix + "SearchAfter.", this.SearchAfter);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

