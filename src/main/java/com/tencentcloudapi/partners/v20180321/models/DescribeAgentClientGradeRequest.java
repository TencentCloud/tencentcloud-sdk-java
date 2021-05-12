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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentClientGradeRequest extends AbstractModel{

    /**
    * 代客uin
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;

    /**
     * Get 代客uin 
     * @return ClientUin 代客uin
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 代客uin
     * @param ClientUin 代客uin
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    public DescribeAgentClientGradeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentClientGradeRequest(DescribeAgentClientGradeRequest source) {
        if (source.ClientUin != null) {
            this.ClientUin = new String(source.ClientUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);

    }
}

