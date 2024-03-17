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

public class DeleteConfigFilesRequest extends AbstractModel {

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

    public DeleteConfigFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteConfigFilesRequest(DeleteConfigFilesRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

