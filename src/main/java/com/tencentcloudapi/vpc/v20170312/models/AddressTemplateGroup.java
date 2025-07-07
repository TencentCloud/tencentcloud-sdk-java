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

public class AddressTemplateGroup extends AbstractModel {

    /**
    * IP地址模板集合名称。
    */
    @SerializedName("AddressTemplateGroupName")
    @Expose
    private String AddressTemplateGroupName;

    /**
    * IP地址模板集合实例ID，例如：ipmg-dih8xdbq。
    */
    @SerializedName("AddressTemplateGroupId")
    @Expose
    private String AddressTemplateGroupId;

    /**
    * IP地址模板ID。
    */
    @SerializedName("AddressTemplateIdSet")
    @Expose
    private String [] AddressTemplateIdSet;

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
    * IP地址模板实例。
    */
    @SerializedName("AddressTemplateSet")
    @Expose
    private AddressTemplateItem [] AddressTemplateSet;

    /**
    * 标签键值对。	
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get IP地址模板集合名称。 
     * @return AddressTemplateGroupName IP地址模板集合名称。
     */
    public String getAddressTemplateGroupName() {
        return this.AddressTemplateGroupName;
    }

    /**
     * Set IP地址模板集合名称。
     * @param AddressTemplateGroupName IP地址模板集合名称。
     */
    public void setAddressTemplateGroupName(String AddressTemplateGroupName) {
        this.AddressTemplateGroupName = AddressTemplateGroupName;
    }

    /**
     * Get IP地址模板集合实例ID，例如：ipmg-dih8xdbq。 
     * @return AddressTemplateGroupId IP地址模板集合实例ID，例如：ipmg-dih8xdbq。
     */
    public String getAddressTemplateGroupId() {
        return this.AddressTemplateGroupId;
    }

    /**
     * Set IP地址模板集合实例ID，例如：ipmg-dih8xdbq。
     * @param AddressTemplateGroupId IP地址模板集合实例ID，例如：ipmg-dih8xdbq。
     */
    public void setAddressTemplateGroupId(String AddressTemplateGroupId) {
        this.AddressTemplateGroupId = AddressTemplateGroupId;
    }

    /**
     * Get IP地址模板ID。 
     * @return AddressTemplateIdSet IP地址模板ID。
     */
    public String [] getAddressTemplateIdSet() {
        return this.AddressTemplateIdSet;
    }

    /**
     * Set IP地址模板ID。
     * @param AddressTemplateIdSet IP地址模板ID。
     */
    public void setAddressTemplateIdSet(String [] AddressTemplateIdSet) {
        this.AddressTemplateIdSet = AddressTemplateIdSet;
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
     * Get IP地址模板实例。 
     * @return AddressTemplateSet IP地址模板实例。
     */
    public AddressTemplateItem [] getAddressTemplateSet() {
        return this.AddressTemplateSet;
    }

    /**
     * Set IP地址模板实例。
     * @param AddressTemplateSet IP地址模板实例。
     */
    public void setAddressTemplateSet(AddressTemplateItem [] AddressTemplateSet) {
        this.AddressTemplateSet = AddressTemplateSet;
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

    public AddressTemplateGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressTemplateGroup(AddressTemplateGroup source) {
        if (source.AddressTemplateGroupName != null) {
            this.AddressTemplateGroupName = new String(source.AddressTemplateGroupName);
        }
        if (source.AddressTemplateGroupId != null) {
            this.AddressTemplateGroupId = new String(source.AddressTemplateGroupId);
        }
        if (source.AddressTemplateIdSet != null) {
            this.AddressTemplateIdSet = new String[source.AddressTemplateIdSet.length];
            for (int i = 0; i < source.AddressTemplateIdSet.length; i++) {
                this.AddressTemplateIdSet[i] = new String(source.AddressTemplateIdSet[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.AddressTemplateSet != null) {
            this.AddressTemplateSet = new AddressTemplateItem[source.AddressTemplateSet.length];
            for (int i = 0; i < source.AddressTemplateSet.length; i++) {
                this.AddressTemplateSet[i] = new AddressTemplateItem(source.AddressTemplateSet[i]);
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
        this.setParamSimple(map, prefix + "AddressTemplateGroupName", this.AddressTemplateGroupName);
        this.setParamSimple(map, prefix + "AddressTemplateGroupId", this.AddressTemplateGroupId);
        this.setParamArraySimple(map, prefix + "AddressTemplateIdSet.", this.AddressTemplateIdSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamArrayObj(map, prefix + "AddressTemplateSet.", this.AddressTemplateSet);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

