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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReferenceAppDetail extends AbstractModel {

    /**
    * <p>来源应用当前名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>来源应用模式</p><p>枚举值：</p><ul><li>1： 标准模式</li><li>2： Multi-Agent模式</li><li>3： 单工作流模式</li><li>4： Claw模式</li></ul>
    */
    @SerializedName("AppMode")
    @Expose
    private Long AppMode;

    /**
    * <p>主 Agent 名称</p>
    */
    @SerializedName("MainAgentName")
    @Expose
    private String MainAgentName;

    /**
    * <p>子 Agent 名称列表</p>
    */
    @SerializedName("SubAgentNameList")
    @Expose
    private String [] SubAgentNameList;

    /**
    * <p>来源应用创建人</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>来源应用修改时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>来源应用当前名称</p> 
     * @return Name <p>来源应用当前名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>来源应用当前名称</p>
     * @param Name <p>来源应用当前名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>来源应用模式</p><p>枚举值：</p><ul><li>1： 标准模式</li><li>2： Multi-Agent模式</li><li>3： 单工作流模式</li><li>4： Claw模式</li></ul> 
     * @return AppMode <p>来源应用模式</p><p>枚举值：</p><ul><li>1： 标准模式</li><li>2： Multi-Agent模式</li><li>3： 单工作流模式</li><li>4： Claw模式</li></ul>
     */
    public Long getAppMode() {
        return this.AppMode;
    }

    /**
     * Set <p>来源应用模式</p><p>枚举值：</p><ul><li>1： 标准模式</li><li>2： Multi-Agent模式</li><li>3： 单工作流模式</li><li>4： Claw模式</li></ul>
     * @param AppMode <p>来源应用模式</p><p>枚举值：</p><ul><li>1： 标准模式</li><li>2： Multi-Agent模式</li><li>3： 单工作流模式</li><li>4： Claw模式</li></ul>
     */
    public void setAppMode(Long AppMode) {
        this.AppMode = AppMode;
    }

    /**
     * Get <p>主 Agent 名称</p> 
     * @return MainAgentName <p>主 Agent 名称</p>
     */
    public String getMainAgentName() {
        return this.MainAgentName;
    }

    /**
     * Set <p>主 Agent 名称</p>
     * @param MainAgentName <p>主 Agent 名称</p>
     */
    public void setMainAgentName(String MainAgentName) {
        this.MainAgentName = MainAgentName;
    }

    /**
     * Get <p>子 Agent 名称列表</p> 
     * @return SubAgentNameList <p>子 Agent 名称列表</p>
     */
    public String [] getSubAgentNameList() {
        return this.SubAgentNameList;
    }

    /**
     * Set <p>子 Agent 名称列表</p>
     * @param SubAgentNameList <p>子 Agent 名称列表</p>
     */
    public void setSubAgentNameList(String [] SubAgentNameList) {
        this.SubAgentNameList = SubAgentNameList;
    }

    /**
     * Get <p>来源应用创建人</p> 
     * @return Creator <p>来源应用创建人</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>来源应用创建人</p>
     * @param Creator <p>来源应用创建人</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>来源应用修改时间</p> 
     * @return UpdateTime <p>来源应用修改时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>来源应用修改时间</p>
     * @param UpdateTime <p>来源应用修改时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ReferenceAppDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReferenceAppDetail(ReferenceAppDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AppMode != null) {
            this.AppMode = new Long(source.AppMode);
        }
        if (source.MainAgentName != null) {
            this.MainAgentName = new String(source.MainAgentName);
        }
        if (source.SubAgentNameList != null) {
            this.SubAgentNameList = new String[source.SubAgentNameList.length];
            for (int i = 0; i < source.SubAgentNameList.length; i++) {
                this.SubAgentNameList[i] = new String(source.SubAgentNameList[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AppMode", this.AppMode);
        this.setParamSimple(map, prefix + "MainAgentName", this.MainAgentName);
        this.setParamArraySimple(map, prefix + "SubAgentNameList.", this.SubAgentNameList);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

