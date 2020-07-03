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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActivityInfo extends AbstractModel{

    /**
    * 活动使用模板id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 活动标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityTitle")
    @Expose
    private String ActivityTitle;

    /**
    * 活动描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityDesc")
    @Expose
    private String ActivityDesc;

    /**
    * 活动封面地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityCover")
    @Expose
    private String ActivityCover;

    /**
    * 活动类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * 活动id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * 活动模板自定义配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PersonalConfig")
    @Expose
    private String PersonalConfig;

    /**
     * Get 活动使用模板id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 活动使用模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 活动使用模板id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 活动使用模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 活动标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityTitle 活动标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivityTitle() {
        return this.ActivityTitle;
    }

    /**
     * Set 活动标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityTitle 活动标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityTitle(String ActivityTitle) {
        this.ActivityTitle = ActivityTitle;
    }

    /**
     * Get 活动描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityDesc 活动描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivityDesc() {
        return this.ActivityDesc;
    }

    /**
     * Set 活动描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityDesc 活动描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityDesc(String ActivityDesc) {
        this.ActivityDesc = ActivityDesc;
    }

    /**
     * Get 活动封面地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityCover 活动封面地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivityCover() {
        return this.ActivityCover;
    }

    /**
     * Set 活动封面地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityCover 活动封面地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityCover(String ActivityCover) {
        this.ActivityCover = ActivityCover;
    }

    /**
     * Get 活动类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityType 活动类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set 活动类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityType 活动类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get 活动id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityId 活动id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityId 活动id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 活动模板自定义配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PersonalConfig 活动模板自定义配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPersonalConfig() {
        return this.PersonalConfig;
    }

    /**
     * Set 活动模板自定义配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PersonalConfig 活动模板自定义配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonalConfig(String PersonalConfig) {
        this.PersonalConfig = PersonalConfig;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "ActivityTitle", this.ActivityTitle);
        this.setParamSimple(map, prefix + "ActivityDesc", this.ActivityDesc);
        this.setParamSimple(map, prefix + "ActivityCover", this.ActivityCover);
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "PersonalConfig", this.PersonalConfig);

    }
}

