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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcVideoReferenceVideoInfo extends AbstractModel {

    /**
    * 参考视频url。需要外网可访问。
可作为特征参考视频，也可作为待编辑视频，默认为待编辑视频；可选择性保留视频原声
通过ReferType参数区分参考视频类型：feature为特征参考视频，base为待编辑视频
参考视频为待编辑视频时，不能定义视频首尾帧。
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 通过ReferType参数区分参考视频类型：feature为特征参考视频，base为待编辑视频。
    */
    @SerializedName("ReferType")
    @Expose
    private String ReferType;

    /**
    * 通过KeepOriginalSound参数选择是否保留视频原声，yes为保留，no为不保留；当前参数对特征参考视频（feature）也生效。
    */
    @SerializedName("KeepOriginalSound")
    @Expose
    private String KeepOriginalSound;

    /**
     * Get 参考视频url。需要外网可访问。
可作为特征参考视频，也可作为待编辑视频，默认为待编辑视频；可选择性保留视频原声
通过ReferType参数区分参考视频类型：feature为特征参考视频，base为待编辑视频
参考视频为待编辑视频时，不能定义视频首尾帧。 
     * @return VideoUrl 参考视频url。需要外网可访问。
可作为特征参考视频，也可作为待编辑视频，默认为待编辑视频；可选择性保留视频原声
通过ReferType参数区分参考视频类型：feature为特征参考视频，base为待编辑视频
参考视频为待编辑视频时，不能定义视频首尾帧。
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 参考视频url。需要外网可访问。
可作为特征参考视频，也可作为待编辑视频，默认为待编辑视频；可选择性保留视频原声
通过ReferType参数区分参考视频类型：feature为特征参考视频，base为待编辑视频
参考视频为待编辑视频时，不能定义视频首尾帧。
     * @param VideoUrl 参考视频url。需要外网可访问。
可作为特征参考视频，也可作为待编辑视频，默认为待编辑视频；可选择性保留视频原声
通过ReferType参数区分参考视频类型：feature为特征参考视频，base为待编辑视频
参考视频为待编辑视频时，不能定义视频首尾帧。
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 通过ReferType参数区分参考视频类型：feature为特征参考视频，base为待编辑视频。 
     * @return ReferType 通过ReferType参数区分参考视频类型：feature为特征参考视频，base为待编辑视频。
     */
    public String getReferType() {
        return this.ReferType;
    }

    /**
     * Set 通过ReferType参数区分参考视频类型：feature为特征参考视频，base为待编辑视频。
     * @param ReferType 通过ReferType参数区分参考视频类型：feature为特征参考视频，base为待编辑视频。
     */
    public void setReferType(String ReferType) {
        this.ReferType = ReferType;
    }

    /**
     * Get 通过KeepOriginalSound参数选择是否保留视频原声，yes为保留，no为不保留；当前参数对特征参考视频（feature）也生效。 
     * @return KeepOriginalSound 通过KeepOriginalSound参数选择是否保留视频原声，yes为保留，no为不保留；当前参数对特征参考视频（feature）也生效。
     */
    public String getKeepOriginalSound() {
        return this.KeepOriginalSound;
    }

    /**
     * Set 通过KeepOriginalSound参数选择是否保留视频原声，yes为保留，no为不保留；当前参数对特征参考视频（feature）也生效。
     * @param KeepOriginalSound 通过KeepOriginalSound参数选择是否保留视频原声，yes为保留，no为不保留；当前参数对特征参考视频（feature）也生效。
     */
    public void setKeepOriginalSound(String KeepOriginalSound) {
        this.KeepOriginalSound = KeepOriginalSound;
    }

    public AigcVideoReferenceVideoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoReferenceVideoInfo(AigcVideoReferenceVideoInfo source) {
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.ReferType != null) {
            this.ReferType = new String(source.ReferType);
        }
        if (source.KeepOriginalSound != null) {
            this.KeepOriginalSound = new String(source.KeepOriginalSound);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "ReferType", this.ReferType);
        this.setParamSimple(map, prefix + "KeepOriginalSound", this.KeepOriginalSound);

    }
}

