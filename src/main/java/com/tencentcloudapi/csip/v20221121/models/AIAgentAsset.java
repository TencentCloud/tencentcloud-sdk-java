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

public class AIAgentAsset extends AbstractModel {

    /**
    * <p>ID 标识</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>agent 名称</p>
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * <p>agent 使用模型名称</p>
    */
    @SerializedName("AgentModel")
    @Expose
    private String [] AgentModel;

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>metadata 风险列表。有如下枚举值: 1. AK_TMP  2. USER_DATA</p>
    */
    @SerializedName("MetadataRiskList")
    @Expose
    private String [] MetadataRiskList;

    /**
    * <p>首次检出时间</p>
    */
    @SerializedName("IdentityTimeFirst")
    @Expose
    private String IdentityTimeFirst;

    /**
    * <p>最近检出时间</p>
    */
    @SerializedName("IdentityTimeLast")
    @Expose
    private String IdentityTimeLast;

    /**
    * <p>检出方式。有如下枚举值 1. FINGER 资产指纹方式检出 2. NETWORK 网络访问方式检出</p>
    */
    @SerializedName("IdentityMethod")
    @Expose
    private String IdentityMethod;

    /**
    * <p>暴露状态。有如下枚举值。1. EXPOSED；2.UNEXPOSED；</p><ol start="3"><li>UNKNOWN;</li></ol>
    */
    @SerializedName("ExposureStatus")
    @Expose
    private String ExposureStatus;

    /**
    * <p>metadata 有风险时对应路径</p>
    */
    @SerializedName("MetadataRiskURL")
    @Expose
    private String MetadataRiskURL;

    /**
    * <p>无</p>
    */
    @SerializedName("SkillState")
    @Expose
    private SkillState SkillState;

    /**
     * Get <p>ID 标识</p> 
     * @return ID <p>ID 标识</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>ID 标识</p>
     * @param ID <p>ID 标识</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>agent 名称</p> 
     * @return AgentName <p>agent 名称</p>
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set <p>agent 名称</p>
     * @param AgentName <p>agent 名称</p>
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get <p>agent 使用模型名称</p> 
     * @return AgentModel <p>agent 使用模型名称</p>
     */
    public String [] getAgentModel() {
        return this.AgentModel;
    }

    /**
     * Set <p>agent 使用模型名称</p>
     * @param AgentModel <p>agent 使用模型名称</p>
     */
    public void setAgentModel(String [] AgentModel) {
        this.AgentModel = AgentModel;
    }

    /**
     * Get <p>实例 ID</p> 
     * @return InstanceID <p>实例 ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例 ID</p>
     * @param InstanceID <p>实例 ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>metadata 风险列表。有如下枚举值: 1. AK_TMP  2. USER_DATA</p> 
     * @return MetadataRiskList <p>metadata 风险列表。有如下枚举值: 1. AK_TMP  2. USER_DATA</p>
     */
    public String [] getMetadataRiskList() {
        return this.MetadataRiskList;
    }

    /**
     * Set <p>metadata 风险列表。有如下枚举值: 1. AK_TMP  2. USER_DATA</p>
     * @param MetadataRiskList <p>metadata 风险列表。有如下枚举值: 1. AK_TMP  2. USER_DATA</p>
     */
    public void setMetadataRiskList(String [] MetadataRiskList) {
        this.MetadataRiskList = MetadataRiskList;
    }

    /**
     * Get <p>首次检出时间</p> 
     * @return IdentityTimeFirst <p>首次检出时间</p>
     */
    public String getIdentityTimeFirst() {
        return this.IdentityTimeFirst;
    }

    /**
     * Set <p>首次检出时间</p>
     * @param IdentityTimeFirst <p>首次检出时间</p>
     */
    public void setIdentityTimeFirst(String IdentityTimeFirst) {
        this.IdentityTimeFirst = IdentityTimeFirst;
    }

    /**
     * Get <p>最近检出时间</p> 
     * @return IdentityTimeLast <p>最近检出时间</p>
     */
    public String getIdentityTimeLast() {
        return this.IdentityTimeLast;
    }

    /**
     * Set <p>最近检出时间</p>
     * @param IdentityTimeLast <p>最近检出时间</p>
     */
    public void setIdentityTimeLast(String IdentityTimeLast) {
        this.IdentityTimeLast = IdentityTimeLast;
    }

    /**
     * Get <p>检出方式。有如下枚举值 1. FINGER 资产指纹方式检出 2. NETWORK 网络访问方式检出</p> 
     * @return IdentityMethod <p>检出方式。有如下枚举值 1. FINGER 资产指纹方式检出 2. NETWORK 网络访问方式检出</p>
     */
    public String getIdentityMethod() {
        return this.IdentityMethod;
    }

    /**
     * Set <p>检出方式。有如下枚举值 1. FINGER 资产指纹方式检出 2. NETWORK 网络访问方式检出</p>
     * @param IdentityMethod <p>检出方式。有如下枚举值 1. FINGER 资产指纹方式检出 2. NETWORK 网络访问方式检出</p>
     */
    public void setIdentityMethod(String IdentityMethod) {
        this.IdentityMethod = IdentityMethod;
    }

    /**
     * Get <p>暴露状态。有如下枚举值。1. EXPOSED；2.UNEXPOSED；</p><ol start="3"><li>UNKNOWN;</li></ol> 
     * @return ExposureStatus <p>暴露状态。有如下枚举值。1. EXPOSED；2.UNEXPOSED；</p><ol start="3"><li>UNKNOWN;</li></ol>
     */
    public String getExposureStatus() {
        return this.ExposureStatus;
    }

    /**
     * Set <p>暴露状态。有如下枚举值。1. EXPOSED；2.UNEXPOSED；</p><ol start="3"><li>UNKNOWN;</li></ol>
     * @param ExposureStatus <p>暴露状态。有如下枚举值。1. EXPOSED；2.UNEXPOSED；</p><ol start="3"><li>UNKNOWN;</li></ol>
     */
    public void setExposureStatus(String ExposureStatus) {
        this.ExposureStatus = ExposureStatus;
    }

    /**
     * Get <p>metadata 有风险时对应路径</p> 
     * @return MetadataRiskURL <p>metadata 有风险时对应路径</p>
     */
    public String getMetadataRiskURL() {
        return this.MetadataRiskURL;
    }

    /**
     * Set <p>metadata 有风险时对应路径</p>
     * @param MetadataRiskURL <p>metadata 有风险时对应路径</p>
     */
    public void setMetadataRiskURL(String MetadataRiskURL) {
        this.MetadataRiskURL = MetadataRiskURL;
    }

    /**
     * Get <p>无</p> 
     * @return SkillState <p>无</p>
     */
    public SkillState getSkillState() {
        return this.SkillState;
    }

    /**
     * Set <p>无</p>
     * @param SkillState <p>无</p>
     */
    public void setSkillState(SkillState SkillState) {
        this.SkillState = SkillState;
    }

    public AIAgentAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAgentAsset(AIAgentAsset source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.AgentModel != null) {
            this.AgentModel = new String[source.AgentModel.length];
            for (int i = 0; i < source.AgentModel.length; i++) {
                this.AgentModel[i] = new String(source.AgentModel[i]);
            }
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.MetadataRiskList != null) {
            this.MetadataRiskList = new String[source.MetadataRiskList.length];
            for (int i = 0; i < source.MetadataRiskList.length; i++) {
                this.MetadataRiskList[i] = new String(source.MetadataRiskList[i]);
            }
        }
        if (source.IdentityTimeFirst != null) {
            this.IdentityTimeFirst = new String(source.IdentityTimeFirst);
        }
        if (source.IdentityTimeLast != null) {
            this.IdentityTimeLast = new String(source.IdentityTimeLast);
        }
        if (source.IdentityMethod != null) {
            this.IdentityMethod = new String(source.IdentityMethod);
        }
        if (source.ExposureStatus != null) {
            this.ExposureStatus = new String(source.ExposureStatus);
        }
        if (source.MetadataRiskURL != null) {
            this.MetadataRiskURL = new String(source.MetadataRiskURL);
        }
        if (source.SkillState != null) {
            this.SkillState = new SkillState(source.SkillState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamArraySimple(map, prefix + "AgentModel.", this.AgentModel);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "MetadataRiskList.", this.MetadataRiskList);
        this.setParamSimple(map, prefix + "IdentityTimeFirst", this.IdentityTimeFirst);
        this.setParamSimple(map, prefix + "IdentityTimeLast", this.IdentityTimeLast);
        this.setParamSimple(map, prefix + "IdentityMethod", this.IdentityMethod);
        this.setParamSimple(map, prefix + "ExposureStatus", this.ExposureStatus);
        this.setParamSimple(map, prefix + "MetadataRiskURL", this.MetadataRiskURL);
        this.setParamObj(map, prefix + "SkillState.", this.SkillState);

    }
}

