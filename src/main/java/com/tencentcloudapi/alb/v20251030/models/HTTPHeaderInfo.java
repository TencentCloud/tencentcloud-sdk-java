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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPHeaderInfo extends AbstractModel {

    /**
    * HTTP Header的键，长度1 ~ 40个字符，支持的字符集为：a-z A-Z 0-9 - _ 。
不支持中文，不支持Host，Cookie。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * HTTP Header的值，长度1 ~ 128个字符，支持可打印字符。
不支持"，开头和结尾不能是空格，结尾不能是\。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get HTTP Header的键，长度1 ~ 40个字符，支持的字符集为：a-z A-Z 0-9 - _ 。
不支持中文，不支持Host，Cookie。 
     * @return Key HTTP Header的键，长度1 ~ 40个字符，支持的字符集为：a-z A-Z 0-9 - _ 。
不支持中文，不支持Host，Cookie。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set HTTP Header的键，长度1 ~ 40个字符，支持的字符集为：a-z A-Z 0-9 - _ 。
不支持中文，不支持Host，Cookie。
     * @param Key HTTP Header的键，长度1 ~ 40个字符，支持的字符集为：a-z A-Z 0-9 - _ 。
不支持中文，不支持Host，Cookie。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get HTTP Header的值，长度1 ~ 128个字符，支持可打印字符。
不支持"，开头和结尾不能是空格，结尾不能是\。 
     * @return Values HTTP Header的值，长度1 ~ 128个字符，支持可打印字符。
不支持"，开头和结尾不能是空格，结尾不能是\。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set HTTP Header的值，长度1 ~ 128个字符，支持可打印字符。
不支持"，开头和结尾不能是空格，结尾不能是\。
     * @param Values HTTP Header的值，长度1 ~ 128个字符，支持可打印字符。
不支持"，开头和结尾不能是空格，结尾不能是\。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public HTTPHeaderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPHeaderInfo(HTTPHeaderInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

