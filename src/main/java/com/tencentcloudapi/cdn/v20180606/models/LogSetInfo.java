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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogSetInfo extends AbstractModel {

    /**
    * 开发者ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 渠道
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 日志集名字
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * 是否默认日志集
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * 日志保存时间，单位为天
    */
    @SerializedName("LogsetSavePeriod")
    @Expose
    private Long LogsetSavePeriod;

    /**
    * 创建日期
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * cls侧是否已经被删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deleted")
    @Expose
    private String Deleted;

    /**
    * 英文区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionEn")
    @Expose
    private String RegionEn;

    /**
     * Get 开发者ID 
     * @return AppId 开发者ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 开发者ID
     * @param AppId 开发者ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 渠道
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Channel 渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 渠道
注意：此字段可能返回 null，表示取不到有效值。
     * @param Channel 渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 日志集ID 
     * @return LogsetId 日志集ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集ID
     * @param LogsetId 日志集ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 日志集名字 
     * @return LogsetName 日志集名字
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set 日志集名字
     * @param LogsetName 日志集名字
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get 是否默认日志集 
     * @return IsDefault 是否默认日志集
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否默认日志集
     * @param IsDefault 是否默认日志集
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 日志保存时间，单位为天 
     * @return LogsetSavePeriod 日志保存时间，单位为天
     */
    public Long getLogsetSavePeriod() {
        return this.LogsetSavePeriod;
    }

    /**
     * Set 日志保存时间，单位为天
     * @param LogsetSavePeriod 日志保存时间，单位为天
     */
    public void setLogsetSavePeriod(Long LogsetSavePeriod) {
        this.LogsetSavePeriod = LogsetSavePeriod;
    }

    /**
     * Get 创建日期 
     * @return CreateTime 创建日期
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建日期
     * @param CreateTime 创建日期
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get cls侧是否已经被删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deleted cls侧是否已经被删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeleted() {
        return this.Deleted;
    }

    /**
     * Set cls侧是否已经被删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deleted cls侧是否已经被删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleted(String Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get 英文区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionEn 英文区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionEn() {
        return this.RegionEn;
    }

    /**
     * Set 英文区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionEn 英文区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionEn(String RegionEn) {
        this.RegionEn = RegionEn;
    }

    public LogSetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogSetInfo(LogSetInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.LogsetSavePeriod != null) {
            this.LogsetSavePeriod = new Long(source.LogsetSavePeriod);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Deleted != null) {
            this.Deleted = new String(source.Deleted);
        }
        if (source.RegionEn != null) {
            this.RegionEn = new String(source.RegionEn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "LogsetSavePeriod", this.LogsetSavePeriod);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "RegionEn", this.RegionEn);

    }
}

