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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDataModelRequest extends AbstractModel {

    /**
    * 云应用的实例id
    */
    @SerializedName("CloudappId")
    @Expose
    private String CloudappId;

    /**
    * 用户的子账号id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Wedata数据建模购买参数，包年包月类型单位，年：y，月：m，默认m
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Wedata数据建模购买参数，购买时长，默认1
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Wedata数据建模购买参数，是否自动续费，是：1，否：0，默认0
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Wedata数据建模购买参数，标准版：DATA_MODEL_STANDARD，企业版：DATA_MODEL_PRO，默认DATA_MODEL_STANDARD
    */
    @SerializedName("DataModelVersion")
    @Expose
    private String DataModelVersion;

    /**
     * Get 云应用的实例id 
     * @return CloudappId 云应用的实例id
     */
    public String getCloudappId() {
        return this.CloudappId;
    }

    /**
     * Set 云应用的实例id
     * @param CloudappId 云应用的实例id
     */
    public void setCloudappId(String CloudappId) {
        this.CloudappId = CloudappId;
    }

    /**
     * Get 用户的子账号id 
     * @return UserId 用户的子账号id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户的子账号id
     * @param UserId 用户的子账号id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Wedata数据建模购买参数，包年包月类型单位，年：y，月：m，默认m 
     * @return TimeUnit Wedata数据建模购买参数，包年包月类型单位，年：y，月：m，默认m
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Wedata数据建模购买参数，包年包月类型单位，年：y，月：m，默认m
     * @param TimeUnit Wedata数据建模购买参数，包年包月类型单位，年：y，月：m，默认m
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Wedata数据建模购买参数，购买时长，默认1 
     * @return TimeSpan Wedata数据建模购买参数，购买时长，默认1
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Wedata数据建模购买参数，购买时长，默认1
     * @param TimeSpan Wedata数据建模购买参数，购买时长，默认1
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Wedata数据建模购买参数，是否自动续费，是：1，否：0，默认0 
     * @return AutoRenewFlag Wedata数据建模购买参数，是否自动续费，是：1，否：0，默认0
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Wedata数据建模购买参数，是否自动续费，是：1，否：0，默认0
     * @param AutoRenewFlag Wedata数据建模购买参数，是否自动续费，是：1，否：0，默认0
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Wedata数据建模购买参数，标准版：DATA_MODEL_STANDARD，企业版：DATA_MODEL_PRO，默认DATA_MODEL_STANDARD 
     * @return DataModelVersion Wedata数据建模购买参数，标准版：DATA_MODEL_STANDARD，企业版：DATA_MODEL_PRO，默认DATA_MODEL_STANDARD
     */
    public String getDataModelVersion() {
        return this.DataModelVersion;
    }

    /**
     * Set Wedata数据建模购买参数，标准版：DATA_MODEL_STANDARD，企业版：DATA_MODEL_PRO，默认DATA_MODEL_STANDARD
     * @param DataModelVersion Wedata数据建模购买参数，标准版：DATA_MODEL_STANDARD，企业版：DATA_MODEL_PRO，默认DATA_MODEL_STANDARD
     */
    public void setDataModelVersion(String DataModelVersion) {
        this.DataModelVersion = DataModelVersion;
    }

    public CreateDataModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataModelRequest(CreateDataModelRequest source) {
        if (source.CloudappId != null) {
            this.CloudappId = new String(source.CloudappId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.DataModelVersion != null) {
            this.DataModelVersion = new String(source.DataModelVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudappId", this.CloudappId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "DataModelVersion", this.DataModelVersion);

    }
}

