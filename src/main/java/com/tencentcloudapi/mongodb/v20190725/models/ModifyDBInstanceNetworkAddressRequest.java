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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceNetworkAddressRequest extends AbstractModel {

    /**
    * <p>指定需修改网络的实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>原 IP 地址保留时长。</p><ul><li>单位为分钟，0表示立即回收原 IP 地址。</li><li>原 IP 将在约定时间后释放，在释放前原 IP和新 IP均可访问。</li></ul>
    */
    @SerializedName("OldIpExpiredTime")
    @Expose
    private Long OldIpExpiredTime;

    /**
    * <p>切换后的私有网络 ID，若实例当前为基础网络，该字段无需配置。请通过接口 <a href="https://cloud.tencent.com/document/product/240/38568">DescribeDBInstances</a> 获取私有网络 ID。</p>
    */
    @SerializedName("NewUniqVpcId")
    @Expose
    private String NewUniqVpcId;

    /**
    * <p>切换后私有网络的子网 ID。若实例当前为基础网络，该字段无需配置。请通过接口 <a href="https://cloud.tencent.com/document/product/240/38568">DescribeDBInstances</a> 获取私有网络的子网 ID。</p>
    */
    @SerializedName("NewUniqSubnetId")
    @Expose
    private String NewUniqSubnetId;

    /**
    * <p>IP 地址信息，包含新 IP 地址与 原 IP 地址。</p>
    */
    @SerializedName("NetworkAddresses")
    @Expose
    private ModifyNetworkAddress [] NetworkAddresses;

    /**
     * Get <p>指定需修改网络的实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定需修改网络的实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定需修改网络的实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定需修改网络的实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>原 IP 地址保留时长。</p><ul><li>单位为分钟，0表示立即回收原 IP 地址。</li><li>原 IP 将在约定时间后释放，在释放前原 IP和新 IP均可访问。</li></ul> 
     * @return OldIpExpiredTime <p>原 IP 地址保留时长。</p><ul><li>单位为分钟，0表示立即回收原 IP 地址。</li><li>原 IP 将在约定时间后释放，在释放前原 IP和新 IP均可访问。</li></ul>
     */
    public Long getOldIpExpiredTime() {
        return this.OldIpExpiredTime;
    }

    /**
     * Set <p>原 IP 地址保留时长。</p><ul><li>单位为分钟，0表示立即回收原 IP 地址。</li><li>原 IP 将在约定时间后释放，在释放前原 IP和新 IP均可访问。</li></ul>
     * @param OldIpExpiredTime <p>原 IP 地址保留时长。</p><ul><li>单位为分钟，0表示立即回收原 IP 地址。</li><li>原 IP 将在约定时间后释放，在释放前原 IP和新 IP均可访问。</li></ul>
     */
    public void setOldIpExpiredTime(Long OldIpExpiredTime) {
        this.OldIpExpiredTime = OldIpExpiredTime;
    }

    /**
     * Get <p>切换后的私有网络 ID，若实例当前为基础网络，该字段无需配置。请通过接口 <a href="https://cloud.tencent.com/document/product/240/38568">DescribeDBInstances</a> 获取私有网络 ID。</p> 
     * @return NewUniqVpcId <p>切换后的私有网络 ID，若实例当前为基础网络，该字段无需配置。请通过接口 <a href="https://cloud.tencent.com/document/product/240/38568">DescribeDBInstances</a> 获取私有网络 ID。</p>
     */
    public String getNewUniqVpcId() {
        return this.NewUniqVpcId;
    }

    /**
     * Set <p>切换后的私有网络 ID，若实例当前为基础网络，该字段无需配置。请通过接口 <a href="https://cloud.tencent.com/document/product/240/38568">DescribeDBInstances</a> 获取私有网络 ID。</p>
     * @param NewUniqVpcId <p>切换后的私有网络 ID，若实例当前为基础网络，该字段无需配置。请通过接口 <a href="https://cloud.tencent.com/document/product/240/38568">DescribeDBInstances</a> 获取私有网络 ID。</p>
     */
    public void setNewUniqVpcId(String NewUniqVpcId) {
        this.NewUniqVpcId = NewUniqVpcId;
    }

    /**
     * Get <p>切换后私有网络的子网 ID。若实例当前为基础网络，该字段无需配置。请通过接口 <a href="https://cloud.tencent.com/document/product/240/38568">DescribeDBInstances</a> 获取私有网络的子网 ID。</p> 
     * @return NewUniqSubnetId <p>切换后私有网络的子网 ID。若实例当前为基础网络，该字段无需配置。请通过接口 <a href="https://cloud.tencent.com/document/product/240/38568">DescribeDBInstances</a> 获取私有网络的子网 ID。</p>
     */
    public String getNewUniqSubnetId() {
        return this.NewUniqSubnetId;
    }

    /**
     * Set <p>切换后私有网络的子网 ID。若实例当前为基础网络，该字段无需配置。请通过接口 <a href="https://cloud.tencent.com/document/product/240/38568">DescribeDBInstances</a> 获取私有网络的子网 ID。</p>
     * @param NewUniqSubnetId <p>切换后私有网络的子网 ID。若实例当前为基础网络，该字段无需配置。请通过接口 <a href="https://cloud.tencent.com/document/product/240/38568">DescribeDBInstances</a> 获取私有网络的子网 ID。</p>
     */
    public void setNewUniqSubnetId(String NewUniqSubnetId) {
        this.NewUniqSubnetId = NewUniqSubnetId;
    }

    /**
     * Get <p>IP 地址信息，包含新 IP 地址与 原 IP 地址。</p> 
     * @return NetworkAddresses <p>IP 地址信息，包含新 IP 地址与 原 IP 地址。</p>
     */
    public ModifyNetworkAddress [] getNetworkAddresses() {
        return this.NetworkAddresses;
    }

    /**
     * Set <p>IP 地址信息，包含新 IP 地址与 原 IP 地址。</p>
     * @param NetworkAddresses <p>IP 地址信息，包含新 IP 地址与 原 IP 地址。</p>
     */
    public void setNetworkAddresses(ModifyNetworkAddress [] NetworkAddresses) {
        this.NetworkAddresses = NetworkAddresses;
    }

    public ModifyDBInstanceNetworkAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceNetworkAddressRequest(ModifyDBInstanceNetworkAddressRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OldIpExpiredTime != null) {
            this.OldIpExpiredTime = new Long(source.OldIpExpiredTime);
        }
        if (source.NewUniqVpcId != null) {
            this.NewUniqVpcId = new String(source.NewUniqVpcId);
        }
        if (source.NewUniqSubnetId != null) {
            this.NewUniqSubnetId = new String(source.NewUniqSubnetId);
        }
        if (source.NetworkAddresses != null) {
            this.NetworkAddresses = new ModifyNetworkAddress[source.NetworkAddresses.length];
            for (int i = 0; i < source.NetworkAddresses.length; i++) {
                this.NetworkAddresses[i] = new ModifyNetworkAddress(source.NetworkAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OldIpExpiredTime", this.OldIpExpiredTime);
        this.setParamSimple(map, prefix + "NewUniqVpcId", this.NewUniqVpcId);
        this.setParamSimple(map, prefix + "NewUniqSubnetId", this.NewUniqSubnetId);
        this.setParamArrayObj(map, prefix + "NetworkAddresses.", this.NetworkAddresses);

    }
}

