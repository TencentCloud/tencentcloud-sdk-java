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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConnectionConfigResponse extends AbstractModel {

    /**
    * 单分片入流量带宽限制，单位：MB。
    */
    @SerializedName("InNetLimit")
    @Expose
    private Long InNetLimit;

    /**
    * 单分片出流量带宽限制，单位：MB。
    */
    @SerializedName("OutNetLimit")
    @Expose
    private Long OutNetLimit;

    /**
    * 实例当前单分片连接数限制。
    */
    @SerializedName("ClientLimit")
    @Expose
    private Long ClientLimit;

    /**
    * 单分片连接数限制最小值。
    */
    @SerializedName("ClientLimitMin")
    @Expose
    private Long ClientLimitMin;

    /**
    * 单分片连接数限制最大值。
    */
    @SerializedName("ClientLimitMax")
    @Expose
    private Long ClientLimitMax;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 单分片入流量带宽限制，单位：MB。 
     * @return InNetLimit 单分片入流量带宽限制，单位：MB。
     */
    public Long getInNetLimit() {
        return this.InNetLimit;
    }

    /**
     * Set 单分片入流量带宽限制，单位：MB。
     * @param InNetLimit 单分片入流量带宽限制，单位：MB。
     */
    public void setInNetLimit(Long InNetLimit) {
        this.InNetLimit = InNetLimit;
    }

    /**
     * Get 单分片出流量带宽限制，单位：MB。 
     * @return OutNetLimit 单分片出流量带宽限制，单位：MB。
     */
    public Long getOutNetLimit() {
        return this.OutNetLimit;
    }

    /**
     * Set 单分片出流量带宽限制，单位：MB。
     * @param OutNetLimit 单分片出流量带宽限制，单位：MB。
     */
    public void setOutNetLimit(Long OutNetLimit) {
        this.OutNetLimit = OutNetLimit;
    }

    /**
     * Get 实例当前单分片连接数限制。 
     * @return ClientLimit 实例当前单分片连接数限制。
     */
    public Long getClientLimit() {
        return this.ClientLimit;
    }

    /**
     * Set 实例当前单分片连接数限制。
     * @param ClientLimit 实例当前单分片连接数限制。
     */
    public void setClientLimit(Long ClientLimit) {
        this.ClientLimit = ClientLimit;
    }

    /**
     * Get 单分片连接数限制最小值。 
     * @return ClientLimitMin 单分片连接数限制最小值。
     */
    public Long getClientLimitMin() {
        return this.ClientLimitMin;
    }

    /**
     * Set 单分片连接数限制最小值。
     * @param ClientLimitMin 单分片连接数限制最小值。
     */
    public void setClientLimitMin(Long ClientLimitMin) {
        this.ClientLimitMin = ClientLimitMin;
    }

    /**
     * Get 单分片连接数限制最大值。 
     * @return ClientLimitMax 单分片连接数限制最大值。
     */
    public Long getClientLimitMax() {
        return this.ClientLimitMax;
    }

    /**
     * Set 单分片连接数限制最大值。
     * @param ClientLimitMax 单分片连接数限制最大值。
     */
    public void setClientLimitMax(Long ClientLimitMax) {
        this.ClientLimitMax = ClientLimitMax;
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

    public DescribeConnectionConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConnectionConfigResponse(DescribeConnectionConfigResponse source) {
        if (source.InNetLimit != null) {
            this.InNetLimit = new Long(source.InNetLimit);
        }
        if (source.OutNetLimit != null) {
            this.OutNetLimit = new Long(source.OutNetLimit);
        }
        if (source.ClientLimit != null) {
            this.ClientLimit = new Long(source.ClientLimit);
        }
        if (source.ClientLimitMin != null) {
            this.ClientLimitMin = new Long(source.ClientLimitMin);
        }
        if (source.ClientLimitMax != null) {
            this.ClientLimitMax = new Long(source.ClientLimitMax);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InNetLimit", this.InNetLimit);
        this.setParamSimple(map, prefix + "OutNetLimit", this.OutNetLimit);
        this.setParamSimple(map, prefix + "ClientLimit", this.ClientLimit);
        this.setParamSimple(map, prefix + "ClientLimitMin", this.ClientLimitMin);
        this.setParamSimple(map, prefix + "ClientLimitMax", this.ClientLimitMax);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

