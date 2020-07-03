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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeDetect extends AbstractModel{

    /**
    * 从图片中检测到的二维码，可能为多个
    */
    @SerializedName("ModerationDetail")
    @Expose
    private CodeDetail [] ModerationDetail;

    /**
    * 检测是否成功，0：成功，-1：出错
    */
    @SerializedName("ModerationCode")
    @Expose
    private Long ModerationCode;

    /**
     * Get 从图片中检测到的二维码，可能为多个 
     * @return ModerationDetail 从图片中检测到的二维码，可能为多个
     */
    public CodeDetail [] getModerationDetail() {
        return this.ModerationDetail;
    }

    /**
     * Set 从图片中检测到的二维码，可能为多个
     * @param ModerationDetail 从图片中检测到的二维码，可能为多个
     */
    public void setModerationDetail(CodeDetail [] ModerationDetail) {
        this.ModerationDetail = ModerationDetail;
    }

    /**
     * Get 检测是否成功，0：成功，-1：出错 
     * @return ModerationCode 检测是否成功，0：成功，-1：出错
     */
    public Long getModerationCode() {
        return this.ModerationCode;
    }

    /**
     * Set 检测是否成功，0：成功，-1：出错
     * @param ModerationCode 检测是否成功，0：成功，-1：出错
     */
    public void setModerationCode(Long ModerationCode) {
        this.ModerationCode = ModerationCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ModerationDetail.", this.ModerationDetail);
        this.setParamSimple(map, prefix + "ModerationCode", this.ModerationCode);

    }
}

