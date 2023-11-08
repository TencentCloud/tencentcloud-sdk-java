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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindSharedCNAMEMap extends AbstractModel {

    /**
    * 需要绑定或解绑的共享 CNAME。
    */
    @SerializedName("SharedCNAME")
    @Expose
    private String SharedCNAME;

    /**
    * 加速域名，可传递多个，最多20个。
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
     * Get 需要绑定或解绑的共享 CNAME。 
     * @return SharedCNAME 需要绑定或解绑的共享 CNAME。
     */
    public String getSharedCNAME() {
        return this.SharedCNAME;
    }

    /**
     * Set 需要绑定或解绑的共享 CNAME。
     * @param SharedCNAME 需要绑定或解绑的共享 CNAME。
     */
    public void setSharedCNAME(String SharedCNAME) {
        this.SharedCNAME = SharedCNAME;
    }

    /**
     * Get 加速域名，可传递多个，最多20个。 
     * @return DomainNames 加速域名，可传递多个，最多20个。
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set 加速域名，可传递多个，最多20个。
     * @param DomainNames 加速域名，可传递多个，最多20个。
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    public BindSharedCNAMEMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindSharedCNAMEMap(BindSharedCNAMEMap source) {
        if (source.SharedCNAME != null) {
            this.SharedCNAME = new String(source.SharedCNAME);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String[source.DomainNames.length];
            for (int i = 0; i < source.DomainNames.length; i++) {
                this.DomainNames[i] = new String(source.DomainNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SharedCNAME", this.SharedCNAME);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);

    }
}

