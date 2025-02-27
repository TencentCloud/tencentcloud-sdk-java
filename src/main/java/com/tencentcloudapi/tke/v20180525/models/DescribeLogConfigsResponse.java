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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogConfigsResponse extends AbstractModel {

    /**
    * 分页查找时返回采集规则总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 指定采集规则名称查找，部分失败时返回失败采集规则名称及最后一个失败原因
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 采集规则查询结果
    */
    @SerializedName("LogConfigs")
    @Expose
    private String LogConfigs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分页查找时返回采集规则总数 
     * @return Total 分页查找时返回采集规则总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 分页查找时返回采集规则总数
     * @param Total 分页查找时返回采集规则总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 指定采集规则名称查找，部分失败时返回失败采集规则名称及最后一个失败原因 
     * @return Message 指定采集规则名称查找，部分失败时返回失败采集规则名称及最后一个失败原因
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 指定采集规则名称查找，部分失败时返回失败采集规则名称及最后一个失败原因
     * @param Message 指定采集规则名称查找，部分失败时返回失败采集规则名称及最后一个失败原因
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 采集规则查询结果 
     * @return LogConfigs 采集规则查询结果
     */
    public String getLogConfigs() {
        return this.LogConfigs;
    }

    /**
     * Set 采集规则查询结果
     * @param LogConfigs 采集规则查询结果
     */
    public void setLogConfigs(String LogConfigs) {
        this.LogConfigs = LogConfigs;
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

    public DescribeLogConfigsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogConfigsResponse(DescribeLogConfigsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.LogConfigs != null) {
            this.LogConfigs = new String(source.LogConfigs);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "LogConfigs", this.LogConfigs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

