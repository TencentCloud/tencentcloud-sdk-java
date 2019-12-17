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

public class CreateIp6TranslatorsResponse extends AbstractModel{

    /**
    * 转换实例的唯一ID数组，形如"ip6-xxxxxxxx"
    */
    @SerializedName("Ip6TranslatorSet")
    @Expose
    private String [] Ip6TranslatorSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 转换实例的唯一ID数组，形如"ip6-xxxxxxxx" 
     * @return Ip6TranslatorSet 转换实例的唯一ID数组，形如"ip6-xxxxxxxx"
     */
    public String [] getIp6TranslatorSet() {
        return this.Ip6TranslatorSet;
    }

    /**
     * Set 转换实例的唯一ID数组，形如"ip6-xxxxxxxx"
     * @param Ip6TranslatorSet 转换实例的唯一ID数组，形如"ip6-xxxxxxxx"
     */
    public void setIp6TranslatorSet(String [] Ip6TranslatorSet) {
        this.Ip6TranslatorSet = Ip6TranslatorSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ip6TranslatorSet.", this.Ip6TranslatorSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

