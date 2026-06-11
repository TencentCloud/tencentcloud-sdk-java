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

public class ModelDetail extends AbstractModel {

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
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
    * 
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * 
    */
    @SerializedName("Precision")
    @Expose
    private String Precision;

    /**
    * 
    */
    @SerializedName("FileFormat")
    @Expose
    private String FileFormat;

    /**
    * 
    */
    @SerializedName("ParamSize")
    @Expose
    private String ParamSize;

    /**
    * 
    */
    @SerializedName("Family")
    @Expose
    private String Family;

    /**
    * 
    */
    @SerializedName("IsRecommended")
    @Expose
    private Boolean IsRecommended;

    /**
    * 
    */
    @SerializedName("PushTime")
    @Expose
    private String PushTime;

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
     * @return Version 
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 
     * @param Version 
     */
    public void setVersion(String Version) {
        this.Version = Version;
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

    /**
     * Get  
     * @return Size 
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 
     * @param Size 
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get  
     * @return Framework 
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set 
     * @param Framework 
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get  
     * @return Precision 
     */
    public String getPrecision() {
        return this.Precision;
    }

    /**
     * Set 
     * @param Precision 
     */
    public void setPrecision(String Precision) {
        this.Precision = Precision;
    }

    /**
     * Get  
     * @return FileFormat 
     */
    public String getFileFormat() {
        return this.FileFormat;
    }

    /**
     * Set 
     * @param FileFormat 
     */
    public void setFileFormat(String FileFormat) {
        this.FileFormat = FileFormat;
    }

    /**
     * Get  
     * @return ParamSize 
     */
    public String getParamSize() {
        return this.ParamSize;
    }

    /**
     * Set 
     * @param ParamSize 
     */
    public void setParamSize(String ParamSize) {
        this.ParamSize = ParamSize;
    }

    /**
     * Get  
     * @return Family 
     */
    public String getFamily() {
        return this.Family;
    }

    /**
     * Set 
     * @param Family 
     */
    public void setFamily(String Family) {
        this.Family = Family;
    }

    /**
     * Get  
     * @return IsRecommended 
     */
    public Boolean getIsRecommended() {
        return this.IsRecommended;
    }

    /**
     * Set 
     * @param IsRecommended 
     */
    public void setIsRecommended(Boolean IsRecommended) {
        this.IsRecommended = IsRecommended;
    }

    /**
     * Get  
     * @return PushTime 
     */
    public String getPushTime() {
        return this.PushTime;
    }

    /**
     * Set 
     * @param PushTime 
     */
    public void setPushTime(String PushTime) {
        this.PushTime = PushTime;
    }

    public ModelDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelDetail(ModelDetail source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Digest != null) {
            this.Digest = new String(source.Digest);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Framework != null) {
            this.Framework = new String(source.Framework);
        }
        if (source.Precision != null) {
            this.Precision = new String(source.Precision);
        }
        if (source.FileFormat != null) {
            this.FileFormat = new String(source.FileFormat);
        }
        if (source.ParamSize != null) {
            this.ParamSize = new String(source.ParamSize);
        }
        if (source.Family != null) {
            this.Family = new String(source.Family);
        }
        if (source.IsRecommended != null) {
            this.IsRecommended = new Boolean(source.IsRecommended);
        }
        if (source.PushTime != null) {
            this.PushTime = new String(source.PushTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Digest", this.Digest);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "Precision", this.Precision);
        this.setParamSimple(map, prefix + "FileFormat", this.FileFormat);
        this.setParamSimple(map, prefix + "ParamSize", this.ParamSize);
        this.setParamSimple(map, prefix + "Family", this.Family);
        this.setParamSimple(map, prefix + "IsRecommended", this.IsRecommended);
        this.setParamSimple(map, prefix + "PushTime", this.PushTime);

    }
}

