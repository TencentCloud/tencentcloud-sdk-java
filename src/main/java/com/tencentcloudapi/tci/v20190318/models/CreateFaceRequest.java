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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFaceRequest extends AbstractModel{

    /**
    * 人员唯一标识符
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 图片数据 base64 字符串，与 Urls 参数选择一个输入
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * 人员库唯一标识符
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * 图片下载地址，与 Images 参数选择一个输入
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
     * Get 人员唯一标识符 
     * @return PersonId 人员唯一标识符
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员唯一标识符
     * @param PersonId 人员唯一标识符
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 图片数据 base64 字符串，与 Urls 参数选择一个输入 
     * @return Images 图片数据 base64 字符串，与 Urls 参数选择一个输入
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set 图片数据 base64 字符串，与 Urls 参数选择一个输入
     * @param Images 图片数据 base64 字符串，与 Urls 参数选择一个输入
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get 人员库唯一标识符 
     * @return LibraryId 人员库唯一标识符
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set 人员库唯一标识符
     * @param LibraryId 人员库唯一标识符
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get 图片下载地址，与 Images 参数选择一个输入 
     * @return Urls 图片下载地址，与 Images 参数选择一个输入
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set 图片下载地址，与 Images 参数选择一个输入
     * @param Urls 图片下载地址，与 Images 参数选择一个输入
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);

    }
}

