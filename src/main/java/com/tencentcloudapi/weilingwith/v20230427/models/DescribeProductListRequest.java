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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductListRequest extends AbstractModel {

    /**
    * 工作空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 分页查询，第几页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页条数，大于0
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 设备类型
    */
    @SerializedName("DeviceTypeSet")
    @Expose
    private String [] DeviceTypeSet;

    /**
    * 产品 pid
    */
    @SerializedName("ProductIdSet")
    @Expose
    private Long [] ProductIdSet;

    /**
    * 模型id
    */
    @SerializedName("ModelIdSet")
    @Expose
    private String [] ModelIdSet;

    /**
     * Get 工作空间id 
     * @return WorkspaceId 工作空间id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间id
     * @param WorkspaceId 工作空间id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 分页查询，第几页 
     * @return PageNumber 分页查询，第几页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页查询，第几页
     * @param PageNumber 分页查询，第几页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页条数，大于0 
     * @return PageSize 每页条数，大于0
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页条数，大于0
     * @param PageSize 每页条数，大于0
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    /**
     * Get 设备类型 
     * @return DeviceTypeSet 设备类型
     */
    public String [] getDeviceTypeSet() {
        return this.DeviceTypeSet;
    }

    /**
     * Set 设备类型
     * @param DeviceTypeSet 设备类型
     */
    public void setDeviceTypeSet(String [] DeviceTypeSet) {
        this.DeviceTypeSet = DeviceTypeSet;
    }

    /**
     * Get 产品 pid 
     * @return ProductIdSet 产品 pid
     */
    public Long [] getProductIdSet() {
        return this.ProductIdSet;
    }

    /**
     * Set 产品 pid
     * @param ProductIdSet 产品 pid
     */
    public void setProductIdSet(Long [] ProductIdSet) {
        this.ProductIdSet = ProductIdSet;
    }

    /**
     * Get 模型id 
     * @return ModelIdSet 模型id
     */
    public String [] getModelIdSet() {
        return this.ModelIdSet;
    }

    /**
     * Set 模型id
     * @param ModelIdSet 模型id
     */
    public void setModelIdSet(String [] ModelIdSet) {
        this.ModelIdSet = ModelIdSet;
    }

    public DescribeProductListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductListRequest(DescribeProductListRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.DeviceTypeSet != null) {
            this.DeviceTypeSet = new String[source.DeviceTypeSet.length];
            for (int i = 0; i < source.DeviceTypeSet.length; i++) {
                this.DeviceTypeSet[i] = new String(source.DeviceTypeSet[i]);
            }
        }
        if (source.ProductIdSet != null) {
            this.ProductIdSet = new Long[source.ProductIdSet.length];
            for (int i = 0; i < source.ProductIdSet.length; i++) {
                this.ProductIdSet[i] = new Long(source.ProductIdSet[i]);
            }
        }
        if (source.ModelIdSet != null) {
            this.ModelIdSet = new String[source.ModelIdSet.length];
            for (int i = 0; i < source.ModelIdSet.length; i++) {
                this.ModelIdSet[i] = new String(source.ModelIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamArraySimple(map, prefix + "DeviceTypeSet.", this.DeviceTypeSet);
        this.setParamArraySimple(map, prefix + "ProductIdSet.", this.ProductIdSet);
        this.setParamArraySimple(map, prefix + "ModelIdSet.", this.ModelIdSet);

    }
}

