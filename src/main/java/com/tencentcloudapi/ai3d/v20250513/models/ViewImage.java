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
package com.tencentcloudapi.ai3d.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ViewImage extends AbstractModel {

    /**
    * 视角类型。
取值：back、left、right
    */
    @SerializedName("ViewType")
    @Expose
    private String ViewType;

    /**
    * 图片Url地址
    */
    @SerializedName("ViewImageUrl")
    @Expose
    private String ViewImageUrl;

    /**
     * Get 视角类型。
取值：back、left、right 
     * @return ViewType 视角类型。
取值：back、left、right
     */
    public String getViewType() {
        return this.ViewType;
    }

    /**
     * Set 视角类型。
取值：back、left、right
     * @param ViewType 视角类型。
取值：back、left、right
     */
    public void setViewType(String ViewType) {
        this.ViewType = ViewType;
    }

    /**
     * Get 图片Url地址 
     * @return ViewImageUrl 图片Url地址
     */
    public String getViewImageUrl() {
        return this.ViewImageUrl;
    }

    /**
     * Set 图片Url地址
     * @param ViewImageUrl 图片Url地址
     */
    public void setViewImageUrl(String ViewImageUrl) {
        this.ViewImageUrl = ViewImageUrl;
    }

    public ViewImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewImage(ViewImage source) {
        if (source.ViewType != null) {
            this.ViewType = new String(source.ViewType);
        }
        if (source.ViewImageUrl != null) {
            this.ViewImageUrl = new String(source.ViewImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);
        this.setParamSimple(map, prefix + "ViewImageUrl", this.ViewImageUrl);

    }
}

