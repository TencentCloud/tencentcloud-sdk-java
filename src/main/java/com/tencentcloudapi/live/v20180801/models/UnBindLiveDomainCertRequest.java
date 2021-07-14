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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnBindLiveDomainCertRequest extends AbstractModel{

    /**
    * 播放域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 枚举值：
gray: 解绑灰度规则
formal(默认): 解绑正式规则

不传则为formal
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 播放域名。 
     * @return DomainName 播放域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 播放域名。
     * @param DomainName 播放域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 枚举值：
gray: 解绑灰度规则
formal(默认): 解绑正式规则

不传则为formal 
     * @return Type 枚举值：
gray: 解绑灰度规则
formal(默认): 解绑正式规则

不传则为formal
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 枚举值：
gray: 解绑灰度规则
formal(默认): 解绑正式规则

不传则为formal
     * @param Type 枚举值：
gray: 解绑灰度规则
formal(默认): 解绑正式规则

不传则为formal
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public UnBindLiveDomainCertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnBindLiveDomainCertRequest(UnBindLiveDomainCertRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

