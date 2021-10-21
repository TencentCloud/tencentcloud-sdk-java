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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInternalEndpointDnsRequest extends AbstractModel{

    /**
    * tcr实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 私有网络id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * tcr内网访问链路ip
    */
    @SerializedName("EniLBIp")
    @Expose
    private String EniLBIp;

    /**
    * true：为默认域名，公网域名一致
false: 使用vpc域名
默认为vpc域名
    */
    @SerializedName("UsePublicDomain")
    @Expose
    private Boolean UsePublicDomain;

    /**
    * 解析地域，需要保证和vpc处于同一地域，如果不填则默认为主实例地域
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
     * Get tcr实例id 
     * @return InstanceId tcr实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tcr实例id
     * @param InstanceId tcr实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 私有网络id 
     * @return VpcId 私有网络id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络id
     * @param VpcId 私有网络id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get tcr内网访问链路ip 
     * @return EniLBIp tcr内网访问链路ip
     */
    public String getEniLBIp() {
        return this.EniLBIp;
    }

    /**
     * Set tcr内网访问链路ip
     * @param EniLBIp tcr内网访问链路ip
     */
    public void setEniLBIp(String EniLBIp) {
        this.EniLBIp = EniLBIp;
    }

    /**
     * Get true：为默认域名，公网域名一致
false: 使用vpc域名
默认为vpc域名 
     * @return UsePublicDomain true：为默认域名，公网域名一致
false: 使用vpc域名
默认为vpc域名
     */
    public Boolean getUsePublicDomain() {
        return this.UsePublicDomain;
    }

    /**
     * Set true：为默认域名，公网域名一致
false: 使用vpc域名
默认为vpc域名
     * @param UsePublicDomain true：为默认域名，公网域名一致
false: 使用vpc域名
默认为vpc域名
     */
    public void setUsePublicDomain(Boolean UsePublicDomain) {
        this.UsePublicDomain = UsePublicDomain;
    }

    /**
     * Get 解析地域，需要保证和vpc处于同一地域，如果不填则默认为主实例地域 
     * @return RegionName 解析地域，需要保证和vpc处于同一地域，如果不填则默认为主实例地域
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 解析地域，需要保证和vpc处于同一地域，如果不填则默认为主实例地域
     * @param RegionName 解析地域，需要保证和vpc处于同一地域，如果不填则默认为主实例地域
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    public CreateInternalEndpointDnsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInternalEndpointDnsRequest(CreateInternalEndpointDnsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.EniLBIp != null) {
            this.EniLBIp = new String(source.EniLBIp);
        }
        if (source.UsePublicDomain != null) {
            this.UsePublicDomain = new Boolean(source.UsePublicDomain);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "EniLBIp", this.EniLBIp);
        this.setParamSimple(map, prefix + "UsePublicDomain", this.UsePublicDomain);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);

    }
}

