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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeUnitExtraResponse extends AbstractModel{

    /**
    * APIServer类型
    */
    @SerializedName("APIServerType")
    @Expose
    private String APIServerType;

    /**
    * 域名URL
    */
    @SerializedName("APIServerURL")
    @Expose
    private String APIServerURL;

    /**
    * 域名URL对应的端口
    */
    @SerializedName("APIServerURLPort")
    @Expose
    private String APIServerURLPort;

    /**
    * 域名URL对应的端口
    */
    @SerializedName("APIServerResolveIP")
    @Expose
    private String APIServerResolveIP;

    /**
    * 对外可访问的IP
    */
    @SerializedName("APIServerExposeAddress")
    @Expose
    private String APIServerExposeAddress;

    /**
    * 是否开启监控
    */
    @SerializedName("IsCreatePrometheus")
    @Expose
    private Boolean IsCreatePrometheus;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get APIServer类型 
     * @return APIServerType APIServer类型
     */
    public String getAPIServerType() {
        return this.APIServerType;
    }

    /**
     * Set APIServer类型
     * @param APIServerType APIServer类型
     */
    public void setAPIServerType(String APIServerType) {
        this.APIServerType = APIServerType;
    }

    /**
     * Get 域名URL 
     * @return APIServerURL 域名URL
     */
    public String getAPIServerURL() {
        return this.APIServerURL;
    }

    /**
     * Set 域名URL
     * @param APIServerURL 域名URL
     */
    public void setAPIServerURL(String APIServerURL) {
        this.APIServerURL = APIServerURL;
    }

    /**
     * Get 域名URL对应的端口 
     * @return APIServerURLPort 域名URL对应的端口
     */
    public String getAPIServerURLPort() {
        return this.APIServerURLPort;
    }

    /**
     * Set 域名URL对应的端口
     * @param APIServerURLPort 域名URL对应的端口
     */
    public void setAPIServerURLPort(String APIServerURLPort) {
        this.APIServerURLPort = APIServerURLPort;
    }

    /**
     * Get 域名URL对应的端口 
     * @return APIServerResolveIP 域名URL对应的端口
     */
    public String getAPIServerResolveIP() {
        return this.APIServerResolveIP;
    }

    /**
     * Set 域名URL对应的端口
     * @param APIServerResolveIP 域名URL对应的端口
     */
    public void setAPIServerResolveIP(String APIServerResolveIP) {
        this.APIServerResolveIP = APIServerResolveIP;
    }

    /**
     * Get 对外可访问的IP 
     * @return APIServerExposeAddress 对外可访问的IP
     */
    public String getAPIServerExposeAddress() {
        return this.APIServerExposeAddress;
    }

    /**
     * Set 对外可访问的IP
     * @param APIServerExposeAddress 对外可访问的IP
     */
    public void setAPIServerExposeAddress(String APIServerExposeAddress) {
        this.APIServerExposeAddress = APIServerExposeAddress;
    }

    /**
     * Get 是否开启监控 
     * @return IsCreatePrometheus 是否开启监控
     */
    public Boolean getIsCreatePrometheus() {
        return this.IsCreatePrometheus;
    }

    /**
     * Set 是否开启监控
     * @param IsCreatePrometheus 是否开启监控
     */
    public void setIsCreatePrometheus(Boolean IsCreatePrometheus) {
        this.IsCreatePrometheus = IsCreatePrometheus;
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

    public DescribeEdgeUnitExtraResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeUnitExtraResponse(DescribeEdgeUnitExtraResponse source) {
        if (source.APIServerType != null) {
            this.APIServerType = new String(source.APIServerType);
        }
        if (source.APIServerURL != null) {
            this.APIServerURL = new String(source.APIServerURL);
        }
        if (source.APIServerURLPort != null) {
            this.APIServerURLPort = new String(source.APIServerURLPort);
        }
        if (source.APIServerResolveIP != null) {
            this.APIServerResolveIP = new String(source.APIServerResolveIP);
        }
        if (source.APIServerExposeAddress != null) {
            this.APIServerExposeAddress = new String(source.APIServerExposeAddress);
        }
        if (source.IsCreatePrometheus != null) {
            this.IsCreatePrometheus = new Boolean(source.IsCreatePrometheus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "APIServerType", this.APIServerType);
        this.setParamSimple(map, prefix + "APIServerURL", this.APIServerURL);
        this.setParamSimple(map, prefix + "APIServerURLPort", this.APIServerURLPort);
        this.setParamSimple(map, prefix + "APIServerResolveIP", this.APIServerResolveIP);
        this.setParamSimple(map, prefix + "APIServerExposeAddress", this.APIServerExposeAddress);
        this.setParamSimple(map, prefix + "IsCreatePrometheus", this.IsCreatePrometheus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

