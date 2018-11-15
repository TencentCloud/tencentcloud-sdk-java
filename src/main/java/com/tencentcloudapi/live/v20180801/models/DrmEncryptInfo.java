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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrmEncryptInfo  extends AbstractModel{

    /**
    * cos的end point。
    */
    @SerializedName("CosEndPoint")
    @Expose
    private String CosEndPoint;

    /**
    * cos api密钥id。
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * cos api密钥。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * drm类型，widevine或fairplay
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * cos上的原始视频。
    */
    @SerializedName("SourceObject")
    @Expose
    private DrmSourceObject SourceObject;

    /**
    * 加密的视频传输到cos位置。
    */
    @SerializedName("OutputObjects")
    @Expose
    private DrmOutputObject [] OutputObjects;

    /**
     * 获取cos的end point。
     * @return CosEndPoint cos的end point。
     */
    public String getCosEndPoint() {
        return this.CosEndPoint;
    }

    /**
     * 设置cos的end point。
     * @param CosEndPoint cos的end point。
     */
    public void setCosEndPoint(String CosEndPoint) {
        this.CosEndPoint = CosEndPoint;
    }

    /**
     * 获取cos api密钥id。
     * @return SecretId cos api密钥id。
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * 设置cos api密钥id。
     * @param SecretId cos api密钥id。
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * 获取cos api密钥。
     * @return SecretKey cos api密钥。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * 设置cos api密钥。
     * @param SecretKey cos api密钥。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * 获取drm类型，widevine或fairplay
     * @return DrmType drm类型，widevine或fairplay
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * 设置drm类型，widevine或fairplay
     * @param DrmType drm类型，widevine或fairplay
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * 获取cos上的原始视频。
     * @return SourceObject cos上的原始视频。
     */
    public DrmSourceObject getSourceObject() {
        return this.SourceObject;
    }

    /**
     * 设置cos上的原始视频。
     * @param SourceObject cos上的原始视频。
     */
    public void setSourceObject(DrmSourceObject SourceObject) {
        this.SourceObject = SourceObject;
    }

    /**
     * 获取加密的视频传输到cos位置。
     * @return OutputObjects 加密的视频传输到cos位置。
     */
    public DrmOutputObject [] getOutputObjects() {
        return this.OutputObjects;
    }

    /**
     * 设置加密的视频传输到cos位置。
     * @param OutputObjects 加密的视频传输到cos位置。
     */
    public void setOutputObjects(DrmOutputObject [] OutputObjects) {
        this.OutputObjects = OutputObjects;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosEndPoint", this.CosEndPoint);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamObj(map, prefix + "SourceObject.", this.SourceObject);
        this.setParamArrayObj(map, prefix + "OutputObjects.", this.OutputObjects);

    }
}

