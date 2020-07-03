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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpHeaderParam extends AbstractModel{

    /**
    * HTTP头名
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
    * HTTP头值
    */
    @SerializedName("HeaderValue")
    @Expose
    private String HeaderValue;

    /**
     * Get HTTP头名 
     * @return HeaderName HTTP头名
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set HTTP头名
     * @param HeaderName HTTP头名
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    /**
     * Get HTTP头值 
     * @return HeaderValue HTTP头值
     */
    public String getHeaderValue() {
        return this.HeaderValue;
    }

    /**
     * Set HTTP头值
     * @param HeaderValue HTTP头值
     */
    public void setHeaderValue(String HeaderValue) {
        this.HeaderValue = HeaderValue;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);
        this.setParamSimple(map, prefix + "HeaderValue", this.HeaderValue);

    }
}

