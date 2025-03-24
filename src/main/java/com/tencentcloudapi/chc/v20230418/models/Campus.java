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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Campus extends AbstractModel {

    /**
    * 园区ID
    */
    @SerializedName("CampusId")
    @Expose
    private Long CampusId;

    /**
    * 园区名称
    */
    @SerializedName("CampusName")
    @Expose
    private String CampusName;

    /**
     * Get 园区ID 
     * @return CampusId 园区ID
     */
    public Long getCampusId() {
        return this.CampusId;
    }

    /**
     * Set 园区ID
     * @param CampusId 园区ID
     */
    public void setCampusId(Long CampusId) {
        this.CampusId = CampusId;
    }

    /**
     * Get 园区名称 
     * @return CampusName 园区名称
     */
    public String getCampusName() {
        return this.CampusName;
    }

    /**
     * Set 园区名称
     * @param CampusName 园区名称
     */
    public void setCampusName(String CampusName) {
        this.CampusName = CampusName;
    }

    public Campus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Campus(Campus source) {
        if (source.CampusId != null) {
            this.CampusId = new Long(source.CampusId);
        }
        if (source.CampusName != null) {
            this.CampusName = new String(source.CampusName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CampusId", this.CampusId);
        this.setParamSimple(map, prefix + "CampusName", this.CampusName);

    }
}

