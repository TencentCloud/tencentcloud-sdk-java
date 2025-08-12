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

public class ConsoleSharingInfo extends AbstractModel {

    /**
    * 分享ID
    */
    @SerializedName("SharingId")
    @Expose
    private String SharingId;

    /**
    * 分享链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SharingUrl")
    @Expose
    private String SharingUrl;

    /**
    * 匿名分享配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SharingConfig")
    @Expose
    private ConsoleSharingConfig SharingConfig;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 分享链接状态
1: 正常 
-1: 因内容安全审查异常导致被封禁(存在于使用公网域名分享时)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 10001-广告 20001-政治 20002-色情 20004-社会事件 20011-暴力 20012-低俗 20006-违法犯罪 20007-谩骂 20008-欺诈 20013-版权 20104-谣言 21000-其他, 10086-聚合, 24001-暴恐（天御独有恶意类型），20472-违法，
24005-社会
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentSafetyCode")
    @Expose
    private Long ContentSafetyCode;

    /**
     * Get 分享ID 
     * @return SharingId 分享ID
     */
    public String getSharingId() {
        return this.SharingId;
    }

    /**
     * Set 分享ID
     * @param SharingId 分享ID
     */
    public void setSharingId(String SharingId) {
        this.SharingId = SharingId;
    }

    /**
     * Get 分享链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SharingUrl 分享链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSharingUrl() {
        return this.SharingUrl;
    }

    /**
     * Set 分享链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param SharingUrl 分享链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSharingUrl(String SharingUrl) {
        this.SharingUrl = SharingUrl;
    }

    /**
     * Get 匿名分享配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SharingConfig 匿名分享配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsoleSharingConfig getSharingConfig() {
        return this.SharingConfig;
    }

    /**
     * Set 匿名分享配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SharingConfig 匿名分享配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSharingConfig(ConsoleSharingConfig SharingConfig) {
        this.SharingConfig = SharingConfig;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 分享链接状态
1: 正常 
-1: 因内容安全审查异常导致被封禁(存在于使用公网域名分享时)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 分享链接状态
1: 正常 
-1: 因内容安全审查异常导致被封禁(存在于使用公网域名分享时)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 分享链接状态
1: 正常 
-1: 因内容安全审查异常导致被封禁(存在于使用公网域名分享时)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 分享链接状态
1: 正常 
-1: 因内容安全审查异常导致被封禁(存在于使用公网域名分享时)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 10001-广告 20001-政治 20002-色情 20004-社会事件 20011-暴力 20012-低俗 20006-违法犯罪 20007-谩骂 20008-欺诈 20013-版权 20104-谣言 21000-其他, 10086-聚合, 24001-暴恐（天御独有恶意类型），20472-违法，
24005-社会
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentSafetyCode 10001-广告 20001-政治 20002-色情 20004-社会事件 20011-暴力 20012-低俗 20006-违法犯罪 20007-谩骂 20008-欺诈 20013-版权 20104-谣言 21000-其他, 10086-聚合, 24001-暴恐（天御独有恶意类型），20472-违法，
24005-社会
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getContentSafetyCode() {
        return this.ContentSafetyCode;
    }

    /**
     * Set 10001-广告 20001-政治 20002-色情 20004-社会事件 20011-暴力 20012-低俗 20006-违法犯罪 20007-谩骂 20008-欺诈 20013-版权 20104-谣言 21000-其他, 10086-聚合, 24001-暴恐（天御独有恶意类型），20472-违法，
24005-社会
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentSafetyCode 10001-广告 20001-政治 20002-色情 20004-社会事件 20011-暴力 20012-低俗 20006-违法犯罪 20007-谩骂 20008-欺诈 20013-版权 20104-谣言 21000-其他, 10086-聚合, 24001-暴恐（天御独有恶意类型），20472-违法，
24005-社会
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentSafetyCode(Long ContentSafetyCode) {
        this.ContentSafetyCode = ContentSafetyCode;
    }

    public ConsoleSharingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsoleSharingInfo(ConsoleSharingInfo source) {
        if (source.SharingId != null) {
            this.SharingId = new String(source.SharingId);
        }
        if (source.SharingUrl != null) {
            this.SharingUrl = new String(source.SharingUrl);
        }
        if (source.SharingConfig != null) {
            this.SharingConfig = new ConsoleSharingConfig(source.SharingConfig);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ContentSafetyCode != null) {
            this.ContentSafetyCode = new Long(source.ContentSafetyCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SharingId", this.SharingId);
        this.setParamSimple(map, prefix + "SharingUrl", this.SharingUrl);
        this.setParamObj(map, prefix + "SharingConfig.", this.SharingConfig);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ContentSafetyCode", this.ContentSafetyCode);

    }
}

