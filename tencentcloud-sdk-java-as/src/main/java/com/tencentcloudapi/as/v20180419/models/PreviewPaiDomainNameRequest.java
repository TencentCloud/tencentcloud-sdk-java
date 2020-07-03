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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreviewPaiDomainNameRequest extends AbstractModel{

    /**
    * 域名类型
    */
    @SerializedName("DomainNameType")
    @Expose
    private String DomainNameType;

    /**
     * Get 域名类型 
     * @return DomainNameType 域名类型
     */
    public String getDomainNameType() {
        return this.DomainNameType;
    }

    /**
     * Set 域名类型
     * @param DomainNameType 域名类型
     */
    public void setDomainNameType(String DomainNameType) {
        this.DomainNameType = DomainNameType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainNameType", this.DomainNameType);

    }
}

