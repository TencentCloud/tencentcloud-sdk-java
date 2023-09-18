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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatasourceConnectionLocation extends AbstractModel{

    /**
    * 数据连接所在Vpc实例Id，如“vpc-azd4dt1c”。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Vpc的IPv4 CIDR
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 数据连接所在子网的实例Id，如“subnet-bthucmmy”
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Subnet的IPv4 CIDR
    */
    @SerializedName("SubnetCidrBlock")
    @Expose
    private String SubnetCidrBlock;

    /**
     * Get 数据连接所在Vpc实例Id，如“vpc-azd4dt1c”。 
     * @return VpcId 数据连接所在Vpc实例Id，如“vpc-azd4dt1c”。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 数据连接所在Vpc实例Id，如“vpc-azd4dt1c”。
     * @param VpcId 数据连接所在Vpc实例Id，如“vpc-azd4dt1c”。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Vpc的IPv4 CIDR 
     * @return VpcCidrBlock Vpc的IPv4 CIDR
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set Vpc的IPv4 CIDR
     * @param VpcCidrBlock Vpc的IPv4 CIDR
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get 数据连接所在子网的实例Id，如“subnet-bthucmmy” 
     * @return SubnetId 数据连接所在子网的实例Id，如“subnet-bthucmmy”
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 数据连接所在子网的实例Id，如“subnet-bthucmmy”
     * @param SubnetId 数据连接所在子网的实例Id，如“subnet-bthucmmy”
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Subnet的IPv4 CIDR 
     * @return SubnetCidrBlock Subnet的IPv4 CIDR
     */
    public String getSubnetCidrBlock() {
        return this.SubnetCidrBlock;
    }

    /**
     * Set Subnet的IPv4 CIDR
     * @param SubnetCidrBlock Subnet的IPv4 CIDR
     */
    public void setSubnetCidrBlock(String SubnetCidrBlock) {
        this.SubnetCidrBlock = SubnetCidrBlock;
    }

    public DatasourceConnectionLocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatasourceConnectionLocation(DatasourceConnectionLocation source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetCidrBlock != null) {
            this.SubnetCidrBlock = new String(source.SubnetCidrBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetCidrBlock", this.SubnetCidrBlock);

    }
}

