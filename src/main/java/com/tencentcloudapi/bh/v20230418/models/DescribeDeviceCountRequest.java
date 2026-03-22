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

public class DescribeDeviceCountRequest extends AbstractModel {

    /**
    * 地域码
    */
    @SerializedName("ApCode")
    @Expose
    private String ApCode;

    /**
    * 用户VPC实例ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 堡垒机服务ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资产类型,1-Linux, 2-Windows,3-MySQL,4-SqlServer 不传-全部
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * 是否绑定服务,1-已绑定, 2-未绑定， 不传-全部
    */
    @SerializedName("BindResource")
    @Expose
    private Long BindResource;

    /**
     * Get 地域码 
     * @return ApCode 地域码
     */
    public String getApCode() {
        return this.ApCode;
    }

    /**
     * Set 地域码
     * @param ApCode 地域码
     */
    public void setApCode(String ApCode) {
        this.ApCode = ApCode;
    }

    /**
     * Get 用户VPC实例ID 
     * @return VpcId 用户VPC实例ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 用户VPC实例ID
     * @param VpcId 用户VPC实例ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 堡垒机服务ID 
     * @return ResourceId 堡垒机服务ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 堡垒机服务ID
     * @param ResourceId 堡垒机服务ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资产类型,1-Linux, 2-Windows,3-MySQL,4-SqlServer 不传-全部 
     * @return Kind 资产类型,1-Linux, 2-Windows,3-MySQL,4-SqlServer 不传-全部
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set 资产类型,1-Linux, 2-Windows,3-MySQL,4-SqlServer 不传-全部
     * @param Kind 资产类型,1-Linux, 2-Windows,3-MySQL,4-SqlServer 不传-全部
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 是否绑定服务,1-已绑定, 2-未绑定， 不传-全部 
     * @return BindResource 是否绑定服务,1-已绑定, 2-未绑定， 不传-全部
     */
    public Long getBindResource() {
        return this.BindResource;
    }

    /**
     * Set 是否绑定服务,1-已绑定, 2-未绑定， 不传-全部
     * @param BindResource 是否绑定服务,1-已绑定, 2-未绑定， 不传-全部
     */
    public void setBindResource(Long BindResource) {
        this.BindResource = BindResource;
    }

    public DescribeDeviceCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceCountRequest(DescribeDeviceCountRequest source) {
        if (source.ApCode != null) {
            this.ApCode = new String(source.ApCode);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
        if (source.BindResource != null) {
            this.BindResource = new Long(source.BindResource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApCode", this.ApCode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "BindResource", this.BindResource);

    }
}

