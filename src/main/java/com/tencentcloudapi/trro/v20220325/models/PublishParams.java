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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishParams extends AbstractModel {

    /**
    * 腾讯云直播推流地址url
    */
    @SerializedName("PublishUrl")
    @Expose
    private String PublishUrl;

    /**
    * 是否是腾讯云CDN，0为转推非腾讯云CDN，1为转推腾讯CDN，不携带该参数默认为1。
    */
    @SerializedName("IsTencentUrl")
    @Expose
    private Long IsTencentUrl;

    /**
     * Get 腾讯云直播推流地址url 
     * @return PublishUrl 腾讯云直播推流地址url
     */
    public String getPublishUrl() {
        return this.PublishUrl;
    }

    /**
     * Set 腾讯云直播推流地址url
     * @param PublishUrl 腾讯云直播推流地址url
     */
    public void setPublishUrl(String PublishUrl) {
        this.PublishUrl = PublishUrl;
    }

    /**
     * Get 是否是腾讯云CDN，0为转推非腾讯云CDN，1为转推腾讯CDN，不携带该参数默认为1。 
     * @return IsTencentUrl 是否是腾讯云CDN，0为转推非腾讯云CDN，1为转推腾讯CDN，不携带该参数默认为1。
     */
    public Long getIsTencentUrl() {
        return this.IsTencentUrl;
    }

    /**
     * Set 是否是腾讯云CDN，0为转推非腾讯云CDN，1为转推腾讯CDN，不携带该参数默认为1。
     * @param IsTencentUrl 是否是腾讯云CDN，0为转推非腾讯云CDN，1为转推腾讯CDN，不携带该参数默认为1。
     */
    public void setIsTencentUrl(Long IsTencentUrl) {
        this.IsTencentUrl = IsTencentUrl;
    }

    public PublishParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishParams(PublishParams source) {
        if (source.PublishUrl != null) {
            this.PublishUrl = new String(source.PublishUrl);
        }
        if (source.IsTencentUrl != null) {
            this.IsTencentUrl = new Long(source.IsTencentUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublishUrl", this.PublishUrl);
        this.setParamSimple(map, prefix + "IsTencentUrl", this.IsTencentUrl);

    }
}

