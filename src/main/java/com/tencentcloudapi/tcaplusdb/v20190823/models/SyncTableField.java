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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncTableField extends AbstractModel{

    /**
    * TcaplusDB表字段名称
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 目标缓写表的字段名称
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
     * Get TcaplusDB表字段名称 
     * @return SourceName TcaplusDB表字段名称
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set TcaplusDB表字段名称
     * @param SourceName TcaplusDB表字段名称
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 目标缓写表的字段名称 
     * @return TargetName 目标缓写表的字段名称
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 目标缓写表的字段名称
     * @param TargetName 目标缓写表的字段名称
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    public SyncTableField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncTableField(SyncTableField source) {
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);

    }
}

