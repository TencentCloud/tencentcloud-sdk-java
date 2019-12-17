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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulScanResultResponse extends AbstractModel{

    /**
    * 漏洞数量。
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * 专业版机器数。
    */
    @SerializedName("ProVersionNum")
    @Expose
    private Long ProVersionNum;

    /**
    * 受影响的专业版主机数。
    */
    @SerializedName("ImpactedHostNum")
    @Expose
    private Long ImpactedHostNum;

    /**
    * 主机总数。
    */
    @SerializedName("HostNum")
    @Expose
    private Long HostNum;

    /**
    * 基础版机器数。
    */
    @SerializedName("BasicVersionNum")
    @Expose
    private Long BasicVersionNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 漏洞数量。 
     * @return VulNum 漏洞数量。
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set 漏洞数量。
     * @param VulNum 漏洞数量。
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * Get 专业版机器数。 
     * @return ProVersionNum 专业版机器数。
     */
    public Long getProVersionNum() {
        return this.ProVersionNum;
    }

    /**
     * Set 专业版机器数。
     * @param ProVersionNum 专业版机器数。
     */
    public void setProVersionNum(Long ProVersionNum) {
        this.ProVersionNum = ProVersionNum;
    }

    /**
     * Get 受影响的专业版主机数。 
     * @return ImpactedHostNum 受影响的专业版主机数。
     */
    public Long getImpactedHostNum() {
        return this.ImpactedHostNum;
    }

    /**
     * Set 受影响的专业版主机数。
     * @param ImpactedHostNum 受影响的专业版主机数。
     */
    public void setImpactedHostNum(Long ImpactedHostNum) {
        this.ImpactedHostNum = ImpactedHostNum;
    }

    /**
     * Get 主机总数。 
     * @return HostNum 主机总数。
     */
    public Long getHostNum() {
        return this.HostNum;
    }

    /**
     * Set 主机总数。
     * @param HostNum 主机总数。
     */
    public void setHostNum(Long HostNum) {
        this.HostNum = HostNum;
    }

    /**
     * Get 基础版机器数。 
     * @return BasicVersionNum 基础版机器数。
     */
    public Long getBasicVersionNum() {
        return this.BasicVersionNum;
    }

    /**
     * Set 基础版机器数。
     * @param BasicVersionNum 基础版机器数。
     */
    public void setBasicVersionNum(Long BasicVersionNum) {
        this.BasicVersionNum = BasicVersionNum;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "ProVersionNum", this.ProVersionNum);
        this.setParamSimple(map, prefix + "ImpactedHostNum", this.ImpactedHostNum);
        this.setParamSimple(map, prefix + "HostNum", this.HostNum);
        this.setParamSimple(map, prefix + "BasicVersionNum", this.BasicVersionNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

