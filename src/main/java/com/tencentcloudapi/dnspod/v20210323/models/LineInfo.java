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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineInfo extends AbstractModel{

    /**
    * 线路名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 线路ID
    */
    @SerializedName("LineId")
    @Expose
    private String LineId;

    /**
     * Get 线路名称 
     * @return Name 线路名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 线路名称
     * @param Name 线路名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 线路ID 
     * @return LineId 线路ID
     */
    public String getLineId() {
        return this.LineId;
    }

    /**
     * Set 线路ID
     * @param LineId 线路ID
     */
    public void setLineId(String LineId) {
        this.LineId = LineId;
    }

    public LineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineInfo(LineInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LineId != null) {
            this.LineId = new String(source.LineId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LineId", this.LineId);

    }
}

