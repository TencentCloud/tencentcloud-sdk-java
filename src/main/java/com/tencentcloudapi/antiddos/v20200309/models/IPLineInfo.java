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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPLineInfo extends AbstractModel{

    /**
    * IP线路类型，取值[
"bgp"：BGP线路IP
"ctcc"：电信线路IP
"cucc"：联通线路IP
"cmcc"：移动线路IP
"abroad"：境外线路IP
]
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 线路IP
    */
    @SerializedName("Eip")
    @Expose
    private String Eip;

    /**
     * Get IP线路类型，取值[
"bgp"：BGP线路IP
"ctcc"：电信线路IP
"cucc"：联通线路IP
"cmcc"：移动线路IP
"abroad"：境外线路IP
] 
     * @return Type IP线路类型，取值[
"bgp"：BGP线路IP
"ctcc"：电信线路IP
"cucc"：联通线路IP
"cmcc"：移动线路IP
"abroad"：境外线路IP
]
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set IP线路类型，取值[
"bgp"：BGP线路IP
"ctcc"：电信线路IP
"cucc"：联通线路IP
"cmcc"：移动线路IP
"abroad"：境外线路IP
]
     * @param Type IP线路类型，取值[
"bgp"：BGP线路IP
"ctcc"：电信线路IP
"cucc"：联通线路IP
"cmcc"：移动线路IP
"abroad"：境外线路IP
]
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 线路IP 
     * @return Eip 线路IP
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * Set 线路IP
     * @param Eip 线路IP
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    public IPLineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPLineInfo(IPLineInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Eip != null) {
            this.Eip = new String(source.Eip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Eip", this.Eip);

    }
}

