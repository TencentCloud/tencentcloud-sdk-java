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
    * 官网通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QCloudYehe")
    @Expose
    private QCloudYeheNoticeTmplMatcher [] QCloudYehe;

    /**
    * 企业微信机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeWorkRobot")
    @Expose
    private WeWorkRobotNoticeTmplMatcher [] WeWorkRobot;

    /**
    * 钉钉机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DingDingRobot")
    @Expose
    private DingDingRobotNoticeTmplMatcher [] DingDingRobot;

    /**
    * 飞书机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeiShuRobot")
    @Expose
    private FeiShuRobotNoticeTmplMatcher [] FeiShuRobot;

    /**
    * 自定义Webhook通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Webhook")
    @Expose
    private WebhookNoticeTmplMatcher [] Webhook;

    /**
    * Teams机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TeamsRobot")
    @Expose
    private TeamsRobotNoticeTmplMatcher [] TeamsRobot;

    /**
    * PagerDutyRobot机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PagerDutyRobot")
    @Expose
    private PagerDutyRobotNoticeTmplMatcher [] PagerDutyRobot;

    /**
     * Get 官网通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QCloudYehe 官网通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QCloudYeheNoticeTmplMatcher [] getQCloudYehe() {
        return this.QCloudYehe;
    }

    /**
     * Set 官网通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param QCloudYehe 官网通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQCloudYehe(QCloudYeheNoticeTmplMatcher [] QCloudYehe) {
        this.QCloudYehe = QCloudYehe;
    }

    /**
     * Get 企业微信机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeWorkRobot 企业微信机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WeWorkRobotNoticeTmplMatcher [] getWeWorkRobot() {
        return this.WeWorkRobot;
    }

    /**
     * Set 企业微信机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeWorkRobot 企业微信机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeWorkRobot(WeWorkRobotNoticeTmplMatcher [] WeWorkRobot) {
        this.WeWorkRobot = WeWorkRobot;
    }

    /**
     * Get 钉钉机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DingDingRobot 钉钉机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DingDingRobotNoticeTmplMatcher [] getDingDingRobot() {
        return this.DingDingRobot;
    }

    /**
     * Set 钉钉机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DingDingRobot 钉钉机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDingDingRobot(DingDingRobotNoticeTmplMatcher [] DingDingRobot) {
        this.DingDingRobot = DingDingRobot;
    }

    /**
     * Get 飞书机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeiShuRobot 飞书机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FeiShuRobotNoticeTmplMatcher [] getFeiShuRobot() {
        return this.FeiShuRobot;
    }

    /**
     * Set 飞书机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeiShuRobot 飞书机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeiShuRobot(FeiShuRobotNoticeTmplMatcher [] FeiShuRobot) {
        this.FeiShuRobot = FeiShuRobot;
    }

    /**
     * Get 自定义Webhook通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Webhook 自定义Webhook通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebhookNoticeTmplMatcher [] getWebhook() {
        return this.Webhook;
    }

    /**
     * Set 自定义Webhook通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Webhook 自定义Webhook通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebhook(WebhookNoticeTmplMatcher [] Webhook) {
        this.Webhook = Webhook;
    }

    /**
     * Get Teams机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TeamsRobot Teams机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TeamsRobotNoticeTmplMatcher [] getTeamsRobot() {
        return this.TeamsRobot;
    }

    /**
     * Set Teams机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TeamsRobot Teams机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTeamsRobot(TeamsRobotNoticeTmplMatcher [] TeamsRobot) {
        this.TeamsRobot = TeamsRobot;
    }

    /**
     * Get PagerDutyRobot机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PagerDutyRobot PagerDutyRobot机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PagerDutyRobotNoticeTmplMatcher [] getPagerDutyRobot() {
        return this.PagerDutyRobot;
    }

    /**
     * Set PagerDutyRobot机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PagerDutyRobot PagerDutyRobot机器人通知渠道配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPagerDutyRobot(PagerDutyRobotNoticeTmplMatcher [] PagerDutyRobot) {
        this.PagerDutyRobot = PagerDutyRobot;
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

    }
}

