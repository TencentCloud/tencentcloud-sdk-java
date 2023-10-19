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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMaliciousRequestWhiteListRequest extends AbstractModel {

    /**
    * 白名单域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 备注
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
     * Get 白名单域名 
     * @return Domain 白名单域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 白名单域名
     * @param Domain 白名单域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 备注 
     * @return Mark 备注
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set 备注
     * @param Mark 备注
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    public CreateMaliciousRequestWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMaliciousRequestWhiteListRequest(CreateMaliciousRequestWhiteListRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Mark != null) {
            this.Mark = new String(source.Mark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Mark", this.Mark);

    }
}

