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

public class CreateUploadUrlRequest extends AbstractModel{

    /**
    * 用于的接口
    */
    @SerializedName("TargetAction")
    @Expose
    private String TargetAction;

    /**
     * Get 用于的接口 
     * @return TargetAction 用于的接口
     */
    public String getTargetAction() {
        return this.TargetAction;
    }

    /**
     * Set 用于的接口
     * @param TargetAction 用于的接口
     */
    public void setTargetAction(String TargetAction) {
        this.TargetAction = TargetAction;
    }

    public CreateUploadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUploadUrlRequest(CreateUploadUrlRequest source) {
        if (source.TargetAction != null) {
            this.TargetAction = new String(source.TargetAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetAction", this.TargetAction);

    }
}

