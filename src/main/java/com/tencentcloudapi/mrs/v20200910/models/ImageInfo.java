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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInfo extends AbstractModel{

    /**
    * 图片id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 图片url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 图片base64编码
    */
    @SerializedName("Base64")
    @Expose
    private String Base64;

    /**
     * Get 图片id 
     * @return Id 图片id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 图片id
     * @param Id 图片id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 图片url 
     * @return Url 图片url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片url
     * @param Url 图片url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 图片base64编码 
     * @return Base64 图片base64编码
     */
    public String getBase64() {
        return this.Base64;
    }

    /**
     * Set 图片base64编码
     * @param Base64 图片base64编码
     */
    public void setBase64(String Base64) {
        this.Base64 = Base64;
    }

    public ImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfo(ImageInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Base64 != null) {
            this.Base64 = new String(source.Base64);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Base64", this.Base64);

    }
}

