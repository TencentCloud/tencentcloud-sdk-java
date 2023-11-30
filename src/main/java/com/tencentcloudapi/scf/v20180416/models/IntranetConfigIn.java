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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntranetConfigIn extends AbstractModel {

    /**
    * 是否开启固定内网IP
ENABLE 为开启
DISABLE 为不开启

    */
    @SerializedName("IpFixed")
    @Expose
    private String IpFixed;

    /**
     * Get 是否开启固定内网IP
ENABLE 为开启
DISABLE 为不开启
 
     * @return IpFixed 是否开启固定内网IP
ENABLE 为开启
DISABLE 为不开启

     */
    public String getIpFixed() {
        return this.IpFixed;
    }

    /**
     * Set 是否开启固定内网IP
ENABLE 为开启
DISABLE 为不开启

     * @param IpFixed 是否开启固定内网IP
ENABLE 为开启
DISABLE 为不开启

     */
    public void setIpFixed(String IpFixed) {
        this.IpFixed = IpFixed;
    }

    public IntranetConfigIn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntranetConfigIn(IntranetConfigIn source) {
        if (source.IpFixed != null) {
            this.IpFixed = new String(source.IpFixed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpFixed", this.IpFixed);

    }
}

