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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIp6TranslatorRequest extends AbstractModel{

    /**
    * IPV6转换实例唯一ID，形如ip6-xxxxxxxxx
    */
    @SerializedName("Ip6TranslatorId")
    @Expose
    private String Ip6TranslatorId;

    /**
    * IPV6转换实例修改名称
    */
    @SerializedName("Ip6TranslatorName")
    @Expose
    private String Ip6TranslatorName;

    /**
     * Get IPV6转换实例唯一ID，形如ip6-xxxxxxxxx 
     * @return Ip6TranslatorId IPV6转换实例唯一ID，形如ip6-xxxxxxxxx
     */
    public String getIp6TranslatorId() {
        return this.Ip6TranslatorId;
    }

    /**
     * Set IPV6转换实例唯一ID，形如ip6-xxxxxxxxx
     * @param Ip6TranslatorId IPV6转换实例唯一ID，形如ip6-xxxxxxxxx
     */
    public void setIp6TranslatorId(String Ip6TranslatorId) {
        this.Ip6TranslatorId = Ip6TranslatorId;
    }

    /**
     * Get IPV6转换实例修改名称 
     * @return Ip6TranslatorName IPV6转换实例修改名称
     */
    public String getIp6TranslatorName() {
        return this.Ip6TranslatorName;
    }

    /**
     * Set IPV6转换实例修改名称
     * @param Ip6TranslatorName IPV6转换实例修改名称
     */
    public void setIp6TranslatorName(String Ip6TranslatorName) {
        this.Ip6TranslatorName = Ip6TranslatorName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip6TranslatorId", this.Ip6TranslatorId);
        this.setParamSimple(map, prefix + "Ip6TranslatorName", this.Ip6TranslatorName);

    }
}

