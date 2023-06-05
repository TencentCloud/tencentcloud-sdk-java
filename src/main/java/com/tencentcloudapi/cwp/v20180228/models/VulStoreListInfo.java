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

public class VulStoreListInfo extends AbstractModel{

    /**
    * 漏洞ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞级别
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 漏洞名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * cve编号
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 0= 应急漏洞
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
    * 发布时间
    */
    @SerializedName("PublishDate")
    @Expose
    private String PublishDate;

    /**
    * 漏洞检测方法 0 - 版本比对, 1 - POC验证
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * 漏洞攻击热度
    */
    @SerializedName("AttackLevel")
    @Expose
    private Long AttackLevel;

    /**
    * 漏洞是否支持自动修复
0-windows/linux均关闭; 1-windows/linux均打开; 2-仅linux; 3-仅windows
    */
    @SerializedName("FixSwitch")
    @Expose
    private Long FixSwitch;

    /**
    * 漏洞是否支持防御
0:不支持 1:支持
    */
    @SerializedName("SupportDefense")
    @Expose
    private Long SupportDefense;

    /**
     * Get 漏洞ID 
     * @return VulId 漏洞ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞ID
     * @param VulId 漏洞ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 漏洞级别 
     * @return Level 漏洞级别
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 漏洞级别
     * @param Level 漏洞级别
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 漏洞名称 
     * @return Name 漏洞名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 漏洞名称
     * @param Name 漏洞名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get cve编号 
     * @return CveId cve编号
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set cve编号
     * @param CveId cve编号
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 0= 应急漏洞 
     * @return VulCategory 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 0= 应急漏洞
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 0= 应急漏洞
     * @param VulCategory 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 0= 应急漏洞
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get 发布时间 
     * @return PublishDate 发布时间
     */
    public String getPublishDate() {
        return this.PublishDate;
    }

    /**
     * Set 发布时间
     * @param PublishDate 发布时间
     */
    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }

    /**
     * Get 漏洞检测方法 0 - 版本比对, 1 - POC验证 
     * @return Method 漏洞检测方法 0 - 版本比对, 1 - POC验证
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set 漏洞检测方法 0 - 版本比对, 1 - POC验证
     * @param Method 漏洞检测方法 0 - 版本比对, 1 - POC验证
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get 漏洞攻击热度 
     * @return AttackLevel 漏洞攻击热度
     */
    public Long getAttackLevel() {
        return this.AttackLevel;
    }

    /**
     * Set 漏洞攻击热度
     * @param AttackLevel 漏洞攻击热度
     */
    public void setAttackLevel(Long AttackLevel) {
        this.AttackLevel = AttackLevel;
    }

    /**
     * Get 漏洞是否支持自动修复
0-windows/linux均关闭; 1-windows/linux均打开; 2-仅linux; 3-仅windows 
     * @return FixSwitch 漏洞是否支持自动修复
0-windows/linux均关闭; 1-windows/linux均打开; 2-仅linux; 3-仅windows
     */
    public Long getFixSwitch() {
        return this.FixSwitch;
    }

    /**
     * Set 漏洞是否支持自动修复
0-windows/linux均关闭; 1-windows/linux均打开; 2-仅linux; 3-仅windows
     * @param FixSwitch 漏洞是否支持自动修复
0-windows/linux均关闭; 1-windows/linux均打开; 2-仅linux; 3-仅windows
     */
    public void setFixSwitch(Long FixSwitch) {
        this.FixSwitch = FixSwitch;
    }

    /**
     * Get 漏洞是否支持防御
0:不支持 1:支持 
     * @return SupportDefense 漏洞是否支持防御
0:不支持 1:支持
     */
    public Long getSupportDefense() {
        return this.SupportDefense;
    }

    /**
     * Set 漏洞是否支持防御
0:不支持 1:支持
     * @param SupportDefense 漏洞是否支持防御
0:不支持 1:支持
     */
    public void setSupportDefense(Long SupportDefense) {
        this.SupportDefense = SupportDefense;
    }

    public VulStoreListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulStoreListInfo(VulStoreListInfo source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new Long(source.VulCategory);
        }
        if (source.PublishDate != null) {
            this.PublishDate = new String(source.PublishDate);
        }
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.AttackLevel != null) {
            this.AttackLevel = new Long(source.AttackLevel);
        }
        if (source.FixSwitch != null) {
            this.FixSwitch = new Long(source.FixSwitch);
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
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "PublishDate", this.PublishDate);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "AttackLevel", this.AttackLevel);
        this.setParamSimple(map, prefix + "FixSwitch", this.FixSwitch);
        this.setParamSimple(map, prefix + "SupportDefense", this.SupportDefense);

    }
}

