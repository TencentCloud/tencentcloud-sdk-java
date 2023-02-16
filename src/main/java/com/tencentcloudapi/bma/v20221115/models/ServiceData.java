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
package com.tencentcloudapi.bma.v20221115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceData extends AbstractModel{

    /**
    * 网站保护关联资产数
    */
    @SerializedName("ProtectURLCount")
    @Expose
    private Long ProtectURLCount;

    /**
    * 网站保护服务到期时间
    */
    @SerializedName("ProtectURLExpireTime")
    @Expose
    private String ProtectURLExpireTime;

    /**
    * 应用保护关联资产数
    */
    @SerializedName("ProtectAPPCount")
    @Expose
    private Long ProtectAPPCount;

    /**
    * 应用保护服务到期时间
    */
    @SerializedName("ProtectAPPExpireTime")
    @Expose
    private String ProtectAPPExpireTime;

    /**
    * 公众号保护关联资产数
    */
    @SerializedName("ProtectOfficialAccountCount")
    @Expose
    private Long ProtectOfficialAccountCount;

    /**
    * 公众号保护服务到期时间
    */
    @SerializedName("ProtectOfficialAccountExpireTime")
    @Expose
    private String ProtectOfficialAccountExpireTime;

    /**
    * 小程序保护关联资产数
    */
    @SerializedName("ProtectMiniProgramCount")
    @Expose
    private Long ProtectMiniProgramCount;

    /**
    * 小程序保护服务到期时间
    */
    @SerializedName("ProtectMiniProgramExpireTime")
    @Expose
    private String ProtectMiniProgramExpireTime;

    /**
    * 关停下架使用次数
    */
    @SerializedName("OfflineCount")
    @Expose
    private Long OfflineCount;

    /**
     * Get 网站保护关联资产数 
     * @return ProtectURLCount 网站保护关联资产数
     */
    public Long getProtectURLCount() {
        return this.ProtectURLCount;
    }

    /**
     * Set 网站保护关联资产数
     * @param ProtectURLCount 网站保护关联资产数
     */
    public void setProtectURLCount(Long ProtectURLCount) {
        this.ProtectURLCount = ProtectURLCount;
    }

    /**
     * Get 网站保护服务到期时间 
     * @return ProtectURLExpireTime 网站保护服务到期时间
     */
    public String getProtectURLExpireTime() {
        return this.ProtectURLExpireTime;
    }

    /**
     * Set 网站保护服务到期时间
     * @param ProtectURLExpireTime 网站保护服务到期时间
     */
    public void setProtectURLExpireTime(String ProtectURLExpireTime) {
        this.ProtectURLExpireTime = ProtectURLExpireTime;
    }

    /**
     * Get 应用保护关联资产数 
     * @return ProtectAPPCount 应用保护关联资产数
     */
    public Long getProtectAPPCount() {
        return this.ProtectAPPCount;
    }

    /**
     * Set 应用保护关联资产数
     * @param ProtectAPPCount 应用保护关联资产数
     */
    public void setProtectAPPCount(Long ProtectAPPCount) {
        this.ProtectAPPCount = ProtectAPPCount;
    }

    /**
     * Get 应用保护服务到期时间 
     * @return ProtectAPPExpireTime 应用保护服务到期时间
     */
    public String getProtectAPPExpireTime() {
        return this.ProtectAPPExpireTime;
    }

    /**
     * Set 应用保护服务到期时间
     * @param ProtectAPPExpireTime 应用保护服务到期时间
     */
    public void setProtectAPPExpireTime(String ProtectAPPExpireTime) {
        this.ProtectAPPExpireTime = ProtectAPPExpireTime;
    }

    /**
     * Get 公众号保护关联资产数 
     * @return ProtectOfficialAccountCount 公众号保护关联资产数
     */
    public Long getProtectOfficialAccountCount() {
        return this.ProtectOfficialAccountCount;
    }

    /**
     * Set 公众号保护关联资产数
     * @param ProtectOfficialAccountCount 公众号保护关联资产数
     */
    public void setProtectOfficialAccountCount(Long ProtectOfficialAccountCount) {
        this.ProtectOfficialAccountCount = ProtectOfficialAccountCount;
    }

    /**
     * Get 公众号保护服务到期时间 
     * @return ProtectOfficialAccountExpireTime 公众号保护服务到期时间
     */
    public String getProtectOfficialAccountExpireTime() {
        return this.ProtectOfficialAccountExpireTime;
    }

    /**
     * Set 公众号保护服务到期时间
     * @param ProtectOfficialAccountExpireTime 公众号保护服务到期时间
     */
    public void setProtectOfficialAccountExpireTime(String ProtectOfficialAccountExpireTime) {
        this.ProtectOfficialAccountExpireTime = ProtectOfficialAccountExpireTime;
    }

    /**
     * Get 小程序保护关联资产数 
     * @return ProtectMiniProgramCount 小程序保护关联资产数
     */
    public Long getProtectMiniProgramCount() {
        return this.ProtectMiniProgramCount;
    }

    /**
     * Set 小程序保护关联资产数
     * @param ProtectMiniProgramCount 小程序保护关联资产数
     */
    public void setProtectMiniProgramCount(Long ProtectMiniProgramCount) {
        this.ProtectMiniProgramCount = ProtectMiniProgramCount;
    }

    /**
     * Get 小程序保护服务到期时间 
     * @return ProtectMiniProgramExpireTime 小程序保护服务到期时间
     */
    public String getProtectMiniProgramExpireTime() {
        return this.ProtectMiniProgramExpireTime;
    }

    /**
     * Set 小程序保护服务到期时间
     * @param ProtectMiniProgramExpireTime 小程序保护服务到期时间
     */
    public void setProtectMiniProgramExpireTime(String ProtectMiniProgramExpireTime) {
        this.ProtectMiniProgramExpireTime = ProtectMiniProgramExpireTime;
    }

    /**
     * Get 关停下架使用次数 
     * @return OfflineCount 关停下架使用次数
     */
    public Long getOfflineCount() {
        return this.OfflineCount;
    }

    /**
     * Set 关停下架使用次数
     * @param OfflineCount 关停下架使用次数
     */
    public void setOfflineCount(Long OfflineCount) {
        this.OfflineCount = OfflineCount;
    }

    public ServiceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceData(ServiceData source) {
        if (source.ProtectURLCount != null) {
            this.ProtectURLCount = new Long(source.ProtectURLCount);
        }
        if (source.ProtectURLExpireTime != null) {
            this.ProtectURLExpireTime = new String(source.ProtectURLExpireTime);
        }
        if (source.ProtectAPPCount != null) {
            this.ProtectAPPCount = new Long(source.ProtectAPPCount);
        }
        if (source.ProtectAPPExpireTime != null) {
            this.ProtectAPPExpireTime = new String(source.ProtectAPPExpireTime);
        }
        if (source.ProtectOfficialAccountCount != null) {
            this.ProtectOfficialAccountCount = new Long(source.ProtectOfficialAccountCount);
        }
        if (source.ProtectOfficialAccountExpireTime != null) {
            this.ProtectOfficialAccountExpireTime = new String(source.ProtectOfficialAccountExpireTime);
        }
        if (source.ProtectMiniProgramCount != null) {
            this.ProtectMiniProgramCount = new Long(source.ProtectMiniProgramCount);
        }
        if (source.ProtectMiniProgramExpireTime != null) {
            this.ProtectMiniProgramExpireTime = new String(source.ProtectMiniProgramExpireTime);
        }
        if (source.OfflineCount != null) {
            this.OfflineCount = new Long(source.OfflineCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectURLCount", this.ProtectURLCount);
        this.setParamSimple(map, prefix + "ProtectURLExpireTime", this.ProtectURLExpireTime);
        this.setParamSimple(map, prefix + "ProtectAPPCount", this.ProtectAPPCount);
        this.setParamSimple(map, prefix + "ProtectAPPExpireTime", this.ProtectAPPExpireTime);
        this.setParamSimple(map, prefix + "ProtectOfficialAccountCount", this.ProtectOfficialAccountCount);
        this.setParamSimple(map, prefix + "ProtectOfficialAccountExpireTime", this.ProtectOfficialAccountExpireTime);
        this.setParamSimple(map, prefix + "ProtectMiniProgramCount", this.ProtectMiniProgramCount);
        this.setParamSimple(map, prefix + "ProtectMiniProgramExpireTime", this.ProtectMiniProgramExpireTime);
        this.setParamSimple(map, prefix + "OfflineCount", this.OfflineCount);

    }
}

