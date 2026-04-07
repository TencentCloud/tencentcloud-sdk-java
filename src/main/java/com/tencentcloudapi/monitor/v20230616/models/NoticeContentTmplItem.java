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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeContentTmplItem extends AbstractModel {

    /**
    * <p>官网通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QCloudYehe")
    @Expose
    private QCloudYeheNoticeTmplMatcher [] QCloudYehe;

    /**
    * <p>企业微信机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeWorkRobot")
    @Expose
    private WeWorkRobotNoticeTmplMatcher [] WeWorkRobot;

    /**
    * <p>钉钉机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DingDingRobot")
    @Expose
    private DingDingRobotNoticeTmplMatcher [] DingDingRobot;

    /**
    * <p>飞书机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeiShuRobot")
    @Expose
    private FeiShuRobotNoticeTmplMatcher [] FeiShuRobot;

    /**
    * <p>自定义Webhook通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Webhook")
    @Expose
    private WebhookNoticeTmplMatcher [] Webhook;

    /**
    * <p>Teams机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TeamsRobot")
    @Expose
    private TeamsRobotNoticeTmplMatcher [] TeamsRobot;

    /**
    * <p>PagerDutyRobot机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PagerDutyRobot")
    @Expose
    private PagerDutyRobotNoticeTmplMatcher [] PagerDutyRobot;

    /**
    * <p>GoogleChat</p>
    */
    @SerializedName("GoogleChatRobot")
    @Expose
    private GoogleChatRobotNoticeTmplMatcher [] GoogleChatRobot;

    /**
    * <p>Slack</p>
    */
    @SerializedName("SlackRobot")
    @Expose
    private SlackRobotNoticeTmplMatcher [] SlackRobot;

    /**
     * Get <p>官网通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QCloudYehe <p>官网通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QCloudYeheNoticeTmplMatcher [] getQCloudYehe() {
        return this.QCloudYehe;
    }

    /**
     * Set <p>官网通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QCloudYehe <p>官网通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQCloudYehe(QCloudYeheNoticeTmplMatcher [] QCloudYehe) {
        this.QCloudYehe = QCloudYehe;
    }

    /**
     * Get <p>企业微信机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeWorkRobot <p>企业微信机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WeWorkRobotNoticeTmplMatcher [] getWeWorkRobot() {
        return this.WeWorkRobot;
    }

    /**
     * Set <p>企业微信机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeWorkRobot <p>企业微信机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeWorkRobot(WeWorkRobotNoticeTmplMatcher [] WeWorkRobot) {
        this.WeWorkRobot = WeWorkRobot;
    }

    /**
     * Get <p>钉钉机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DingDingRobot <p>钉钉机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DingDingRobotNoticeTmplMatcher [] getDingDingRobot() {
        return this.DingDingRobot;
    }

    /**
     * Set <p>钉钉机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DingDingRobot <p>钉钉机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDingDingRobot(DingDingRobotNoticeTmplMatcher [] DingDingRobot) {
        this.DingDingRobot = DingDingRobot;
    }

    /**
     * Get <p>飞书机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeiShuRobot <p>飞书机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FeiShuRobotNoticeTmplMatcher [] getFeiShuRobot() {
        return this.FeiShuRobot;
    }

    /**
     * Set <p>飞书机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeiShuRobot <p>飞书机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeiShuRobot(FeiShuRobotNoticeTmplMatcher [] FeiShuRobot) {
        this.FeiShuRobot = FeiShuRobot;
    }

    /**
     * Get <p>自定义Webhook通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Webhook <p>自定义Webhook通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebhookNoticeTmplMatcher [] getWebhook() {
        return this.Webhook;
    }

    /**
     * Set <p>自定义Webhook通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Webhook <p>自定义Webhook通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebhook(WebhookNoticeTmplMatcher [] Webhook) {
        this.Webhook = Webhook;
    }

    /**
     * Get <p>Teams机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TeamsRobot <p>Teams机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TeamsRobotNoticeTmplMatcher [] getTeamsRobot() {
        return this.TeamsRobot;
    }

    /**
     * Set <p>Teams机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TeamsRobot <p>Teams机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTeamsRobot(TeamsRobotNoticeTmplMatcher [] TeamsRobot) {
        this.TeamsRobot = TeamsRobot;
    }

    /**
     * Get <p>PagerDutyRobot机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PagerDutyRobot <p>PagerDutyRobot机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PagerDutyRobotNoticeTmplMatcher [] getPagerDutyRobot() {
        return this.PagerDutyRobot;
    }

    /**
     * Set <p>PagerDutyRobot机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PagerDutyRobot <p>PagerDutyRobot机器人通知渠道配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPagerDutyRobot(PagerDutyRobotNoticeTmplMatcher [] PagerDutyRobot) {
        this.PagerDutyRobot = PagerDutyRobot;
    }

    /**
     * Get <p>GoogleChat</p> 
     * @return GoogleChatRobot <p>GoogleChat</p>
     */
    public GoogleChatRobotNoticeTmplMatcher [] getGoogleChatRobot() {
        return this.GoogleChatRobot;
    }

    /**
     * Set <p>GoogleChat</p>
     * @param GoogleChatRobot <p>GoogleChat</p>
     */
    public void setGoogleChatRobot(GoogleChatRobotNoticeTmplMatcher [] GoogleChatRobot) {
        this.GoogleChatRobot = GoogleChatRobot;
    }

    /**
     * Get <p>Slack</p> 
     * @return SlackRobot <p>Slack</p>
     */
    public SlackRobotNoticeTmplMatcher [] getSlackRobot() {
        return this.SlackRobot;
    }

    /**
     * Set <p>Slack</p>
     * @param SlackRobot <p>Slack</p>
     */
    public void setSlackRobot(SlackRobotNoticeTmplMatcher [] SlackRobot) {
        this.SlackRobot = SlackRobot;
    }

    public NoticeContentTmplItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeContentTmplItem(NoticeContentTmplItem source) {
        if (source.QCloudYehe != null) {
            this.QCloudYehe = new QCloudYeheNoticeTmplMatcher[source.QCloudYehe.length];
            for (int i = 0; i < source.QCloudYehe.length; i++) {
                this.QCloudYehe[i] = new QCloudYeheNoticeTmplMatcher(source.QCloudYehe[i]);
            }
        }
        if (source.WeWorkRobot != null) {
            this.WeWorkRobot = new WeWorkRobotNoticeTmplMatcher[source.WeWorkRobot.length];
            for (int i = 0; i < source.WeWorkRobot.length; i++) {
                this.WeWorkRobot[i] = new WeWorkRobotNoticeTmplMatcher(source.WeWorkRobot[i]);
            }
        }
        if (source.DingDingRobot != null) {
            this.DingDingRobot = new DingDingRobotNoticeTmplMatcher[source.DingDingRobot.length];
            for (int i = 0; i < source.DingDingRobot.length; i++) {
                this.DingDingRobot[i] = new DingDingRobotNoticeTmplMatcher(source.DingDingRobot[i]);
            }
        }
        if (source.FeiShuRobot != null) {
            this.FeiShuRobot = new FeiShuRobotNoticeTmplMatcher[source.FeiShuRobot.length];
            for (int i = 0; i < source.FeiShuRobot.length; i++) {
                this.FeiShuRobot[i] = new FeiShuRobotNoticeTmplMatcher(source.FeiShuRobot[i]);
            }
        }
        if (source.Webhook != null) {
            this.Webhook = new WebhookNoticeTmplMatcher[source.Webhook.length];
            for (int i = 0; i < source.Webhook.length; i++) {
                this.Webhook[i] = new WebhookNoticeTmplMatcher(source.Webhook[i]);
            }
        }
        if (source.TeamsRobot != null) {
            this.TeamsRobot = new TeamsRobotNoticeTmplMatcher[source.TeamsRobot.length];
            for (int i = 0; i < source.TeamsRobot.length; i++) {
                this.TeamsRobot[i] = new TeamsRobotNoticeTmplMatcher(source.TeamsRobot[i]);
            }
        }
        if (source.PagerDutyRobot != null) {
            this.PagerDutyRobot = new PagerDutyRobotNoticeTmplMatcher[source.PagerDutyRobot.length];
            for (int i = 0; i < source.PagerDutyRobot.length; i++) {
                this.PagerDutyRobot[i] = new PagerDutyRobotNoticeTmplMatcher(source.PagerDutyRobot[i]);
            }
        }
        if (source.GoogleChatRobot != null) {
            this.GoogleChatRobot = new GoogleChatRobotNoticeTmplMatcher[source.GoogleChatRobot.length];
            for (int i = 0; i < source.GoogleChatRobot.length; i++) {
                this.GoogleChatRobot[i] = new GoogleChatRobotNoticeTmplMatcher(source.GoogleChatRobot[i]);
            }
        }
        if (source.SlackRobot != null) {
            this.SlackRobot = new SlackRobotNoticeTmplMatcher[source.SlackRobot.length];
            for (int i = 0; i < source.SlackRobot.length; i++) {
                this.SlackRobot[i] = new SlackRobotNoticeTmplMatcher(source.SlackRobot[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "QCloudYehe.", this.QCloudYehe);
        this.setParamArrayObj(map, prefix + "WeWorkRobot.", this.WeWorkRobot);
        this.setParamArrayObj(map, prefix + "DingDingRobot.", this.DingDingRobot);
        this.setParamArrayObj(map, prefix + "FeiShuRobot.", this.FeiShuRobot);
        this.setParamArrayObj(map, prefix + "Webhook.", this.Webhook);
        this.setParamArrayObj(map, prefix + "TeamsRobot.", this.TeamsRobot);
        this.setParamArrayObj(map, prefix + "PagerDutyRobot.", this.PagerDutyRobot);
        this.setParamArrayObj(map, prefix + "GoogleChatRobot.", this.GoogleChatRobot);
        this.setParamArrayObj(map, prefix + "SlackRobot.", this.SlackRobot);

    }
}

