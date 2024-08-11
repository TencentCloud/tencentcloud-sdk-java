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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserFilter extends AbstractModel {

    /**
    * 过滤类型，当前支持：UserId、PhoneNumber、Email、AccountName、AccountUserId。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 过滤值，只支持完全匹配，不支持模糊搜索。针对不同的 Key，Value 的取值如下：
UserId: user12345678abcde
PhoneNumber: +86-13800000000（格式为：{CountryCode}-{PhoneNumber}）
Email: admin@mail.foobar.com
AccountName: account_name
AccountUserId: x53mYVqykfPqTCqekbNwwa4aXk4
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 过滤类型，当前支持：UserId、PhoneNumber、Email、AccountName、AccountUserId。 
     * @return Key 过滤类型，当前支持：UserId、PhoneNumber、Email、AccountName、AccountUserId。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 过滤类型，当前支持：UserId、PhoneNumber、Email、AccountName、AccountUserId。
     * @param Key 过滤类型，当前支持：UserId、PhoneNumber、Email、AccountName、AccountUserId。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 过滤值，只支持完全匹配，不支持模糊搜索。针对不同的 Key，Value 的取值如下：
UserId: user12345678abcde
PhoneNumber: +86-13800000000（格式为：{CountryCode}-{PhoneNumber}）
Email: admin@mail.foobar.com
AccountName: account_name
AccountUserId: x53mYVqykfPqTCqekbNwwa4aXk4 
     * @return Value 过滤值，只支持完全匹配，不支持模糊搜索。针对不同的 Key，Value 的取值如下：
UserId: user12345678abcde
PhoneNumber: +86-13800000000（格式为：{CountryCode}-{PhoneNumber}）
Email: admin@mail.foobar.com
AccountName: account_name
AccountUserId: x53mYVqykfPqTCqekbNwwa4aXk4
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 过滤值，只支持完全匹配，不支持模糊搜索。针对不同的 Key，Value 的取值如下：
UserId: user12345678abcde
PhoneNumber: +86-13800000000（格式为：{CountryCode}-{PhoneNumber}）
Email: admin@mail.foobar.com
AccountName: account_name
AccountUserId: x53mYVqykfPqTCqekbNwwa4aXk4
     * @param Value 过滤值，只支持完全匹配，不支持模糊搜索。针对不同的 Key，Value 的取值如下：
UserId: user12345678abcde
PhoneNumber: +86-13800000000（格式为：{CountryCode}-{PhoneNumber}）
Email: admin@mail.foobar.com
AccountName: account_name
AccountUserId: x53mYVqykfPqTCqekbNwwa4aXk4
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public UserFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserFilter(UserFilter source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

