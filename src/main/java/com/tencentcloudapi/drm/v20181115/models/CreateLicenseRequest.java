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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLicenseRequest extends AbstractModel {

    /**
    * DRM方案类型，接口取值：WIDEVINE，FAIRPLAY。
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * Base64编码的终端设备License Request数据。
    */
    @SerializedName("LicenseRequest")
    @Expose
    private String LicenseRequest;

    /**
    * 内容类型，接口取值：VodVideo,LiveVideo。
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * 授权播放的Track列表。
该值为空时，默认授权所有track播放。
    */
    @SerializedName("Tracks")
    @Expose
    private String [] Tracks;

    /**
    * 播放策略参数。
    */
    @SerializedName("PlaybackPolicy")
    @Expose
    private PlaybackPolicy PlaybackPolicy;

    /**
    * Widevine安全级别，接口取值[L1, L2, L3]。
安全级别定义参考Widevine安全级别定义。
    */
    @SerializedName("WidevineSecurityLevel")
    @Expose
    private String WidevineSecurityLevel;

    /**
     * Get DRM方案类型，接口取值：WIDEVINE，FAIRPLAY。 
     * @return DrmType DRM方案类型，接口取值：WIDEVINE，FAIRPLAY。
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set DRM方案类型，接口取值：WIDEVINE，FAIRPLAY。
     * @param DrmType DRM方案类型，接口取值：WIDEVINE，FAIRPLAY。
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get Base64编码的终端设备License Request数据。 
     * @return LicenseRequest Base64编码的终端设备License Request数据。
     */
    public String getLicenseRequest() {
        return this.LicenseRequest;
    }

    /**
     * Set Base64编码的终端设备License Request数据。
     * @param LicenseRequest Base64编码的终端设备License Request数据。
     */
    public void setLicenseRequest(String LicenseRequest) {
        this.LicenseRequest = LicenseRequest;
    }

    /**
     * Get 内容类型，接口取值：VodVideo,LiveVideo。 
     * @return ContentType 内容类型，接口取值：VodVideo,LiveVideo。
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 内容类型，接口取值：VodVideo,LiveVideo。
     * @param ContentType 内容类型，接口取值：VodVideo,LiveVideo。
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 授权播放的Track列表。
该值为空时，默认授权所有track播放。 
     * @return Tracks 授权播放的Track列表。
该值为空时，默认授权所有track播放。
     */
    public String [] getTracks() {
        return this.Tracks;
    }

    /**
     * Set 授权播放的Track列表。
该值为空时，默认授权所有track播放。
     * @param Tracks 授权播放的Track列表。
该值为空时，默认授权所有track播放。
     */
    public void setTracks(String [] Tracks) {
        this.Tracks = Tracks;
    }

    /**
     * Get 播放策略参数。 
     * @return PlaybackPolicy 播放策略参数。
     */
    public PlaybackPolicy getPlaybackPolicy() {
        return this.PlaybackPolicy;
    }

    /**
     * Set 播放策略参数。
     * @param PlaybackPolicy 播放策略参数。
     */
    public void setPlaybackPolicy(PlaybackPolicy PlaybackPolicy) {
        this.PlaybackPolicy = PlaybackPolicy;
    }

    /**
     * Get Widevine安全级别，接口取值[L1, L2, L3]。
安全级别定义参考Widevine安全级别定义。 
     * @return WidevineSecurityLevel Widevine安全级别，接口取值[L1, L2, L3]。
安全级别定义参考Widevine安全级别定义。
     */
    public String getWidevineSecurityLevel() {
        return this.WidevineSecurityLevel;
    }

    /**
     * Set Widevine安全级别，接口取值[L1, L2, L3]。
安全级别定义参考Widevine安全级别定义。
     * @param WidevineSecurityLevel Widevine安全级别，接口取值[L1, L2, L3]。
安全级别定义参考Widevine安全级别定义。
     */
    public void setWidevineSecurityLevel(String WidevineSecurityLevel) {
        this.WidevineSecurityLevel = WidevineSecurityLevel;
    }

    public CreateLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLicenseRequest(CreateLicenseRequest source) {
        if (source.DrmType != null) {
            this.DrmType = new String(source.DrmType);
        }
        if (source.LicenseRequest != null) {
            this.LicenseRequest = new String(source.LicenseRequest);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Tracks != null) {
            this.Tracks = new String[source.Tracks.length];
            for (int i = 0; i < source.Tracks.length; i++) {
                this.Tracks[i] = new String(source.Tracks[i]);
            }
        }
        if (source.PlaybackPolicy != null) {
            this.PlaybackPolicy = new PlaybackPolicy(source.PlaybackPolicy);
        }
        if (source.WidevineSecurityLevel != null) {
            this.WidevineSecurityLevel = new String(source.WidevineSecurityLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "LicenseRequest", this.LicenseRequest);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamArraySimple(map, prefix + "Tracks.", this.Tracks);
        this.setParamObj(map, prefix + "PlaybackPolicy.", this.PlaybackPolicy);
        this.setParamSimple(map, prefix + "WidevineSecurityLevel", this.WidevineSecurityLevel);

    }
}

