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
    * 输入需要更换的**衣物**图片列表。目前最大支持4张图片。
    */
    @SerializedName("ClothesFileInfos")
    @Expose
    private SceneAigcImageTaskInputFileInfo [] ClothesFileInfos;

    /**
     * Get 输入需要更换的**衣物**图片列表。目前最大支持4张图片。 
     * @return ClothesFileInfos 输入需要更换的**衣物**图片列表。目前最大支持4张图片。
     */
    public SceneAigcImageTaskInputFileInfo [] getClothesFileInfos() {
        return this.ClothesFileInfos;
    }

    /**
     * Set 输入需要更换的**衣物**图片列表。目前最大支持4张图片。
     * @param ClothesFileInfos 输入需要更换的**衣物**图片列表。目前最大支持4张图片。
     */
    public void setClothesFileInfos(SceneAigcImageTaskInputFileInfo [] ClothesFileInfos) {
        this.ClothesFileInfos = ClothesFileInfos;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ClothesFileInfos.", this.ClothesFileInfos);

    }
}

