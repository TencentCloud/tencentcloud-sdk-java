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

public class AlarmNotice extends AbstractModel {

    /**
    * <p>告警通知模板 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>告警通知模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>上次修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>上次修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedBy")
    @Expose
    private String UpdatedBy;

    /**
    * <p>告警通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=全部通知</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeType")
    @Expose
    private String NoticeType;

    /**
    * <p>用户通知列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserNotices")
    @Expose
    private UserNotice [] UserNotices;

    /**
    * <p>回调通知列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("URLNotices")
    @Expose
    private URLNotice [] URLNotices;

    /**
    * <p>是否是系统预设通知模板 0=否 1=是</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPreset")
    @Expose
    private Long IsPreset;

    /**
    * <p>通知语言 zh-CN=中文 en-US=英文</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeLanguage")
    @Expose
    private String NoticeLanguage;

    /**
    * <p>告警通知模板绑定的告警策略ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

    /**
    * <p>后台 amp consumer id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AMPConsumerId")
    @Expose
    private String AMPConsumerId;

    /**
    * <p>推送cls渠道</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLSNotices")
    @Expose
    private CLSNotice [] CLSNotices;

    /**
    * <p>通知模板绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get <p>告警通知模板 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>告警通知模板 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>告警通知模板 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>告警通知模板 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>告警通知模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>告警通知模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>告警通知模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>告警通知模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>上次修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt <p>上次修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>上次修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt <p>上次修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>上次修改人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedBy <p>上次修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedBy() {
        return this.UpdatedBy;
    }

    /**
     * Set <p>上次修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedBy <p>上次修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedBy(String UpdatedBy) {
        this.UpdatedBy = UpdatedBy;
    }

    /**
     * Get <p>告警通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=全部通知</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeType <p>告警通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=全部通知</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNoticeType() {
        return this.NoticeType;
    }

    /**
     * Set <p>告警通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=全部通知</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeType <p>告警通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=全部通知</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeType(String NoticeType) {
        this.NoticeType = NoticeType;
    }

    /**
     * Get <p>用户通知列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserNotices <p>用户通知列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserNotice [] getUserNotices() {
        return this.UserNotices;
    }

    /**
     * Set <p>用户通知列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserNotices <p>用户通知列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserNotices(UserNotice [] UserNotices) {
        this.UserNotices = UserNotices;
    }

    /**
     * Get <p>回调通知列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return URLNotices <p>回调通知列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public URLNotice [] getURLNotices() {
        return this.URLNotices;
    }

    /**
     * Set <p>回调通知列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param URLNotices <p>回调通知列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setURLNotices(URLNotice [] URLNotices) {
        this.URLNotices = URLNotices;
    }

    /**
     * Get <p>是否是系统预设通知模板 0=否 1=是</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPreset <p>是否是系统预设通知模板 0=否 1=是</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsPreset() {
        return this.IsPreset;
    }

    /**
     * Set <p>是否是系统预设通知模板 0=否 1=是</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPreset <p>是否是系统预设通知模板 0=否 1=是</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPreset(Long IsPreset) {
        this.IsPreset = IsPreset;
    }

    /**
     * Get <p>通知语言 zh-CN=中文 en-US=英文</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeLanguage <p>通知语言 zh-CN=中文 en-US=英文</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNoticeLanguage() {
        return this.NoticeLanguage;
    }

    /**
     * Set <p>通知语言 zh-CN=中文 en-US=英文</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeLanguage <p>通知语言 zh-CN=中文 en-US=英文</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeLanguage(String NoticeLanguage) {
        this.NoticeLanguage = NoticeLanguage;
    }

    /**
     * Get <p>告警通知模板绑定的告警策略ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyIds <p>告警通知模板绑定的告警策略ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set <p>告警通知模板绑定的告警策略ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyIds <p>告警通知模板绑定的告警策略ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get <p>后台 amp consumer id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AMPConsumerId <p>后台 amp consumer id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAMPConsumerId() {
        return this.AMPConsumerId;
    }

    /**
     * Set <p>后台 amp consumer id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AMPConsumerId <p>后台 amp consumer id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAMPConsumerId(String AMPConsumerId) {
        this.AMPConsumerId = AMPConsumerId;
    }

    /**
     * Get <p>推送cls渠道</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLSNotices <p>推送cls渠道</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CLSNotice [] getCLSNotices() {
        return this.CLSNotices;
    }

    /**
     * Set <p>推送cls渠道</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLSNotices <p>推送cls渠道</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLSNotices(CLSNotice [] CLSNotices) {
        this.CLSNotices = CLSNotices;
    }

    /**
     * Get <p>通知模板绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>通知模板绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>通知模板绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>通知模板绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
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

    public AlarmNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmNotice(AlarmNotice source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.UpdatedBy != null) {
            this.UpdatedBy = new String(source.UpdatedBy);
        }
        if (source.NoticeType != null) {
            this.NoticeType = new String(source.NoticeType);
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
        if (source.IsPreset != null) {
            this.IsPreset = new Long(source.IsPreset);
        }
        if (source.NoticeLanguage != null) {
            this.NoticeLanguage = new String(source.NoticeLanguage);
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new String[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new String(source.PolicyIds[i]);
            }
        }
        if (source.AMPConsumerId != null) {
            this.AMPConsumerId = new String(source.AMPConsumerId);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "UpdatedBy", this.UpdatedBy);
        this.setParamSimple(map, prefix + "NoticeType", this.NoticeType);
        this.setParamArrayObj(map, prefix + "UserNotices.", this.UserNotices);
        this.setParamArrayObj(map, prefix + "URLNotices.", this.URLNotices);
        this.setParamSimple(map, prefix + "IsPreset", this.IsPreset);
        this.setParamSimple(map, prefix + "NoticeLanguage", this.NoticeLanguage);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamSimple(map, prefix + "AMPConsumerId", this.AMPConsumerId);
        this.setParamArrayObj(map, prefix + "CLSNotices.", this.CLSNotices);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IsLoginFree", this.IsLoginFree);
        this.setParamSimple(map, prefix + "TimeZoneName", this.TimeZoneName);

    }
}

