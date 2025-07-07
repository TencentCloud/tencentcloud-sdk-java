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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlgType extends AbstractModel {

    /**
    * Ftp协议Alg功能是否开启，可选值：
<li>true：开启Ftp协议Alg功能</li>
<li>false：不开启Ftp协议Alg功能</li>
    */
    @SerializedName("Ftp")
    @Expose
    private Boolean Ftp;

    /**
    * Sip协议Alg功能是否开启，可选值：
<li>true：开启Sip协议Alg功能</li>
<li>false：不开启Sip协议Alg功能</li>
    */
    @SerializedName("Sip")
    @Expose
    private Boolean Sip;

    /**
     * Get Ftp协议Alg功能是否开启，可选值：
<li>true：开启Ftp协议Alg功能</li>
<li>false：不开启Ftp协议Alg功能</li> 
     * @return Ftp Ftp协议Alg功能是否开启，可选值：
<li>true：开启Ftp协议Alg功能</li>
<li>false：不开启Ftp协议Alg功能</li>
     */
    public Boolean getFtp() {
        return this.Ftp;
    }

    /**
     * Set Ftp协议Alg功能是否开启，可选值：
<li>true：开启Ftp协议Alg功能</li>
<li>false：不开启Ftp协议Alg功能</li>
     * @param Ftp Ftp协议Alg功能是否开启，可选值：
<li>true：开启Ftp协议Alg功能</li>
<li>false：不开启Ftp协议Alg功能</li>
     */
    public void setFtp(Boolean Ftp) {
        this.Ftp = Ftp;
    }

    /**
     * Get Sip协议Alg功能是否开启，可选值：
<li>true：开启Sip协议Alg功能</li>
<li>false：不开启Sip协议Alg功能</li> 
     * @return Sip Sip协议Alg功能是否开启，可选值：
<li>true：开启Sip协议Alg功能</li>
<li>false：不开启Sip协议Alg功能</li>
     */
    public Boolean getSip() {
        return this.Sip;
    }

    /**
     * Set Sip协议Alg功能是否开启，可选值：
<li>true：开启Sip协议Alg功能</li>
<li>false：不开启Sip协议Alg功能</li>
     * @param Sip Sip协议Alg功能是否开启，可选值：
<li>true：开启Sip协议Alg功能</li>
<li>false：不开启Sip协议Alg功能</li>
     */
    public void setSip(Boolean Sip) {
        this.Sip = Sip;
    }

    public AlgType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlgType(AlgType source) {
        if (source.Ftp != null) {
            this.Ftp = new Boolean(source.Ftp);
        }
        if (source.Sip != null) {
            this.Sip = new Boolean(source.Sip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ftp", this.Ftp);
        this.setParamSimple(map, prefix + "Sip", this.Sip);

    }
}

