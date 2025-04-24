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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAndroidInstancesInformationRequest extends AbstractModel {

    /**
    * 安卓实例信息数据
    */
    @SerializedName("AndroidInstanceInformations")
    @Expose
    private AndroidInstanceInformation [] AndroidInstanceInformations;

    /**
     * Get 安卓实例信息数据 
     * @return AndroidInstanceInformations 安卓实例信息数据
     */
    public AndroidInstanceInformation [] getAndroidInstanceInformations() {
        return this.AndroidInstanceInformations;
    }

    /**
     * Set 安卓实例信息数据
     * @param AndroidInstanceInformations 安卓实例信息数据
     */
    public void setAndroidInstanceInformations(AndroidInstanceInformation [] AndroidInstanceInformations) {
        this.AndroidInstanceInformations = AndroidInstanceInformations;
    }

    public ModifyAndroidInstancesInformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAndroidInstancesInformationRequest(ModifyAndroidInstancesInformationRequest source) {
        if (source.AndroidInstanceInformations != null) {
            this.AndroidInstanceInformations = new AndroidInstanceInformation[source.AndroidInstanceInformations.length];
            for (int i = 0; i < source.AndroidInstanceInformations.length; i++) {
                this.AndroidInstanceInformations[i] = new AndroidInstanceInformation(source.AndroidInstanceInformations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AndroidInstanceInformations.", this.AndroidInstanceInformations);

    }
}

