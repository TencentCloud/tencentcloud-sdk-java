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

public class CreateAlarmNoticeRequest extends AbstractModel {

    /**
    * 通知渠道组名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标签描述列表，通过指定该参数可以同时绑定标签到相应的通知渠道组。最大支持50个标签键值对，并且不能有重复的键值对。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
需要发送通知的告警类型。可选值：
- Trigger - 告警触发
- Recovery - 告警恢复
- All - 告警触发和告警恢复
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
通知接收对象。
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
接口回调信息（包括企业微信、钉钉、飞书）。
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * 【高级模式】（简易模式/告警模式二选一，分别配置相应参数）
通知规则。
    */
    @SerializedName("NoticeRules")
    @Expose
    private NoticeRule [] NoticeRules;

    /**
    * 查询数据链接。http:// 或者 https:// 开头，不能/结尾
    */
    @SerializedName("JumpDomain")
    @Expose
    private String JumpDomain;

    /**
    * 投递日志开关。可取值如下：
1：关闭（默认值）；
2：开启 
投递日志开关开启时， DeliverConfig参数必填。
    */
    @SerializedName("DeliverStatus")
    @Expose
    private Long DeliverStatus;

    /**
    * 投递日志配置参数。当DeliverStatus开启时，必填。
    */
    @SerializedName("DeliverConfig")
    @Expose
    private DeliverConfig DeliverConfig;

    /**
    * 免登录操作告警开关。可取值如下：
-      1：关闭
-      2：开启（默认值）
    */
    @SerializedName("AlarmShieldStatus")
    @Expose
    private Long AlarmShieldStatus;

    /**
     * Get 通知渠道组名称。 
     * @return Name 通知渠道组名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 通知渠道组名称。
     * @param Name 通知渠道组名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标签描述列表，通过指定该参数可以同时绑定标签到相应的通知渠道组。最大支持50个标签键值对，并且不能有重复的键值对。 
     * @return Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的通知渠道组。最大支持50个标签键值对，并且不能有重复的键值对。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签描述列表，通过指定该参数可以同时绑定标签到相应的通知渠道组。最大支持50个标签键值对，并且不能有重复的键值对。
     * @param Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的通知渠道组。最大支持50个标签键值对，并且不能有重复的键值对。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
需要发送通知的告警类型。可选值：
- Trigger - 告警触发
- Recovery - 告警恢复
- All - 告警触发和告警恢复 
     * @return Type 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
需要发送通知的告警类型。可选值：
- Trigger - 告警触发
- Recovery - 告警恢复
- All - 告警触发和告警恢复
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
需要发送通知的告警类型。可选值：
- Trigger - 告警触发
- Recovery - 告警恢复
- All - 告警触发和告警恢复
     * @param Type 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
需要发送通知的告警类型。可选值：
- Trigger - 告警触发
- Recovery - 告警恢复
- All - 告警触发和告警恢复
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
通知接收对象。 
     * @return NoticeReceivers 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
通知接收对象。
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
通知接收对象。
     * @param NoticeReceivers 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
通知接收对象。
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
接口回调信息（包括企业微信、钉钉、飞书）。 
     * @return WebCallbacks 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
接口回调信息（包括企业微信、钉钉、飞书）。
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
接口回调信息（包括企业微信、钉钉、飞书）。
     * @param WebCallbacks 【简易模式】（简易模式/告警模式二选一，分别配置相应参数）
接口回调信息（包括企业微信、钉钉、飞书）。
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get 【高级模式】（简易模式/告警模式二选一，分别配置相应参数）
通知规则。 
     * @return NoticeRules 【高级模式】（简易模式/告警模式二选一，分别配置相应参数）
通知规则。
     */
    public NoticeRule [] getNoticeRules() {
        return this.NoticeRules;
    }

    /**
     * Set 【高级模式】（简易模式/告警模式二选一，分别配置相应参数）
通知规则。
     * @param NoticeRules 【高级模式】（简易模式/告警模式二选一，分别配置相应参数）
通知规则。
     */
    public void setNoticeRules(NoticeRule [] NoticeRules) {
        this.NoticeRules = NoticeRules;
    }

    /**
     * Get 查询数据链接。http:// 或者 https:// 开头，不能/结尾 
     * @return JumpDomain 查询数据链接。http:// 或者 https:// 开头，不能/结尾
     */
    public String getJumpDomain() {
        return this.JumpDomain;
    }

    /**
     * Set 查询数据链接。http:// 或者 https:// 开头，不能/结尾
     * @param JumpDomain 查询数据链接。http:// 或者 https:// 开头，不能/结尾
     */
    public void setJumpDomain(String JumpDomain) {
        this.JumpDomain = JumpDomain;
    }

    /**
     * Get 投递日志开关。可取值如下：
1：关闭（默认值）；
2：开启 
投递日志开关开启时， DeliverConfig参数必填。 
     * @return DeliverStatus 投递日志开关。可取值如下：
1：关闭（默认值）；
2：开启 
投递日志开关开启时， DeliverConfig参数必填。
     */
    public Long getDeliverStatus() {
        return this.DeliverStatus;
    }

    /**
     * Set 投递日志开关。可取值如下：
1：关闭（默认值）；
2：开启 
投递日志开关开启时， DeliverConfig参数必填。
     * @param DeliverStatus 投递日志开关。可取值如下：
1：关闭（默认值）；
2：开启 
投递日志开关开启时， DeliverConfig参数必填。
     */
    public void setDeliverStatus(Long DeliverStatus) {
        this.DeliverStatus = DeliverStatus;
    }

    /**
     * Get 投递日志配置参数。当DeliverStatus开启时，必填。 
     * @return DeliverConfig 投递日志配置参数。当DeliverStatus开启时，必填。
     */
    public DeliverConfig getDeliverConfig() {
        return this.DeliverConfig;
    }

    /**
     * Set 投递日志配置参数。当DeliverStatus开启时，必填。
     * @param DeliverConfig 投递日志配置参数。当DeliverStatus开启时，必填。
     */
    public void setDeliverConfig(DeliverConfig DeliverConfig) {
        this.DeliverConfig = DeliverConfig;
    }

    /**
     * Get 免登录操作告警开关。可取值如下：
-      1：关闭
-      2：开启（默认值） 
     * @return AlarmShieldStatus 免登录操作告警开关。可取值如下：
-      1：关闭
-      2：开启（默认值）
     */
    public Long getAlarmShieldStatus() {
        return this.AlarmShieldStatus;
    }

    /**
     * Set 免登录操作告警开关。可取值如下：
-      1：关闭
-      2：开启（默认值）
     * @param AlarmShieldStatus 免登录操作告警开关。可取值如下：
-      1：关闭
-      2：开启（默认值）
     */
    public void setAlarmShieldStatus(Long AlarmShieldStatus) {
        this.AlarmShieldStatus = AlarmShieldStatus;
    }

    public CreateAlarmNoticeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmNoticeRequest(CreateAlarmNoticeRequest source) {
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
        this.setParamArrayObj(map, prefix + "NoticeRules.", this.NoticeRules);
        this.setParamSimple(map, prefix + "JumpDomain", this.JumpDomain);
        this.setParamSimple(map, prefix + "DeliverStatus", this.DeliverStatus);
        this.setParamObj(map, prefix + "DeliverConfig.", this.DeliverConfig);
        this.setParamSimple(map, prefix + "AlarmShieldStatus", this.AlarmShieldStatus);

    }
}

