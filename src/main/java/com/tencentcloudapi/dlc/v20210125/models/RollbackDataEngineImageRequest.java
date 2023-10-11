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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackDataEngineImageRequest extends AbstractModel{

    /**
    * 引擎ID
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 检查是否能回滚的接口返回的FromRecordId参数
    */
    @SerializedName("FromRecordId")
    @Expose
    private String FromRecordId;

    /**
    * 检查是否能回滚的接口返回的ToRecordId参数
    */
    @SerializedName("ToRecordId")
    @Expose
    private String ToRecordId;

    /**
     * Get 引擎ID 
     * @return DataEngineId 引擎ID
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 引擎ID
     * @param DataEngineId 引擎ID
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 检查是否能回滚的接口返回的FromRecordId参数 
     * @return FromRecordId 检查是否能回滚的接口返回的FromRecordId参数
     */
    public String getFromRecordId() {
        return this.FromRecordId;
    }

    /**
     * Set 检查是否能回滚的接口返回的FromRecordId参数
     * @param FromRecordId 检查是否能回滚的接口返回的FromRecordId参数
     */
    public void setFromRecordId(String FromRecordId) {
        this.FromRecordId = FromRecordId;
    }

    /**
     * Get 检查是否能回滚的接口返回的ToRecordId参数 
     * @return ToRecordId 检查是否能回滚的接口返回的ToRecordId参数
     */
    public String getToRecordId() {
        return this.ToRecordId;
    }

    /**
     * Set 检查是否能回滚的接口返回的ToRecordId参数
     * @param ToRecordId 检查是否能回滚的接口返回的ToRecordId参数
     */
    public void setToRecordId(String ToRecordId) {
        this.ToRecordId = ToRecordId;
    }

    public RollbackDataEngineImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackDataEngineImageRequest(RollbackDataEngineImageRequest source) {
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.FromRecordId != null) {
            this.FromRecordId = new String(source.FromRecordId);
        }
        if (source.ToRecordId != null) {
            this.ToRecordId = new String(source.ToRecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "FromRecordId", this.FromRecordId);
        this.setParamSimple(map, prefix + "ToRecordId", this.ToRecordId);

    }
}

