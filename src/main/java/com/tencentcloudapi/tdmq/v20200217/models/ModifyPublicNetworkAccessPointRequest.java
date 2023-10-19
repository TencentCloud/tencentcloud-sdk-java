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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPublicNetworkAccessPointRequest extends AbstractModel {

    /**
    * 集群名字
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 是否开启
    */
    @SerializedName("PublicNetworkAccessPointStatus")
    @Expose
    private Boolean PublicNetworkAccessPointStatus;

    /**
    * 必填，公网控制台的开关/Vpc控制台的开关，示例值，Public/Vpc
    */
    @SerializedName("SwitchOwner")
    @Expose
    private String SwitchOwner;

    /**
    * Vpc
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网下面指定ip作为vpc接入点
    */
    @SerializedName("SelectIp")
    @Expose
    private String SelectIp;

    /**
     * Get 集群名字 
     * @return ClusterId 集群名字
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群名字
     * @param ClusterId 集群名字
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 是否开启 
     * @return PublicNetworkAccessPointStatus 是否开启
     */
    public Boolean getPublicNetworkAccessPointStatus() {
        return this.PublicNetworkAccessPointStatus;
    }

    /**
     * Set 是否开启
     * @param PublicNetworkAccessPointStatus 是否开启
     */
    public void setPublicNetworkAccessPointStatus(Boolean PublicNetworkAccessPointStatus) {
        this.PublicNetworkAccessPointStatus = PublicNetworkAccessPointStatus;
    }

    /**
     * Get 必填，公网控制台的开关/Vpc控制台的开关，示例值，Public/Vpc 
     * @return SwitchOwner 必填，公网控制台的开关/Vpc控制台的开关，示例值，Public/Vpc
     */
    public String getSwitchOwner() {
        return this.SwitchOwner;
    }

    /**
     * Set 必填，公网控制台的开关/Vpc控制台的开关，示例值，Public/Vpc
     * @param SwitchOwner 必填，公网控制台的开关/Vpc控制台的开关，示例值，Public/Vpc
     */
    public void setSwitchOwner(String SwitchOwner) {
        this.SwitchOwner = SwitchOwner;
    }

    /**
     * Get Vpc 
     * @return VpcId Vpc
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Vpc
     * @param VpcId Vpc
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 
     * @return SubnetId 子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网
     * @param SubnetId 子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网下面指定ip作为vpc接入点 
     * @return SelectIp 子网下面指定ip作为vpc接入点
     */
    public String getSelectIp() {
        return this.SelectIp;
    }

    /**
     * Set 子网下面指定ip作为vpc接入点
     * @param SelectIp 子网下面指定ip作为vpc接入点
     */
    public void setSelectIp(String SelectIp) {
        this.SelectIp = SelectIp;
    }

    public ModifyPublicNetworkAccessPointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPublicNetworkAccessPointRequest(ModifyPublicNetworkAccessPointRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.PublicNetworkAccessPointStatus != null) {
            this.PublicNetworkAccessPointStatus = new Boolean(source.PublicNetworkAccessPointStatus);
        }
        if (source.SwitchOwner != null) {
            this.SwitchOwner = new String(source.SwitchOwner);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SelectIp != null) {
            this.SelectIp = new String(source.SelectIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "PublicNetworkAccessPointStatus", this.PublicNetworkAccessPointStatus);
        this.setParamSimple(map, prefix + "SwitchOwner", this.SwitchOwner);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SelectIp", this.SelectIp);

    }
}

