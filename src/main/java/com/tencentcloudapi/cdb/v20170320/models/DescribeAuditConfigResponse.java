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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditConfigResponse extends AbstractModel {

    /**
    * 审计日志保存时长。目前支持的值包括：[0，7，30，180，365，1095，1825]。
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * 审计日志存储类型。目前支持的值包括："storage" - 存储型。
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 是否正在关闭审计。目前支持的值包括："false"-否，"true"-是
    */
    @SerializedName("IsClosing")
    @Expose
    private String IsClosing;

    /**
    * 审计服务开通时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 审计日志保存时长。目前支持的值包括：[0，7，30，180，365，1095，1825]。 
     * @return LogExpireDay 审计日志保存时长。目前支持的值包括：[0，7，30，180，365，1095，1825]。
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set 审计日志保存时长。目前支持的值包括：[0，7，30，180，365，1095，1825]。
     * @param LogExpireDay 审计日志保存时长。目前支持的值包括：[0，7，30，180，365，1095，1825]。
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get 审计日志存储类型。目前支持的值包括："storage" - 存储型。 
     * @return LogType 审计日志存储类型。目前支持的值包括："storage" - 存储型。
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 审计日志存储类型。目前支持的值包括："storage" - 存储型。
     * @param LogType 审计日志存储类型。目前支持的值包括："storage" - 存储型。
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 是否正在关闭审计。目前支持的值包括："false"-否，"true"-是 
     * @return IsClosing 是否正在关闭审计。目前支持的值包括："false"-否，"true"-是
     */
    public String getIsClosing() {
        return this.IsClosing;
    }

    /**
     * Set 是否正在关闭审计。目前支持的值包括："false"-否，"true"-是
     * @param IsClosing 是否正在关闭审计。目前支持的值包括："false"-否，"true"-是
     */
    public void setIsClosing(String IsClosing) {
        this.IsClosing = IsClosing;
    }

    /**
     * Get 审计服务开通时间。 
     * @return CreateTime 审计服务开通时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 审计服务开通时间。
     * @param CreateTime 审计服务开通时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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

    public DescribeAuditConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditConfigResponse(DescribeAuditConfigResponse source) {
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.IsClosing != null) {
            this.IsClosing = new String(source.IsClosing);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "IsClosing", this.IsClosing);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

