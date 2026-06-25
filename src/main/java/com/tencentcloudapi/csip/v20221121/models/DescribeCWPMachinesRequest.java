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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCWPMachinesRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>一、主表字段筛选（需要指定 OperatorType）<br>MachineName：主机名称，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;test-server&quot;]<br>MachineIp：内网IP，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;10.0.0.1&quot;]<br>MachineWanIp：外网IP，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;1.2.3.4&quot;]<br>InstanceID：实例ID，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;ins-xxxxx&quot;]<br>MachineStatus / InstanceStatus：实例状态，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;RUNNING&quot;]，可选值：RUNNING/STOPPED/EXPIRED<br>MachineOs：操作系统类型，支持 OperatorType 7(IN)，Values示例：[&quot;1&quot;]，值为数字编码，见下方OsType说明<br>VpcId：VPC ID，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;vpc-xxxxx&quot;]<br>CloudFromEnum：云服务商，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;0&quot;]，值为数字编码，见下方CloudFrom说明<br>Region ：地域，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;ap-guangzhou&quot;]<br>AppId：账号AppId，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;1234567890&quot;]<br>ProjectId：项目ID，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;0&quot;]</p><p>二、预筛选字段（不需要指定 OperatorType）<br>AgentStatus：Agent状态，单选，Values示例：[&quot;ONLINE&quot;]，可选值：ONLINE/OFFLINE/UNINSTALL<br>ProtectType：防护类型（综合），Values示例：[&quot;ULTIMATE&quot;]，可选值：BASIC/PRO/ULTIMATE/NONE<br>CsipProtectType：CSIP防护类型，Values示例：[&quot;ULTIMATE&quot;]，可选值：BASIC/PRO/ULTIMATE/NONE<br>CloudTags：云标签，Values示例：[&quot;tagKey$tagValue&quot;]，格式：tagKey$tagValue 或 tagKey（只匹配key），最多5个值<br>Tags：资产标签，Values示例：[&quot;123&quot;]，值为标签ID<br>ExposedStatus：暴露状态，单选，Values示例：[&quot;EXPOSED&quot;]，可选值：NOT_APPLICABLE/EXPOSED/UNEXPOSED</p><p>三、特殊筛选字段（不需要指定 OperatorType）<br>NetworkType：网络类型，单选，Values示例：[&quot;1&quot;]，1=VPC网络, 2=基础网络, 3=非腾讯云网络<br>MachineType：机器类型，可多选，Values示例：[&quot;CVM&quot;]，可选值：CVM/BM/ECM/LH/EKS-NATIVE/ECS/EC2/VMS<br>Common：通用搜索，单选，Values示例：[&quot;关键词&quot;]，同时对内网IP、外网IP、主机名称、实例ID做模糊匹配</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>是否需要tat状态信息</p>
    */
    @SerializedName("NeedTatStatus")
    @Expose
    private Boolean NeedTatStatus;

    /**
    * <p>是否需要额外信息，如安全中心标签、腾讯云标签</p>
    */
    @SerializedName("MoreInformation")
    @Expose
    private Boolean MoreInformation;

    /**
    * <p>是否需要容器信息，如容器数、核数、容器防护状态</p>
    */
    @SerializedName("NeedContainerInfo")
    @Expose
    private Boolean NeedContainerInfo;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>一、主表字段筛选（需要指定 OperatorType）<br>MachineName：主机名称，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;test-server&quot;]<br>MachineIp：内网IP，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;10.0.0.1&quot;]<br>MachineWanIp：外网IP，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;1.2.3.4&quot;]<br>InstanceID：实例ID，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;ins-xxxxx&quot;]<br>MachineStatus / InstanceStatus：实例状态，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;RUNNING&quot;]，可选值：RUNNING/STOPPED/EXPIRED<br>MachineOs：操作系统类型，支持 OperatorType 7(IN)，Values示例：[&quot;1&quot;]，值为数字编码，见下方OsType说明<br>VpcId：VPC ID，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;vpc-xxxxx&quot;]<br>CloudFromEnum：云服务商，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;0&quot;]，值为数字编码，见下方CloudFrom说明<br>Region ：地域，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;ap-guangzhou&quot;]<br>AppId：账号AppId，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;1234567890&quot;]<br>ProjectId：项目ID，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;0&quot;]</p><p>二、预筛选字段（不需要指定 OperatorType）<br>AgentStatus：Agent状态，单选，Values示例：[&quot;ONLINE&quot;]，可选值：ONLINE/OFFLINE/UNINSTALL<br>ProtectType：防护类型（综合），Values示例：[&quot;ULTIMATE&quot;]，可选值：BASIC/PRO/ULTIMATE/NONE<br>CsipProtectType：CSIP防护类型，Values示例：[&quot;ULTIMATE&quot;]，可选值：BASIC/PRO/ULTIMATE/NONE<br>CloudTags：云标签，Values示例：[&quot;tagKey$tagValue&quot;]，格式：tagKey$tagValue 或 tagKey（只匹配key），最多5个值<br>Tags：资产标签，Values示例：[&quot;123&quot;]，值为标签ID<br>ExposedStatus：暴露状态，单选，Values示例：[&quot;EXPOSED&quot;]，可选值：NOT_APPLICABLE/EXPOSED/UNEXPOSED</p><p>三、特殊筛选字段（不需要指定 OperatorType）<br>NetworkType：网络类型，单选，Values示例：[&quot;1&quot;]，1=VPC网络, 2=基础网络, 3=非腾讯云网络<br>MachineType：机器类型，可多选，Values示例：[&quot;CVM&quot;]，可选值：CVM/BM/ECM/LH/EKS-NATIVE/ECS/EC2/VMS<br>Common：通用搜索，单选，Values示例：[&quot;关键词&quot;]，同时对内网IP、外网IP、主机名称、实例ID做模糊匹配</p> 
     * @return Filter <p>一、主表字段筛选（需要指定 OperatorType）<br>MachineName：主机名称，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;test-server&quot;]<br>MachineIp：内网IP，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;10.0.0.1&quot;]<br>MachineWanIp：外网IP，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;1.2.3.4&quot;]<br>InstanceID：实例ID，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;ins-xxxxx&quot;]<br>MachineStatus / InstanceStatus：实例状态，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;RUNNING&quot;]，可选值：RUNNING/STOPPED/EXPIRED<br>MachineOs：操作系统类型，支持 OperatorType 7(IN)，Values示例：[&quot;1&quot;]，值为数字编码，见下方OsType说明<br>VpcId：VPC ID，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;vpc-xxxxx&quot;]<br>CloudFromEnum：云服务商，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;0&quot;]，值为数字编码，见下方CloudFrom说明<br>Region ：地域，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;ap-guangzhou&quot;]<br>AppId：账号AppId，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;1234567890&quot;]<br>ProjectId：项目ID，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;0&quot;]</p><p>二、预筛选字段（不需要指定 OperatorType）<br>AgentStatus：Agent状态，单选，Values示例：[&quot;ONLINE&quot;]，可选值：ONLINE/OFFLINE/UNINSTALL<br>ProtectType：防护类型（综合），Values示例：[&quot;ULTIMATE&quot;]，可选值：BASIC/PRO/ULTIMATE/NONE<br>CsipProtectType：CSIP防护类型，Values示例：[&quot;ULTIMATE&quot;]，可选值：BASIC/PRO/ULTIMATE/NONE<br>CloudTags：云标签，Values示例：[&quot;tagKey$tagValue&quot;]，格式：tagKey$tagValue 或 tagKey（只匹配key），最多5个值<br>Tags：资产标签，Values示例：[&quot;123&quot;]，值为标签ID<br>ExposedStatus：暴露状态，单选，Values示例：[&quot;EXPOSED&quot;]，可选值：NOT_APPLICABLE/EXPOSED/UNEXPOSED</p><p>三、特殊筛选字段（不需要指定 OperatorType）<br>NetworkType：网络类型，单选，Values示例：[&quot;1&quot;]，1=VPC网络, 2=基础网络, 3=非腾讯云网络<br>MachineType：机器类型，可多选，Values示例：[&quot;CVM&quot;]，可选值：CVM/BM/ECM/LH/EKS-NATIVE/ECS/EC2/VMS<br>Common：通用搜索，单选，Values示例：[&quot;关键词&quot;]，同时对内网IP、外网IP、主机名称、实例ID做模糊匹配</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>一、主表字段筛选（需要指定 OperatorType）<br>MachineName：主机名称，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;test-server&quot;]<br>MachineIp：内网IP，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;10.0.0.1&quot;]<br>MachineWanIp：外网IP，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;1.2.3.4&quot;]<br>InstanceID：实例ID，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;ins-xxxxx&quot;]<br>MachineStatus / InstanceStatus：实例状态，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;RUNNING&quot;]，可选值：RUNNING/STOPPED/EXPIRED<br>MachineOs：操作系统类型，支持 OperatorType 7(IN)，Values示例：[&quot;1&quot;]，值为数字编码，见下方OsType说明<br>VpcId：VPC ID，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;vpc-xxxxx&quot;]<br>CloudFromEnum：云服务商，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;0&quot;]，值为数字编码，见下方CloudFrom说明<br>Region ：地域，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;ap-guangzhou&quot;]<br>AppId：账号AppId，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;1234567890&quot;]<br>ProjectId：项目ID，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;0&quot;]</p><p>二、预筛选字段（不需要指定 OperatorType）<br>AgentStatus：Agent状态，单选，Values示例：[&quot;ONLINE&quot;]，可选值：ONLINE/OFFLINE/UNINSTALL<br>ProtectType：防护类型（综合），Values示例：[&quot;ULTIMATE&quot;]，可选值：BASIC/PRO/ULTIMATE/NONE<br>CsipProtectType：CSIP防护类型，Values示例：[&quot;ULTIMATE&quot;]，可选值：BASIC/PRO/ULTIMATE/NONE<br>CloudTags：云标签，Values示例：[&quot;tagKey$tagValue&quot;]，格式：tagKey$tagValue 或 tagKey（只匹配key），最多5个值<br>Tags：资产标签，Values示例：[&quot;123&quot;]，值为标签ID<br>ExposedStatus：暴露状态，单选，Values示例：[&quot;EXPOSED&quot;]，可选值：NOT_APPLICABLE/EXPOSED/UNEXPOSED</p><p>三、特殊筛选字段（不需要指定 OperatorType）<br>NetworkType：网络类型，单选，Values示例：[&quot;1&quot;]，1=VPC网络, 2=基础网络, 3=非腾讯云网络<br>MachineType：机器类型，可多选，Values示例：[&quot;CVM&quot;]，可选值：CVM/BM/ECM/LH/EKS-NATIVE/ECS/EC2/VMS<br>Common：通用搜索，单选，Values示例：[&quot;关键词&quot;]，同时对内网IP、外网IP、主机名称、实例ID做模糊匹配</p>
     * @param Filter <p>一、主表字段筛选（需要指定 OperatorType）<br>MachineName：主机名称，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;test-server&quot;]<br>MachineIp：内网IP，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;10.0.0.1&quot;]<br>MachineWanIp：外网IP，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;1.2.3.4&quot;]<br>InstanceID：实例ID，支持 OperatorType 9(模糊)、7(IN)，Values示例：[&quot;ins-xxxxx&quot;]<br>MachineStatus / InstanceStatus：实例状态，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;RUNNING&quot;]，可选值：RUNNING/STOPPED/EXPIRED<br>MachineOs：操作系统类型，支持 OperatorType 7(IN)，Values示例：[&quot;1&quot;]，值为数字编码，见下方OsType说明<br>VpcId：VPC ID，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;vpc-xxxxx&quot;]<br>CloudFromEnum：云服务商，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;0&quot;]，值为数字编码，见下方CloudFrom说明<br>Region ：地域，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;ap-guangzhou&quot;]<br>AppId：账号AppId，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;1234567890&quot;]<br>ProjectId：项目ID，支持 OperatorType 7(IN)、1(等于)，Values示例：[&quot;0&quot;]</p><p>二、预筛选字段（不需要指定 OperatorType）<br>AgentStatus：Agent状态，单选，Values示例：[&quot;ONLINE&quot;]，可选值：ONLINE/OFFLINE/UNINSTALL<br>ProtectType：防护类型（综合），Values示例：[&quot;ULTIMATE&quot;]，可选值：BASIC/PRO/ULTIMATE/NONE<br>CsipProtectType：CSIP防护类型，Values示例：[&quot;ULTIMATE&quot;]，可选值：BASIC/PRO/ULTIMATE/NONE<br>CloudTags：云标签，Values示例：[&quot;tagKey$tagValue&quot;]，格式：tagKey$tagValue 或 tagKey（只匹配key），最多5个值<br>Tags：资产标签，Values示例：[&quot;123&quot;]，值为标签ID<br>ExposedStatus：暴露状态，单选，Values示例：[&quot;EXPOSED&quot;]，可选值：NOT_APPLICABLE/EXPOSED/UNEXPOSED</p><p>三、特殊筛选字段（不需要指定 OperatorType）<br>NetworkType：网络类型，单选，Values示例：[&quot;1&quot;]，1=VPC网络, 2=基础网络, 3=非腾讯云网络<br>MachineType：机器类型，可多选，Values示例：[&quot;CVM&quot;]，可选值：CVM/BM/ECM/LH/EKS-NATIVE/ECS/EC2/VMS<br>Common：通用搜索，单选，Values示例：[&quot;关键词&quot;]，同时对内网IP、外网IP、主机名称、实例ID做模糊匹配</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>是否需要tat状态信息</p> 
     * @return NeedTatStatus <p>是否需要tat状态信息</p>
     */
    public Boolean getNeedTatStatus() {
        return this.NeedTatStatus;
    }

    /**
     * Set <p>是否需要tat状态信息</p>
     * @param NeedTatStatus <p>是否需要tat状态信息</p>
     */
    public void setNeedTatStatus(Boolean NeedTatStatus) {
        this.NeedTatStatus = NeedTatStatus;
    }

    /**
     * Get <p>是否需要额外信息，如安全中心标签、腾讯云标签</p> 
     * @return MoreInformation <p>是否需要额外信息，如安全中心标签、腾讯云标签</p>
     */
    public Boolean getMoreInformation() {
        return this.MoreInformation;
    }

    /**
     * Set <p>是否需要额外信息，如安全中心标签、腾讯云标签</p>
     * @param MoreInformation <p>是否需要额外信息，如安全中心标签、腾讯云标签</p>
     */
    public void setMoreInformation(Boolean MoreInformation) {
        this.MoreInformation = MoreInformation;
    }

    /**
     * Get <p>是否需要容器信息，如容器数、核数、容器防护状态</p> 
     * @return NeedContainerInfo <p>是否需要容器信息，如容器数、核数、容器防护状态</p>
     */
    public Boolean getNeedContainerInfo() {
        return this.NeedContainerInfo;
    }

    /**
     * Set <p>是否需要容器信息，如容器数、核数、容器防护状态</p>
     * @param NeedContainerInfo <p>是否需要容器信息，如容器数、核数、容器防护状态</p>
     */
    public void setNeedContainerInfo(Boolean NeedContainerInfo) {
        this.NeedContainerInfo = NeedContainerInfo;
    }

    public DescribeCWPMachinesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCWPMachinesRequest(DescribeCWPMachinesRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.NeedTatStatus != null) {
            this.NeedTatStatus = new Boolean(source.NeedTatStatus);
        }
        if (source.MoreInformation != null) {
            this.MoreInformation = new Boolean(source.MoreInformation);
        }
        if (source.NeedContainerInfo != null) {
            this.NeedContainerInfo = new Boolean(source.NeedContainerInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "NeedTatStatus", this.NeedTatStatus);
        this.setParamSimple(map, prefix + "MoreInformation", this.MoreInformation);
        this.setParamSimple(map, prefix + "NeedContainerInfo", this.NeedContainerInfo);

    }
}

