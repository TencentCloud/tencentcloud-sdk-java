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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelSpec extends AbstractModel {

    /**
    * <p>渠道名称</p>
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * <p>渠道类型，详见ChannelType枚举</p><p>枚举值：</p><ul><li>10000： 微信服务号(Wechat)</li><li>10002： 企微应用(WeComApp)</li><li>10004： 微信客服(WechatCustomerService)</li><li>10009： 企微智能机器人(WeComRobot)</li><li>10013： 钉钉机器人(DingTalk)</li><li>10014： 企微智能机器人WebSocket(WeComRobot)</li><li>10015： 微信ClawBot(WechatClawBot)</li><li>10011： LINE(Line)</li><li>10012： Telegram(Telegram)</li><li>10016： 飞书机器人(Lark) </li></ul><p>C端场景（Scene=1时）只支持10014和10015</p>
    */
    @SerializedName("ChannelType")
    @Expose
    private Long ChannelType;

    /**
    * <p>备注</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>钉钉机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DingTalk")
    @Expose
    private DingTalkChannelConfig DingTalk;

    /**
    * <p>飞书机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Lark")
    @Expose
    private LarkChannelConfig Lark;

    /**
    * <p>LINE配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Line")
    @Expose
    private LineChannelConfig Line;

    /**
    * <p>渠道场景：0-B端场景，1-C端场景</p>
    */
    @SerializedName("Scene")
    @Expose
    private Long Scene;

    /**
    * <p>Telegram配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Telegram")
    @Expose
    private TelegramChannelConfig Telegram;

    /**
    * <p>归属用户+Agent运行态标识（C端）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAgent")
    @Expose
    private UserAgentReference UserAgent;

    /**
    * <p>微信公众号/小程序配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Wechat")
    @Expose
    private WechatChannelConfig Wechat;

    /**
    * <p>微信ClawBot配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatClawBot")
    @Expose
    private WechatClawBotChannelConfig WechatClawBot;

    /**
    * <p>微信客服配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatCustomerService")
    @Expose
    private WechatCustomerServiceChannelConfig WechatCustomerService;

    /**
    * <p>企微应用配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WecomApp")
    @Expose
    private WecomAppChannelConfig WecomApp;

    /**
    * <p>企微机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WecomRobot")
    @Expose
    private WecomRobotChannelConfig WecomRobot;

    /**
     * Get <p>渠道名称</p> 
     * @return ChannelName <p>渠道名称</p>
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set <p>渠道名称</p>
     * @param ChannelName <p>渠道名称</p>
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get <p>渠道类型，详见ChannelType枚举</p><p>枚举值：</p><ul><li>10000： 微信服务号(Wechat)</li><li>10002： 企微应用(WeComApp)</li><li>10004： 微信客服(WechatCustomerService)</li><li>10009： 企微智能机器人(WeComRobot)</li><li>10013： 钉钉机器人(DingTalk)</li><li>10014： 企微智能机器人WebSocket(WeComRobot)</li><li>10015： 微信ClawBot(WechatClawBot)</li><li>10011： LINE(Line)</li><li>10012： Telegram(Telegram)</li><li>10016： 飞书机器人(Lark) </li></ul><p>C端场景（Scene=1时）只支持10014和10015</p> 
     * @return ChannelType <p>渠道类型，详见ChannelType枚举</p><p>枚举值：</p><ul><li>10000： 微信服务号(Wechat)</li><li>10002： 企微应用(WeComApp)</li><li>10004： 微信客服(WechatCustomerService)</li><li>10009： 企微智能机器人(WeComRobot)</li><li>10013： 钉钉机器人(DingTalk)</li><li>10014： 企微智能机器人WebSocket(WeComRobot)</li><li>10015： 微信ClawBot(WechatClawBot)</li><li>10011： LINE(Line)</li><li>10012： Telegram(Telegram)</li><li>10016： 飞书机器人(Lark) </li></ul><p>C端场景（Scene=1时）只支持10014和10015</p>
     */
    public Long getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set <p>渠道类型，详见ChannelType枚举</p><p>枚举值：</p><ul><li>10000： 微信服务号(Wechat)</li><li>10002： 企微应用(WeComApp)</li><li>10004： 微信客服(WechatCustomerService)</li><li>10009： 企微智能机器人(WeComRobot)</li><li>10013： 钉钉机器人(DingTalk)</li><li>10014： 企微智能机器人WebSocket(WeComRobot)</li><li>10015： 微信ClawBot(WechatClawBot)</li><li>10011： LINE(Line)</li><li>10012： Telegram(Telegram)</li><li>10016： 飞书机器人(Lark) </li></ul><p>C端场景（Scene=1时）只支持10014和10015</p>
     * @param ChannelType <p>渠道类型，详见ChannelType枚举</p><p>枚举值：</p><ul><li>10000： 微信服务号(Wechat)</li><li>10002： 企微应用(WeComApp)</li><li>10004： 微信客服(WechatCustomerService)</li><li>10009： 企微智能机器人(WeComRobot)</li><li>10013： 钉钉机器人(DingTalk)</li><li>10014： 企微智能机器人WebSocket(WeComRobot)</li><li>10015： 微信ClawBot(WechatClawBot)</li><li>10011： LINE(Line)</li><li>10012： Telegram(Telegram)</li><li>10016： 飞书机器人(Lark) </li></ul><p>C端场景（Scene=1时）只支持10014和10015</p>
     */
    public void setChannelType(Long ChannelType) {
        this.ChannelType = ChannelType;
    }

    /**
     * Get <p>备注</p> 
     * @return Description <p>备注</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>备注</p>
     * @param Description <p>备注</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>钉钉机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DingTalk <p>钉钉机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DingTalkChannelConfig getDingTalk() {
        return this.DingTalk;
    }

    /**
     * Set <p>钉钉机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DingTalk <p>钉钉机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDingTalk(DingTalkChannelConfig DingTalk) {
        this.DingTalk = DingTalk;
    }

    /**
     * Get <p>飞书机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Lark <p>飞书机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LarkChannelConfig getLark() {
        return this.Lark;
    }

    /**
     * Set <p>飞书机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Lark <p>飞书机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLark(LarkChannelConfig Lark) {
        this.Lark = Lark;
    }

    /**
     * Get <p>LINE配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Line <p>LINE配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineChannelConfig getLine() {
        return this.Line;
    }

    /**
     * Set <p>LINE配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Line <p>LINE配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLine(LineChannelConfig Line) {
        this.Line = Line;
    }

    /**
     * Get <p>渠道场景：0-B端场景，1-C端场景</p> 
     * @return Scene <p>渠道场景：0-B端场景，1-C端场景</p>
     */
    public Long getScene() {
        return this.Scene;
    }

    /**
     * Set <p>渠道场景：0-B端场景，1-C端场景</p>
     * @param Scene <p>渠道场景：0-B端场景，1-C端场景</p>
     */
    public void setScene(Long Scene) {
        this.Scene = Scene;
    }

    /**
     * Get <p>Telegram配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Telegram <p>Telegram配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TelegramChannelConfig getTelegram() {
        return this.Telegram;
    }

    /**
     * Set <p>Telegram配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Telegram <p>Telegram配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTelegram(TelegramChannelConfig Telegram) {
        this.Telegram = Telegram;
    }

    /**
     * Get <p>归属用户+Agent运行态标识（C端）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAgent <p>归属用户+Agent运行态标识（C端）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserAgentReference getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set <p>归属用户+Agent运行态标识（C端）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAgent <p>归属用户+Agent运行态标识（C端）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAgent(UserAgentReference UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get <p>微信公众号/小程序配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Wechat <p>微信公众号/小程序配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WechatChannelConfig getWechat() {
        return this.Wechat;
    }

    /**
     * Set <p>微信公众号/小程序配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Wechat <p>微信公众号/小程序配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechat(WechatChannelConfig Wechat) {
        this.Wechat = Wechat;
    }

    /**
     * Get <p>微信ClawBot配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatClawBot <p>微信ClawBot配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WechatClawBotChannelConfig getWechatClawBot() {
        return this.WechatClawBot;
    }

    /**
     * Set <p>微信ClawBot配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatClawBot <p>微信ClawBot配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatClawBot(WechatClawBotChannelConfig WechatClawBot) {
        this.WechatClawBot = WechatClawBot;
    }

    /**
     * Get <p>微信客服配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatCustomerService <p>微信客服配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WechatCustomerServiceChannelConfig getWechatCustomerService() {
        return this.WechatCustomerService;
    }

    /**
     * Set <p>微信客服配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatCustomerService <p>微信客服配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatCustomerService(WechatCustomerServiceChannelConfig WechatCustomerService) {
        this.WechatCustomerService = WechatCustomerService;
    }

    /**
     * Get <p>企微应用配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WecomApp <p>企微应用配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WecomAppChannelConfig getWecomApp() {
        return this.WecomApp;
    }

    /**
     * Set <p>企微应用配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WecomApp <p>企微应用配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWecomApp(WecomAppChannelConfig WecomApp) {
        this.WecomApp = WecomApp;
    }

    /**
     * Get <p>企微机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WecomRobot <p>企微机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WecomRobotChannelConfig getWecomRobot() {
        return this.WecomRobot;
    }

    /**
     * Set <p>企微机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WecomRobot <p>企微机器人配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWecomRobot(WecomRobotChannelConfig WecomRobot) {
        this.WecomRobot = WecomRobot;
    }

    public ChannelSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelSpec(ChannelSpec source) {
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ChannelType != null) {
            this.ChannelType = new Long(source.ChannelType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DingTalk != null) {
            this.DingTalk = new DingTalkChannelConfig(source.DingTalk);
        }
        if (source.Lark != null) {
            this.Lark = new LarkChannelConfig(source.Lark);
        }
        if (source.Line != null) {
            this.Line = new LineChannelConfig(source.Line);
        }
        if (source.Scene != null) {
            this.Scene = new Long(source.Scene);
        }
        if (source.Telegram != null) {
            this.Telegram = new TelegramChannelConfig(source.Telegram);
        }
        if (source.UserAgent != null) {
            this.UserAgent = new UserAgentReference(source.UserAgent);
        }
        if (source.Wechat != null) {
            this.Wechat = new WechatChannelConfig(source.Wechat);
        }
        if (source.WechatClawBot != null) {
            this.WechatClawBot = new WechatClawBotChannelConfig(source.WechatClawBot);
        }
        if (source.WechatCustomerService != null) {
            this.WechatCustomerService = new WechatCustomerServiceChannelConfig(source.WechatCustomerService);
        }
        if (source.WecomApp != null) {
            this.WecomApp = new WecomAppChannelConfig(source.WecomApp);
        }
        if (source.WecomRobot != null) {
            this.WecomRobot = new WecomRobotChannelConfig(source.WecomRobot);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ChannelType", this.ChannelType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "DingTalk.", this.DingTalk);
        this.setParamObj(map, prefix + "Lark.", this.Lark);
        this.setParamObj(map, prefix + "Line.", this.Line);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamObj(map, prefix + "Telegram.", this.Telegram);
        this.setParamObj(map, prefix + "UserAgent.", this.UserAgent);
        this.setParamObj(map, prefix + "Wechat.", this.Wechat);
        this.setParamObj(map, prefix + "WechatClawBot.", this.WechatClawBot);
        this.setParamObj(map, prefix + "WechatCustomerService.", this.WechatCustomerService);
        this.setParamObj(map, prefix + "WecomApp.", this.WecomApp);
        this.setParamObj(map, prefix + "WecomRobot.", this.WecomRobot);

    }
}

