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
    * 指定需修改网络的实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 原 IP 地址保留时长。
- 单位为分钟，0表示立即回收原 IP 地址。
- 原 IP 将在约定时间后释放，在释放前原 IP和新 IP均可访问。

    */
    @SerializedName("OldIpExpiredTime")
    @Expose
    private Long OldIpExpiredTime;

    /**
    * 切换后的私有网络 ID，若实例当前为基础网络，该字段无需配置。请通过接口 [DescribeDBInstances](https://cloud.tencent.com/document/product/240/38568) 获取私有网络 ID。
    */
    @SerializedName("NewUniqVpcId")
    @Expose
    private String NewUniqVpcId;

    /**
    * 切换后私有网络的子网 ID。若实例当前为基础网络，该字段无需配置。请通过接口 [DescribeDBInstances](https://cloud.tencent.com/document/product/240/38568) 获取私有网络的子网 ID。
    */
    @SerializedName("NewUniqSubnetId")
    @Expose
    private String NewUniqSubnetId;

    /**
    * IP 地址信息，包含新 IP 地址与 原 IP 地址。
    */
    @SerializedName("NetworkAddresses")
    @Expose
    private ModifyNetworkAddress [] NetworkAddresses;

    /**
     * Get 指定需修改网络的实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
 
     * @return InstanceId 指定需修改网络的实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定需修改网络的实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

     * @param InstanceId 指定需修改网络的实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 原 IP 地址保留时长。
- 单位为分钟，0表示立即回收原 IP 地址。
- 原 IP 将在约定时间后释放，在释放前原 IP和新 IP均可访问。
 
     * @return OldIpExpiredTime 原 IP 地址保留时长。
- 单位为分钟，0表示立即回收原 IP 地址。
- 原 IP 将在约定时间后释放，在释放前原 IP和新 IP均可访问。

     */
    public Long getOldIpExpiredTime() {
        return this.OldIpExpiredTime;
    }

    /**
     * Set 原 IP 地址保留时长。
- 单位为分钟，0表示立即回收原 IP 地址。
- 原 IP 将在约定时间后释放，在释放前原 IP和新 IP均可访问。

     * @param OldIpExpiredTime 原 IP 地址保留时长。
- 单位为分钟，0表示立即回收原 IP 地址。
- 原 IP 将在约定时间后释放，在释放前原 IP和新 IP均可访问。

     */
    public void setOldIpExpiredTime(Long OldIpExpiredTime) {
        this.OldIpExpiredTime = OldIpExpiredTime;
    }

    /**
     * Get 切换后的私有网络 ID，若实例当前为基础网络，该字段无需配置。请通过接口 [DescribeDBInstances](https://cloud.tencent.com/document/product/240/38568) 获取私有网络 ID。 
     * @return NewUniqVpcId 切换后的私有网络 ID，若实例当前为基础网络，该字段无需配置。请通过接口 [DescribeDBInstances](https://cloud.tencent.com/document/product/240/38568) 获取私有网络 ID。
     */
    public String getNewUniqVpcId() {
        return this.NewUniqVpcId;
    }

    /**
     * Set 切换后的私有网络 ID，若实例当前为基础网络，该字段无需配置。请通过接口 [DescribeDBInstances](https://cloud.tencent.com/document/product/240/38568) 获取私有网络 ID。
     * @param NewUniqVpcId 切换后的私有网络 ID，若实例当前为基础网络，该字段无需配置。请通过接口 [DescribeDBInstances](https://cloud.tencent.com/document/product/240/38568) 获取私有网络 ID。
     */
    public void setNewUniqVpcId(String NewUniqVpcId) {
        this.NewUniqVpcId = NewUniqVpcId;
    }

    /**
     * Get 切换后私有网络的子网 ID。若实例当前为基础网络，该字段无需配置。请通过接口 [DescribeDBInstances](https://cloud.tencent.com/document/product/240/38568) 获取私有网络的子网 ID。 
     * @return NewUniqSubnetId 切换后私有网络的子网 ID。若实例当前为基础网络，该字段无需配置。请通过接口 [DescribeDBInstances](https://cloud.tencent.com/document/product/240/38568) 获取私有网络的子网 ID。
     */
    public String getNewUniqSubnetId() {
        return this.NewUniqSubnetId;
    }

    /**
     * Set 切换后私有网络的子网 ID。若实例当前为基础网络，该字段无需配置。请通过接口 [DescribeDBInstances](https://cloud.tencent.com/document/product/240/38568) 获取私有网络的子网 ID。
     * @param NewUniqSubnetId 切换后私有网络的子网 ID。若实例当前为基础网络，该字段无需配置。请通过接口 [DescribeDBInstances](https://cloud.tencent.com/document/product/240/38568) 获取私有网络的子网 ID。
     */
    public void setNewUniqSubnetId(String NewUniqSubnetId) {
        this.NewUniqSubnetId = NewUniqSubnetId;
    }

    /**
     * Get IP 地址信息，包含新 IP 地址与 原 IP 地址。 
     * @return NetworkAddresses IP 地址信息，包含新 IP 地址与 原 IP 地址。
     */
    public ModifyNetworkAddress [] getNetworkAddresses() {
        return this.NetworkAddresses;
    }

    /**
     * Set IP 地址信息，包含新 IP 地址与 原 IP 地址。
     * @param NetworkAddresses IP 地址信息，包含新 IP 地址与 原 IP 地址。
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

