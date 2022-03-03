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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateResourceConfigRequest extends AbstractModel{

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 位置信息
    */
    @SerializedName("ResourceLoc")
    @Expose
    private ResourceLoc ResourceLoc;

    /**
    * 资源描述信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 1： 资源版本达到上限，自动删除最早可删除的版本
    */
    @SerializedName("AutoDelete")
    @Expose
    private Long AutoDelete;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 位置信息 
     * @return ResourceLoc 位置信息
     */
    public ResourceLoc getResourceLoc() {
        return this.ResourceLoc;
    }

    /**
     * Set 位置信息
     * @param ResourceLoc 位置信息
     */
    public void setResourceLoc(ResourceLoc ResourceLoc) {
        this.ResourceLoc = ResourceLoc;
    }

    /**
     * Get 资源描述信息 
     * @return Remark 资源描述信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 资源描述信息
     * @param Remark 资源描述信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 1： 资源版本达到上限，自动删除最早可删除的版本 
     * @return AutoDelete 1： 资源版本达到上限，自动删除最早可删除的版本
     */
    public Long getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set 1： 资源版本达到上限，自动删除最早可删除的版本
     * @param AutoDelete 1： 资源版本达到上限，自动删除最早可删除的版本
     */
    public void setAutoDelete(Long AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public CreateResourceConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourceConfigRequest(CreateResourceConfigRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceLoc != null) {
            this.ResourceLoc = new ResourceLoc(source.ResourceLoc);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AutoDelete != null) {
            this.AutoDelete = new Long(source.AutoDelete);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamObj(map, prefix + "ResourceLoc.", this.ResourceLoc);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AutoDelete", this.AutoDelete);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

