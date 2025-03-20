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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchCreateDeviceRes extends AbstractModel {

    /**
    * 新增成功的设备列表
    */
    @SerializedName("SuccessSet")
    @Expose
    private CreateDeviceSucceeded [] SuccessSet;

    /**
    * 新增失败的设备列表
    */
    @SerializedName("FailSet")
    @Expose
    private CreateDeviceFailed [] FailSet;

    /**
     * Get 新增成功的设备列表 
     * @return SuccessSet 新增成功的设备列表
     */
    public CreateDeviceSucceeded [] getSuccessSet() {
        return this.SuccessSet;
    }

    /**
     * Set 新增成功的设备列表
     * @param SuccessSet 新增成功的设备列表
     */
    public void setSuccessSet(CreateDeviceSucceeded [] SuccessSet) {
        this.SuccessSet = SuccessSet;
    }

    /**
     * Get 新增失败的设备列表 
     * @return FailSet 新增失败的设备列表
     */
    public CreateDeviceFailed [] getFailSet() {
        return this.FailSet;
    }

    /**
     * Set 新增失败的设备列表
     * @param FailSet 新增失败的设备列表
     */
    public void setFailSet(CreateDeviceFailed [] FailSet) {
        this.FailSet = FailSet;
    }

    public BatchCreateDeviceRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateDeviceRes(BatchCreateDeviceRes source) {
        if (source.SuccessSet != null) {
            this.SuccessSet = new CreateDeviceSucceeded[source.SuccessSet.length];
            for (int i = 0; i < source.SuccessSet.length; i++) {
                this.SuccessSet[i] = new CreateDeviceSucceeded(source.SuccessSet[i]);
            }
        }
        if (source.FailSet != null) {
            this.FailSet = new CreateDeviceFailed[source.FailSet.length];
            for (int i = 0; i < source.FailSet.length; i++) {
                this.FailSet[i] = new CreateDeviceFailed(source.FailSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SuccessSet.", this.SuccessSet);
        this.setParamArrayObj(map, prefix + "FailSet.", this.FailSet);

    }
}

