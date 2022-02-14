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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReleaseFileSignRequest extends AbstractModel{

    /**
    * 超时时间，不填默认是 5 分钟
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get 超时时间，不填默认是 5 分钟 
     * @return Timeout 超时时间，不填默认是 5 分钟
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间，不填默认是 5 分钟
     * @param Timeout 超时时间，不填默认是 5 分钟
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public DescribeReleaseFileSignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReleaseFileSignRequest(DescribeReleaseFileSignRequest source) {
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

