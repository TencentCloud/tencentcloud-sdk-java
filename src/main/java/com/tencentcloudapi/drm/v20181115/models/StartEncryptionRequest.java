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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartEncryptionRequest extends AbstractModel{

    /**
    * cos的end point。
    */
    @SerializedName("CosEndPoint")
    @Expose
    private String CosEndPoint;

    /**
    * cos api密钥id。
    */
    @SerializedName("CosSecretId")
    @Expose
    private String CosSecretId;

    /**
    * cos api密钥。
    */
    @SerializedName("CosSecretKey")
    @Expose
    private String CosSecretKey;

    /**
    * 使用的DRM方案类型，接口取值WIDEVINE,FAIRPLAY
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * 存储在COS上的原始内容信息
    */
    @SerializedName("SourceObject")
    @Expose
    private DrmSourceObject SourceObject;

    /**
    * 加密后的内容存储到COS的对象
    */
    @SerializedName("OutputObjects")
    @Expose
    private DrmOutputObject [] OutputObjects;

    /**
     * Get cos的end point。 
     * @return CosEndPoint cos的end point。
     */
    public String getCosEndPoint() {
        return this.CosEndPoint;
    }

    /**
     * Set cos的end point。
     * @param CosEndPoint cos的end point。
     */
    public void setCosEndPoint(String CosEndPoint) {
        this.CosEndPoint = CosEndPoint;
    }

    /**
     * Get cos api密钥id。 
     * @return CosSecretId cos api密钥id。
     */
    public String getCosSecretId() {
        return this.CosSecretId;
    }

    /**
     * Set cos api密钥id。
     * @param CosSecretId cos api密钥id。
     */
    public void setCosSecretId(String CosSecretId) {
        this.CosSecretId = CosSecretId;
    }

    /**
     * Get cos api密钥。 
     * @return CosSecretKey cos api密钥。
     */
    public String getCosSecretKey() {
        return this.CosSecretKey;
    }

    /**
     * Set cos api密钥。
     * @param CosSecretKey cos api密钥。
     */
    public void setCosSecretKey(String CosSecretKey) {
        this.CosSecretKey = CosSecretKey;
    }

    /**
     * Get 使用的DRM方案类型，接口取值WIDEVINE,FAIRPLAY 
     * @return DrmType 使用的DRM方案类型，接口取值WIDEVINE,FAIRPLAY
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set 使用的DRM方案类型，接口取值WIDEVINE,FAIRPLAY
     * @param DrmType 使用的DRM方案类型，接口取值WIDEVINE,FAIRPLAY
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get 存储在COS上的原始内容信息 
     * @return SourceObject 存储在COS上的原始内容信息
     */
    public DrmSourceObject getSourceObject() {
        return this.SourceObject;
    }

    /**
     * Set 存储在COS上的原始内容信息
     * @param SourceObject 存储在COS上的原始内容信息
     */
    public void setSourceObject(DrmSourceObject SourceObject) {
        this.SourceObject = SourceObject;
    }

    /**
     * Get 加密后的内容存储到COS的对象 
     * @return OutputObjects 加密后的内容存储到COS的对象
     */
    public DrmOutputObject [] getOutputObjects() {
        return this.OutputObjects;
    }

    /**
     * Set 加密后的内容存储到COS的对象
     * @param OutputObjects 加密后的内容存储到COS的对象
     */
    public void setOutputObjects(DrmOutputObject [] OutputObjects) {
        this.OutputObjects = OutputObjects;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosEndPoint", this.CosEndPoint);
        this.setParamSimple(map, prefix + "CosSecretId", this.CosSecretId);
        this.setParamSimple(map, prefix + "CosSecretKey", this.CosSecretKey);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamObj(map, prefix + "SourceObject.", this.SourceObject);
        this.setParamArrayObj(map, prefix + "OutputObjects.", this.OutputObjects);

    }
}

