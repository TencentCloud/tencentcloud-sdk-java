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

public class AddRecordPlanRequest extends AbstractModel{

    /**
    * 实时上云计划名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 实时上云模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 生命周期
    */
    @SerializedName("LifeCycle")
    @Expose
    private LifeCycleData LifeCycle;

    /**
    * 上云计划描述，仅支持中文、英文、数字、_、-，长度不超过128个字符 
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 码流类型，default:不指定码流类型，以设备默认推送类型为主， main:主码流，sub:子码流，其他根据设备能力集自定义，不填按默认类型处理，长度不能超过32个字节
    */
    @SerializedName("StreamType")
    @Expose
    private String StreamType;

    /**
    * 添加录像的设备的通道信息，一次添加通道总数不超过5000个，包括组织目录下的通道数量
    */
    @SerializedName("Channels")
    @Expose
    private ChannelInfo [] Channels;

    /**
    * 添加组织目录下所有设备通道，Json数组，可以为空，通道总数量不超过5000个（包括Channel字段的数量）
    */
    @SerializedName("OrganizationId")
    @Expose
    private String [] OrganizationId;

    /**
     * Get 实时上云计划名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复 
     * @return PlanName 实时上云计划名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 实时上云计划名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复
     * @param PlanName 实时上云计划名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 实时上云模板ID 
     * @return TemplateId 实时上云模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 实时上云模板ID
     * @param TemplateId 实时上云模板ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 生命周期 
     * @return LifeCycle 生命周期
     */
    public LifeCycleData getLifeCycle() {
        return this.LifeCycle;
    }

    /**
     * Set 生命周期
     * @param LifeCycle 生命周期
     */
    public void setLifeCycle(LifeCycleData LifeCycle) {
        this.LifeCycle = LifeCycle;
    }

    /**
     * Get 上云计划描述，仅支持中文、英文、数字、_、-，长度不超过128个字符  
     * @return Describe 上云计划描述，仅支持中文、英文、数字、_、-，长度不超过128个字符 
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 上云计划描述，仅支持中文、英文、数字、_、-，长度不超过128个字符 
     * @param Describe 上云计划描述，仅支持中文、英文、数字、_、-，长度不超过128个字符 
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 码流类型，default:不指定码流类型，以设备默认推送类型为主， main:主码流，sub:子码流，其他根据设备能力集自定义，不填按默认类型处理，长度不能超过32个字节 
     * @return StreamType 码流类型，default:不指定码流类型，以设备默认推送类型为主， main:主码流，sub:子码流，其他根据设备能力集自定义，不填按默认类型处理，长度不能超过32个字节
     */
    public String getStreamType() {
        return this.StreamType;
    }

    /**
     * Set 码流类型，default:不指定码流类型，以设备默认推送类型为主， main:主码流，sub:子码流，其他根据设备能力集自定义，不填按默认类型处理，长度不能超过32个字节
     * @param StreamType 码流类型，default:不指定码流类型，以设备默认推送类型为主， main:主码流，sub:子码流，其他根据设备能力集自定义，不填按默认类型处理，长度不能超过32个字节
     */
    public void setStreamType(String StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get 添加录像的设备的通道信息，一次添加通道总数不超过5000个，包括组织目录下的通道数量 
     * @return Channels 添加录像的设备的通道信息，一次添加通道总数不超过5000个，包括组织目录下的通道数量
     */
    public ChannelInfo [] getChannels() {
        return this.Channels;
    }

    /**
     * Set 添加录像的设备的通道信息，一次添加通道总数不超过5000个，包括组织目录下的通道数量
     * @param Channels 添加录像的设备的通道信息，一次添加通道总数不超过5000个，包括组织目录下的通道数量
     */
    public void setChannels(ChannelInfo [] Channels) {
        this.Channels = Channels;
    }

    /**
     * Get 添加组织目录下所有设备通道，Json数组，可以为空，通道总数量不超过5000个（包括Channel字段的数量） 
     * @return OrganizationId 添加组织目录下所有设备通道，Json数组，可以为空，通道总数量不超过5000个（包括Channel字段的数量）
     */
    public String [] getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 添加组织目录下所有设备通道，Json数组，可以为空，通道总数量不超过5000个（包括Channel字段的数量）
     * @param OrganizationId 添加组织目录下所有设备通道，Json数组，可以为空，通道总数量不超过5000个（包括Channel字段的数量）
     */
    public void setOrganizationId(String [] OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    public AddRecordPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddRecordPlanRequest(AddRecordPlanRequest source) {
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.LifeCycle != null) {
            this.LifeCycle = new LifeCycleData(source.LifeCycle);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.StreamType != null) {
            this.StreamType = new String(source.StreamType);
        }
        if (source.Channels != null) {
            this.Channels = new ChannelInfo[source.Channels.length];
            for (int i = 0; i < source.Channels.length; i++) {
                this.Channels[i] = new ChannelInfo(source.Channels[i]);
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
        this.setParamObj(map, prefix + "LifeCycle.", this.LifeCycle);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamArrayObj(map, prefix + "Channels.", this.Channels);
        this.setParamArraySimple(map, prefix + "OrganizationId.", this.OrganizationId);

    }
}

