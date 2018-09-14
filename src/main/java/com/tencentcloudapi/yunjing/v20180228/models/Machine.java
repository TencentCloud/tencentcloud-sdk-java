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

public class Machine  extends AbstractModel{

    /**
    * 主机名称。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 主机系统。
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * 主机状态。
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * 云镜客户端唯一Uuid，若客户端长时间不在线将返回空字符。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * CVM或BM机器唯一Uuid。
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 漏洞数，非专业版将返回：0。
    */
    @SerializedName("VulNum")
    @Expose
    private Integer VulNum;

    /**
    * 主机IP。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 是否是专业版。
<li>true： 是</li>
<li>false：否</li>
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * 主机外网IP。
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 主机状态。
<li>POSTPAY: 表示后付费，即按量计费  </li>
<li>PREPAY: 表示预付费，即包年包月</li>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

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
     * 获取主机系统。
     * @return MachineOs 主机系统。
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * 设置主机系统。
     * @param MachineOs 主机系统。
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * 获取主机状态。
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
     * @return MachineStatus 主机状态。
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * 设置主机状态。
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
     * @param MachineStatus 主机状态。
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * 获取云镜客户端唯一Uuid，若客户端长时间不在线将返回空字符。
     * @return Uuid 云镜客户端唯一Uuid，若客户端长时间不在线将返回空字符。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * 设置云镜客户端唯一Uuid，若客户端长时间不在线将返回空字符。
     * @param Uuid 云镜客户端唯一Uuid，若客户端长时间不在线将返回空字符。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * 获取CVM或BM机器唯一Uuid。
     * @return Quuid CVM或BM机器唯一Uuid。
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * 设置CVM或BM机器唯一Uuid。
     * @param Quuid CVM或BM机器唯一Uuid。
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * 获取漏洞数，非专业版将返回：0。
     * @return VulNum 漏洞数，非专业版将返回：0。
     */
    public Integer getVulNum() {
        return this.VulNum;
    }

    /**
     * 设置漏洞数，非专业版将返回：0。
     * @param VulNum 漏洞数，非专业版将返回：0。
     */
    public void setVulNum(Integer VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * 获取主机IP。
     * @return MachineIp 主机IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * 设置主机IP。
     * @param MachineIp 主机IP。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * 获取是否是专业版。
<li>true： 是</li>
<li>false：否</li>
     * @return IsProVersion 是否是专业版。
<li>true： 是</li>
<li>false：否</li>
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * 设置是否是专业版。
<li>true： 是</li>
<li>false：否</li>
     * @param IsProVersion 是否是专业版。
<li>true： 是</li>
<li>false：否</li>
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
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
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

