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
package com.tencentcloudapi.tics.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainInfoRequest extends AbstractModel {

    /**
    * 要查询的域名
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 附加字段，是否返回上下文。当为0时不返回上下文，当为1时返回上下文。
    */
    @SerializedName("Option")
    @Expose
    private Long Option;

    /**
     * Get 要查询的域名 
     * @return Key 要查询的域名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 要查询的域名
     * @param Key 要查询的域名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 附加字段，是否返回上下文。当为0时不返回上下文，当为1时返回上下文。 
     * @return Option 附加字段，是否返回上下文。当为0时不返回上下文，当为1时返回上下文。
     */
    public Long getOption() {
        return this.Option;
    }

    /**
     * Set 附加字段，是否返回上下文。当为0时不返回上下文，当为1时返回上下文。
     * @param Option 附加字段，是否返回上下文。当为0时不返回上下文，当为1时返回上下文。
     */
    public void setOption(Long Option) {
        this.Option = Option;
    }

    public DescribeDomainInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainInfoRequest(DescribeDomainInfoRequest source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Option != null) {
            this.Option = new Long(source.Option);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Option", this.Option);

    }
}

