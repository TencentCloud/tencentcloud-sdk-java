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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWarningSettingRequest extends AbstractModel{

    /**
    * 告警设置的修改内容
    */
    @SerializedName("WarningObjects")
    @Expose
    private WarningObject [] WarningObjects;

    /**
     * Get 告警设置的修改内容 
     * @return WarningObjects 告警设置的修改内容
     */
    public WarningObject [] getWarningObjects() {
        return this.WarningObjects;
    }

    /**
     * Set 告警设置的修改内容
     * @param WarningObjects 告警设置的修改内容
     */
    public void setWarningObjects(WarningObject [] WarningObjects) {
        this.WarningObjects = WarningObjects;
    }

    public ModifyWarningSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWarningSettingRequest(ModifyWarningSettingRequest source) {
        if (source.WarningObjects != null) {
            this.WarningObjects = new WarningObject[source.WarningObjects.length];
            for (int i = 0; i < source.WarningObjects.length; i++) {
                this.WarningObjects[i] = new WarningObject(source.WarningObjects[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WarningObjects.", this.WarningObjects);

    }
}

