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

public class DescribeVulScanResultResponse  extends AbstractModel{

    /**
    * 漏洞数量。
    */
    @SerializedName("VulNum")
    @Expose
    private Integer VulNum;

    /**
    * 专业版机器数。
    */
    @SerializedName("ProVersionNum")
    @Expose
    private Integer ProVersionNum;

    /**
    * 受影响的专业版主机数。
    */
    @SerializedName("ImpactedHostNum")
    @Expose
    private Integer ImpactedHostNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取漏洞数量。
     * @return VulNum 漏洞数量。
     */
    public Integer getVulNum() {
        return this.VulNum;
    }

    /**
     * 设置漏洞数量。
     * @param VulNum 漏洞数量。
     */
    public void setVulNum(Integer VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * 获取专业版机器数。
     * @return ProVersionNum 专业版机器数。
     */
    public Integer getProVersionNum() {
        return this.ProVersionNum;
    }

    /**
     * 设置专业版机器数。
     * @param ProVersionNum 专业版机器数。
     */
    public void setProVersionNum(Integer ProVersionNum) {
        this.ProVersionNum = ProVersionNum;
    }

    /**
     * 获取受影响的专业版主机数。
     * @return ImpactedHostNum 受影响的专业版主机数。
     */
    public Integer getImpactedHostNum() {
        return this.ImpactedHostNum;
    }

    /**
     * 设置受影响的专业版主机数。
     * @param ImpactedHostNum 受影响的专业版主机数。
     */
    public void setImpactedHostNum(Integer ImpactedHostNum) {
        this.ImpactedHostNum = ImpactedHostNum;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "ProVersionNum", this.ProVersionNum);
        this.setParamSimple(map, prefix + "ImpactedHostNum", this.ImpactedHostNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

