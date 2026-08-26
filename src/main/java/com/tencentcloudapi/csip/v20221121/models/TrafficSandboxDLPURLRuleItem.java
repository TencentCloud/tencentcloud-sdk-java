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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficSandboxDLPURLRuleItem extends AbstractModel {

    /**
    * 外发对象列表（域名/URL）
    */
    @SerializedName("URL")
    @Expose
    private String [] URL;

    /**
    * 排除对象列表
    */
    @SerializedName("URLExcept")
    @Expose
    private String [] URLExcept;

    /**
     * Get 外发对象列表（域名/URL） 
     * @return URL 外发对象列表（域名/URL）
     */
    public String [] getURL() {
        return this.URL;
    }

    /**
     * Set 外发对象列表（域名/URL）
     * @param URL 外发对象列表（域名/URL）
     */
    public void setURL(String [] URL) {
        this.URL = URL;
    }

    /**
     * Get 排除对象列表 
     * @return URLExcept 排除对象列表
     */
    public String [] getURLExcept() {
        return this.URLExcept;
    }

    /**
     * Set 排除对象列表
     * @param URLExcept 排除对象列表
     */
    public void setURLExcept(String [] URLExcept) {
        this.URLExcept = URLExcept;
    }

    public TrafficSandboxDLPURLRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxDLPURLRuleItem(TrafficSandboxDLPURLRuleItem source) {
        if (source.URL != null) {
            this.URL = new String[source.URL.length];
            for (int i = 0; i < source.URL.length; i++) {
                this.URL[i] = new String(source.URL[i]);
            }
        }
        if (source.URLExcept != null) {
            this.URLExcept = new String[source.URLExcept.length];
            for (int i = 0; i < source.URLExcept.length; i++) {
                this.URLExcept[i] = new String(source.URLExcept[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "URL.", this.URL);
        this.setParamArraySimple(map, prefix + "URLExcept.", this.URLExcept);

    }
}

