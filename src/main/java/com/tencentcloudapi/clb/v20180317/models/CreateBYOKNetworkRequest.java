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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBYOKNetworkRequest extends AbstractModel {

    /**
    * <p>子网 ID</p><p>参数格式：subnet-xxxxxxxx</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>VPC 实例 ID</p><p>参数格式：vpc-xxxxxxxx</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>BYOK 的自定义名字</p><p>入参限制：1～256个字符，可选</p>
    */
    @SerializedName("ServiceProviderName")
    @Expose
    private String ServiceProviderName;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get <p>子网 ID</p><p>参数格式：subnet-xxxxxxxx</p> 
     * @return SubnetId <p>子网 ID</p><p>参数格式：subnet-xxxxxxxx</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID</p><p>参数格式：subnet-xxxxxxxx</p>
     * @param SubnetId <p>子网 ID</p><p>参数格式：subnet-xxxxxxxx</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>VPC 实例 ID</p><p>参数格式：vpc-xxxxxxxx</p> 
     * @return VpcId <p>VPC 实例 ID</p><p>参数格式：vpc-xxxxxxxx</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC 实例 ID</p><p>参数格式：vpc-xxxxxxxx</p>
     * @param VpcId <p>VPC 实例 ID</p><p>参数格式：vpc-xxxxxxxx</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>BYOK 的自定义名字</p><p>入参限制：1～256个字符，可选</p> 
     * @return ServiceProviderName <p>BYOK 的自定义名字</p><p>入参限制：1～256个字符，可选</p>
     */
    public String getServiceProviderName() {
        return this.ServiceProviderName;
    }

    /**
     * Set <p>BYOK 的自定义名字</p><p>入参限制：1～256个字符，可选</p>
     * @param ServiceProviderName <p>BYOK 的自定义名字</p><p>入参限制：1～256个字符，可选</p>
     */
    public void setServiceProviderName(String ServiceProviderName) {
        this.ServiceProviderName = ServiceProviderName;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public CreateBYOKNetworkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBYOKNetworkRequest(CreateBYOKNetworkRequest source) {
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ServiceProviderName != null) {
            this.ServiceProviderName = new String(source.ServiceProviderName);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ServiceProviderName", this.ServiceProviderName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

