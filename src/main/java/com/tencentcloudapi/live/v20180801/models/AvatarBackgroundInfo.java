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

public class AvatarBackgroundInfo extends AbstractModel {

    /**
    * 背景 ID。
    */
    @SerializedName("BackgroundId")
    @Expose
    private String BackgroundId;

    /**
    * 背景场景。如：带货，娱乐等。
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 竖屏背景图片 URL。
    */
    @SerializedName("VerticalImageUrl")
    @Expose
    private String VerticalImageUrl;

    /**
    * 横屏背景图片 URL。
    */
    @SerializedName("HorizontalImageUrl")
    @Expose
    private String HorizontalImageUrl;

    /**
     * Get 背景 ID。 
     * @return BackgroundId 背景 ID。
     */
    public String getBackgroundId() {
        return this.BackgroundId;
    }

    /**
     * Set 背景 ID。
     * @param BackgroundId 背景 ID。
     */
    public void setBackgroundId(String BackgroundId) {
        this.BackgroundId = BackgroundId;
    }

    /**
     * Get 背景场景。如：带货，娱乐等。 
     * @return Scene 背景场景。如：带货，娱乐等。
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 背景场景。如：带货，娱乐等。
     * @param Scene 背景场景。如：带货，娱乐等。
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 竖屏背景图片 URL。 
     * @return VerticalImageUrl 竖屏背景图片 URL。
     */
    public String getVerticalImageUrl() {
        return this.VerticalImageUrl;
    }

    /**
     * Set 竖屏背景图片 URL。
     * @param VerticalImageUrl 竖屏背景图片 URL。
     */
    public void setVerticalImageUrl(String VerticalImageUrl) {
        this.VerticalImageUrl = VerticalImageUrl;
    }

    /**
     * Get 横屏背景图片 URL。 
     * @return HorizontalImageUrl 横屏背景图片 URL。
     */
    public String getHorizontalImageUrl() {
        return this.HorizontalImageUrl;
    }

    /**
     * Set 横屏背景图片 URL。
     * @param HorizontalImageUrl 横屏背景图片 URL。
     */
    public void setHorizontalImageUrl(String HorizontalImageUrl) {
        this.HorizontalImageUrl = HorizontalImageUrl;
    }

    public AvatarBackgroundInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvatarBackgroundInfo(AvatarBackgroundInfo source) {
        if (source.BackgroundId != null) {
            this.BackgroundId = new String(source.BackgroundId);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.VerticalImageUrl != null) {
            this.VerticalImageUrl = new String(source.VerticalImageUrl);
        }
        if (source.HorizontalImageUrl != null) {
            this.HorizontalImageUrl = new String(source.HorizontalImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackgroundId", this.BackgroundId);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "VerticalImageUrl", this.VerticalImageUrl);
        this.setParamSimple(map, prefix + "HorizontalImageUrl", this.HorizontalImageUrl);

    }
}

