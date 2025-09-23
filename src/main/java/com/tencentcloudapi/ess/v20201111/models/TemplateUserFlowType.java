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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateUserFlowType extends AbstractModel {

    /**
    * 合同类型id
    */
    @SerializedName("UserFlowTypeId")
    @Expose
    private String UserFlowTypeId;

    /**
    * 合同类型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 合同类型的具体描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 每个合同类型绑定的模板数量
    */
    @SerializedName("TemplateNum")
    @Expose
    private Long TemplateNum;

    /**
     * Get 合同类型id 
     * @return UserFlowTypeId 合同类型id
     */
    public String getUserFlowTypeId() {
        return this.UserFlowTypeId;
    }

    /**
     * Set 合同类型id
     * @param UserFlowTypeId 合同类型id
     */
    public void setUserFlowTypeId(String UserFlowTypeId) {
        this.UserFlowTypeId = UserFlowTypeId;
    }

    /**
     * Get 合同类型名称 
     * @return Name 合同类型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 合同类型名称
     * @param Name 合同类型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 合同类型的具体描述 
     * @return Description 合同类型的具体描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 合同类型的具体描述
     * @param Description 合同类型的具体描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 每个合同类型绑定的模板数量 
     * @return TemplateNum 每个合同类型绑定的模板数量
     */
    public Long getTemplateNum() {
        return this.TemplateNum;
    }

    /**
     * Set 每个合同类型绑定的模板数量
     * @param TemplateNum 每个合同类型绑定的模板数量
     */
    public void setTemplateNum(Long TemplateNum) {
        this.TemplateNum = TemplateNum;
    }

    public TemplateUserFlowType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateUserFlowType(TemplateUserFlowType source) {
        if (source.UserFlowTypeId != null) {
            this.UserFlowTypeId = new String(source.UserFlowTypeId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TemplateNum != null) {
            this.TemplateNum = new Long(source.TemplateNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserFlowTypeId", this.UserFlowTypeId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TemplateNum", this.TemplateNum);

    }
}

