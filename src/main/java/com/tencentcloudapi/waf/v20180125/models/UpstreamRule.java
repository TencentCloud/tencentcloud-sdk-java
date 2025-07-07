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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpstreamRule extends AbstractModel {

    /**
    * 匹配的关键字。目前支持host、uri两种
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 逻辑符号。
equal：等于
not equal：不等于
belong：属于
not belong：不属于
    */
    @SerializedName("Symbol")
    @Expose
    private String Symbol;

    /**
    * 匹配的内容。equal和not equal时，数组只能有一个元素
    */
    @SerializedName("ContentList")
    @Expose
    private String [] ContentList;

    /**
    * 规则匹配后生效的回源地址。
    */
    @SerializedName("AddressList")
    @Expose
    private String [] AddressList;

    /**
    * 回源负载均衡类型，仅多个回源地址时生效。
0：轮询
1：IP_HASH
    */
    @SerializedName("BalanceType")
    @Expose
    private Long BalanceType;

    /**
     * Get 匹配的关键字。目前支持host、uri两种 
     * @return KeyName 匹配的关键字。目前支持host、uri两种
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set 匹配的关键字。目前支持host、uri两种
     * @param KeyName 匹配的关键字。目前支持host、uri两种
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get 逻辑符号。
equal：等于
not equal：不等于
belong：属于
not belong：不属于 
     * @return Symbol 逻辑符号。
equal：等于
not equal：不等于
belong：属于
not belong：不属于
     */
    public String getSymbol() {
        return this.Symbol;
    }

    /**
     * Set 逻辑符号。
equal：等于
not equal：不等于
belong：属于
not belong：不属于
     * @param Symbol 逻辑符号。
equal：等于
not equal：不等于
belong：属于
not belong：不属于
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * Get 匹配的内容。equal和not equal时，数组只能有一个元素 
     * @return ContentList 匹配的内容。equal和not equal时，数组只能有一个元素
     */
    public String [] getContentList() {
        return this.ContentList;
    }

    /**
     * Set 匹配的内容。equal和not equal时，数组只能有一个元素
     * @param ContentList 匹配的内容。equal和not equal时，数组只能有一个元素
     */
    public void setContentList(String [] ContentList) {
        this.ContentList = ContentList;
    }

    /**
     * Get 规则匹配后生效的回源地址。 
     * @return AddressList 规则匹配后生效的回源地址。
     */
    public String [] getAddressList() {
        return this.AddressList;
    }

    /**
     * Set 规则匹配后生效的回源地址。
     * @param AddressList 规则匹配后生效的回源地址。
     */
    public void setAddressList(String [] AddressList) {
        this.AddressList = AddressList;
    }

    /**
     * Get 回源负载均衡类型，仅多个回源地址时生效。
0：轮询
1：IP_HASH 
     * @return BalanceType 回源负载均衡类型，仅多个回源地址时生效。
0：轮询
1：IP_HASH
     */
    public Long getBalanceType() {
        return this.BalanceType;
    }

    /**
     * Set 回源负载均衡类型，仅多个回源地址时生效。
0：轮询
1：IP_HASH
     * @param BalanceType 回源负载均衡类型，仅多个回源地址时生效。
0：轮询
1：IP_HASH
     */
    public void setBalanceType(Long BalanceType) {
        this.BalanceType = BalanceType;
    }

    public UpstreamRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamRule(UpstreamRule source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.Symbol != null) {
            this.Symbol = new String(source.Symbol);
        }
        if (source.ContentList != null) {
            this.ContentList = new String[source.ContentList.length];
            for (int i = 0; i < source.ContentList.length; i++) {
                this.ContentList[i] = new String(source.ContentList[i]);
            }
        }
        if (source.AddressList != null) {
            this.AddressList = new String[source.AddressList.length];
            for (int i = 0; i < source.AddressList.length; i++) {
                this.AddressList[i] = new String(source.AddressList[i]);
            }
        }
        if (source.BalanceType != null) {
            this.BalanceType = new Long(source.BalanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "Symbol", this.Symbol);
        this.setParamArraySimple(map, prefix + "ContentList.", this.ContentList);
        this.setParamArraySimple(map, prefix + "AddressList.", this.AddressList);
        this.setParamSimple(map, prefix + "BalanceType", this.BalanceType);

    }
}

