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

public class DescribeSceneRequest extends AbstractModel{

    /**
    * 场景ID
    */
    @SerializedName("IntId")
    @Expose
    private Long IntId;

    /**
     * Get 场景ID 
     * @return IntId 场景ID
     */
    public Long getIntId() {
        return this.IntId;
    }

    /**
     * Set 场景ID
     * @param IntId 场景ID
     */
    public void setIntId(Long IntId) {
        this.IntId = IntId;
    }

    public DescribeSceneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSceneRequest(DescribeSceneRequest source) {
        if (source.IntId != null) {
            this.IntId = new Long(source.IntId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntId", this.IntId);

    }
}

