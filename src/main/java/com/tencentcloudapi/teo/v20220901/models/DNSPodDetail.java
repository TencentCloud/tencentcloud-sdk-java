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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DNSPodDetail extends AbstractModel {

    /**
    * 是否伪站点，取值有：
<li> 0：非伪站点；</li>
<li> 1：伪站点。</li>

    */
    @SerializedName("IsFake")
    @Expose
    private Long IsFake;

    /**
     * Get 是否伪站点，取值有：
<li> 0：非伪站点；</li>
<li> 1：伪站点。</li>
 
     * @return IsFake 是否伪站点，取值有：
<li> 0：非伪站点；</li>
<li> 1：伪站点。</li>

     */
    public Long getIsFake() {
        return this.IsFake;
    }

    /**
     * Set 是否伪站点，取值有：
<li> 0：非伪站点；</li>
<li> 1：伪站点。</li>

     * @param IsFake 是否伪站点，取值有：
<li> 0：非伪站点；</li>
<li> 1：伪站点。</li>

     */
    public void setIsFake(Long IsFake) {
        this.IsFake = IsFake;
    }

    public DNSPodDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DNSPodDetail(DNSPodDetail source) {
        if (source.IsFake != null) {
            this.IsFake = new Long(source.IsFake);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsFake", this.IsFake);

    }
}

