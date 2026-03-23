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
    * ID 标识
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * agent 名称
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * agent 使用模型名称
    */
    @SerializedName("AgentModel")
    @Expose
    private String [] AgentModel;

    /**
    * 实例 ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * metadata 风险列表。有如下枚举值: 1. AK_TMP  2. USER_DATA
    */
    @SerializedName("MetadataRiskList")
    @Expose
    private String [] MetadataRiskList;

    /**
    * 首次检出时间
    */
    @SerializedName("IdentityTimeFirst")
    @Expose
    private String IdentityTimeFirst;

    /**
    * 最近检出时间
    */
    @SerializedName("IdentityTimeLast")
    @Expose
    private String IdentityTimeLast;

    /**
    * 检出方式。有如下枚举值 1. FINGER 资产指纹方式检出 2. NETWORK 网络访问方式检出
    */
    @SerializedName("IdentityMethod")
    @Expose
    private String IdentityMethod;

    /**
    * 暴露状态。有如下枚举值。1. EXPOSED；2.UNEXPOSED；
3. UNKNOWN;
    */
    @SerializedName("ExposureStatus")
    @Expose
    private String ExposureStatus;

    /**
    * metadata 有风险时对应路径
    */
    @SerializedName("MetadataRiskURL")
    @Expose
    private String MetadataRiskURL;

    /**
     * Get ID 标识 
     * @return ID ID 标识
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set ID 标识
     * @param ID ID 标识
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get agent 名称 
     * @return AgentName agent 名称
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set agent 名称
     * @param AgentName agent 名称
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get agent 使用模型名称 
     * @return AgentModel agent 使用模型名称
     */
    public String [] getAgentModel() {
        return this.AgentModel;
    }

    /**
     * Set agent 使用模型名称
     * @param AgentModel agent 使用模型名称
     */
    public void setAgentModel(String [] AgentModel) {
        this.AgentModel = AgentModel;
    }

    /**
     * Get 实例 ID 
     * @return InstanceID 实例 ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例 ID
     * @param InstanceID 实例 ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get metadata 风险列表。有如下枚举值: 1. AK_TMP  2. USER_DATA 
     * @return MetadataRiskList metadata 风险列表。有如下枚举值: 1. AK_TMP  2. USER_DATA
     */
    public String [] getMetadataRiskList() {
        return this.MetadataRiskList;
    }

    /**
     * Set metadata 风险列表。有如下枚举值: 1. AK_TMP  2. USER_DATA
     * @param MetadataRiskList metadata 风险列表。有如下枚举值: 1. AK_TMP  2. USER_DATA
     */
    public void setMetadataRiskList(String [] MetadataRiskList) {
        this.MetadataRiskList = MetadataRiskList;
    }

    /**
     * Get 首次检出时间 
     * @return IdentityTimeFirst 首次检出时间
     */
    public String getIdentityTimeFirst() {
        return this.IdentityTimeFirst;
    }

    /**
     * Set 首次检出时间
     * @param IdentityTimeFirst 首次检出时间
     */
    public void setIdentityTimeFirst(String IdentityTimeFirst) {
        this.IdentityTimeFirst = IdentityTimeFirst;
    }

    /**
     * Get 最近检出时间 
     * @return IdentityTimeLast 最近检出时间
     */
    public String getIdentityTimeLast() {
        return this.IdentityTimeLast;
    }

    /**
     * Set 最近检出时间
     * @param IdentityTimeLast 最近检出时间
     */
    public void setIdentityTimeLast(String IdentityTimeLast) {
        this.IdentityTimeLast = IdentityTimeLast;
    }

    /**
     * Get 检出方式。有如下枚举值 1. FINGER 资产指纹方式检出 2. NETWORK 网络访问方式检出 
     * @return IdentityMethod 检出方式。有如下枚举值 1. FINGER 资产指纹方式检出 2. NETWORK 网络访问方式检出
     */
    public String getIdentityMethod() {
        return this.IdentityMethod;
    }

    /**
     * Set 检出方式。有如下枚举值 1. FINGER 资产指纹方式检出 2. NETWORK 网络访问方式检出
     * @param IdentityMethod 检出方式。有如下枚举值 1. FINGER 资产指纹方式检出 2. NETWORK 网络访问方式检出
     */
    public void setIdentityMethod(String IdentityMethod) {
        this.IdentityMethod = IdentityMethod;
    }

    /**
     * Get 暴露状态。有如下枚举值。1. EXPOSED；2.UNEXPOSED；
3. UNKNOWN; 
     * @return ExposureStatus 暴露状态。有如下枚举值。1. EXPOSED；2.UNEXPOSED；
3. UNKNOWN;
     */
    public String getExposureStatus() {
        return this.ExposureStatus;
    }

    /**
     * Set 暴露状态。有如下枚举值。1. EXPOSED；2.UNEXPOSED；
3. UNKNOWN;
     * @param ExposureStatus 暴露状态。有如下枚举值。1. EXPOSED；2.UNEXPOSED；
3. UNKNOWN;
     */
    public void setExposureStatus(String ExposureStatus) {
        this.ExposureStatus = ExposureStatus;
    }

    /**
     * Get metadata 有风险时对应路径 
     * @return MetadataRiskURL metadata 有风险时对应路径
     */
    public String getMetadataRiskURL() {
        return this.MetadataRiskURL;
    }

    /**
     * Set metadata 有风险时对应路径
     * @param MetadataRiskURL metadata 有风险时对应路径
     */
    public void setMetadataRiskURL(String MetadataRiskURL) {
        this.MetadataRiskURL = MetadataRiskURL;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamArraySimple(map, prefix + "AgentModel.", this.AgentModel);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamArraySimple(map, prefix + "MetadataRiskList.", this.MetadataRiskList);
        this.setParamSimple(map, prefix + "IdentityTimeFirst", this.IdentityTimeFirst);
        this.setParamSimple(map, prefix + "IdentityTimeLast", this.IdentityTimeLast);
        this.setParamSimple(map, prefix + "IdentityMethod", this.IdentityMethod);
        this.setParamSimple(map, prefix + "ExposureStatus", this.ExposureStatus);
        this.setParamSimple(map, prefix + "MetadataRiskURL", this.MetadataRiskURL);

    }
}

