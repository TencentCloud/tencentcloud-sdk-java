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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogstashExtendedFile extends AbstractModel{

    /**
    * 扩展文件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 扩展文件大小，单位B
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 扩展文件名称 
     * @return Name 扩展文件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 扩展文件名称
     * @param Name 扩展文件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 扩展文件大小，单位B 
     * @return Size 扩展文件大小，单位B
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 扩展文件大小，单位B
     * @param Size 扩展文件大小，单位B
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public LogstashExtendedFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogstashExtendedFile(LogstashExtendedFile source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

