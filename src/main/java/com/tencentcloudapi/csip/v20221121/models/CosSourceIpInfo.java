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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosSourceIpInfo extends AbstractModel {

    /**
    * 调用UA
    */
    @SerializedName("UA")
    @Expose
    private String [] UA;

    /**
    * 调用vpc信息
    */
    @SerializedName("VpcInfo")
    @Expose
    private CosInvokeIpVpcInfo VpcInfo;

    /**
     * Get 调用UA 
     * @return UA 调用UA
     */
    public String [] getUA() {
        return this.UA;
    }

    /**
     * Set 调用UA
     * @param UA 调用UA
     */
    public void setUA(String [] UA) {
        this.UA = UA;
    }

    /**
     * Get 调用vpc信息 
     * @return VpcInfo 调用vpc信息
     */
    public CosInvokeIpVpcInfo getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set 调用vpc信息
     * @param VpcInfo 调用vpc信息
     */
    public void setVpcInfo(CosInvokeIpVpcInfo VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    public CosSourceIpInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosSourceIpInfo(CosSourceIpInfo source) {
        if (source.UA != null) {
            this.UA = new String[source.UA.length];
            for (int i = 0; i < source.UA.length; i++) {
                this.UA[i] = new String(source.UA[i]);
            }
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new CosInvokeIpVpcInfo(source.VpcInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UA.", this.UA);
        this.setParamObj(map, prefix + "VpcInfo.", this.VpcInfo);

    }
}

