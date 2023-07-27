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
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageCodecParam extends AbstractModel{

    /**
    * 元数据
    */
    @SerializedName("MetaData")
    @Expose
    private MetaData [] MetaData;

    /**
     * Get 元数据 
     * @return MetaData 元数据
     */
    public MetaData [] getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 元数据
     * @param MetaData 元数据
     */
    public void setMetaData(MetaData [] MetaData) {
        this.MetaData = MetaData;
    }

    public ImageCodecParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageCodecParam(ImageCodecParam source) {
        if (source.MetaData != null) {
            this.MetaData = new MetaData[source.MetaData.length];
            for (int i = 0; i < source.MetaData.length; i++) {
                this.MetaData[i] = new MetaData(source.MetaData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MetaData.", this.MetaData);

    }
}

