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

public class DescribeConfigFileReleaseHistoriesRequest extends AbstractModel {

    /**
    * TSE实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 组
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 发布历史记录id，用于分页优化，一般指定 EndId，就不用指定 Offset，否则分页可能不连续
    */
    @SerializedName("EndId")
    @Expose
    private Long EndId;

    /**
    * 配置文件ID
    */
    @SerializedName("ConfigFileId")
    @Expose
    private String ConfigFileId;

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
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 组 
     * @return Group 组
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 组
     * @param Group 组
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 发布历史记录id，用于分页优化，一般指定 EndId，就不用指定 Offset，否则分页可能不连续 
     * @return EndId 发布历史记录id，用于分页优化，一般指定 EndId，就不用指定 Offset，否则分页可能不连续
     */
    public Long getEndId() {
        return this.EndId;
    }

    /**
     * Set 发布历史记录id，用于分页优化，一般指定 EndId，就不用指定 Offset，否则分页可能不连续
     * @param EndId 发布历史记录id，用于分页优化，一般指定 EndId，就不用指定 Offset，否则分页可能不连续
     */
    public void setEndId(Long EndId) {
        this.EndId = EndId;
    }

    /**
     * Get 配置文件ID 
     * @return ConfigFileId 配置文件ID
     */
    public String getConfigFileId() {
        return this.ConfigFileId;
    }

    /**
     * Set 配置文件ID
     * @param ConfigFileId 配置文件ID
     */
    public void setConfigFileId(String ConfigFileId) {
        this.ConfigFileId = ConfigFileId;
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

    public DescribeConfigFileReleaseHistoriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigFileReleaseHistoriesRequest(DescribeConfigFileReleaseHistoriesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EndId != null) {
            this.EndId = new Long(source.EndId);
        }
        if (source.ConfigFileId != null) {
            this.ConfigFileId = new String(source.ConfigFileId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EndId", this.EndId);
        this.setParamSimple(map, prefix + "ConfigFileId", this.ConfigFileId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

