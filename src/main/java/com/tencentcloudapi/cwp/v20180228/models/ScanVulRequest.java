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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanVulRequest extends AbstractModel{

    /**
    * 危害等级：1-低危；2-中危；3-高危；4-严重 (多选英文;分隔)
    */
    @SerializedName("VulLevels")
    @Expose
    private String VulLevels;

    /**
    * 服务器分类：1:专业版服务器；2:自选服务器
    */
    @SerializedName("HostType")
    @Expose
    private Long HostType;

    /**
    * 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 (多选英文;分隔)
    */
    @SerializedName("VulCategories")
    @Expose
    private String VulCategories;

    /**
    * 自选服务器时生效，主机quuid的string数组
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
    * 是否是应急漏洞 0 否 1 是
    */
    @SerializedName("VulEmergency")
    @Expose
    private Long VulEmergency;

    /**
    * 超时时长 单位秒 默认 3600 秒
    */
    @SerializedName("TimeoutPeriod")
    @Expose
    private Long TimeoutPeriod;

    /**
    * 需要扫描的漏洞id
    */
    @SerializedName("VulIds")
    @Expose
    private Long [] VulIds;

    /**
     * Get 危害等级：1-低危；2-中危；3-高危；4-严重 (多选英文;分隔) 
     * @return VulLevels 危害等级：1-低危；2-中危；3-高危；4-严重 (多选英文;分隔)
     */
    public String getVulLevels() {
        return this.VulLevels;
    }

    /**
     * Set 危害等级：1-低危；2-中危；3-高危；4-严重 (多选英文;分隔)
     * @param VulLevels 危害等级：1-低危；2-中危；3-高危；4-严重 (多选英文;分隔)
     */
    public void setVulLevels(String VulLevels) {
        this.VulLevels = VulLevels;
    }

    /**
     * Get 服务器分类：1:专业版服务器；2:自选服务器 
     * @return HostType 服务器分类：1:专业版服务器；2:自选服务器
     */
    public Long getHostType() {
        return this.HostType;
    }

    /**
     * Set 服务器分类：1:专业版服务器；2:自选服务器
     * @param HostType 服务器分类：1:专业版服务器；2:自选服务器
     */
    public void setHostType(Long HostType) {
        this.HostType = HostType;
    }

    /**
     * Get 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 (多选英文;分隔) 
     * @return VulCategories 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 (多选英文;分隔)
     */
    public String getVulCategories() {
        return this.VulCategories;
    }

    /**
     * Set 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 (多选英文;分隔)
     * @param VulCategories 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 (多选英文;分隔)
     */
    public void setVulCategories(String VulCategories) {
        this.VulCategories = VulCategories;
    }

    /**
     * Get 自选服务器时生效，主机quuid的string数组 
     * @return QuuidList 自选服务器时生效，主机quuid的string数组
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set 自选服务器时生效，主机quuid的string数组
     * @param QuuidList 自选服务器时生效，主机quuid的string数组
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    /**
     * Get 是否是应急漏洞 0 否 1 是 
     * @return VulEmergency 是否是应急漏洞 0 否 1 是
     */
    public Long getVulEmergency() {
        return this.VulEmergency;
    }

    /**
     * Set 是否是应急漏洞 0 否 1 是
     * @param VulEmergency 是否是应急漏洞 0 否 1 是
     */
    public void setVulEmergency(Long VulEmergency) {
        this.VulEmergency = VulEmergency;
    }

    /**
     * Get 超时时长 单位秒 默认 3600 秒 
     * @return TimeoutPeriod 超时时长 单位秒 默认 3600 秒
     */
    public Long getTimeoutPeriod() {
        return this.TimeoutPeriod;
    }

    /**
     * Set 超时时长 单位秒 默认 3600 秒
     * @param TimeoutPeriod 超时时长 单位秒 默认 3600 秒
     */
    public void setTimeoutPeriod(Long TimeoutPeriod) {
        this.TimeoutPeriod = TimeoutPeriod;
    }

    /**
     * Get 需要扫描的漏洞id 
     * @return VulIds 需要扫描的漏洞id
     */
    public Long [] getVulIds() {
        return this.VulIds;
    }

    /**
     * Set 需要扫描的漏洞id
     * @param VulIds 需要扫描的漏洞id
     */
    public void setVulIds(Long [] VulIds) {
        this.VulIds = VulIds;
    }

    public ScanVulRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanVulRequest(ScanVulRequest source) {
        if (source.VulLevels != null) {
            this.VulLevels = new String(source.VulLevels);
        }
        if (source.HostType != null) {
            this.HostType = new Long(source.HostType);
        }
        if (source.VulCategories != null) {
            this.VulCategories = new String(source.VulCategories);
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
        if (source.VulEmergency != null) {
            this.VulEmergency = new Long(source.VulEmergency);
        }
        if (source.TimeoutPeriod != null) {
            this.TimeoutPeriod = new Long(source.TimeoutPeriod);
        }
        if (source.VulIds != null) {
            this.VulIds = new Long[source.VulIds.length];
            for (int i = 0; i < source.VulIds.length; i++) {
                this.VulIds[i] = new Long(source.VulIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulLevels", this.VulLevels);
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "VulCategories", this.VulCategories);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);
        this.setParamSimple(map, prefix + "VulEmergency", this.VulEmergency);
        this.setParamSimple(map, prefix + "TimeoutPeriod", this.TimeoutPeriod);
        this.setParamArraySimple(map, prefix + "VulIds.", this.VulIds);

    }
}

