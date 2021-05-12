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

public class HttpHeaderRule extends AbstractModel{

    /**
    * http头部设置方式，支持add，set或del，分别表示新增，设置或删除头部。
    */
    @SerializedName("HeaderMode")
    @Expose
    private String HeaderMode;

    /**
    * http头部名称。
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
    * http头部值。
    */
    @SerializedName("HeaderValue")
    @Expose
    private String HeaderValue;

    /**
     * Get http头部设置方式，支持add，set或del，分别表示新增，设置或删除头部。 
     * @return HeaderMode http头部设置方式，支持add，set或del，分别表示新增，设置或删除头部。
     */
    public String getHeaderMode() {
        return this.HeaderMode;
    }

    /**
     * Set http头部设置方式，支持add，set或del，分别表示新增，设置或删除头部。
     * @param HeaderMode http头部设置方式，支持add，set或del，分别表示新增，设置或删除头部。
     */
    public void setHeaderMode(String HeaderMode) {
        this.HeaderMode = HeaderMode;
    }

    /**
     * Get http头部名称。 
     * @return HeaderName http头部名称。
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set http头部名称。
     * @param HeaderName http头部名称。
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    /**
     * Get http头部值。 
     * @return HeaderValue http头部值。
     */
    public String getHeaderValue() {
        return this.HeaderValue;
    }

    /**
     * Set http头部值。
     * @param HeaderValue http头部值。
     */
    public void setHeaderValue(String HeaderValue) {
        this.HeaderValue = HeaderValue;
    }

    public HttpHeaderRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpHeaderRule(HttpHeaderRule source) {
        if (source.HeaderMode != null) {
            this.HeaderMode = new String(source.HeaderMode);
        }
        if (source.HeaderName != null) {
            this.HeaderName = new String(source.HeaderName);
        }
        if (source.HeaderValue != null) {
            this.HeaderValue = new String(source.HeaderValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeaderMode", this.HeaderMode);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);
        this.setParamSimple(map, prefix + "HeaderValue", this.HeaderValue);

    }
}

