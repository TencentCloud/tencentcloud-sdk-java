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

public class FwGroupSwitchShow extends AbstractModel {

    /**
    * 防火墙开关ID
    */
    @SerializedName("SwitchId")
    @Expose
    private String SwitchId;

    /**
    * 防火墙开关NAME
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SwitchName")
    @Expose
    private String SwitchName;

    /**
    * 互通模式
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
    * 开关边连接类型 0：对等连接， 1：云连网
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectType")
    @Expose
    private Long ConnectType;

    /**
    * 连接ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectId")
    @Expose
    private String ConnectId;

    /**
    * 连接名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectName")
    @Expose
    private String ConnectName;

    /**
    * 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcInstancesInfo")
    @Expose
    private NetInstancesInfo [] SrcInstancesInfo;

    /**
    * 目的实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstInstancesInfo")
    @Expose
    private NetInstancesInfo [] DstInstancesInfo;

    /**
    * 防火墙(组)数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * 防火墙(组)名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwGroupName")
    @Expose
    private String FwGroupName;

    /**
    * 开关状态 0：关 ， 1：开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 开关的状态 0：正常， 1：转换中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 0-非sase实例，忽略，1-未绑定状态，2-已绑定
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachWithEdge")
    @Expose
    private Long AttachWithEdge;

    /**
    * 对等防火墙和开关状态 0：正常， 1：对等未创建防火墙，2：对等已创建防火墙，未打开开关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrossEdgeStatus")
    @Expose
    private Long CrossEdgeStatus;

    /**
    * 网络经过VPC防火墙CVM所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwInsRegion")
    @Expose
    private String [] FwInsRegion;

    /**
    * 0 观察 1 拦截 2 严格 3 关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpsAction")
    @Expose
    private Long IpsAction;

    /**
    * 开关关联的防火墙实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwInsLst")
    @Expose
    private VpcFwInstanceShow [] FwInsLst;

    /**
    * 开关是否处于bypass状态
0：正常状态
1：bypass状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BypassStatus")
    @Expose
    private Long BypassStatus;

    /**
     * Get 防火墙开关ID 
     * @return SwitchId 防火墙开关ID
     */
    public String getSwitchId() {
        return this.SwitchId;
    }

    /**
     * Set 防火墙开关ID
     * @param SwitchId 防火墙开关ID
     */
    public void setSwitchId(String SwitchId) {
        this.SwitchId = SwitchId;
    }

    /**
     * Get 防火墙开关NAME
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SwitchName 防火墙开关NAME
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitchName() {
        return this.SwitchName;
    }

    /**
     * Set 防火墙开关NAME
注意：此字段可能返回 null，表示取不到有效值。
     * @param SwitchName 防火墙开关NAME
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitchName(String SwitchName) {
        this.SwitchName = SwitchName;
    }

    /**
     * Get 互通模式 
     * @return SwitchMode 互通模式
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set 互通模式
     * @param SwitchMode 互通模式
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
    }

    /**
     * Get 开关边连接类型 0：对等连接， 1：云连网
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectType 开关边连接类型 0：对等连接， 1：云连网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConnectType() {
        return this.ConnectType;
    }

    /**
     * Set 开关边连接类型 0：对等连接， 1：云连网
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectType 开关边连接类型 0：对等连接， 1：云连网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectType(Long ConnectType) {
        this.ConnectType = ConnectType;
    }

    /**
     * Get 连接ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectId 连接ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectId() {
        return this.ConnectId;
    }

    /**
     * Set 连接ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectId 连接ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectId(String ConnectId) {
        this.ConnectId = ConnectId;
    }

    /**
     * Get 连接名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectName 连接名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectName() {
        return this.ConnectName;
    }

    /**
     * Set 连接名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectName 连接名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectName(String ConnectName) {
        this.ConnectName = ConnectName;
    }

    /**
     * Get 源实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcInstancesInfo 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetInstancesInfo [] getSrcInstancesInfo() {
        return this.SrcInstancesInfo;
    }

    /**
     * Set 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcInstancesInfo 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcInstancesInfo(NetInstancesInfo [] SrcInstancesInfo) {
        this.SrcInstancesInfo = SrcInstancesInfo;
    }

    /**
     * Get 目的实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstInstancesInfo 目的实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetInstancesInfo [] getDstInstancesInfo() {
        return this.DstInstancesInfo;
    }

    /**
     * Set 目的实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstInstancesInfo 目的实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstInstancesInfo(NetInstancesInfo [] DstInstancesInfo) {
        this.DstInstancesInfo = DstInstancesInfo;
    }

    /**
     * Get 防火墙(组)数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwGroupId 防火墙(组)数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set 防火墙(组)数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwGroupId 防火墙(组)数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get 防火墙(组)名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwGroupName 防火墙(组)名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFwGroupName() {
        return this.FwGroupName;
    }

    /**
     * Set 防火墙(组)名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwGroupName 防火墙(组)名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwGroupName(String FwGroupName) {
        this.FwGroupName = FwGroupName;
    }

    /**
     * Get 开关状态 0：关 ， 1：开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 开关状态 0：关 ， 1：开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 开关状态 0：关 ， 1：开
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 开关状态 0：关 ， 1：开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 开关的状态 0：正常， 1：转换中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 开关的状态 0：正常， 1：转换中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关的状态 0：正常， 1：转换中
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 开关的状态 0：正常， 1：转换中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 0-非sase实例，忽略，1-未绑定状态，2-已绑定
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachWithEdge 0-非sase实例，忽略，1-未绑定状态，2-已绑定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttachWithEdge() {
        return this.AttachWithEdge;
    }

    /**
     * Set 0-非sase实例，忽略，1-未绑定状态，2-已绑定
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachWithEdge 0-非sase实例，忽略，1-未绑定状态，2-已绑定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachWithEdge(Long AttachWithEdge) {
        this.AttachWithEdge = AttachWithEdge;
    }

    /**
     * Get 对等防火墙和开关状态 0：正常， 1：对等未创建防火墙，2：对等已创建防火墙，未打开开关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrossEdgeStatus 对等防火墙和开关状态 0：正常， 1：对等未创建防火墙，2：对等已创建防火墙，未打开开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCrossEdgeStatus() {
        return this.CrossEdgeStatus;
    }

    /**
     * Set 对等防火墙和开关状态 0：正常， 1：对等未创建防火墙，2：对等已创建防火墙，未打开开关
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrossEdgeStatus 对等防火墙和开关状态 0：正常， 1：对等未创建防火墙，2：对等已创建防火墙，未打开开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrossEdgeStatus(Long CrossEdgeStatus) {
        this.CrossEdgeStatus = CrossEdgeStatus;
    }

    /**
     * Get 网络经过VPC防火墙CVM所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwInsRegion 网络经过VPC防火墙CVM所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFwInsRegion() {
        return this.FwInsRegion;
    }

    /**
     * Set 网络经过VPC防火墙CVM所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwInsRegion 网络经过VPC防火墙CVM所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwInsRegion(String [] FwInsRegion) {
        this.FwInsRegion = FwInsRegion;
    }

    /**
     * Get 0 观察 1 拦截 2 严格 3 关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpsAction 0 观察 1 拦截 2 严格 3 关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIpsAction() {
        return this.IpsAction;
    }

    /**
     * Set 0 观察 1 拦截 2 严格 3 关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpsAction 0 观察 1 拦截 2 严格 3 关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpsAction(Long IpsAction) {
        this.IpsAction = IpsAction;
    }

    /**
     * Get 开关关联的防火墙实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwInsLst 开关关联的防火墙实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcFwInstanceShow [] getFwInsLst() {
        return this.FwInsLst;
    }

    /**
     * Set 开关关联的防火墙实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwInsLst 开关关联的防火墙实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwInsLst(VpcFwInstanceShow [] FwInsLst) {
        this.FwInsLst = FwInsLst;
    }

    /**
     * Get 开关是否处于bypass状态
0：正常状态
1：bypass状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BypassStatus 开关是否处于bypass状态
0：正常状态
1：bypass状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBypassStatus() {
        return this.BypassStatus;
    }

    /**
     * Set 开关是否处于bypass状态
0：正常状态
1：bypass状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param BypassStatus 开关是否处于bypass状态
0：正常状态
1：bypass状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBypassStatus(Long BypassStatus) {
        this.BypassStatus = BypassStatus;
    }

    public FwGroupSwitchShow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FwGroupSwitchShow(FwGroupSwitchShow source) {
        if (source.SwitchId != null) {
            this.SwitchId = new String(source.SwitchId);
        }
        if (source.SwitchName != null) {
            this.SwitchName = new String(source.SwitchName);
        }
        if (source.SwitchMode != null) {
            this.SwitchMode = new Long(source.SwitchMode);
        }
        if (source.ConnectType != null) {
            this.ConnectType = new Long(source.ConnectType);
        }
        if (source.ConnectId != null) {
            this.ConnectId = new String(source.ConnectId);
        }
        if (source.ConnectName != null) {
            this.ConnectName = new String(source.ConnectName);
        }
        if (source.SrcInstancesInfo != null) {
            this.SrcInstancesInfo = new NetInstancesInfo[source.SrcInstancesInfo.length];
            for (int i = 0; i < source.SrcInstancesInfo.length; i++) {
                this.SrcInstancesInfo[i] = new NetInstancesInfo(source.SrcInstancesInfo[i]);
            }
        }
        if (source.DstInstancesInfo != null) {
            this.DstInstancesInfo = new NetInstancesInfo[source.DstInstancesInfo.length];
            for (int i = 0; i < source.DstInstancesInfo.length; i++) {
                this.DstInstancesInfo[i] = new NetInstancesInfo(source.DstInstancesInfo[i]);
            }
        }
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
        }
        if (source.FwGroupName != null) {
            this.FwGroupName = new String(source.FwGroupName);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AttachWithEdge != null) {
            this.AttachWithEdge = new Long(source.AttachWithEdge);
        }
        if (source.CrossEdgeStatus != null) {
            this.CrossEdgeStatus = new Long(source.CrossEdgeStatus);
        }
        if (source.FwInsRegion != null) {
            this.FwInsRegion = new String[source.FwInsRegion.length];
            for (int i = 0; i < source.FwInsRegion.length; i++) {
                this.FwInsRegion[i] = new String(source.FwInsRegion[i]);
            }
        }
        if (source.IpsAction != null) {
            this.IpsAction = new Long(source.IpsAction);
        }
        if (source.FwInsLst != null) {
            this.FwInsLst = new VpcFwInstanceShow[source.FwInsLst.length];
            for (int i = 0; i < source.FwInsLst.length; i++) {
                this.FwInsLst[i] = new VpcFwInstanceShow(source.FwInsLst[i]);
            }
        }
        if (source.BypassStatus != null) {
            this.BypassStatus = new Long(source.BypassStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SwitchId", this.SwitchId);
        this.setParamSimple(map, prefix + "SwitchName", this.SwitchName);
        this.setParamSimple(map, prefix + "SwitchMode", this.SwitchMode);
        this.setParamSimple(map, prefix + "ConnectType", this.ConnectType);
        this.setParamSimple(map, prefix + "ConnectId", this.ConnectId);
        this.setParamSimple(map, prefix + "ConnectName", this.ConnectName);
        this.setParamArrayObj(map, prefix + "SrcInstancesInfo.", this.SrcInstancesInfo);
        this.setParamArrayObj(map, prefix + "DstInstancesInfo.", this.DstInstancesInfo);
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "FwGroupName", this.FwGroupName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AttachWithEdge", this.AttachWithEdge);
        this.setParamSimple(map, prefix + "CrossEdgeStatus", this.CrossEdgeStatus);
        this.setParamArraySimple(map, prefix + "FwInsRegion.", this.FwInsRegion);
        this.setParamSimple(map, prefix + "IpsAction", this.IpsAction);
        this.setParamArrayObj(map, prefix + "FwInsLst.", this.FwInsLst);
        this.setParamSimple(map, prefix + "BypassStatus", this.BypassStatus);

    }
}

