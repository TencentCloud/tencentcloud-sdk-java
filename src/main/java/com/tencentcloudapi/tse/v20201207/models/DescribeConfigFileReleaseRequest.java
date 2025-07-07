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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigFileReleaseRequest extends AbstractModel {

    /**
    * TSE实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 命名空间名称
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 配置分组名称
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
    * 配置文件发布名称
    */
    @SerializedName("ReleaseName")
    @Expose
    private String ReleaseName;

    /**
    * 配置文件发布Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

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
     * Get 配置分组名称 
     * @return Group 配置分组名称
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 配置分组名称
     * @param Group 配置分组名称
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
     * Get 配置文件发布名称 
     * @return ReleaseName 配置文件发布名称
     */
    public String getReleaseName() {
        return this.ReleaseName;
    }

    /**
     * Set 配置文件发布名称
     * @param ReleaseName 配置文件发布名称
     */
    public void setReleaseName(String ReleaseName) {
        this.ReleaseName = ReleaseName;
    }

    /**
     * Get 配置文件发布Id 
     * @return Id 配置文件发布Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 配置文件发布Id
     * @param Id 配置文件发布Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public DescribeConfigFileReleaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigFileReleaseRequest(DescribeConfigFileReleaseRequest source) {
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
        if (source.ReleaseName != null) {
            this.ReleaseName = new String(source.ReleaseName);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
        this.setParamSimple(map, prefix + "ReleaseName", this.ReleaseName);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

