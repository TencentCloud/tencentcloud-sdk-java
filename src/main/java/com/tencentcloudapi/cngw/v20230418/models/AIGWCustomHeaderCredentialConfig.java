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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWCustomHeaderCredentialConfig extends AbstractModel {

    /**
    * <p>Header名</p>
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
    * <p>Header值</p>
    */
    @SerializedName("HeaderValue")
    @Expose
    private String HeaderValue;

    /**
     * Get <p>Header名</p> 
     * @return HeaderName <p>Header名</p>
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set <p>Header名</p>
     * @param HeaderName <p>Header名</p>
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    /**
     * Get <p>Header值</p> 
     * @return HeaderValue <p>Header值</p>
     */
    public String getHeaderValue() {
        return this.HeaderValue;
    }

    /**
     * Set <p>Header值</p>
     * @param HeaderValue <p>Header值</p>
     */
    public void setHeaderValue(String HeaderValue) {
        this.HeaderValue = HeaderValue;
    }

    public AIGWCustomHeaderCredentialConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWCustomHeaderCredentialConfig(AIGWCustomHeaderCredentialConfig source) {
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
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);
        this.setParamSimple(map, prefix + "HeaderValue", this.HeaderValue);

    }
}

