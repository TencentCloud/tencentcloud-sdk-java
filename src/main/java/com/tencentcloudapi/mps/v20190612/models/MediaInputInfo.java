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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaInputInfo  extends AbstractModel{

    /**
    * 视频处理对象的类型，现在仅支持 COS。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当 Type 为 COS 时有效，则该项为必填，表示视频处理 COS 对象信息。
    */
    @SerializedName("CosInputInfo")
    @Expose
    private CosInputInfo CosInputInfo;

    /**
     * 获取视频处理对象的类型，现在仅支持 COS。
     * @return Type 视频处理对象的类型，现在仅支持 COS。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置视频处理对象的类型，现在仅支持 COS。
     * @param Type 视频处理对象的类型，现在仅支持 COS。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取当 Type 为 COS 时有效，则该项为必填，表示视频处理 COS 对象信息。
     * @return CosInputInfo 当 Type 为 COS 时有效，则该项为必填，表示视频处理 COS 对象信息。
     */
    public CosInputInfo getCosInputInfo() {
        return this.CosInputInfo;
    }

    /**
     * 设置当 Type 为 COS 时有效，则该项为必填，表示视频处理 COS 对象信息。
     * @param CosInputInfo 当 Type 为 COS 时有效，则该项为必填，表示视频处理 COS 对象信息。
     */
    public void setCosInputInfo(CosInputInfo CosInputInfo) {
        this.CosInputInfo = CosInputInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosInputInfo.", this.CosInputInfo);

    }
}

