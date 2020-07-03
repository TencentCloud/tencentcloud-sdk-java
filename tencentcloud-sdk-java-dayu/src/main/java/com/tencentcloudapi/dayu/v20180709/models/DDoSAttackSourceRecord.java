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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSAttackSourceRecord extends AbstractModel{

    /**
    * 攻击源ip
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 省份（国内有效，不包含港澳台）
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 国家
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * 累计攻击包量
    */
    @SerializedName("PacketSum")
    @Expose
    private Long PacketSum;

    /**
    * 累计攻击流量
    */
    @SerializedName("PacketLen")
    @Expose
    private Long PacketLen;

    /**
     * Get 攻击源ip 
     * @return SrcIp 攻击源ip
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 攻击源ip
     * @param SrcIp 攻击源ip
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 省份（国内有效，不包含港澳台） 
     * @return Province 省份（国内有效，不包含港澳台）
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份（国内有效，不包含港澳台）
     * @param Province 省份（国内有效，不包含港澳台）
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 国家 
     * @return Nation 国家
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set 国家
     * @param Nation 国家
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get 累计攻击包量 
     * @return PacketSum 累计攻击包量
     */
    public Long getPacketSum() {
        return this.PacketSum;
    }

    /**
     * Set 累计攻击包量
     * @param PacketSum 累计攻击包量
     */
    public void setPacketSum(Long PacketSum) {
        this.PacketSum = PacketSum;
    }

    /**
     * Get 累计攻击流量 
     * @return PacketLen 累计攻击流量
     */
    public Long getPacketLen() {
        return this.PacketLen;
    }

    /**
     * Set 累计攻击流量
     * @param PacketLen 累计攻击流量
     */
    public void setPacketLen(Long PacketLen) {
        this.PacketLen = PacketLen;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "PacketSum", this.PacketSum);
        this.setParamSimple(map, prefix + "PacketLen", this.PacketLen);

    }
}

