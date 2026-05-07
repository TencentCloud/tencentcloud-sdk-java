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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSmsSignListRequest extends AbstractModel {

    /**
    * <p>是否国际/港澳台短信：<br>0：表示国内短信。<br>1：表示国际/港澳台短信。</p>
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * <p>签名 ID 数组。<br>注：默认数组最大长度100。</p>
    */
    @SerializedName("SignIdSet")
    @Expose
    private Long [] SignIdSet;

    /**
    * <p>最大上限，最多100。注：默认为10，SignIdSet 为空时启用。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量。注：默认为0，SignIdSet 为空时启用。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>是否国际/港澳台短信：<br>0：表示国内短信。<br>1：表示国际/港澳台短信。</p> 
     * @return International <p>是否国际/港澳台短信：<br>0：表示国内短信。<br>1：表示国际/港澳台短信。</p>
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set <p>是否国际/港澳台短信：<br>0：表示国内短信。<br>1：表示国际/港澳台短信。</p>
     * @param International <p>是否国际/港澳台短信：<br>0：表示国内短信。<br>1：表示国际/港澳台短信。</p>
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get <p>签名 ID 数组。<br>注：默认数组最大长度100。</p> 
     * @return SignIdSet <p>签名 ID 数组。<br>注：默认数组最大长度100。</p>
     */
    public Long [] getSignIdSet() {
        return this.SignIdSet;
    }

    /**
     * Set <p>签名 ID 数组。<br>注：默认数组最大长度100。</p>
     * @param SignIdSet <p>签名 ID 数组。<br>注：默认数组最大长度100。</p>
     */
    public void setSignIdSet(Long [] SignIdSet) {
        this.SignIdSet = SignIdSet;
    }

    /**
     * Get <p>最大上限，最多100。注：默认为10，SignIdSet 为空时启用。</p> 
     * @return Limit <p>最大上限，最多100。注：默认为10，SignIdSet 为空时启用。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>最大上限，最多100。注：默认为10，SignIdSet 为空时启用。</p>
     * @param Limit <p>最大上限，最多100。注：默认为10，SignIdSet 为空时启用。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量。注：默认为0，SignIdSet 为空时启用。</p> 
     * @return Offset <p>偏移量。注：默认为0，SignIdSet 为空时启用。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量。注：默认为0，SignIdSet 为空时启用。</p>
     * @param Offset <p>偏移量。注：默认为0，SignIdSet 为空时启用。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSmsSignListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSmsSignListRequest(DescribeSmsSignListRequest source) {
        if (source.International != null) {
            this.International = new Long(source.International);
        }
        if (source.SignIdSet != null) {
            this.SignIdSet = new Long[source.SignIdSet.length];
            for (int i = 0; i < source.SignIdSet.length; i++) {
                this.SignIdSet[i] = new Long(source.SignIdSet[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamArraySimple(map, prefix + "SignIdSet.", this.SignIdSet);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

