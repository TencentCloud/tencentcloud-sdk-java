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

public class DescribeOverviewStatisticsResponse extends AbstractModel{

    /**
    * 服务器在线数。
    */
    @SerializedName("OnlineMachineNum")
    @Expose
    private Long OnlineMachineNum;

    /**
    * 专业服务器数。
    */
    @SerializedName("ProVersionMachineNum")
    @Expose
    private Long ProVersionMachineNum;

    /**
    * 木马文件数。
    */
    @SerializedName("MalwareNum")
    @Expose
    private Long MalwareNum;

    /**
    * 异地登录数。
    */
    @SerializedName("NonlocalLoginNum")
    @Expose
    private Long NonlocalLoginNum;

    /**
    * 暴力破解成功数。
    */
    @SerializedName("BruteAttackSuccessNum")
    @Expose
    private Long BruteAttackSuccessNum;

    /**
    * 漏洞数。
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * 安全基线数。
    */
    @SerializedName("BaseLineNum")
    @Expose
    private Long BaseLineNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务器在线数。 
     * @return OnlineMachineNum 服务器在线数。
     */
    public Long getOnlineMachineNum() {
        return this.OnlineMachineNum;
    }

    /**
     * Set 服务器在线数。
     * @param OnlineMachineNum 服务器在线数。
     */
    public void setOnlineMachineNum(Long OnlineMachineNum) {
        this.OnlineMachineNum = OnlineMachineNum;
    }

    /**
     * Get 专业服务器数。 
     * @return ProVersionMachineNum 专业服务器数。
     */
    public Long getProVersionMachineNum() {
        return this.ProVersionMachineNum;
    }

    /**
     * Set 专业服务器数。
     * @param ProVersionMachineNum 专业服务器数。
     */
    public void setProVersionMachineNum(Long ProVersionMachineNum) {
        this.ProVersionMachineNum = ProVersionMachineNum;
    }

    /**
     * Get 木马文件数。 
     * @return MalwareNum 木马文件数。
     */
    public Long getMalwareNum() {
        return this.MalwareNum;
    }

    /**
     * Set 木马文件数。
     * @param MalwareNum 木马文件数。
     */
    public void setMalwareNum(Long MalwareNum) {
        this.MalwareNum = MalwareNum;
    }

    /**
     * Get 异地登录数。 
     * @return NonlocalLoginNum 异地登录数。
     */
    public Long getNonlocalLoginNum() {
        return this.NonlocalLoginNum;
    }

    /**
     * Set 异地登录数。
     * @param NonlocalLoginNum 异地登录数。
     */
    public void setNonlocalLoginNum(Long NonlocalLoginNum) {
        this.NonlocalLoginNum = NonlocalLoginNum;
    }

    /**
     * Get 暴力破解成功数。 
     * @return BruteAttackSuccessNum 暴力破解成功数。
     */
    public Long getBruteAttackSuccessNum() {
        return this.BruteAttackSuccessNum;
    }

    /**
     * Set 暴力破解成功数。
     * @param BruteAttackSuccessNum 暴力破解成功数。
     */
    public void setBruteAttackSuccessNum(Long BruteAttackSuccessNum) {
        this.BruteAttackSuccessNum = BruteAttackSuccessNum;
    }

    /**
     * Get 漏洞数。 
     * @return VulNum 漏洞数。
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set 漏洞数。
     * @param VulNum 漏洞数。
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * Get 安全基线数。 
     * @return BaseLineNum 安全基线数。
     */
    public Long getBaseLineNum() {
        return this.BaseLineNum;
    }

    /**
     * Set 安全基线数。
     * @param BaseLineNum 安全基线数。
     */
    public void setBaseLineNum(Long BaseLineNum) {
        this.BaseLineNum = BaseLineNum;
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
        this.setParamSimple(map, prefix + "OnlineMachineNum", this.OnlineMachineNum);
        this.setParamSimple(map, prefix + "ProVersionMachineNum", this.ProVersionMachineNum);
        this.setParamSimple(map, prefix + "MalwareNum", this.MalwareNum);
        this.setParamSimple(map, prefix + "NonlocalLoginNum", this.NonlocalLoginNum);
        this.setParamSimple(map, prefix + "BruteAttackSuccessNum", this.BruteAttackSuccessNum);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "BaseLineNum", this.BaseLineNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

