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

public class MPSSmartErasePrivacyConfig extends AbstractModel {

    /**
    * <p>隐私保护擦除方式。</p><p>枚举值：</p><ul><li>blur： 模糊</li><li>mosaic： 马赛克</li></ul>
    */
    @SerializedName("PrivacyModel")
    @Expose
    private String PrivacyModel;

    /**
    * <p>隐私保护目标，（在API Explorer上使用时无需传入数组，添加相应项并填入对应值即可）。</p><p>枚举值：</p><ul><li>face： 人脸</li><li>plate： 车牌</li></ul>
    */
    @SerializedName("PrivacyTargets")
    @Expose
    private String [] PrivacyTargets;

    /**
     * Get <p>隐私保护擦除方式。</p><p>枚举值：</p><ul><li>blur： 模糊</li><li>mosaic： 马赛克</li></ul> 
     * @return PrivacyModel <p>隐私保护擦除方式。</p><p>枚举值：</p><ul><li>blur： 模糊</li><li>mosaic： 马赛克</li></ul>
     */
    public String getPrivacyModel() {
        return this.PrivacyModel;
    }

    /**
     * Set <p>隐私保护擦除方式。</p><p>枚举值：</p><ul><li>blur： 模糊</li><li>mosaic： 马赛克</li></ul>
     * @param PrivacyModel <p>隐私保护擦除方式。</p><p>枚举值：</p><ul><li>blur： 模糊</li><li>mosaic： 马赛克</li></ul>
     */
    public void setPrivacyModel(String PrivacyModel) {
        this.PrivacyModel = PrivacyModel;
    }

    /**
     * Get <p>隐私保护目标，（在API Explorer上使用时无需传入数组，添加相应项并填入对应值即可）。</p><p>枚举值：</p><ul><li>face： 人脸</li><li>plate： 车牌</li></ul> 
     * @return PrivacyTargets <p>隐私保护目标，（在API Explorer上使用时无需传入数组，添加相应项并填入对应值即可）。</p><p>枚举值：</p><ul><li>face： 人脸</li><li>plate： 车牌</li></ul>
     */
    public String [] getPrivacyTargets() {
        return this.PrivacyTargets;
    }

    /**
     * Set <p>隐私保护目标，（在API Explorer上使用时无需传入数组，添加相应项并填入对应值即可）。</p><p>枚举值：</p><ul><li>face： 人脸</li><li>plate： 车牌</li></ul>
     * @param PrivacyTargets <p>隐私保护目标，（在API Explorer上使用时无需传入数组，添加相应项并填入对应值即可）。</p><p>枚举值：</p><ul><li>face： 人脸</li><li>plate： 车牌</li></ul>
     */
    public void setPrivacyTargets(String [] PrivacyTargets) {
        this.PrivacyTargets = PrivacyTargets;
    }

    public MPSSmartErasePrivacyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSmartErasePrivacyConfig(MPSSmartErasePrivacyConfig source) {
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

