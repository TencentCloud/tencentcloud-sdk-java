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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SMSEvent extends AbstractModel {

    /**
    * <p>用户基础信息</p>
    */
    @SerializedName("UserInfo")
    @Expose
    private User UserInfo;

    /**
    * <p>本次短信发送标识 ID</p>
    */
    @SerializedName("SMSId")
    @Expose
    private String SMSId;

    /**
    * <p>用户实际完成验证码时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
    */
    @SerializedName("ReceivedTime")
    @Expose
    private String ReceivedTime;

    /**
    * <p>记录用户收到短信的动作</p><ul><li>no_action：用户无动作</li><li>safe：用户确认本人操作</li><li>compromised：用户反馈为第三方操作</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>短信回执结果</p>
    */
    @SerializedName("SMSResult")
    @Expose
    private Result SMSResult;

    /**
    * <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>用户基础信息</p> 
     * @return UserInfo <p>用户基础信息</p>
     */
    public User getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set <p>用户基础信息</p>
     * @param UserInfo <p>用户基础信息</p>
     */
    public void setUserInfo(User UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get <p>本次短信发送标识 ID</p> 
     * @return SMSId <p>本次短信发送标识 ID</p>
     */
    public String getSMSId() {
        return this.SMSId;
    }

    /**
     * Set <p>本次短信发送标识 ID</p>
     * @param SMSId <p>本次短信发送标识 ID</p>
     */
    public void setSMSId(String SMSId) {
        this.SMSId = SMSId;
    }

    /**
     * Get <p>用户实际完成验证码时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p> 
     * @return ReceivedTime <p>用户实际完成验证码时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     */
    public String getReceivedTime() {
        return this.ReceivedTime;
    }

    /**
     * Set <p>用户实际完成验证码时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     * @param ReceivedTime <p>用户实际完成验证码时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     */
    public void setReceivedTime(String ReceivedTime) {
        this.ReceivedTime = ReceivedTime;
    }

    /**
     * Get <p>记录用户收到短信的动作</p><ul><li>no_action：用户无动作</li><li>safe：用户确认本人操作</li><li>compromised：用户反馈为第三方操作</li></ul> 
     * @return Action <p>记录用户收到短信的动作</p><ul><li>no_action：用户无动作</li><li>safe：用户确认本人操作</li><li>compromised：用户反馈为第三方操作</li></ul>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>记录用户收到短信的动作</p><ul><li>no_action：用户无动作</li><li>safe：用户确认本人操作</li><li>compromised：用户反馈为第三方操作</li></ul>
     * @param Action <p>记录用户收到短信的动作</p><ul><li>no_action：用户无动作</li><li>safe：用户确认本人操作</li><li>compromised：用户反馈为第三方操作</li></ul>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>短信回执结果</p> 
     * @return SMSResult <p>短信回执结果</p>
     */
    public Result getSMSResult() {
        return this.SMSResult;
    }

    /**
     * Set <p>短信回执结果</p>
     * @param SMSResult <p>短信回执结果</p>
     */
    public void setSMSResult(Result SMSResult) {
        this.SMSResult = SMSResult;
    }

    /**
     * Get <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p> 
     * @return Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     * @param Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public SMSEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SMSEvent(SMSEvent source) {
        if (source.UserInfo != null) {
            this.UserInfo = new User(source.UserInfo);
        }
        if (source.SMSId != null) {
            this.SMSId = new String(source.SMSId);
        }
        if (source.ReceivedTime != null) {
            this.ReceivedTime = new String(source.ReceivedTime);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.SMSResult != null) {
            this.SMSResult = new Result(source.SMSResult);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "SMSId", this.SMSId);
        this.setParamSimple(map, prefix + "ReceivedTime", this.ReceivedTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamObj(map, prefix + "SMSResult.", this.SMSResult);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

