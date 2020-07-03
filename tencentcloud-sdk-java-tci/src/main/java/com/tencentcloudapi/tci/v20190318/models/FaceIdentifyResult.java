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

public class FaceIdentifyResult extends AbstractModel{

    /**
    * 人脸标识符
    */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
    * 人员库标识符
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * 人员标识符
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
     * Get 人脸标识符 
     * @return FaceId 人脸标识符
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set 人脸标识符
     * @param FaceId 人脸标识符
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get 人员库标识符 
     * @return LibraryId 人员库标识符
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set 人员库标识符
     * @param LibraryId 人员库标识符
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get 人员标识符 
     * @return PersonId 人员标识符
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员标识符
     * @param PersonId 人员标识符
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceId", this.FaceId);
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Similarity", this.Similarity);

    }
}

