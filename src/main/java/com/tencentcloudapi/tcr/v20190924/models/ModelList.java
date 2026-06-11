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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelList extends AbstractModel {

    /**
    * 
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
    * 
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 
    */
    @SerializedName("ImageSize")
    @Expose
    private String ImageSize;

    /**
    * 
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
     * Get  
     * @return ModelName 
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 
     * @param ModelName 
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get  
     * @return NamespaceName 
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 
     * @param NamespaceName 
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get  
     * @return LatestVersion 
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set 
     * @param LatestVersion 
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    /**
     * Get  
     * @return Kind 
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 
     * @param Kind 
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get  
     * @return ImageSize 
     */
    public String getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set 
     * @param ImageSize 
     */
    public void setImageSize(String ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get  
     * @return UpdateTime 
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 
     * @param UpdateTime 
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get  
     * @return Digest 
     */
    public String getDigest() {
        return this.Digest;
    }

    /**
     * Set 
     * @param Digest 
     */
    public void setDigest(String Digest) {
        this.Digest = Digest;
    }

    public ModelList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelList(ModelList source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.LatestVersion != null) {
            this.LatestVersion = new String(source.LatestVersion);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new String(source.ImageSize);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Digest != null) {
            this.Digest = new String(source.Digest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Digest", this.Digest);

    }
}

