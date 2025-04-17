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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainErrorPageInfoByIdsRequest extends AbstractModel {

    /**
    * 定制错误ID列表，最多支持10个
    */
    @SerializedName("ErrorPageIds")
    @Expose
    private String [] ErrorPageIds;

    /**
     * Get 定制错误ID列表，最多支持10个 
     * @return ErrorPageIds 定制错误ID列表，最多支持10个
     */
    public String [] getErrorPageIds() {
        return this.ErrorPageIds;
    }

    /**
     * Set 定制错误ID列表，最多支持10个
     * @param ErrorPageIds 定制错误ID列表，最多支持10个
     */
    public void setErrorPageIds(String [] ErrorPageIds) {
        this.ErrorPageIds = ErrorPageIds;
    }

    public DescribeDomainErrorPageInfoByIdsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainErrorPageInfoByIdsRequest(DescribeDomainErrorPageInfoByIdsRequest source) {
        if (source.ErrorPageIds != null) {
            this.ErrorPageIds = new String[source.ErrorPageIds.length];
            for (int i = 0; i < source.ErrorPageIds.length; i++) {
                this.ErrorPageIds[i] = new String(source.ErrorPageIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ErrorPageIds.", this.ErrorPageIds);

    }
}

