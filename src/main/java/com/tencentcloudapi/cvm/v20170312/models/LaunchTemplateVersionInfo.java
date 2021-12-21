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

public class LaunchTemplateVersionInfo extends AbstractModel{

    /**
    * 实例启动模板版本号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaunchTemplateVersion")
    @Expose
    private Long LaunchTemplateVersion;

    /**
    * 实例启动模板版本数据详情。
    */
    @SerializedName("LaunchTemplateVersionData")
    @Expose
    private LaunchTemplateVersionData LaunchTemplateVersionData;

    /**
    * 实例启动模板版本创建时间。
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 实例启动模板ID。
    */
    @SerializedName("LaunchTemplateId")
    @Expose
    private String LaunchTemplateId;

    /**
    * 是否为默认启动模板版本。
    */
    @SerializedName("IsDefaultVersion")
    @Expose
    private Boolean IsDefaultVersion;

    /**
    * 实例启动模板版本描述信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaunchTemplateVersionDescription")
    @Expose
    private String LaunchTemplateVersionDescription;

    /**
    * 创建者。
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
     * Get 实例启动模板版本号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaunchTemplateVersion 实例启动模板版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLaunchTemplateVersion() {
        return this.LaunchTemplateVersion;
    }

    /**
     * Set 实例启动模板版本号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaunchTemplateVersion 实例启动模板版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaunchTemplateVersion(Long LaunchTemplateVersion) {
        this.LaunchTemplateVersion = LaunchTemplateVersion;
    }

    /**
     * Get 实例启动模板版本数据详情。 
     * @return LaunchTemplateVersionData 实例启动模板版本数据详情。
     */
    public LaunchTemplateVersionData getLaunchTemplateVersionData() {
        return this.LaunchTemplateVersionData;
    }

    /**
     * Set 实例启动模板版本数据详情。
     * @param LaunchTemplateVersionData 实例启动模板版本数据详情。
     */
    public void setLaunchTemplateVersionData(LaunchTemplateVersionData LaunchTemplateVersionData) {
        this.LaunchTemplateVersionData = LaunchTemplateVersionData;
    }

    /**
     * Get 实例启动模板版本创建时间。 
     * @return CreationTime 实例启动模板版本创建时间。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 实例启动模板版本创建时间。
     * @param CreationTime 实例启动模板版本创建时间。
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 实例启动模板ID。 
     * @return LaunchTemplateId 实例启动模板ID。
     */
    public String getLaunchTemplateId() {
        return this.LaunchTemplateId;
    }

    /**
     * Set 实例启动模板ID。
     * @param LaunchTemplateId 实例启动模板ID。
     */
    public void setLaunchTemplateId(String LaunchTemplateId) {
        this.LaunchTemplateId = LaunchTemplateId;
    }

    /**
     * Get 是否为默认启动模板版本。 
     * @return IsDefaultVersion 是否为默认启动模板版本。
     */
    public Boolean getIsDefaultVersion() {
        return this.IsDefaultVersion;
    }

    /**
     * Set 是否为默认启动模板版本。
     * @param IsDefaultVersion 是否为默认启动模板版本。
     */
    public void setIsDefaultVersion(Boolean IsDefaultVersion) {
        this.IsDefaultVersion = IsDefaultVersion;
    }

    /**
     * Get 实例启动模板版本描述信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaunchTemplateVersionDescription 实例启动模板版本描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLaunchTemplateVersionDescription() {
        return this.LaunchTemplateVersionDescription;
    }

    /**
     * Set 实例启动模板版本描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaunchTemplateVersionDescription 实例启动模板版本描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaunchTemplateVersionDescription(String LaunchTemplateVersionDescription) {
        this.LaunchTemplateVersionDescription = LaunchTemplateVersionDescription;
    }

    /**
     * Get 创建者。 
     * @return CreatedBy 创建者。
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set 创建者。
     * @param CreatedBy 创建者。
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public LaunchTemplateVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LaunchTemplateVersionInfo(LaunchTemplateVersionInfo source) {
        if (source.LaunchTemplateVersion != null) {
            this.LaunchTemplateVersion = new Long(source.LaunchTemplateVersion);
        }
        if (source.LaunchTemplateVersionData != null) {
            this.LaunchTemplateVersionData = new LaunchTemplateVersionData(source.LaunchTemplateVersionData);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.LaunchTemplateId != null) {
            this.LaunchTemplateId = new String(source.LaunchTemplateId);
        }
        if (source.IsDefaultVersion != null) {
            this.IsDefaultVersion = new Boolean(source.IsDefaultVersion);
        }
        if (source.LaunchTemplateVersionDescription != null) {
            this.LaunchTemplateVersionDescription = new String(source.LaunchTemplateVersionDescription);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchTemplateVersion", this.LaunchTemplateVersion);
        this.setParamObj(map, prefix + "LaunchTemplateVersionData.", this.LaunchTemplateVersionData);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LaunchTemplateId", this.LaunchTemplateId);
        this.setParamSimple(map, prefix + "IsDefaultVersion", this.IsDefaultVersion);
        this.setParamSimple(map, prefix + "LaunchTemplateVersionDescription", this.LaunchTemplateVersionDescription);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);

    }
}

