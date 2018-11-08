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

public class DescribeMachineInfoResponse  extends AbstractModel{

    /**
    * 机器ip。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 受云镜保护天数。
    */
    @SerializedName("ProtectDays")
    @Expose
    private Integer ProtectDays;

    /**
    * 操作系统。
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * 主机名称。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 在线状态。
<li>ONLINE： 在线</li>
<li>OFFLINE：离线</li>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * CVM或BM主机唯一标识。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主机外网IP。
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * CVM或BM主机唯一Uuid。
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 云镜客户端唯一Uuid。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 是否开通专业版。
<li>true：是</li>
<li>false：否</li>
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * 专业版开通时间。
    */
    @SerializedName("ProVersionOpenDate")
    @Expose
    private String ProVersionOpenDate;

    /**
    * 云主机类型。
<li>CVM: 虚拟主机</li>
<li>BM: 黑石物理机</li>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 机器所属地域。如：ap-guangzhou，ap-shanghai
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * 主机状态。
<li>POSTPAY: 表示后付费，即按量计费  </li>
<li>PREPAY: 表示预付费，即包年包月</li>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取机器ip。
     * @return MachineIp 机器ip。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * 设置机器ip。
     * @param MachineIp 机器ip。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * 获取受云镜保护天数。
     * @return ProtectDays 受云镜保护天数。
     */
    public Integer getProtectDays() {
        return this.ProtectDays;
    }

    /**
     * 设置受云镜保护天数。
     * @param ProtectDays 受云镜保护天数。
     */
    public void setProtectDays(Integer ProtectDays) {
        this.ProtectDays = ProtectDays;
    }

    /**
     * 获取操作系统。
     * @return MachineOs 操作系统。
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * 设置操作系统。
     * @param MachineOs 操作系统。
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * 获取主机名称。
     * @return MachineName 主机名称。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * 设置主机名称。
     * @param MachineName 主机名称。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * 获取在线状态。
<li>ONLINE： 在线</li>
<li>OFFLINE：离线</li>
     * @return MachineStatus 在线状态。
<li>ONLINE： 在线</li>
<li>OFFLINE：离线</li>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * 设置在线状态。
<li>ONLINE： 在线</li>
<li>OFFLINE：离线</li>
     * @param MachineStatus 在线状态。
<li>ONLINE： 在线</li>
<li>OFFLINE：离线</li>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * 获取CVM或BM主机唯一标识。
     * @return InstanceId CVM或BM主机唯一标识。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置CVM或BM主机唯一标识。
     * @param InstanceId CVM或BM主机唯一标识。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取主机外网IP。
     * @return MachineWanIp 主机外网IP。
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * 设置主机外网IP。
     * @param MachineWanIp 主机外网IP。
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * 获取CVM或BM主机唯一Uuid。
     * @return Quuid CVM或BM主机唯一Uuid。
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * 设置CVM或BM主机唯一Uuid。
     * @param Quuid CVM或BM主机唯一Uuid。
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * 获取云镜客户端唯一Uuid。
     * @return Uuid 云镜客户端唯一Uuid。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * 设置云镜客户端唯一Uuid。
     * @param Uuid 云镜客户端唯一Uuid。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * 获取是否开通专业版。
<li>true：是</li>
<li>false：否</li>
     * @return IsProVersion 是否开通专业版。
<li>true：是</li>
<li>false：否</li>
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * 设置是否开通专业版。
<li>true：是</li>
<li>false：否</li>
     * @param IsProVersion 是否开通专业版。
<li>true：是</li>
<li>false：否</li>
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * 获取专业版开通时间。
     * @return ProVersionOpenDate 专业版开通时间。
     */
    public String getProVersionOpenDate() {
        return this.ProVersionOpenDate;
    }

    /**
     * 设置专业版开通时间。
     * @param ProVersionOpenDate 专业版开通时间。
     */
    public void setProVersionOpenDate(String ProVersionOpenDate) {
        this.ProVersionOpenDate = ProVersionOpenDate;
    }

    /**
     * 获取云主机类型。
<li>CVM: 虚拟主机</li>
<li>BM: 黑石物理机</li>
     * @return MachineType 云主机类型。
<li>CVM: 虚拟主机</li>
<li>BM: 黑石物理机</li>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * 设置云主机类型。
<li>CVM: 虚拟主机</li>
<li>BM: 黑石物理机</li>
     * @param MachineType 云主机类型。
<li>CVM: 虚拟主机</li>
<li>BM: 黑石物理机</li>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * 获取机器所属地域。如：ap-guangzhou，ap-shanghai
     * @return MachineRegion 机器所属地域。如：ap-guangzhou，ap-shanghai
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * 设置机器所属地域。如：ap-guangzhou，ap-shanghai
     * @param MachineRegion 机器所属地域。如：ap-guangzhou，ap-shanghai
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * 获取主机状态。
<li>POSTPAY: 表示后付费，即按量计费  </li>
<li>PREPAY: 表示预付费，即包年包月</li>
     * @return PayMode 主机状态。
<li>POSTPAY: 表示后付费，即按量计费  </li>
<li>PREPAY: 表示预付费，即包年包月</li>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置主机状态。
<li>POSTPAY: 表示后付费，即按量计费  </li>
<li>PREPAY: 表示预付费，即包年包月</li>
     * @param PayMode 主机状态。
<li>POSTPAY: 表示后付费，即按量计费  </li>
<li>PREPAY: 表示预付费，即包年包月</li>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
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
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "ProtectDays", this.ProtectDays);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "ProVersionOpenDate", this.ProVersionOpenDate);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

