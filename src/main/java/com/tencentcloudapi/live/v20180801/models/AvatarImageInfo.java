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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvatarImageInfo extends AbstractModel {

    /**
    * 数字人原始缩放系数。数字人展示大小=原始大小*缩放系数。
    */
    @SerializedName("OriginZoom")
    @Expose
    private Float OriginZoom;

    /**
    * 数字人KEY。
    */
    @SerializedName("AvatarKey")
    @Expose
    private String AvatarKey;

    /**
    * 分辨率。
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get 数字人原始缩放系数。数字人展示大小=原始大小*缩放系数。 
     * @return OriginZoom 数字人原始缩放系数。数字人展示大小=原始大小*缩放系数。
     */
    public Float getOriginZoom() {
        return this.OriginZoom;
    }

    /**
     * Set 数字人原始缩放系数。数字人展示大小=原始大小*缩放系数。
     * @param OriginZoom 数字人原始缩放系数。数字人展示大小=原始大小*缩放系数。
     */
    public void setOriginZoom(Float OriginZoom) {
        this.OriginZoom = OriginZoom;
    }

    /**
     * Get 数字人KEY。 
     * @return AvatarKey 数字人KEY。
     */
    public String getAvatarKey() {
        return this.AvatarKey;
    }

    /**
     * Set 数字人KEY。
     * @param AvatarKey 数字人KEY。
     */
    public void setAvatarKey(String AvatarKey) {
        this.AvatarKey = AvatarKey;
    }

    /**
     * Get 分辨率。 
     * @return Resolution 分辨率。
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率。
     * @param Resolution 分辨率。
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public AvatarImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvatarImageInfo(AvatarImageInfo source) {
        if (source.OriginZoom != null) {
            this.OriginZoom = new Float(source.OriginZoom);
        }
        if (source.AvatarKey != null) {
            this.AvatarKey = new String(source.AvatarKey);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginZoom", this.OriginZoom);
        this.setParamSimple(map, prefix + "AvatarKey", this.AvatarKey);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

