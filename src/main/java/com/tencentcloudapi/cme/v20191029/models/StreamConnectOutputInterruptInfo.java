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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamConnectOutputInterruptInfo extends AbstractModel{

    /**
    * 云转推输出标识。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 云转推输出名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 云转推输出地址。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 云转推输出标识。 
     * @return Id 云转推输出标识。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 云转推输出标识。
     * @param Id 云转推输出标识。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 云转推输出名称。 
     * @return Name 云转推输出名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 云转推输出名称。
     * @param Name 云转推输出名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 云转推输出地址。 
     * @return Url 云转推输出地址。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 云转推输出地址。
     * @param Url 云转推输出地址。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public StreamConnectOutputInterruptInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamConnectOutputInterruptInfo(StreamConnectOutputInterruptInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

