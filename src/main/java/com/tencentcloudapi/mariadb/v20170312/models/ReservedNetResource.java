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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedNetResource extends AbstractModel{

    /**
    * 私有网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VpcId,SubnetId下保留的内网ip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Vip下的端口
    */
    @SerializedName("Vports")
    @Expose
    private Long [] Vports;

    /**
    * vip的回收时间
    */
    @SerializedName("RecycleTime")
    @Expose
    private String RecycleTime;

    /**
     * Get 私有网络 
     * @return VpcId 私有网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络
     * @param VpcId 私有网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 
     * @return SubnetId 子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网
     * @param SubnetId 子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get VpcId,SubnetId下保留的内网ip 
     * @return Vip VpcId,SubnetId下保留的内网ip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VpcId,SubnetId下保留的内网ip
     * @param Vip VpcId,SubnetId下保留的内网ip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Vip下的端口 
     * @return Vports Vip下的端口
     */
    public Long [] getVports() {
        return this.Vports;
    }

    /**
     * Set Vip下的端口
     * @param Vports Vip下的端口
     */
    public void setVports(Long [] Vports) {
        this.Vports = Vports;
    }

    /**
     * Get vip的回收时间 
     * @return RecycleTime vip的回收时间
     */
    public String getRecycleTime() {
        return this.RecycleTime;
    }

    /**
     * Set vip的回收时间
     * @param RecycleTime vip的回收时间
     */
    public void setRecycleTime(String RecycleTime) {
        this.RecycleTime = RecycleTime;
    }

    public ReservedNetResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedNetResource(ReservedNetResource source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vports != null) {
            this.Vports = new Long[source.Vports.length];
            for (int i = 0; i < source.Vports.length; i++) {
                this.Vports[i] = new Long(source.Vports[i]);
            }
        }
        if (source.RecycleTime != null) {
            this.RecycleTime = new String(source.RecycleTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamArraySimple(map, prefix + "Vports.", this.Vports);
        this.setParamSimple(map, prefix + "RecycleTime", this.RecycleTime);

    }
}

