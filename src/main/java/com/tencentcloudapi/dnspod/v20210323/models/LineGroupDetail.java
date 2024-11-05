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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineGroupDetail extends AbstractModel {

    /**
    * 自定义线路分组ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 自定线路分组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义线路分组包含的线路列表
    */
    @SerializedName("Lines")
    @Expose
    private String [] Lines;

    /**
     * Get 自定义线路分组ID 
     * @return Id 自定义线路分组ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 自定义线路分组ID
     * @param Id 自定义线路分组ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 自定线路分组名称 
     * @return Name 自定线路分组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定线路分组名称
     * @param Name 自定线路分组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义线路分组包含的线路列表 
     * @return Lines 自定义线路分组包含的线路列表
     */
    public String [] getLines() {
        return this.Lines;
    }

    /**
     * Set 自定义线路分组包含的线路列表
     * @param Lines 自定义线路分组包含的线路列表
     */
    public void setLines(String [] Lines) {
        this.Lines = Lines;
    }

    public LineGroupDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineGroupDetail(LineGroupDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Lines != null) {
            this.Lines = new String[source.Lines.length];
            for (int i = 0; i < source.Lines.length; i++) {
                this.Lines[i] = new String(source.Lines[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Lines.", this.Lines);

    }
}

