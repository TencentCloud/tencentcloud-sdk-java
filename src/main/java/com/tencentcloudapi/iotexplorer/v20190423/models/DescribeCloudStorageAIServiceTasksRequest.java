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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudStorageAIServiceTasksRequest extends AbstractModel {

    /**
    * 产品 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 云存 AI 服务类型。可选值：PackageDetect
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 分页拉取数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页拉取偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空；不传则查询全部状态的任务）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 产品 ID 
     * @return ProductId 产品 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品 ID
     * @param ProductId 产品 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 云存 AI 服务类型。可选值：PackageDetect 
     * @return ServiceType 云存 AI 服务类型。可选值：PackageDetect
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 云存 AI 服务类型。可选值：PackageDetect
     * @param ServiceType 云存 AI 服务类型。可选值：PackageDetect
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 分页拉取数量 
     * @return Limit 分页拉取数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页拉取数量
     * @param Limit 分页拉取数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页拉取偏移 
     * @return Offset 分页拉取偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页拉取偏移
     * @param Offset 分页拉取偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空；不传则查询全部状态的任务） 
     * @return Status 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空；不传则查询全部状态的任务）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空；不传则查询全部状态的任务）
     * @param Status 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空；不传则查询全部状态的任务）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DescribeCloudStorageAIServiceTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudStorageAIServiceTasksRequest(DescribeCloudStorageAIServiceTasksRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

