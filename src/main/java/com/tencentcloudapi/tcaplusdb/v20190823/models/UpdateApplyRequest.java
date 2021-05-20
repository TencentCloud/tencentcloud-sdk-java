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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateApplyRequest extends AbstractModel{

    /**
    * 申请单状态
    */
    @SerializedName("ApplyStatus")
    @Expose
    private ApplyStatus [] ApplyStatus;

    /**
     * Get 申请单状态 
     * @return ApplyStatus 申请单状态
     */
    public ApplyStatus [] getApplyStatus() {
        return this.ApplyStatus;
    }

    /**
     * Set 申请单状态
     * @param ApplyStatus 申请单状态
     */
    public void setApplyStatus(ApplyStatus [] ApplyStatus) {
        this.ApplyStatus = ApplyStatus;
    }

    public UpdateApplyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateApplyRequest(UpdateApplyRequest source) {
        if (source.ApplyStatus != null) {
            this.ApplyStatus = new ApplyStatus[source.ApplyStatus.length];
            for (int i = 0; i < source.ApplyStatus.length; i++) {
                this.ApplyStatus[i] = new ApplyStatus(source.ApplyStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ApplyStatus.", this.ApplyStatus);

    }
}

