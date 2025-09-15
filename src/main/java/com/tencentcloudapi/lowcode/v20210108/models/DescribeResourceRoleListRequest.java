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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceRoleListRequest extends AbstractModel {

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 预览：pre；非预览：prod
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 子资源类型
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 页码
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源类型 
     * @return ResourceType 资源类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
     * @param ResourceType 资源类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 预览：pre；非预览：prod 
     * @return EnvType 预览：pre；非预览：prod
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set 预览：pre；非预览：prod
     * @param EnvType 预览：pre；非预览：prod
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 子资源类型 
     * @return SubType 子资源类型
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 子资源类型
     * @param SubType 子资源类型
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 页码 
     * @return PageNo 页码
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页码
     * @param PageNo 页码
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeResourceRoleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceRoleListRequest(DescribeResourceRoleListRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

