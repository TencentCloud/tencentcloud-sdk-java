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

public class CreateVpcFwGroupRequest extends AbstractModel {

    /**
    * VPC防火墙(组)名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模式 1：CCN云联网模式；0：私有网络模式 2: sase 模式 3：ccn 高级模式 4: 私有网络(跨租户单边模式)
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 防火墙(组)下的防火墙实例列表
    */
    @SerializedName("VpcFwInstances")
    @Expose
    private VpcFwInstance [] VpcFwInstances;

    /**
    * 防火墙实例的开关模式
1: 单点互通
2: 多点互通
3: 全互通
4: 自定义路由
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
    * auto 自动选择防火墙网段
10.10.10.0/24 用户输入的防火墙网段
    */
    @SerializedName("FwVpcCidr")
    @Expose
    private String FwVpcCidr;

    /**
    * 云联网id ，适用于云联网模式
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 指定防火墙使用网段信息
    */
    @SerializedName("FwCidrInfo")
    @Expose
    private FwCidrInfo FwCidrInfo;

    /**
    * 跨租户管理员模式  1管理员 2多账号
    */
    @SerializedName("CrossUserMode")
    @Expose
    private String CrossUserMode;

    /**
     * Get VPC防火墙(组)名称 
     * @return Name VPC防火墙(组)名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set VPC防火墙(组)名称
     * @param Name VPC防火墙(组)名称
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 防火墙(组)下的防火墙实例列表 
     * @return VpcFwInstances 防火墙(组)下的防火墙实例列表
     */
    public VpcFwInstance [] getVpcFwInstances() {
        return this.VpcFwInstances;
    }

    /**
     * Set 防火墙(组)下的防火墙实例列表
     * @param VpcFwInstances 防火墙(组)下的防火墙实例列表
     */
    public void setVpcFwInstances(VpcFwInstance [] VpcFwInstances) {
        this.VpcFwInstances = VpcFwInstances;
    }

    /**
     * Get 防火墙实例的开关模式
1: 单点互通
2: 多点互通
3: 全互通
4: 自定义路由 
     * @return SwitchMode 防火墙实例的开关模式
1: 单点互通
2: 多点互通
3: 全互通
4: 自定义路由
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set 防火墙实例的开关模式
1: 单点互通
2: 多点互通
3: 全互通
4: 自定义路由
     * @param SwitchMode 防火墙实例的开关模式
1: 单点互通
2: 多点互通
3: 全互通
4: 自定义路由
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
    }

    /**
     * Get auto 自动选择防火墙网段
10.10.10.0/24 用户输入的防火墙网段 
     * @return FwVpcCidr auto 自动选择防火墙网段
10.10.10.0/24 用户输入的防火墙网段
     */
    public String getFwVpcCidr() {
        return this.FwVpcCidr;
    }

    /**
     * Set auto 自动选择防火墙网段
10.10.10.0/24 用户输入的防火墙网段
     * @param FwVpcCidr auto 自动选择防火墙网段
10.10.10.0/24 用户输入的防火墙网段
     */
    public void setFwVpcCidr(String FwVpcCidr) {
        this.FwVpcCidr = FwVpcCidr;
    }

    /**
     * Get 云联网id ，适用于云联网模式 
     * @return CcnId 云联网id ，适用于云联网模式
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网id ，适用于云联网模式
     * @param CcnId 云联网id ，适用于云联网模式
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 指定防火墙使用网段信息 
     * @return FwCidrInfo 指定防火墙使用网段信息
     */
    public FwCidrInfo getFwCidrInfo() {
        return this.FwCidrInfo;
    }

    /**
     * Set 指定防火墙使用网段信息
     * @param FwCidrInfo 指定防火墙使用网段信息
     */
    public void setFwCidrInfo(FwCidrInfo FwCidrInfo) {
        this.FwCidrInfo = FwCidrInfo;
    }

    /**
     * Get 跨租户管理员模式  1管理员 2多账号 
     * @return CrossUserMode 跨租户管理员模式  1管理员 2多账号
     */
    public String getCrossUserMode() {
        return this.CrossUserMode;
    }

    /**
     * Set 跨租户管理员模式  1管理员 2多账号
     * @param CrossUserMode 跨租户管理员模式  1管理员 2多账号
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

