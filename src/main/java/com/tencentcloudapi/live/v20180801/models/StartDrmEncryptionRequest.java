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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartDrmEncryptionRequest  extends AbstractModel{

    /**
    * Drm加密所需要的信息。
    */
    @SerializedName("DrmEncryptInfo")
    @Expose
    private DrmEncryptInfo DrmEncryptInfo;

    /**
     * 获取Drm加密所需要的信息。
     * @return DrmEncryptInfo Drm加密所需要的信息。
     */
    public DrmEncryptInfo getDrmEncryptInfo() {
        return this.DrmEncryptInfo;
    }

    /**
     * 设置Drm加密所需要的信息。
     * @param DrmEncryptInfo Drm加密所需要的信息。
     */
    public void setDrmEncryptInfo(DrmEncryptInfo DrmEncryptInfo) {
        this.DrmEncryptInfo = DrmEncryptInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DrmEncryptInfo.", this.DrmEncryptInfo);

    }
}

