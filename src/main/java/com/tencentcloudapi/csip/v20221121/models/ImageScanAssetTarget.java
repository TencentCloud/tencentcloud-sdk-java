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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageScanAssetTarget extends AbstractModel {

    /**
    * <p>目标镜像匹配模式</p><p>枚举值：</p><ul><li>ALL： 全部镜像</li><li>MANUAL： 手动选择</li><li>AUTO_MATCH： 自动匹配</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>全部镜像模式下扫描排除的镜像id</p>
    */
    @SerializedName("ExcludeImages")
    @Expose
    private String [] ExcludeImages;

    /**
    * <p>手动选择模式下需要扫描的镜像id</p>
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * <p>自动匹配模式下匹配配置</p>
    */
    @SerializedName("AutoMatch")
    @Expose
    private ImageScanAutoMatchConfig AutoMatch;

    /**
     * Get <p>目标镜像匹配模式</p><p>枚举值：</p><ul><li>ALL： 全部镜像</li><li>MANUAL： 手动选择</li><li>AUTO_MATCH： 自动匹配</li></ul> 
     * @return Mode <p>目标镜像匹配模式</p><p>枚举值：</p><ul><li>ALL： 全部镜像</li><li>MANUAL： 手动选择</li><li>AUTO_MATCH： 自动匹配</li></ul>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>目标镜像匹配模式</p><p>枚举值：</p><ul><li>ALL： 全部镜像</li><li>MANUAL： 手动选择</li><li>AUTO_MATCH： 自动匹配</li></ul>
     * @param Mode <p>目标镜像匹配模式</p><p>枚举值：</p><ul><li>ALL： 全部镜像</li><li>MANUAL： 手动选择</li><li>AUTO_MATCH： 自动匹配</li></ul>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>全部镜像模式下扫描排除的镜像id</p> 
     * @return ExcludeImages <p>全部镜像模式下扫描排除的镜像id</p>
     */
    public String [] getExcludeImages() {
        return this.ExcludeImages;
    }

    /**
     * Set <p>全部镜像模式下扫描排除的镜像id</p>
     * @param ExcludeImages <p>全部镜像模式下扫描排除的镜像id</p>
     */
    public void setExcludeImages(String [] ExcludeImages) {
        this.ExcludeImages = ExcludeImages;
    }

    /**
     * Get <p>手动选择模式下需要扫描的镜像id</p> 
     * @return Images <p>手动选择模式下需要扫描的镜像id</p>
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>手动选择模式下需要扫描的镜像id</p>
     * @param Images <p>手动选择模式下需要扫描的镜像id</p>
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>自动匹配模式下匹配配置</p> 
     * @return AutoMatch <p>自动匹配模式下匹配配置</p>
     */
    public ImageScanAutoMatchConfig getAutoMatch() {
        return this.AutoMatch;
    }

    /**
     * Set <p>自动匹配模式下匹配配置</p>
     * @param AutoMatch <p>自动匹配模式下匹配配置</p>
     */
    public void setAutoMatch(ImageScanAutoMatchConfig AutoMatch) {
        this.AutoMatch = AutoMatch;
    }

    public ImageScanAssetTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageScanAssetTarget(ImageScanAssetTarget source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.ExcludeImages != null) {
            this.ExcludeImages = new String[source.ExcludeImages.length];
            for (int i = 0; i < source.ExcludeImages.length; i++) {
                this.ExcludeImages[i] = new String(source.ExcludeImages[i]);
            }
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.AutoMatch != null) {
            this.AutoMatch = new ImageScanAutoMatchConfig(source.AutoMatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArraySimple(map, prefix + "ExcludeImages.", this.ExcludeImages);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamObj(map, prefix + "AutoMatch.", this.AutoMatch);

    }
}

