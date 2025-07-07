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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AKSKLeak extends AbstractModel {

    /**
    * AK编码
    */
    @SerializedName("AK")
    @Expose
    private String AK;

    /**
    * SK编码
    */
    @SerializedName("SK")
    @Expose
    private String SK;

    /**
    * URL编码
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
     * Get AK编码 
     * @return AK AK编码
     */
    public String getAK() {
        return this.AK;
    }

    /**
     * Set AK编码
     * @param AK AK编码
     */
    public void setAK(String AK) {
        this.AK = AK;
    }

    /**
     * Get SK编码 
     * @return SK SK编码
     */
    public String getSK() {
        return this.SK;
    }

    /**
     * Set SK编码
     * @param SK SK编码
     */
    public void setSK(String SK) {
        this.SK = SK;
    }

    /**
     * Get URL编码 
     * @return URL URL编码
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set URL编码
     * @param URL URL编码
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    public AKSKLeak() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AKSKLeak(AKSKLeak source) {
        if (source.AK != null) {
            this.AK = new String(source.AK);
        }
        if (source.SK != null) {
            this.SK = new String(source.SK);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AK", this.AK);
        this.setParamSimple(map, prefix + "SK", this.SK);
        this.setParamSimple(map, prefix + "URL", this.URL);

    }
}

