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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRoInstanceIpResponse extends AbstractModel{

    /**
    * 只读实例的私有网络的ID。
    */
    @SerializedName("RoVpcId")
    @Expose
    private Long RoVpcId;

    /**
    * 只读实例的子网ID。
    */
    @SerializedName("RoSubnetId")
    @Expose
    private Long RoSubnetId;

    /**
    * 只读实例的内网IP地址。
    */
    @SerializedName("RoVip")
    @Expose
    private String RoVip;

    /**
    * 只读实例的内网端口号。
    */
    @SerializedName("RoVport")
    @Expose
    private Long RoVport;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 只读实例的私有网络的ID。 
     * @return RoVpcId 只读实例的私有网络的ID。
     */
    public Long getRoVpcId() {
        return this.RoVpcId;
    }

    /**
     * Set 只读实例的私有网络的ID。
     * @param RoVpcId 只读实例的私有网络的ID。
     */
    public void setRoVpcId(Long RoVpcId) {
        this.RoVpcId = RoVpcId;
    }

    /**
     * Get 只读实例的子网ID。 
     * @return RoSubnetId 只读实例的子网ID。
     */
    public Long getRoSubnetId() {
        return this.RoSubnetId;
    }

    /**
     * Set 只读实例的子网ID。
     * @param RoSubnetId 只读实例的子网ID。
     */
    public void setRoSubnetId(Long RoSubnetId) {
        this.RoSubnetId = RoSubnetId;
    }

    /**
     * Get 只读实例的内网IP地址。 
     * @return RoVip 只读实例的内网IP地址。
     */
    public String getRoVip() {
        return this.RoVip;
    }

    /**
     * Set 只读实例的内网IP地址。
     * @param RoVip 只读实例的内网IP地址。
     */
    public void setRoVip(String RoVip) {
        this.RoVip = RoVip;
    }

    /**
     * Get 只读实例的内网端口号。 
     * @return RoVport 只读实例的内网端口号。
     */
    public Long getRoVport() {
        return this.RoVport;
    }

    /**
     * Set 只读实例的内网端口号。
     * @param RoVport 只读实例的内网端口号。
     */
    public void setRoVport(Long RoVport) {
        this.RoVport = RoVport;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateRoInstanceIpResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoInstanceIpResponse(CreateRoInstanceIpResponse source) {
        if (source.RoVpcId != null) {
            this.RoVpcId = new Long(source.RoVpcId);
        }
        if (source.RoSubnetId != null) {
            this.RoSubnetId = new Long(source.RoSubnetId);
        }
        if (source.RoVip != null) {
            this.RoVip = new String(source.RoVip);
        }
        if (source.RoVport != null) {
            this.RoVport = new Long(source.RoVport);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoVpcId", this.RoVpcId);
        this.setParamSimple(map, prefix + "RoSubnetId", this.RoSubnetId);
        this.setParamSimple(map, prefix + "RoVip", this.RoVip);
        this.setParamSimple(map, prefix + "RoVport", this.RoVport);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

