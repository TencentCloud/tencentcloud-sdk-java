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

public class CidrForCcn extends AbstractModel {

    /**
    * local cidr值。
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
    * 是否发布到了云联网。
    */
    @SerializedName("PublishedToVbc")
    @Expose
    private Boolean PublishedToVbc;

    /**
     * Get local cidr值。 
     * @return Cidr local cidr值。
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set local cidr值。
     * @param Cidr local cidr值。
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    /**
     * Get 是否发布到了云联网。 
     * @return PublishedToVbc 是否发布到了云联网。
     */
    public Boolean getPublishedToVbc() {
        return this.PublishedToVbc;
    }

    /**
     * Set 是否发布到了云联网。
     * @param PublishedToVbc 是否发布到了云联网。
     */
    public void setPublishedToVbc(Boolean PublishedToVbc) {
        this.PublishedToVbc = PublishedToVbc;
    }

    public CidrForCcn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CidrForCcn(CidrForCcn source) {
        if (source.Cidr != null) {
            this.Cidr = new String(source.Cidr);
        }
        if (source.PublishedToVbc != null) {
            this.PublishedToVbc = new Boolean(source.PublishedToVbc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);
        this.setParamSimple(map, prefix + "PublishedToVbc", this.PublishedToVbc);

    }
}

