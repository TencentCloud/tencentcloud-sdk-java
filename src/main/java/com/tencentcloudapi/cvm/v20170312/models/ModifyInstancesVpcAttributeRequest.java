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

public class ModifyInstancesVpcAttributeRequest extends AbstractModel {

    /**
    * 待操作的实例ID数组。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 私有网络相关信息配置，通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。<br><li>当指定私有网络ID和子网ID（子网必须在实例所在的可用区）与指定实例所在私有网络不一致时，会将实例迁移至指定的私有网络的子网下。</li><li>可通过`PrivateIpAddresses`指定私有网络子网IP，若需指定则所有已指定的实例均需要指定子网IP，此时`InstanceIds`与`PrivateIpAddresses`一一对应。</li><li>不指定`PrivateIpAddresses`时随机分配私有网络子网IP。</li>
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * 是否对运行中的实例选择强制关机。默认为true。
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
    * 是否保留主机名。默认为false。
    */
    @SerializedName("ReserveHostName")
    @Expose
    private Boolean ReserveHostName;

    /**
     * Get 待操作的实例ID数组。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。 
     * @return InstanceIds 待操作的实例ID数组。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 待操作的实例ID数组。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。
     * @param InstanceIds 待操作的实例ID数组。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 私有网络相关信息配置，通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。<br><li>当指定私有网络ID和子网ID（子网必须在实例所在的可用区）与指定实例所在私有网络不一致时，会将实例迁移至指定的私有网络的子网下。</li><li>可通过`PrivateIpAddresses`指定私有网络子网IP，若需指定则所有已指定的实例均需要指定子网IP，此时`InstanceIds`与`PrivateIpAddresses`一一对应。</li><li>不指定`PrivateIpAddresses`时随机分配私有网络子网IP。</li> 
     * @return VirtualPrivateCloud 私有网络相关信息配置，通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。<br><li>当指定私有网络ID和子网ID（子网必须在实例所在的可用区）与指定实例所在私有网络不一致时，会将实例迁移至指定的私有网络的子网下。</li><li>可通过`PrivateIpAddresses`指定私有网络子网IP，若需指定则所有已指定的实例均需要指定子网IP，此时`InstanceIds`与`PrivateIpAddresses`一一对应。</li><li>不指定`PrivateIpAddresses`时随机分配私有网络子网IP。</li>
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set 私有网络相关信息配置，通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。<br><li>当指定私有网络ID和子网ID（子网必须在实例所在的可用区）与指定实例所在私有网络不一致时，会将实例迁移至指定的私有网络的子网下。</li><li>可通过`PrivateIpAddresses`指定私有网络子网IP，若需指定则所有已指定的实例均需要指定子网IP，此时`InstanceIds`与`PrivateIpAddresses`一一对应。</li><li>不指定`PrivateIpAddresses`时随机分配私有网络子网IP。</li>
     * @param VirtualPrivateCloud 私有网络相关信息配置，通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。<br><li>当指定私有网络ID和子网ID（子网必须在实例所在的可用区）与指定实例所在私有网络不一致时，会将实例迁移至指定的私有网络的子网下。</li><li>可通过`PrivateIpAddresses`指定私有网络子网IP，若需指定则所有已指定的实例均需要指定子网IP，此时`InstanceIds`与`PrivateIpAddresses`一一对应。</li><li>不指定`PrivateIpAddresses`时随机分配私有网络子网IP。</li>
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get 是否对运行中的实例选择强制关机。默认为true。 
     * @return ForceStop 是否对运行中的实例选择强制关机。默认为true。
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set 是否对运行中的实例选择强制关机。默认为true。
     * @param ForceStop 是否对运行中的实例选择强制关机。默认为true。
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * Get 是否保留主机名。默认为false。 
     * @return ReserveHostName 是否保留主机名。默认为false。
     */
    public Boolean getReserveHostName() {
        return this.ReserveHostName;
    }

    /**
     * Set 是否保留主机名。默认为false。
     * @param ReserveHostName 是否保留主机名。默认为false。
     */
    public void setReserveHostName(Boolean ReserveHostName) {
        this.ReserveHostName = ReserveHostName;
    }

    public ModifyInstancesVpcAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancesVpcAttributeRequest(ModifyInstancesVpcAttributeRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.ForceStop != null) {
            this.ForceStop = new Boolean(source.ForceStop);
        }
        if (source.ReserveHostName != null) {
            this.ReserveHostName = new Boolean(source.ReserveHostName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);
        this.setParamSimple(map, prefix + "ReserveHostName", this.ReserveHostName);

    }
}

