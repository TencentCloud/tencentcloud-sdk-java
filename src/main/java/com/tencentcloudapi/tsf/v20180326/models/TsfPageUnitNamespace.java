/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TsfPageUnitNamespace extends AbstractModel{

    /**
    * 记录总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 记录实体列表
    */
    @SerializedName("Content")
    @Expose
    private UnitNamespace [] Content;

    /**
     * Get 记录总数 
     * @return TotalCount 记录总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 记录总数
     * @param TotalCount 记录总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 记录实体列表 
     * @return Content 记录实体列表
     */
    public UnitNamespace [] getContent() {
        return this.Content;
    }

    /**
     * Set 记录实体列表
     * @param Content 记录实体列表
     */
    public void setContent(UnitNamespace [] Content) {
        this.Content = Content;
    }

    public TsfPageUnitNamespace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TsfPageUnitNamespace(TsfPageUnitNamespace source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Content != null) {
            this.Content = new UnitNamespace[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new UnitNamespace(source.Content[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);

    }
}

