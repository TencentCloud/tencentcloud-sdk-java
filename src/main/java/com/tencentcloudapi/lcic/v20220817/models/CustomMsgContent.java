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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomMsgContent extends AbstractModel {

    /**
    * 自定义消息数据。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 自定义消息描述信息。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 扩展字段。
    */
    @SerializedName("Ext")
    @Expose
    private String Ext;

    /**
     * Get 自定义消息数据。 
     * @return Data 自定义消息数据。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 自定义消息数据。
     * @param Data 自定义消息数据。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 自定义消息描述信息。 
     * @return Desc 自定义消息描述信息。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 自定义消息描述信息。
     * @param Desc 自定义消息描述信息。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 扩展字段。 
     * @return Ext 扩展字段。
     */
    public String getExt() {
        return this.Ext;
    }

    /**
     * Set 扩展字段。
     * @param Ext 扩展字段。
     */
    public void setExt(String Ext) {
        this.Ext = Ext;
    }

    public CustomMsgContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomMsgContent(CustomMsgContent source) {
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Ext != null) {
            this.Ext = new String(source.Ext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Ext", this.Ext);

    }
}

