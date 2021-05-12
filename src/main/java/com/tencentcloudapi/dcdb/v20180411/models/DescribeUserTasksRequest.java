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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserTasksRequest extends AbstractModel{

    /**
    * 任务的状态列表。0-任务启动中；1-任务运行中；2-任务成功；3-任务失败
    */
    @SerializedName("Statuses")
    @Expose
    private Long [] Statuses;

    /**
    * 实例ID列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 任务类型列表，当前支持的任务类型有：0-回档任务；1-创建实例任务；2-扩容任务；3-迁移任务；4-删除实例任务；5-重启任务
    */
    @SerializedName("FlowTypes")
    @Expose
    private Long [] FlowTypes;

    /**
    * 任务的创建时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务ID的数组
    */
    @SerializedName("UTaskIds")
    @Expose
    private Long [] UTaskIds;

    /**
    * 每次最多返回多少条任务，取值范围为(0,100]，不传的话默认值为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 返回任务默认是按照创建时间降序排列，从偏移值Offset处开始返回
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 任务的状态列表。0-任务启动中；1-任务运行中；2-任务成功；3-任务失败 
     * @return Statuses 任务的状态列表。0-任务启动中；1-任务运行中；2-任务成功；3-任务失败
     */
    public Long [] getStatuses() {
        return this.Statuses;
    }

    /**
     * Set 任务的状态列表。0-任务启动中；1-任务运行中；2-任务成功；3-任务失败
     * @param Statuses 任务的状态列表。0-任务启动中；1-任务运行中；2-任务成功；3-任务失败
     */
    public void setStatuses(Long [] Statuses) {
        this.Statuses = Statuses;
    }

    /**
     * Get 实例ID列表 
     * @return InstanceIds 实例ID列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID列表
     * @param InstanceIds 实例ID列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 任务类型列表，当前支持的任务类型有：0-回档任务；1-创建实例任务；2-扩容任务；3-迁移任务；4-删除实例任务；5-重启任务 
     * @return FlowTypes 任务类型列表，当前支持的任务类型有：0-回档任务；1-创建实例任务；2-扩容任务；3-迁移任务；4-删除实例任务；5-重启任务
     */
    public Long [] getFlowTypes() {
        return this.FlowTypes;
    }

    /**
     * Set 任务类型列表，当前支持的任务类型有：0-回档任务；1-创建实例任务；2-扩容任务；3-迁移任务；4-删除实例任务；5-重启任务
     * @param FlowTypes 任务类型列表，当前支持的任务类型有：0-回档任务；1-创建实例任务；2-扩容任务；3-迁移任务；4-删除实例任务；5-重启任务
     */
    public void setFlowTypes(Long [] FlowTypes) {
        this.FlowTypes = FlowTypes;
    }

    /**
     * Get 任务的创建时间 
     * @return StartTime 任务的创建时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务的创建时间
     * @param StartTime 任务的创建时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务的结束时间 
     * @return EndTime 任务的结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务的结束时间
     * @param EndTime 任务的结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务ID的数组 
     * @return UTaskIds 任务ID的数组
     */
    public Long [] getUTaskIds() {
        return this.UTaskIds;
    }

    /**
     * Set 任务ID的数组
     * @param UTaskIds 任务ID的数组
     */
    public void setUTaskIds(Long [] UTaskIds) {
        this.UTaskIds = UTaskIds;
    }

    /**
     * Get 每次最多返回多少条任务，取值范围为(0,100]，不传的话默认值为20 
     * @return Limit 每次最多返回多少条任务，取值范围为(0,100]，不传的话默认值为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每次最多返回多少条任务，取值范围为(0,100]，不传的话默认值为20
     * @param Limit 每次最多返回多少条任务，取值范围为(0,100]，不传的话默认值为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 返回任务默认是按照创建时间降序排列，从偏移值Offset处开始返回 
     * @return Offset 返回任务默认是按照创建时间降序排列，从偏移值Offset处开始返回
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回任务默认是按照创建时间降序排列，从偏移值Offset处开始返回
     * @param Offset 返回任务默认是按照创建时间降序排列，从偏移值Offset处开始返回
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeUserTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserTasksRequest(DescribeUserTasksRequest source) {
        if (source.Statuses != null) {
            this.Statuses = new Long[source.Statuses.length];
            for (int i = 0; i < source.Statuses.length; i++) {
                this.Statuses[i] = new Long(source.Statuses[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.FlowTypes != null) {
            this.FlowTypes = new Long[source.FlowTypes.length];
            for (int i = 0; i < source.FlowTypes.length; i++) {
                this.FlowTypes[i] = new Long(source.FlowTypes[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.UTaskIds != null) {
            this.UTaskIds = new Long[source.UTaskIds.length];
            for (int i = 0; i < source.UTaskIds.length; i++) {
                this.UTaskIds[i] = new Long(source.UTaskIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Statuses.", this.Statuses);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "FlowTypes.", this.FlowTypes);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "UTaskIds.", this.UTaskIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

