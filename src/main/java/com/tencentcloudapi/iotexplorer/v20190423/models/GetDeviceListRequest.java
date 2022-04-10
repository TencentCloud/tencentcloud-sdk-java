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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDeviceListRequest extends AbstractModel{

    /**
    * 需要查看设备列表的产品ID, -1代表ProjectId来筛选
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 分页偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页的大小，数值范围 10-100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 设备固件版本号，若不带此参数会返回所有固件版本的设备。传"None-FirmwareVersion"查询无版本号的设备
    */
    @SerializedName("FirmwareVersion")
    @Expose
    private String FirmwareVersion;

    /**
    * 需要过滤的设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 项目ID。产品 ID 为 -1 时，该参数必填
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 需要查看设备列表的产品ID, -1代表ProjectId来筛选 
     * @return ProductId 需要查看设备列表的产品ID, -1代表ProjectId来筛选
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 需要查看设备列表的产品ID, -1代表ProjectId来筛选
     * @param ProductId 需要查看设备列表的产品ID, -1代表ProjectId来筛选
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 分页偏移 
     * @return Offset 分页偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移
     * @param Offset 分页偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页的大小，数值范围 10-100 
     * @return Limit 分页的大小，数值范围 10-100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的大小，数值范围 10-100
     * @param Limit 分页的大小，数值范围 10-100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 设备固件版本号，若不带此参数会返回所有固件版本的设备。传"None-FirmwareVersion"查询无版本号的设备 
     * @return FirmwareVersion 设备固件版本号，若不带此参数会返回所有固件版本的设备。传"None-FirmwareVersion"查询无版本号的设备
     */
    public String getFirmwareVersion() {
        return this.FirmwareVersion;
    }

    /**
     * Set 设备固件版本号，若不带此参数会返回所有固件版本的设备。传"None-FirmwareVersion"查询无版本号的设备
     * @param FirmwareVersion 设备固件版本号，若不带此参数会返回所有固件版本的设备。传"None-FirmwareVersion"查询无版本号的设备
     */
    public void setFirmwareVersion(String FirmwareVersion) {
        this.FirmwareVersion = FirmwareVersion;
    }

    /**
     * Get 需要过滤的设备名称 
     * @return DeviceName 需要过滤的设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 需要过滤的设备名称
     * @param DeviceName 需要过滤的设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 项目ID。产品 ID 为 -1 时，该参数必填 
     * @return ProjectId 项目ID。产品 ID 为 -1 时，该参数必填
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。产品 ID 为 -1 时，该参数必填
     * @param ProjectId 项目ID。产品 ID 为 -1 时，该参数必填
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public GetDeviceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDeviceListRequest(GetDeviceListRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FirmwareVersion != null) {
            this.FirmwareVersion = new String(source.FirmwareVersion);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FirmwareVersion", this.FirmwareVersion);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

