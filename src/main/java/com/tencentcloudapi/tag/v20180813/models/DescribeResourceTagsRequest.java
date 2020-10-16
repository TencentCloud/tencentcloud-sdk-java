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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceTagsRequest extends AbstractModel{

    /**
    * 创建者uin
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * 资源所在地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 业务类型
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 资源前缀
    */
    @SerializedName("ResourcePrefix")
    @Expose
    private String ResourcePrefix;

    /**
    * 资源唯一标识
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 数据偏移量，默认为 0, 必须为Limit参数的整数倍
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页大小，默认为 15
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 是否是cos的资源（0或者1），输入的ResourceId为cos资源时必填
    */
    @SerializedName("CosResourceId")
    @Expose
    private Long CosResourceId;

    /**
     * Get 创建者uin 
     * @return CreateUin 创建者uin
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建者uin
     * @param CreateUin 创建者uin
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 资源所在地域 
     * @return ResourceRegion 资源所在地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在地域
     * @param ResourceRegion 资源所在地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 业务类型 
     * @return ServiceType 业务类型
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 业务类型
     * @param ServiceType 业务类型
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 资源前缀 
     * @return ResourcePrefix 资源前缀
     */
    public String getResourcePrefix() {
        return this.ResourcePrefix;
    }

    /**
     * Set 资源前缀
     * @param ResourcePrefix 资源前缀
     */
    public void setResourcePrefix(String ResourcePrefix) {
        this.ResourcePrefix = ResourcePrefix;
    }

    /**
     * Get 资源唯一标识 
     * @return ResourceId 资源唯一标识
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源唯一标识
     * @param ResourceId 资源唯一标识
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 数据偏移量，默认为 0, 必须为Limit参数的整数倍 
     * @return Offset 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     * @param Offset 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页大小，默认为 15 
     * @return Limit 每页大小，默认为 15
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页大小，默认为 15
     * @param Limit 每页大小，默认为 15
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 是否是cos的资源（0或者1），输入的ResourceId为cos资源时必填 
     * @return CosResourceId 是否是cos的资源（0或者1），输入的ResourceId为cos资源时必填
     */
    public Long getCosResourceId() {
        return this.CosResourceId;
    }

    /**
     * Set 是否是cos的资源（0或者1），输入的ResourceId为cos资源时必填
     * @param CosResourceId 是否是cos的资源（0或者1），输入的ResourceId为cos资源时必填
     */
    public void setCosResourceId(Long CosResourceId) {
        this.CosResourceId = CosResourceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CosResourceId", this.CosResourceId);

    }
}

