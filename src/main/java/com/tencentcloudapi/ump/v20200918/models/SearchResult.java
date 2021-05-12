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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchResult extends AbstractModel{

    /**
    * 图片base64数据
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 身份ID
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 相似度
    */
    @SerializedName("Similarity")
    @Expose
    private Float Similarity;

    /**
     * Get 图片base64数据 
     * @return Image 图片base64数据
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片base64数据
     * @param Image 图片base64数据
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 身份ID 
     * @return PersonId 身份ID
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 身份ID
     * @param PersonId 身份ID
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 相似度 
     * @return Similarity 相似度
     */
    public Float getSimilarity() {
        return this.Similarity;
    }

    /**
     * Set 相似度
     * @param Similarity 相似度
     */
    public void setSimilarity(Float Similarity) {
        this.Similarity = Similarity;
    }

    public SearchResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchResult(SearchResult source) {
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Similarity != null) {
            this.Similarity = new Float(source.Similarity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Similarity", this.Similarity);

    }
}

