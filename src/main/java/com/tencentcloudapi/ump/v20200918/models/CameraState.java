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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CameraState extends AbstractModel{

    /**
    * 相机ID
    */
    @SerializedName("CameraId")
    @Expose
    private Long CameraId;

    /**
    * 相机状态:
10: 初始化
11: 未知状态
12: 网络异常
13: 未授权
14: 相机App异常
15: 相机取流异常
16: 状态正常
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
     * Get 相机ID 
     * @return CameraId 相机ID
     */
    public Long getCameraId() {
        return this.CameraId;
    }

    /**
     * Set 相机ID
     * @param CameraId 相机ID
     */
    public void setCameraId(Long CameraId) {
        this.CameraId = CameraId;
    }

    /**
     * Get 相机状态:
10: 初始化
11: 未知状态
12: 网络异常
13: 未授权
14: 相机App异常
15: 相机取流异常
16: 状态正常 
     * @return State 相机状态:
10: 初始化
11: 未知状态
12: 网络异常
13: 未授权
14: 相机App异常
15: 相机取流异常
16: 状态正常
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 相机状态:
10: 初始化
11: 未知状态
12: 网络异常
13: 未授权
14: 相机App异常
15: 相机取流异常
16: 状态正常
     * @param State 相机状态:
10: 初始化
11: 未知状态
12: 网络异常
13: 未授权
14: 相机App异常
15: 相机取流异常
16: 状态正常
     */
    public void setState(Long State) {
        this.State = State;
    }

    public CameraState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CameraState(CameraState source) {
        if (source.CameraId != null) {
            this.CameraId = new Long(source.CameraId);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CameraId", this.CameraId);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

