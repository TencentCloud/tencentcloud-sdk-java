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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CmdTemplate extends AbstractModel{

    /**
    * 高危命令模板ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 高危命令模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命令列表，命令之间用换行符（"\n"）分隔
    */
    @SerializedName("CmdList")
    @Expose
    private String CmdList;

    /**
     * Get 高危命令模板ID 
     * @return Id 高危命令模板ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 高危命令模板ID
     * @param Id 高危命令模板ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 高危命令模板名称 
     * @return Name 高危命令模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 高危命令模板名称
     * @param Name 高危命令模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命令列表，命令之间用换行符（"\n"）分隔 
     * @return CmdList 命令列表，命令之间用换行符（"\n"）分隔
     */
    public String getCmdList() {
        return this.CmdList;
    }

    /**
     * Set 命令列表，命令之间用换行符（"\n"）分隔
     * @param CmdList 命令列表，命令之间用换行符（"\n"）分隔
     */
    public void setCmdList(String CmdList) {
        this.CmdList = CmdList;
    }

    public CmdTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmdTemplate(CmdTemplate source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CmdList != null) {
            this.CmdList = new String(source.CmdList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CmdList", this.CmdList);

    }
}

