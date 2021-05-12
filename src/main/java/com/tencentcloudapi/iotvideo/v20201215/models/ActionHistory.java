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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionHistory extends AbstractModel{

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 动作Id
    */
    @SerializedName("ActionId")
    @Expose
    private String ActionId;

    /**
    * 动作名称
    */
    @SerializedName("ActionName")
    @Expose
    private String ActionName;

    /**
    * 请求时间
    */
    @SerializedName("ReqTime")
    @Expose
    private Long ReqTime;

    /**
    * 响应时间
    */
    @SerializedName("RspTime")
    @Expose
    private Long RspTime;

    /**
    * 输入参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputParams")
    @Expose
    private String InputParams;

    /**
    * 输出参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputParams")
    @Expose
    private String OutputParams;

    /**
    * 调用方式
    */
    @SerializedName("Calling")
    @Expose
    private String Calling;

    /**
    * 调用Id
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 调用状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 动作Id 
     * @return ActionId 动作Id
     */
    public String getActionId() {
        return this.ActionId;
    }

    /**
     * Set 动作Id
     * @param ActionId 动作Id
     */
    public void setActionId(String ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get 动作名称 
     * @return ActionName 动作名称
     */
    public String getActionName() {
        return this.ActionName;
    }

    /**
     * Set 动作名称
     * @param ActionName 动作名称
     */
    public void setActionName(String ActionName) {
        this.ActionName = ActionName;
    }

    /**
     * Get 请求时间 
     * @return ReqTime 请求时间
     */
    public Long getReqTime() {
        return this.ReqTime;
    }

    /**
     * Set 请求时间
     * @param ReqTime 请求时间
     */
    public void setReqTime(Long ReqTime) {
        this.ReqTime = ReqTime;
    }

    /**
     * Get 响应时间 
     * @return RspTime 响应时间
     */
    public Long getRspTime() {
        return this.RspTime;
    }

    /**
     * Set 响应时间
     * @param RspTime 响应时间
     */
    public void setRspTime(Long RspTime) {
        this.RspTime = RspTime;
    }

    /**
     * Get 输入参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputParams 输入参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputParams() {
        return this.InputParams;
    }

    /**
     * Set 输入参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputParams 输入参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputParams(String InputParams) {
        this.InputParams = InputParams;
    }

    /**
     * Get 输出参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputParams 输出参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputParams() {
        return this.OutputParams;
    }

    /**
     * Set 输出参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputParams 输出参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputParams(String OutputParams) {
        this.OutputParams = OutputParams;
    }

    /**
     * Get 调用方式 
     * @return Calling 调用方式
     */
    public String getCalling() {
        return this.Calling;
    }

    /**
     * Set 调用方式
     * @param Calling 调用方式
     */
    public void setCalling(String Calling) {
        this.Calling = Calling;
    }

    /**
     * Get 调用Id 
     * @return ClientToken 调用Id
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 调用Id
     * @param ClientToken 调用Id
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 调用状态 
     * @return Status 调用状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 调用状态
     * @param Status 调用状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ActionHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionHistory(ActionHistory source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ActionId != null) {
            this.ActionId = new String(source.ActionId);
        }
        if (source.ActionName != null) {
            this.ActionName = new String(source.ActionName);
        }
        if (source.ReqTime != null) {
            this.ReqTime = new Long(source.ReqTime);
        }
        if (source.RspTime != null) {
            this.RspTime = new Long(source.RspTime);
        }
        if (source.InputParams != null) {
            this.InputParams = new String(source.InputParams);
        }
        if (source.OutputParams != null) {
            this.OutputParams = new String(source.OutputParams);
        }
        if (source.Calling != null) {
            this.Calling = new String(source.Calling);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "ActionName", this.ActionName);
        this.setParamSimple(map, prefix + "ReqTime", this.ReqTime);
        this.setParamSimple(map, prefix + "RspTime", this.RspTime);
        this.setParamSimple(map, prefix + "InputParams", this.InputParams);
        this.setParamSimple(map, prefix + "OutputParams", this.OutputParams);
        this.setParamSimple(map, prefix + "Calling", this.Calling);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

