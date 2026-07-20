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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVpcFwGroupRequest extends AbstractModel {

    /**
    * <p>VPC防火墙(组)名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>模式 1：CCN云联网模式；0：私有网络模式 2: sase 模式 3：ccn 高级模式 4: 私有网络(跨租户单边模式)</p>
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * <p>防火墙(组)下的防火墙实例列表</p>
    */
    @SerializedName("VpcFwInstances")
    @Expose
    private VpcFwInstance [] VpcFwInstances;

    /**
    * <p>防火墙实例的开关模式<br>1: 单点互通<br>2: 多点互通<br>3: 全互通<br>4: 自定义路由</p>
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
    * <p>auto 自动选择防火墙网段<br>10.10.10.0/24 用户输入的防火墙网段</p>
    */
    @SerializedName("FwVpcCidr")
    @Expose
    private String FwVpcCidr;

    /**
    * <p>云联网id ，适用于云联网模式</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>指定防火墙使用网段信息</p>
    */
    @SerializedName("FwCidrInfo")
    @Expose
    private FwCidrInfo FwCidrInfo;

    /**
    * <p>跨租户管理员模式  1管理员 2多账号</p>
    */
    @SerializedName("CrossUserMode")
    @Expose
    private String CrossUserMode;

    /**
     * Get <p>VPC防火墙(组)名称</p> 
     * @return Name <p>VPC防火墙(组)名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>VPC防火墙(组)名称</p>
     * @param Name <p>VPC防火墙(组)名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>模式 1：CCN云联网模式；0：私有网络模式 2: sase 模式 3：ccn 高级模式 4: 私有网络(跨租户单边模式)</p> 
     * @return Mode <p>模式 1：CCN云联网模式；0：私有网络模式 2: sase 模式 3：ccn 高级模式 4: 私有网络(跨租户单边模式)</p>
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set <p>模式 1：CCN云联网模式；0：私有网络模式 2: sase 模式 3：ccn 高级模式 4: 私有网络(跨租户单边模式)</p>
     * @param Mode <p>模式 1：CCN云联网模式；0：私有网络模式 2: sase 模式 3：ccn 高级模式 4: 私有网络(跨租户单边模式)</p>
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>防火墙(组)下的防火墙实例列表</p> 
     * @return VpcFwInstances <p>防火墙(组)下的防火墙实例列表</p>
     */
    public VpcFwInstance [] getVpcFwInstances() {
        return this.VpcFwInstances;
    }

    /**
     * Set <p>防火墙(组)下的防火墙实例列表</p>
     * @param VpcFwInstances <p>防火墙(组)下的防火墙实例列表</p>
     */
    public void setVpcFwInstances(VpcFwInstance [] VpcFwInstances) {
        this.VpcFwInstances = VpcFwInstances;
    }

    /**
     * Get <p>防火墙实例的开关模式<br>1: 单点互通<br>2: 多点互通<br>3: 全互通<br>4: 自定义路由</p> 
     * @return SwitchMode <p>防火墙实例的开关模式<br>1: 单点互通<br>2: 多点互通<br>3: 全互通<br>4: 自定义路由</p>
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set <p>防火墙实例的开关模式<br>1: 单点互通<br>2: 多点互通<br>3: 全互通<br>4: 自定义路由</p>
     * @param SwitchMode <p>防火墙实例的开关模式<br>1: 单点互通<br>2: 多点互通<br>3: 全互通<br>4: 自定义路由</p>
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
    }

    /**
     * Get <p>auto 自动选择防火墙网段<br>10.10.10.0/24 用户输入的防火墙网段</p> 
     * @return FwVpcCidr <p>auto 自动选择防火墙网段<br>10.10.10.0/24 用户输入的防火墙网段</p>
     */
    public String getFwVpcCidr() {
        return this.FwVpcCidr;
    }

    /**
     * Set <p>auto 自动选择防火墙网段<br>10.10.10.0/24 用户输入的防火墙网段</p>
     * @param FwVpcCidr <p>auto 自动选择防火墙网段<br>10.10.10.0/24 用户输入的防火墙网段</p>
     */
    public void setFwVpcCidr(String FwVpcCidr) {
        this.FwVpcCidr = FwVpcCidr;
    }

    /**
     * Get <p>云联网id ，适用于云联网模式</p> 
     * @return CcnId <p>云联网id ，适用于云联网模式</p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>云联网id ，适用于云联网模式</p>
     * @param CcnId <p>云联网id ，适用于云联网模式</p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>指定防火墙使用网段信息</p> 
     * @return FwCidrInfo <p>指定防火墙使用网段信息</p>
     */
    public FwCidrInfo getFwCidrInfo() {
        return this.FwCidrInfo;
    }

    /**
     * Set <p>指定防火墙使用网段信息</p>
     * @param FwCidrInfo <p>指定防火墙使用网段信息</p>
     */
    public void setFwCidrInfo(FwCidrInfo FwCidrInfo) {
        this.FwCidrInfo = FwCidrInfo;
    }

    /**
     * Get <p>跨租户管理员模式  1管理员 2多账号</p> 
     * @return CrossUserMode <p>跨租户管理员模式  1管理员 2多账号</p>
     */
    public String getCrossUserMode() {
        return this.CrossUserMode;
    }

    /**
     * Set <p>跨租户管理员模式  1管理员 2多账号</p>
     * @param CrossUserMode <p>跨租户管理员模式  1管理员 2多账号</p>
     */
    public void setCrossUserMode(String CrossUserMode) {
        this.CrossUserMode = CrossUserMode;
    }

    public CreateVpcFwGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpcFwGroupRequest(CreateVpcFwGroupRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.VpcFwInstances != null) {
            this.VpcFwInstances = new VpcFwInstance[source.VpcFwInstances.length];
            for (int i = 0; i < source.VpcFwInstances.length; i++) {
                this.VpcFwInstances[i] = new VpcFwInstance(source.VpcFwInstances[i]);
            }
        }
        if (source.SwitchMode != null) {
            this.SwitchMode = new Long(source.SwitchMode);
        }
        if (source.FwVpcCidr != null) {
            this.FwVpcCidr = new String(source.FwVpcCidr);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.FwCidrInfo != null) {
            this.FwCidrInfo = new FwCidrInfo(source.FwCidrInfo);
        }
        if (source.CrossUserMode != null) {
            this.CrossUserMode = new String(source.CrossUserMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "VpcFwInstances.", this.VpcFwInstances);
        this.setParamSimple(map, prefix + "SwitchMode", this.SwitchMode);
        this.setParamSimple(map, prefix + "FwVpcCidr", this.FwVpcCidr);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamObj(map, prefix + "FwCidrInfo.", this.FwCidrInfo);
        this.setParamSimple(map, prefix + "CrossUserMode", this.CrossUserMode);

    }
}

