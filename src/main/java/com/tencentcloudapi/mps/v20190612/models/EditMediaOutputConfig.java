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

public class EditMediaOutputConfig extends AbstractModel{

    /**
    * 封装格式，可选值：mp4、hls、mov、flv、avi。默认是 mp4。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
     * Get 封装格式，可选值：mp4、hls、mov、flv、avi。默认是 mp4。 
     * @return Container 封装格式，可选值：mp4、hls、mov、flv、avi。默认是 mp4。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 封装格式，可选值：mp4、hls、mov、flv、avi。默认是 mp4。
     * @param Container 封装格式，可选值：mp4、hls、mov、flv、avi。默认是 mp4。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    public EditMediaOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaOutputConfig(EditMediaOutputConfig source) {
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Container", this.Container);

    }
}

