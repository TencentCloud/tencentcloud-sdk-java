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

public class RecipeItem extends AbstractModel {

    /**
    * <p>子图类型</p><p>枚举值：</p><ul><li>hero： 商品主图</li><li>detail： 商品细节图</li><li>selling： 核心卖点图</li><li>atmosphere： 场景氛围图</li><li>angles： 多角度图</li><li>scene： 使用场景图</li></ul>
    */
    @SerializedName("Theme")
    @Expose
    private String Theme;

    /**
    * <p>对应子图数量。</p><p>取值范围：[1, 4]</p><p>单位：张</p><p>单种子图最多4张，子图总数必须在4-12张范围内。</p>
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get <p>子图类型</p><p>枚举值：</p><ul><li>hero： 商品主图</li><li>detail： 商品细节图</li><li>selling： 核心卖点图</li><li>atmosphere： 场景氛围图</li><li>angles： 多角度图</li><li>scene： 使用场景图</li></ul> 
     * @return Theme <p>子图类型</p><p>枚举值：</p><ul><li>hero： 商品主图</li><li>detail： 商品细节图</li><li>selling： 核心卖点图</li><li>atmosphere： 场景氛围图</li><li>angles： 多角度图</li><li>scene： 使用场景图</li></ul>
     */
    public String getTheme() {
        return this.Theme;
    }

    /**
     * Set <p>子图类型</p><p>枚举值：</p><ul><li>hero： 商品主图</li><li>detail： 商品细节图</li><li>selling： 核心卖点图</li><li>atmosphere： 场景氛围图</li><li>angles： 多角度图</li><li>scene： 使用场景图</li></ul>
     * @param Theme <p>子图类型</p><p>枚举值：</p><ul><li>hero： 商品主图</li><li>detail： 商品细节图</li><li>selling： 核心卖点图</li><li>atmosphere： 场景氛围图</li><li>angles： 多角度图</li><li>scene： 使用场景图</li></ul>
     */
    public void setTheme(String Theme) {
        this.Theme = Theme;
    }

    /**
     * Get <p>对应子图数量。</p><p>取值范围：[1, 4]</p><p>单位：张</p><p>单种子图最多4张，子图总数必须在4-12张范围内。</p> 
     * @return Num <p>对应子图数量。</p><p>取值范围：[1, 4]</p><p>单位：张</p><p>单种子图最多4张，子图总数必须在4-12张范围内。</p>
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set <p>对应子图数量。</p><p>取值范围：[1, 4]</p><p>单位：张</p><p>单种子图最多4张，子图总数必须在4-12张范围内。</p>
     * @param Num <p>对应子图数量。</p><p>取值范围：[1, 4]</p><p>单位：张</p><p>单种子图最多4张，子图总数必须在4-12张范围内。</p>
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    public RecipeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecipeItem(RecipeItem source) {
        if (source.Theme != null) {
            this.Theme = new String(source.Theme);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Theme", this.Theme);
        this.setParamSimple(map, prefix + "Num", this.Num);

    }
}

