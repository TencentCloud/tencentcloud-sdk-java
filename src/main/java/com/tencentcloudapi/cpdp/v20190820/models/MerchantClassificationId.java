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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MerchantClassificationId extends AbstractModel{

    /**
    * 分类编号
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 分类名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 父级编号（0为一级编号，大于0为父级分类编号）
    */
    @SerializedName("Parent")
    @Expose
    private String Parent;

    /**
     * Get 分类编号 
     * @return Code 分类编号
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 分类编号
     * @param Code 分类编号
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 分类名称 
     * @return Name 分类名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分类名称
     * @param Name 分类名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 父级编号（0为一级编号，大于0为父级分类编号） 
     * @return Parent 父级编号（0为一级编号，大于0为父级分类编号）
     */
    public String getParent() {
        return this.Parent;
    }

    /**
     * Set 父级编号（0为一级编号，大于0为父级分类编号）
     * @param Parent 父级编号（0为一级编号，大于0为父级分类编号）
     */
    public void setParent(String Parent) {
        this.Parent = Parent;
    }

    public MerchantClassificationId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MerchantClassificationId(MerchantClassificationId source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Parent != null) {
            this.Parent = new String(source.Parent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Parent", this.Parent);

    }
}

