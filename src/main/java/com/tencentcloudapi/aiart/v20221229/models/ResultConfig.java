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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResultConfig extends AbstractModel {

    /**
    * 生成图分辨率

智能文生图支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1）、720:1280（9:16）、1280:720（16:9）、768:1280（3:5）、1280:768（5:3）、1080:1920（9:16）、1920:1080（16:9）

智能图生图支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）

不传默认使用768:768
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get 生成图分辨率

智能文生图支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1）、720:1280（9:16）、1280:720（16:9）、768:1280（3:5）、1280:768（5:3）、1080:1920（9:16）、1920:1080（16:9）

智能图生图支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）

不传默认使用768:768 
     * @return Resolution 生成图分辨率

智能文生图支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1）、720:1280（9:16）、1280:720（16:9）、768:1280（3:5）、1280:768（5:3）、1080:1920（9:16）、1920:1080（16:9）

智能图生图支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）

不传默认使用768:768
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 生成图分辨率

智能文生图支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1）、720:1280（9:16）、1280:720（16:9）、768:1280（3:5）、1280:768（5:3）、1080:1920（9:16）、1920:1080（16:9）

智能图生图支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）

不传默认使用768:768
     * @param Resolution 生成图分辨率

智能文生图支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1）、720:1280（9:16）、1280:720（16:9）、768:1280（3:5）、1280:768（5:3）、1080:1920（9:16）、1920:1080（16:9）

智能图生图支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）

不传默认使用768:768
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public ResultConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResultConfig(ResultConfig source) {
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

