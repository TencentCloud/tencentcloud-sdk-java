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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlowResponse extends AbstractModel{

    /**
    * 流程创建者信息
    */
    @SerializedName("Creator")
    @Expose
    private Caller Creator;

    /**
    * 流程编号
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 流程名称
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 流程描述
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 流程的类型: ”劳务合同“,”租赁合同“,”销售合同“,”其他“
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 流程状态：
0-创建；
1-签署中；
2-拒签；
3-撤回；
4-签完存档完成；
5-已过期；
6-已销毁
7-签署完成未归档
    */
    @SerializedName("FlowStatus")
    @Expose
    private Long FlowStatus;

    /**
    * 流程创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 流程完成时间
    */
    @SerializedName("UpdatedOn")
    @Expose
    private Long UpdatedOn;

    /**
    * 流程截止日期
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 回调地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 流程中止原因
    */
    @SerializedName("FlowMessage")
    @Expose
    private String FlowMessage;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 流程创建者信息 
     * @return Creator 流程创建者信息
     */
    public Caller getCreator() {
        return this.Creator;
    }

    /**
     * Set 流程创建者信息
     * @param Creator 流程创建者信息
     */
    public void setCreator(Caller Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 流程编号 
     * @return FlowId 流程编号
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程编号
     * @param FlowId 流程编号
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 流程名称 
     * @return FlowName 流程名称
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 流程名称
     * @param FlowName 流程名称
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 流程描述 
     * @return FlowDescription 流程描述
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 流程描述
     * @param FlowDescription 流程描述
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 流程的类型: ”劳务合同“,”租赁合同“,”销售合同“,”其他“ 
     * @return FlowType 流程的类型: ”劳务合同“,”租赁合同“,”销售合同“,”其他“
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 流程的类型: ”劳务合同“,”租赁合同“,”销售合同“,”其他“
     * @param FlowType 流程的类型: ”劳务合同“,”租赁合同“,”销售合同“,”其他“
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 流程状态：
0-创建；
1-签署中；
2-拒签；
3-撤回；
4-签完存档完成；
5-已过期；
6-已销毁
7-签署完成未归档 
     * @return FlowStatus 流程状态：
0-创建；
1-签署中；
2-拒签；
3-撤回；
4-签完存档完成；
5-已过期；
6-已销毁
7-签署完成未归档
     */
    public Long getFlowStatus() {
        return this.FlowStatus;
    }

    /**
     * Set 流程状态：
0-创建；
1-签署中；
2-拒签；
3-撤回；
4-签完存档完成；
5-已过期；
6-已销毁
7-签署完成未归档
     * @param FlowStatus 流程状态：
0-创建；
1-签署中；
2-拒签；
3-撤回；
4-签完存档完成；
5-已过期；
6-已销毁
7-签署完成未归档
     */
    public void setFlowStatus(Long FlowStatus) {
        this.FlowStatus = FlowStatus;
    }

    /**
     * Get 流程创建时间 
     * @return CreatedOn 流程创建时间
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 流程创建时间
     * @param CreatedOn 流程创建时间
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 流程完成时间 
     * @return UpdatedOn 流程完成时间
     */
    public Long getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 流程完成时间
     * @param UpdatedOn 流程完成时间
     */
    public void setUpdatedOn(Long UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get 流程截止日期 
     * @return Deadline 流程截止日期
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 流程截止日期
     * @param Deadline 流程截止日期
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 回调地址 
     * @return CallbackUrl 回调地址
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调地址
     * @param CallbackUrl 回调地址
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 流程中止原因 
     * @return FlowMessage 流程中止原因
     */
    public String getFlowMessage() {
        return this.FlowMessage;
    }

    /**
     * Set 流程中止原因
     * @param FlowMessage 流程中止原因
     */
    public void setFlowMessage(String FlowMessage) {
        this.FlowMessage = FlowMessage;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeFlowResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowResponse(DescribeFlowResponse source) {
        if (source.Creator != null) {
            this.Creator = new Caller(source.Creator);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.FlowStatus != null) {
            this.FlowStatus = new Long(source.FlowStatus);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new Long(source.UpdatedOn);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.FlowMessage != null) {
            this.FlowMessage = new String(source.FlowMessage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Creator.", this.Creator);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "FlowStatus", this.FlowStatus);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "FlowMessage", this.FlowMessage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

