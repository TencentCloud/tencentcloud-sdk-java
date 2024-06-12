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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterFlowStatusDetailRequest extends AbstractModel {

    /**
    * EMR实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 流程相关参数
    */
    @SerializedName("FlowParam")
    @Expose
    private FlowParam FlowParam;

    /**
    * 是否返回任务额外信息
默认: false
    */
    @SerializedName("NeedExtraDetail")
    @Expose
    private Boolean NeedExtraDetail;

    /**
     * Get EMR实例ID 
     * @return InstanceId EMR实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EMR实例ID
     * @param InstanceId EMR实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 流程相关参数 
     * @return FlowParam 流程相关参数
     */
    public FlowParam getFlowParam() {
        return this.FlowParam;
    }

    /**
     * Set 流程相关参数
     * @param FlowParam 流程相关参数
     */
    public void setFlowParam(FlowParam FlowParam) {
        this.FlowParam = FlowParam;
    }

    /**
     * Get 是否返回任务额外信息
默认: false 
     * @return NeedExtraDetail 是否返回任务额外信息
默认: false
     */
    public Boolean getNeedExtraDetail() {
        return this.NeedExtraDetail;
    }

    /**
     * Set 是否返回任务额外信息
默认: false
     * @param NeedExtraDetail 是否返回任务额外信息
默认: false
     */
    public void setNeedExtraDetail(Boolean NeedExtraDetail) {
        this.NeedExtraDetail = NeedExtraDetail;
    }

    public DescribeClusterFlowStatusDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterFlowStatusDetailRequest(DescribeClusterFlowStatusDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FlowParam != null) {
            this.FlowParam = new FlowParam(source.FlowParam);
        }
        if (source.NeedExtraDetail != null) {
            this.NeedExtraDetail = new Boolean(source.NeedExtraDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "FlowParam.", this.FlowParam);
        this.setParamSimple(map, prefix + "NeedExtraDetail", this.NeedExtraDetail);

    }
}

