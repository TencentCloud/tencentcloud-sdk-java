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

public class VulFixedItem extends AbstractModel {

    /**
    * 漏洞ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 漏洞等级
枚举值：
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * VPR 评级信息（包含评级结果、说明和分阶段评分），与 DescribeHostVulRiskList 一致
    */
    @SerializedName("VRPRatingInfo")
    @Expose
    private VPRRatingInfo VRPRatingInfo;

    /**
    * 漏洞类型
枚举值：
LINUX：Linux软件漏洞
WINDOWS：Windows系统补丁漏洞
WEB_CMS：Web-CMS漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
    */
    @SerializedName("VulCategory")
    @Expose
    private String VulCategory;

    /**
    * CVE编号
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * 修复主机名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 修复主机实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 关联组件&路径数量
    */
    @SerializedName("ComponentCount")
    @Expose
    private Long ComponentCount;

    /**
    * 关联组件&路径列表
    */
    @SerializedName("Components")
    @Expose
    private String [] Components;

    /**
    * 最近一次修复时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("LatestFixTime")
    @Expose
    private String LatestFixTime;

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
     * Get 漏洞名称 
     * @return VulName 漏洞名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
     * @param VulName 漏洞名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 漏洞等级
枚举值：
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重 
     * @return Level 漏洞等级
枚举值：
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 漏洞等级
枚举值：
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
     * @param Level 漏洞等级
枚举值：
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get VPR 评级信息（包含评级结果、说明和分阶段评分），与 DescribeHostVulRiskList 一致 
     * @return VRPRatingInfo VPR 评级信息（包含评级结果、说明和分阶段评分），与 DescribeHostVulRiskList 一致
     */
    public VPRRatingInfo getVRPRatingInfo() {
        return this.VRPRatingInfo;
    }

    /**
     * Set VPR 评级信息（包含评级结果、说明和分阶段评分），与 DescribeHostVulRiskList 一致
     * @param VRPRatingInfo VPR 评级信息（包含评级结果、说明和分阶段评分），与 DescribeHostVulRiskList 一致
     */
    public void setVRPRatingInfo(VPRRatingInfo VRPRatingInfo) {
        this.VRPRatingInfo = VRPRatingInfo;
    }

    /**
     * Get 漏洞类型
枚举值：
LINUX：Linux软件漏洞
WINDOWS：Windows系统补丁漏洞
WEB_CMS：Web-CMS漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞 
     * @return VulCategory 漏洞类型
枚举值：
LINUX：Linux软件漏洞
WINDOWS：Windows系统补丁漏洞
WEB_CMS：Web-CMS漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
     */
    public String getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set 漏洞类型
枚举值：
LINUX：Linux软件漏洞
WINDOWS：Windows系统补丁漏洞
WEB_CMS：Web-CMS漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
     * @param VulCategory 漏洞类型
枚举值：
LINUX：Linux软件漏洞
WINDOWS：Windows系统补丁漏洞
WEB_CMS：Web-CMS漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
     */
    public void setVulCategory(String VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get CVE编号 
     * @return CveId CVE编号
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set CVE编号
     * @param CveId CVE编号
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get 修复主机名称 
     * @return MachineName 修复主机名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 修复主机名称
     * @param MachineName 修复主机名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 修复主机实例ID 
     * @return InstanceId 修复主机实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 修复主机实例ID
     * @param InstanceId 修复主机实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 关联组件&路径数量 
     * @return ComponentCount 关联组件&路径数量
     */
    public Long getComponentCount() {
        return this.ComponentCount;
    }

    /**
     * Set 关联组件&路径数量
     * @param ComponentCount 关联组件&路径数量
     */
    public void setComponentCount(Long ComponentCount) {
        this.ComponentCount = ComponentCount;
    }

    /**
     * Get 关联组件&路径列表 
     * @return Components 关联组件&路径列表
     */
    public String [] getComponents() {
        return this.Components;
    }

    /**
     * Set 关联组件&路径列表
     * @param Components 关联组件&路径列表
     */
    public void setComponents(String [] Components) {
        this.Components = Components;
    }

    /**
     * Get 最近一次修复时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return LatestFixTime 最近一次修复时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getLatestFixTime() {
        return this.LatestFixTime;
    }

    /**
     * Set 最近一次修复时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param LatestFixTime 最近一次修复时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setLatestFixTime(String LatestFixTime) {
        this.LatestFixTime = LatestFixTime;
    }

    public VulFixedItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixedItem(VulFixedItem source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.VRPRatingInfo != null) {
            this.VRPRatingInfo = new VPRRatingInfo(source.VRPRatingInfo);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new String(source.VulCategory);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ComponentCount != null) {
            this.ComponentCount = new Long(source.ComponentCount);
        }
        if (source.Components != null) {
            this.Components = new String[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new String(source.Components[i]);
            }
        }
        if (source.LatestFixTime != null) {
            this.LatestFixTime = new String(source.LatestFixTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamObj(map, prefix + "VRPRatingInfo.", this.VRPRatingInfo);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ComponentCount", this.ComponentCount);
        this.setParamArraySimple(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "LatestFixTime", this.LatestFixTime);

    }
}

