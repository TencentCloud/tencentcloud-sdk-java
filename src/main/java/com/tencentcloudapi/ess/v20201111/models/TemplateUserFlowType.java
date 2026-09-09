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
    * <p>合同类型id</p>
    */
    @SerializedName("UserFlowTypeId")
    @Expose
    private String UserFlowTypeId;

    /**
    * <p>合同类型名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>合同类型的具体描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>每个合同类型绑定的模板数量</p>
    */
    @SerializedName("TemplateNum")
    @Expose
    private Long TemplateNum;

    /**
    * <p>自定义合同类型状态</p><p>枚举值：</p><ul><li>0： 未启用</li><li>1： 启用</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>合同类型id</p> 
     * @return UserFlowTypeId <p>合同类型id</p>
     */
    public String getUserFlowTypeId() {
        return this.UserFlowTypeId;
    }

    /**
     * Set <p>合同类型id</p>
     * @param UserFlowTypeId <p>合同类型id</p>
     */
    public void setUserFlowTypeId(String UserFlowTypeId) {
        this.UserFlowTypeId = UserFlowTypeId;
    }

    /**
     * Get <p>合同类型名称</p> 
     * @return Name <p>合同类型名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>合同类型名称</p>
     * @param Name <p>合同类型名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>合同类型的具体描述</p> 
     * @return Description <p>合同类型的具体描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>合同类型的具体描述</p>
     * @param Description <p>合同类型的具体描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>每个合同类型绑定的模板数量</p> 
     * @return TemplateNum <p>每个合同类型绑定的模板数量</p>
     */
    public Long getTemplateNum() {
        return this.TemplateNum;
    }

    /**
     * Set <p>每个合同类型绑定的模板数量</p>
     * @param TemplateNum <p>每个合同类型绑定的模板数量</p>
     */
    public void setTemplateNum(Long TemplateNum) {
        this.TemplateNum = TemplateNum;
    }

    /**
     * Get <p>自定义合同类型状态</p><p>枚举值：</p><ul><li>0： 未启用</li><li>1： 启用</li></ul> 
     * @return Status <p>自定义合同类型状态</p><p>枚举值：</p><ul><li>0： 未启用</li><li>1： 启用</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>自定义合同类型状态</p><p>枚举值：</p><ul><li>0： 未启用</li><li>1： 启用</li></ul>
     * @param Status <p>自定义合同类型状态</p><p>枚举值：</p><ul><li>0： 未启用</li><li>1： 启用</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

