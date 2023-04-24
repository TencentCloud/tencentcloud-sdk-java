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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConnectionConfigResponse extends AbstractModel{

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
    * 单分片连接数限制。
    */
    @SerializedName("ClientLimit")
    @Expose
    private Long ClientLimit;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
     * Get 单分片连接数限制。 
     * @return ClientLimit 单分片连接数限制。
     */
    public Long getClientLimit() {
        return this.ClientLimit;
    }

    /**
     * Set 单分片连接数限制。
     * @param ClientLimit 单分片连接数限制。
     */
    public void setClientLimit(Long ClientLimit) {
        this.ClientLimit = ClientLimit;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

