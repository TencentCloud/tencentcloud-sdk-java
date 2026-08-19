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
    * <p>漏洞ID</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * <p>漏洞名称</p>
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * <p>漏洞等级<br>枚举值：<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>VPR 评级信息（包含评级结果、说明和分阶段评分），与 DescribeHostVulRiskList 一致</p>
    */
    @SerializedName("VRPRatingInfo")
    @Expose
    private VPRRatingInfo VRPRatingInfo;

    /**
    * <p>漏洞类型<br>枚举值：<br>LINUX：Linux软件漏洞<br>WINDOWS：Windows系统补丁漏洞<br>WEB_CMS：Web-CMS漏洞<br>APPLICATION：应用漏洞<br>EMERGENCY：应急漏洞</p>
    */
    @SerializedName("VulCategory")
    @Expose
    private String VulCategory;

    /**
    * <p>CVE编号</p>
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * <p>修复主机名称</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>修复主机实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>关联组件&amp;路径数量</p>
    */
    @SerializedName("ComponentCount")
    @Expose
    private Long ComponentCount;

    /**
    * <p>关联组件&amp;路径列表</p>
    */
    @SerializedName("Components")
    @Expose
    private String [] Components;

    /**
    * <p>最近一次修复时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
    */
    @SerializedName("LatestFixTime")
    @Expose
    private String LatestFixTime;

    /**
    * <p>VPR评级依据</p>
    */
    @SerializedName("VPRExplainInfo")
    @Expose
    private VPRExplainInfo VPRExplainInfo;

    /**
     * Get <p>漏洞ID</p> 
     * @return VulId <p>漏洞ID</p>
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>漏洞ID</p>
     * @param VulId <p>漏洞ID</p>
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>漏洞名称</p> 
     * @return VulName <p>漏洞名称</p>
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set <p>漏洞名称</p>
     * @param VulName <p>漏洞名称</p>
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get <p>漏洞等级<br>枚举值：<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p> 
     * @return Level <p>漏洞等级<br>枚举值：<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>漏洞等级<br>枚举值：<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
     * @param Level <p>漏洞等级<br>枚举值：<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>VPR 评级信息（包含评级结果、说明和分阶段评分），与 DescribeHostVulRiskList 一致</p> 
     * @return VRPRatingInfo <p>VPR 评级信息（包含评级结果、说明和分阶段评分），与 DescribeHostVulRiskList 一致</p>
     */
    public VPRRatingInfo getVRPRatingInfo() {
        return this.VRPRatingInfo;
    }

    /**
     * Set <p>VPR 评级信息（包含评级结果、说明和分阶段评分），与 DescribeHostVulRiskList 一致</p>
     * @param VRPRatingInfo <p>VPR 评级信息（包含评级结果、说明和分阶段评分），与 DescribeHostVulRiskList 一致</p>
     */
    public void setVRPRatingInfo(VPRRatingInfo VRPRatingInfo) {
        this.VRPRatingInfo = VRPRatingInfo;
    }

    /**
     * Get <p>漏洞类型<br>枚举值：<br>LINUX：Linux软件漏洞<br>WINDOWS：Windows系统补丁漏洞<br>WEB_CMS：Web-CMS漏洞<br>APPLICATION：应用漏洞<br>EMERGENCY：应急漏洞</p> 
     * @return VulCategory <p>漏洞类型<br>枚举值：<br>LINUX：Linux软件漏洞<br>WINDOWS：Windows系统补丁漏洞<br>WEB_CMS：Web-CMS漏洞<br>APPLICATION：应用漏洞<br>EMERGENCY：应急漏洞</p>
     */
    public String getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set <p>漏洞类型<br>枚举值：<br>LINUX：Linux软件漏洞<br>WINDOWS：Windows系统补丁漏洞<br>WEB_CMS：Web-CMS漏洞<br>APPLICATION：应用漏洞<br>EMERGENCY：应急漏洞</p>
     * @param VulCategory <p>漏洞类型<br>枚举值：<br>LINUX：Linux软件漏洞<br>WINDOWS：Windows系统补丁漏洞<br>WEB_CMS：Web-CMS漏洞<br>APPLICATION：应用漏洞<br>EMERGENCY：应急漏洞</p>
     */
    public void setVulCategory(String VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get <p>CVE编号</p> 
     * @return CveId <p>CVE编号</p>
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set <p>CVE编号</p>
     * @param CveId <p>CVE编号</p>
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get <p>修复主机名称</p> 
     * @return MachineName <p>修复主机名称</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>修复主机名称</p>
     * @param MachineName <p>修复主机名称</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>修复主机实例ID</p> 
     * @return InstanceId <p>修复主机实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>修复主机实例ID</p>
     * @param InstanceId <p>修复主机实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>关联组件&amp;路径数量</p> 
     * @return ComponentCount <p>关联组件&amp;路径数量</p>
     */
    public Long getComponentCount() {
        return this.ComponentCount;
    }

    /**
     * Set <p>关联组件&amp;路径数量</p>
     * @param ComponentCount <p>关联组件&amp;路径数量</p>
     */
    public void setComponentCount(Long ComponentCount) {
        this.ComponentCount = ComponentCount;
    }

    /**
     * Get <p>关联组件&amp;路径列表</p> 
     * @return Components <p>关联组件&amp;路径列表</p>
     */
    public String [] getComponents() {
        return this.Components;
    }

    /**
     * Set <p>关联组件&amp;路径列表</p>
     * @param Components <p>关联组件&amp;路径列表</p>
     */
    public void setComponents(String [] Components) {
        this.Components = Components;
    }

    /**
     * Get <p>最近一次修复时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p> 
     * @return LatestFixTime <p>最近一次修复时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public String getLatestFixTime() {
        return this.LatestFixTime;
    }

    /**
     * Set <p>最近一次修复时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     * @param LatestFixTime <p>最近一次修复时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public void setLatestFixTime(String LatestFixTime) {
        this.LatestFixTime = LatestFixTime;
    }

    /**
     * Get <p>VPR评级依据</p> 
     * @return VPRExplainInfo <p>VPR评级依据</p>
     */
    public VPRExplainInfo getVPRExplainInfo() {
        return this.VPRExplainInfo;
    }

    /**
     * Set <p>VPR评级依据</p>
     * @param VPRExplainInfo <p>VPR评级依据</p>
     */
    public void setVPRExplainInfo(VPRExplainInfo VPRExplainInfo) {
        this.VPRExplainInfo = VPRExplainInfo;
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
        if (source.VPRExplainInfo != null) {
            this.VPRExplainInfo = new VPRExplainInfo(source.VPRExplainInfo);
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
        this.setParamObj(map, prefix + "VPRExplainInfo.", this.VPRExplainInfo);

    }
}

