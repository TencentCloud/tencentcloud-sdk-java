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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataKeysRequest extends AbstractModel {

    /**
    * 查询DataKey的ID列表，批量查询一次最多支持100个DataKeyId
    */
    @SerializedName("DataKeyIds")
    @Expose
    private String [] DataKeyIds;

    /**
     * Get 查询DataKey的ID列表，批量查询一次最多支持100个DataKeyId 
     * @return DataKeyIds 查询DataKey的ID列表，批量查询一次最多支持100个DataKeyId
     */
    public String [] getDataKeyIds() {
        return this.DataKeyIds;
    }

    /**
     * Set 查询DataKey的ID列表，批量查询一次最多支持100个DataKeyId
     * @param DataKeyIds 查询DataKey的ID列表，批量查询一次最多支持100个DataKeyId
     */
    public void setDataKeyIds(String [] DataKeyIds) {
        this.DataKeyIds = DataKeyIds;
    }

    public DescribeDataKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataKeysRequest(DescribeDataKeysRequest source) {
        if (source.DataKeyIds != null) {
            this.DataKeyIds = new String[source.DataKeyIds.length];
            for (int i = 0; i < source.DataKeyIds.length; i++) {
                this.DataKeyIds[i] = new String(source.DataKeyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DataKeyIds.", this.DataKeyIds);

    }
}

