/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Docker extends AbstractModel {

    /**
    * 容器镜像地址
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 容器运行参数
    */
    @SerializedName("RunArgs")
    @Expose
    private String [] RunArgs;

    /**
     * Get 容器镜像地址 
     * @return Image 容器镜像地址
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 容器镜像地址
     * @param Image 容器镜像地址
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 容器运行参数 
     * @return RunArgs 容器运行参数
     */
    public String [] getRunArgs() {
        return this.RunArgs;
    }

    /**
     * Set 容器运行参数
     * @param RunArgs 容器运行参数
     */
    public void setRunArgs(String [] RunArgs) {
        this.RunArgs = RunArgs;
    }

    public Docker() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Docker(Docker source) {
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.RunArgs != null) {
            this.RunArgs = new String[source.RunArgs.length];
            for (int i = 0; i < source.RunArgs.length; i++) {
                this.RunArgs[i] = new String(source.RunArgs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamArraySimple(map, prefix + "RunArgs.", this.RunArgs);

    }
}

