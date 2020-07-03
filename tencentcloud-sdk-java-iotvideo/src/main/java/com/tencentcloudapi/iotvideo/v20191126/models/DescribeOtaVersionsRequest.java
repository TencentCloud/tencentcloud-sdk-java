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

public class DescribeOtaVersionsRequest extends AbstractModel{

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量，0<取值范围<=100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 产品ID，为空时查询客户所有产品的版本信息
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 版本号，支持模糊匹配
    */
    @SerializedName("OtaVersion")
    @Expose
    private String OtaVersion;

    /**
    * 版本类型 1未发布 2测试发布 3正式发布 4禁用
    */
    @SerializedName("PubStatus")
    @Expose
    private Long PubStatus;

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数量，0<取值范围<=100 
     * @return Limit 每页数量，0<取值范围<=100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，0<取值范围<=100
     * @param Limit 每页数量，0<取值范围<=100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 产品ID，为空时查询客户所有产品的版本信息 
     * @return ProductId 产品ID，为空时查询客户所有产品的版本信息
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID，为空时查询客户所有产品的版本信息
     * @param ProductId 产品ID，为空时查询客户所有产品的版本信息
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 版本号，支持模糊匹配 
     * @return OtaVersion 版本号，支持模糊匹配
     */
    public String getOtaVersion() {
        return this.OtaVersion;
    }

    /**
     * Set 版本号，支持模糊匹配
     * @param OtaVersion 版本号，支持模糊匹配
     */
    public void setOtaVersion(String OtaVersion) {
        this.OtaVersion = OtaVersion;
    }

    /**
     * Get 版本类型 1未发布 2测试发布 3正式发布 4禁用 
     * @return PubStatus 版本类型 1未发布 2测试发布 3正式发布 4禁用
     */
    public Long getPubStatus() {
        return this.PubStatus;
    }

    /**
     * Set 版本类型 1未发布 2测试发布 3正式发布 4禁用
     * @param PubStatus 版本类型 1未发布 2测试发布 3正式发布 4禁用
     */
    public void setPubStatus(Long PubStatus) {
        this.PubStatus = PubStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "OtaVersion", this.OtaVersion);
        this.setParamSimple(map, prefix + "PubStatus", this.PubStatus);

    }
}

