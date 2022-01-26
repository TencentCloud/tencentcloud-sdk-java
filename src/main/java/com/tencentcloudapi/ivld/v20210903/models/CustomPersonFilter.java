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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomPersonFilter extends AbstractModel{

    /**
    * 待查询的人物姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 待过滤的自定义类型Id数组
    */
    @SerializedName("CategoryIdSet")
    @Expose
    private String [] CategoryIdSet;

    /**
    * 待过滤的自定义人物Id数组
    */
    @SerializedName("PersonIdSet")
    @Expose
    private String [] PersonIdSet;

    /**
    * 一级自定义人物类型数组
    */
    @SerializedName("L1CategorySet")
    @Expose
    private String [] L1CategorySet;

    /**
     * Get 待查询的人物姓名 
     * @return Name 待查询的人物姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 待查询的人物姓名
     * @param Name 待查询的人物姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 待过滤的自定义类型Id数组 
     * @return CategoryIdSet 待过滤的自定义类型Id数组
     */
    public String [] getCategoryIdSet() {
        return this.CategoryIdSet;
    }

    /**
     * Set 待过滤的自定义类型Id数组
     * @param CategoryIdSet 待过滤的自定义类型Id数组
     */
    public void setCategoryIdSet(String [] CategoryIdSet) {
        this.CategoryIdSet = CategoryIdSet;
    }

    /**
     * Get 待过滤的自定义人物Id数组 
     * @return PersonIdSet 待过滤的自定义人物Id数组
     */
    public String [] getPersonIdSet() {
        return this.PersonIdSet;
    }

    /**
     * Set 待过滤的自定义人物Id数组
     * @param PersonIdSet 待过滤的自定义人物Id数组
     */
    public void setPersonIdSet(String [] PersonIdSet) {
        this.PersonIdSet = PersonIdSet;
    }

    /**
     * Get 一级自定义人物类型数组 
     * @return L1CategorySet 一级自定义人物类型数组
     */
    public String [] getL1CategorySet() {
        return this.L1CategorySet;
    }

    /**
     * Set 一级自定义人物类型数组
     * @param L1CategorySet 一级自定义人物类型数组
     */
    public void setL1CategorySet(String [] L1CategorySet) {
        this.L1CategorySet = L1CategorySet;
    }

    public CustomPersonFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomPersonFilter(CustomPersonFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CategoryIdSet != null) {
            this.CategoryIdSet = new String[source.CategoryIdSet.length];
            for (int i = 0; i < source.CategoryIdSet.length; i++) {
                this.CategoryIdSet[i] = new String(source.CategoryIdSet[i]);
            }
        }
        if (source.PersonIdSet != null) {
            this.PersonIdSet = new String[source.PersonIdSet.length];
            for (int i = 0; i < source.PersonIdSet.length; i++) {
                this.PersonIdSet[i] = new String(source.PersonIdSet[i]);
            }
        }
        if (source.L1CategorySet != null) {
            this.L1CategorySet = new String[source.L1CategorySet.length];
            for (int i = 0; i < source.L1CategorySet.length; i++) {
                this.L1CategorySet[i] = new String(source.L1CategorySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "CategoryIdSet.", this.CategoryIdSet);
        this.setParamArraySimple(map, prefix + "PersonIdSet.", this.PersonIdSet);
        this.setParamArraySimple(map, prefix + "L1CategorySet.", this.L1CategorySet);

    }
}

