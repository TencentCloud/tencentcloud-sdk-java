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

public class UpdateSmartErasePrivacyConfig extends AbstractModel {

    /**
    * 隐私保护擦除方式。
- blur 模糊
- mosaic 马赛克
    */
    @SerializedName("PrivacyModel")
    @Expose
    private String PrivacyModel;

    /**
    * 隐私保护目标，（在API Explorer上使用时无需传入数组，添加相应项并填入对应值即可）。
- face 人脸
- plate 车牌
    */
    @SerializedName("PrivacyTargets")
    @Expose
    private String [] PrivacyTargets;

    /**
     * Get 隐私保护擦除方式。
- blur 模糊
- mosaic 马赛克 
     * @return PrivacyModel 隐私保护擦除方式。
- blur 模糊
- mosaic 马赛克
     */
    public String getPrivacyModel() {
        return this.PrivacyModel;
    }

    /**
     * Set 隐私保护擦除方式。
- blur 模糊
- mosaic 马赛克
     * @param PrivacyModel 隐私保护擦除方式。
- blur 模糊
- mosaic 马赛克
     */
    public void setPrivacyModel(String PrivacyModel) {
        this.PrivacyModel = PrivacyModel;
    }

    /**
     * Get 隐私保护目标，（在API Explorer上使用时无需传入数组，添加相应项并填入对应值即可）。
- face 人脸
- plate 车牌 
     * @return PrivacyTargets 隐私保护目标，（在API Explorer上使用时无需传入数组，添加相应项并填入对应值即可）。
- face 人脸
- plate 车牌
     */
    public String [] getPrivacyTargets() {
        return this.PrivacyTargets;
    }

    /**
     * Set 隐私保护目标，（在API Explorer上使用时无需传入数组，添加相应项并填入对应值即可）。
- face 人脸
- plate 车牌
     * @param PrivacyTargets 隐私保护目标，（在API Explorer上使用时无需传入数组，添加相应项并填入对应值即可）。
- face 人脸
- plate 车牌
     */
    public void setPrivacyTargets(String [] PrivacyTargets) {
        this.PrivacyTargets = PrivacyTargets;
    }

    public UpdateSmartErasePrivacyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSmartErasePrivacyConfig(UpdateSmartErasePrivacyConfig source) {
        if (source.PrivacyModel != null) {
            this.PrivacyModel = new String(source.PrivacyModel);
        }
        if (source.PrivacyTargets != null) {
            this.PrivacyTargets = new String[source.PrivacyTargets.length];
            for (int i = 0; i < source.PrivacyTargets.length; i++) {
                this.PrivacyTargets[i] = new String(source.PrivacyTargets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivacyModel", this.PrivacyModel);
        this.setParamArraySimple(map, prefix + "PrivacyTargets.", this.PrivacyTargets);

    }
}

