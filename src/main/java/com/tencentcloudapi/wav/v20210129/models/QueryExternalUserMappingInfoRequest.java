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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryExternalUserMappingInfoRequest extends AbstractModel{

    /**
    * 企业主体对应的外部联系人id列表，列表长度限制最大为50。
    */
    @SerializedName("CorpExternalUserIdList")
    @Expose
    private String [] CorpExternalUserIdList;

    /**
     * Get 企业主体对应的外部联系人id列表，列表长度限制最大为50。 
     * @return CorpExternalUserIdList 企业主体对应的外部联系人id列表，列表长度限制最大为50。
     */
    public String [] getCorpExternalUserIdList() {
        return this.CorpExternalUserIdList;
    }

    /**
     * Set 企业主体对应的外部联系人id列表，列表长度限制最大为50。
     * @param CorpExternalUserIdList 企业主体对应的外部联系人id列表，列表长度限制最大为50。
     */
    public void setCorpExternalUserIdList(String [] CorpExternalUserIdList) {
        this.CorpExternalUserIdList = CorpExternalUserIdList;
    }

    public QueryExternalUserMappingInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryExternalUserMappingInfoRequest(QueryExternalUserMappingInfoRequest source) {
        if (source.CorpExternalUserIdList != null) {
            this.CorpExternalUserIdList = new String[source.CorpExternalUserIdList.length];
            for (int i = 0; i < source.CorpExternalUserIdList.length; i++) {
                this.CorpExternalUserIdList[i] = new String(source.CorpExternalUserIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CorpExternalUserIdList.", this.CorpExternalUserIdList);

    }
}

