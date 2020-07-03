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

public class DescribeIp6TranslatorQuotaRequest extends AbstractModel{

    /**
    * 待查询IPV6转换实例的唯一ID列表，形如ip6-xxxxxxxx
    */
    @SerializedName("Ip6TranslatorIds")
    @Expose
    private String [] Ip6TranslatorIds;

    /**
     * Get 待查询IPV6转换实例的唯一ID列表，形如ip6-xxxxxxxx 
     * @return Ip6TranslatorIds 待查询IPV6转换实例的唯一ID列表，形如ip6-xxxxxxxx
     */
    public String [] getIp6TranslatorIds() {
        return this.Ip6TranslatorIds;
    }

    /**
     * Set 待查询IPV6转换实例的唯一ID列表，形如ip6-xxxxxxxx
     * @param Ip6TranslatorIds 待查询IPV6转换实例的唯一ID列表，形如ip6-xxxxxxxx
     */
    public void setIp6TranslatorIds(String [] Ip6TranslatorIds) {
        this.Ip6TranslatorIds = Ip6TranslatorIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ip6TranslatorIds.", this.Ip6TranslatorIds);

    }
}

