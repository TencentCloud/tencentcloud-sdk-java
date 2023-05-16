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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KubeJarvisStateCatalogue extends AbstractModel{

    /**
    * 目录级别，支持参数：
first：一级目录
second：二级目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogueLevel")
    @Expose
    private String CatalogueLevel;

    /**
    * 目录名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogueName")
    @Expose
    private String CatalogueName;

    /**
     * Get 目录级别，支持参数：
first：一级目录
second：二级目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogueLevel 目录级别，支持参数：
first：一级目录
second：二级目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogueLevel() {
        return this.CatalogueLevel;
    }

    /**
     * Set 目录级别，支持参数：
first：一级目录
second：二级目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogueLevel 目录级别，支持参数：
first：一级目录
second：二级目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogueLevel(String CatalogueLevel) {
        this.CatalogueLevel = CatalogueLevel;
    }

    /**
     * Get 目录名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogueName 目录名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogueName() {
        return this.CatalogueName;
    }

    /**
     * Set 目录名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogueName 目录名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogueName(String CatalogueName) {
        this.CatalogueName = CatalogueName;
    }

    public KubeJarvisStateCatalogue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KubeJarvisStateCatalogue(KubeJarvisStateCatalogue source) {
        if (source.CatalogueLevel != null) {
            this.CatalogueLevel = new String(source.CatalogueLevel);
        }
        if (source.CatalogueName != null) {
            this.CatalogueName = new String(source.CatalogueName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogueLevel", this.CatalogueLevel);
        this.setParamSimple(map, prefix + "CatalogueName", this.CatalogueName);

    }
}

