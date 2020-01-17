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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Sort extends AbstractModel{

    /**
    * 排序字段，当前支持：
createTime，域名创建时间
certExpireTime，证书过期时间
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * asc/desc，默认desc。
    */
    @SerializedName("Sequence")
    @Expose
    private String Sequence;

    /**
     * Get 排序字段，当前支持：
createTime，域名创建时间
certExpireTime，证书过期时间 
     * @return Key 排序字段，当前支持：
createTime，域名创建时间
certExpireTime，证书过期时间
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 排序字段，当前支持：
createTime，域名创建时间
certExpireTime，证书过期时间
     * @param Key 排序字段，当前支持：
createTime，域名创建时间
certExpireTime，证书过期时间
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get asc/desc，默认desc。 
     * @return Sequence asc/desc，默认desc。
     */
    public String getSequence() {
        return this.Sequence;
    }

    /**
     * Set asc/desc，默认desc。
     * @param Sequence asc/desc，默认desc。
     */
    public void setSequence(String Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);

    }
}

