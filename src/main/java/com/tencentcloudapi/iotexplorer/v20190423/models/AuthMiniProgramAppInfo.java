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

public class AuthMiniProgramAppInfo extends AbstractModel {

    /**
    * 小程序APPID
    */
    @SerializedName("MiniProgramAppId")
    @Expose
    private String MiniProgramAppId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 小程序名称
    */
    @SerializedName("MiniProgramName")
    @Expose
    private String MiniProgramName;

    /**
    * 激活码数
    */
    @SerializedName("LicenseNum")
    @Expose
    private Long LicenseNum;

    /**
    * 应用ID 
    */
    @SerializedName("IotAppId")
    @Expose
    private String IotAppId;

    /**
    * 应用名称
    */
    @SerializedName("IotAppName")
    @Expose
    private String IotAppName;

    /**
     * Get 小程序APPID 
     * @return MiniProgramAppId 小程序APPID
     */
    public String getMiniProgramAppId() {
        return this.MiniProgramAppId;
    }

    /**
     * Set 小程序APPID
     * @param MiniProgramAppId 小程序APPID
     */
    public void setMiniProgramAppId(String MiniProgramAppId) {
        this.MiniProgramAppId = MiniProgramAppId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 小程序名称 
     * @return MiniProgramName 小程序名称
     */
    public String getMiniProgramName() {
        return this.MiniProgramName;
    }

    /**
     * Set 小程序名称
     * @param MiniProgramName 小程序名称
     */
    public void setMiniProgramName(String MiniProgramName) {
        this.MiniProgramName = MiniProgramName;
    }

    /**
     * Get 激活码数 
     * @return LicenseNum 激活码数
     */
    public Long getLicenseNum() {
        return this.LicenseNum;
    }

    /**
     * Set 激活码数
     * @param LicenseNum 激活码数
     */
    public void setLicenseNum(Long LicenseNum) {
        this.LicenseNum = LicenseNum;
    }

    /**
     * Get 应用ID  
     * @return IotAppId 应用ID 
     */
    public String getIotAppId() {
        return this.IotAppId;
    }

    /**
     * Set 应用ID 
     * @param IotAppId 应用ID 
     */
    public void setIotAppId(String IotAppId) {
        this.IotAppId = IotAppId;
    }

    /**
     * Get 应用名称 
     * @return IotAppName 应用名称
     */
    public String getIotAppName() {
        return this.IotAppName;
    }

    /**
     * Set 应用名称
     * @param IotAppName 应用名称
     */
    public void setIotAppName(String IotAppName) {
        this.IotAppName = IotAppName;
    }

    public AuthMiniProgramAppInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthMiniProgramAppInfo(AuthMiniProgramAppInfo source) {
        if (source.MiniProgramAppId != null) {
            this.MiniProgramAppId = new String(source.MiniProgramAppId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.MiniProgramName != null) {
            this.MiniProgramName = new String(source.MiniProgramName);
        }
        if (source.LicenseNum != null) {
            this.LicenseNum = new Long(source.LicenseNum);
        }
        if (source.IotAppId != null) {
            this.IotAppId = new String(source.IotAppId);
        }
        if (source.IotAppName != null) {
            this.IotAppName = new String(source.IotAppName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MiniProgramAppId", this.MiniProgramAppId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MiniProgramName", this.MiniProgramName);
        this.setParamSimple(map, prefix + "LicenseNum", this.LicenseNum);
        this.setParamSimple(map, prefix + "IotAppId", this.IotAppId);
        this.setParamSimple(map, prefix + "IotAppName", this.IotAppName);

    }
}

