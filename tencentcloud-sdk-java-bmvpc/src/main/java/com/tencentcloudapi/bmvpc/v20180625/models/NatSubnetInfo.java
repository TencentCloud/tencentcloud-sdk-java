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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatSubnetInfo extends AbstractModel{

    /**
    * 子网名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * NAT子网类型，其中0表示绑定部分IP的NAT子网，1表示绑定全部IP的NAT子网，2表示绑定网关方式的NAT子网
    */
    @SerializedName("SubnetNatType")
    @Expose
    private Long SubnetNatType;

    /**
    * 子网网段
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
     * Get 子网名称 
     * @return Name 子网名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 子网名称
     * @param Name 子网名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get NAT子网类型，其中0表示绑定部分IP的NAT子网，1表示绑定全部IP的NAT子网，2表示绑定网关方式的NAT子网 
     * @return SubnetNatType NAT子网类型，其中0表示绑定部分IP的NAT子网，1表示绑定全部IP的NAT子网，2表示绑定网关方式的NAT子网
     */
    public Long getSubnetNatType() {
        return this.SubnetNatType;
    }

    /**
     * Set NAT子网类型，其中0表示绑定部分IP的NAT子网，1表示绑定全部IP的NAT子网，2表示绑定网关方式的NAT子网
     * @param SubnetNatType NAT子网类型，其中0表示绑定部分IP的NAT子网，1表示绑定全部IP的NAT子网，2表示绑定网关方式的NAT子网
     */
    public void setSubnetNatType(Long SubnetNatType) {
        this.SubnetNatType = SubnetNatType;
    }

    /**
     * Get 子网网段 
     * @return CidrBlock 子网网段
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 子网网段
     * @param CidrBlock 子网网段
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetNatType", this.SubnetNatType);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);

    }
}

