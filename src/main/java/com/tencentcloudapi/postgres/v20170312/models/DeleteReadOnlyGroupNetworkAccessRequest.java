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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteReadOnlyGroupNetworkAccessRequest extends AbstractModel{

    /**
    * RO组ID，形如：pgro-4t9c6g7k。
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * 私有网络统一 ID，若是基础网络则传"0"。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID，若是基础网络则传"0"。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 目标VIP地址。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get RO组ID，形如：pgro-4t9c6g7k。 
     * @return ReadOnlyGroupId RO组ID，形如：pgro-4t9c6g7k。
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set RO组ID，形如：pgro-4t9c6g7k。
     * @param ReadOnlyGroupId RO组ID，形如：pgro-4t9c6g7k。
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get 私有网络统一 ID，若是基础网络则传"0"。 
     * @return VpcId 私有网络统一 ID，若是基础网络则传"0"。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络统一 ID，若是基础网络则传"0"。
     * @param VpcId 私有网络统一 ID，若是基础网络则传"0"。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID，若是基础网络则传"0"。 
     * @return SubnetId 子网ID，若是基础网络则传"0"。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID，若是基础网络则传"0"。
     * @param SubnetId 子网ID，若是基础网络则传"0"。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 目标VIP地址。 
     * @return Vip 目标VIP地址。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 目标VIP地址。
     * @param Vip 目标VIP地址。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public DeleteReadOnlyGroupNetworkAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteReadOnlyGroupNetworkAccessRequest(DeleteReadOnlyGroupNetworkAccessRequest source) {
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

