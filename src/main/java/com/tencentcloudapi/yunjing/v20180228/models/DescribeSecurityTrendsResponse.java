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

public class DescribeSecurityTrendsResponse extends AbstractModel{

    /**
    * 木马事件统计数据数组。
    */
    @SerializedName("Malwares")
    @Expose
    private SecurityTrend [] Malwares;

    /**
    * 异地登录事件统计数据数组。
    */
    @SerializedName("NonLocalLoginPlaces")
    @Expose
    private SecurityTrend [] NonLocalLoginPlaces;

    /**
    * 密码破解事件统计数据数组。
    */
    @SerializedName("BruteAttacks")
    @Expose
    private SecurityTrend [] BruteAttacks;

    /**
    * 漏洞统计数据数组。
    */
    @SerializedName("Vuls")
    @Expose
    private SecurityTrend [] Vuls;

    /**
    * 基线统计数据数组。
    */
    @SerializedName("BaseLines")
    @Expose
    private SecurityTrend [] BaseLines;

    /**
    * 恶意请求统计数据数组。
    */
    @SerializedName("MaliciousRequests")
    @Expose
    private SecurityTrend [] MaliciousRequests;

    /**
    * 高危命令统计数据数组。
    */
    @SerializedName("HighRiskBashs")
    @Expose
    private SecurityTrend [] HighRiskBashs;

    /**
    * 反弹shell统计数据数组。
    */
    @SerializedName("ReverseShells")
    @Expose
    private SecurityTrend [] ReverseShells;

    /**
    * 本地提权统计数据数组。
    */
    @SerializedName("PrivilegeEscalations")
    @Expose
    private SecurityTrend [] PrivilegeEscalations;

    /**
    * 网络攻击统计数据数组。
    */
    @SerializedName("CyberAttacks")
    @Expose
    private SecurityTrend [] CyberAttacks;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 木马事件统计数据数组。 
     * @return Malwares 木马事件统计数据数组。
     */
    public SecurityTrend [] getMalwares() {
        return this.Malwares;
    }

    /**
     * Set 木马事件统计数据数组。
     * @param Malwares 木马事件统计数据数组。
     */
    public void setMalwares(SecurityTrend [] Malwares) {
        this.Malwares = Malwares;
    }

    /**
     * Get 异地登录事件统计数据数组。 
     * @return NonLocalLoginPlaces 异地登录事件统计数据数组。
     */
    public SecurityTrend [] getNonLocalLoginPlaces() {
        return this.NonLocalLoginPlaces;
    }

    /**
     * Set 异地登录事件统计数据数组。
     * @param NonLocalLoginPlaces 异地登录事件统计数据数组。
     */
    public void setNonLocalLoginPlaces(SecurityTrend [] NonLocalLoginPlaces) {
        this.NonLocalLoginPlaces = NonLocalLoginPlaces;
    }

    /**
     * Get 密码破解事件统计数据数组。 
     * @return BruteAttacks 密码破解事件统计数据数组。
     */
    public SecurityTrend [] getBruteAttacks() {
        return this.BruteAttacks;
    }

    /**
     * Set 密码破解事件统计数据数组。
     * @param BruteAttacks 密码破解事件统计数据数组。
     */
    public void setBruteAttacks(SecurityTrend [] BruteAttacks) {
        this.BruteAttacks = BruteAttacks;
    }

    /**
     * Get 漏洞统计数据数组。 
     * @return Vuls 漏洞统计数据数组。
     */
    public SecurityTrend [] getVuls() {
        return this.Vuls;
    }

    /**
     * Set 漏洞统计数据数组。
     * @param Vuls 漏洞统计数据数组。
     */
    public void setVuls(SecurityTrend [] Vuls) {
        this.Vuls = Vuls;
    }

    /**
     * Get 基线统计数据数组。 
     * @return BaseLines 基线统计数据数组。
     */
    public SecurityTrend [] getBaseLines() {
        return this.BaseLines;
    }

    /**
     * Set 基线统计数据数组。
     * @param BaseLines 基线统计数据数组。
     */
    public void setBaseLines(SecurityTrend [] BaseLines) {
        this.BaseLines = BaseLines;
    }

    /**
     * Get 恶意请求统计数据数组。 
     * @return MaliciousRequests 恶意请求统计数据数组。
     */
    public SecurityTrend [] getMaliciousRequests() {
        return this.MaliciousRequests;
    }

    /**
     * Set 恶意请求统计数据数组。
     * @param MaliciousRequests 恶意请求统计数据数组。
     */
    public void setMaliciousRequests(SecurityTrend [] MaliciousRequests) {
        this.MaliciousRequests = MaliciousRequests;
    }

    /**
     * Get 高危命令统计数据数组。 
     * @return HighRiskBashs 高危命令统计数据数组。
     */
    public SecurityTrend [] getHighRiskBashs() {
        return this.HighRiskBashs;
    }

    /**
     * Set 高危命令统计数据数组。
     * @param HighRiskBashs 高危命令统计数据数组。
     */
    public void setHighRiskBashs(SecurityTrend [] HighRiskBashs) {
        this.HighRiskBashs = HighRiskBashs;
    }

    /**
     * Get 反弹shell统计数据数组。 
     * @return ReverseShells 反弹shell统计数据数组。
     */
    public SecurityTrend [] getReverseShells() {
        return this.ReverseShells;
    }

    /**
     * Set 反弹shell统计数据数组。
     * @param ReverseShells 反弹shell统计数据数组。
     */
    public void setReverseShells(SecurityTrend [] ReverseShells) {
        this.ReverseShells = ReverseShells;
    }

    /**
     * Get 本地提权统计数据数组。 
     * @return PrivilegeEscalations 本地提权统计数据数组。
     */
    public SecurityTrend [] getPrivilegeEscalations() {
        return this.PrivilegeEscalations;
    }

    /**
     * Set 本地提权统计数据数组。
     * @param PrivilegeEscalations 本地提权统计数据数组。
     */
    public void setPrivilegeEscalations(SecurityTrend [] PrivilegeEscalations) {
        this.PrivilegeEscalations = PrivilegeEscalations;
    }

    /**
     * Get 网络攻击统计数据数组。 
     * @return CyberAttacks 网络攻击统计数据数组。
     */
    public SecurityTrend [] getCyberAttacks() {
        return this.CyberAttacks;
    }

    /**
     * Set 网络攻击统计数据数组。
     * @param CyberAttacks 网络攻击统计数据数组。
     */
    public void setCyberAttacks(SecurityTrend [] CyberAttacks) {
        this.CyberAttacks = CyberAttacks;
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
        this.setParamArrayObj(map, prefix + "Malwares.", this.Malwares);
        this.setParamArrayObj(map, prefix + "NonLocalLoginPlaces.", this.NonLocalLoginPlaces);
        this.setParamArrayObj(map, prefix + "BruteAttacks.", this.BruteAttacks);
        this.setParamArrayObj(map, prefix + "Vuls.", this.Vuls);
        this.setParamArrayObj(map, prefix + "BaseLines.", this.BaseLines);
        this.setParamArrayObj(map, prefix + "MaliciousRequests.", this.MaliciousRequests);
        this.setParamArrayObj(map, prefix + "HighRiskBashs.", this.HighRiskBashs);
        this.setParamArrayObj(map, prefix + "ReverseShells.", this.ReverseShells);
        this.setParamArrayObj(map, prefix + "PrivilegeEscalations.", this.PrivilegeEscalations);
        this.setParamArrayObj(map, prefix + "CyberAttacks.", this.CyberAttacks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

