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

public class ImageMessage extends AbstractModel {

    /**
    * 角色，可选值包括 system、user、assistant。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 文本内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 多种类型内容（目前支持图片和文本），仅 hunyuan-vision 和 hunyuan-turbo-vision 模型支持
    */
    @SerializedName("Contents")
    @Expose
    private Content [] Contents;

    /**
     * Get 角色，可选值包括 system、user、assistant。 
     * @return Role 角色，可选值包括 system、user、assistant。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色，可选值包括 system、user、assistant。
     * @param Role 角色，可选值包括 system、user、assistant。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 文本内容 
     * @return Content 文本内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 文本内容
     * @param Content 文本内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 多种类型内容（目前支持图片和文本），仅 hunyuan-vision 和 hunyuan-turbo-vision 模型支持 
     * @return Contents 多种类型内容（目前支持图片和文本），仅 hunyuan-vision 和 hunyuan-turbo-vision 模型支持
     */
    public Content [] getContents() {
        return this.Contents;
    }

    /**
     * Set 多种类型内容（目前支持图片和文本），仅 hunyuan-vision 和 hunyuan-turbo-vision 模型支持
     * @param Contents 多种类型内容（目前支持图片和文本），仅 hunyuan-vision 和 hunyuan-turbo-vision 模型支持
     */
    public void setContents(Content [] Contents) {
        this.Contents = Contents;
    }

    public ImageMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageMessage(ImageMessage source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Contents != null) {
            this.Contents = new Content[source.Contents.length];
            for (int i = 0; i < source.Contents.length; i++) {
                this.Contents[i] = new Content(source.Contents[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "Contents.", this.Contents);

    }
}

