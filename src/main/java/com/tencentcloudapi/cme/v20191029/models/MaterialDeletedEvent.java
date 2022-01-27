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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaterialDeletedEvent extends AbstractModel{

    /**
    * 删除的媒体 Id 列表。
    */
    @SerializedName("MaterialIdSet")
    @Expose
    private String [] MaterialIdSet;

    /**
     * Get 删除的媒体 Id 列表。 
     * @return MaterialIdSet 删除的媒体 Id 列表。
     */
    public String [] getMaterialIdSet() {
        return this.MaterialIdSet;
    }

    /**
     * Set 删除的媒体 Id 列表。
     * @param MaterialIdSet 删除的媒体 Id 列表。
     */
    public void setMaterialIdSet(String [] MaterialIdSet) {
        this.MaterialIdSet = MaterialIdSet;
    }

    public MaterialDeletedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaterialDeletedEvent(MaterialDeletedEvent source) {
        if (source.MaterialIdSet != null) {
            this.MaterialIdSet = new String[source.MaterialIdSet.length];
            for (int i = 0; i < source.MaterialIdSet.length; i++) {
                this.MaterialIdSet[i] = new String(source.MaterialIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MaterialIdSet.", this.MaterialIdSet);

    }
}

