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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceAddrList extends AbstractModel {

    /**
    * 设备地址列表
    */
    @SerializedName("RemoteAddrs")
    @Expose
    private RemoteAddrInfo [] RemoteAddrs;

    /**
     * Get 设备地址列表 
     * @return RemoteAddrs 设备地址列表
     */
    public RemoteAddrInfo [] getRemoteAddrs() {
        return this.RemoteAddrs;
    }

    /**
     * Set 设备地址列表
     * @param RemoteAddrs 设备地址列表
     */
    public void setRemoteAddrs(RemoteAddrInfo [] RemoteAddrs) {
        this.RemoteAddrs = RemoteAddrs;
    }

    public DescribeDeviceAddrList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceAddrList(DescribeDeviceAddrList source) {
        if (source.RemoteAddrs != null) {
            this.RemoteAddrs = new RemoteAddrInfo[source.RemoteAddrs.length];
            for (int i = 0; i < source.RemoteAddrs.length; i++) {
                this.RemoteAddrs[i] = new RemoteAddrInfo(source.RemoteAddrs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RemoteAddrs.", this.RemoteAddrs);

    }
}

