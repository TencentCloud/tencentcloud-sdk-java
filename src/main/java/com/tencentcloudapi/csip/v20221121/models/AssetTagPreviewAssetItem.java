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

public class AssetTagPreviewAssetItem extends AbstractModel {

    /**
    * <p>资产ID</p>
    */
    @SerializedName("AssetID")
    @Expose
    private String AssetID;

    /**
    * <p>资产名称</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>公网IP地址</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>内网IP</p>
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * <p>公网域名</p>
    */
    @SerializedName("PublicDomain")
    @Expose
    private String PublicDomain;

    /**
    * <p>内网域名</p>
    */
    @SerializedName("PrivateDomain")
    @Expose
    private String PrivateDomain;

    /**
    * <p>资产类型</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>资产类型名称</p>
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * <p>资产类型图标</p>
    */
    @SerializedName("AssetTypeIconURL")
    @Expose
    private String AssetTypeIconURL;

    /**
     * Get <p>资产ID</p> 
     * @return AssetID <p>资产ID</p>
     */
    public String getAssetID() {
        return this.AssetID;
    }

    /**
     * Set <p>资产ID</p>
     * @param AssetID <p>资产ID</p>
     */
    public void setAssetID(String AssetID) {
        this.AssetID = AssetID;
    }

    /**
     * Get <p>资产名称</p> 
     * @return AssetName <p>资产名称</p>
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>资产名称</p>
     * @param AssetName <p>资产名称</p>
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get <p>公网IP地址</p> 
     * @return PublicIP <p>公网IP地址</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>公网IP地址</p>
     * @param PublicIP <p>公网IP地址</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>内网IP</p> 
     * @return PrivateIP <p>内网IP</p>
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set <p>内网IP</p>
     * @param PrivateIP <p>内网IP</p>
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get <p>公网域名</p> 
     * @return PublicDomain <p>公网域名</p>
     */
    public String getPublicDomain() {
        return this.PublicDomain;
    }

    /**
     * Set <p>公网域名</p>
     * @param PublicDomain <p>公网域名</p>
     */
    public void setPublicDomain(String PublicDomain) {
        this.PublicDomain = PublicDomain;
    }

    /**
     * Get <p>内网域名</p> 
     * @return PrivateDomain <p>内网域名</p>
     */
    public String getPrivateDomain() {
        return this.PrivateDomain;
    }

    /**
     * Set <p>内网域名</p>
     * @param PrivateDomain <p>内网域名</p>
     */
    public void setPrivateDomain(String PrivateDomain) {
        this.PrivateDomain = PrivateDomain;
    }

    /**
     * Get <p>资产类型</p> 
     * @return AssetType <p>资产类型</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型</p>
     * @param AssetType <p>资产类型</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>资产类型名称</p> 
     * @return AssetTypeName <p>资产类型名称</p>
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set <p>资产类型名称</p>
     * @param AssetTypeName <p>资产类型名称</p>
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    /**
     * Get <p>资产类型图标</p> 
     * @return AssetTypeIconURL <p>资产类型图标</p>
     */
    public String getAssetTypeIconURL() {
        return this.AssetTypeIconURL;
    }

    /**
     * Set <p>资产类型图标</p>
     * @param AssetTypeIconURL <p>资产类型图标</p>
     */
    public void setAssetTypeIconURL(String AssetTypeIconURL) {
        this.AssetTypeIconURL = AssetTypeIconURL;
    }

    public AssetTagPreviewAssetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetTagPreviewAssetItem(AssetTagPreviewAssetItem source) {
        if (source.AssetID != null) {
            this.AssetID = new String(source.AssetID);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.PrivateIP != null) {
            this.PrivateIP = new String(source.PrivateIP);
        }
        if (source.PublicDomain != null) {
            this.PublicDomain = new String(source.PublicDomain);
        }
        if (source.PrivateDomain != null) {
            this.PrivateDomain = new String(source.PrivateDomain);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
        if (source.AssetTypeIconURL != null) {
            this.AssetTypeIconURL = new String(source.AssetTypeIconURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetID", this.AssetID);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamSimple(map, prefix + "PublicDomain", this.PublicDomain);
        this.setParamSimple(map, prefix + "PrivateDomain", this.PrivateDomain);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);
        this.setParamSimple(map, prefix + "AssetTypeIconURL", this.AssetTypeIconURL);

    }
}

