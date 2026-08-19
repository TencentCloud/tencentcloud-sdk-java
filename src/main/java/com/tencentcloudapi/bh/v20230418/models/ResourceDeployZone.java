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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceDeployZone extends AbstractModel {

    /**
    * <p>部署堡垒机的VpcId</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>部署堡垒机vpc的名称</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>部署堡垒机vpc的cidr</p>
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * <p>部署堡垒机的子网Id</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>部署堡垒机的子网名称</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>子网cidr</p>
    */
    @SerializedName("SubnetCidrBlock")
    @Expose
    private String SubnetCidrBlock;

    /**
    * <p>部署堡垒机的地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>部署堡垒机的可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>子网的作用场景</p><p>枚举值：</p><ul><li>DEPLOY： 部署堡垒机的子网</li><li>INTERNAL： 开通内网访问的子网</li></ul>
    */
    @SerializedName("SubnetUsageType")
    @Expose
    private String SubnetUsageType;

    /**
     * Get <p>部署堡垒机的VpcId</p> 
     * @return VpcId <p>部署堡垒机的VpcId</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>部署堡垒机的VpcId</p>
     * @param VpcId <p>部署堡垒机的VpcId</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>部署堡垒机vpc的名称</p> 
     * @return VpcName <p>部署堡垒机vpc的名称</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>部署堡垒机vpc的名称</p>
     * @param VpcName <p>部署堡垒机vpc的名称</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>部署堡垒机vpc的cidr</p> 
     * @return VpcCidrBlock <p>部署堡垒机vpc的cidr</p>
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set <p>部署堡垒机vpc的cidr</p>
     * @param VpcCidrBlock <p>部署堡垒机vpc的cidr</p>
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get <p>部署堡垒机的子网Id</p> 
     * @return SubnetId <p>部署堡垒机的子网Id</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>部署堡垒机的子网Id</p>
     * @param SubnetId <p>部署堡垒机的子网Id</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>部署堡垒机的子网名称</p> 
     * @return SubnetName <p>部署堡垒机的子网名称</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>部署堡垒机的子网名称</p>
     * @param SubnetName <p>部署堡垒机的子网名称</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>子网cidr</p> 
     * @return SubnetCidrBlock <p>子网cidr</p>
     */
    public String getSubnetCidrBlock() {
        return this.SubnetCidrBlock;
    }

    /**
     * Set <p>子网cidr</p>
     * @param SubnetCidrBlock <p>子网cidr</p>
     */
    public void setSubnetCidrBlock(String SubnetCidrBlock) {
        this.SubnetCidrBlock = SubnetCidrBlock;
    }

    /**
     * Get <p>部署堡垒机的地域</p> 
     * @return Region <p>部署堡垒机的地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>部署堡垒机的地域</p>
     * @param Region <p>部署堡垒机的地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>部署堡垒机的可用区</p> 
     * @return Zone <p>部署堡垒机的可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>部署堡垒机的可用区</p>
     * @param Zone <p>部署堡垒机的可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>子网的作用场景</p><p>枚举值：</p><ul><li>DEPLOY： 部署堡垒机的子网</li><li>INTERNAL： 开通内网访问的子网</li></ul> 
     * @return SubnetUsageType <p>子网的作用场景</p><p>枚举值：</p><ul><li>DEPLOY： 部署堡垒机的子网</li><li>INTERNAL： 开通内网访问的子网</li></ul>
     */
    public String getSubnetUsageType() {
        return this.SubnetUsageType;
    }

    /**
     * Set <p>子网的作用场景</p><p>枚举值：</p><ul><li>DEPLOY： 部署堡垒机的子网</li><li>INTERNAL： 开通内网访问的子网</li></ul>
     * @param SubnetUsageType <p>子网的作用场景</p><p>枚举值：</p><ul><li>DEPLOY： 部署堡垒机的子网</li><li>INTERNAL： 开通内网访问的子网</li></ul>
     */
    public void setSubnetUsageType(String SubnetUsageType) {
        this.SubnetUsageType = SubnetUsageType;
    }

    public ResourceDeployZone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceDeployZone(ResourceDeployZone source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.SubnetCidrBlock != null) {
            this.SubnetCidrBlock = new String(source.SubnetCidrBlock);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SubnetUsageType != null) {
            this.SubnetUsageType = new String(source.SubnetUsageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "SubnetCidrBlock", this.SubnetCidrBlock);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SubnetUsageType", this.SubnetUsageType);

    }
}

