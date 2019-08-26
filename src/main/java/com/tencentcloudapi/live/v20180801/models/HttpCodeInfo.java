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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpCodeInfo  extends AbstractModel{

    /**
    * HTTP协议返回码。
例："2xx", "3xx", "4xx", "5xx"。
    */
    @SerializedName("HttpCode")
    @Expose
    private String HttpCode;

    /**
    * 统计信息，对于无数据的时间点，会补0。
    */
    @SerializedName("ValueList")
    @Expose
    private HttpCodeValue [] ValueList;

    /**
     * 获取HTTP协议返回码。
例："2xx", "3xx", "4xx", "5xx"。
     * @return HttpCode HTTP协议返回码。
例："2xx", "3xx", "4xx", "5xx"。
     */
    public String getHttpCode() {
        return this.HttpCode;
    }

    /**
     * 设置HTTP协议返回码。
例："2xx", "3xx", "4xx", "5xx"。
     * @param HttpCode HTTP协议返回码。
例："2xx", "3xx", "4xx", "5xx"。
     */
    public void setHttpCode(String HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * 获取统计信息，对于无数据的时间点，会补0。
     * @return ValueList 统计信息，对于无数据的时间点，会补0。
     */
    public HttpCodeValue [] getValueList() {
        return this.ValueList;
    }

    /**
     * 设置统计信息，对于无数据的时间点，会补0。
     * @param ValueList 统计信息，对于无数据的时间点，会补0。
     */
    public void setValueList(HttpCodeValue [] ValueList) {
        this.ValueList = ValueList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HttpCode", this.HttpCode);
        this.setParamArrayObj(map, prefix + "ValueList.", this.ValueList);

    }
}

