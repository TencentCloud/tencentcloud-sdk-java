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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SrcAddressInfo extends AbstractModel{

    /**
    * 内网Ip4地址
    */
    @SerializedName("SrcIpv4")
    @Expose
    private String SrcIpv4;

    /**
    * 公网Ip4地址
    */
    @SerializedName("SrcPublicIpv4")
    @Expose
    private String SrcPublicIpv4;

    /**
     * Get 内网Ip4地址 
     * @return SrcIpv4 内网Ip4地址
     */
    public String getSrcIpv4() {
        return this.SrcIpv4;
    }

    /**
     * Set 内网Ip4地址
     * @param SrcIpv4 内网Ip4地址
     */
    public void setSrcIpv4(String SrcIpv4) {
        this.SrcIpv4 = SrcIpv4;
    }

    /**
     * Get 公网Ip4地址 
     * @return SrcPublicIpv4 公网Ip4地址
     */
    public String getSrcPublicIpv4() {
        return this.SrcPublicIpv4;
    }

    /**
     * Set 公网Ip4地址
     * @param SrcPublicIpv4 公网Ip4地址
     */
    public void setSrcPublicIpv4(String SrcPublicIpv4) {
        this.SrcPublicIpv4 = SrcPublicIpv4;
    }

    public SrcAddressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SrcAddressInfo(SrcAddressInfo source) {
        if (source.SrcIpv4 != null) {
            this.SrcIpv4 = new String(source.SrcIpv4);
        }
        if (source.SrcPublicIpv4 != null) {
            this.SrcPublicIpv4 = new String(source.SrcPublicIpv4);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcIpv4", this.SrcIpv4);
        this.setParamSimple(map, prefix + "SrcPublicIpv4", this.SrcPublicIpv4);

    }
}

