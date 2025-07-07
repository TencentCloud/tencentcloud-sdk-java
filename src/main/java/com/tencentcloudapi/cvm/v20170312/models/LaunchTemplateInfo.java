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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LaunchTemplateInfo extends AbstractModel {

    /**
    * 实例启动模版本号。
    */
    @SerializedName("LatestVersionNumber")
    @Expose
    private Long LatestVersionNumber;

    /**
    * 实例启动模板ID。
    */
    @SerializedName("LaunchTemplateId")
    @Expose
    private String LaunchTemplateId;

    /**
    * 实例启动模板名。
    */
    @SerializedName("LaunchTemplateName")
    @Expose
    private String LaunchTemplateName;

    /**
    * 实例启动模板默认版本号。
    */
    @SerializedName("DefaultVersionNumber")
    @Expose
    private Long DefaultVersionNumber;

    /**
    * 实例启动模板包含的版本总数量。
    */
    @SerializedName("LaunchTemplateVersionCount")
    @Expose
    private Long LaunchTemplateVersionCount;

    /**
    * 创建该模板的用户UIN。
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * 创建该模板的时间。
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
     * Get 实例启动模版本号。 
     * @return LatestVersionNumber 实例启动模版本号。
     */
    public Long getLatestVersionNumber() {
        return this.LatestVersionNumber;
    }

    /**
     * Set 实例启动模版本号。
     * @param LatestVersionNumber 实例启动模版本号。
     */
    public void setLatestVersionNumber(Long LatestVersionNumber) {
        this.LatestVersionNumber = LatestVersionNumber;
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
     * Get 实例启动模板名。 
     * @return LaunchTemplateName 实例启动模板名。
     */
    public String getLaunchTemplateName() {
        return this.LaunchTemplateName;
    }

    /**
     * Set 实例启动模板名。
     * @param LaunchTemplateName 实例启动模板名。
     */
    public void setLaunchTemplateName(String LaunchTemplateName) {
        this.LaunchTemplateName = LaunchTemplateName;
    }

    /**
     * Get 实例启动模板默认版本号。 
     * @return DefaultVersionNumber 实例启动模板默认版本号。
     */
    public Long getDefaultVersionNumber() {
        return this.DefaultVersionNumber;
    }

    /**
     * Set 实例启动模板默认版本号。
     * @param DefaultVersionNumber 实例启动模板默认版本号。
     */
    public void setDefaultVersionNumber(Long DefaultVersionNumber) {
        this.DefaultVersionNumber = DefaultVersionNumber;
    }

    /**
     * Get 实例启动模板包含的版本总数量。 
     * @return LaunchTemplateVersionCount 实例启动模板包含的版本总数量。
     */
    public Long getLaunchTemplateVersionCount() {
        return this.LaunchTemplateVersionCount;
    }

    /**
     * Set 实例启动模板包含的版本总数量。
     * @param LaunchTemplateVersionCount 实例启动模板包含的版本总数量。
     */
    public void setLaunchTemplateVersionCount(Long LaunchTemplateVersionCount) {
        this.LaunchTemplateVersionCount = LaunchTemplateVersionCount;
    }

    /**
     * Get 创建该模板的用户UIN。 
     * @return CreatedBy 创建该模板的用户UIN。
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set 创建该模板的用户UIN。
     * @param CreatedBy 创建该模板的用户UIN。
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get 创建该模板的时间。 
     * @return CreationTime 创建该模板的时间。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建该模板的时间。
     * @param CreationTime 创建该模板的时间。
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

