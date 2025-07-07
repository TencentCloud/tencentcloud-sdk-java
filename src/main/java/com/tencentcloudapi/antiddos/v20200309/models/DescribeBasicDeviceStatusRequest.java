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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBasicDeviceStatusRequest extends AbstractModel {

    /**
    * IP 资源列表
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * 域名化资源传id
    */
    @SerializedName("IdList")
    @Expose
    private String [] IdList;

    /**
    * 地域名称
    */
    @SerializedName("FilterRegion")
    @Expose
    private Long FilterRegion;

    /**
    * cnameWaf资源
    */
    @SerializedName("CnameWafIdList")
    @Expose
    private String [] CnameWafIdList;

    /**
     * Get IP 资源列表 
     * @return IpList IP 资源列表
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set IP 资源列表
     * @param IpList IP 资源列表
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get 域名化资源传id 
     * @return IdList 域名化资源传id
     */
    public String [] getIdList() {
        return this.IdList;
    }

    /**
     * Set 域名化资源传id
     * @param IdList 域名化资源传id
     */
    public void setIdList(String [] IdList) {
        this.IdList = IdList;
    }

    /**
     * Get 地域名称 
     * @return FilterRegion 地域名称
     */
    public Long getFilterRegion() {
        return this.FilterRegion;
    }

    /**
     * Set 地域名称
     * @param FilterRegion 地域名称
     */
    public void setFilterRegion(Long FilterRegion) {
        this.FilterRegion = FilterRegion;
    }

    /**
     * Get cnameWaf资源 
     * @return CnameWafIdList cnameWaf资源
     */
    public String [] getCnameWafIdList() {
        return this.CnameWafIdList;
    }

    /**
     * Set cnameWaf资源
     * @param CnameWafIdList cnameWaf资源
     */
    public void setCnameWafIdList(String [] CnameWafIdList) {
        this.CnameWafIdList = CnameWafIdList;
    }

    public DescribeBasicDeviceStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBasicDeviceStatusRequest(DescribeBasicDeviceStatusRequest source) {
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.IdList != null) {
            this.IdList = new String[source.IdList.length];
            for (int i = 0; i < source.IdList.length; i++) {
                this.IdList[i] = new String(source.IdList[i]);
            }
        }
        if (source.FilterRegion != null) {
            this.FilterRegion = new Long(source.FilterRegion);
        }
        if (source.CnameWafIdList != null) {
            this.CnameWafIdList = new String[source.CnameWafIdList.length];
            for (int i = 0; i < source.CnameWafIdList.length; i++) {
                this.CnameWafIdList[i] = new String(source.CnameWafIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);
        this.setParamSimple(map, prefix + "FilterRegion", this.FilterRegion);
        this.setParamArraySimple(map, prefix + "CnameWafIdList.", this.CnameWafIdList);

    }
}

