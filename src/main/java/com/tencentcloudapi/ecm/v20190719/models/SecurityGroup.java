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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroup extends AbstractModel{

    /**
    * 安全组实例ID，例如：esg-ohuuioma。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 安全组名称，可任意命名，但不得超过60个字符。
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * 安全组备注，最多100个字符。
    */
    @SerializedName("SecurityGroupDesc")
    @Expose
    private String SecurityGroupDesc;

    /**
    * 是否是默认安全组，默认安全组不支持删除。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 安全组创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 标签键值对。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get 安全组实例ID，例如：esg-ohuuioma。 
     * @return SecurityGroupId 安全组实例ID，例如：esg-ohuuioma。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组实例ID，例如：esg-ohuuioma。
     * @param SecurityGroupId 安全组实例ID，例如：esg-ohuuioma。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 安全组名称，可任意命名，但不得超过60个字符。 
     * @return SecurityGroupName 安全组名称，可任意命名，但不得超过60个字符。
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * Set 安全组名称，可任意命名，但不得超过60个字符。
     * @param SecurityGroupName 安全组名称，可任意命名，但不得超过60个字符。
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * Get 安全组备注，最多100个字符。 
     * @return SecurityGroupDesc 安全组备注，最多100个字符。
     */
    public String getSecurityGroupDesc() {
        return this.SecurityGroupDesc;
    }

    /**
     * Set 安全组备注，最多100个字符。
     * @param SecurityGroupDesc 安全组备注，最多100个字符。
     */
    public void setSecurityGroupDesc(String SecurityGroupDesc) {
        this.SecurityGroupDesc = SecurityGroupDesc;
    }

    /**
     * Get 是否是默认安全组，默认安全组不支持删除。 
     * @return IsDefault 是否是默认安全组，默认安全组不支持删除。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否是默认安全组，默认安全组不支持删除。
     * @param IsDefault 是否是默认安全组，默认安全组不支持删除。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 安全组创建时间。 
     * @return CreatedTime 安全组创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 安全组创建时间。
     * @param CreatedTime 安全组创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
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

    public SecurityGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroup(SecurityGroup source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.SecurityGroupName != null) {
            this.SecurityGroupName = new String(source.SecurityGroupName);
        }
        if (source.SecurityGroupDesc != null) {
            this.SecurityGroupDesc = new String(source.SecurityGroupDesc);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
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
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupDesc", this.SecurityGroupDesc);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

