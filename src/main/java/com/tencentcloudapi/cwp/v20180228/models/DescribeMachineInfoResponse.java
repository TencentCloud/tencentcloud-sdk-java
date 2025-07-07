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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachineInfoResponse extends AbstractModel {

    /**
    * 机器ip。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 受主机安全保护天数。
    */
    @SerializedName("ProtectDays")
    @Expose
    private Long ProtectDays;

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
    * 主机安全客户端唯一Uuid。
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
    * 云服务器类型。
<li>CVM: 腾讯云服务器</li>
<li>BM: 黑石物理机</li>
<li>ECM: 边缘计算服务器</li>
<li>LH: 轻量应用服务器</li>
<li>Other: 混合云机器</li>
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
    * 免费木马剩余检测数量。
    */
    @SerializedName("FreeMalwaresLeft")
    @Expose
    private Long FreeMalwaresLeft;

    /**
    * 免费漏洞剩余检测数量。
    */
    @SerializedName("FreeVulsLeft")
    @Expose
    private Long FreeVulsLeft;

    /**
    * agent版本号
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * 专业版到期时间(仅预付费)
    */
    @SerializedName("ProVersionDeadline")
    @Expose
    private String ProVersionDeadline;

    /**
    * 是否有资产扫描记录，0无，1有
    */
    @SerializedName("HasAssetScan")
    @Expose
    private Long HasAssetScan;

    /**
    * 防护版本：BASIC_VERSION 基础版，PRO_VERSION 专业版，Flagship 旗舰版，GENERAL_DISCOUNT 轻量版
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 机器ip。 
     * @return MachineIp 机器ip。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 机器ip。
     * @param MachineIp 机器ip。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 受主机安全保护天数。 
     * @return ProtectDays 受主机安全保护天数。
     */
    public Long getProtectDays() {
        return this.ProtectDays;
    }

    /**
     * Set 受主机安全保护天数。
     * @param ProtectDays 受主机安全保护天数。
     */
    public void setProtectDays(Long ProtectDays) {
        this.ProtectDays = ProtectDays;
    }

    /**
     * Get 操作系统。 
     * @return MachineOs 操作系统。
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set 操作系统。
     * @param MachineOs 操作系统。
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get 主机名称。 
     * @return MachineName 主机名称。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名称。
     * @param MachineName 主机名称。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 在线状态。
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
     * Set 在线状态。
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
     * Get CVM或BM主机唯一标识。 
     * @return InstanceId CVM或BM主机唯一标识。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CVM或BM主机唯一标识。
     * @param InstanceId CVM或BM主机唯一标识。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主机外网IP。 
     * @return MachineWanIp 主机外网IP。
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 主机外网IP。
     * @param MachineWanIp 主机外网IP。
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get CVM或BM主机唯一Uuid。 
     * @return Quuid CVM或BM主机唯一Uuid。
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set CVM或BM主机唯一Uuid。
     * @param Quuid CVM或BM主机唯一Uuid。
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机安全客户端唯一Uuid。 
     * @return Uuid 主机安全客户端唯一Uuid。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全客户端唯一Uuid。
     * @param Uuid 主机安全客户端唯一Uuid。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 是否开通专业版。
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
     * Set 是否开通专业版。
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
     * Get 专业版开通时间。 
     * @return ProVersionOpenDate 专业版开通时间。
     */
    public String getProVersionOpenDate() {
        return this.ProVersionOpenDate;
    }

    /**
     * Set 专业版开通时间。
     * @param ProVersionOpenDate 专业版开通时间。
     */
    public void setProVersionOpenDate(String ProVersionOpenDate) {
        this.ProVersionOpenDate = ProVersionOpenDate;
    }

    /**
     * Get 云服务器类型。
<li>CVM: 腾讯云服务器</li>
<li>BM: 黑石物理机</li>
<li>ECM: 边缘计算服务器</li>
<li>LH: 轻量应用服务器</li>
<li>Other: 混合云机器</li> 
     * @return MachineType 云服务器类型。
<li>CVM: 腾讯云服务器</li>
<li>BM: 黑石物理机</li>
<li>ECM: 边缘计算服务器</li>
<li>LH: 轻量应用服务器</li>
<li>Other: 混合云机器</li>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 云服务器类型。
<li>CVM: 腾讯云服务器</li>
<li>BM: 黑石物理机</li>
<li>ECM: 边缘计算服务器</li>
<li>LH: 轻量应用服务器</li>
<li>Other: 混合云机器</li>
     * @param MachineType 云服务器类型。
<li>CVM: 腾讯云服务器</li>
<li>BM: 黑石物理机</li>
<li>ECM: 边缘计算服务器</li>
<li>LH: 轻量应用服务器</li>
<li>Other: 混合云机器</li>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 机器所属地域。如：ap-guangzhou，ap-shanghai 
     * @return MachineRegion 机器所属地域。如：ap-guangzhou，ap-shanghai
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set 机器所属地域。如：ap-guangzhou，ap-shanghai
     * @param MachineRegion 机器所属地域。如：ap-guangzhou，ap-shanghai
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get 主机状态。
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
     * Set 主机状态。
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
     * Get 免费木马剩余检测数量。 
     * @return FreeMalwaresLeft 免费木马剩余检测数量。
     */
    public Long getFreeMalwaresLeft() {
        return this.FreeMalwaresLeft;
    }

    /**
     * Set 免费木马剩余检测数量。
     * @param FreeMalwaresLeft 免费木马剩余检测数量。
     */
    public void setFreeMalwaresLeft(Long FreeMalwaresLeft) {
        this.FreeMalwaresLeft = FreeMalwaresLeft;
    }

    /**
     * Get 免费漏洞剩余检测数量。 
     * @return FreeVulsLeft 免费漏洞剩余检测数量。
     */
    public Long getFreeVulsLeft() {
        return this.FreeVulsLeft;
    }

    /**
     * Set 免费漏洞剩余检测数量。
     * @param FreeVulsLeft 免费漏洞剩余检测数量。
     */
    public void setFreeVulsLeft(Long FreeVulsLeft) {
        this.FreeVulsLeft = FreeVulsLeft;
    }

    /**
     * Get agent版本号 
     * @return AgentVersion agent版本号
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set agent版本号
     * @param AgentVersion agent版本号
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get 专业版到期时间(仅预付费) 
     * @return ProVersionDeadline 专业版到期时间(仅预付费)
     */
    public String getProVersionDeadline() {
        return this.ProVersionDeadline;
    }

    /**
     * Set 专业版到期时间(仅预付费)
     * @param ProVersionDeadline 专业版到期时间(仅预付费)
     */
    public void setProVersionDeadline(String ProVersionDeadline) {
        this.ProVersionDeadline = ProVersionDeadline;
    }

    /**
     * Get 是否有资产扫描记录，0无，1有 
     * @return HasAssetScan 是否有资产扫描记录，0无，1有
     */
    public Long getHasAssetScan() {
        return this.HasAssetScan;
    }

    /**
     * Set 是否有资产扫描记录，0无，1有
     * @param HasAssetScan 是否有资产扫描记录，0无，1有
     */
    public void setHasAssetScan(Long HasAssetScan) {
        this.HasAssetScan = HasAssetScan;
    }

    /**
     * Get 防护版本：BASIC_VERSION 基础版，PRO_VERSION 专业版，Flagship 旗舰版，GENERAL_DISCOUNT 轻量版 
     * @return ProtectType 防护版本：BASIC_VERSION 基础版，PRO_VERSION 专业版，Flagship 旗舰版，GENERAL_DISCOUNT 轻量版
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set 防护版本：BASIC_VERSION 基础版，PRO_VERSION 专业版，Flagship 旗舰版，GENERAL_DISCOUNT 轻量版
     * @param ProtectType 防护版本：BASIC_VERSION 基础版，PRO_VERSION 专业版，Flagship 旗舰版，GENERAL_DISCOUNT 轻量版
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
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

    public DescribeMachineInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachineInfoResponse(DescribeMachineInfoResponse source) {
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.ProtectDays != null) {
            this.ProtectDays = new Long(source.ProtectDays);
        }
        if (source.MachineOs != null) {
            this.MachineOs = new String(source.MachineOs);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.IsProVersion != null) {
            this.IsProVersion = new Boolean(source.IsProVersion);
        }
        if (source.ProVersionOpenDate != null) {
            this.ProVersionOpenDate = new String(source.ProVersionOpenDate);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.FreeMalwaresLeft != null) {
            this.FreeMalwaresLeft = new Long(source.FreeMalwaresLeft);
        }
        if (source.FreeVulsLeft != null) {
            this.FreeVulsLeft = new Long(source.FreeVulsLeft);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.ProVersionDeadline != null) {
            this.ProVersionDeadline = new String(source.ProVersionDeadline);
        }
        if (source.HasAssetScan != null) {
            this.HasAssetScan = new Long(source.HasAssetScan);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "FreeMalwaresLeft", this.FreeMalwaresLeft);
        this.setParamSimple(map, prefix + "FreeVulsLeft", this.FreeVulsLeft);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "ProVersionDeadline", this.ProVersionDeadline);
        this.setParamSimple(map, prefix + "HasAssetScan", this.HasAssetScan);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

