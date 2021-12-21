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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LaunchTemplateInfo extends AbstractModel{

    /**
    * 实例启动模版本号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestVersionNumber")
    @Expose
    private Long LatestVersionNumber;

    /**
    * 实例启动模板ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaunchTemplateId")
    @Expose
    private String LaunchTemplateId;

    /**
    * 实例启动模板名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaunchTemplateName")
    @Expose
    private String LaunchTemplateName;

    /**
    * 实例启动模板默认版本号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultVersionNumber")
    @Expose
    private Long DefaultVersionNumber;

    /**
    * 实例启动模板包含的版本总数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaunchTemplateVersionCount")
    @Expose
    private Long LaunchTemplateVersionCount;

    /**
    * 创建该模板的用户UIN。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * 创建该模板的时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
     * Get 实例启动模版本号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestVersionNumber 实例启动模版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLatestVersionNumber() {
        return this.LatestVersionNumber;
    }

    /**
     * Set 实例启动模版本号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestVersionNumber 实例启动模版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestVersionNumber(Long LatestVersionNumber) {
        this.LatestVersionNumber = LatestVersionNumber;
    }

    /**
     * Get 实例启动模板ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaunchTemplateId 实例启动模板ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLaunchTemplateId() {
        return this.LaunchTemplateId;
    }

    /**
     * Set 实例启动模板ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaunchTemplateId 实例启动模板ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaunchTemplateId(String LaunchTemplateId) {
        this.LaunchTemplateId = LaunchTemplateId;
    }

    /**
     * Get 实例启动模板名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaunchTemplateName 实例启动模板名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLaunchTemplateName() {
        return this.LaunchTemplateName;
    }

    /**
     * Set 实例启动模板名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaunchTemplateName 实例启动模板名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaunchTemplateName(String LaunchTemplateName) {
        this.LaunchTemplateName = LaunchTemplateName;
    }

    /**
     * Get 实例启动模板默认版本号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultVersionNumber 实例启动模板默认版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultVersionNumber() {
        return this.DefaultVersionNumber;
    }

    /**
     * Set 实例启动模板默认版本号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultVersionNumber 实例启动模板默认版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultVersionNumber(Long DefaultVersionNumber) {
        this.DefaultVersionNumber = DefaultVersionNumber;
    }

    /**
     * Get 实例启动模板包含的版本总数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaunchTemplateVersionCount 实例启动模板包含的版本总数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLaunchTemplateVersionCount() {
        return this.LaunchTemplateVersionCount;
    }

    /**
     * Set 实例启动模板包含的版本总数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaunchTemplateVersionCount 实例启动模板包含的版本总数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaunchTemplateVersionCount(Long LaunchTemplateVersionCount) {
        this.LaunchTemplateVersionCount = LaunchTemplateVersionCount;
    }

    /**
     * Get 创建该模板的用户UIN。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedBy 创建该模板的用户UIN。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set 创建该模板的用户UIN。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedBy 创建该模板的用户UIN。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get 创建该模板的时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTime 创建该模板的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建该模板的时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTime 创建该模板的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    public LaunchTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LaunchTemplateInfo(LaunchTemplateInfo source) {
        if (source.LatestVersionNumber != null) {
            this.LatestVersionNumber = new Long(source.LatestVersionNumber);
        }
        if (source.LaunchTemplateId != null) {
            this.LaunchTemplateId = new String(source.LaunchTemplateId);
        }
        if (source.LaunchTemplateName != null) {
            this.LaunchTemplateName = new String(source.LaunchTemplateName);
        }
        if (source.DefaultVersionNumber != null) {
            this.DefaultVersionNumber = new Long(source.DefaultVersionNumber);
        }
        if (source.LaunchTemplateVersionCount != null) {
            this.LaunchTemplateVersionCount = new Long(source.LaunchTemplateVersionCount);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LatestVersionNumber", this.LatestVersionNumber);
        this.setParamSimple(map, prefix + "LaunchTemplateId", this.LaunchTemplateId);
        this.setParamSimple(map, prefix + "LaunchTemplateName", this.LaunchTemplateName);
        this.setParamSimple(map, prefix + "DefaultVersionNumber", this.DefaultVersionNumber);
        this.setParamSimple(map, prefix + "LaunchTemplateVersionCount", this.LaunchTemplateVersionCount);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);

    }
}

