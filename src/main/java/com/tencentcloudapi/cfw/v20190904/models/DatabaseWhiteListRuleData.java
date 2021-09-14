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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabaseWhiteListRuleData extends AbstractModel{

    /**
    * 访问源
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 访问源类型，1 ip；6 实例；100 资源分组
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 访问目的
    */
    @SerializedName("TargetIp")
    @Expose
    private String TargetIp;

    /**
    * 访问目的类型，1 ip；6 实例；100 资源分组
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * 规则描述
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 是否地域规则，0不是 1是
    */
    @SerializedName("IsRegionRule")
    @Expose
    private Long IsRegionRule;

    /**
    * 是否云厂商规则，0不是 1 时
    */
    @SerializedName("IsCloudRule")
    @Expose
    private Long IsCloudRule;

    /**
    * 是否启用，0 不启用，1启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 地域码1
    */
    @SerializedName("FirstLevelRegionCode")
    @Expose
    private Long FirstLevelRegionCode;

    /**
    * 地域码2
    */
    @SerializedName("SecondLevelRegionCode")
    @Expose
    private Long SecondLevelRegionCode;

    /**
    * 地域名称1
    */
    @SerializedName("FirstLevelRegionName")
    @Expose
    private String FirstLevelRegionName;

    /**
    * 地域名称2
    */
    @SerializedName("SecondLevelRegionName")
    @Expose
    private String SecondLevelRegionName;

    /**
    * 云厂商码
    */
    @SerializedName("CloudCode")
    @Expose
    private String CloudCode;

    /**
     * Get 访问源 
     * @return SourceIp 访问源
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 访问源
     * @param SourceIp 访问源
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 访问源类型，1 ip；6 实例；100 资源分组 
     * @return SourceType 访问源类型，1 ip；6 实例；100 资源分组
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问源类型，1 ip；6 实例；100 资源分组
     * @param SourceType 访问源类型，1 ip；6 实例；100 资源分组
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 访问目的 
     * @return TargetIp 访问目的
     */
    public String getTargetIp() {
        return this.TargetIp;
    }

    /**
     * Set 访问目的
     * @param TargetIp 访问目的
     */
    public void setTargetIp(String TargetIp) {
        this.TargetIp = TargetIp;
    }

    /**
     * Get 访问目的类型，1 ip；6 实例；100 资源分组 
     * @return TargetType 访问目的类型，1 ip；6 实例；100 资源分组
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 访问目的类型，1 ip；6 实例；100 资源分组
     * @param TargetType 访问目的类型，1 ip；6 实例；100 资源分组
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 规则描述 
     * @return Detail 规则描述
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 规则描述
     * @param Detail 规则描述
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 是否地域规则，0不是 1是 
     * @return IsRegionRule 是否地域规则，0不是 1是
     */
    public Long getIsRegionRule() {
        return this.IsRegionRule;
    }

    /**
     * Set 是否地域规则，0不是 1是
     * @param IsRegionRule 是否地域规则，0不是 1是
     */
    public void setIsRegionRule(Long IsRegionRule) {
        this.IsRegionRule = IsRegionRule;
    }

    /**
     * Get 是否云厂商规则，0不是 1 时 
     * @return IsCloudRule 是否云厂商规则，0不是 1 时
     */
    public Long getIsCloudRule() {
        return this.IsCloudRule;
    }

    /**
     * Set 是否云厂商规则，0不是 1 时
     * @param IsCloudRule 是否云厂商规则，0不是 1 时
     */
    public void setIsCloudRule(Long IsCloudRule) {
        this.IsCloudRule = IsCloudRule;
    }

    /**
     * Get 是否启用，0 不启用，1启用 
     * @return Enable 是否启用，0 不启用，1启用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用，0 不启用，1启用
     * @param Enable 是否启用，0 不启用，1启用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 地域码1 
     * @return FirstLevelRegionCode 地域码1
     */
    public Long getFirstLevelRegionCode() {
        return this.FirstLevelRegionCode;
    }

    /**
     * Set 地域码1
     * @param FirstLevelRegionCode 地域码1
     */
    public void setFirstLevelRegionCode(Long FirstLevelRegionCode) {
        this.FirstLevelRegionCode = FirstLevelRegionCode;
    }

    /**
     * Get 地域码2 
     * @return SecondLevelRegionCode 地域码2
     */
    public Long getSecondLevelRegionCode() {
        return this.SecondLevelRegionCode;
    }

    /**
     * Set 地域码2
     * @param SecondLevelRegionCode 地域码2
     */
    public void setSecondLevelRegionCode(Long SecondLevelRegionCode) {
        this.SecondLevelRegionCode = SecondLevelRegionCode;
    }

    /**
     * Get 地域名称1 
     * @return FirstLevelRegionName 地域名称1
     */
    public String getFirstLevelRegionName() {
        return this.FirstLevelRegionName;
    }

    /**
     * Set 地域名称1
     * @param FirstLevelRegionName 地域名称1
     */
    public void setFirstLevelRegionName(String FirstLevelRegionName) {
        this.FirstLevelRegionName = FirstLevelRegionName;
    }

    /**
     * Get 地域名称2 
     * @return SecondLevelRegionName 地域名称2
     */
    public String getSecondLevelRegionName() {
        return this.SecondLevelRegionName;
    }

    /**
     * Set 地域名称2
     * @param SecondLevelRegionName 地域名称2
     */
    public void setSecondLevelRegionName(String SecondLevelRegionName) {
        this.SecondLevelRegionName = SecondLevelRegionName;
    }

    /**
     * Get 云厂商码 
     * @return CloudCode 云厂商码
     */
    public String getCloudCode() {
        return this.CloudCode;
    }

    /**
     * Set 云厂商码
     * @param CloudCode 云厂商码
     */
    public void setCloudCode(String CloudCode) {
        this.CloudCode = CloudCode;
    }

    public DatabaseWhiteListRuleData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseWhiteListRuleData(DatabaseWhiteListRuleData source) {
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.TargetIp != null) {
            this.TargetIp = new String(source.TargetIp);
        }
        if (source.TargetType != null) {
            this.TargetType = new Long(source.TargetType);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.IsRegionRule != null) {
            this.IsRegionRule = new Long(source.IsRegionRule);
        }
        if (source.IsCloudRule != null) {
            this.IsCloudRule = new Long(source.IsCloudRule);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.FirstLevelRegionCode != null) {
            this.FirstLevelRegionCode = new Long(source.FirstLevelRegionCode);
        }
        if (source.SecondLevelRegionCode != null) {
            this.SecondLevelRegionCode = new Long(source.SecondLevelRegionCode);
        }
        if (source.FirstLevelRegionName != null) {
            this.FirstLevelRegionName = new String(source.FirstLevelRegionName);
        }
        if (source.SecondLevelRegionName != null) {
            this.SecondLevelRegionName = new String(source.SecondLevelRegionName);
        }
        if (source.CloudCode != null) {
            this.CloudCode = new String(source.CloudCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "TargetIp", this.TargetIp);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "IsRegionRule", this.IsRegionRule);
        this.setParamSimple(map, prefix + "IsCloudRule", this.IsCloudRule);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "FirstLevelRegionCode", this.FirstLevelRegionCode);
        this.setParamSimple(map, prefix + "SecondLevelRegionCode", this.SecondLevelRegionCode);
        this.setParamSimple(map, prefix + "FirstLevelRegionName", this.FirstLevelRegionName);
        this.setParamSimple(map, prefix + "SecondLevelRegionName", this.SecondLevelRegionName);
        this.setParamSimple(map, prefix + "CloudCode", this.CloudCode);

    }
}

