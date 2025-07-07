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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordPlanOptData extends AbstractModel {

    /**
    * 上云计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 上云计划名称
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 上云模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 上云计划描述
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 云文件生命周期
    */
    @SerializedName("LifeCycle")
    @Expose
    private LifeCycleData LifeCycle;

    /**
    * 码流类型，default:设备默认码流类型，main:主码流，sub:子码流，其他根据设备能力集自定义
    */
    @SerializedName("StreamType")
    @Expose
    private String StreamType;

    /**
    * 录像补录模式（0:不启用，1:启用）
    */
    @SerializedName("RepairMode")
    @Expose
    private Long RepairMode;

    /**
     * Get 上云计划ID 
     * @return PlanId 上云计划ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 上云计划ID
     * @param PlanId 上云计划ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 上云计划名称 
     * @return PlanName 上云计划名称
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 上云计划名称
     * @param PlanName 上云计划名称
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 上云模板ID 
     * @return TemplateId 上云模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 上云模板ID
     * @param TemplateId 上云模板ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 上云计划描述 
     * @return Describe 上云计划描述
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 上云计划描述
     * @param Describe 上云计划描述
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 云文件生命周期 
     * @return LifeCycle 云文件生命周期
     */
    public LifeCycleData getLifeCycle() {
        return this.LifeCycle;
    }

    /**
     * Set 云文件生命周期
     * @param LifeCycle 云文件生命周期
     */
    public void setLifeCycle(LifeCycleData LifeCycle) {
        this.LifeCycle = LifeCycle;
    }

    /**
     * Get 码流类型，default:设备默认码流类型，main:主码流，sub:子码流，其他根据设备能力集自定义 
     * @return StreamType 码流类型，default:设备默认码流类型，main:主码流，sub:子码流，其他根据设备能力集自定义
     */
    public String getStreamType() {
        return this.StreamType;
    }

    /**
     * Set 码流类型，default:设备默认码流类型，main:主码流，sub:子码流，其他根据设备能力集自定义
     * @param StreamType 码流类型，default:设备默认码流类型，main:主码流，sub:子码流，其他根据设备能力集自定义
     */
    public void setStreamType(String StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get 录像补录模式（0:不启用，1:启用） 
     * @return RepairMode 录像补录模式（0:不启用，1:启用）
     */
    public Long getRepairMode() {
        return this.RepairMode;
    }

    /**
     * Set 录像补录模式（0:不启用，1:启用）
     * @param RepairMode 录像补录模式（0:不启用，1:启用）
     */
    public void setRepairMode(Long RepairMode) {
        this.RepairMode = RepairMode;
    }

    public RecordPlanOptData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordPlanOptData(RecordPlanOptData source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.LifeCycle != null) {
            this.LifeCycle = new LifeCycleData(source.LifeCycle);
        }
        if (source.StreamType != null) {
            this.StreamType = new String(source.StreamType);
        }
        if (source.RepairMode != null) {
            this.RepairMode = new Long(source.RepairMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamObj(map, prefix + "LifeCycle.", this.LifeCycle);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "RepairMode", this.RepairMode);

    }
}

