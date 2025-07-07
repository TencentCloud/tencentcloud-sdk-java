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

public class DashboardSubscribeData extends AbstractModel {

    /**
    * 仪表盘订阅通知方式。
    */
    @SerializedName("NoticeModes")
    @Expose
    private DashboardNoticeMode [] NoticeModes;

    /**
    * 仪表盘订阅时间，为空标识取仪表盘默认的时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DashboardTime")
    @Expose
    private String [] DashboardTime;

    /**
    * 仪表盘订阅模板变量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateVariables")
    @Expose
    private DashboardTemplateVariable [] TemplateVariables;

    /**
    * 时区。参考：https://en.wikipedia.org/wiki/List_of_tz_database_time_zones#SHANGHAI
    */
    @SerializedName("Timezone")
    @Expose
    private String Timezone;

    /**
    * 语言。 zh 中文、en`英文。
    */
    @SerializedName("SubscribeLanguage")
    @Expose
    private String SubscribeLanguage;

    /**
    * 调用链接域名。http:// 或者 https:// 开头，不能/结尾
    */
    @SerializedName("JumpDomain")
    @Expose
    private String JumpDomain;

    /**
    * 自定义跳转链接。
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
     * Get 仪表盘订阅通知方式。 
     * @return NoticeModes 仪表盘订阅通知方式。
     */
    public DashboardNoticeMode [] getNoticeModes() {
        return this.NoticeModes;
    }

    /**
     * Set 仪表盘订阅通知方式。
     * @param NoticeModes 仪表盘订阅通知方式。
     */
    public void setNoticeModes(DashboardNoticeMode [] NoticeModes) {
        this.NoticeModes = NoticeModes;
    }

    /**
     * Get 仪表盘订阅时间，为空标识取仪表盘默认的时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DashboardTime 仪表盘订阅时间，为空标识取仪表盘默认的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDashboardTime() {
        return this.DashboardTime;
    }

    /**
     * Set 仪表盘订阅时间，为空标识取仪表盘默认的时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DashboardTime 仪表盘订阅时间，为空标识取仪表盘默认的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDashboardTime(String [] DashboardTime) {
        this.DashboardTime = DashboardTime;
    }

    /**
     * Get 仪表盘订阅模板变量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateVariables 仪表盘订阅模板变量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DashboardTemplateVariable [] getTemplateVariables() {
        return this.TemplateVariables;
    }

    /**
     * Set 仪表盘订阅模板变量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateVariables 仪表盘订阅模板变量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateVariables(DashboardTemplateVariable [] TemplateVariables) {
        this.TemplateVariables = TemplateVariables;
    }

    /**
     * Get 时区。参考：https://en.wikipedia.org/wiki/List_of_tz_database_time_zones#SHANGHAI 
     * @return Timezone 时区。参考：https://en.wikipedia.org/wiki/List_of_tz_database_time_zones#SHANGHAI
     */
    public String getTimezone() {
        return this.Timezone;
    }

    /**
     * Set 时区。参考：https://en.wikipedia.org/wiki/List_of_tz_database_time_zones#SHANGHAI
     * @param Timezone 时区。参考：https://en.wikipedia.org/wiki/List_of_tz_database_time_zones#SHANGHAI
     */
    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    /**
     * Get 语言。 zh 中文、en`英文。 
     * @return SubscribeLanguage 语言。 zh 中文、en`英文。
     */
    public String getSubscribeLanguage() {
        return this.SubscribeLanguage;
    }

    /**
     * Set 语言。 zh 中文、en`英文。
     * @param SubscribeLanguage 语言。 zh 中文、en`英文。
     */
    public void setSubscribeLanguage(String SubscribeLanguage) {
        this.SubscribeLanguage = SubscribeLanguage;
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
     * Get 自定义跳转链接。 
     * @return JumpUrl 自定义跳转链接。
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 自定义跳转链接。
     * @param JumpUrl 自定义跳转链接。
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    public DashboardSubscribeData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashboardSubscribeData(DashboardSubscribeData source) {
        if (source.NoticeModes != null) {
            this.NoticeModes = new DashboardNoticeMode[source.NoticeModes.length];
            for (int i = 0; i < source.NoticeModes.length; i++) {
                this.NoticeModes[i] = new DashboardNoticeMode(source.NoticeModes[i]);
            }
        }
        if (source.DashboardTime != null) {
            this.DashboardTime = new String[source.DashboardTime.length];
            for (int i = 0; i < source.DashboardTime.length; i++) {
                this.DashboardTime[i] = new String(source.DashboardTime[i]);
            }
        }
        if (source.TemplateVariables != null) {
            this.TemplateVariables = new DashboardTemplateVariable[source.TemplateVariables.length];
            for (int i = 0; i < source.TemplateVariables.length; i++) {
                this.TemplateVariables[i] = new DashboardTemplateVariable(source.TemplateVariables[i]);
            }
        }
        if (source.Timezone != null) {
            this.Timezone = new String(source.Timezone);
        }
        if (source.SubscribeLanguage != null) {
            this.SubscribeLanguage = new String(source.SubscribeLanguage);
        }
        if (source.JumpDomain != null) {
            this.JumpDomain = new String(source.JumpDomain);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NoticeModes.", this.NoticeModes);
        this.setParamArraySimple(map, prefix + "DashboardTime.", this.DashboardTime);
        this.setParamArrayObj(map, prefix + "TemplateVariables.", this.TemplateVariables);
        this.setParamSimple(map, prefix + "Timezone", this.Timezone);
        this.setParamSimple(map, prefix + "SubscribeLanguage", this.SubscribeLanguage);
        this.setParamSimple(map, prefix + "JumpDomain", this.JumpDomain);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);

    }
}

