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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ThirdPartyDrmInfo extends AbstractModel {

    /**
    * <p>加密类型：</p><ul><li>FairPlay：只能用于HLS，切片格式只能是mp4</li><li>Widevine：可以用于HLS和DASH，切片格式只能是mp4</li><li>PlayReady：可以用于HLS和DASH，切片格式只能是mp4</li><li>Widevine+FairPlay，PlayReady+FairPlay，Widevine PlayReady FairPlay组合: 只能用于HLS，切片格式只能是mp4</li><li>Widevine PlayReady组合: 可用于HLS、MPEG-DASH，切片格式只能是mp4</li></ul>
    */
    @SerializedName("DrmTypes")
    @Expose
    private String [] DrmTypes;

    /**
    * <p>第三方DRM厂商信息。</p>
    */
    @SerializedName("SPEKEDrm")
    @Expose
    private SPEKEDrm SPEKEDrm;

    /**
     * Get <p>加密类型：</p><ul><li>FairPlay：只能用于HLS，切片格式只能是mp4</li><li>Widevine：可以用于HLS和DASH，切片格式只能是mp4</li><li>PlayReady：可以用于HLS和DASH，切片格式只能是mp4</li><li>Widevine+FairPlay，PlayReady+FairPlay，Widevine PlayReady FairPlay组合: 只能用于HLS，切片格式只能是mp4</li><li>Widevine PlayReady组合: 可用于HLS、MPEG-DASH，切片格式只能是mp4</li></ul> 
     * @return DrmTypes <p>加密类型：</p><ul><li>FairPlay：只能用于HLS，切片格式只能是mp4</li><li>Widevine：可以用于HLS和DASH，切片格式只能是mp4</li><li>PlayReady：可以用于HLS和DASH，切片格式只能是mp4</li><li>Widevine+FairPlay，PlayReady+FairPlay，Widevine PlayReady FairPlay组合: 只能用于HLS，切片格式只能是mp4</li><li>Widevine PlayReady组合: 可用于HLS、MPEG-DASH，切片格式只能是mp4</li></ul>
     */
    public String [] getDrmTypes() {
        return this.DrmTypes;
    }

    /**
     * Set <p>加密类型：</p><ul><li>FairPlay：只能用于HLS，切片格式只能是mp4</li><li>Widevine：可以用于HLS和DASH，切片格式只能是mp4</li><li>PlayReady：可以用于HLS和DASH，切片格式只能是mp4</li><li>Widevine+FairPlay，PlayReady+FairPlay，Widevine PlayReady FairPlay组合: 只能用于HLS，切片格式只能是mp4</li><li>Widevine PlayReady组合: 可用于HLS、MPEG-DASH，切片格式只能是mp4</li></ul>
     * @param DrmTypes <p>加密类型：</p><ul><li>FairPlay：只能用于HLS，切片格式只能是mp4</li><li>Widevine：可以用于HLS和DASH，切片格式只能是mp4</li><li>PlayReady：可以用于HLS和DASH，切片格式只能是mp4</li><li>Widevine+FairPlay，PlayReady+FairPlay，Widevine PlayReady FairPlay组合: 只能用于HLS，切片格式只能是mp4</li><li>Widevine PlayReady组合: 可用于HLS、MPEG-DASH，切片格式只能是mp4</li></ul>
     */
    public void setDrmTypes(String [] DrmTypes) {
        this.DrmTypes = DrmTypes;
    }

    /**
     * Get <p>第三方DRM厂商信息。</p> 
     * @return SPEKEDrm <p>第三方DRM厂商信息。</p>
     */
    public SPEKEDrm getSPEKEDrm() {
        return this.SPEKEDrm;
    }

    /**
     * Set <p>第三方DRM厂商信息。</p>
     * @param SPEKEDrm <p>第三方DRM厂商信息。</p>
     */
    public void setSPEKEDrm(SPEKEDrm SPEKEDrm) {
        this.SPEKEDrm = SPEKEDrm;
    }

    public ThirdPartyDrmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThirdPartyDrmInfo(ThirdPartyDrmInfo source) {
        if (source.DrmTypes != null) {
            this.DrmTypes = new String[source.DrmTypes.length];
            for (int i = 0; i < source.DrmTypes.length; i++) {
                this.DrmTypes[i] = new String(source.DrmTypes[i]);
            }
        }
        if (source.SPEKEDrm != null) {
            this.SPEKEDrm = new SPEKEDrm(source.SPEKEDrm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DrmTypes.", this.DrmTypes);
        this.setParamObj(map, prefix + "SPEKEDrm.", this.SPEKEDrm);

    }
}

