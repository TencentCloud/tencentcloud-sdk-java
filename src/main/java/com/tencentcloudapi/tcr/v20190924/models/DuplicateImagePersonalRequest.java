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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DuplicateImagePersonalRequest extends AbstractModel{

    /**
    * 源镜像名称，不包含domain。例如： tencentyun/foo:v1
    */
    @SerializedName("SrcImage")
    @Expose
    private String SrcImage;

    /**
    * 目的镜像名称，不包含domain。例如： tencentyun/foo:latest
    */
    @SerializedName("DestImage")
    @Expose
    private String DestImage;

    /**
     * Get 源镜像名称，不包含domain。例如： tencentyun/foo:v1 
     * @return SrcImage 源镜像名称，不包含domain。例如： tencentyun/foo:v1
     */
    public String getSrcImage() {
        return this.SrcImage;
    }

    /**
     * Set 源镜像名称，不包含domain。例如： tencentyun/foo:v1
     * @param SrcImage 源镜像名称，不包含domain。例如： tencentyun/foo:v1
     */
    public void setSrcImage(String SrcImage) {
        this.SrcImage = SrcImage;
    }

    /**
     * Get 目的镜像名称，不包含domain。例如： tencentyun/foo:latest 
     * @return DestImage 目的镜像名称，不包含domain。例如： tencentyun/foo:latest
     */
    public String getDestImage() {
        return this.DestImage;
    }

    /**
     * Set 目的镜像名称，不包含domain。例如： tencentyun/foo:latest
     * @param DestImage 目的镜像名称，不包含domain。例如： tencentyun/foo:latest
     */
    public void setDestImage(String DestImage) {
        this.DestImage = DestImage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcImage", this.SrcImage);
        this.setParamSimple(map, prefix + "DestImage", this.DestImage);

    }
}

