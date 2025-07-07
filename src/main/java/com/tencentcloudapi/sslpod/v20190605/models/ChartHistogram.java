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
package com.tencentcloudapi.sslpod.v20190605.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChartHistogram extends AbstractModel {

    /**
    * 项目名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 项目值
    */
    @SerializedName("Children")
    @Expose
    private ChartNameValue [] Children;

    /**
     * Get 项目名 
     * @return Name 项目名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名
     * @param Name 项目名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 项目值 
     * @return Children 项目值
     */
    public ChartNameValue [] getChildren() {
        return this.Children;
    }

    /**
     * Set 项目值
     * @param Children 项目值
     */
    public void setChildren(ChartNameValue [] Children) {
        this.Children = Children;
    }

    public ChartHistogram() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChartHistogram(ChartHistogram source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Children != null) {
            this.Children = new ChartNameValue[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new ChartNameValue(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

