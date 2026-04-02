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

public class ChangeClothesConfig extends AbstractModel {

    /**
    * <p>输入需要更换的<strong>衣物</strong>图片列表。各类型最大支持衣物数量：</p><ul><li>change_clothes：4 张图片；</li><li>change_clothes_under：1 张图片；</li><li>change_clothes_full_wear：1 张图片；</li><li>change_clothes_top_wear：1 张图片；</li><li>change_clothes_bottom_wear：1 张图片；</li></ul>
    */
    @SerializedName("ClothesFileInfos")
    @Expose
    private SceneAigcImageTaskInputFileInfo [] ClothesFileInfos;

    /**
    * <p>AI换衣的提示词。<strong>仅Type为change_clothes有效。</strong></p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
     * Get <p>输入需要更换的<strong>衣物</strong>图片列表。各类型最大支持衣物数量：</p><ul><li>change_clothes：4 张图片；</li><li>change_clothes_under：1 张图片；</li><li>change_clothes_full_wear：1 张图片；</li><li>change_clothes_top_wear：1 张图片；</li><li>change_clothes_bottom_wear：1 张图片；</li></ul> 
     * @return ClothesFileInfos <p>输入需要更换的<strong>衣物</strong>图片列表。各类型最大支持衣物数量：</p><ul><li>change_clothes：4 张图片；</li><li>change_clothes_under：1 张图片；</li><li>change_clothes_full_wear：1 张图片；</li><li>change_clothes_top_wear：1 张图片；</li><li>change_clothes_bottom_wear：1 张图片；</li></ul>
     */
    public SceneAigcImageTaskInputFileInfo [] getClothesFileInfos() {
        return this.ClothesFileInfos;
    }

    /**
     * Set <p>输入需要更换的<strong>衣物</strong>图片列表。各类型最大支持衣物数量：</p><ul><li>change_clothes：4 张图片；</li><li>change_clothes_under：1 张图片；</li><li>change_clothes_full_wear：1 张图片；</li><li>change_clothes_top_wear：1 张图片；</li><li>change_clothes_bottom_wear：1 张图片；</li></ul>
     * @param ClothesFileInfos <p>输入需要更换的<strong>衣物</strong>图片列表。各类型最大支持衣物数量：</p><ul><li>change_clothes：4 张图片；</li><li>change_clothes_under：1 张图片；</li><li>change_clothes_full_wear：1 张图片；</li><li>change_clothes_top_wear：1 张图片；</li><li>change_clothes_bottom_wear：1 张图片；</li></ul>
     */
    public void setClothesFileInfos(SceneAigcImageTaskInputFileInfo [] ClothesFileInfos) {
        this.ClothesFileInfos = ClothesFileInfos;
    }

    /**
     * Get <p>AI换衣的提示词。<strong>仅Type为change_clothes有效。</strong></p> 
     * @return Prompt <p>AI换衣的提示词。<strong>仅Type为change_clothes有效。</strong></p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>AI换衣的提示词。<strong>仅Type为change_clothes有效。</strong></p>
     * @param Prompt <p>AI换衣的提示词。<strong>仅Type为change_clothes有效。</strong></p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    public ChangeClothesConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeClothesConfig(ChangeClothesConfig source) {
        if (source.ClothesFileInfos != null) {
            this.ClothesFileInfos = new SceneAigcImageTaskInputFileInfo[source.ClothesFileInfos.length];
            for (int i = 0; i < source.ClothesFileInfos.length; i++) {
                this.ClothesFileInfos[i] = new SceneAigcImageTaskInputFileInfo(source.ClothesFileInfos[i]);
            }
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ClothesFileInfos.", this.ClothesFileInfos);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);

    }
}

