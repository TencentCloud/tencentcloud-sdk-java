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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInfo extends AbstractModel {

    /**
    * <p>tcr仓库地址</p>
    */
    @SerializedName("ImageRegistryUrl")
    @Expose
    private String ImageRegistryUrl;

    /**
    * <p>仓库用户名</p>
    */
    @SerializedName("ImageRegistryUsername")
    @Expose
    private String ImageRegistryUsername;

    /**
    * <p>仓库密码</p>
    */
    @SerializedName("ImageRegistryPassword")
    @Expose
    private String ImageRegistryPassword;

    /**
     * Get <p>tcr仓库地址</p> 
     * @return ImageRegistryUrl <p>tcr仓库地址</p>
     */
    public String getImageRegistryUrl() {
        return this.ImageRegistryUrl;
    }

    /**
     * Set <p>tcr仓库地址</p>
     * @param ImageRegistryUrl <p>tcr仓库地址</p>
     */
    public void setImageRegistryUrl(String ImageRegistryUrl) {
        this.ImageRegistryUrl = ImageRegistryUrl;
    }

    /**
     * Get <p>仓库用户名</p> 
     * @return ImageRegistryUsername <p>仓库用户名</p>
     */
    public String getImageRegistryUsername() {
        return this.ImageRegistryUsername;
    }

    /**
     * Set <p>仓库用户名</p>
     * @param ImageRegistryUsername <p>仓库用户名</p>
     */
    public void setImageRegistryUsername(String ImageRegistryUsername) {
        this.ImageRegistryUsername = ImageRegistryUsername;
    }

    /**
     * Get <p>仓库密码</p> 
     * @return ImageRegistryPassword <p>仓库密码</p>
     */
    public String getImageRegistryPassword() {
        return this.ImageRegistryPassword;
    }

    /**
     * Set <p>仓库密码</p>
     * @param ImageRegistryPassword <p>仓库密码</p>
     */
    public void setImageRegistryPassword(String ImageRegistryPassword) {
        this.ImageRegistryPassword = ImageRegistryPassword;
    }

    public ImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfo(ImageInfo source) {
        if (source.ImageRegistryUrl != null) {
            this.ImageRegistryUrl = new String(source.ImageRegistryUrl);
        }
        if (source.ImageRegistryUsername != null) {
            this.ImageRegistryUsername = new String(source.ImageRegistryUsername);
        }
        if (source.ImageRegistryPassword != null) {
            this.ImageRegistryPassword = new String(source.ImageRegistryPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageRegistryUrl", this.ImageRegistryUrl);
        this.setParamSimple(map, prefix + "ImageRegistryUsername", this.ImageRegistryUsername);
        this.setParamSimple(map, prefix + "ImageRegistryPassword", this.ImageRegistryPassword);

    }
}

