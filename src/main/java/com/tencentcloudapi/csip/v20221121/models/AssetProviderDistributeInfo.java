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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetProviderDistributeInfo extends AbstractModel {

    /**
    * <p>腾讯云资产总数</p>
    */
    @SerializedName("TencentAssetCount")
    @Expose
    private Long TencentAssetCount;

    /**
    * <p>阿里云资产总数</p>
    */
    @SerializedName("AliAssetCount")
    @Expose
    private Long AliAssetCount;

    /**
    * <p>亚马逊云资产总数</p>
    */
    @SerializedName("AwsAssetCount")
    @Expose
    private Long AwsAssetCount;

    /**
    * <p>其他云环境资产总数</p>
    */
    @SerializedName("OtherAssetCount")
    @Expose
    private Long OtherAssetCount;

    /**
    * <p>微软云资产数量</p>
    */
    @SerializedName("AzureAssetCount")
    @Expose
    private Long AzureAssetCount;

    /**
     * Get <p>腾讯云资产总数</p> 
     * @return TencentAssetCount <p>腾讯云资产总数</p>
     */
    public Long getTencentAssetCount() {
        return this.TencentAssetCount;
    }

    /**
     * Set <p>腾讯云资产总数</p>
     * @param TencentAssetCount <p>腾讯云资产总数</p>
     */
    public void setTencentAssetCount(Long TencentAssetCount) {
        this.TencentAssetCount = TencentAssetCount;
    }

    /**
     * Get <p>阿里云资产总数</p> 
     * @return AliAssetCount <p>阿里云资产总数</p>
     */
    public Long getAliAssetCount() {
        return this.AliAssetCount;
    }

    /**
     * Set <p>阿里云资产总数</p>
     * @param AliAssetCount <p>阿里云资产总数</p>
     */
    public void setAliAssetCount(Long AliAssetCount) {
        this.AliAssetCount = AliAssetCount;
    }

    /**
     * Get <p>亚马逊云资产总数</p> 
     * @return AwsAssetCount <p>亚马逊云资产总数</p>
     */
    public Long getAwsAssetCount() {
        return this.AwsAssetCount;
    }

    /**
     * Set <p>亚马逊云资产总数</p>
     * @param AwsAssetCount <p>亚马逊云资产总数</p>
     */
    public void setAwsAssetCount(Long AwsAssetCount) {
        this.AwsAssetCount = AwsAssetCount;
    }

    /**
     * Get <p>其他云环境资产总数</p> 
     * @return OtherAssetCount <p>其他云环境资产总数</p>
     */
    public Long getOtherAssetCount() {
        return this.OtherAssetCount;
    }

    /**
     * Set <p>其他云环境资产总数</p>
     * @param OtherAssetCount <p>其他云环境资产总数</p>
     */
    public void setOtherAssetCount(Long OtherAssetCount) {
        this.OtherAssetCount = OtherAssetCount;
    }

    /**
     * Get <p>微软云资产数量</p> 
     * @return AzureAssetCount <p>微软云资产数量</p>
     */
    public Long getAzureAssetCount() {
        return this.AzureAssetCount;
    }

    /**
     * Set <p>微软云资产数量</p>
     * @param AzureAssetCount <p>微软云资产数量</p>
     */
    public void setAzureAssetCount(Long AzureAssetCount) {
        this.AzureAssetCount = AzureAssetCount;
    }

    public AssetProviderDistributeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetProviderDistributeInfo(AssetProviderDistributeInfo source) {
        if (source.TencentAssetCount != null) {
            this.TencentAssetCount = new Long(source.TencentAssetCount);
        }
        if (source.AliAssetCount != null) {
            this.AliAssetCount = new Long(source.AliAssetCount);
        }
        if (source.AwsAssetCount != null) {
            this.AwsAssetCount = new Long(source.AwsAssetCount);
        }
        if (source.OtherAssetCount != null) {
            this.OtherAssetCount = new Long(source.OtherAssetCount);
        }
        if (source.AzureAssetCount != null) {
            this.AzureAssetCount = new Long(source.AzureAssetCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TencentAssetCount", this.TencentAssetCount);
        this.setParamSimple(map, prefix + "AliAssetCount", this.AliAssetCount);
        this.setParamSimple(map, prefix + "AwsAssetCount", this.AwsAssetCount);
        this.setParamSimple(map, prefix + "OtherAssetCount", this.OtherAssetCount);
        this.setParamSimple(map, prefix + "AzureAssetCount", this.AzureAssetCount);

    }
}

