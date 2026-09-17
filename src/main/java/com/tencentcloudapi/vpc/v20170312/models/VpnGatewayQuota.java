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

public class VpnGatewayQuota extends AbstractModel {

    /**
    * <p>带宽配额，单位：Mbps。</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>配额中文名称</p>
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * <p>配额英文名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>SSL 连接数可选配额</p>
    */
    @SerializedName("MaxConnection")
    @Expose
    private Long [] MaxConnection;

    /**
     * Get <p>带宽配额，单位：Mbps。</p> 
     * @return Bandwidth <p>带宽配额，单位：Mbps。</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>带宽配额，单位：Mbps。</p>
     * @param Bandwidth <p>带宽配额，单位：Mbps。</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>配额中文名称</p> 
     * @return Cname <p>配额中文名称</p>
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set <p>配额中文名称</p>
     * @param Cname <p>配额中文名称</p>
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get <p>配额英文名称</p> 
     * @return Name <p>配额英文名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>配额英文名称</p>
     * @param Name <p>配额英文名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>SSL 连接数可选配额</p> 
     * @return MaxConnection <p>SSL 连接数可选配额</p>
     */
    public Long [] getMaxConnection() {
        return this.MaxConnection;
    }

    /**
     * Set <p>SSL 连接数可选配额</p>
     * @param MaxConnection <p>SSL 连接数可选配额</p>
     */
    public void setMaxConnection(Long [] MaxConnection) {
        this.MaxConnection = MaxConnection;
    }

    public VpnGatewayQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpnGatewayQuota(VpnGatewayQuota source) {
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MaxConnection != null) {
            this.MaxConnection = new Long[source.MaxConnection.length];
            for (int i = 0; i < source.MaxConnection.length; i++) {
                this.MaxConnection[i] = new Long(source.MaxConnection[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MaxConnection.", this.MaxConnection);

    }
}

