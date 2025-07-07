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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIPProductInfoRequest extends AbstractModel {

    /**
    * 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * IP列表
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * Get 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包） 
     * @return Business 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包）
     * @param Business 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get IP列表 
     * @return IpList IP列表
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set IP列表
     * @param IpList IP列表
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    public DescribeIPProductInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIPProductInfoRequest(DescribeIPProductInfoRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

