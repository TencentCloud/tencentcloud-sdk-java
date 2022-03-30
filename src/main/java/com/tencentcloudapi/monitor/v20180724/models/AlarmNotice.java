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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmNotice extends AbstractModel{

    /**
    * 告警通知模板 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 告警通知模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 上次修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 上次修改人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedBy")
    @Expose
    private String UpdatedBy;

    /**
    * 告警通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=全部通知
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeType")
    @Expose
    private String NoticeType;

    /**
    * 用户通知列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserNotices")
    @Expose
    private UserNotice [] UserNotices;

    /**
    * 回调通知列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("URLNotices")
    @Expose
    private URLNotice [] URLNotices;

    /**
    * 是否是系统预设通知模板 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPreset")
    @Expose
    private Long IsPreset;

    /**
    * 通知语言 zh-CN=中文 en-US=英文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeLanguage")
    @Expose
    private String NoticeLanguage;

    /**
    * 告警通知模板绑定的告警策略ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

    /**
    * 推送cls渠道
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLSNotices")
    @Expose
    private CLSNotice [] CLSNotices;

    /**
     * Get 告警通知模板 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 告警通知模板 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 告警通知模板 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 告警通知模板 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 告警通知模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 告警通知模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警通知模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 告警通知模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 上次修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 上次修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 上次修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 上次修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 上次修改人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedBy 上次修改人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedBy() {
        return this.UpdatedBy;
    }

    /**
     * Set 上次修改人
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedBy 上次修改人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedBy(String UpdatedBy) {
        this.UpdatedBy = UpdatedBy;
    }

    /**
     * Get 告警通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=全部通知
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeType 告警通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=全部通知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNoticeType() {
        return this.NoticeType;
    }

    /**
     * Set 告警通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=全部通知
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeType 告警通知类型 ALARM=未恢复通知 OK=已恢复通知 ALL=全部通知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeType(String NoticeType) {
        this.NoticeType = NoticeType;
    }

    /**
     * Get 用户通知列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserNotices 用户通知列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserNotice [] getUserNotices() {
        return this.UserNotices;
    }

    /**
     * Set 用户通知列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserNotices 用户通知列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserNotices(UserNotice [] UserNotices) {
        this.UserNotices = UserNotices;
    }

    /**
     * Get 回调通知列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return URLNotices 回调通知列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public URLNotice [] getURLNotices() {
        return this.URLNotices;
    }

    /**
     * Set 回调通知列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param URLNotices 回调通知列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setURLNotices(URLNotice [] URLNotices) {
        this.URLNotices = URLNotices;
    }

    /**
     * Get 是否是系统预设通知模板 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPreset 是否是系统预设通知模板 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsPreset() {
        return this.IsPreset;
    }

    /**
     * Set 是否是系统预设通知模板 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPreset 是否是系统预设通知模板 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPreset(Long IsPreset) {
        this.IsPreset = IsPreset;
    }

    /**
     * Get 通知语言 zh-CN=中文 en-US=英文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeLanguage 通知语言 zh-CN=中文 en-US=英文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNoticeLanguage() {
        return this.NoticeLanguage;
    }

    /**
     * Set 通知语言 zh-CN=中文 en-US=英文
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeLanguage 通知语言 zh-CN=中文 en-US=英文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeLanguage(String NoticeLanguage) {
        this.NoticeLanguage = NoticeLanguage;
    }

    /**
     * Get 告警通知模板绑定的告警策略ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyIds 告警通知模板绑定的告警策略ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set 告警通知模板绑定的告警策略ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyIds 告警通知模板绑定的告警策略ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get 推送cls渠道
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLSNotices 推送cls渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CLSNotice [] getCLSNotices() {
        return this.CLSNotices;
    }

    /**
     * Set 推送cls渠道
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLSNotices 推送cls渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLSNotices(CLSNotice [] CLSNotices) {
        this.CLSNotices = CLSNotices;
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
        if (source.CLSNotices != null) {
            this.CLSNotices = new CLSNotice[source.CLSNotices.length];
            for (int i = 0; i < source.CLSNotices.length; i++) {
                this.CLSNotices[i] = new CLSNotice(source.CLSNotices[i]);
            }
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
        this.setParamArrayObj(map, prefix + "CLSNotices.", this.CLSNotices);

    }
}

