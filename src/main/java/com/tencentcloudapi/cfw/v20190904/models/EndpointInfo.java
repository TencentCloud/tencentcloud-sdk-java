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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndpointInfo extends AbstractModel {

    /**
    * 引流私有连接端点id
    */
    @SerializedName("EndpointId")
    @Expose
    private String EndpointId;

    /**
    * 引流VpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 引流Vpc的Cidr
    */
    @SerializedName("VpcCidr")
    @Expose
    private String VpcCidr;

    /**
     * Get 引流私有连接端点id 
     * @return EndpointId 引流私有连接端点id
     */
    public String getEndpointId() {
        return this.EndpointId;
    }

    /**
     * Set 引流私有连接端点id
     * @param EndpointId 引流私有连接端点id
     */
    public void setEndpointId(String EndpointId) {
        this.EndpointId = EndpointId;
    }

    /**
     * Get 引流VpcId 
     * @return VpcId 引流VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 引流VpcId
     * @param VpcId 引流VpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 所属地域 
     * @return Region 所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所属地域
     * @param Region 所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 引流Vpc的Cidr 
     * @return VpcCidr 引流Vpc的Cidr
     */
    public String getVpcCidr() {
        return this.VpcCidr;
    }

    /**
     * Set 引流Vpc的Cidr
     * @param VpcCidr 引流Vpc的Cidr
     */
    public void setVpcCidr(String VpcCidr) {
        this.VpcCidr = VpcCidr;
    }

    public EndpointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointInfo(EndpointInfo source) {
        if (source.EndpointId != null) {
            this.EndpointId = new String(source.EndpointId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcCidr != null) {
            this.VpcCidr = new String(source.VpcCidr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointId", this.EndpointId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcCidr", this.VpcCidr);

    }
}

