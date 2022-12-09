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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrepareFlowRequest extends AbstractModel{

    /**
    * 调用方用户信息，userId 必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 资源Id，通过多文件上传（UploadFiles）接口获得
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 合同名称
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 是否顺序签署(true:无序签,false:顺序签)
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 用户自定义合同类型
    */
    @SerializedName("UserFlowTypeId")
    @Expose
    private String UserFlowTypeId;

    /**
    * 签署流程参与者信息，最大限制50方
    */
    @SerializedName("Approvers")
    @Expose
    private FlowCreateApprover [] Approvers;

    /**
    * 打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE")
    */
    @SerializedName("IntelligentStatus")
    @Expose
    private String IntelligentStatus;

    /**
     * Get 调用方用户信息，userId 必填 
     * @return Operator 调用方用户信息，userId 必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填
     * @param Operator 调用方用户信息，userId 必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 资源Id，通过多文件上传（UploadFiles）接口获得 
     * @return ResourceId 资源Id，通过多文件上传（UploadFiles）接口获得
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源Id，通过多文件上传（UploadFiles）接口获得
     * @param ResourceId 资源Id，通过多文件上传（UploadFiles）接口获得
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 合同名称 
     * @return FlowName 合同名称
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同名称
     * @param FlowName 合同名称
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 是否顺序签署(true:无序签,false:顺序签) 
     * @return Unordered 是否顺序签署(true:无序签,false:顺序签)
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set 是否顺序签署(true:无序签,false:顺序签)
     * @param Unordered 是否顺序签署(true:无序签,false:顺序签)
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后 
     * @return Deadline 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
     * @param Deadline 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 用户自定义合同类型 
     * @return UserFlowTypeId 用户自定义合同类型
     */
    public String getUserFlowTypeId() {
        return this.UserFlowTypeId;
    }

    /**
     * Set 用户自定义合同类型
     * @param UserFlowTypeId 用户自定义合同类型
     */
    public void setUserFlowTypeId(String UserFlowTypeId) {
        this.UserFlowTypeId = UserFlowTypeId;
    }

    /**
     * Get 签署流程参与者信息，最大限制50方 
     * @return Approvers 签署流程参与者信息，最大限制50方
     */
    public FlowCreateApprover [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 签署流程参与者信息，最大限制50方
     * @param Approvers 签署流程参与者信息，最大限制50方
     */
    public void setApprovers(FlowCreateApprover [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get 打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE") 
     * @return IntelligentStatus 打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE")
     */
    public String getIntelligentStatus() {
        return this.IntelligentStatus;
    }

    /**
     * Set 打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE")
     * @param IntelligentStatus 打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE")
     */
    public void setIntelligentStatus(String IntelligentStatus) {
        this.IntelligentStatus = IntelligentStatus;
    }

    public CreatePrepareFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrepareFlowRequest(CreatePrepareFlowRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.UserFlowTypeId != null) {
            this.UserFlowTypeId = new String(source.UserFlowTypeId);
        }
        if (source.Approvers != null) {
            this.Approvers = new FlowCreateApprover[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new FlowCreateApprover(source.Approvers[i]);
            }
        }
        if (source.IntelligentStatus != null) {
            this.IntelligentStatus = new String(source.IntelligentStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "UserFlowTypeId", this.UserFlowTypeId);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamSimple(map, prefix + "IntelligentStatus", this.IntelligentStatus);

    }
}

