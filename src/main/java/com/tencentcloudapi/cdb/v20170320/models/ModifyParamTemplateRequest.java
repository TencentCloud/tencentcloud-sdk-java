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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyParamTemplateRequest extends AbstractModel{

    /**
    * 模板 ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 模板名称，长度不超过64。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述，长度不超过255。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 参数列表。
    */
    @SerializedName("ParamList")
    @Expose
    private Parameter [] ParamList;

    /**
     * Get 模板 ID。 
     * @return TemplateId 模板 ID。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板 ID。
     * @param TemplateId 模板 ID。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名称，长度不超过64。 
     * @return Name 模板名称，长度不超过64。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称，长度不超过64。
     * @param Name 模板名称，长度不超过64。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板描述，长度不超过255。 
     * @return Description 模板描述，长度不超过255。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 模板描述，长度不超过255。
     * @param Description 模板描述，长度不超过255。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 参数列表。 
     * @return ParamList 参数列表。
     */
    public Parameter [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set 参数列表。
     * @param ParamList 参数列表。
     */
    public void setParamList(Parameter [] ParamList) {
        this.ParamList = ParamList;
    }

    public ModifyParamTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyParamTemplateRequest(ModifyParamTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ParamList != null) {
            this.ParamList = new Parameter[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new Parameter(source.ParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}

