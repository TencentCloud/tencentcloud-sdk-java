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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayDomain extends AbstractModel {

    /**
    * <p>主键ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>主域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>ICP</p>
    */
    @SerializedName("ICP")
    @Expose
    private String ICP;

    /**
    * <p>注册时间</p>
    */
    @SerializedName("RegisteredTime")
    @Expose
    private String RegisteredTime;

    /**
    * <p>过期时间</p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * <p>公司</p>
    */
    @SerializedName("Company")
    @Expose
    private String Company;

    /**
    * <p>公共字段</p>
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * <p>是否为云资产</p>
    */
    @SerializedName("IsCloudAsset")
    @Expose
    private Long IsCloudAsset;

    /**
    * <p>云资产状态，-1为下线</p>
    */
    @SerializedName("CloudAssetStatus")
    @Expose
    private Long CloudAssetStatus;

    /**
     * Get <p>主键ID</p> 
     * @return Id <p>主键ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>主键ID</p>
     * @param Id <p>主键ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>主域名</p> 
     * @return Domain <p>主域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>主域名</p>
     * @param Domain <p>主域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>ICP</p> 
     * @return ICP <p>ICP</p>
     */
    public String getICP() {
        return this.ICP;
    }

    /**
     * Set <p>ICP</p>
     * @param ICP <p>ICP</p>
     */
    public void setICP(String ICP) {
        this.ICP = ICP;
    }

    /**
     * Get <p>注册时间</p> 
     * @return RegisteredTime <p>注册时间</p>
     */
    public String getRegisteredTime() {
        return this.RegisteredTime;
    }

    /**
     * Set <p>注册时间</p>
     * @param RegisteredTime <p>注册时间</p>
     */
    public void setRegisteredTime(String RegisteredTime) {
        this.RegisteredTime = RegisteredTime;
    }

    /**
     * Get <p>过期时间</p> 
     * @return ExpiredTime <p>过期时间</p>
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>过期时间</p>
     * @param ExpiredTime <p>过期时间</p>
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>公司</p> 
     * @return Company <p>公司</p>
     */
    public String getCompany() {
        return this.Company;
    }

    /**
     * Set <p>公司</p>
     * @param Company <p>公司</p>
     */
    public void setCompany(String Company) {
        this.Company = Company;
    }

    /**
     * Get <p>公共字段</p> 
     * @return DisplayToolCommon <p>公共字段</p>
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set <p>公共字段</p>
     * @param DisplayToolCommon <p>公共字段</p>
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get <p>是否为云资产</p> 
     * @return IsCloudAsset <p>是否为云资产</p>
     */
    public Long getIsCloudAsset() {
        return this.IsCloudAsset;
    }

    /**
     * Set <p>是否为云资产</p>
     * @param IsCloudAsset <p>是否为云资产</p>
     */
    public void setIsCloudAsset(Long IsCloudAsset) {
        this.IsCloudAsset = IsCloudAsset;
    }

    /**
     * Get <p>云资产状态，-1为下线</p> 
     * @return CloudAssetStatus <p>云资产状态，-1为下线</p>
     */
    public Long getCloudAssetStatus() {
        return this.CloudAssetStatus;
    }

    /**
     * Set <p>云资产状态，-1为下线</p>
     * @param CloudAssetStatus <p>云资产状态，-1为下线</p>
     */
    public void setCloudAssetStatus(Long CloudAssetStatus) {
        this.CloudAssetStatus = CloudAssetStatus;
    }

    public DisplayDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayDomain(DisplayDomain source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ICP != null) {
            this.ICP = new String(source.ICP);
        }
        if (source.RegisteredTime != null) {
            this.RegisteredTime = new String(source.RegisteredTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.Company != null) {
            this.Company = new String(source.Company);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.IsCloudAsset != null) {
            this.IsCloudAsset = new Long(source.IsCloudAsset);
        }
        if (source.CloudAssetStatus != null) {
            this.CloudAssetStatus = new Long(source.CloudAssetStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ICP", this.ICP);
        this.setParamSimple(map, prefix + "RegisteredTime", this.RegisteredTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "Company", this.Company);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "IsCloudAsset", this.IsCloudAsset);
        this.setParamSimple(map, prefix + "CloudAssetStatus", this.CloudAssetStatus);

    }
}

