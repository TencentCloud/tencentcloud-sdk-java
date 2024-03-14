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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckMigrateIndexMetaDataResponse extends AbstractModel {

    /**
    * 不存在于目标索引时间字段相同的字段
    */
    @SerializedName("MappingTimeFieldCheckFailedIndexArr")
    @Expose
    private String [] MappingTimeFieldCheckFailedIndexArr;

    /**
    * @timestamp不为date类型，与目标索引时间字段冲突
    */
    @SerializedName("MappingTimeTypeCheckFailedIndexArr")
    @Expose
    private String [] MappingTimeTypeCheckFailedIndexArr;

    /**
    * 索引的创建时间不在 serverless的存储周期内
    */
    @SerializedName("SettingCheckFailedIndexArr")
    @Expose
    private String [] SettingCheckFailedIndexArr;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 不存在于目标索引时间字段相同的字段 
     * @return MappingTimeFieldCheckFailedIndexArr 不存在于目标索引时间字段相同的字段
     */
    public String [] getMappingTimeFieldCheckFailedIndexArr() {
        return this.MappingTimeFieldCheckFailedIndexArr;
    }

    /**
     * Set 不存在于目标索引时间字段相同的字段
     * @param MappingTimeFieldCheckFailedIndexArr 不存在于目标索引时间字段相同的字段
     */
    public void setMappingTimeFieldCheckFailedIndexArr(String [] MappingTimeFieldCheckFailedIndexArr) {
        this.MappingTimeFieldCheckFailedIndexArr = MappingTimeFieldCheckFailedIndexArr;
    }

    /**
     * Get @timestamp不为date类型，与目标索引时间字段冲突 
     * @return MappingTimeTypeCheckFailedIndexArr @timestamp不为date类型，与目标索引时间字段冲突
     */
    public String [] getMappingTimeTypeCheckFailedIndexArr() {
        return this.MappingTimeTypeCheckFailedIndexArr;
    }

    /**
     * Set @timestamp不为date类型，与目标索引时间字段冲突
     * @param MappingTimeTypeCheckFailedIndexArr @timestamp不为date类型，与目标索引时间字段冲突
     */
    public void setMappingTimeTypeCheckFailedIndexArr(String [] MappingTimeTypeCheckFailedIndexArr) {
        this.MappingTimeTypeCheckFailedIndexArr = MappingTimeTypeCheckFailedIndexArr;
    }

    /**
     * Get 索引的创建时间不在 serverless的存储周期内 
     * @return SettingCheckFailedIndexArr 索引的创建时间不在 serverless的存储周期内
     */
    public String [] getSettingCheckFailedIndexArr() {
        return this.SettingCheckFailedIndexArr;
    }

    /**
     * Set 索引的创建时间不在 serverless的存储周期内
     * @param SettingCheckFailedIndexArr 索引的创建时间不在 serverless的存储周期内
     */
    public void setSettingCheckFailedIndexArr(String [] SettingCheckFailedIndexArr) {
        this.SettingCheckFailedIndexArr = SettingCheckFailedIndexArr;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CheckMigrateIndexMetaDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckMigrateIndexMetaDataResponse(CheckMigrateIndexMetaDataResponse source) {
        if (source.MappingTimeFieldCheckFailedIndexArr != null) {
            this.MappingTimeFieldCheckFailedIndexArr = new String[source.MappingTimeFieldCheckFailedIndexArr.length];
            for (int i = 0; i < source.MappingTimeFieldCheckFailedIndexArr.length; i++) {
                this.MappingTimeFieldCheckFailedIndexArr[i] = new String(source.MappingTimeFieldCheckFailedIndexArr[i]);
            }
        }
        if (source.MappingTimeTypeCheckFailedIndexArr != null) {
            this.MappingTimeTypeCheckFailedIndexArr = new String[source.MappingTimeTypeCheckFailedIndexArr.length];
            for (int i = 0; i < source.MappingTimeTypeCheckFailedIndexArr.length; i++) {
                this.MappingTimeTypeCheckFailedIndexArr[i] = new String(source.MappingTimeTypeCheckFailedIndexArr[i]);
            }
        }
        if (source.SettingCheckFailedIndexArr != null) {
            this.SettingCheckFailedIndexArr = new String[source.SettingCheckFailedIndexArr.length];
            for (int i = 0; i < source.SettingCheckFailedIndexArr.length; i++) {
                this.SettingCheckFailedIndexArr[i] = new String(source.SettingCheckFailedIndexArr[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MappingTimeFieldCheckFailedIndexArr.", this.MappingTimeFieldCheckFailedIndexArr);
        this.setParamArraySimple(map, prefix + "MappingTimeTypeCheckFailedIndexArr.", this.MappingTimeTypeCheckFailedIndexArr);
        this.setParamArraySimple(map, prefix + "SettingCheckFailedIndexArr.", this.SettingCheckFailedIndexArr);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

