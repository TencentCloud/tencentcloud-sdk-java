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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuthInfoRequest extends AbstractModel{

    /**
    * 偏移量：Offset=Offset+Limit
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数据条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索关键字
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get 偏移量：Offset=Offset+Limit 
     * @return Offset 偏移量：Offset=Offset+Limit
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量：Offset=Offset+Limit
     * @param Offset 偏移量：Offset=Offset+Limit
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数据条数 
     * @return Limit 数据条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数据条数
     * @param Limit 数据条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索关键字 
     * @return Key 搜索关键字
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 搜索关键字
     * @param Key 搜索关键字
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    public DescribeAuthInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuthInfoRequest(DescribeAuthInfoRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}

