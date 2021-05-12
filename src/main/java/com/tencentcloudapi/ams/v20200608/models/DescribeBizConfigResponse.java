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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBizConfigResponse extends AbstractModel{

    /**
    * 业务类型
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 业务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizName")
    @Expose
    private String BizName;

    /**
    * 审核范围
    */
    @SerializedName("ModerationCategories")
    @Expose
    private String [] ModerationCategories;

    /**
    * 多媒体审核配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaModeration")
    @Expose
    private MediaModerationConfig MediaModeration;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 业务类型 
     * @return BizType 业务类型
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 业务类型
     * @param BizType 业务类型
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 业务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizName 业务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizName() {
        return this.BizName;
    }

    /**
     * Set 业务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizName 业务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizName(String BizName) {
        this.BizName = BizName;
    }

    /**
     * Get 审核范围 
     * @return ModerationCategories 审核范围
     */
    public String [] getModerationCategories() {
        return this.ModerationCategories;
    }

    /**
     * Set 审核范围
     * @param ModerationCategories 审核范围
     */
    public void setModerationCategories(String [] ModerationCategories) {
        this.ModerationCategories = ModerationCategories;
    }

    /**
     * Get 多媒体审核配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaModeration 多媒体审核配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaModerationConfig getMediaModeration() {
        return this.MediaModeration;
    }

    /**
     * Set 多媒体审核配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaModeration 多媒体审核配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaModeration(MediaModerationConfig MediaModeration) {
        this.MediaModeration = MediaModeration;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新时间 
     * @return UpdatedAt 更新时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
     * @param UpdatedAt 更新时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBizConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBizConfigResponse(DescribeBizConfigResponse source) {
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.BizName != null) {
            this.BizName = new String(source.BizName);
        }
        if (source.ModerationCategories != null) {
            this.ModerationCategories = new String[source.ModerationCategories.length];
            for (int i = 0; i < source.ModerationCategories.length; i++) {
                this.ModerationCategories[i] = new String(source.ModerationCategories[i]);
            }
        }
        if (source.MediaModeration != null) {
            this.MediaModeration = new MediaModerationConfig(source.MediaModeration);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "BizName", this.BizName);
        this.setParamArraySimple(map, prefix + "ModerationCategories.", this.ModerationCategories);
        this.setParamObj(map, prefix + "MediaModeration.", this.MediaModeration);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

