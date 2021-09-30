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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUnderwriteTaskByIdRequest extends AbstractModel{

    /**
    * 主任务ID数组，
    */
    @SerializedName("MainTaskIds")
    @Expose
    private String [] MainTaskIds;

    /**
    * 回调地址，可不传（提供轮询机制）。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
     * Get 主任务ID数组， 
     * @return MainTaskIds 主任务ID数组，
     */
    public String [] getMainTaskIds() {
        return this.MainTaskIds;
    }

    /**
     * Set 主任务ID数组，
     * @param MainTaskIds 主任务ID数组，
     */
    public void setMainTaskIds(String [] MainTaskIds) {
        this.MainTaskIds = MainTaskIds;
    }

    /**
     * Get 回调地址，可不传（提供轮询机制）。 
     * @return CallbackUrl 回调地址，可不传（提供轮询机制）。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调地址，可不传（提供轮询机制）。
     * @param CallbackUrl 回调地址，可不传（提供轮询机制）。
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public CreateUnderwriteTaskByIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUnderwriteTaskByIdRequest(CreateUnderwriteTaskByIdRequest source) {
        if (source.MainTaskIds != null) {
            this.MainTaskIds = new String[source.MainTaskIds.length];
            for (int i = 0; i < source.MainTaskIds.length; i++) {
                this.MainTaskIds[i] = new String(source.MainTaskIds[i]);
            }
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MainTaskIds.", this.MainTaskIds);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);

    }
}

