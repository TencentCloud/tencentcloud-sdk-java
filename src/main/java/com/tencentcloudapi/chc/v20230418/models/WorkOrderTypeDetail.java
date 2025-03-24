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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkOrderTypeDetail extends AbstractModel {

    /**
    * 工单类型所属的大类
    */
    @SerializedName("WorkOrderFamily")
    @Expose
    private String WorkOrderFamily;

    /**
    * 工单类型名称
    */
    @SerializedName("WorkOrderName")
    @Expose
    private String WorkOrderName;

    /**
    * 工单类型的唯一英文标识
    */
    @SerializedName("WorkOrderType")
    @Expose
    private String WorkOrderType;

    /**
    * 工单类型简述
    */
    @SerializedName("WorkOrderDescription")
    @Expose
    private String WorkOrderDescription;

    /**
    * 是否被收藏
    */
    @SerializedName("CollectFlag")
    @Expose
    private Boolean CollectFlag;

    /**
    * 服务时效
    */
    @SerializedName("SlaMessage")
    @Expose
    private String SlaMessage;

    /**
     * Get 工单类型所属的大类 
     * @return WorkOrderFamily 工单类型所属的大类
     */
    public String getWorkOrderFamily() {
        return this.WorkOrderFamily;
    }

    /**
     * Set 工单类型所属的大类
     * @param WorkOrderFamily 工单类型所属的大类
     */
    public void setWorkOrderFamily(String WorkOrderFamily) {
        this.WorkOrderFamily = WorkOrderFamily;
    }

    /**
     * Get 工单类型名称 
     * @return WorkOrderName 工单类型名称
     */
    public String getWorkOrderName() {
        return this.WorkOrderName;
    }

    /**
     * Set 工单类型名称
     * @param WorkOrderName 工单类型名称
     */
    public void setWorkOrderName(String WorkOrderName) {
        this.WorkOrderName = WorkOrderName;
    }

    /**
     * Get 工单类型的唯一英文标识 
     * @return WorkOrderType 工单类型的唯一英文标识
     */
    public String getWorkOrderType() {
        return this.WorkOrderType;
    }

    /**
     * Set 工单类型的唯一英文标识
     * @param WorkOrderType 工单类型的唯一英文标识
     */
    public void setWorkOrderType(String WorkOrderType) {
        this.WorkOrderType = WorkOrderType;
    }

    /**
     * Get 工单类型简述 
     * @return WorkOrderDescription 工单类型简述
     */
    public String getWorkOrderDescription() {
        return this.WorkOrderDescription;
    }

    /**
     * Set 工单类型简述
     * @param WorkOrderDescription 工单类型简述
     */
    public void setWorkOrderDescription(String WorkOrderDescription) {
        this.WorkOrderDescription = WorkOrderDescription;
    }

    /**
     * Get 是否被收藏 
     * @return CollectFlag 是否被收藏
     */
    public Boolean getCollectFlag() {
        return this.CollectFlag;
    }

    /**
     * Set 是否被收藏
     * @param CollectFlag 是否被收藏
     */
    public void setCollectFlag(Boolean CollectFlag) {
        this.CollectFlag = CollectFlag;
    }

    /**
     * Get 服务时效 
     * @return SlaMessage 服务时效
     */
    public String getSlaMessage() {
        return this.SlaMessage;
    }

    /**
     * Set 服务时效
     * @param SlaMessage 服务时效
     */
    public void setSlaMessage(String SlaMessage) {
        this.SlaMessage = SlaMessage;
    }

    public WorkOrderTypeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkOrderTypeDetail(WorkOrderTypeDetail source) {
        if (source.WorkOrderFamily != null) {
            this.WorkOrderFamily = new String(source.WorkOrderFamily);
        }
        if (source.WorkOrderName != null) {
            this.WorkOrderName = new String(source.WorkOrderName);
        }
        if (source.WorkOrderType != null) {
            this.WorkOrderType = new String(source.WorkOrderType);
        }
        if (source.WorkOrderDescription != null) {
            this.WorkOrderDescription = new String(source.WorkOrderDescription);
        }
        if (source.CollectFlag != null) {
            this.CollectFlag = new Boolean(source.CollectFlag);
        }
        if (source.SlaMessage != null) {
            this.SlaMessage = new String(source.SlaMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkOrderFamily", this.WorkOrderFamily);
        this.setParamSimple(map, prefix + "WorkOrderName", this.WorkOrderName);
        this.setParamSimple(map, prefix + "WorkOrderType", this.WorkOrderType);
        this.setParamSimple(map, prefix + "WorkOrderDescription", this.WorkOrderDescription);
        this.setParamSimple(map, prefix + "CollectFlag", this.CollectFlag);
        this.setParamSimple(map, prefix + "SlaMessage", this.SlaMessage);

    }
}

