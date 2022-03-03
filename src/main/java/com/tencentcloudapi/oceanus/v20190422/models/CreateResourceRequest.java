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

public class CreateResourceRequest extends AbstractModel{

    /**
    * 资源位置
    */
    @SerializedName("ResourceLoc")
    @Expose
    private ResourceLoc ResourceLoc;

    /**
    * 资源类型。目前只支持 JAR，取值为 1
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 资源描述
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 资源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资源版本描述
    */
    @SerializedName("ResourceConfigRemark")
    @Expose
    private String ResourceConfigRemark;

    /**
    * 目录ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 资源位置 
     * @return ResourceLoc 资源位置
     */
    public ResourceLoc getResourceLoc() {
        return this.ResourceLoc;
    }

    /**
     * Set 资源位置
     * @param ResourceLoc 资源位置
     */
    public void setResourceLoc(ResourceLoc ResourceLoc) {
        this.ResourceLoc = ResourceLoc;
    }

    /**
     * Get 资源类型。目前只支持 JAR，取值为 1 
     * @return ResourceType 资源类型。目前只支持 JAR，取值为 1
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型。目前只支持 JAR，取值为 1
     * @param ResourceType 资源类型。目前只支持 JAR，取值为 1
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源描述 
     * @return Remark 资源描述
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 资源描述
     * @param Remark 资源描述
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 资源名称 
     * @return Name 资源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名称
     * @param Name 资源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资源版本描述 
     * @return ResourceConfigRemark 资源版本描述
     */
    public String getResourceConfigRemark() {
        return this.ResourceConfigRemark;
    }

    /**
     * Set 资源版本描述
     * @param ResourceConfigRemark 资源版本描述
     */
    public void setResourceConfigRemark(String ResourceConfigRemark) {
        this.ResourceConfigRemark = ResourceConfigRemark;
    }

    /**
     * Get 目录ID 
     * @return FolderId 目录ID
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 目录ID
     * @param FolderId 目录ID
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
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

    public CreateResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourceRequest(CreateResourceRequest source) {
        if (source.ResourceLoc != null) {
            this.ResourceLoc = new ResourceLoc(source.ResourceLoc);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ResourceConfigRemark != null) {
            this.ResourceConfigRemark = new String(source.ResourceConfigRemark);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ResourceLoc.", this.ResourceLoc);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ResourceConfigRemark", this.ResourceConfigRemark);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

