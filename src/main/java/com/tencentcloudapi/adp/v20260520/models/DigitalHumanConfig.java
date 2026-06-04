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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DigitalHumanConfig extends AbstractModel {

    /**
    * 数智人形象资产id
    */
    @SerializedName("AssetKey")
    @Expose
    private String AssetKey;

    /**
    * 数智人图片
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * 数智人形象名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数智人预览地址
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
     * Get 数智人形象资产id 
     * @return AssetKey 数智人形象资产id
     */
    public String getAssetKey() {
        return this.AssetKey;
    }

    /**
     * Set 数智人形象资产id
     * @param AssetKey 数智人形象资产id
     */
    public void setAssetKey(String AssetKey) {
        this.AssetKey = AssetKey;
    }

    /**
     * Get 数智人图片 
     * @return Avatar 数智人图片
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 数智人图片
     * @param Avatar 数智人图片
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get 数智人形象名称 
     * @return Name 数智人形象名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数智人形象名称
     * @param Name 数智人形象名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数智人预览地址 
     * @return PreviewUrl 数智人预览地址
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set 数智人预览地址
     * @param PreviewUrl 数智人预览地址
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    public DigitalHumanConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DigitalHumanConfig(DigitalHumanConfig source) {
        if (source.AssetKey != null) {
            this.AssetKey = new String(source.AssetKey);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetKey", this.AssetKey);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);

    }
}

