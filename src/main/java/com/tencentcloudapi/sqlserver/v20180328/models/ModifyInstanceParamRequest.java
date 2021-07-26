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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceParamRequest extends AbstractModel{

    /**
    * 实例短 ID 列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改的值。<b>注意</b>：如果修改的参数需要<b>重启</b>实例，那么您的实例将会在执行修改时<b>重启</b>。您可以通过DescribeInstanceParams接口查询修改参数时是否会重启实例，以免导致您的实例不符合预期重启。
    */
    @SerializedName("ParamList")
    @Expose
    private Parameter [] ParamList;

    /**
    * 执行参数调整任务的方式，默认为 0。支持值包括：0 - 立刻执行，1 - 时间窗执行。
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
     * Get 实例短 ID 列表 
     * @return InstanceIds 实例短 ID 列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例短 ID 列表
     * @param InstanceIds 实例短 ID 列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改的值。<b>注意</b>：如果修改的参数需要<b>重启</b>实例，那么您的实例将会在执行修改时<b>重启</b>。您可以通过DescribeInstanceParams接口查询修改参数时是否会重启实例，以免导致您的实例不符合预期重启。 
     * @return ParamList 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改的值。<b>注意</b>：如果修改的参数需要<b>重启</b>实例，那么您的实例将会在执行修改时<b>重启</b>。您可以通过DescribeInstanceParams接口查询修改参数时是否会重启实例，以免导致您的实例不符合预期重启。
     */
    public Parameter [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改的值。<b>注意</b>：如果修改的参数需要<b>重启</b>实例，那么您的实例将会在执行修改时<b>重启</b>。您可以通过DescribeInstanceParams接口查询修改参数时是否会重启实例，以免导致您的实例不符合预期重启。
     * @param ParamList 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改的值。<b>注意</b>：如果修改的参数需要<b>重启</b>实例，那么您的实例将会在执行修改时<b>重启</b>。您可以通过DescribeInstanceParams接口查询修改参数时是否会重启实例，以免导致您的实例不符合预期重启。
     */
    public void setParamList(Parameter [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get 执行参数调整任务的方式，默认为 0。支持值包括：0 - 立刻执行，1 - 时间窗执行。 
     * @return WaitSwitch 执行参数调整任务的方式，默认为 0。支持值包括：0 - 立刻执行，1 - 时间窗执行。
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set 执行参数调整任务的方式，默认为 0。支持值包括：0 - 立刻执行，1 - 时间窗执行。
     * @param WaitSwitch 执行参数调整任务的方式，默认为 0。支持值包括：0 - 立刻执行，1 - 时间窗执行。
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    public ModifyInstanceParamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceParamRequest(ModifyInstanceParamRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ParamList != null) {
            this.ParamList = new Parameter[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new Parameter(source.ParamList[i]);
            }
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Long(source.WaitSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);

    }
}

