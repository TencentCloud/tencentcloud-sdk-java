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

public class DrmLicenseInfo  extends AbstractModel{

    /**
    * drm类型，widevine或fairplay
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * base64编码后的License请求。
    */
    @SerializedName("LicenseReq")
    @Expose
    private String LicenseReq;

    /**
    * 播放策略参数
    */
    @SerializedName("PlaybackPolicy")
    @Expose
    private PlaybackPolicy PlaybackPolicy;

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
     * 获取base64编码后的License请求。
     * @return LicenseReq base64编码后的License请求。
     */
    public String getLicenseReq() {
        return this.LicenseReq;
    }

    /**
     * 设置base64编码后的License请求。
     * @param LicenseReq base64编码后的License请求。
     */
    public void setLicenseReq(String LicenseReq) {
        this.LicenseReq = LicenseReq;
    }

    /**
     * 获取播放策略参数
     * @return PlaybackPolicy 播放策略参数
     */
    public PlaybackPolicy getPlaybackPolicy() {
        return this.PlaybackPolicy;
    }

    /**
     * 设置播放策略参数
     * @param PlaybackPolicy 播放策略参数
     */
    public void setPlaybackPolicy(PlaybackPolicy PlaybackPolicy) {
        this.PlaybackPolicy = PlaybackPolicy;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "LicenseReq", this.LicenseReq);
        this.setParamObj(map, prefix + "PlaybackPolicy.", this.PlaybackPolicy);

    }
}

