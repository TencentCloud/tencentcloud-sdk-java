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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddCustomPersonImageRequest extends AbstractModel{

    /**
    * 自定义人物Id
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 自定义人物图片地址
    */
    @SerializedName("ImageURL")
    @Expose
    private String ImageURL;

    /**
    * 图片数据base64之后的结果
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
     * Get 自定义人物Id 
     * @return PersonId 自定义人物Id
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 自定义人物Id
     * @param PersonId 自定义人物Id
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 自定义人物图片地址 
     * @return ImageURL 自定义人物图片地址
     */
    public String getImageURL() {
        return this.ImageURL;
    }

    /**
     * Set 自定义人物图片地址
     * @param ImageURL 自定义人物图片地址
     */
    public void setImageURL(String ImageURL) {
        this.ImageURL = ImageURL;
    }

    /**
     * Get 图片数据base64之后的结果 
     * @return Image 图片数据base64之后的结果
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片数据base64之后的结果
     * @param Image 图片数据base64之后的结果
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    public AddCustomPersonImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCustomPersonImageRequest(AddCustomPersonImageRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.ImageURL != null) {
            this.ImageURL = new String(source.ImageURL);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "ImageURL", this.ImageURL);
        this.setParamSimple(map, prefix + "Image", this.Image);

    }
}

