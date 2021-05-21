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

public class LineGroupInfo extends AbstractModel{

    /**
    * 线路分组ID
    */
    @SerializedName("LineId")
    @Expose
    private String LineId;

    /**
    * 线路分组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分组类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 线路分组包含的线路列表
    */
    @SerializedName("LineList")
    @Expose
    private String [] LineList;

    /**
     * Get 线路分组ID 
     * @return LineId 线路分组ID
     */
    public String getLineId() {
        return this.LineId;
    }

    /**
     * Set 线路分组ID
     * @param LineId 线路分组ID
     */
    public void setLineId(String LineId) {
        this.LineId = LineId;
    }

    /**
     * Get 线路分组名称 
     * @return Name 线路分组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 线路分组名称
     * @param Name 线路分组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分组类型 
     * @return Type 分组类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 分组类型
     * @param Type 分组类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 线路分组包含的线路列表 
     * @return LineList 线路分组包含的线路列表
     */
    public String [] getLineList() {
        return this.LineList;
    }

    /**
     * Set 线路分组包含的线路列表
     * @param LineList 线路分组包含的线路列表
     */
    public void setLineList(String [] LineList) {
        this.LineList = LineList;
    }

    public LineGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineGroupInfo(LineGroupInfo source) {
        if (source.LineId != null) {
            this.LineId = new String(source.LineId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.LineList != null) {
            this.LineList = new String[source.LineList.length];
            for (int i = 0; i < source.LineList.length; i++) {
                this.LineList[i] = new String(source.LineList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LineId", this.LineId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "LineList.", this.LineList);

    }
}

