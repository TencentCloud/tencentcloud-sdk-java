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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmNoticeRequest extends AbstractModel {

    /**
    * 模块名，这里填“monitor”
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 告警通知规则名称 60字符以内
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=都通知
    */
    @SerializedName("NoticeType")
    @Expose
    private String NoticeType;

    /**
    * 通知语言 zh-CN=中文 en-US=英文
    */
    @SerializedName("NoticeLanguage")
    @Expose
    private String NoticeLanguage;

    /**
    * 告警通知模板 ID
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * 用户通知 最多5个
    */
    @SerializedName("UserNotices")
    @Expose
    private UserNotice [] UserNotices;

    /**
    * 回调通知 最多6个
    */
    @SerializedName("URLNotices")
    @Expose
    private URLNotice [] URLNotices;

    /**
    * 告警通知推送到CLS服务 最多1个
    */
    @SerializedName("CLSNotices")
    @Expose
    private CLSNotice [] CLSNotices;

    /**
    * 告警通知模板绑定的告警策略ID列表
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

    /**
     * Get 模块名，这里填“monitor” 
     * @return Module 模块名，这里填“monitor”
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，这里填“monitor”
     * @param Module 模块名，这里填“monitor”
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 告警通知规则名称 60字符以内 
     * @return Name 告警通知规则名称 60字符以内
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警通知规则名称 60字符以内
     * @param Name 告警通知规则名称 60字符以内
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=都通知 
     * @return NoticeType 通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=都通知
     */
    public String getNoticeType() {
        return this.NoticeType;
    }

    /**
     * Set 通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=都通知
     * @param NoticeType 通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=都通知
     */
    public void setNoticeType(String NoticeType) {
        this.NoticeType = NoticeType;
    }

    /**
     * Get 通知语言 zh-CN=中文 en-US=英文 
     * @return NoticeLanguage 通知语言 zh-CN=中文 en-US=英文
     */
    public String getNoticeLanguage() {
        return this.NoticeLanguage;
    }

    /**
     * Set 通知语言 zh-CN=中文 en-US=英文
     * @param NoticeLanguage 通知语言 zh-CN=中文 en-US=英文
     */
    public void setNoticeLanguage(String NoticeLanguage) {
        this.NoticeLanguage = NoticeLanguage;
    }

    /**
     * Get 告警通知模板 ID 
     * @return NoticeId 告警通知模板 ID
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set 告警通知模板 ID
     * @param NoticeId 告警通知模板 ID
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get 用户通知 最多5个 
     * @return UserNotices 用户通知 最多5个
     */
    public UserNotice [] getUserNotices() {
        return this.UserNotices;
    }

    /**
     * Set 用户通知 最多5个
     * @param UserNotices 用户通知 最多5个
     */
    public void setUserNotices(UserNotice [] UserNotices) {
        this.UserNotices = UserNotices;
    }

    /**
     * Get 回调通知 最多6个 
     * @return URLNotices 回调通知 最多6个
     */
    public URLNotice [] getURLNotices() {
        return this.URLNotices;
    }

    /**
     * Set 回调通知 最多6个
     * @param URLNotices 回调通知 最多6个
     */
    public void setURLNotices(URLNotice [] URLNotices) {
        this.URLNotices = URLNotices;
    }

    /**
     * Get 告警通知推送到CLS服务 最多1个 
     * @return CLSNotices 告警通知推送到CLS服务 最多1个
     */
    public CLSNotice [] getCLSNotices() {
        return this.CLSNotices;
    }

    /**
     * Set 告警通知推送到CLS服务 最多1个
     * @param CLSNotices 告警通知推送到CLS服务 最多1个
     */
    public void setCLSNotices(CLSNotice [] CLSNotices) {
        this.CLSNotices = CLSNotices;
    }

    /**
     * Get 告警通知模板绑定的告警策略ID列表 
     * @return PolicyIds 告警通知模板绑定的告警策略ID列表
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set 告警通知模板绑定的告警策略ID列表
     * @param PolicyIds 告警通知模板绑定的告警策略ID列表
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    public ModifyAlarmNoticeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmNoticeRequest(ModifyAlarmNoticeRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NoticeType != null) {
            this.NoticeType = new String(source.NoticeType);
        }
        if (source.NoticeLanguage != null) {
            this.NoticeLanguage = new String(source.NoticeLanguage);
        }
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.UserNotices != null) {
            this.UserNotices = new UserNotice[source.UserNotices.length];
            for (int i = 0; i < source.UserNotices.length; i++) {
                this.UserNotices[i] = new UserNotice(source.UserNotices[i]);
            }
        }
        if (source.URLNotices != null) {
            this.URLNotices = new URLNotice[source.URLNotices.length];
            for (int i = 0; i < source.URLNotices.length; i++) {
                this.URLNotices[i] = new URLNotice(source.URLNotices[i]);
            }
        }
        if (source.CLSNotices != null) {
            this.CLSNotices = new CLSNotice[source.CLSNotices.length];
            for (int i = 0; i < source.CLSNotices.length; i++) {
                this.CLSNotices[i] = new CLSNotice(source.CLSNotices[i]);
            }
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new String[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new String(source.PolicyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NoticeType", this.NoticeType);
        this.setParamSimple(map, prefix + "NoticeLanguage", this.NoticeLanguage);
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamArrayObj(map, prefix + "UserNotices.", this.UserNotices);
        this.setParamArrayObj(map, prefix + "URLNotices.", this.URLNotices);
        this.setParamArrayObj(map, prefix + "CLSNotices.", this.CLSNotices);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);

    }
}

