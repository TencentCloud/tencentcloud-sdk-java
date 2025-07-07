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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BoolData extends AbstractModel {

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 读写模式
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 取值列表
    */
    @SerializedName("Range")
    @Expose
    private Boolean [] Range;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Desc 描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
     * @param Desc 描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 读写模式 
     * @return Mode 读写模式
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 读写模式
     * @param Mode 读写模式
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 取值列表 
     * @return Range 取值列表
     */
    public Boolean [] getRange() {
        return this.Range;
    }

    /**
     * Set 取值列表
     * @param Range 取值列表
     */
    public void setRange(Boolean [] Range) {
        this.Range = Range;
    }

    public BoolData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BoolData(BoolData source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Range != null) {
            this.Range = new Boolean[source.Range.length];
            for (int i = 0; i < source.Range.length; i++) {
                this.Range[i] = new Boolean(source.Range[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArraySimple(map, prefix + "Range.", this.Range);

    }
}

