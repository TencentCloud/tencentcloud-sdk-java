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

public class CreateAlarmNoticeRequest extends AbstractModel {

    /**
    * <p>模块名，这里填“monitor”</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>通知模板名称 60字符以内</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=都通知</p>
    */
    @SerializedName("NoticeType")
    @Expose
    private String NoticeType;

    /**
    * <p>通知语言 zh-CN=中文 en-US=英文</p>
    */
    @SerializedName("NoticeLanguage")
    @Expose
    private String NoticeLanguage;

    /**
    * <p>用户通知 最多5个</p>
    */
    @SerializedName("UserNotices")
    @Expose
    private UserNotice [] UserNotices;

    /**
    * <p>回调通知 最多6个</p>
    */
    @SerializedName("URLNotices")
    @Expose
    private URLNotice [] URLNotices;

    /**
    * <p>推送CLS日志服务的操作 最多1个</p>
    */
    @SerializedName("CLSNotices")
    @Expose
    private CLSNotice [] CLSNotices;

    /**
    * <p>模板绑定的标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>是否免登录，0-否，1-是</p>
    */
    @SerializedName("IsLoginFree")
    @Expose
    private Long IsLoginFree;

    /**
    * <p>IANA 时区名</p>
    */
    @SerializedName("TimeZoneName")
    @Expose
    private String TimeZoneName;

    /**
     * Get <p>模块名，这里填“monitor”</p> 
     * @return Module <p>模块名，这里填“monitor”</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>模块名，这里填“monitor”</p>
     * @param Module <p>模块名，这里填“monitor”</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>通知模板名称 60字符以内</p> 
     * @return Name <p>通知模板名称 60字符以内</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>通知模板名称 60字符以内</p>
     * @param Name <p>通知模板名称 60字符以内</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=都通知</p> 
     * @return NoticeType <p>通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=都通知</p>
     */
    public String getNoticeType() {
        return this.NoticeType;
    }

    /**
     * Set <p>通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=都通知</p>
     * @param NoticeType <p>通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=都通知</p>
     */
    public void setNoticeType(String NoticeType) {
        this.NoticeType = NoticeType;
    }

    /**
     * Get <p>通知语言 zh-CN=中文 en-US=英文</p> 
     * @return NoticeLanguage <p>通知语言 zh-CN=中文 en-US=英文</p>
     */
    public String getNoticeLanguage() {
        return this.NoticeLanguage;
    }

    /**
     * Set <p>通知语言 zh-CN=中文 en-US=英文</p>
     * @param NoticeLanguage <p>通知语言 zh-CN=中文 en-US=英文</p>
     */
    public void setNoticeLanguage(String NoticeLanguage) {
        this.NoticeLanguage = NoticeLanguage;
    }

    /**
     * Get <p>用户通知 最多5个</p> 
     * @return UserNotices <p>用户通知 最多5个</p>
     */
    public UserNotice [] getUserNotices() {
        return this.UserNotices;
    }

    /**
     * Set <p>用户通知 最多5个</p>
     * @param UserNotices <p>用户通知 最多5个</p>
     */
    public void setUserNotices(UserNotice [] UserNotices) {
        this.UserNotices = UserNotices;
    }

    /**
     * Get <p>回调通知 最多6个</p> 
     * @return URLNotices <p>回调通知 最多6个</p>
     */
    public URLNotice [] getURLNotices() {
        return this.URLNotices;
    }

    /**
     * Set <p>回调通知 最多6个</p>
     * @param URLNotices <p>回调通知 最多6个</p>
     */
    public void setURLNotices(URLNotice [] URLNotices) {
        this.URLNotices = URLNotices;
    }

    /**
     * Get <p>推送CLS日志服务的操作 最多1个</p> 
     * @return CLSNotices <p>推送CLS日志服务的操作 最多1个</p>
     */
    public CLSNotice [] getCLSNotices() {
        return this.CLSNotices;
    }

    /**
     * Set <p>推送CLS日志服务的操作 最多1个</p>
     * @param CLSNotices <p>推送CLS日志服务的操作 最多1个</p>
     */
    public void setCLSNotices(CLSNotice [] CLSNotices) {
        this.CLSNotices = CLSNotices;
    }

    /**
     * Get <p>模板绑定的标签</p> 
     * @return Tags <p>模板绑定的标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>模板绑定的标签</p>
     * @param Tags <p>模板绑定的标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否免登录，0-否，1-是</p> 
     * @return IsLoginFree <p>是否免登录，0-否，1-是</p>
     */
    public Long getIsLoginFree() {
        return this.IsLoginFree;
    }

    /**
     * Set <p>是否免登录，0-否，1-是</p>
     * @param IsLoginFree <p>是否免登录，0-否，1-是</p>
     */
    public void setIsLoginFree(Long IsLoginFree) {
        this.IsLoginFree = IsLoginFree;
    }

    /**
     * Get <p>IANA 时区名</p> 
     * @return TimeZoneName <p>IANA 时区名</p>
     */
    public String getTimeZoneName() {
        return this.TimeZoneName;
    }

    /**
     * Set <p>IANA 时区名</p>
     * @param TimeZoneName <p>IANA 时区名</p>
     */
    public void setTimeZoneName(String TimeZoneName) {
        this.TimeZoneName = TimeZoneName;
    }

    public CreateAlarmNoticeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmNoticeRequest(CreateAlarmNoticeRequest source) {
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.IsLoginFree != null) {
            this.IsLoginFree = new Long(source.IsLoginFree);
        }
        if (source.TimeZoneName != null) {
            this.TimeZoneName = new String(source.TimeZoneName);
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
        this.setParamArrayObj(map, prefix + "UserNotices.", this.UserNotices);
        this.setParamArrayObj(map, prefix + "URLNotices.", this.URLNotices);
        this.setParamArrayObj(map, prefix + "CLSNotices.", this.CLSNotices);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IsLoginFree", this.IsLoginFree);
        this.setParamSimple(map, prefix + "TimeZoneName", this.TimeZoneName);

    }
}

