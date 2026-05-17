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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosBucketInfo extends AbstractModel {

    /**
    * appid信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 存储桶名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 地域信息
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * 地域码值
    */
    @SerializedName("BucketRegionCode")
    @Expose
    private String BucketRegionCode;

    /**
    * 备注
    */
    @SerializedName("BucketMarker")
    @Expose
    private String BucketMarker;

    /**
     * Get appid信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId appid信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appid信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId appid信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 存储桶名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketName 存储桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 存储桶名
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketName 存储桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 地域信息 
     * @return BucketRegion 地域信息
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set 地域信息
     * @param BucketRegion 地域信息
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get 地域码值 
     * @return BucketRegionCode 地域码值
     */
    public String getBucketRegionCode() {
        return this.BucketRegionCode;
    }

    /**
     * Set 地域码值
     * @param BucketRegionCode 地域码值
     */
    public void setBucketRegionCode(String BucketRegionCode) {
        this.BucketRegionCode = BucketRegionCode;
    }

    /**
     * Get 备注 
     * @return BucketMarker 备注
     */
    public String getBucketMarker() {
        return this.BucketMarker;
    }

    /**
     * Set 备注
     * @param BucketMarker 备注
     */
    public void setBucketMarker(String BucketMarker) {
        this.BucketMarker = BucketMarker;
    }

    public CosBucketInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosBucketInfo(CosBucketInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.BucketRegionCode != null) {
            this.BucketRegionCode = new String(source.BucketRegionCode);
        }
        if (source.BucketMarker != null) {
            this.BucketMarker = new String(source.BucketMarker);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketRegionCode", this.BucketRegionCode);
        this.setParamSimple(map, prefix + "BucketMarker", this.BucketMarker);

    }
}

