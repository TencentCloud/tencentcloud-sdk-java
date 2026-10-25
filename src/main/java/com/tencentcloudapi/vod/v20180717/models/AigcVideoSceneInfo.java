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

public class AigcVideoSceneInfo extends AbstractModel {

    /**
    * <p>AIGC 生视频场景类型。</p><p>枚举值：</p><ul><li>product_showcase：  产品360度展示。</li><li>character_scene： 角色场景。</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>产品展示参数配置。</p>
    */
    @SerializedName("ProductShowcaseConfig")
    @Expose
    private ProductShowcaseConfig ProductShowcaseConfig;

    /**
    * <p>角色场景参数配置。</p>
    */
    @SerializedName("CharacterSceneConfig")
    @Expose
    private CharacterSceneConfig CharacterSceneConfig;

    /**
     * Get <p>AIGC 生视频场景类型。</p><p>枚举值：</p><ul><li>product_showcase：  产品360度展示。</li><li>character_scene： 角色场景。</li></ul> 
     * @return Type <p>AIGC 生视频场景类型。</p><p>枚举值：</p><ul><li>product_showcase：  产品360度展示。</li><li>character_scene： 角色场景。</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>AIGC 生视频场景类型。</p><p>枚举值：</p><ul><li>product_showcase：  产品360度展示。</li><li>character_scene： 角色场景。</li></ul>
     * @param Type <p>AIGC 生视频场景类型。</p><p>枚举值：</p><ul><li>product_showcase：  产品360度展示。</li><li>character_scene： 角色场景。</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>产品展示参数配置。</p> 
     * @return ProductShowcaseConfig <p>产品展示参数配置。</p>
     */
    public ProductShowcaseConfig getProductShowcaseConfig() {
        return this.ProductShowcaseConfig;
    }

    /**
     * Set <p>产品展示参数配置。</p>
     * @param ProductShowcaseConfig <p>产品展示参数配置。</p>
     */
    public void setProductShowcaseConfig(ProductShowcaseConfig ProductShowcaseConfig) {
        this.ProductShowcaseConfig = ProductShowcaseConfig;
    }

    /**
     * Get <p>角色场景参数配置。</p> 
     * @return CharacterSceneConfig <p>角色场景参数配置。</p>
     */
    public CharacterSceneConfig getCharacterSceneConfig() {
        return this.CharacterSceneConfig;
    }

    /**
     * Set <p>角色场景参数配置。</p>
     * @param CharacterSceneConfig <p>角色场景参数配置。</p>
     */
    public void setCharacterSceneConfig(CharacterSceneConfig CharacterSceneConfig) {
        this.CharacterSceneConfig = CharacterSceneConfig;
    }

    public AigcVideoSceneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoSceneInfo(AigcVideoSceneInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ProductShowcaseConfig != null) {
            this.ProductShowcaseConfig = new ProductShowcaseConfig(source.ProductShowcaseConfig);
        }
        if (source.CharacterSceneConfig != null) {
            this.CharacterSceneConfig = new CharacterSceneConfig(source.CharacterSceneConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "ProductShowcaseConfig.", this.ProductShowcaseConfig);
        this.setParamObj(map, prefix + "CharacterSceneConfig.", this.CharacterSceneConfig);

    }
}

