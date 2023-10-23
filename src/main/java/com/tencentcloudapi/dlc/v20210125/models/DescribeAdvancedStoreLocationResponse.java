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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAdvancedStoreLocationResponse extends AbstractModel {

    /**
    * 是否启用高级设置：0-否，1-是
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 查询结果保存cos路径
    */
    @SerializedName("StoreLocation")
    @Expose
    private String StoreLocation;

    /**
    * 是否有托管存储权限
    */
    @SerializedName("HasLakeFs")
    @Expose
    private Boolean HasLakeFs;

    /**
    * 托管存储状态，HasLakeFs等于true时，该值才有意义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LakeFsStatus")
    @Expose
    private String LakeFsStatus;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否启用高级设置：0-否，1-是 
     * @return Enable 是否启用高级设置：0-否，1-是
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用高级设置：0-否，1-是
     * @param Enable 是否启用高级设置：0-否，1-是
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 查询结果保存cos路径 
     * @return StoreLocation 查询结果保存cos路径
     */
    public String getStoreLocation() {
        return this.StoreLocation;
    }

    /**
     * Set 查询结果保存cos路径
     * @param StoreLocation 查询结果保存cos路径
     */
    public void setStoreLocation(String StoreLocation) {
        this.StoreLocation = StoreLocation;
    }

    /**
     * Get 是否有托管存储权限 
     * @return HasLakeFs 是否有托管存储权限
     */
    public Boolean getHasLakeFs() {
        return this.HasLakeFs;
    }

    /**
     * Set 是否有托管存储权限
     * @param HasLakeFs 是否有托管存储权限
     */
    public void setHasLakeFs(Boolean HasLakeFs) {
        this.HasLakeFs = HasLakeFs;
    }

    /**
     * Get 托管存储状态，HasLakeFs等于true时，该值才有意义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LakeFsStatus 托管存储状态，HasLakeFs等于true时，该值才有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLakeFsStatus() {
        return this.LakeFsStatus;
    }

    /**
     * Set 托管存储状态，HasLakeFs等于true时，该值才有意义
注意：此字段可能返回 null，表示取不到有效值。
     * @param LakeFsStatus 托管存储状态，HasLakeFs等于true时，该值才有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLakeFsStatus(String LakeFsStatus) {
        this.LakeFsStatus = LakeFsStatus;
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

    public DescribeAdvancedStoreLocationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAdvancedStoreLocationResponse(DescribeAdvancedStoreLocationResponse source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.StoreLocation != null) {
            this.StoreLocation = new String(source.StoreLocation);
        }
        if (source.HasLakeFs != null) {
            this.HasLakeFs = new Boolean(source.HasLakeFs);
        }
        if (source.LakeFsStatus != null) {
            this.LakeFsStatus = new String(source.LakeFsStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "StoreLocation", this.StoreLocation);
        this.setParamSimple(map, prefix + "HasLakeFs", this.HasLakeFs);
        this.setParamSimple(map, prefix + "LakeFsStatus", this.LakeFsStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

