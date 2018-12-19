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
package com.tencentcloudapi.tics.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainInfoRequest  extends AbstractModel{

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
    private Integer Option;

    /**
     * 获取要查询的域名
     * @return Key 要查询的域名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * 设置要查询的域名
     * @param Key 要查询的域名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * 获取附加字段，是否返回上下文。当为0时不返回上下文，当为1时返回上下文。
     * @return Option 附加字段，是否返回上下文。当为0时不返回上下文，当为1时返回上下文。
     */
    public Integer getOption() {
        return this.Option;
    }

    /**
     * 设置附加字段，是否返回上下文。当为0时不返回上下文，当为1时返回上下文。
     * @param Option 附加字段，是否返回上下文。当为0时不返回上下文，当为1时返回上下文。
     */
    public void setOption(Integer Option) {
        this.Option = Option;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Option", this.Option);

    }
}

