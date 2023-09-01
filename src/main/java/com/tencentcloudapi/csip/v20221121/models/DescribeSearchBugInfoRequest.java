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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSearchBugInfoRequest extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * id=3时传入该参数
    */
    @SerializedName("CVEId")
    @Expose
    private String CVEId;

    /**
     * Get 无 
     * @return Id 无
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 无
     * @param Id 无
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get id=3时传入该参数 
     * @return CVEId id=3时传入该参数
     */
    public String getCVEId() {
        return this.CVEId;
    }

    /**
     * Set id=3时传入该参数
     * @param CVEId id=3时传入该参数
     */
    public void setCVEId(String CVEId) {
        this.CVEId = CVEId;
    }

    public DescribeSearchBugInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSearchBugInfoRequest(DescribeSearchBugInfoRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.CVEId != null) {
            this.CVEId = new String(source.CVEId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CVEId", this.CVEId);

    }
}

