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

public class AddressTemplate extends AbstractModel {

    /**
    * IP地址模板名称。
    */
    @SerializedName("AddressTemplateName")
    @Expose
    private String AddressTemplateName;

    /**
    * IP地址模板实例唯一ID。
    */
    @SerializedName("AddressTemplateId")
    @Expose
    private String AddressTemplateId;

    /**
    * IP地址信息。
    */
    @SerializedName("AddressSet")
    @Expose
    private String [] AddressSet;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 最后更新时间。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 带备注的IP地址信息。
    */
    @SerializedName("AddressExtraSet")
    @Expose
    private AddressInfo [] AddressExtraSet;

    /**
    * 标签键值对。	
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get IP地址模板名称。 
     * @return AddressTemplateName IP地址模板名称。
     */
    public String getAddressTemplateName() {
        return this.AddressTemplateName;
    }

    /**
     * Set IP地址模板名称。
     * @param AddressTemplateName IP地址模板名称。
     */
    public void setAddressTemplateName(String AddressTemplateName) {
        this.AddressTemplateName = AddressTemplateName;
    }

    /**
     * Get IP地址模板实例唯一ID。 
     * @return AddressTemplateId IP地址模板实例唯一ID。
     */
    public String getAddressTemplateId() {
        return this.AddressTemplateId;
    }

    /**
     * Set IP地址模板实例唯一ID。
     * @param AddressTemplateId IP地址模板实例唯一ID。
     */
    public void setAddressTemplateId(String AddressTemplateId) {
        this.AddressTemplateId = AddressTemplateId;
    }

    /**
     * Get IP地址信息。 
     * @return AddressSet IP地址信息。
     */
    public String [] getAddressSet() {
        return this.AddressSet;
    }

    /**
     * Set IP地址信息。
     * @param AddressSet IP地址信息。
     */
    public void setAddressSet(String [] AddressSet) {
        this.AddressSet = AddressSet;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
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

    /**
     * Get 带备注的IP地址信息。 
     * @return AddressExtraSet 带备注的IP地址信息。
     */
    public AddressInfo [] getAddressExtraSet() {
        return this.AddressExtraSet;
    }

    /**
     * Set 带备注的IP地址信息。
     * @param AddressExtraSet 带备注的IP地址信息。
     */
    public void setAddressExtraSet(AddressInfo [] AddressExtraSet) {
        this.AddressExtraSet = AddressExtraSet;
    }

    /**
     * Get 标签键值对。	 
     * @return TagSet 标签键值对。	
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对。	
     * @param TagSet 标签键值对。	
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public AddressTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressTemplate(AddressTemplate source) {
        if (source.AddressTemplateName != null) {
            this.AddressTemplateName = new String(source.AddressTemplateName);
        }
        if (source.AddressTemplateId != null) {
            this.AddressTemplateId = new String(source.AddressTemplateId);
        }
        if (source.AddressSet != null) {
            this.AddressSet = new String[source.AddressSet.length];
            for (int i = 0; i < source.AddressSet.length; i++) {
                this.AddressSet[i] = new String(source.AddressSet[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.AddressExtraSet != null) {
            this.AddressExtraSet = new AddressInfo[source.AddressExtraSet.length];
            for (int i = 0; i < source.AddressExtraSet.length; i++) {
                this.AddressExtraSet[i] = new AddressInfo(source.AddressExtraSet[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateName", this.AddressTemplateName);
        this.setParamSimple(map, prefix + "AddressTemplateId", this.AddressTemplateId);
        this.setParamArraySimple(map, prefix + "AddressSet.", this.AddressSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamArrayObj(map, prefix + "AddressExtraSet.", this.AddressExtraSet);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

