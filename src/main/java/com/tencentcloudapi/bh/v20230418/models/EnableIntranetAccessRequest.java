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

public class EnableIntranetAccessRequest extends AbstractModel {

    /**
    * <p>堡垒机实例id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>开通内网访问的vpc id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>vpc名称</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>vpc地域</p>
    */
    @SerializedName("VpcRegion")
    @Expose
    private String VpcRegion;

    /**
    * <p>vpc的网段</p>
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * <p>开通内网访问的subnet id</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>内网ip的自定义域名，可为空</p>
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p>开通内网的子网信息</p>
    */
    @SerializedName("IntranetSubnets")
    @Expose
    private ParamInitResourceSubnet [] IntranetSubnets;

    /**
     * Get <p>堡垒机实例id</p> 
     * @return ResourceId <p>堡垒机实例id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>堡垒机实例id</p>
     * @param ResourceId <p>堡垒机实例id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>开通内网访问的vpc id</p> 
     * @return VpcId <p>开通内网访问的vpc id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>开通内网访问的vpc id</p>
     * @param VpcId <p>开通内网访问的vpc id</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>vpc名称</p> 
     * @return VpcName <p>vpc名称</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>vpc名称</p>
     * @param VpcName <p>vpc名称</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>vpc地域</p> 
     * @return VpcRegion <p>vpc地域</p>
     */
    public String getVpcRegion() {
        return this.VpcRegion;
    }

    /**
     * Set <p>vpc地域</p>
     * @param VpcRegion <p>vpc地域</p>
     */
    public void setVpcRegion(String VpcRegion) {
        this.VpcRegion = VpcRegion;
    }

    /**
     * Get <p>vpc的网段</p> 
     * @return VpcCidrBlock <p>vpc的网段</p>
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set <p>vpc的网段</p>
     * @param VpcCidrBlock <p>vpc的网段</p>
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get <p>开通内网访问的subnet id</p> 
     * @return SubnetId <p>开通内网访问的subnet id</p>
     * @deprecated
     */
    @Deprecated
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>开通内网访问的subnet id</p>
     * @param SubnetId <p>开通内网访问的subnet id</p>
     * @deprecated
     */
    @Deprecated
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>内网ip的自定义域名，可为空</p> 
     * @return DomainName <p>内网ip的自定义域名，可为空</p>
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p>内网ip的自定义域名，可为空</p>
     * @param DomainName <p>内网ip的自定义域名，可为空</p>
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p>开通内网的子网信息</p> 
     * @return IntranetSubnets <p>开通内网的子网信息</p>
     */
    public ParamInitResourceSubnet [] getIntranetSubnets() {
        return this.IntranetSubnets;
    }

    /**
     * Set <p>开通内网的子网信息</p>
     * @param IntranetSubnets <p>开通内网的子网信息</p>
     */
    public void setIntranetSubnets(ParamInitResourceSubnet [] IntranetSubnets) {
        this.IntranetSubnets = IntranetSubnets;
    }

    public EnableIntranetAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableIntranetAccessRequest(EnableIntranetAccessRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcRegion != null) {
            this.VpcRegion = new String(source.VpcRegion);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.IntranetSubnets != null) {
            this.IntranetSubnets = new ParamInitResourceSubnet[source.IntranetSubnets.length];
            for (int i = 0; i < source.IntranetSubnets.length; i++) {
                this.IntranetSubnets[i] = new ParamInitResourceSubnet(source.IntranetSubnets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcRegion", this.VpcRegion);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamArrayObj(map, prefix + "IntranetSubnets.", this.IntranetSubnets);

    }
}

