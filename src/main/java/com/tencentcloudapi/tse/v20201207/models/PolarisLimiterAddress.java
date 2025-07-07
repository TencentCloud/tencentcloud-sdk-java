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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolarisLimiterAddress extends AbstractModel {

    /**
    * VPC接入IP列表
    */
    @SerializedName("IntranetAddress")
    @Expose
    private String IntranetAddress;

    /**
     * Get VPC接入IP列表 
     * @return IntranetAddress VPC接入IP列表
     */
    public String getIntranetAddress() {
        return this.IntranetAddress;
    }

    /**
     * Set VPC接入IP列表
     * @param IntranetAddress VPC接入IP列表
     */
    public void setIntranetAddress(String IntranetAddress) {
        this.IntranetAddress = IntranetAddress;
    }

    public PolarisLimiterAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolarisLimiterAddress(PolarisLimiterAddress source) {
        if (source.IntranetAddress != null) {
            this.IntranetAddress = new String(source.IntranetAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntranetAddress", this.IntranetAddress);

    }
}

