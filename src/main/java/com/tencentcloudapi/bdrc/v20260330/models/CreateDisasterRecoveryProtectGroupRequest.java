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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDisasterRecoveryProtectGroupRequest extends AbstractModel {

    /**
    * 所属容灾站点对id
    */
    @SerializedName("SitePairId")
    @Expose
    private String SitePairId;

    /**
    * 容灾保护组的产品类型
    */
    @SerializedName("ProtectGroupType")
    @Expose
    private String ProtectGroupType;

    /**
    * 容灾保护组预期rpo, 单位分钟（当前仅支持15分钟）
    */
    @SerializedName("RecoveryPointObjective")
    @Expose
    private Long RecoveryPointObjective;

    /**
    * 容灾保护组的名称，最大长度不能超60个字符。
    */
    @SerializedName("ProtectGroupName")
    @Expose
    private String ProtectGroupName;

    /**
    * 数据复制方向， ['POSITIVE', 'REVERSE']
    */
    @SerializedName("DataDirection")
    @Expose
    private String DataDirection;

    /**
     * Get 所属容灾站点对id 
     * @return SitePairId 所属容灾站点对id
     */
    public String getSitePairId() {
        return this.SitePairId;
    }

    /**
     * Set 所属容灾站点对id
     * @param SitePairId 所属容灾站点对id
     */
    public void setSitePairId(String SitePairId) {
        this.SitePairId = SitePairId;
    }

    /**
     * Get 容灾保护组的产品类型 
     * @return ProtectGroupType 容灾保护组的产品类型
     */
    public String getProtectGroupType() {
        return this.ProtectGroupType;
    }

    /**
     * Set 容灾保护组的产品类型
     * @param ProtectGroupType 容灾保护组的产品类型
     */
    public void setProtectGroupType(String ProtectGroupType) {
        this.ProtectGroupType = ProtectGroupType;
    }

    /**
     * Get 容灾保护组预期rpo, 单位分钟（当前仅支持15分钟） 
     * @return RecoveryPointObjective 容灾保护组预期rpo, 单位分钟（当前仅支持15分钟）
     */
    public Long getRecoveryPointObjective() {
        return this.RecoveryPointObjective;
    }

    /**
     * Set 容灾保护组预期rpo, 单位分钟（当前仅支持15分钟）
     * @param RecoveryPointObjective 容灾保护组预期rpo, 单位分钟（当前仅支持15分钟）
     */
    public void setRecoveryPointObjective(Long RecoveryPointObjective) {
        this.RecoveryPointObjective = RecoveryPointObjective;
    }

    /**
     * Get 容灾保护组的名称，最大长度不能超60个字符。 
     * @return ProtectGroupName 容灾保护组的名称，最大长度不能超60个字符。
     */
    public String getProtectGroupName() {
        return this.ProtectGroupName;
    }

    /**
     * Set 容灾保护组的名称，最大长度不能超60个字符。
     * @param ProtectGroupName 容灾保护组的名称，最大长度不能超60个字符。
     */
    public void setProtectGroupName(String ProtectGroupName) {
        this.ProtectGroupName = ProtectGroupName;
    }

    /**
     * Get 数据复制方向， ['POSITIVE', 'REVERSE'] 
     * @return DataDirection 数据复制方向， ['POSITIVE', 'REVERSE']
     */
    public String getDataDirection() {
        return this.DataDirection;
    }

    /**
     * Set 数据复制方向， ['POSITIVE', 'REVERSE']
     * @param DataDirection 数据复制方向， ['POSITIVE', 'REVERSE']
     */
    public void setDataDirection(String DataDirection) {
        this.DataDirection = DataDirection;
    }

    public CreateDisasterRecoveryProtectGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDisasterRecoveryProtectGroupRequest(CreateDisasterRecoveryProtectGroupRequest source) {
        if (source.SitePairId != null) {
            this.SitePairId = new String(source.SitePairId);
        }
        if (source.ProtectGroupType != null) {
            this.ProtectGroupType = new String(source.ProtectGroupType);
        }
        if (source.RecoveryPointObjective != null) {
            this.RecoveryPointObjective = new Long(source.RecoveryPointObjective);
        }
        if (source.ProtectGroupName != null) {
            this.ProtectGroupName = new String(source.ProtectGroupName);
        }
        if (source.DataDirection != null) {
            this.DataDirection = new String(source.DataDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SitePairId", this.SitePairId);
        this.setParamSimple(map, prefix + "ProtectGroupType", this.ProtectGroupType);
        this.setParamSimple(map, prefix + "RecoveryPointObjective", this.RecoveryPointObjective);
        this.setParamSimple(map, prefix + "ProtectGroupName", this.ProtectGroupName);
        this.setParamSimple(map, prefix + "DataDirection", this.DataDirection);

    }
}

