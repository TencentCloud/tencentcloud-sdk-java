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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class File3D extends AbstractModel {

    /**
    * 3D文件的格式。取值范围：GIF, OBJ
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 文件的Url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 3D文件的格式。取值范围：GIF, OBJ 
     * @return Type 3D文件的格式。取值范围：GIF, OBJ
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 3D文件的格式。取值范围：GIF, OBJ
     * @param Type 3D文件的格式。取值范围：GIF, OBJ
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 文件的Url 
     * @return Url 文件的Url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 文件的Url
     * @param Url 文件的Url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public File3D() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public File3D(File3D source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

