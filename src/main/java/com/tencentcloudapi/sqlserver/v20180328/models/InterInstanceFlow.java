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

public class InterInstanceFlow extends AbstractModel{

    /**
    * 实例ID，例如：mssql-sdf32n1d
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例开通或者关闭互通组的流程ID，FlowId小于0-开通或者关闭失败，反之则成功。
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
     * Get 实例ID，例如：mssql-sdf32n1d 
     * @return InstanceId 实例ID，例如：mssql-sdf32n1d
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，例如：mssql-sdf32n1d
     * @param InstanceId 实例ID，例如：mssql-sdf32n1d
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例开通或者关闭互通组的流程ID，FlowId小于0-开通或者关闭失败，反之则成功。 
     * @return FlowId 实例开通或者关闭互通组的流程ID，FlowId小于0-开通或者关闭失败，反之则成功。
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 实例开通或者关闭互通组的流程ID，FlowId小于0-开通或者关闭失败，反之则成功。
     * @param FlowId 实例开通或者关闭互通组的流程ID，FlowId小于0-开通或者关闭失败，反之则成功。
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    public InterInstanceFlow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InterInstanceFlow(InterInstanceFlow source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}

