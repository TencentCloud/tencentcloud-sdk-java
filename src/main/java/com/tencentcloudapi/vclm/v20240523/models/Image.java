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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Image extends AbstractModel {

    /**
    * 图片Base64
    */
    @SerializedName("Base64")
    @Expose
    private String Base64;

    /**
    * 图片Url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 图片Base64 
     * @return Base64 图片Base64
     */
    public String getBase64() {
        return this.Base64;
    }

    /**
     * Set 图片Base64
     * @param Base64 图片Base64
     */
    public void setBase64(String Base64) {
        this.Base64 = Base64;
    }

    /**
     * Get 图片Url 
     * @return Url 图片Url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片Url
     * @param Url 图片Url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public Image() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Image(Image source) {
        if (source.Base64 != null) {
            this.Base64 = new String(source.Base64);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Base64", this.Base64);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

