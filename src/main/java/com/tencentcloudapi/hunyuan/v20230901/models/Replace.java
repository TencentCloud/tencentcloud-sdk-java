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

public class Replace extends AbstractModel {

    /**
    * 占位符序号
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 多媒体详情
    */
    @SerializedName("Multimedia")
    @Expose
    private Multimedia [] Multimedia;

    /**
     * Get 占位符序号 
     * @return Id 占位符序号
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 占位符序号
     * @param Id 占位符序号
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 多媒体详情 
     * @return Multimedia 多媒体详情
     */
    public Multimedia [] getMultimedia() {
        return this.Multimedia;
    }

    /**
     * Set 多媒体详情
     * @param Multimedia 多媒体详情
     */
    public void setMultimedia(Multimedia [] Multimedia) {
        this.Multimedia = Multimedia;
    }

    public Replace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Replace(Replace source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Multimedia != null) {
            this.Multimedia = new Multimedia[source.Multimedia.length];
            for (int i = 0; i < source.Multimedia.length; i++) {
                this.Multimedia[i] = new Multimedia(source.Multimedia[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Multimedia.", this.Multimedia);

    }
}

