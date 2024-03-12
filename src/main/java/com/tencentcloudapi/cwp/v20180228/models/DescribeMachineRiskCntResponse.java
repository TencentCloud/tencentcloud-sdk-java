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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachineRiskCntResponse extends AbstractModel {

    /**
    * 异地登录
    */
    @SerializedName("HostLogin")
    @Expose
    private Long HostLogin;

    /**
    * 密码破解
    */
    @SerializedName("BruteAttack")
    @Expose
    private Long BruteAttack;

    /**
    * 恶意请求
    */
    @SerializedName("MaliciousRequest")
    @Expose
    private Long MaliciousRequest;

    /**
    * 反弹shell
    */
    @SerializedName("ReverseShell")
    @Expose
    private Long ReverseShell;

    /**
    * 高危命令
    */
    @SerializedName("Bash")
    @Expose
    private Long Bash;

    /**
    * 本地提权
    */
    @SerializedName("PrivilegeEscalation")
    @Expose
    private Long PrivilegeEscalation;

    /**
    * 木马
    */
    @SerializedName("Malware")
    @Expose
    private Long Malware;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 异地登录 
     * @return HostLogin 异地登录
     */
    public Long getHostLogin() {
        return this.HostLogin;
    }

    /**
     * Set 异地登录
     * @param HostLogin 异地登录
     */
    public void setHostLogin(Long HostLogin) {
        this.HostLogin = HostLogin;
    }

    /**
     * Get 密码破解 
     * @return BruteAttack 密码破解
     */
    public Long getBruteAttack() {
        return this.BruteAttack;
    }

    /**
     * Set 密码破解
     * @param BruteAttack 密码破解
     */
    public void setBruteAttack(Long BruteAttack) {
        this.BruteAttack = BruteAttack;
    }

    /**
     * Get 恶意请求 
     * @return MaliciousRequest 恶意请求
     */
    public Long getMaliciousRequest() {
        return this.MaliciousRequest;
    }

    /**
     * Set 恶意请求
     * @param MaliciousRequest 恶意请求
     */
    public void setMaliciousRequest(Long MaliciousRequest) {
        this.MaliciousRequest = MaliciousRequest;
    }

    /**
     * Get 反弹shell 
     * @return ReverseShell 反弹shell
     */
    public Long getReverseShell() {
        return this.ReverseShell;
    }

    /**
     * Set 反弹shell
     * @param ReverseShell 反弹shell
     */
    public void setReverseShell(Long ReverseShell) {
        this.ReverseShell = ReverseShell;
    }

    /**
     * Get 高危命令 
     * @return Bash 高危命令
     */
    public Long getBash() {
        return this.Bash;
    }

    /**
     * Set 高危命令
     * @param Bash 高危命令
     */
    public void setBash(Long Bash) {
        this.Bash = Bash;
    }

    /**
     * Get 本地提权 
     * @return PrivilegeEscalation 本地提权
     */
    public Long getPrivilegeEscalation() {
        return this.PrivilegeEscalation;
    }

    /**
     * Set 本地提权
     * @param PrivilegeEscalation 本地提权
     */
    public void setPrivilegeEscalation(Long PrivilegeEscalation) {
        this.PrivilegeEscalation = PrivilegeEscalation;
    }

    /**
     * Get 木马 
     * @return Malware 木马
     */
    public Long getMalware() {
        return this.Malware;
    }

    /**
     * Set 木马
     * @param Malware 木马
     */
    public void setMalware(Long Malware) {
        this.Malware = Malware;
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

    public DescribeMachineRiskCntResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachineRiskCntResponse(DescribeMachineRiskCntResponse source) {
        if (source.HostLogin != null) {
            this.HostLogin = new Long(source.HostLogin);
        }
        if (source.BruteAttack != null) {
            this.BruteAttack = new Long(source.BruteAttack);
        }
        if (source.MaliciousRequest != null) {
            this.MaliciousRequest = new Long(source.MaliciousRequest);
        }
        if (source.ReverseShell != null) {
            this.ReverseShell = new Long(source.ReverseShell);
        }
        if (source.Bash != null) {
            this.Bash = new Long(source.Bash);
        }
        if (source.PrivilegeEscalation != null) {
            this.PrivilegeEscalation = new Long(source.PrivilegeEscalation);
        }
        if (source.Malware != null) {
            this.Malware = new Long(source.Malware);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostLogin", this.HostLogin);
        this.setParamSimple(map, prefix + "BruteAttack", this.BruteAttack);
        this.setParamSimple(map, prefix + "MaliciousRequest", this.MaliciousRequest);
        this.setParamSimple(map, prefix + "ReverseShell", this.ReverseShell);
        this.setParamSimple(map, prefix + "Bash", this.Bash);
        this.setParamSimple(map, prefix + "PrivilegeEscalation", this.PrivilegeEscalation);
        this.setParamSimple(map, prefix + "Malware", this.Malware);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

