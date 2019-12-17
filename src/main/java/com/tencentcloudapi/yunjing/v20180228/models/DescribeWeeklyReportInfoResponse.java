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

public class DescribeWeeklyReportInfoResponse extends AbstractModel{

    /**
    * 账号所属公司或个人名称。
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 机器总数。
    */
    @SerializedName("MachineNum")
    @Expose
    private Long MachineNum;

    /**
    * 云镜客户端在线数。
    */
    @SerializedName("OnlineMachineNum")
    @Expose
    private Long OnlineMachineNum;

    /**
    * 云镜客户端离线数。
    */
    @SerializedName("OfflineMachineNum")
    @Expose
    private Long OfflineMachineNum;

    /**
    * 开通云镜专业版数量。
    */
    @SerializedName("ProVersionMachineNum")
    @Expose
    private Long ProVersionMachineNum;

    /**
    * 周报开始时间。
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * 周报结束时间。
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 安全等级。
<li>HIGH：高</li>
<li>MIDDLE：中</li>
<li>LOW：低</li>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 木马记录数。
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
    * 密码破解成功数。
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
    * 导出文件下载地址。
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 账号所属公司或个人名称。 
     * @return CompanyName 账号所属公司或个人名称。
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 账号所属公司或个人名称。
     * @param CompanyName 账号所属公司或个人名称。
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 机器总数。 
     * @return MachineNum 机器总数。
     */
    public Long getMachineNum() {
        return this.MachineNum;
    }

    /**
     * Set 机器总数。
     * @param MachineNum 机器总数。
     */
    public void setMachineNum(Long MachineNum) {
        this.MachineNum = MachineNum;
    }

    /**
     * Get 云镜客户端在线数。 
     * @return OnlineMachineNum 云镜客户端在线数。
     */
    public Long getOnlineMachineNum() {
        return this.OnlineMachineNum;
    }

    /**
     * Set 云镜客户端在线数。
     * @param OnlineMachineNum 云镜客户端在线数。
     */
    public void setOnlineMachineNum(Long OnlineMachineNum) {
        this.OnlineMachineNum = OnlineMachineNum;
    }

    /**
     * Get 云镜客户端离线数。 
     * @return OfflineMachineNum 云镜客户端离线数。
     */
    public Long getOfflineMachineNum() {
        return this.OfflineMachineNum;
    }

    /**
     * Set 云镜客户端离线数。
     * @param OfflineMachineNum 云镜客户端离线数。
     */
    public void setOfflineMachineNum(Long OfflineMachineNum) {
        this.OfflineMachineNum = OfflineMachineNum;
    }

    /**
     * Get 开通云镜专业版数量。 
     * @return ProVersionMachineNum 开通云镜专业版数量。
     */
    public Long getProVersionMachineNum() {
        return this.ProVersionMachineNum;
    }

    /**
     * Set 开通云镜专业版数量。
     * @param ProVersionMachineNum 开通云镜专业版数量。
     */
    public void setProVersionMachineNum(Long ProVersionMachineNum) {
        this.ProVersionMachineNum = ProVersionMachineNum;
    }

    /**
     * Get 周报开始时间。 
     * @return BeginDate 周报开始时间。
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set 周报开始时间。
     * @param BeginDate 周报开始时间。
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get 周报结束时间。 
     * @return EndDate 周报结束时间。
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 周报结束时间。
     * @param EndDate 周报结束时间。
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 安全等级。
<li>HIGH：高</li>
<li>MIDDLE：中</li>
<li>LOW：低</li> 
     * @return Level 安全等级。
<li>HIGH：高</li>
<li>MIDDLE：中</li>
<li>LOW：低</li>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 安全等级。
<li>HIGH：高</li>
<li>MIDDLE：中</li>
<li>LOW：低</li>
     * @param Level 安全等级。
<li>HIGH：高</li>
<li>MIDDLE：中</li>
<li>LOW：低</li>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 木马记录数。 
     * @return MalwareNum 木马记录数。
     */
    public Long getMalwareNum() {
        return this.MalwareNum;
    }

    /**
     * Set 木马记录数。
     * @param MalwareNum 木马记录数。
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
     * Get 密码破解成功数。 
     * @return BruteAttackSuccessNum 密码破解成功数。
     */
    public Long getBruteAttackSuccessNum() {
        return this.BruteAttackSuccessNum;
    }

    /**
     * Set 密码破解成功数。
     * @param BruteAttackSuccessNum 密码破解成功数。
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
     * Get 导出文件下载地址。 
     * @return DownloadUrl 导出文件下载地址。
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 导出文件下载地址。
     * @param DownloadUrl 导出文件下载地址。
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
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
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "MachineNum", this.MachineNum);
        this.setParamSimple(map, prefix + "OnlineMachineNum", this.OnlineMachineNum);
        this.setParamSimple(map, prefix + "OfflineMachineNum", this.OfflineMachineNum);
        this.setParamSimple(map, prefix + "ProVersionMachineNum", this.ProVersionMachineNum);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "MalwareNum", this.MalwareNum);
        this.setParamSimple(map, prefix + "NonlocalLoginNum", this.NonlocalLoginNum);
        this.setParamSimple(map, prefix + "BruteAttackSuccessNum", this.BruteAttackSuccessNum);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

