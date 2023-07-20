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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiagnosticInfoResponse extends AbstractModel{

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineTasks")
    @Expose
    private BaselineTaskDto [] BaselineTasks;

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineTasks 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineTaskDto [] getBaselineTasks() {
        return this.BaselineTasks;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineTasks 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineTasks(BaselineTaskDto [] BaselineTasks) {
        this.BaselineTasks = BaselineTasks;
    }

    public DescribeDiagnosticInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiagnosticInfoResponse(DescribeDiagnosticInfoResponse source) {
        if (source.BaselineTasks != null) {
            this.BaselineTasks = new BaselineTaskDto[source.BaselineTasks.length];
            for (int i = 0; i < source.BaselineTasks.length; i++) {
                this.BaselineTasks[i] = new BaselineTaskDto(source.BaselineTasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BaselineTasks.", this.BaselineTasks);

    }
}

