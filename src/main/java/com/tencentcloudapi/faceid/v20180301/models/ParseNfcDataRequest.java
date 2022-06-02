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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParseNfcDataRequest extends AbstractModel{

    /**
    * 前端SDK返回
    */
    @SerializedName("ReqId")
    @Expose
    private String ReqId;

    /**
     * Get 前端SDK返回 
     * @return ReqId 前端SDK返回
     */
    public String getReqId() {
        return this.ReqId;
    }

    /**
     * Set 前端SDK返回
     * @param ReqId 前端SDK返回
     */
    public void setReqId(String ReqId) {
        this.ReqId = ReqId;
    }

    public ParseNfcDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParseNfcDataRequest(ParseNfcDataRequest source) {
        if (source.ReqId != null) {
            this.ReqId = new String(source.ReqId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReqId", this.ReqId);

    }
}

