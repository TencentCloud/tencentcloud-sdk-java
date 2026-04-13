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
    * <p>待操作的实例ID数组。可通过 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> 接口返回值中的<code>InstanceId</code>获取。</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>私有网络相关信息配置，通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。<br><li>当指定私有网络ID和子网ID（子网必须在实例所在的可用区）与指定实例所在私有网络不一致时，会将实例迁移至指定的私有网络的子网下。</li><li>可通过<code>PrivateIpAddresses</code>指定私有网络子网IP，若需指定则所有已指定的实例均需要指定子网IP，此时<code>InstanceIds</code>与<code>PrivateIpAddresses</code>一一对应。</li><li>不指定<code>PrivateIpAddresses</code>时随机分配私有网络子网IP。</li></p>
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * <p>是否对运行中的实例选择强制关机。默认为true。</p>
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
    * <p>是否保留主机名。</p><p>默认值：true</p>
    */
    @SerializedName("ReserveHostName")
    @Expose
    private Boolean ReserveHostName;

    /**
     * Get <p>待操作的实例ID数组。可通过 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> 接口返回值中的<code>InstanceId</code>获取。</p> 
     * @return InstanceIds <p>待操作的实例ID数组。可通过 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> 接口返回值中的<code>InstanceId</code>获取。</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>待操作的实例ID数组。可通过 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> 接口返回值中的<code>InstanceId</code>获取。</p>
     * @param InstanceIds <p>待操作的实例ID数组。可通过 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> 接口返回值中的<code>InstanceId</code>获取。</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>私有网络相关信息配置，通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。<br><li>当指定私有网络ID和子网ID（子网必须在实例所在的可用区）与指定实例所在私有网络不一致时，会将实例迁移至指定的私有网络的子网下。</li><li>可通过<code>PrivateIpAddresses</code>指定私有网络子网IP，若需指定则所有已指定的实例均需要指定子网IP，此时<code>InstanceIds</code>与<code>PrivateIpAddresses</code>一一对应。</li><li>不指定<code>PrivateIpAddresses</code>时随机分配私有网络子网IP。</li></p> 
     * @return VirtualPrivateCloud <p>私有网络相关信息配置，通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。<br><li>当指定私有网络ID和子网ID（子网必须在实例所在的可用区）与指定实例所在私有网络不一致时，会将实例迁移至指定的私有网络的子网下。</li><li>可通过<code>PrivateIpAddresses</code>指定私有网络子网IP，若需指定则所有已指定的实例均需要指定子网IP，此时<code>InstanceIds</code>与<code>PrivateIpAddresses</code>一一对应。</li><li>不指定<code>PrivateIpAddresses</code>时随机分配私有网络子网IP。</li></p>
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set <p>私有网络相关信息配置，通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。<br><li>当指定私有网络ID和子网ID（子网必须在实例所在的可用区）与指定实例所在私有网络不一致时，会将实例迁移至指定的私有网络的子网下。</li><li>可通过<code>PrivateIpAddresses</code>指定私有网络子网IP，若需指定则所有已指定的实例均需要指定子网IP，此时<code>InstanceIds</code>与<code>PrivateIpAddresses</code>一一对应。</li><li>不指定<code>PrivateIpAddresses</code>时随机分配私有网络子网IP。</li></p>
     * @param VirtualPrivateCloud <p>私有网络相关信息配置，通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。<br><li>当指定私有网络ID和子网ID（子网必须在实例所在的可用区）与指定实例所在私有网络不一致时，会将实例迁移至指定的私有网络的子网下。</li><li>可通过<code>PrivateIpAddresses</code>指定私有网络子网IP，若需指定则所有已指定的实例均需要指定子网IP，此时<code>InstanceIds</code>与<code>PrivateIpAddresses</code>一一对应。</li><li>不指定<code>PrivateIpAddresses</code>时随机分配私有网络子网IP。</li></p>
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get <p>是否对运行中的实例选择强制关机。默认为true。</p> 
     * @return ForceStop <p>是否对运行中的实例选择强制关机。默认为true。</p>
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set <p>是否对运行中的实例选择强制关机。默认为true。</p>
     * @param ForceStop <p>是否对运行中的实例选择强制关机。默认为true。</p>
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * Get <p>是否保留主机名。</p><p>默认值：true</p> 
     * @return ReserveHostName <p>是否保留主机名。</p><p>默认值：true</p>
     */
    public Boolean getReserveHostName() {
        return this.ReserveHostName;
    }

    /**
     * Set <p>是否保留主机名。</p><p>默认值：true</p>
     * @param ReserveHostName <p>是否保留主机名。</p><p>默认值：true</p>
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

