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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotRecord extends AbstractModel{

    /**
    * 动作，取值为以为3个类型中的一个："intercept","permit","monitor"，分别表示： 拦截， 放行，监控
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 会话总次数
    */
    @SerializedName("Nums")
    @Expose
    private Long Nums;

    /**
    * BotType=UB时，表示预测标签，取值如下：
                "crawler_unregular",
                "crawler_regular",
                "request_repeat",
                "credential_miss_user",
                "credential_without_user",
                "credential_only_action",
                "credential_user_password",
                "credential_cracking",
                "credential_stuffing",
                "brush_sms",
                "brush_captcha",
                "reg_malicious"
BotType=TCB时，表示Bot分类，取值如下：
                "Uncategorised",
                "Search engine bot",
                "Site monitor",
                "Screenshot creator",
                "Link checker",
                "Web scraper",
                "Vulnerability scanner",
                "Virus scanner",
                "Speed tester",
                "Feed Fetcher",
                "Tool",
                "Marketing"
BotType=UCB时，为二期接口，暂时未定义内容
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 会话持续时间
    */
    @SerializedName("SessionDuration")
    @Expose
    private Float SessionDuration;

    /**
    * 访问源IP
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 异常特征
    */
    @SerializedName("BotFeature")
    @Expose
    private String [] BotFeature;

    /**
    * 最新检测时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * BOT得分
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 平均速率
    */
    @SerializedName("AvgSpeed")
    @Expose
    private Float AvgSpeed;

    /**
    * BotType=TCB，表示TCB名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcbDetail")
    @Expose
    private String TcbDetail;

    /**
    * BOT记录唯一ID，用于查询访问详情
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 动作，取值为以为3个类型中的一个："intercept","permit","monitor"，分别表示： 拦截， 放行，监控 
     * @return Action 动作，取值为以为3个类型中的一个："intercept","permit","monitor"，分别表示： 拦截， 放行，监控
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作，取值为以为3个类型中的一个："intercept","permit","monitor"，分别表示： 拦截， 放行，监控
     * @param Action 动作，取值为以为3个类型中的一个："intercept","permit","monitor"，分别表示： 拦截， 放行，监控
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 会话总次数 
     * @return Nums 会话总次数
     */
    public Long getNums() {
        return this.Nums;
    }

    /**
     * Set 会话总次数
     * @param Nums 会话总次数
     */
    public void setNums(Long Nums) {
        this.Nums = Nums;
    }

    /**
     * Get BotType=UB时，表示预测标签，取值如下：
                "crawler_unregular",
                "crawler_regular",
                "request_repeat",
                "credential_miss_user",
                "credential_without_user",
                "credential_only_action",
                "credential_user_password",
                "credential_cracking",
                "credential_stuffing",
                "brush_sms",
                "brush_captcha",
                "reg_malicious"
BotType=TCB时，表示Bot分类，取值如下：
                "Uncategorised",
                "Search engine bot",
                "Site monitor",
                "Screenshot creator",
                "Link checker",
                "Web scraper",
                "Vulnerability scanner",
                "Virus scanner",
                "Speed tester",
                "Feed Fetcher",
                "Tool",
                "Marketing"
BotType=UCB时，为二期接口，暂时未定义内容 
     * @return RuleName BotType=UB时，表示预测标签，取值如下：
                "crawler_unregular",
                "crawler_regular",
                "request_repeat",
                "credential_miss_user",
                "credential_without_user",
                "credential_only_action",
                "credential_user_password",
                "credential_cracking",
                "credential_stuffing",
                "brush_sms",
                "brush_captcha",
                "reg_malicious"
BotType=TCB时，表示Bot分类，取值如下：
                "Uncategorised",
                "Search engine bot",
                "Site monitor",
                "Screenshot creator",
                "Link checker",
                "Web scraper",
                "Vulnerability scanner",
                "Virus scanner",
                "Speed tester",
                "Feed Fetcher",
                "Tool",
                "Marketing"
BotType=UCB时，为二期接口，暂时未定义内容
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set BotType=UB时，表示预测标签，取值如下：
                "crawler_unregular",
                "crawler_regular",
                "request_repeat",
                "credential_miss_user",
                "credential_without_user",
                "credential_only_action",
                "credential_user_password",
                "credential_cracking",
                "credential_stuffing",
                "brush_sms",
                "brush_captcha",
                "reg_malicious"
BotType=TCB时，表示Bot分类，取值如下：
                "Uncategorised",
                "Search engine bot",
                "Site monitor",
                "Screenshot creator",
                "Link checker",
                "Web scraper",
                "Vulnerability scanner",
                "Virus scanner",
                "Speed tester",
                "Feed Fetcher",
                "Tool",
                "Marketing"
BotType=UCB时，为二期接口，暂时未定义内容
     * @param RuleName BotType=UB时，表示预测标签，取值如下：
                "crawler_unregular",
                "crawler_regular",
                "request_repeat",
                "credential_miss_user",
                "credential_without_user",
                "credential_only_action",
                "credential_user_password",
                "credential_cracking",
                "credential_stuffing",
                "brush_sms",
                "brush_captcha",
                "reg_malicious"
BotType=TCB时，表示Bot分类，取值如下：
                "Uncategorised",
                "Search engine bot",
                "Site monitor",
                "Screenshot creator",
                "Link checker",
                "Web scraper",
                "Vulnerability scanner",
                "Virus scanner",
                "Speed tester",
                "Feed Fetcher",
                "Tool",
                "Marketing"
BotType=UCB时，为二期接口，暂时未定义内容
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 会话持续时间 
     * @return SessionDuration 会话持续时间
     */
    public Float getSessionDuration() {
        return this.SessionDuration;
    }

    /**
     * Set 会话持续时间
     * @param SessionDuration 会话持续时间
     */
    public void setSessionDuration(Float SessionDuration) {
        this.SessionDuration = SessionDuration;
    }

    /**
     * Get 访问源IP 
     * @return SrcIp 访问源IP
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 访问源IP
     * @param SrcIp 访问源IP
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 异常特征 
     * @return BotFeature 异常特征
     */
    public String [] getBotFeature() {
        return this.BotFeature;
    }

    /**
     * Set 异常特征
     * @param BotFeature 异常特征
     */
    public void setBotFeature(String [] BotFeature) {
        this.BotFeature = BotFeature;
    }

    /**
     * Get 最新检测时间 
     * @return Time 最新检测时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 最新检测时间
     * @param Time 最新检测时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get BOT得分 
     * @return Score BOT得分
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set BOT得分
     * @param Score BOT得分
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 平均速率 
     * @return AvgSpeed 平均速率
     */
    public Float getAvgSpeed() {
        return this.AvgSpeed;
    }

    /**
     * Set 平均速率
     * @param AvgSpeed 平均速率
     */
    public void setAvgSpeed(Float AvgSpeed) {
        this.AvgSpeed = AvgSpeed;
    }

    /**
     * Get BotType=TCB，表示TCB名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcbDetail BotType=TCB，表示TCB名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTcbDetail() {
        return this.TcbDetail;
    }

    /**
     * Set BotType=TCB，表示TCB名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcbDetail BotType=TCB，表示TCB名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcbDetail(String TcbDetail) {
        this.TcbDetail = TcbDetail;
    }

    /**
     * Get BOT记录唯一ID，用于查询访问详情 
     * @return Id BOT记录唯一ID，用于查询访问详情
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set BOT记录唯一ID，用于查询访问详情
     * @param Id BOT记录唯一ID，用于查询访问详情
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public BotRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotRecord(BotRecord source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Nums != null) {
            this.Nums = new Long(source.Nums);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.SessionDuration != null) {
            this.SessionDuration = new Float(source.SessionDuration);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.BotFeature != null) {
            this.BotFeature = new String[source.BotFeature.length];
            for (int i = 0; i < source.BotFeature.length; i++) {
                this.BotFeature[i] = new String(source.BotFeature[i]);
            }
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.AvgSpeed != null) {
            this.AvgSpeed = new Float(source.AvgSpeed);
        }
        if (source.TcbDetail != null) {
            this.TcbDetail = new String(source.TcbDetail);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Nums", this.Nums);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "SessionDuration", this.SessionDuration);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamArraySimple(map, prefix + "BotFeature.", this.BotFeature);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "AvgSpeed", this.AvgSpeed);
        this.setParamSimple(map, prefix + "TcbDetail", this.TcbDetail);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

