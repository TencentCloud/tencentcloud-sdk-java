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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TWeCallPkgInfo extends AbstractModel {

    /**
    * 包ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 包类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgType")
    @Expose
    private Long PkgType;

    /**
    * 生效时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 已使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LicenseUsedNum")
    @Expose
    private Long LicenseUsedNum;

    /**
    * 总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LicenseTotalNum")
    @Expose
    private Long LicenseTotalNum;

    /**
     * Get 包ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgId 包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 包ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgId 包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 包类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgType 包类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPkgType() {
        return this.PkgType;
    }

    /**
     * Set 包类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgType 包类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgType(Long PkgType) {
        this.PkgType = PkgType;
    }

    /**
     * Get 生效时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 生效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 生效时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 生效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 已使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LicenseUsedNum 已使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLicenseUsedNum() {
        return this.LicenseUsedNum;
    }

    /**
     * Set 已使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param LicenseUsedNum 已使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicenseUsedNum(Long LicenseUsedNum) {
        this.LicenseUsedNum = LicenseUsedNum;
    }

    /**
     * Get 总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LicenseTotalNum 总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLicenseTotalNum() {
        return this.LicenseTotalNum;
    }

    /**
     * Set 总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param LicenseTotalNum 总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicenseTotalNum(Long LicenseTotalNum) {
        this.LicenseTotalNum = LicenseTotalNum;
    }

    public TWeCallPkgInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TWeCallPkgInfo(TWeCallPkgInfo source) {
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgType != null) {
            this.PkgType = new Long(source.PkgType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.LicenseUsedNum != null) {
            this.LicenseUsedNum = new Long(source.LicenseUsedNum);
        }
        if (source.LicenseTotalNum != null) {
            this.LicenseTotalNum = new Long(source.LicenseTotalNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgType", this.PkgType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LicenseUsedNum", this.LicenseUsedNum);
        this.setParamSimple(map, prefix + "LicenseTotalNum", this.LicenseTotalNum);

    }
}

