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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BanConfig extends AbstractModel{

    /**
    * ip白名单，支持ipv4、ipv6，支持CIDR
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * ip黑名单，支持ipv4、ipv6，支持CIDR
    */
    @SerializedName("IpBlackList")
    @Expose
    private String [] IpBlackList;

    /**
    * 地域白名单（国家英文名）
    */
    @SerializedName("CountryWhiteList")
    @Expose
    private String [] CountryWhiteList;

    /**
    * 地域黑名单（国家英文名）
    */
    @SerializedName("CountryBlackList")
    @Expose
    private String [] CountryBlackList;

    /**
     * Get ip白名单，支持ipv4、ipv6，支持CIDR 
     * @return IpWhiteList ip白名单，支持ipv4、ipv6，支持CIDR
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set ip白名单，支持ipv4、ipv6，支持CIDR
     * @param IpWhiteList ip白名单，支持ipv4、ipv6，支持CIDR
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
    }

    /**
     * Get ip黑名单，支持ipv4、ipv6，支持CIDR 
     * @return IpBlackList ip黑名单，支持ipv4、ipv6，支持CIDR
     */
    public String [] getIpBlackList() {
        return this.IpBlackList;
    }

    /**
     * Set ip黑名单，支持ipv4、ipv6，支持CIDR
     * @param IpBlackList ip黑名单，支持ipv4、ipv6，支持CIDR
     */
    public void setIpBlackList(String [] IpBlackList) {
        this.IpBlackList = IpBlackList;
    }

    /**
     * Get 地域白名单（国家英文名） 
     * @return CountryWhiteList 地域白名单（国家英文名）
     */
    public String [] getCountryWhiteList() {
        return this.CountryWhiteList;
    }

    /**
     * Set 地域白名单（国家英文名）
     * @param CountryWhiteList 地域白名单（国家英文名）
     */
    public void setCountryWhiteList(String [] CountryWhiteList) {
        this.CountryWhiteList = CountryWhiteList;
    }

    /**
     * Get 地域黑名单（国家英文名） 
     * @return CountryBlackList 地域黑名单（国家英文名）
     */
    public String [] getCountryBlackList() {
        return this.CountryBlackList;
    }

    /**
     * Set 地域黑名单（国家英文名）
     * @param CountryBlackList 地域黑名单（国家英文名）
     */
    public void setCountryBlackList(String [] CountryBlackList) {
        this.CountryBlackList = CountryBlackList;
    }

    public BanConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BanConfig(BanConfig source) {
        if (source.IpWhiteList != null) {
            this.IpWhiteList = new String[source.IpWhiteList.length];
            for (int i = 0; i < source.IpWhiteList.length; i++) {
                this.IpWhiteList[i] = new String(source.IpWhiteList[i]);
            }
        }
        if (source.IpBlackList != null) {
            this.IpBlackList = new String[source.IpBlackList.length];
            for (int i = 0; i < source.IpBlackList.length; i++) {
                this.IpBlackList[i] = new String(source.IpBlackList[i]);
            }
        }
        if (source.CountryWhiteList != null) {
            this.CountryWhiteList = new String[source.CountryWhiteList.length];
            for (int i = 0; i < source.CountryWhiteList.length; i++) {
                this.CountryWhiteList[i] = new String(source.CountryWhiteList[i]);
            }
        }
        if (source.CountryBlackList != null) {
            this.CountryBlackList = new String[source.CountryBlackList.length];
            for (int i = 0; i < source.CountryBlackList.length; i++) {
                this.CountryBlackList[i] = new String(source.CountryBlackList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IpWhiteList.", this.IpWhiteList);
        this.setParamArraySimple(map, prefix + "IpBlackList.", this.IpBlackList);
        this.setParamArraySimple(map, prefix + "CountryWhiteList.", this.CountryWhiteList);
        this.setParamArraySimple(map, prefix + "CountryBlackList.", this.CountryBlackList);

    }
}

