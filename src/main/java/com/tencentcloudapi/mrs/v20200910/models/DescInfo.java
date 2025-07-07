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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescInfo extends AbstractModel {

    /**
    * 描述段落文本
    */
    @SerializedName("Text")
    @Expose
    private BaseInfo Text;

    /**
    * 描述段落详情
    */
    @SerializedName("Infos")
    @Expose
    private DetailInformation [] Infos;

    /**
     * Get 描述段落文本 
     * @return Text 描述段落文本
     */
    public BaseInfo getText() {
        return this.Text;
    }

    /**
     * Set 描述段落文本
     * @param Text 描述段落文本
     */
    public void setText(BaseInfo Text) {
        this.Text = Text;
    }

    /**
     * Get 描述段落详情 
     * @return Infos 描述段落详情
     */
    public DetailInformation [] getInfos() {
        return this.Infos;
    }

    /**
     * Set 描述段落详情
     * @param Infos 描述段落详情
     */
    public void setInfos(DetailInformation [] Infos) {
        this.Infos = Infos;
    }

    public DescInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescInfo(DescInfo source) {
        if (source.Text != null) {
            this.Text = new BaseInfo(source.Text);
        }
        if (source.Infos != null) {
            this.Infos = new DetailInformation[source.Infos.length];
            for (int i = 0; i < source.Infos.length; i++) {
                this.Infos[i] = new DetailInformation(source.Infos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);

    }
}

