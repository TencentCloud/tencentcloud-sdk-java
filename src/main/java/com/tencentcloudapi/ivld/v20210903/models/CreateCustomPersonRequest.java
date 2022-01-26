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

public class CreateCustomPersonRequest extends AbstractModel{

    /**
    * 自定义人物姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义人物简要信息(仅用于标记，不支持检索)
    */
    @SerializedName("BasicInfo")
    @Expose
    private String BasicInfo;

    /**
    * 自定义分类ID，如不存在接口会报错
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * 自定义人物图片URL，可支持任意地址，推荐使用COS
    */
    @SerializedName("ImageURL")
    @Expose
    private String ImageURL;

    /**
    * 原始图片base64编码后的数据
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
     * Get 自定义人物姓名 
     * @return Name 自定义人物姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义人物姓名
     * @param Name 自定义人物姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义人物简要信息(仅用于标记，不支持检索) 
     * @return BasicInfo 自定义人物简要信息(仅用于标记，不支持检索)
     */
    public String getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * Set 自定义人物简要信息(仅用于标记，不支持检索)
     * @param BasicInfo 自定义人物简要信息(仅用于标记，不支持检索)
     */
    public void setBasicInfo(String BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    /**
     * Get 自定义分类ID，如不存在接口会报错 
     * @return CategoryId 自定义分类ID，如不存在接口会报错
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 自定义分类ID，如不存在接口会报错
     * @param CategoryId 自定义分类ID，如不存在接口会报错
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 自定义人物图片URL，可支持任意地址，推荐使用COS 
     * @return ImageURL 自定义人物图片URL，可支持任意地址，推荐使用COS
     */
    public String getImageURL() {
        return this.ImageURL;
    }

    /**
     * Set 自定义人物图片URL，可支持任意地址，推荐使用COS
     * @param ImageURL 自定义人物图片URL，可支持任意地址，推荐使用COS
     */
    public void setImageURL(String ImageURL) {
        this.ImageURL = ImageURL;
    }

    /**
     * Get 原始图片base64编码后的数据 
     * @return Image 原始图片base64编码后的数据
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 原始图片base64编码后的数据
     * @param Image 原始图片base64编码后的数据
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    public CreateCustomPersonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomPersonRequest(CreateCustomPersonRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BasicInfo != null) {
            this.BasicInfo = new String(source.BasicInfo);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BasicInfo", this.BasicInfo);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "ImageURL", this.ImageURL);
        this.setParamSimple(map, prefix + "Image", this.Image);

    }
}

