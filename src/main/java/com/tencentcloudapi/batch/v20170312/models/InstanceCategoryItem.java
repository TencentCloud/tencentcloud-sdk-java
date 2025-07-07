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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceCategoryItem extends AbstractModel {

    /**
    * 实例类型名
    */
    @SerializedName("InstanceCategory")
    @Expose
    private String InstanceCategory;

    /**
    * 实例族列表
    */
    @SerializedName("InstanceFamilySet")
    @Expose
    private String [] InstanceFamilySet;

    /**
     * Get 实例类型名 
     * @return InstanceCategory 实例类型名
     */
    public String getInstanceCategory() {
        return this.InstanceCategory;
    }

    /**
     * Set 实例类型名
     * @param InstanceCategory 实例类型名
     */
    public void setInstanceCategory(String InstanceCategory) {
        this.InstanceCategory = InstanceCategory;
    }

    /**
     * Get 实例族列表 
     * @return InstanceFamilySet 实例族列表
     */
    public String [] getInstanceFamilySet() {
        return this.InstanceFamilySet;
    }

    /**
     * Set 实例族列表
     * @param InstanceFamilySet 实例族列表
     */
    public void setInstanceFamilySet(String [] InstanceFamilySet) {
        this.InstanceFamilySet = InstanceFamilySet;
    }

    public InstanceCategoryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceCategoryItem(InstanceCategoryItem source) {
        if (source.InstanceCategory != null) {
            this.InstanceCategory = new String(source.InstanceCategory);
        }
        if (source.InstanceFamilySet != null) {
            this.InstanceFamilySet = new String[source.InstanceFamilySet.length];
            for (int i = 0; i < source.InstanceFamilySet.length; i++) {
                this.InstanceFamilySet[i] = new String(source.InstanceFamilySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceCategory", this.InstanceCategory);
        this.setParamArraySimple(map, prefix + "InstanceFamilySet.", this.InstanceFamilySet);

    }
}

