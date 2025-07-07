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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCmdTemplateRequest extends AbstractModel {

    /**
    * 模板名，最长32字符，不能包含空白字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命令列表，\n分隔，最长32768字节
    */
    @SerializedName("CmdList")
    @Expose
    private String CmdList;

    /**
    * 命令模板ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CmdList字段前端是否base64传值。
0：否，1：是
    */
    @SerializedName("Encoding")
    @Expose
    private Long Encoding;

    /**
    * 命令模板类型 1-内置模板 2-自定义模板
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 模板名，最长32字符，不能包含空白字符 
     * @return Name 模板名，最长32字符，不能包含空白字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名，最长32字符，不能包含空白字符
     * @param Name 模板名，最长32字符，不能包含空白字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命令列表，\n分隔，最长32768字节 
     * @return CmdList 命令列表，\n分隔，最长32768字节
     */
    public String getCmdList() {
        return this.CmdList;
    }

    /**
     * Set 命令列表，\n分隔，最长32768字节
     * @param CmdList 命令列表，\n分隔，最长32768字节
     */
    public void setCmdList(String CmdList) {
        this.CmdList = CmdList;
    }

    /**
     * Get 命令模板ID 
     * @return Id 命令模板ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 命令模板ID
     * @param Id 命令模板ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get CmdList字段前端是否base64传值。
0：否，1：是 
     * @return Encoding CmdList字段前端是否base64传值。
0：否，1：是
     */
    public Long getEncoding() {
        return this.Encoding;
    }

    /**
     * Set CmdList字段前端是否base64传值。
0：否，1：是
     * @param Encoding CmdList字段前端是否base64传值。
0：否，1：是
     */
    public void setEncoding(Long Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get 命令模板类型 1-内置模板 2-自定义模板 
     * @return Type 命令模板类型 1-内置模板 2-自定义模板
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 命令模板类型 1-内置模板 2-自定义模板
     * @param Type 命令模板类型 1-内置模板 2-自定义模板
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ModifyCmdTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCmdTemplateRequest(ModifyCmdTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CmdList != null) {
            this.CmdList = new String(source.CmdList);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Encoding != null) {
            this.Encoding = new Long(source.Encoding);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CmdList", this.CmdList);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

