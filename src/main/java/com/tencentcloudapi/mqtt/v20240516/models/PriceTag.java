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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PriceTag extends AbstractModel {

    /**
    * 计价名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 计价类别
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 计费项标签
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 步长
    */
    @SerializedName("Step")
    @Expose
    private Long Step;

    /**
     * Get 计价名称 
     * @return Name 计价名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 计价名称
     * @param Name 计价名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 计价类别 
     * @return Category 计价类别
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 计价类别
     * @param Category 计价类别
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 计费项标签 
     * @return Code 计费项标签
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 计费项标签
     * @param Code 计费项标签
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 步长 
     * @return Step 步长
     */
    public Long getStep() {
        return this.Step;
    }

    /**
     * Set 步长
     * @param Step 步长
     */
    public void setStep(Long Step) {
        this.Step = Step;
    }

    public PriceTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PriceTag(PriceTag source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Step != null) {
            this.Step = new Long(source.Step);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Step", this.Step);

    }
}

