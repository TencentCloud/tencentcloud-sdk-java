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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmNotice extends AbstractModel {

    /**
    * <p>告警通知渠道组名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>告警通知渠道组绑定的标签信息。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>告警模板的类型。可选值：<br><br><li> Trigger - 告警触发</li><br><br><li> Recovery - 告警恢复</li><br><br><li> All - 告警触发和告警恢复</li></p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>告警通知模板接收者信息。</p>
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * <p>告警通知模板回调信息。</p>
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * <p>告警通知模板ID。</p>
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

    /**
    * <p>通知规则。</p>
    */
    @SerializedName("NoticeRules")
    @Expose
    private NoticeRule [] NoticeRules;

    /**
    * <p>免登录操作告警开关。<br>参数值： 1：关闭 2：开启（默认开启）</p>
    */
    @SerializedName("AlarmShieldStatus")
    @Expose
    private Long AlarmShieldStatus;

    /**
    * <p>告警详情需要安全认证登录开关，未传时默认&quot;关闭&quot;</p><p>枚举值：</p><ul><li>1： 关闭（默认值）</li><li>2： 开启</li></ul>
    */
    @SerializedName("SecureDetailStatus")
    @Expose
    private Long SecureDetailStatus;

    /**
    * <p>调用链接域名。http:// 或者 https:// 开头，不能/结尾</p>
    */
    @SerializedName("JumpDomain")
    @Expose
    private String JumpDomain;

    /**
    * <p>投递相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmNoticeDeliverConfig")
    @Expose
    private AlarmNoticeDeliverConfig AlarmNoticeDeliverConfig;

    /**
    * <p>创建时间。格式： YYYY-MM-DD HH:MM:SS</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近更新时间。格式： YYYY-MM-DD HH:MM:SS</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>投递日志开关。</p><p>参数值：</p><p>1：关闭</p><p>2：开启</p>
    */
    @SerializedName("DeliverStatus")
    @Expose
    private Long DeliverStatus;

    /**
    * <p>投递日志标识。</p><p>参数值：</p><p>1：未启用</p><p>2：已启用</p><p>3：投递异常</p>
    */
    @SerializedName("DeliverFlag")
    @Expose
    private Long DeliverFlag;

    /**
    * <p>通知渠道组配置的告警屏蔽统计状态数量信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmShieldCount")
    @Expose
    private AlarmShieldCount AlarmShieldCount;

    /**
    * <p>统一设定自定义回调参数。</p><ul><li>true: 使用通知内容模板中的自定义回调参数覆盖告警策略中单独配置的请求头及请求内容。</li><li>false:优先使用告警策略中单独配置的请求头及请求内容。</li></ul>
    */
    @SerializedName("CallbackPrioritize")
    @Expose
    private Boolean CallbackPrioritize;

    /**
     * Get <p>告警通知渠道组名称。</p> 
     * @return Name <p>告警通知渠道组名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>告警通知渠道组名称。</p>
     * @param Name <p>告警通知渠道组名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>告警通知渠道组绑定的标签信息。</p> 
     * @return Tags <p>告警通知渠道组绑定的标签信息。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>告警通知渠道组绑定的标签信息。</p>
     * @param Tags <p>告警通知渠道组绑定的标签信息。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>告警模板的类型。可选值：<br><br><li> Trigger - 告警触发</li><br><br><li> Recovery - 告警恢复</li><br><br><li> All - 告警触发和告警恢复</li></p> 
     * @return Type <p>告警模板的类型。可选值：<br><br><li> Trigger - 告警触发</li><br><br><li> Recovery - 告警恢复</li><br><br><li> All - 告警触发和告警恢复</li></p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>告警模板的类型。可选值：<br><br><li> Trigger - 告警触发</li><br><br><li> Recovery - 告警恢复</li><br><br><li> All - 告警触发和告警恢复</li></p>
     * @param Type <p>告警模板的类型。可选值：<br><br><li> Trigger - 告警触发</li><br><br><li> Recovery - 告警恢复</li><br><br><li> All - 告警触发和告警恢复</li></p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>告警通知模板接收者信息。</p> 
     * @return NoticeReceivers <p>告警通知模板接收者信息。</p>
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set <p>告警通知模板接收者信息。</p>
     * @param NoticeReceivers <p>告警通知模板接收者信息。</p>
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get <p>告警通知模板回调信息。</p> 
     * @return WebCallbacks <p>告警通知模板回调信息。</p>
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set <p>告警通知模板回调信息。</p>
     * @param WebCallbacks <p>告警通知模板回调信息。</p>
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get <p>告警通知模板ID。</p> 
     * @return AlarmNoticeId <p>告警通知模板ID。</p>
     */
    public String getAlarmNoticeId() {
        return this.AlarmNoticeId;
    }

    /**
     * Set <p>告警通知模板ID。</p>
     * @param AlarmNoticeId <p>告警通知模板ID。</p>
     */
    public void setAlarmNoticeId(String AlarmNoticeId) {
        this.AlarmNoticeId = AlarmNoticeId;
    }

    /**
     * Get <p>通知规则。</p> 
     * @return NoticeRules <p>通知规则。</p>
     */
    public NoticeRule [] getNoticeRules() {
        return this.NoticeRules;
    }

    /**
     * Set <p>通知规则。</p>
     * @param NoticeRules <p>通知规则。</p>
     */
    public void setNoticeRules(NoticeRule [] NoticeRules) {
        this.NoticeRules = NoticeRules;
    }

    /**
     * Get <p>免登录操作告警开关。<br>参数值： 1：关闭 2：开启（默认开启）</p> 
     * @return AlarmShieldStatus <p>免登录操作告警开关。<br>参数值： 1：关闭 2：开启（默认开启）</p>
     */
    public Long getAlarmShieldStatus() {
        return this.AlarmShieldStatus;
    }

    /**
     * Set <p>免登录操作告警开关。<br>参数值： 1：关闭 2：开启（默认开启）</p>
     * @param AlarmShieldStatus <p>免登录操作告警开关。<br>参数值： 1：关闭 2：开启（默认开启）</p>
     */
    public void setAlarmShieldStatus(Long AlarmShieldStatus) {
        this.AlarmShieldStatus = AlarmShieldStatus;
    }

    /**
     * Get <p>告警详情需要安全认证登录开关，未传时默认&quot;关闭&quot;</p><p>枚举值：</p><ul><li>1： 关闭（默认值）</li><li>2： 开启</li></ul> 
     * @return SecureDetailStatus <p>告警详情需要安全认证登录开关，未传时默认&quot;关闭&quot;</p><p>枚举值：</p><ul><li>1： 关闭（默认值）</li><li>2： 开启</li></ul>
     */
    public Long getSecureDetailStatus() {
        return this.SecureDetailStatus;
    }

    /**
     * Set <p>告警详情需要安全认证登录开关，未传时默认&quot;关闭&quot;</p><p>枚举值：</p><ul><li>1： 关闭（默认值）</li><li>2： 开启</li></ul>
     * @param SecureDetailStatus <p>告警详情需要安全认证登录开关，未传时默认&quot;关闭&quot;</p><p>枚举值：</p><ul><li>1： 关闭（默认值）</li><li>2： 开启</li></ul>
     */
    public void setSecureDetailStatus(Long SecureDetailStatus) {
        this.SecureDetailStatus = SecureDetailStatus;
    }

    /**
     * Get <p>调用链接域名。http:// 或者 https:// 开头，不能/结尾</p> 
     * @return JumpDomain <p>调用链接域名。http:// 或者 https:// 开头，不能/结尾</p>
     */
    public String getJumpDomain() {
        return this.JumpDomain;
    }

    /**
     * Set <p>调用链接域名。http:// 或者 https:// 开头，不能/结尾</p>
     * @param JumpDomain <p>调用链接域名。http:// 或者 https:// 开头，不能/结尾</p>
     */
    public void setJumpDomain(String JumpDomain) {
        this.JumpDomain = JumpDomain;
    }

    /**
     * Get <p>投递相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmNoticeDeliverConfig <p>投递相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmNoticeDeliverConfig getAlarmNoticeDeliverConfig() {
        return this.AlarmNoticeDeliverConfig;
    }

    /**
     * Set <p>投递相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmNoticeDeliverConfig <p>投递相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmNoticeDeliverConfig(AlarmNoticeDeliverConfig AlarmNoticeDeliverConfig) {
        this.AlarmNoticeDeliverConfig = AlarmNoticeDeliverConfig;
    }

    /**
     * Get <p>创建时间。格式： YYYY-MM-DD HH:MM:SS</p> 
     * @return CreateTime <p>创建时间。格式： YYYY-MM-DD HH:MM:SS</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。格式： YYYY-MM-DD HH:MM:SS</p>
     * @param CreateTime <p>创建时间。格式： YYYY-MM-DD HH:MM:SS</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近更新时间。格式： YYYY-MM-DD HH:MM:SS</p> 
     * @return UpdateTime <p>最近更新时间。格式： YYYY-MM-DD HH:MM:SS</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最近更新时间。格式： YYYY-MM-DD HH:MM:SS</p>
     * @param UpdateTime <p>最近更新时间。格式： YYYY-MM-DD HH:MM:SS</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>投递日志开关。</p><p>参数值：</p><p>1：关闭</p><p>2：开启</p> 
     * @return DeliverStatus <p>投递日志开关。</p><p>参数值：</p><p>1：关闭</p><p>2：开启</p>
     */
    public Long getDeliverStatus() {
        return this.DeliverStatus;
    }

    /**
     * Set <p>投递日志开关。</p><p>参数值：</p><p>1：关闭</p><p>2：开启</p>
     * @param DeliverStatus <p>投递日志开关。</p><p>参数值：</p><p>1：关闭</p><p>2：开启</p>
     */
    public void setDeliverStatus(Long DeliverStatus) {
        this.DeliverStatus = DeliverStatus;
    }

    /**
     * Get <p>投递日志标识。</p><p>参数值：</p><p>1：未启用</p><p>2：已启用</p><p>3：投递异常</p> 
     * @return DeliverFlag <p>投递日志标识。</p><p>参数值：</p><p>1：未启用</p><p>2：已启用</p><p>3：投递异常</p>
     */
    public Long getDeliverFlag() {
        return this.DeliverFlag;
    }

    /**
     * Set <p>投递日志标识。</p><p>参数值：</p><p>1：未启用</p><p>2：已启用</p><p>3：投递异常</p>
     * @param DeliverFlag <p>投递日志标识。</p><p>参数值：</p><p>1：未启用</p><p>2：已启用</p><p>3：投递异常</p>
     */
    public void setDeliverFlag(Long DeliverFlag) {
        this.DeliverFlag = DeliverFlag;
    }

    /**
     * Get <p>通知渠道组配置的告警屏蔽统计状态数量信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmShieldCount <p>通知渠道组配置的告警屏蔽统计状态数量信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmShieldCount getAlarmShieldCount() {
        return this.AlarmShieldCount;
    }

    /**
     * Set <p>通知渠道组配置的告警屏蔽统计状态数量信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmShieldCount <p>通知渠道组配置的告警屏蔽统计状态数量信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmShieldCount(AlarmShieldCount AlarmShieldCount) {
        this.AlarmShieldCount = AlarmShieldCount;
    }

    /**
     * Get <p>统一设定自定义回调参数。</p><ul><li>true: 使用通知内容模板中的自定义回调参数覆盖告警策略中单独配置的请求头及请求内容。</li><li>false:优先使用告警策略中单独配置的请求头及请求内容。</li></ul> 
     * @return CallbackPrioritize <p>统一设定自定义回调参数。</p><ul><li>true: 使用通知内容模板中的自定义回调参数覆盖告警策略中单独配置的请求头及请求内容。</li><li>false:优先使用告警策略中单独配置的请求头及请求内容。</li></ul>
     */
    public Boolean getCallbackPrioritize() {
        return this.CallbackPrioritize;
    }

    /**
     * Set <p>统一设定自定义回调参数。</p><ul><li>true: 使用通知内容模板中的自定义回调参数覆盖告警策略中单独配置的请求头及请求内容。</li><li>false:优先使用告警策略中单独配置的请求头及请求内容。</li></ul>
     * @param CallbackPrioritize <p>统一设定自定义回调参数。</p><ul><li>true: 使用通知内容模板中的自定义回调参数覆盖告警策略中单独配置的请求头及请求内容。</li><li>false:优先使用告警策略中单独配置的请求头及请求内容。</li></ul>
     */
    public void setCallbackPrioritize(Boolean CallbackPrioritize) {
        this.CallbackPrioritize = CallbackPrioritize;
    }

    public AlarmNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmNotice(AlarmNotice source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NoticeReceivers != null) {
            this.NoticeReceivers = new NoticeReceiver[source.NoticeReceivers.length];
            for (int i = 0; i < source.NoticeReceivers.length; i++) {
                this.NoticeReceivers[i] = new NoticeReceiver(source.NoticeReceivers[i]);
            }
        }
        if (source.WebCallbacks != null) {
            this.WebCallbacks = new WebCallback[source.WebCallbacks.length];
            for (int i = 0; i < source.WebCallbacks.length; i++) {
                this.WebCallbacks[i] = new WebCallback(source.WebCallbacks[i]);
            }
        }
        if (source.AlarmNoticeId != null) {
            this.AlarmNoticeId = new String(source.AlarmNoticeId);
        }
        if (source.NoticeRules != null) {
            this.NoticeRules = new NoticeRule[source.NoticeRules.length];
            for (int i = 0; i < source.NoticeRules.length; i++) {
                this.NoticeRules[i] = new NoticeRule(source.NoticeRules[i]);
            }
        }
        if (source.AlarmShieldStatus != null) {
            this.AlarmShieldStatus = new Long(source.AlarmShieldStatus);
        }
        if (source.SecureDetailStatus != null) {
            this.SecureDetailStatus = new Long(source.SecureDetailStatus);
        }
        if (source.JumpDomain != null) {
            this.JumpDomain = new String(source.JumpDomain);
        }
        if (source.AlarmNoticeDeliverConfig != null) {
            this.AlarmNoticeDeliverConfig = new AlarmNoticeDeliverConfig(source.AlarmNoticeDeliverConfig);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DeliverStatus != null) {
            this.DeliverStatus = new Long(source.DeliverStatus);
        }
        if (source.DeliverFlag != null) {
            this.DeliverFlag = new Long(source.DeliverFlag);
        }
        if (source.AlarmShieldCount != null) {
            this.AlarmShieldCount = new AlarmShieldCount(source.AlarmShieldCount);
        }
        if (source.CallbackPrioritize != null) {
            this.CallbackPrioritize = new Boolean(source.CallbackPrioritize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);
        this.setParamSimple(map, prefix + "AlarmNoticeId", this.AlarmNoticeId);
        this.setParamArrayObj(map, prefix + "NoticeRules.", this.NoticeRules);
        this.setParamSimple(map, prefix + "AlarmShieldStatus", this.AlarmShieldStatus);
        this.setParamSimple(map, prefix + "SecureDetailStatus", this.SecureDetailStatus);
        this.setParamSimple(map, prefix + "JumpDomain", this.JumpDomain);
        this.setParamObj(map, prefix + "AlarmNoticeDeliverConfig.", this.AlarmNoticeDeliverConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DeliverStatus", this.DeliverStatus);
        this.setParamSimple(map, prefix + "DeliverFlag", this.DeliverFlag);
        this.setParamObj(map, prefix + "AlarmShieldCount.", this.AlarmShieldCount);
        this.setParamSimple(map, prefix + "CallbackPrioritize", this.CallbackPrioritize);

    }
}

