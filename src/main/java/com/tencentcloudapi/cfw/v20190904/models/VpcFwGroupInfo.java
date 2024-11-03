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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcFwGroupInfo extends AbstractModel {

    /**
    * 防火墙(组)ID
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * 防火墙(组)名称
    */
    @SerializedName("FwGroupName")
    @Expose
    private String FwGroupName;

    /**
    * 防火墙组涉及到的开关个数
    */
    @SerializedName("FwSwitchNum")
    @Expose
    private Long FwSwitchNum;

    /**
    * 防火墙(组)部署的地域
    */
    @SerializedName("RegionLst")
    @Expose
    private String [] RegionLst;

    /**
    * 模式 1：CCN云联网模式；0：私有网络模式 2: sase 模式 3：ccn 高级模式 4: 私有网络(跨租户单边模式)
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 防火墙实例的开关模式 1: 单点互通 2: 多点互通 3: 全互通 4: 自定义路由
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
    * VPC防火墙实例卡片信息数组
    */
    @SerializedName("FwInstanceLst")
    @Expose
    private VpcFwInstanceInfo [] FwInstanceLst;

    /**
    * 防火墙(状态) 0：正常 1: 初始化或操作中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * auto :自动选择
如果为网段，则为用户自定义 192.168.0.0/20 
    */
    @SerializedName("FwVpcCidr")
    @Expose
    private String FwVpcCidr;

    /**
    * cdc专用集群场景时表示部署所属的cdc
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * cdc专用集群场景时表示cdc名称
    */
    @SerializedName("CdcName")
    @Expose
    private String CdcName;

    /**
    * 跨租户模式 1管理员 2单边 0 非跨租户
    */
    @SerializedName("CrossUserMode")
    @Expose
    private String CrossUserMode;

    /**
    * 云联网模式下，当前实例是否需要开启重叠路由开关，1：需要开启，0：不需要开启
    */
    @SerializedName("NeedSwitchCcnOverlap")
    @Expose
    private Long NeedSwitchCcnOverlap;

    /**
    * 云联网模式下，实例关联的云联网id
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
     * Get 防火墙(组)ID 
     * @return FwGroupId 防火墙(组)ID
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set 防火墙(组)ID
     * @param FwGroupId 防火墙(组)ID
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get 防火墙(组)名称 
     * @return FwGroupName 防火墙(组)名称
     */
    public String getFwGroupName() {
        return this.FwGroupName;
    }

    /**
     * Set 防火墙(组)名称
     * @param FwGroupName 防火墙(组)名称
     */
    public void setFwGroupName(String FwGroupName) {
        this.FwGroupName = FwGroupName;
    }

    /**
     * Get 防火墙组涉及到的开关个数 
     * @return FwSwitchNum 防火墙组涉及到的开关个数
     */
    public Long getFwSwitchNum() {
        return this.FwSwitchNum;
    }

    /**
     * Set 防火墙组涉及到的开关个数
     * @param FwSwitchNum 防火墙组涉及到的开关个数
     */
    public void setFwSwitchNum(Long FwSwitchNum) {
        this.FwSwitchNum = FwSwitchNum;
    }

    /**
     * Get 防火墙(组)部署的地域 
     * @return RegionLst 防火墙(组)部署的地域
     */
    public String [] getRegionLst() {
        return this.RegionLst;
    }

    /**
     * Set 防火墙(组)部署的地域
     * @param RegionLst 防火墙(组)部署的地域
     */
    public void setRegionLst(String [] RegionLst) {
        this.RegionLst = RegionLst;
    }

    /**
     * Get 模式 1：CCN云联网模式；0：私有网络模式 2: sase 模式 3：ccn 高级模式 4: 私有网络(跨租户单边模式) 
     * @return Mode 模式 1：CCN云联网模式；0：私有网络模式 2: sase 模式 3：ccn 高级模式 4: 私有网络(跨租户单边模式)
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 模式 1：CCN云联网模式；0：私有网络模式 2: sase 模式 3：ccn 高级模式 4: 私有网络(跨租户单边模式)
     * @param Mode 模式 1：CCN云联网模式；0：私有网络模式 2: sase 模式 3：ccn 高级模式 4: 私有网络(跨租户单边模式)
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 防火墙实例的开关模式 1: 单点互通 2: 多点互通 3: 全互通 4: 自定义路由 
     * @return SwitchMode 防火墙实例的开关模式 1: 单点互通 2: 多点互通 3: 全互通 4: 自定义路由
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set 防火墙实例的开关模式 1: 单点互通 2: 多点互通 3: 全互通 4: 自定义路由
     * @param SwitchMode 防火墙实例的开关模式 1: 单点互通 2: 多点互通 3: 全互通 4: 自定义路由
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
    }

    /**
     * Get VPC防火墙实例卡片信息数组 
     * @return FwInstanceLst VPC防火墙实例卡片信息数组
     */
    public VpcFwInstanceInfo [] getFwInstanceLst() {
        return this.FwInstanceLst;
    }

    /**
     * Set VPC防火墙实例卡片信息数组
     * @param FwInstanceLst VPC防火墙实例卡片信息数组
     */
    public void setFwInstanceLst(VpcFwInstanceInfo [] FwInstanceLst) {
        this.FwInstanceLst = FwInstanceLst;
    }

    /**
     * Get 防火墙(状态) 0：正常 1: 初始化或操作中 
     * @return Status 防火墙(状态) 0：正常 1: 初始化或操作中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 防火墙(状态) 0：正常 1: 初始化或操作中
     * @param Status 防火墙(状态) 0：正常 1: 初始化或操作中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get auto :自动选择
如果为网段，则为用户自定义 192.168.0.0/20  
     * @return FwVpcCidr auto :自动选择
如果为网段，则为用户自定义 192.168.0.0/20 
     */
    public String getFwVpcCidr() {
        return this.FwVpcCidr;
    }

    /**
     * Set auto :自动选择
如果为网段，则为用户自定义 192.168.0.0/20 
     * @param FwVpcCidr auto :自动选择
如果为网段，则为用户自定义 192.168.0.0/20 
     */
    public void setFwVpcCidr(String FwVpcCidr) {
        this.FwVpcCidr = FwVpcCidr;
    }

    /**
     * Get cdc专用集群场景时表示部署所属的cdc 
     * @return CdcId cdc专用集群场景时表示部署所属的cdc
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set cdc专用集群场景时表示部署所属的cdc
     * @param CdcId cdc专用集群场景时表示部署所属的cdc
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get cdc专用集群场景时表示cdc名称 
     * @return CdcName cdc专用集群场景时表示cdc名称
     */
    public String getCdcName() {
        return this.CdcName;
    }

    /**
     * Set cdc专用集群场景时表示cdc名称
     * @param CdcName cdc专用集群场景时表示cdc名称
     */
    public void setCdcName(String CdcName) {
        this.CdcName = CdcName;
    }

    /**
     * Get 跨租户模式 1管理员 2单边 0 非跨租户 
     * @return CrossUserMode 跨租户模式 1管理员 2单边 0 非跨租户
     */
    public String getCrossUserMode() {
        return this.CrossUserMode;
    }

    /**
     * Set 跨租户模式 1管理员 2单边 0 非跨租户
     * @param CrossUserMode 跨租户模式 1管理员 2单边 0 非跨租户
     */
    public void setCrossUserMode(String CrossUserMode) {
        this.CrossUserMode = CrossUserMode;
    }

    /**
     * Get 云联网模式下，当前实例是否需要开启重叠路由开关，1：需要开启，0：不需要开启 
     * @return NeedSwitchCcnOverlap 云联网模式下，当前实例是否需要开启重叠路由开关，1：需要开启，0：不需要开启
     */
    public Long getNeedSwitchCcnOverlap() {
        return this.NeedSwitchCcnOverlap;
    }

    /**
     * Set 云联网模式下，当前实例是否需要开启重叠路由开关，1：需要开启，0：不需要开启
     * @param NeedSwitchCcnOverlap 云联网模式下，当前实例是否需要开启重叠路由开关，1：需要开启，0：不需要开启
     */
    public void setNeedSwitchCcnOverlap(Long NeedSwitchCcnOverlap) {
        this.NeedSwitchCcnOverlap = NeedSwitchCcnOverlap;
    }

    /**
     * Get 云联网模式下，实例关联的云联网id 
     * @return CcnId 云联网模式下，实例关联的云联网id
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网模式下，实例关联的云联网id
     * @param CcnId 云联网模式下，实例关联的云联网id
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    public VpcFwGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcFwGroupInfo(VpcFwGroupInfo source) {
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
        }
        if (source.FwGroupName != null) {
            this.FwGroupName = new String(source.FwGroupName);
        }
        if (source.FwSwitchNum != null) {
            this.FwSwitchNum = new Long(source.FwSwitchNum);
        }
        if (source.RegionLst != null) {
            this.RegionLst = new String[source.RegionLst.length];
            for (int i = 0; i < source.RegionLst.length; i++) {
                this.RegionLst[i] = new String(source.RegionLst[i]);
            }
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.SwitchMode != null) {
            this.SwitchMode = new Long(source.SwitchMode);
        }
        if (source.FwInstanceLst != null) {
            this.FwInstanceLst = new VpcFwInstanceInfo[source.FwInstanceLst.length];
            for (int i = 0; i < source.FwInstanceLst.length; i++) {
                this.FwInstanceLst[i] = new VpcFwInstanceInfo(source.FwInstanceLst[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FwVpcCidr != null) {
            this.FwVpcCidr = new String(source.FwVpcCidr);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.CdcName != null) {
            this.CdcName = new String(source.CdcName);
        }
        if (source.CrossUserMode != null) {
            this.CrossUserMode = new String(source.CrossUserMode);
        }
        if (source.NeedSwitchCcnOverlap != null) {
            this.NeedSwitchCcnOverlap = new Long(source.NeedSwitchCcnOverlap);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "FwGroupName", this.FwGroupName);
        this.setParamSimple(map, prefix + "FwSwitchNum", this.FwSwitchNum);
        this.setParamArraySimple(map, prefix + "RegionLst.", this.RegionLst);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "SwitchMode", this.SwitchMode);
        this.setParamArrayObj(map, prefix + "FwInstanceLst.", this.FwInstanceLst);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FwVpcCidr", this.FwVpcCidr);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "CdcName", this.CdcName);
        this.setParamSimple(map, prefix + "CrossUserMode", this.CrossUserMode);
        this.setParamSimple(map, prefix + "NeedSwitchCcnOverlap", this.NeedSwitchCcnOverlap);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);

    }
}

