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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigureChcAssistVpcRequest extends AbstractModel {

    /**
    * <p>CHC物理服务器ID。</p>
    */
    @SerializedName("ChcIds")
    @Expose
    private String [] ChcIds;

    /**
    * <p>带外网络信息。</p>
    */
    @SerializedName("BmcVirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud BmcVirtualPrivateCloud;

    /**
    * <p>带外网络的安全组列表。</p>
    */
    @SerializedName("BmcSecurityGroupIds")
    @Expose
    private String [] BmcSecurityGroupIds;

    /**
    * <p>部署网络信息。</p>
    */
    @SerializedName("DeployVirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud DeployVirtualPrivateCloud;

    /**
    * <p>部署网络的安全组列表。</p>
    */
    @SerializedName("DeploySecurityGroupIds")
    @Expose
    private String [] DeploySecurityGroupIds;

    /**
    * <p>部署网络的附加参数，用于指定DHCP选项、bios引导模式等配置。</p>
    */
    @SerializedName("ChcDeployExtraConfig")
    @Expose
    private ChcDeployExtraConfig ChcDeployExtraConfig;

    /**
    * <p>是否跳过带外检查。</p><p>默认值：false</p>
    */
    @SerializedName("SkipBmcCheck")
    @Expose
    private Boolean SkipBmcCheck;

    /**
     * Get <p>CHC物理服务器ID。</p> 
     * @return ChcIds <p>CHC物理服务器ID。</p>
     */
    public String [] getChcIds() {
        return this.ChcIds;
    }

    /**
     * Set <p>CHC物理服务器ID。</p>
     * @param ChcIds <p>CHC物理服务器ID。</p>
     */
    public void setChcIds(String [] ChcIds) {
        this.ChcIds = ChcIds;
    }

    /**
     * Get <p>带外网络信息。</p> 
     * @return BmcVirtualPrivateCloud <p>带外网络信息。</p>
     */
    public VirtualPrivateCloud getBmcVirtualPrivateCloud() {
        return this.BmcVirtualPrivateCloud;
    }

    /**
     * Set <p>带外网络信息。</p>
     * @param BmcVirtualPrivateCloud <p>带外网络信息。</p>
     */
    public void setBmcVirtualPrivateCloud(VirtualPrivateCloud BmcVirtualPrivateCloud) {
        this.BmcVirtualPrivateCloud = BmcVirtualPrivateCloud;
    }

    /**
     * Get <p>带外网络的安全组列表。</p> 
     * @return BmcSecurityGroupIds <p>带外网络的安全组列表。</p>
     */
    public String [] getBmcSecurityGroupIds() {
        return this.BmcSecurityGroupIds;
    }

    /**
     * Set <p>带外网络的安全组列表。</p>
     * @param BmcSecurityGroupIds <p>带外网络的安全组列表。</p>
     */
    public void setBmcSecurityGroupIds(String [] BmcSecurityGroupIds) {
        this.BmcSecurityGroupIds = BmcSecurityGroupIds;
    }

    /**
     * Get <p>部署网络信息。</p> 
     * @return DeployVirtualPrivateCloud <p>部署网络信息。</p>
     */
    public VirtualPrivateCloud getDeployVirtualPrivateCloud() {
        return this.DeployVirtualPrivateCloud;
    }

    /**
     * Set <p>部署网络信息。</p>
     * @param DeployVirtualPrivateCloud <p>部署网络信息。</p>
     */
    public void setDeployVirtualPrivateCloud(VirtualPrivateCloud DeployVirtualPrivateCloud) {
        this.DeployVirtualPrivateCloud = DeployVirtualPrivateCloud;
    }

    /**
     * Get <p>部署网络的安全组列表。</p> 
     * @return DeploySecurityGroupIds <p>部署网络的安全组列表。</p>
     */
    public String [] getDeploySecurityGroupIds() {
        return this.DeploySecurityGroupIds;
    }

    /**
     * Set <p>部署网络的安全组列表。</p>
     * @param DeploySecurityGroupIds <p>部署网络的安全组列表。</p>
     */
    public void setDeploySecurityGroupIds(String [] DeploySecurityGroupIds) {
        this.DeploySecurityGroupIds = DeploySecurityGroupIds;
    }

    /**
     * Get <p>部署网络的附加参数，用于指定DHCP选项、bios引导模式等配置。</p> 
     * @return ChcDeployExtraConfig <p>部署网络的附加参数，用于指定DHCP选项、bios引导模式等配置。</p>
     */
    public ChcDeployExtraConfig getChcDeployExtraConfig() {
        return this.ChcDeployExtraConfig;
    }

    /**
     * Set <p>部署网络的附加参数，用于指定DHCP选项、bios引导模式等配置。</p>
     * @param ChcDeployExtraConfig <p>部署网络的附加参数，用于指定DHCP选项、bios引导模式等配置。</p>
     */
    public void setChcDeployExtraConfig(ChcDeployExtraConfig ChcDeployExtraConfig) {
        this.ChcDeployExtraConfig = ChcDeployExtraConfig;
    }

    /**
     * Get <p>是否跳过带外检查。</p><p>默认值：false</p> 
     * @return SkipBmcCheck <p>是否跳过带外检查。</p><p>默认值：false</p>
     */
    public Boolean getSkipBmcCheck() {
        return this.SkipBmcCheck;
    }

    /**
     * Set <p>是否跳过带外检查。</p><p>默认值：false</p>
     * @param SkipBmcCheck <p>是否跳过带外检查。</p><p>默认值：false</p>
     */
    public void setSkipBmcCheck(Boolean SkipBmcCheck) {
        this.SkipBmcCheck = SkipBmcCheck;
    }

    public ConfigureChcAssistVpcRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigureChcAssistVpcRequest(ConfigureChcAssistVpcRequest source) {
        if (source.ChcIds != null) {
            this.ChcIds = new String[source.ChcIds.length];
            for (int i = 0; i < source.ChcIds.length; i++) {
                this.ChcIds[i] = new String(source.ChcIds[i]);
            }
        }
        if (source.BmcVirtualPrivateCloud != null) {
            this.BmcVirtualPrivateCloud = new VirtualPrivateCloud(source.BmcVirtualPrivateCloud);
        }
        if (source.BmcSecurityGroupIds != null) {
            this.BmcSecurityGroupIds = new String[source.BmcSecurityGroupIds.length];
            for (int i = 0; i < source.BmcSecurityGroupIds.length; i++) {
                this.BmcSecurityGroupIds[i] = new String(source.BmcSecurityGroupIds[i]);
            }
        }
        if (source.DeployVirtualPrivateCloud != null) {
            this.DeployVirtualPrivateCloud = new VirtualPrivateCloud(source.DeployVirtualPrivateCloud);
        }
        if (source.DeploySecurityGroupIds != null) {
            this.DeploySecurityGroupIds = new String[source.DeploySecurityGroupIds.length];
            for (int i = 0; i < source.DeploySecurityGroupIds.length; i++) {
                this.DeploySecurityGroupIds[i] = new String(source.DeploySecurityGroupIds[i]);
            }
        }
        if (source.ChcDeployExtraConfig != null) {
            this.ChcDeployExtraConfig = new ChcDeployExtraConfig(source.ChcDeployExtraConfig);
        }
        if (source.SkipBmcCheck != null) {
            this.SkipBmcCheck = new Boolean(source.SkipBmcCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ChcIds.", this.ChcIds);
        this.setParamObj(map, prefix + "BmcVirtualPrivateCloud.", this.BmcVirtualPrivateCloud);
        this.setParamArraySimple(map, prefix + "BmcSecurityGroupIds.", this.BmcSecurityGroupIds);
        this.setParamObj(map, prefix + "DeployVirtualPrivateCloud.", this.DeployVirtualPrivateCloud);
        this.setParamArraySimple(map, prefix + "DeploySecurityGroupIds.", this.DeploySecurityGroupIds);
        this.setParamObj(map, prefix + "ChcDeployExtraConfig.", this.ChcDeployExtraConfig);
        this.setParamSimple(map, prefix + "SkipBmcCheck", this.SkipBmcCheck);

    }
}

