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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigratePrivateIpAddressRequest extends AbstractModel {

    /**
    * 当内网IP绑定的弹性网卡实例ID，例如：eni-m6dyj72l。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

    */
    @SerializedName("SourceNetworkInterfaceId")
    @Expose
    private String SourceNetworkInterfaceId;

    /**
    * 待迁移的目的弹性网卡实例ID。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

    */
    @SerializedName("DestinationNetworkInterfaceId")
    @Expose
    private String DestinationNetworkInterfaceId;

    /**
    * 迁移的内网IP地址，例如：10.0.0.6。
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
     * Get 当内网IP绑定的弹性网卡实例ID，例如：eni-m6dyj72l。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。
 
     * @return SourceNetworkInterfaceId 当内网IP绑定的弹性网卡实例ID，例如：eni-m6dyj72l。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

     */
    public String getSourceNetworkInterfaceId() {
        return this.SourceNetworkInterfaceId;
    }

    /**
     * Set 当内网IP绑定的弹性网卡实例ID，例如：eni-m6dyj72l。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

     * @param SourceNetworkInterfaceId 当内网IP绑定的弹性网卡实例ID，例如：eni-m6dyj72l。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

     */
    public void setSourceNetworkInterfaceId(String SourceNetworkInterfaceId) {
        this.SourceNetworkInterfaceId = SourceNetworkInterfaceId;
    }

    /**
     * Get 待迁移的目的弹性网卡实例ID。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。
 
     * @return DestinationNetworkInterfaceId 待迁移的目的弹性网卡实例ID。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

     */
    public String getDestinationNetworkInterfaceId() {
        return this.DestinationNetworkInterfaceId;
    }

    /**
     * Set 待迁移的目的弹性网卡实例ID。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

     * @param DestinationNetworkInterfaceId 待迁移的目的弹性网卡实例ID。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

     */
    public void setDestinationNetworkInterfaceId(String DestinationNetworkInterfaceId) {
        this.DestinationNetworkInterfaceId = DestinationNetworkInterfaceId;
    }

    /**
     * Get 迁移的内网IP地址，例如：10.0.0.6。 
     * @return PrivateIpAddress 迁移的内网IP地址，例如：10.0.0.6。
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set 迁移的内网IP地址，例如：10.0.0.6。
     * @param PrivateIpAddress 迁移的内网IP地址，例如：10.0.0.6。
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    public MigratePrivateIpAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigratePrivateIpAddressRequest(MigratePrivateIpAddressRequest source) {
        if (source.SourceNetworkInterfaceId != null) {
            this.SourceNetworkInterfaceId = new String(source.SourceNetworkInterfaceId);
        }
        if (source.DestinationNetworkInterfaceId != null) {
            this.DestinationNetworkInterfaceId = new String(source.DestinationNetworkInterfaceId);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceNetworkInterfaceId", this.SourceNetworkInterfaceId);
        this.setParamSimple(map, prefix + "DestinationNetworkInterfaceId", this.DestinationNetworkInterfaceId);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);

    }
}

