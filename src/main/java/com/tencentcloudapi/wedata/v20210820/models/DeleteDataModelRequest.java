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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDataModelRequest extends AbstractModel {

    /**
    * 云应用的实例id
    */
    @SerializedName("CloudappId")
    @Expose
    private String CloudappId;

    /**
    * 数据建模的实例id
    */
    @SerializedName("DataModelId")
    @Expose
    private String DataModelId;

    /**
    * 用户的子账号id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

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
     * Get 数据建模的实例id 
     * @return DataModelId 数据建模的实例id
     */
    public String getDataModelId() {
        return this.DataModelId;
    }

    /**
     * Set 数据建模的实例id
     * @param DataModelId 数据建模的实例id
     */
    public void setDataModelId(String DataModelId) {
        this.DataModelId = DataModelId;
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

    public DeleteDataModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDataModelRequest(DeleteDataModelRequest source) {
        if (source.CloudappId != null) {
            this.CloudappId = new String(source.CloudappId);
        }
        if (source.DataModelId != null) {
            this.DataModelId = new String(source.DataModelId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudappId", this.CloudappId);
        this.setParamSimple(map, prefix + "DataModelId", this.DataModelId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

