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
package com.tencentcloudapi.controlcenter.v20230110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineStepTaskInfo extends AbstractModel {

    /**
    * 任务唯一Id，只能包含英文字母、数字，是16个字符的随机字符串。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 基线功能项唯一标识，只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * 被应用基线项的成员账号uin
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * 基线项应用的状态,Running表示基线项应用中,Success表示基线项应用成功,Failed表示基线项应用失败,Pending表示基线项待应用,Skipped表示基线项被跳过
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误码
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * 错误信息
    */
    @SerializedName("ErrMessage")
    @Expose
    private String ErrMessage;

    /**
    * 基线项部署输出
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * 创建时间，按照ISO8601标准表示，格式为yyyy-MM-dd hh:mm:ss。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间，按照ISO8601标准表示，格式为yyyy-MM-dd hh:mm:ss。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 任务唯一Id，只能包含英文字母、数字，是16个字符的随机字符串。 
     * @return TaskId 任务唯一Id，只能包含英文字母、数字，是16个字符的随机字符串。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务唯一Id，只能包含英文字母、数字，是16个字符的随机字符串。
     * @param TaskId 任务唯一Id，只能包含英文字母、数字，是16个字符的随机字符串。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 基线功能项唯一标识，只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。 
     * @return Identifier 基线功能项唯一标识，只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set 基线功能项唯一标识，只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。
     * @param Identifier 基线功能项唯一标识，只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get 被应用基线项的成员账号uin 
     * @return MemberUin 被应用基线项的成员账号uin
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 被应用基线项的成员账号uin
     * @param MemberUin 被应用基线项的成员账号uin
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get 基线项应用的状态,Running表示基线项应用中,Success表示基线项应用成功,Failed表示基线项应用失败,Pending表示基线项待应用,Skipped表示基线项被跳过 
     * @return Status 基线项应用的状态,Running表示基线项应用中,Success表示基线项应用成功,Failed表示基线项应用失败,Pending表示基线项待应用,Skipped表示基线项被跳过
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 基线项应用的状态,Running表示基线项应用中,Success表示基线项应用成功,Failed表示基线项应用失败,Pending表示基线项待应用,Skipped表示基线项被跳过
     * @param Status 基线项应用的状态,Running表示基线项应用中,Success表示基线项应用成功,Failed表示基线项应用失败,Pending表示基线项待应用,Skipped表示基线项被跳过
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误码 
     * @return ErrCode 错误码
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码
     * @param ErrCode 错误码
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 错误信息 
     * @return ErrMessage 错误信息
     */
    public String getErrMessage() {
        return this.ErrMessage;
    }

    /**
     * Set 错误信息
     * @param ErrMessage 错误信息
     */
    public void setErrMessage(String ErrMessage) {
        this.ErrMessage = ErrMessage;
    }

    /**
     * Get 基线项部署输出 
     * @return Output 基线项部署输出
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 基线项部署输出
     * @param Output 基线项部署输出
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get 创建时间，按照ISO8601标准表示，格式为yyyy-MM-dd hh:mm:ss。 
     * @return CreateTime 创建时间，按照ISO8601标准表示，格式为yyyy-MM-dd hh:mm:ss。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，按照ISO8601标准表示，格式为yyyy-MM-dd hh:mm:ss。
     * @param CreateTime 创建时间，按照ISO8601标准表示，格式为yyyy-MM-dd hh:mm:ss。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间，按照ISO8601标准表示，格式为yyyy-MM-dd hh:mm:ss。 
     * @return UpdateTime 更新时间，按照ISO8601标准表示，格式为yyyy-MM-dd hh:mm:ss。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，按照ISO8601标准表示，格式为yyyy-MM-dd hh:mm:ss。
     * @param UpdateTime 更新时间，按照ISO8601标准表示，格式为yyyy-MM-dd hh:mm:ss。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public BaselineStepTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineStepTaskInfo(BaselineStepTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrMessage != null) {
            this.ErrMessage = new String(source.ErrMessage);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMessage", this.ErrMessage);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

