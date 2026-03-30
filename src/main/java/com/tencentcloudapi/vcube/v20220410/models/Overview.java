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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Overview extends AbstractModel {

    /**
    * 过期license数量
    */
    @SerializedName("Expired")
    @Expose
    private Long Expired;

    /**
    * 有效license数量
    */
    @SerializedName("Valid")
    @Expose
    private Long Valid;

    /**
    * 临期license数量
    */
    @SerializedName("Near")
    @Expose
    private Long Near;

    /**
     * Get 过期license数量 
     * @return Expired 过期license数量
     */
    public Long getExpired() {
        return this.Expired;
    }

    /**
     * Set 过期license数量
     * @param Expired 过期license数量
     */
    public void setExpired(Long Expired) {
        this.Expired = Expired;
    }

    /**
     * Get 有效license数量 
     * @return Valid 有效license数量
     */
    public Long getValid() {
        return this.Valid;
    }

    /**
     * Set 有效license数量
     * @param Valid 有效license数量
     */
    public void setValid(Long Valid) {
        this.Valid = Valid;
    }

    /**
     * Get 临期license数量 
     * @return Near 临期license数量
     */
    public Long getNear() {
        return this.Near;
    }

    /**
     * Set 临期license数量
     * @param Near 临期license数量
     */
    public void setNear(Long Near) {
        this.Near = Near;
    }

    public Overview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Overview(Overview source) {
        if (source.Expired != null) {
            this.Expired = new Long(source.Expired);
        }
        if (source.Valid != null) {
            this.Valid = new Long(source.Valid);
        }
        if (source.Near != null) {
            this.Near = new Long(source.Near);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Expired", this.Expired);
        this.setParamSimple(map, prefix + "Valid", this.Valid);
        this.setParamSimple(map, prefix + "Near", this.Near);

    }
}

