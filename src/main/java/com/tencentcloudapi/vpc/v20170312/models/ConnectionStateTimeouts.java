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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConnectionStateTimeouts extends AbstractModel {

    /**
    * UDP映射空闲时间，指多少秒以后UDP流停止向端点发送。取值范围为：3-7200秒，默认为10秒。
    */
    @SerializedName("UDPMappingTimeout")
    @Expose
    private Long UDPMappingTimeout;

    /**
    * TCP已建立的连接空闲超时，指多少秒以后连接变为空闲状态。取值范围为：40-10800秒，默认为10800秒。
    */
    @SerializedName("TCPEstablishedConnectionTimeout")
    @Expose
    private Long TCPEstablishedConnectionTimeout;

    /**
    * TCP TIME_WAIT超时，指完全关闭的TCP连接在到期后保留在NAT映射中的秒数。取值范围为：10-600秒，默认为120秒。
    */
    @SerializedName("TCPTimeWaitTimeout")
    @Expose
    private Long TCPTimeWaitTimeout;

    /**
     * Get UDP映射空闲时间，指多少秒以后UDP流停止向端点发送。取值范围为：3-7200秒，默认为10秒。 
     * @return UDPMappingTimeout UDP映射空闲时间，指多少秒以后UDP流停止向端点发送。取值范围为：3-7200秒，默认为10秒。
     */
    public Long getUDPMappingTimeout() {
        return this.UDPMappingTimeout;
    }

    /**
     * Set UDP映射空闲时间，指多少秒以后UDP流停止向端点发送。取值范围为：3-7200秒，默认为10秒。
     * @param UDPMappingTimeout UDP映射空闲时间，指多少秒以后UDP流停止向端点发送。取值范围为：3-7200秒，默认为10秒。
     */
    public void setUDPMappingTimeout(Long UDPMappingTimeout) {
        this.UDPMappingTimeout = UDPMappingTimeout;
    }

    /**
     * Get TCP已建立的连接空闲超时，指多少秒以后连接变为空闲状态。取值范围为：40-10800秒，默认为10800秒。 
     * @return TCPEstablishedConnectionTimeout TCP已建立的连接空闲超时，指多少秒以后连接变为空闲状态。取值范围为：40-10800秒，默认为10800秒。
     */
    public Long getTCPEstablishedConnectionTimeout() {
        return this.TCPEstablishedConnectionTimeout;
    }

    /**
     * Set TCP已建立的连接空闲超时，指多少秒以后连接变为空闲状态。取值范围为：40-10800秒，默认为10800秒。
     * @param TCPEstablishedConnectionTimeout TCP已建立的连接空闲超时，指多少秒以后连接变为空闲状态。取值范围为：40-10800秒，默认为10800秒。
     */
    public void setTCPEstablishedConnectionTimeout(Long TCPEstablishedConnectionTimeout) {
        this.TCPEstablishedConnectionTimeout = TCPEstablishedConnectionTimeout;
    }

    /**
     * Get TCP TIME_WAIT超时，指完全关闭的TCP连接在到期后保留在NAT映射中的秒数。取值范围为：10-600秒，默认为120秒。 
     * @return TCPTimeWaitTimeout TCP TIME_WAIT超时，指完全关闭的TCP连接在到期后保留在NAT映射中的秒数。取值范围为：10-600秒，默认为120秒。
     */
    public Long getTCPTimeWaitTimeout() {
        return this.TCPTimeWaitTimeout;
    }

    /**
     * Set TCP TIME_WAIT超时，指完全关闭的TCP连接在到期后保留在NAT映射中的秒数。取值范围为：10-600秒，默认为120秒。
     * @param TCPTimeWaitTimeout TCP TIME_WAIT超时，指完全关闭的TCP连接在到期后保留在NAT映射中的秒数。取值范围为：10-600秒，默认为120秒。
     */
    public void setTCPTimeWaitTimeout(Long TCPTimeWaitTimeout) {
        this.TCPTimeWaitTimeout = TCPTimeWaitTimeout;
    }

    public ConnectionStateTimeouts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectionStateTimeouts(ConnectionStateTimeouts source) {
        if (source.UDPMappingTimeout != null) {
            this.UDPMappingTimeout = new Long(source.UDPMappingTimeout);
        }
        if (source.TCPEstablishedConnectionTimeout != null) {
            this.TCPEstablishedConnectionTimeout = new Long(source.TCPEstablishedConnectionTimeout);
        }
        if (source.TCPTimeWaitTimeout != null) {
            this.TCPTimeWaitTimeout = new Long(source.TCPTimeWaitTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UDPMappingTimeout", this.UDPMappingTimeout);
        this.setParamSimple(map, prefix + "TCPEstablishedConnectionTimeout", this.TCPEstablishedConnectionTimeout);
        this.setParamSimple(map, prefix + "TCPTimeWaitTimeout", this.TCPTimeWaitTimeout);

    }
}

