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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Multimedia extends AbstractModel {

    /**
    * 多媒体类型，image：图片。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 多媒体预览地址。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 多媒体详情地址。
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
     * Get 多媒体类型，image：图片。 
     * @return Type 多媒体类型，image：图片。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 多媒体类型，image：图片。
     * @param Type 多媒体类型，image：图片。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 多媒体预览地址。 
     * @return Url 多媒体预览地址。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 多媒体预览地址。
     * @param Url 多媒体预览地址。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 多媒体详情地址。 
     * @return JumpUrl 多媒体详情地址。
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 多媒体详情地址。
     * @param JumpUrl 多媒体详情地址。
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    public Multimedia() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Multimedia(Multimedia source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);

    }
}

