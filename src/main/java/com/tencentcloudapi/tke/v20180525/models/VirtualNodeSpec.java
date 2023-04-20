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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirtualNodeSpec extends AbstractModel{

    /**
    * 节点展示名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 腾讯云标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 节点展示名称 
     * @return DisplayName 节点展示名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 节点展示名称
     * @param DisplayName 节点展示名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 腾讯云标签 
     * @return Tags 腾讯云标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 腾讯云标签
     * @param Tags 腾讯云标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public VirtualNodeSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirtualNodeSpec(VirtualNodeSpec source) {
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

