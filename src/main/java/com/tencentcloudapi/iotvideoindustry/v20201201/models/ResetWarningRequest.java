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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetWarningRequest extends AbstractModel{

    /**
    * 告警ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Es中告警ID
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
     * Get 告警ID 
     * @return Id 告警ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 告警ID
     * @param Id 告警ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Es中告警ID 
     * @return Index Es中告警ID
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Es中告警ID
     * @param Index Es中告警ID
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    public ResetWarningRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetWarningRequest(ResetWarningRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

