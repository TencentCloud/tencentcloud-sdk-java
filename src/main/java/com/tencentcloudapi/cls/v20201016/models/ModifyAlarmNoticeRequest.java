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

public class ModifyAlarmNoticeRequest extends AbstractModel {

    /**
    * <p>通知渠道组ID。-通过<a href="https://cloud.tencent.com/document/api/614/56462">获取通知渠道组列表</a>获取通知渠道组ID</p>
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

    /**
    * <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的通知渠道组。最大支持10个标签键值对，并且不能有重复的键值对。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>通知渠道组名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>通知类型。可选值：</p><li> Trigger - 告警触发</li><li> Recovery - 告警恢复</li><li> All - 告警触发和告警恢复</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>通知接收对象。</p>
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * <p>接口回调信息（包括企业微信等）。</p>
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * <p>通知规则。</p><p>注意: </p><ul><li>Type、NoticeReceivers和WebCallbacks是一组配置，NoticeRules是另一组配置，2组配置互斥。</li><li>传其中一组数据，则另一组数据置空。</li></ul>
    */
    @SerializedName("NoticeRules")
    @Expose
    private NoticeRule [] NoticeRules;

    /**
    * <p>调用链接域名。http:// 或者 https:// 开头，不能/结尾</p>
    */
    @SerializedName("JumpDomain")
    @Expose
    private String JumpDomain;

    /**
    * <p>投递日志开关。</p><p>参数值：<br>1：关闭；</p><p>2：开启</p>
    */
    @SerializedName("DeliverStatus")
    @Expose
    private Long DeliverStatus;

    /**
    * <p>投递日志配置。</p>
    */
    @SerializedName("DeliverConfig")
    @Expose
    private DeliverConfig DeliverConfig;

    /**
    * <p>免登录操作告警开关。</p><p>参数值：<br>        1：关闭<br>        2：开启（默认开启）</p>
    */
    @SerializedName("AlarmShieldStatus")
    @Expose
    private Long AlarmShieldStatus;

    /**
    * <p>告警详情安全认证跳转开关，未传时默认&quot;关闭&quot;</p><p>枚举值：</p><ul><li>1： 关闭（默认值）</li><li>2： 开启</li></ul>
    */
    @SerializedName("SecureDetailStatus")
    @Expose
    private Long SecureDetailStatus;

    /**
    * <p>统一设定自定义回调参数。</p><ul><li>true: 使用通知内容模板中的自定义回调参数覆盖告警策略中单独配置的请求头及请求内容。</li><li>false:优先使用告警策略中单独配置的请求头及请求内容。</li></ul>
    */
    @SerializedName("CallbackPrioritize")
    @Expose
    private Boolean CallbackPrioritize;

    /**
     * Get <p>通知渠道组ID。-通过<a href="https://cloud.tencent.com/document/api/614/56462">获取通知渠道组列表</a>获取通知渠道组ID</p> 
     * @return AlarmNoticeId <p>通知渠道组ID。-通过<a href="https://cloud.tencent.com/document/api/614/56462">获取通知渠道组列表</a>获取通知渠道组ID</p>
     */
    public String getAlarmNoticeId() {
        return this.AlarmNoticeId;
    }

    /**
     * Set <p>通知渠道组ID。-通过<a href="https://cloud.tencent.com/document/api/614/56462">获取通知渠道组列表</a>获取通知渠道组ID</p>
     * @param AlarmNoticeId <p>通知渠道组ID。-通过<a href="https://cloud.tencent.com/document/api/614/56462">获取通知渠道组列表</a>获取通知渠道组ID</p>
     */
    public void setAlarmNoticeId(String AlarmNoticeId) {
        this.AlarmNoticeId = AlarmNoticeId;
    }

    /**
     * Get <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的通知渠道组。最大支持10个标签键值对，并且不能有重复的键值对。</p> 
     * @return Tags <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的通知渠道组。最大支持10个标签键值对，并且不能有重复的键值对。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的通知渠道组。最大支持10个标签键值对，并且不能有重复的键值对。</p>
     * @param Tags <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的通知渠道组。最大支持10个标签键值对，并且不能有重复的键值对。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>通知渠道组名称。</p> 
     * @return Name <p>通知渠道组名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>通知渠道组名称。</p>
     * @param Name <p>通知渠道组名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>通知类型。可选值：</p><li> Trigger - 告警触发</li><li> Recovery - 告警恢复</li><li> All - 告警触发和告警恢复</li> 
     * @return Type <p>通知类型。可选值：</p><li> Trigger - 告警触发</li><li> Recovery - 告警恢复</li><li> All - 告警触发和告警恢复</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>通知类型。可选值：</p><li> Trigger - 告警触发</li><li> Recovery - 告警恢复</li><li> All - 告警触发和告警恢复</li>
     * @param Type <p>通知类型。可选值：</p><li> Trigger - 告警触发</li><li> Recovery - 告警恢复</li><li> All - 告警触发和告警恢复</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>通知接收对象。</p> 
     * @return NoticeReceivers <p>通知接收对象。</p>
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set <p>通知接收对象。</p>
     * @param NoticeReceivers <p>通知接收对象。</p>
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get <p>接口回调信息（包括企业微信等）。</p> 
     * @return WebCallbacks <p>接口回调信息（包括企业微信等）。</p>
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set <p>接口回调信息（包括企业微信等）。</p>
     * @param WebCallbacks <p>接口回调信息（包括企业微信等）。</p>
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get <p>通知规则。</p><p>注意: </p><ul><li>Type、NoticeReceivers和WebCallbacks是一组配置，NoticeRules是另一组配置，2组配置互斥。</li><li>传其中一组数据，则另一组数据置空。</li></ul> 
     * @return NoticeRules <p>通知规则。</p><p>注意: </p><ul><li>Type、NoticeReceivers和WebCallbacks是一组配置，NoticeRules是另一组配置，2组配置互斥。</li><li>传其中一组数据，则另一组数据置空。</li></ul>
     */
    public NoticeRule [] getNoticeRules() {
        return this.NoticeRules;
    }

    /**
     * Set <p>通知规则。</p><p>注意: </p><ul><li>Type、NoticeReceivers和WebCallbacks是一组配置，NoticeRules是另一组配置，2组配置互斥。</li><li>传其中一组数据，则另一组数据置空。</li></ul>
     * @param NoticeRules <p>通知规则。</p><p>注意: </p><ul><li>Type、NoticeReceivers和WebCallbacks是一组配置，NoticeRules是另一组配置，2组配置互斥。</li><li>传其中一组数据，则另一组数据置空。</li></ul>
     */
    public void setNoticeRules(NoticeRule [] NoticeRules) {
        this.NoticeRules = NoticeRules;
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
     * Get <p>投递日志开关。</p><p>参数值：<br>1：关闭；</p><p>2：开启</p> 
     * @return DeliverStatus <p>投递日志开关。</p><p>参数值：<br>1：关闭；</p><p>2：开启</p>
     */
    public Long getDeliverStatus() {
        return this.DeliverStatus;
    }

    /**
     * Set <p>投递日志开关。</p><p>参数值：<br>1：关闭；</p><p>2：开启</p>
     * @param DeliverStatus <p>投递日志开关。</p><p>参数值：<br>1：关闭；</p><p>2：开启</p>
     */
    public void setDeliverStatus(Long DeliverStatus) {
        this.DeliverStatus = DeliverStatus;
    }

    /**
     * Get <p>投递日志配置。</p> 
     * @return DeliverConfig <p>投递日志配置。</p>
     */
    public DeliverConfig getDeliverConfig() {
        return this.DeliverConfig;
    }

    /**
     * Set <p>投递日志配置。</p>
     * @param DeliverConfig <p>投递日志配置。</p>
     */
    public void setDeliverConfig(DeliverConfig DeliverConfig) {
        this.DeliverConfig = DeliverConfig;
    }

    /**
     * Get <p>免登录操作告警开关。</p><p>参数值：<br>        1：关闭<br>        2：开启（默认开启）</p> 
     * @return AlarmShieldStatus <p>免登录操作告警开关。</p><p>参数值：<br>        1：关闭<br>        2：开启（默认开启）</p>
     */
    public Long getAlarmShieldStatus() {
        return this.AlarmShieldStatus;
    }

    /**
     * Set <p>免登录操作告警开关。</p><p>参数值：<br>        1：关闭<br>        2：开启（默认开启）</p>
     * @param AlarmShieldStatus <p>免登录操作告警开关。</p><p>参数值：<br>        1：关闭<br>        2：开启（默认开启）</p>
     */
    public void setAlarmShieldStatus(Long AlarmShieldStatus) {
        this.AlarmShieldStatus = AlarmShieldStatus;
    }

    /**
     * Get <p>告警详情安全认证跳转开关，未传时默认&quot;关闭&quot;</p><p>枚举值：</p><ul><li>1： 关闭（默认值）</li><li>2： 开启</li></ul> 
     * @return SecureDetailStatus <p>告警详情安全认证跳转开关，未传时默认&quot;关闭&quot;</p><p>枚举值：</p><ul><li>1： 关闭（默认值）</li><li>2： 开启</li></ul>
     */
    public Long getSecureDetailStatus() {
        return this.SecureDetailStatus;
    }

    /**
     * Set <p>告警详情安全认证跳转开关，未传时默认&quot;关闭&quot;</p><p>枚举值：</p><ul><li>1： 关闭（默认值）</li><li>2： 开启</li></ul>
     * @param SecureDetailStatus <p>告警详情安全认证跳转开关，未传时默认&quot;关闭&quot;</p><p>枚举值：</p><ul><li>1： 关闭（默认值）</li><li>2： 开启</li></ul>
     */
    public void setSecureDetailStatus(Long SecureDetailStatus) {
        this.SecureDetailStatus = SecureDetailStatus;
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

    public ModifyAlarmNoticeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmNoticeRequest(ModifyAlarmNoticeRequest source) {
        if (source.AlarmNoticeId != null) {
            this.AlarmNoticeId = new String(source.AlarmNoticeId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.NoticeRules != null) {
            this.NoticeRules = new NoticeRule[source.NoticeRules.length];
            for (int i = 0; i < source.NoticeRules.length; i++) {
                this.NoticeRules[i] = new NoticeRule(source.NoticeRules[i]);
            }
        }
        if (source.JumpDomain != null) {
            this.JumpDomain = new String(source.JumpDomain);
        }
        if (source.DeliverStatus != null) {
            this.DeliverStatus = new Long(source.DeliverStatus);
        }
        if (source.DeliverConfig != null) {
            this.DeliverConfig = new DeliverConfig(source.DeliverConfig);
        }
        if (source.AlarmShieldStatus != null) {
            this.AlarmShieldStatus = new Long(source.AlarmShieldStatus);
        }
        if (source.SecureDetailStatus != null) {
            this.SecureDetailStatus = new Long(source.SecureDetailStatus);
        }
        if (source.CallbackPrioritize != null) {
            this.CallbackPrioritize = new Boolean(source.CallbackPrioritize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmNoticeId", this.AlarmNoticeId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);
        this.setParamArrayObj(map, prefix + "NoticeRules.", this.NoticeRules);
        this.setParamSimple(map, prefix + "JumpDomain", this.JumpDomain);
        this.setParamSimple(map, prefix + "DeliverStatus", this.DeliverStatus);
        this.setParamObj(map, prefix + "DeliverConfig.", this.DeliverConfig);
        this.setParamSimple(map, prefix + "AlarmShieldStatus", this.AlarmShieldStatus);
        this.setParamSimple(map, prefix + "SecureDetailStatus", this.SecureDetailStatus);
        this.setParamSimple(map, prefix + "CallbackPrioritize", this.CallbackPrioritize);

    }
}

