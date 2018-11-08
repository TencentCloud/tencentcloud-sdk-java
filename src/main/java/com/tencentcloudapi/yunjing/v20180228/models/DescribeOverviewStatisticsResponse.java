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

public class DescribeOverviewStatisticsResponse  extends AbstractModel{

    /**
    * 服务器在线数。
    */
    @SerializedName("OnlineMachineNum")
    @Expose
    private Integer OnlineMachineNum;

    /**
    * 专业服务器数。
    */
    @SerializedName("ProVersionMachineNum")
    @Expose
    private Integer ProVersionMachineNum;

    /**
    * 木马文件数。
    */
    @SerializedName("MalwareNum")
    @Expose
    private Integer MalwareNum;

    /**
    * 异地登录数。
    */
    @SerializedName("NonlocalLoginNum")
    @Expose
    private Integer NonlocalLoginNum;

    /**
    * 暴力破解成功数。
    */
    @SerializedName("BruteAttackSuccessNum")
    @Expose
    private Integer BruteAttackSuccessNum;

    /**
    * 漏洞数。
    */
    @SerializedName("VulNum")
    @Expose
    private Integer VulNum;

    /**
    * 安全基线数。
    */
    @SerializedName("BaseLineNum")
    @Expose
    private Integer BaseLineNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取服务器在线数。
     * @return OnlineMachineNum 服务器在线数。
     */
    public Integer getOnlineMachineNum() {
        return this.OnlineMachineNum;
    }

    /**
     * 设置服务器在线数。
     * @param OnlineMachineNum 服务器在线数。
     */
    public void setOnlineMachineNum(Integer OnlineMachineNum) {
        this.OnlineMachineNum = OnlineMachineNum;
    }

    /**
     * 获取专业服务器数。
     * @return ProVersionMachineNum 专业服务器数。
     */
    public Integer getProVersionMachineNum() {
        return this.ProVersionMachineNum;
    }

    /**
     * 设置专业服务器数。
     * @param ProVersionMachineNum 专业服务器数。
     */
    public void setProVersionMachineNum(Integer ProVersionMachineNum) {
        this.ProVersionMachineNum = ProVersionMachineNum;
    }

    /**
     * 获取木马文件数。
     * @return MalwareNum 木马文件数。
     */
    public Integer getMalwareNum() {
        return this.MalwareNum;
    }

    /**
     * 设置木马文件数。
     * @param MalwareNum 木马文件数。
     */
    public void setMalwareNum(Integer MalwareNum) {
        this.MalwareNum = MalwareNum;
    }

    /**
     * 获取异地登录数。
     * @return NonlocalLoginNum 异地登录数。
     */
    public Integer getNonlocalLoginNum() {
        return this.NonlocalLoginNum;
    }

    /**
     * 设置异地登录数。
     * @param NonlocalLoginNum 异地登录数。
     */
    public void setNonlocalLoginNum(Integer NonlocalLoginNum) {
        this.NonlocalLoginNum = NonlocalLoginNum;
    }

    /**
     * 获取暴力破解成功数。
     * @return BruteAttackSuccessNum 暴力破解成功数。
     */
    public Integer getBruteAttackSuccessNum() {
        return this.BruteAttackSuccessNum;
    }

    /**
     * 设置暴力破解成功数。
     * @param BruteAttackSuccessNum 暴力破解成功数。
     */
    public void setBruteAttackSuccessNum(Integer BruteAttackSuccessNum) {
        this.BruteAttackSuccessNum = BruteAttackSuccessNum;
    }

    /**
     * 获取漏洞数。
     * @return VulNum 漏洞数。
     */
    public Integer getVulNum() {
        return this.VulNum;
    }

    /**
     * 设置漏洞数。
     * @param VulNum 漏洞数。
     */
    public void setVulNum(Integer VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * 获取安全基线数。
     * @return BaseLineNum 安全基线数。
     */
    public Integer getBaseLineNum() {
        return this.BaseLineNum;
    }

    /**
     * 设置安全基线数。
     * @param BaseLineNum 安全基线数。
     */
    public void setBaseLineNum(Integer BaseLineNum) {
        this.BaseLineNum = BaseLineNum;
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

