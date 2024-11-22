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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigFilesRequest extends AbstractModel {

    /**
    * 命名空间名称
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * TSE实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 组名
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 配置文件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private ConfigFileTag [] Tags;

    /**
    * 返回数量，默认为20，最大值为100。	
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。	
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 配置文件ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 命名空间名称 
     * @return Namespace 命名空间名称
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名称
     * @param Namespace 命名空间名称
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get TSE实例id 
     * @return InstanceId TSE实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TSE实例id
     * @param InstanceId TSE实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 组名 
     * @return Group 组名
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 组名
     * @param Group 组名
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 配置文件名称 
     * @return Name 配置文件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置文件名称
     * @param Name 配置文件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public ConfigFileTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(ConfigFileTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。	 
     * @return Limit 返回数量，默认为20，最大值为100。	
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。	
     * @param Limit 返回数量，默认为20，最大值为100。	
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。	 
     * @return Offset 偏移量，默认为0。	
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。	
     * @param Offset 偏移量，默认为0。	
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 配置文件ID 
     * @return Id 配置文件ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 配置文件ID
     * @param Id 配置文件ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public DescribeConfigFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigFilesRequest(DescribeConfigFilesRequest source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tags != null) {
            this.Tags = new ConfigFileTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ConfigFileTag(source.Tags[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

