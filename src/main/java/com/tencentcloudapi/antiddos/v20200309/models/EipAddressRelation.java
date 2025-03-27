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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipAddressRelation extends AbstractModel {

    /**
    * 高防弹性公网IP绑定的实例地区，例如hk代表中国香港
    */
    @SerializedName("EipAddressRegion")
    @Expose
    private String EipAddressRegion;

    /**
    * 绑定的资源实例ID。可能是一个CVM。
    */
    @SerializedName("EipBoundRscIns")
    @Expose
    private String EipBoundRscIns;

    /**
    * 绑定的弹性网卡ID
    */
    @SerializedName("EipBoundRscEni")
    @Expose
    private String EipBoundRscEni;

    /**
    * 绑定的资源内网ip
    */
    @SerializedName("EipBoundRscVip")
    @Expose
    private String EipBoundRscVip;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 高防弹性公网IP绑定的实例地区，例如hk代表中国香港 
     * @return EipAddressRegion 高防弹性公网IP绑定的实例地区，例如hk代表中国香港
     */
    public String getEipAddressRegion() {
        return this.EipAddressRegion;
    }

    /**
     * Set 高防弹性公网IP绑定的实例地区，例如hk代表中国香港
     * @param EipAddressRegion 高防弹性公网IP绑定的实例地区，例如hk代表中国香港
     */
    public void setEipAddressRegion(String EipAddressRegion) {
        this.EipAddressRegion = EipAddressRegion;
    }

    /**
     * Get 绑定的资源实例ID。可能是一个CVM。 
     * @return EipBoundRscIns 绑定的资源实例ID。可能是一个CVM。
     */
    public String getEipBoundRscIns() {
        return this.EipBoundRscIns;
    }

    /**
     * Set 绑定的资源实例ID。可能是一个CVM。
     * @param EipBoundRscIns 绑定的资源实例ID。可能是一个CVM。
     */
    public void setEipBoundRscIns(String EipBoundRscIns) {
        this.EipBoundRscIns = EipBoundRscIns;
    }

    /**
     * Get 绑定的弹性网卡ID 
     * @return EipBoundRscEni 绑定的弹性网卡ID
     */
    public String getEipBoundRscEni() {
        return this.EipBoundRscEni;
    }

    /**
     * Set 绑定的弹性网卡ID
     * @param EipBoundRscEni 绑定的弹性网卡ID
     */
    public void setEipBoundRscEni(String EipBoundRscEni) {
        this.EipBoundRscEni = EipBoundRscEni;
    }

    /**
     * Get 绑定的资源内网ip 
     * @return EipBoundRscVip 绑定的资源内网ip
     */
    public String getEipBoundRscVip() {
        return this.EipBoundRscVip;
    }

    /**
     * Set 绑定的资源内网ip
     * @param EipBoundRscVip 绑定的资源内网ip
     */
    public void setEipBoundRscVip(String EipBoundRscVip) {
        this.EipBoundRscVip = EipBoundRscVip;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public EipAddressRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EipAddressRelation(EipAddressRelation source) {
        if (source.EipAddressRegion != null) {
            this.EipAddressRegion = new String(source.EipAddressRegion);
        }
        if (source.EipBoundRscIns != null) {
            this.EipBoundRscIns = new String(source.EipBoundRscIns);
        }
        if (source.EipBoundRscEni != null) {
            this.EipBoundRscEni = new String(source.EipBoundRscEni);
        }
        if (source.EipBoundRscVip != null) {
            this.EipBoundRscVip = new String(source.EipBoundRscVip);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EipAddressRegion", this.EipAddressRegion);
        this.setParamSimple(map, prefix + "EipBoundRscIns", this.EipBoundRscIns);
        this.setParamSimple(map, prefix + "EipBoundRscEni", this.EipBoundRscEni);
        this.setParamSimple(map, prefix + "EipBoundRscVip", this.EipBoundRscVip);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

