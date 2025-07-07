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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogsResponse extends AbstractModel {

    /**
    * 日志列表
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 总条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 返回状态码 0 成功 非0不成功
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * 返回信息  success 成功 其他 不成功
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * 七层协议，NTA日志有效
    */
    @SerializedName("AppProtocolList")
    @Expose
    private String [] AppProtocolList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志列表 
     * @return Data 日志列表
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 日志列表
     * @param Data 日志列表
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 总条数 
     * @return Total 总条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总条数
     * @param Total 总条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 返回状态码 0 成功 非0不成功 
     * @return ReturnCode 返回状态码 0 成功 非0不成功
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 返回状态码 0 成功 非0不成功
     * @param ReturnCode 返回状态码 0 成功 非0不成功
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 返回信息  success 成功 其他 不成功 
     * @return ReturnMsg 返回信息  success 成功 其他 不成功
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set 返回信息  success 成功 其他 不成功
     * @param ReturnMsg 返回信息  success 成功 其他 不成功
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get 七层协议，NTA日志有效 
     * @return AppProtocolList 七层协议，NTA日志有效
     */
    public String [] getAppProtocolList() {
        return this.AppProtocolList;
    }

    /**
     * Set 七层协议，NTA日志有效
     * @param AppProtocolList 七层协议，NTA日志有效
     */
    public void setAppProtocolList(String [] AppProtocolList) {
        this.AppProtocolList = AppProtocolList;
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

    public DescribeLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogsResponse(DescribeLogsResponse source) {
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.AppProtocolList != null) {
            this.AppProtocolList = new String[source.AppProtocolList.length];
            for (int i = 0; i < source.AppProtocolList.length; i++) {
                this.AppProtocolList[i] = new String(source.AppProtocolList[i]);
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
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamArraySimple(map, prefix + "AppProtocolList.", this.AppProtocolList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

