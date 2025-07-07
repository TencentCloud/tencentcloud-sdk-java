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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVULRiskDetailResponse extends AbstractModel {

    /**
    * 安全产品支持情况
    */
    @SerializedName("ServiceSupport")
    @Expose
    private ServiceSupport [] ServiceSupport;

    /**
    * 漏洞趋势
    */
    @SerializedName("VulTrend")
    @Expose
    private VulTrend [] VulTrend;

    /**
    * 漏洞补充信息
    */
    @SerializedName("VulData")
    @Expose
    private VULRiskInfo VulData;

    /**
    * 小助手问答id
    */
    @SerializedName("QuestionId")
    @Expose
    private String QuestionId;

    /**
    * 会话id
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 安全产品支持情况 
     * @return ServiceSupport 安全产品支持情况
     */
    public ServiceSupport [] getServiceSupport() {
        return this.ServiceSupport;
    }

    /**
     * Set 安全产品支持情况
     * @param ServiceSupport 安全产品支持情况
     */
    public void setServiceSupport(ServiceSupport [] ServiceSupport) {
        this.ServiceSupport = ServiceSupport;
    }

    /**
     * Get 漏洞趋势 
     * @return VulTrend 漏洞趋势
     */
    public VulTrend [] getVulTrend() {
        return this.VulTrend;
    }

    /**
     * Set 漏洞趋势
     * @param VulTrend 漏洞趋势
     */
    public void setVulTrend(VulTrend [] VulTrend) {
        this.VulTrend = VulTrend;
    }

    /**
     * Get 漏洞补充信息 
     * @return VulData 漏洞补充信息
     */
    public VULRiskInfo getVulData() {
        return this.VulData;
    }

    /**
     * Set 漏洞补充信息
     * @param VulData 漏洞补充信息
     */
    public void setVulData(VULRiskInfo VulData) {
        this.VulData = VulData;
    }

    /**
     * Get 小助手问答id 
     * @return QuestionId 小助手问答id
     */
    public String getQuestionId() {
        return this.QuestionId;
    }

    /**
     * Set 小助手问答id
     * @param QuestionId 小助手问答id
     */
    public void setQuestionId(String QuestionId) {
        this.QuestionId = QuestionId;
    }

    /**
     * Get 会话id 
     * @return SessionId 会话id
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话id
     * @param SessionId 会话id
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
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

    public DescribeVULRiskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVULRiskDetailResponse(DescribeVULRiskDetailResponse source) {
        if (source.ServiceSupport != null) {
            this.ServiceSupport = new ServiceSupport[source.ServiceSupport.length];
            for (int i = 0; i < source.ServiceSupport.length; i++) {
                this.ServiceSupport[i] = new ServiceSupport(source.ServiceSupport[i]);
            }
        }
        if (source.VulTrend != null) {
            this.VulTrend = new VulTrend[source.VulTrend.length];
            for (int i = 0; i < source.VulTrend.length; i++) {
                this.VulTrend[i] = new VulTrend(source.VulTrend[i]);
            }
        }
        if (source.VulData != null) {
            this.VulData = new VULRiskInfo(source.VulData);
        }
        if (source.QuestionId != null) {
            this.QuestionId = new String(source.QuestionId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ServiceSupport.", this.ServiceSupport);
        this.setParamArrayObj(map, prefix + "VulTrend.", this.VulTrend);
        this.setParamObj(map, prefix + "VulData.", this.VulData);
        this.setParamSimple(map, prefix + "QuestionId", this.QuestionId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

