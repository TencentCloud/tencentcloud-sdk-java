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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceParamRequest extends AbstractModel {

    /**
    * 实例 ID 列表。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改成的值。
    */
    @SerializedName("ParamList")
    @Expose
    private Parameter [] ParamList;

    /**
    * 模板 ID，ParamList 和 TemplateId 必须至少传其中之一。可通过 [DescribeParamTemplates](https://cloud.tencent.com/document/api/236/32659) 接口获取。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 执行参数调整任务的方式，默认为 0。支持值包括：0 - 立刻执行，1 - 时间窗执行；当该值为 1 时，每次只能传一个实例（InstanceIds数量为1）
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
    * 参数是否同步到主实例下的只读实例。true 为不同步，false 为同步。默认为 false。
    */
    @SerializedName("NotSyncRo")
    @Expose
    private Boolean NotSyncRo;

    /**
    * 参数是否同步到主实例下的灾备实例。true 为不同步，false 为同步。默认为 false。
    */
    @SerializedName("NotSyncDr")
    @Expose
    private Boolean NotSyncDr;

    /**
     * Get 实例 ID 列表。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。 
     * @return InstanceIds 实例 ID 列表。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例 ID 列表。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     * @param InstanceIds 实例 ID 列表。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改成的值。 
     * @return ParamList 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改成的值。
     */
    public Parameter [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改成的值。
     * @param ParamList 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改成的值。
     */
    public void setParamList(Parameter [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get 模板 ID，ParamList 和 TemplateId 必须至少传其中之一。可通过 [DescribeParamTemplates](https://cloud.tencent.com/document/api/236/32659) 接口获取。 
     * @return TemplateId 模板 ID，ParamList 和 TemplateId 必须至少传其中之一。可通过 [DescribeParamTemplates](https://cloud.tencent.com/document/api/236/32659) 接口获取。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板 ID，ParamList 和 TemplateId 必须至少传其中之一。可通过 [DescribeParamTemplates](https://cloud.tencent.com/document/api/236/32659) 接口获取。
     * @param TemplateId 模板 ID，ParamList 和 TemplateId 必须至少传其中之一。可通过 [DescribeParamTemplates](https://cloud.tencent.com/document/api/236/32659) 接口获取。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 执行参数调整任务的方式，默认为 0。支持值包括：0 - 立刻执行，1 - 时间窗执行；当该值为 1 时，每次只能传一个实例（InstanceIds数量为1） 
     * @return WaitSwitch 执行参数调整任务的方式，默认为 0。支持值包括：0 - 立刻执行，1 - 时间窗执行；当该值为 1 时，每次只能传一个实例（InstanceIds数量为1）
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set 执行参数调整任务的方式，默认为 0。支持值包括：0 - 立刻执行，1 - 时间窗执行；当该值为 1 时，每次只能传一个实例（InstanceIds数量为1）
     * @param WaitSwitch 执行参数调整任务的方式，默认为 0。支持值包括：0 - 立刻执行，1 - 时间窗执行；当该值为 1 时，每次只能传一个实例（InstanceIds数量为1）
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    /**
     * Get 参数是否同步到主实例下的只读实例。true 为不同步，false 为同步。默认为 false。 
     * @return NotSyncRo 参数是否同步到主实例下的只读实例。true 为不同步，false 为同步。默认为 false。
     */
    public Boolean getNotSyncRo() {
        return this.NotSyncRo;
    }

    /**
     * Set 参数是否同步到主实例下的只读实例。true 为不同步，false 为同步。默认为 false。
     * @param NotSyncRo 参数是否同步到主实例下的只读实例。true 为不同步，false 为同步。默认为 false。
     */
    public void setNotSyncRo(Boolean NotSyncRo) {
        this.NotSyncRo = NotSyncRo;
    }

    /**
     * Get 参数是否同步到主实例下的灾备实例。true 为不同步，false 为同步。默认为 false。 
     * @return NotSyncDr 参数是否同步到主实例下的灾备实例。true 为不同步，false 为同步。默认为 false。
     */
    public Boolean getNotSyncDr() {
        return this.NotSyncDr;
    }

    /**
     * Set 参数是否同步到主实例下的灾备实例。true 为不同步，false 为同步。默认为 false。
     * @param NotSyncDr 参数是否同步到主实例下的灾备实例。true 为不同步，false 为同步。默认为 false。
     */
    public void setNotSyncDr(Boolean NotSyncDr) {
        this.NotSyncDr = NotSyncDr;
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
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Long(source.WaitSwitch);
        }
        if (source.NotSyncRo != null) {
            this.NotSyncRo = new Boolean(source.NotSyncRo);
        }
        if (source.NotSyncDr != null) {
            this.NotSyncDr = new Boolean(source.NotSyncDr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);
        this.setParamSimple(map, prefix + "NotSyncRo", this.NotSyncRo);
        this.setParamSimple(map, prefix + "NotSyncDr", this.NotSyncDr);

    }
}

