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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDevicesRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 是否返回全量数据
当该值为false时，返回值中的设备物模型、固件版本、在线状态、最后在线时间字段等字段，都将返回数据类型的零值。
    */
    @SerializedName("ReturnModel")
    @Expose
    private Boolean ReturnModel;

    /**
    * 分页数量,0<取值范围<=100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移，取值＞0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 指定固件版本号，为空查询此产品下所有设备
    */
    @SerializedName("OtaVersion")
    @Expose
    private String OtaVersion;

    /**
    * 设备名称，支持左前缀模糊匹配
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 是否返回全量数据
当该值为false时，返回值中的设备物模型、固件版本、在线状态、最后在线时间字段等字段，都将返回数据类型的零值。 
     * @return ReturnModel 是否返回全量数据
当该值为false时，返回值中的设备物模型、固件版本、在线状态、最后在线时间字段等字段，都将返回数据类型的零值。
     */
    public Boolean getReturnModel() {
        return this.ReturnModel;
    }

    /**
     * Set 是否返回全量数据
当该值为false时，返回值中的设备物模型、固件版本、在线状态、最后在线时间字段等字段，都将返回数据类型的零值。
     * @param ReturnModel 是否返回全量数据
当该值为false时，返回值中的设备物模型、固件版本、在线状态、最后在线时间字段等字段，都将返回数据类型的零值。
     */
    public void setReturnModel(Boolean ReturnModel) {
        this.ReturnModel = ReturnModel;
    }

    /**
     * Get 分页数量,0<取值范围<=100 
     * @return Limit 分页数量,0<取值范围<=100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页数量,0<取值范围<=100
     * @param Limit 分页数量,0<取值范围<=100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移，取值＞0 
     * @return Offset 分页偏移，取值＞0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移，取值＞0
     * @param Offset 分页偏移，取值＞0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 指定固件版本号，为空查询此产品下所有设备 
     * @return OtaVersion 指定固件版本号，为空查询此产品下所有设备
     */
    public String getOtaVersion() {
        return this.OtaVersion;
    }

    /**
     * Set 指定固件版本号，为空查询此产品下所有设备
     * @param OtaVersion 指定固件版本号，为空查询此产品下所有设备
     */
    public void setOtaVersion(String OtaVersion) {
        this.OtaVersion = OtaVersion;
    }

    /**
     * Get 设备名称，支持左前缀模糊匹配 
     * @return DeviceName 设备名称，支持左前缀模糊匹配
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称，支持左前缀模糊匹配
     * @param DeviceName 设备名称，支持左前缀模糊匹配
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ReturnModel", this.ReturnModel);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OtaVersion", this.OtaVersion);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);

    }
}

