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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkConfigResponse  extends AbstractModel{

    /**
    * 执行状态：true|false
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VIP地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取执行状态：true|false
     * @return Status 执行状态：true|false
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * 设置执行状态：true|false
     * @param Status 执行状态：true|false
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * 获取子网ID
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取私有网络ID
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取VIP地址
     * @return Vip VIP地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * 设置VIP地址
     * @param Vip VIP地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

