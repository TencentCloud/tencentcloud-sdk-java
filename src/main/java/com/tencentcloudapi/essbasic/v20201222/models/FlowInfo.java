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

public class FlowInfo extends AbstractModel{

    /**
    * 合同名字
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 签署截止时间戳，超过有效签署时间则该签署流程失败
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 合同描述
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 合同类型：
1. “劳务”
2. “销售”
3. “租赁”
4. “其他”
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 回调地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 用户自定义数据
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
     * Get 合同名字 
     * @return FlowName 合同名字
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同名字
     * @param FlowName 合同名字
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 签署截止时间戳，超过有效签署时间则该签署流程失败 
     * @return Deadline 签署截止时间戳，超过有效签署时间则该签署流程失败
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 签署截止时间戳，超过有效签署时间则该签署流程失败
     * @param Deadline 签署截止时间戳，超过有效签署时间则该签署流程失败
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 合同描述 
     * @return FlowDescription 合同描述
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 合同描述
     * @param FlowDescription 合同描述
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 合同类型：
1. “劳务”
2. “销售”
3. “租赁”
4. “其他” 
     * @return FlowType 合同类型：
1. “劳务”
2. “销售”
3. “租赁”
4. “其他”
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 合同类型：
1. “劳务”
2. “销售”
3. “租赁”
4. “其他”
     * @param FlowType 合同类型：
1. “劳务”
2. “销售”
3. “租赁”
4. “其他”
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
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
     * Get 用户自定义数据 
     * @return UserData 用户自定义数据
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 用户自定义数据
     * @param UserData 用户自定义数据
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    public FlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowInfo(FlowInfo source) {
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "UserData", this.UserData);

    }
}

