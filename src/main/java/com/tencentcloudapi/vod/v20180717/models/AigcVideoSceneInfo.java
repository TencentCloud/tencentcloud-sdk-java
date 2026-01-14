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
    * AI生视频场景类型，可选值：
- product_showcase： 产品360度展示。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 产品展示参数
    */
    @SerializedName("ProductShowcaseConfig")
    @Expose
    private ProductShowcaseConfig ProductShowcaseConfig;

    /**
     * Get AI生视频场景类型，可选值：
- product_showcase： 产品360度展示。 
     * @return Type AI生视频场景类型，可选值：
- product_showcase： 产品360度展示。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set AI生视频场景类型，可选值：
- product_showcase： 产品360度展示。
     * @param Type AI生视频场景类型，可选值：
- product_showcase： 产品360度展示。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 产品展示参数 
     * @return ProductShowcaseConfig 产品展示参数
     */
    public ProductShowcaseConfig getProductShowcaseConfig() {
        return this.ProductShowcaseConfig;
    }

    /**
     * Set 产品展示参数
     * @param ProductShowcaseConfig 产品展示参数
     */
    public void setProductShowcaseConfig(ProductShowcaseConfig ProductShowcaseConfig) {
        this.ProductShowcaseConfig = ProductShowcaseConfig;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "ProductShowcaseConfig.", this.ProductShowcaseConfig);

    }
}

