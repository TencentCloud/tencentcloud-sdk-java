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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulEmergentMsgInfo extends AbstractModel {

    /**
    * 漏洞id
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞纰漏时间
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * 漏洞名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 漏洞名,英文描述
    */
    @SerializedName("NameEn")
    @Expose
    private String NameEn;

    /**
    * 是否支持自动修复 0:不支持 >0: 支持
    */
    @SerializedName("SupportFix")
    @Expose
    private Long SupportFix;

    /**
    * 是否支持自动防御 0:不支持 1:支持
    */
    @SerializedName("SupportDefense")
    @Expose
    private Long SupportDefense;

    /**
     * Get 漏洞id 
     * @return VulId 漏洞id
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞id
     * @param VulId 漏洞id
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 漏洞纰漏时间 
     * @return PublishTime 漏洞纰漏时间
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 漏洞纰漏时间
     * @param PublishTime 漏洞纰漏时间
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get 漏洞名 
     * @return Name 漏洞名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 漏洞名
     * @param Name 漏洞名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 漏洞名,英文描述 
     * @return NameEn 漏洞名,英文描述
     */
    public String getNameEn() {
        return this.NameEn;
    }

    /**
     * Set 漏洞名,英文描述
     * @param NameEn 漏洞名,英文描述
     */
    public void setNameEn(String NameEn) {
        this.NameEn = NameEn;
    }

    /**
     * Get 是否支持自动修复 0:不支持 >0: 支持 
     * @return SupportFix 是否支持自动修复 0:不支持 >0: 支持
     */
    public Long getSupportFix() {
        return this.SupportFix;
    }

    /**
     * Set 是否支持自动修复 0:不支持 >0: 支持
     * @param SupportFix 是否支持自动修复 0:不支持 >0: 支持
     */
    public void setSupportFix(Long SupportFix) {
        this.SupportFix = SupportFix;
    }

    /**
     * Get 是否支持自动防御 0:不支持 1:支持 
     * @return SupportDefense 是否支持自动防御 0:不支持 1:支持
     */
    public Long getSupportDefense() {
        return this.SupportDefense;
    }

    /**
     * Set 是否支持自动防御 0:不支持 1:支持
     * @param SupportDefense 是否支持自动防御 0:不支持 1:支持
     */
    public void setSupportDefense(Long SupportDefense) {
        this.SupportDefense = SupportDefense;
    }

    public VulEmergentMsgInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulEmergentMsgInfo(VulEmergentMsgInfo source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NameEn != null) {
            this.NameEn = new String(source.NameEn);
        }
        if (source.SupportFix != null) {
            this.SupportFix = new Long(source.SupportFix);
        }
        if (source.SupportDefense != null) {
            this.SupportDefense = new Long(source.SupportDefense);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NameEn", this.NameEn);
        this.setParamSimple(map, prefix + "SupportFix", this.SupportFix);
        this.setParamSimple(map, prefix + "SupportDefense", this.SupportDefense);

    }
}

