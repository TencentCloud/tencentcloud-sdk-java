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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddressTemplateItem extends AbstractModel {

    /**
    * IP地址模板ID
    */
    @SerializedName("AddressTemplateId")
    @Expose
    private String AddressTemplateId;

    /**
    * IP模板名称，废弃字段。
    */
    @SerializedName("AddressTemplateName")
    @Expose
    private String AddressTemplateName;

    /**
    * 废弃字段。
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 废弃字段
    */
    @SerializedName("To")
    @Expose
    private String To;

    /**
    * 备注。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 最后更新时间。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get IP地址模板ID 
     * @return AddressTemplateId IP地址模板ID
     */
    public String getAddressTemplateId() {
        return this.AddressTemplateId;
    }

    /**
     * Set IP地址模板ID
     * @param AddressTemplateId IP地址模板ID
     */
    public void setAddressTemplateId(String AddressTemplateId) {
        this.AddressTemplateId = AddressTemplateId;
    }

    /**
     * Get IP模板名称，废弃字段。 
     * @return AddressTemplateName IP模板名称，废弃字段。
     */
    public String getAddressTemplateName() {
        return this.AddressTemplateName;
    }

    /**
     * Set IP模板名称，废弃字段。
     * @param AddressTemplateName IP模板名称，废弃字段。
     */
    public void setAddressTemplateName(String AddressTemplateName) {
        this.AddressTemplateName = AddressTemplateName;
    }

    /**
     * Get 废弃字段。 
     * @return From 废弃字段。
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 废弃字段。
     * @param From 废弃字段。
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 废弃字段 
     * @return To 废弃字段
     */
    public String getTo() {
        return this.To;
    }

    /**
     * Set 废弃字段
     * @param To 废弃字段
     */
    public void setTo(String To) {
        this.To = To;
    }

    /**
     * Get 备注。 
     * @return Description 备注。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注。
     * @param Description 备注。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 最后更新时间。 
     * @return UpdatedTime 最后更新时间。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 最后更新时间。
     * @param UpdatedTime 最后更新时间。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public AddressTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressTemplateItem(AddressTemplateItem source) {
        if (source.AddressTemplateId != null) {
            this.AddressTemplateId = new String(source.AddressTemplateId);
        }
        if (source.AddressTemplateName != null) {
            this.AddressTemplateName = new String(source.AddressTemplateName);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.To != null) {
            this.To = new String(source.To);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateId", this.AddressTemplateId);
        this.setParamSimple(map, prefix + "AddressTemplateName", this.AddressTemplateName);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

