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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayVul extends AbstractModel {

    /**
    * 主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 公共字段
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * 解析的IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Url地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 风险等级：1：提示, 2:低危, 3:中危, 4:高危, 5: 严重
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
    * 是否修复，0:未修复，1:已修复
    */
    @SerializedName("RepairStatus")
    @Expose
    private Long RepairStatus;

    /**
    * 建议
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 发现时间
    */
    @SerializedName("DiscoverTime")
    @Expose
    private String DiscoverTime;

    /**
    * AI研判
    */
    @SerializedName("AiJudge")
    @Expose
    private String AiJudge;

    /**
    * 状态：unrepaired:未修复，repaired:已修复, offline:资产已下线, ignore:已忽略
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 上次复测时间
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
     * Get 主键ID 
     * @return Id 主键ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主键ID
     * @param Id 主键ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 公共字段 
     * @return DisplayToolCommon 公共字段
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set 公共字段
     * @param DisplayToolCommon 公共字段
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get 解析的IP 
     * @return Ip 解析的IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 解析的IP
     * @param Ip 解析的IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Url地址 
     * @return Url Url地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Url地址
     * @param Url Url地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 风险等级：1：提示, 2:低危, 3:中危, 4:高危, 5: 严重 
     * @return Level 风险等级：1：提示, 2:低危, 3:中危, 4:高危, 5: 严重
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级：1：提示, 2:低危, 3:中危, 4:高危, 5: 严重
     * @param Level 风险等级：1：提示, 2:低危, 3:中危, 4:高危, 5: 严重
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
     * Get 是否修复，0:未修复，1:已修复 
     * @return RepairStatus 是否修复，0:未修复，1:已修复
     */
    public Long getRepairStatus() {
        return this.RepairStatus;
    }

    /**
     * Set 是否修复，0:未修复，1:已修复
     * @param RepairStatus 是否修复，0:未修复，1:已修复
     */
    public void setRepairStatus(Long RepairStatus) {
        this.RepairStatus = RepairStatus;
    }

    /**
     * Get 建议 
     * @return Suggestion 建议
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议
     * @param Suggestion 建议
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 发现时间 
     * @return DiscoverTime 发现时间
     */
    public String getDiscoverTime() {
        return this.DiscoverTime;
    }

    /**
     * Set 发现时间
     * @param DiscoverTime 发现时间
     */
    public void setDiscoverTime(String DiscoverTime) {
        this.DiscoverTime = DiscoverTime;
    }

    /**
     * Get AI研判 
     * @return AiJudge AI研判
     */
    public String getAiJudge() {
        return this.AiJudge;
    }

    /**
     * Set AI研判
     * @param AiJudge AI研判
     */
    public void setAiJudge(String AiJudge) {
        this.AiJudge = AiJudge;
    }

    /**
     * Get 状态：unrepaired:未修复，repaired:已修复, offline:资产已下线, ignore:已忽略 
     * @return Status 状态：unrepaired:未修复，repaired:已修复, offline:资产已下线, ignore:已忽略
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：unrepaired:未修复，repaired:已修复, offline:资产已下线, ignore:已忽略
     * @param Status 状态：unrepaired:未修复，repaired:已修复, offline:资产已下线, ignore:已忽略
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 上次复测时间 
     * @return LastCheckTime 上次复测时间
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set 上次复测时间
     * @param LastCheckTime 上次复测时间
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    public DisplayVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayVul(DisplayVul source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RepairStatus != null) {
            this.RepairStatus = new Long(source.RepairStatus);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.DiscoverTime != null) {
            this.DiscoverTime = new String(source.DiscoverTime);
        }
        if (source.AiJudge != null) {
            this.AiJudge = new String(source.AiJudge);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RepairStatus", this.RepairStatus);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "DiscoverTime", this.DiscoverTime);
        this.setParamSimple(map, prefix + "AiJudge", this.AiJudge);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);

    }
}

