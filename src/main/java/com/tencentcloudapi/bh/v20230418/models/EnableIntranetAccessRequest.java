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
    * 堡垒机实例id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 开通内网访问的vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc的网段
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 开通内网访问的subnet id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 内网ip的自定义域名，可为空
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
     * Get 堡垒机实例id 
     * @return ResourceId 堡垒机实例id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 堡垒机实例id
     * @param ResourceId 堡垒机实例id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 开通内网访问的vpc id 
     * @return VpcId 开通内网访问的vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 开通内网访问的vpc id
     * @param VpcId 开通内网访问的vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc的网段 
     * @return VpcCidrBlock vpc的网段
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set vpc的网段
     * @param VpcCidrBlock vpc的网段
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get 开通内网访问的subnet id 
     * @return SubnetId 开通内网访问的subnet id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 开通内网访问的subnet id
     * @param SubnetId 开通内网访问的subnet id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 内网ip的自定义域名，可为空 
     * @return DomainName 内网ip的自定义域名，可为空
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 内网ip的自定义域名，可为空
     * @param DomainName 内网ip的自定义域名，可为空
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
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
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);

    }
}

