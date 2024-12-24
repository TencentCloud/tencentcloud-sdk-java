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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmrQuality extends AbstractModel {

    /**
    * 缺失体格检查项目
    */
    @SerializedName("MissPhysicalExamination")
    @Expose
    private String [] MissPhysicalExamination;

    /**
     * Get 缺失体格检查项目 
     * @return MissPhysicalExamination 缺失体格检查项目
     */
    public String [] getMissPhysicalExamination() {
        return this.MissPhysicalExamination;
    }

    /**
     * Set 缺失体格检查项目
     * @param MissPhysicalExamination 缺失体格检查项目
     */
    public void setMissPhysicalExamination(String [] MissPhysicalExamination) {
        this.MissPhysicalExamination = MissPhysicalExamination;
    }

    public EmrQuality() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmrQuality(EmrQuality source) {
        if (source.MissPhysicalExamination != null) {
            this.MissPhysicalExamination = new String[source.MissPhysicalExamination.length];
            for (int i = 0; i < source.MissPhysicalExamination.length; i++) {
                this.MissPhysicalExamination[i] = new String(source.MissPhysicalExamination[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MissPhysicalExamination.", this.MissPhysicalExamination);

    }
}

