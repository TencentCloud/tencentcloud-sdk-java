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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNetworkInterfaceLimitResponse  extends AbstractModel{

    /**
    * 弹性网卡配额
    */
    @SerializedName("EniQuantity")
    @Expose
    private Integer EniQuantity;

    /**
    * 每个弹性网卡可以分配的ip配额
    */
    @SerializedName("EniPrivateIpAddressQuantity")
    @Expose
    private Integer EniPrivateIpAddressQuantity;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取弹性网卡配额
     * @return EniQuantity 弹性网卡配额
     */
    public Integer getEniQuantity() {
        return this.EniQuantity;
    }

    /**
     * 设置弹性网卡配额
     * @param EniQuantity 弹性网卡配额
     */
    public void setEniQuantity(Integer EniQuantity) {
        this.EniQuantity = EniQuantity;
    }

    /**
     * 获取每个弹性网卡可以分配的ip配额
     * @return EniPrivateIpAddressQuantity 每个弹性网卡可以分配的ip配额
     */
    public Integer getEniPrivateIpAddressQuantity() {
        return this.EniPrivateIpAddressQuantity;
    }

    /**
     * 设置每个弹性网卡可以分配的ip配额
     * @param EniPrivateIpAddressQuantity 每个弹性网卡可以分配的ip配额
     */
    public void setEniPrivateIpAddressQuantity(Integer EniPrivateIpAddressQuantity) {
        this.EniPrivateIpAddressQuantity = EniPrivateIpAddressQuantity;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EniQuantity", this.EniQuantity);
        this.setParamSimple(map, prefix + "EniPrivateIpAddressQuantity", this.EniPrivateIpAddressQuantity);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

