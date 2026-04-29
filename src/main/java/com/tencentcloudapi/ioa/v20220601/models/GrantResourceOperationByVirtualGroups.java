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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GrantResourceOperationByVirtualGroups extends AbstractModel {

    /**
    * 操作类型: 1-增加授权 2-删除授权;
    */
    @SerializedName("OperationType")
    @Expose
    private Long OperationType;

    /**
    * 资源或资源组Id
    */
    @SerializedName("ResourceId")
    @Expose
    private Long ResourceId;

    /**
    * 资源类型 ,1:资源 2:资源组
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 过期时间,时间戳(秒)
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 分组id
    */
    @SerializedName("VirtualAccountGroupId")
    @Expose
    private Long VirtualAccountGroupId;

    /**
     * Get 操作类型: 1-增加授权 2-删除授权; 
     * @return OperationType 操作类型: 1-增加授权 2-删除授权;
     */
    public Long getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型: 1-增加授权 2-删除授权;
     * @param OperationType 操作类型: 1-增加授权 2-删除授权;
     */
    public void setOperationType(Long OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 资源或资源组Id 
     * @return ResourceId 资源或资源组Id
     */
    public Long getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源或资源组Id
     * @param ResourceId 资源或资源组Id
     */
    public void setResourceId(Long ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源类型 ,1:资源 2:资源组 
     * @return ResourceType 资源类型 ,1:资源 2:资源组
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型 ,1:资源 2:资源组
     * @param ResourceType 资源类型 ,1:资源 2:资源组
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 过期时间,时间戳(秒) 
     * @return ExpireTime 过期时间,时间戳(秒)
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间,时间戳(秒)
     * @param ExpireTime 过期时间,时间戳(秒)
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 分组id 
     * @return VirtualAccountGroupId 分组id
     */
    public Long getVirtualAccountGroupId() {
        return this.VirtualAccountGroupId;
    }

    /**
     * Set 分组id
     * @param VirtualAccountGroupId 分组id
     */
    public void setVirtualAccountGroupId(Long VirtualAccountGroupId) {
        this.VirtualAccountGroupId = VirtualAccountGroupId;
    }

    public GrantResourceOperationByVirtualGroups() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrantResourceOperationByVirtualGroups(GrantResourceOperationByVirtualGroups source) {
        if (source.OperationType != null) {
            this.OperationType = new Long(source.OperationType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new Long(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.VirtualAccountGroupId != null) {
            this.VirtualAccountGroupId = new Long(source.VirtualAccountGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "VirtualAccountGroupId", this.VirtualAccountGroupId);

    }
}

