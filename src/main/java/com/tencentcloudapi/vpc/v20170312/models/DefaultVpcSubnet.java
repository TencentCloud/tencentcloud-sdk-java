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

public class DefaultVpcSubnet extends AbstractModel {

    /**
    * 默认VpcId。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 默认SubnetId。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 默认Vpc名字。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 默认Subnet名字。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 默认子网网段。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
     * Get 默认VpcId。 
     * @return VpcId 默认VpcId。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 默认VpcId。
     * @param VpcId 默认VpcId。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 默认SubnetId。 
     * @return SubnetId 默认SubnetId。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 默认SubnetId。
     * @param SubnetId 默认SubnetId。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 默认Vpc名字。 
     * @return VpcName 默认Vpc名字。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 默认Vpc名字。
     * @param VpcName 默认Vpc名字。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 默认Subnet名字。 
     * @return SubnetName 默认Subnet名字。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 默认Subnet名字。
     * @param SubnetName 默认Subnet名字。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 默认子网网段。 
     * @return CidrBlock 默认子网网段。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 默认子网网段。
     * @param CidrBlock 默认子网网段。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    public DefaultVpcSubnet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DefaultVpcSubnet(DefaultVpcSubnet source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);

    }
}

