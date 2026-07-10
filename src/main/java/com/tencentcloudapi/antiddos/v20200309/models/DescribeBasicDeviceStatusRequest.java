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
    * <p>IP 资源列表</p>
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * <p>域名化资源传id</p>
    */
    @SerializedName("IdList")
    @Expose
    private String [] IdList;

    /**
    * <p>地域名称</p>
    */
    @SerializedName("FilterRegion")
    @Expose
    private Long FilterRegion;

    /**
    * <p>cnameWaf资源</p>
    */
    @SerializedName("CnameWafIdList")
    @Expose
    private String [] CnameWafIdList;

    /**
     * Get <p>IP 资源列表</p> 
     * @return IpList <p>IP 资源列表</p>
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set <p>IP 资源列表</p>
     * @param IpList <p>IP 资源列表</p>
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get <p>域名化资源传id</p> 
     * @return IdList <p>域名化资源传id</p>
     */
    public String [] getIdList() {
        return this.IdList;
    }

    /**
     * Set <p>域名化资源传id</p>
     * @param IdList <p>域名化资源传id</p>
     */
    public void setIdList(String [] IdList) {
        this.IdList = IdList;
    }

    /**
     * Get <p>地域名称</p> 
     * @return FilterRegion <p>地域名称</p>
     */
    public Long getFilterRegion() {
        return this.FilterRegion;
    }

    /**
     * Set <p>地域名称</p>
     * @param FilterRegion <p>地域名称</p>
     */
    public void setFilterRegion(Long FilterRegion) {
        this.FilterRegion = FilterRegion;
    }

    /**
     * Get <p>cnameWaf资源</p> 
     * @return CnameWafIdList <p>cnameWaf资源</p>
     */
    public String [] getCnameWafIdList() {
        return this.CnameWafIdList;
    }

    /**
     * Set <p>cnameWaf资源</p>
     * @param CnameWafIdList <p>cnameWaf资源</p>
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

