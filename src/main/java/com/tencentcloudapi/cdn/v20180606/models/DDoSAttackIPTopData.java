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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSAttackIPTopData extends AbstractModel{

    /**
    * 攻击ip
    */
    @SerializedName("AttackIP")
    @Expose
    private String AttackIP;

    /**
    * 攻击ip所在省份
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 攻击ip所在国家
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 红果电信
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 攻击次数
    */
    @SerializedName("AttackCount")
    @Expose
    private Float AttackCount;

    /**
     * Get 攻击ip 
     * @return AttackIP 攻击ip
     */
    public String getAttackIP() {
        return this.AttackIP;
    }

    /**
     * Set 攻击ip
     * @param AttackIP 攻击ip
     */
    public void setAttackIP(String AttackIP) {
        this.AttackIP = AttackIP;
    }

    /**
     * Get 攻击ip所在省份 
     * @return Province 攻击ip所在省份
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 攻击ip所在省份
     * @param Province 攻击ip所在省份
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 攻击ip所在国家 
     * @return Country 攻击ip所在国家
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 攻击ip所在国家
     * @param Country 攻击ip所在国家
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 红果电信 
     * @return Isp 红果电信
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 红果电信
     * @param Isp 红果电信
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 攻击次数 
     * @return AttackCount 攻击次数
     */
    public Float getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set 攻击次数
     * @param AttackCount 攻击次数
     */
    public void setAttackCount(Float AttackCount) {
        this.AttackCount = AttackCount;
    }

    public DDoSAttackIPTopData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAttackIPTopData(DDoSAttackIPTopData source) {
        if (source.AttackIP != null) {
            this.AttackIP = new String(source.AttackIP);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.AttackCount != null) {
            this.AttackCount = new Float(source.AttackCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackIP", this.AttackIP);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "AttackCount", this.AttackCount);

    }
}

