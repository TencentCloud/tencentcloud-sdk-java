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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRecordPlanData extends AbstractModel{

    /**
    * 上云计划名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复，不修改名称时，不需要该字段
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 上云模板ID，不修改模板ID时，不需要该字段
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 上云计划描述，仅支持中文、英文、数字、_、-，长度不超过128个字符， 不修改描述时，不需要该字段
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 码流类型，default:不指定码流类型，以设备默认推送类型为主， main:主码流，sub:子码流，其他根据设备能力集自定义，长度不能超过32个字节
    */
    @SerializedName("StreamType")
    @Expose
    private String StreamType;

    /**
    * 生命周期，文件生命周期设置，管理文件冷、热存储的时间，不修改生命周期时，不需要该字段
    */
    @SerializedName("LifeCycle")
    @Expose
    private LifeCycleData LifeCycle;

    /**
    * 要新增的设备通道,Json数组，没有新增时，不需要该字段，一次添加通道总数不超过5000个，包括组织目录下的通道数量
    */
    @SerializedName("Add")
    @Expose
    private ChannelInfo [] Add;

    /**
    * 要删除的设备通道，Json数组，内容为要删除的设备通道id，没有删除设备通道时，不需要该字段
    */
    @SerializedName("Del")
    @Expose
    private String [] Del;

    /**
    * 组织目录ID，添加组织目录下所有设备通道，Json数组，可以为空，并且通道总数量不超过5000个（包括Add字段通道数量）
    */
    @SerializedName("OrganizationId")
    @Expose
    private String [] OrganizationId;

    /**
     * Get 上云计划名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复，不修改名称时，不需要该字段 
     * @return PlanName 上云计划名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复，不修改名称时，不需要该字段
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 上云计划名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复，不修改名称时，不需要该字段
     * @param PlanName 上云计划名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复，不修改名称时，不需要该字段
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 上云模板ID，不修改模板ID时，不需要该字段 
     * @return TemplateId 上云模板ID，不修改模板ID时，不需要该字段
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 上云模板ID，不修改模板ID时，不需要该字段
     * @param TemplateId 上云模板ID，不修改模板ID时，不需要该字段
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 上云计划描述，仅支持中文、英文、数字、_、-，长度不超过128个字符， 不修改描述时，不需要该字段 
     * @return Describe 上云计划描述，仅支持中文、英文、数字、_、-，长度不超过128个字符， 不修改描述时，不需要该字段
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 上云计划描述，仅支持中文、英文、数字、_、-，长度不超过128个字符， 不修改描述时，不需要该字段
     * @param Describe 上云计划描述，仅支持中文、英文、数字、_、-，长度不超过128个字符， 不修改描述时，不需要该字段
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 码流类型，default:不指定码流类型，以设备默认推送类型为主， main:主码流，sub:子码流，其他根据设备能力集自定义，长度不能超过32个字节 
     * @return StreamType 码流类型，default:不指定码流类型，以设备默认推送类型为主， main:主码流，sub:子码流，其他根据设备能力集自定义，长度不能超过32个字节
     */
    public String getStreamType() {
        return this.StreamType;
    }

    /**
     * Set 码流类型，default:不指定码流类型，以设备默认推送类型为主， main:主码流，sub:子码流，其他根据设备能力集自定义，长度不能超过32个字节
     * @param StreamType 码流类型，default:不指定码流类型，以设备默认推送类型为主， main:主码流，sub:子码流，其他根据设备能力集自定义，长度不能超过32个字节
     */
    public void setStreamType(String StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get 生命周期，文件生命周期设置，管理文件冷、热存储的时间，不修改生命周期时，不需要该字段 
     * @return LifeCycle 生命周期，文件生命周期设置，管理文件冷、热存储的时间，不修改生命周期时，不需要该字段
     */
    public LifeCycleData getLifeCycle() {
        return this.LifeCycle;
    }

    /**
     * Set 生命周期，文件生命周期设置，管理文件冷、热存储的时间，不修改生命周期时，不需要该字段
     * @param LifeCycle 生命周期，文件生命周期设置，管理文件冷、热存储的时间，不修改生命周期时，不需要该字段
     */
    public void setLifeCycle(LifeCycleData LifeCycle) {
        this.LifeCycle = LifeCycle;
    }

    /**
     * Get 要新增的设备通道,Json数组，没有新增时，不需要该字段，一次添加通道总数不超过5000个，包括组织目录下的通道数量 
     * @return Add 要新增的设备通道,Json数组，没有新增时，不需要该字段，一次添加通道总数不超过5000个，包括组织目录下的通道数量
     */
    public ChannelInfo [] getAdd() {
        return this.Add;
    }

    /**
     * Set 要新增的设备通道,Json数组，没有新增时，不需要该字段，一次添加通道总数不超过5000个，包括组织目录下的通道数量
     * @param Add 要新增的设备通道,Json数组，没有新增时，不需要该字段，一次添加通道总数不超过5000个，包括组织目录下的通道数量
     */
    public void setAdd(ChannelInfo [] Add) {
        this.Add = Add;
    }

    /**
     * Get 要删除的设备通道，Json数组，内容为要删除的设备通道id，没有删除设备通道时，不需要该字段 
     * @return Del 要删除的设备通道，Json数组，内容为要删除的设备通道id，没有删除设备通道时，不需要该字段
     */
    public String [] getDel() {
        return this.Del;
    }

    /**
     * Set 要删除的设备通道，Json数组，内容为要删除的设备通道id，没有删除设备通道时，不需要该字段
     * @param Del 要删除的设备通道，Json数组，内容为要删除的设备通道id，没有删除设备通道时，不需要该字段
     */
    public void setDel(String [] Del) {
        this.Del = Del;
    }

    /**
     * Get 组织目录ID，添加组织目录下所有设备通道，Json数组，可以为空，并且通道总数量不超过5000个（包括Add字段通道数量） 
     * @return OrganizationId 组织目录ID，添加组织目录下所有设备通道，Json数组，可以为空，并且通道总数量不超过5000个（包括Add字段通道数量）
     */
    public String [] getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 组织目录ID，添加组织目录下所有设备通道，Json数组，可以为空，并且通道总数量不超过5000个（包括Add字段通道数量）
     * @param OrganizationId 组织目录ID，添加组织目录下所有设备通道，Json数组，可以为空，并且通道总数量不超过5000个（包括Add字段通道数量）
     */
    public void setOrganizationId(String [] OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    public UpdateRecordPlanData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRecordPlanData(UpdateRecordPlanData source) {
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.StreamType != null) {
            this.StreamType = new String(source.StreamType);
        }
        if (source.LifeCycle != null) {
            this.LifeCycle = new LifeCycleData(source.LifeCycle);
        }
        if (source.Add != null) {
            this.Add = new ChannelInfo[source.Add.length];
            for (int i = 0; i < source.Add.length; i++) {
                this.Add[i] = new ChannelInfo(source.Add[i]);
            }
        }
        if (source.Del != null) {
            this.Del = new String[source.Del.length];
            for (int i = 0; i < source.Del.length; i++) {
                this.Del[i] = new String(source.Del[i]);
            }
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String[source.OrganizationId.length];
            for (int i = 0; i < source.OrganizationId.length; i++) {
                this.OrganizationId[i] = new String(source.OrganizationId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamObj(map, prefix + "LifeCycle.", this.LifeCycle);
        this.setParamArrayObj(map, prefix + "Add.", this.Add);
        this.setParamArraySimple(map, prefix + "Del.", this.Del);
        this.setParamArraySimple(map, prefix + "OrganizationId.", this.OrganizationId);

    }
}

