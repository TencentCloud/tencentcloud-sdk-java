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

public class UpdateCustomPersonRequest extends AbstractModel{

    /**
    * 待更新的自定义人物Id
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 更新后的自定义人物名称，如为空则不更新
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 更新后的自定义人物简介，如为空则不更新
    */
    @SerializedName("BasicInfo")
    @Expose
    private String BasicInfo;

    /**
    * 更新后的分类信息，如为空则不更新
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
     * Get 待更新的自定义人物Id 
     * @return PersonId 待更新的自定义人物Id
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 待更新的自定义人物Id
     * @param PersonId 待更新的自定义人物Id
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 更新后的自定义人物名称，如为空则不更新 
     * @return Name 更新后的自定义人物名称，如为空则不更新
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 更新后的自定义人物名称，如为空则不更新
     * @param Name 更新后的自定义人物名称，如为空则不更新
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 更新后的自定义人物简介，如为空则不更新 
     * @return BasicInfo 更新后的自定义人物简介，如为空则不更新
     */
    public String getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * Set 更新后的自定义人物简介，如为空则不更新
     * @param BasicInfo 更新后的自定义人物简介，如为空则不更新
     */
    public void setBasicInfo(String BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    /**
     * Get 更新后的分类信息，如为空则不更新 
     * @return CategoryId 更新后的分类信息，如为空则不更新
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 更新后的分类信息，如为空则不更新
     * @param CategoryId 更新后的分类信息，如为空则不更新
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    public UpdateCustomPersonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCustomPersonRequest(UpdateCustomPersonRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BasicInfo != null) {
            this.BasicInfo = new String(source.BasicInfo);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BasicInfo", this.BasicInfo);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);

    }
}

