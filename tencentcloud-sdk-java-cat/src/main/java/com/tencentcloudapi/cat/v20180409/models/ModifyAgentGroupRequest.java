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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAgentGroupRequest extends AbstractModel{

    /**
    * 拨测分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 拨测分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 是否为默认分组。取值可为0，1。取 1 时表示设置为默认分组
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * Province, Isp 需要成对地进行选择。参数对的取值范围。参见：DescribeAgents 的返回结果。
    */
    @SerializedName("Agents")
    @Expose
    private CatAgent [] Agents;

    /**
     * Get 拨测分组ID 
     * @return GroupId 拨测分组ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 拨测分组ID
     * @param GroupId 拨测分组ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 拨测分组名称 
     * @return GroupName 拨测分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 拨测分组名称
     * @param GroupName 拨测分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 是否为默认分组。取值可为0，1。取 1 时表示设置为默认分组 
     * @return IsDefault 是否为默认分组。取值可为0，1。取 1 时表示设置为默认分组
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为默认分组。取值可为0，1。取 1 时表示设置为默认分组
     * @param IsDefault 是否为默认分组。取值可为0，1。取 1 时表示设置为默认分组
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Province, Isp 需要成对地进行选择。参数对的取值范围。参见：DescribeAgents 的返回结果。 
     * @return Agents Province, Isp 需要成对地进行选择。参数对的取值范围。参见：DescribeAgents 的返回结果。
     */
    public CatAgent [] getAgents() {
        return this.Agents;
    }

    /**
     * Set Province, Isp 需要成对地进行选择。参数对的取值范围。参见：DescribeAgents 的返回结果。
     * @param Agents Province, Isp 需要成对地进行选择。参数对的取值范围。参见：DescribeAgents 的返回结果。
     */
    public void setAgents(CatAgent [] Agents) {
        this.Agents = Agents;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamArrayObj(map, prefix + "Agents.", this.Agents);

    }
}

