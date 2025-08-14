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
    * 告警通知渠道组名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 告警通知渠道组绑定的标签信息。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 告警模板的类型。可选值：
<br><li> Trigger - 告警触发</li>
<br><li> Recovery - 告警恢复</li>
<br><li> All - 告警触发和告警恢复</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 告警通知模板接收者信息。
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * 告警通知模板回调信息。
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * 告警通知模板ID。
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

    /**
    * 通知规则。
    */
    @SerializedName("NoticeRules")
    @Expose
    private NoticeRule [] NoticeRules;

    /**
    * 免登录操作告警开关。
参数值： 1：关闭 2：开启（默认开启）
    */
    @SerializedName("AlarmShieldStatus")
    @Expose
    private Long AlarmShieldStatus;

    /**
    * 调用链接域名。http:// 或者 https:// 开头，不能/结尾
    */
    @SerializedName("JumpDomain")
    @Expose
    private String JumpDomain;

    /**
    * 投递相关信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmNoticeDeliverConfig")
    @Expose
    private AlarmNoticeDeliverConfig AlarmNoticeDeliverConfig;

    /**
    * 创建时间。格式： YYYY-MM-DD HH:MM:SS
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近更新时间。格式： YYYY-MM-DD HH:MM:SS
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 告警通知渠道组名称。 
     * @return Name 告警通知渠道组名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警通知渠道组名称。
     * @param Name 告警通知渠道组名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 告警通知渠道组绑定的标签信息。 
     * @return Tags 告警通知渠道组绑定的标签信息。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 告警通知渠道组绑定的标签信息。
     * @param Tags 告警通知渠道组绑定的标签信息。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 告警模板的类型。可选值：
<br><li> Trigger - 告警触发</li>
<br><li> Recovery - 告警恢复</li>
<br><li> All - 告警触发和告警恢复</li> 
     * @return Type 告警模板的类型。可选值：
<br><li> Trigger - 告警触发</li>
<br><li> Recovery - 告警恢复</li>
<br><li> All - 告警触发和告警恢复</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 告警模板的类型。可选值：
<br><li> Trigger - 告警触发</li>
<br><li> Recovery - 告警恢复</li>
<br><li> All - 告警触发和告警恢复</li>
     * @param Type 告警模板的类型。可选值：
<br><li> Trigger - 告警触发</li>
<br><li> Recovery - 告警恢复</li>
<br><li> All - 告警触发和告警恢复</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 告警通知模板接收者信息。 
     * @return NoticeReceivers 告警通知模板接收者信息。
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set 告警通知模板接收者信息。
     * @param NoticeReceivers 告警通知模板接收者信息。
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get 告警通知模板回调信息。 
     * @return WebCallbacks 告警通知模板回调信息。
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set 告警通知模板回调信息。
     * @param WebCallbacks 告警通知模板回调信息。
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get 告警通知模板ID。 
     * @return AlarmNoticeId 告警通知模板ID。
     */
    public String getAlarmNoticeId() {
        return this.AlarmNoticeId;
    }

    /**
     * Set 告警通知模板ID。
     * @param AlarmNoticeId 告警通知模板ID。
     */
    public void setAlarmNoticeId(String AlarmNoticeId) {
        this.AlarmNoticeId = AlarmNoticeId;
    }

    /**
     * Get 通知规则。 
     * @return NoticeRules 通知规则。
     */
    public NoticeRule [] getNoticeRules() {
        return this.NoticeRules;
    }

    /**
     * Set 通知规则。
     * @param NoticeRules 通知规则。
     */
    public void setNoticeRules(NoticeRule [] NoticeRules) {
        this.NoticeRules = NoticeRules;
    }

    /**
     * Get 免登录操作告警开关。
参数值： 1：关闭 2：开启（默认开启） 
     * @return AlarmShieldStatus 免登录操作告警开关。
参数值： 1：关闭 2：开启（默认开启）
     */
    public Long getAlarmShieldStatus() {
        return this.AlarmShieldStatus;
    }

    /**
     * Set 免登录操作告警开关。
参数值： 1：关闭 2：开启（默认开启）
     * @param AlarmShieldStatus 免登录操作告警开关。
参数值： 1：关闭 2：开启（默认开启）
     */
    public void setAlarmShieldStatus(Long AlarmShieldStatus) {
        this.AlarmShieldStatus = AlarmShieldStatus;
    }

    /**
     * Get 调用链接域名。http:// 或者 https:// 开头，不能/结尾 
     * @return JumpDomain 调用链接域名。http:// 或者 https:// 开头，不能/结尾
     */
    public String getJumpDomain() {
        return this.JumpDomain;
    }

    /**
     * Set 调用链接域名。http:// 或者 https:// 开头，不能/结尾
     * @param JumpDomain 调用链接域名。http:// 或者 https:// 开头，不能/结尾
     */
    public void setJumpDomain(String JumpDomain) {
        this.JumpDomain = JumpDomain;
    }

    /**
     * Get 投递相关信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmNoticeDeliverConfig 投递相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmNoticeDeliverConfig getAlarmNoticeDeliverConfig() {
        return this.AlarmNoticeDeliverConfig;
    }

    /**
     * Set 投递相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmNoticeDeliverConfig 投递相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmNoticeDeliverConfig(AlarmNoticeDeliverConfig AlarmNoticeDeliverConfig) {
        this.AlarmNoticeDeliverConfig = AlarmNoticeDeliverConfig;
    }

    /**
     * Get 创建时间。格式： YYYY-MM-DD HH:MM:SS 
     * @return CreateTime 创建时间。格式： YYYY-MM-DD HH:MM:SS
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。格式： YYYY-MM-DD HH:MM:SS
     * @param CreateTime 创建时间。格式： YYYY-MM-DD HH:MM:SS
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近更新时间。格式： YYYY-MM-DD HH:MM:SS 
     * @return UpdateTime 最近更新时间。格式： YYYY-MM-DD HH:MM:SS
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近更新时间。格式： YYYY-MM-DD HH:MM:SS
     * @param UpdateTime 最近更新时间。格式： YYYY-MM-DD HH:MM:SS
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
        this.setParamSimple(map, prefix + "JumpDomain", this.JumpDomain);
        this.setParamObj(map, prefix + "AlarmNoticeDeliverConfig.", this.AlarmNoticeDeliverConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

