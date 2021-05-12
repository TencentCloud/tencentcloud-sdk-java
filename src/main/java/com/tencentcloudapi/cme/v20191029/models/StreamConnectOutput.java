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

public class StreamConnectOutput extends AbstractModel{

    /**
    * 云转推输出源标识，转推项目级别唯一。若不填则由后端生成。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 云转推输出源名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 云转推输出源类型，取值：
<li>URL ：URL类型</li>
不填默认为URL类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 云转推推流地址。
    */
    @SerializedName("PushUrl")
    @Expose
    private String PushUrl;

    /**
     * Get 云转推输出源标识，转推项目级别唯一。若不填则由后端生成。 
     * @return Id 云转推输出源标识，转推项目级别唯一。若不填则由后端生成。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 云转推输出源标识，转推项目级别唯一。若不填则由后端生成。
     * @param Id 云转推输出源标识，转推项目级别唯一。若不填则由后端生成。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 云转推输出源名称。 
     * @return Name 云转推输出源名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 云转推输出源名称。
     * @param Name 云转推输出源名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 云转推输出源类型，取值：
<li>URL ：URL类型</li>
不填默认为URL类型。 
     * @return Type 云转推输出源类型，取值：
<li>URL ：URL类型</li>
不填默认为URL类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 云转推输出源类型，取值：
<li>URL ：URL类型</li>
不填默认为URL类型。
     * @param Type 云转推输出源类型，取值：
<li>URL ：URL类型</li>
不填默认为URL类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 云转推推流地址。 
     * @return PushUrl 云转推推流地址。
     */
    public String getPushUrl() {
        return this.PushUrl;
    }

    /**
     * Set 云转推推流地址。
     * @param PushUrl 云转推推流地址。
     */
    public void setPushUrl(String PushUrl) {
        this.PushUrl = PushUrl;
    }

    public StreamConnectOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamConnectOutput(StreamConnectOutput source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PushUrl != null) {
            this.PushUrl = new String(source.PushUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PushUrl", this.PushUrl);

    }
}

