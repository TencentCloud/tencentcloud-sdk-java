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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTWeTalkProductConfigListV2Request extends AbstractModel {

    /**
    * 产品ID
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
    * 支持的语言，zh-中文；en-英文；默认zh
    */
    @SerializedName("TargetLanguage")
    @Expose
    private String TargetLanguage;

    /**
    * 是否脱敏
    */
    @SerializedName("IncludeCredentials")
    @Expose
    private Boolean IncludeCredentials;

    /**
    * 页码
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数据大小， 10-100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
     * Get 支持的语言，zh-中文；en-英文；默认zh 
     * @return TargetLanguage 支持的语言，zh-中文；en-英文；默认zh
     */
    public String getTargetLanguage() {
        return this.TargetLanguage;
    }

    /**
     * Set 支持的语言，zh-中文；en-英文；默认zh
     * @param TargetLanguage 支持的语言，zh-中文；en-英文；默认zh
     */
    public void setTargetLanguage(String TargetLanguage) {
        this.TargetLanguage = TargetLanguage;
    }

    /**
     * Get 是否脱敏 
     * @return IncludeCredentials 是否脱敏
     */
    public Boolean getIncludeCredentials() {
        return this.IncludeCredentials;
    }

    /**
     * Set 是否脱敏
     * @param IncludeCredentials 是否脱敏
     */
    public void setIncludeCredentials(Boolean IncludeCredentials) {
        this.IncludeCredentials = IncludeCredentials;
    }

    /**
     * Get 页码 
     * @return Offset 页码
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页码
     * @param Offset 页码
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数据大小， 10-100 
     * @return Limit 每页数据大小， 10-100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数据大小， 10-100
     * @param Limit 每页数据大小， 10-100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public GetTWeTalkProductConfigListV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTWeTalkProductConfigListV2Request(GetTWeTalkProductConfigListV2Request source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.TargetLanguage != null) {
            this.TargetLanguage = new String(source.TargetLanguage);
        }
        if (source.IncludeCredentials != null) {
            this.IncludeCredentials = new Boolean(source.IncludeCredentials);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "TargetLanguage", this.TargetLanguage);
        this.setParamSimple(map, prefix + "IncludeCredentials", this.IncludeCredentials);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

