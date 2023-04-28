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

public class CreateCmdTemplateRequest extends AbstractModel{

    /**
    * 模板名，最大长度32字符，不能包含空白字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命令列表，\n分隔，最大长度32768字节
    */
    @SerializedName("CmdList")
    @Expose
    private String CmdList;

    /**
    * 标识cmdlist字段前端是否为base64加密传值.
0:表示非base64加密
1:表示是base64加密
    */
    @SerializedName("Encoding")
    @Expose
    private Long Encoding;

    /**
     * Get 模板名，最大长度32字符，不能包含空白字符 
     * @return Name 模板名，最大长度32字符，不能包含空白字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名，最大长度32字符，不能包含空白字符
     * @param Name 模板名，最大长度32字符，不能包含空白字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命令列表，\n分隔，最大长度32768字节 
     * @return CmdList 命令列表，\n分隔，最大长度32768字节
     */
    public String getCmdList() {
        return this.CmdList;
    }

    /**
     * Set 命令列表，\n分隔，最大长度32768字节
     * @param CmdList 命令列表，\n分隔，最大长度32768字节
     */
    public void setCmdList(String CmdList) {
        this.CmdList = CmdList;
    }

    /**
     * Get 标识cmdlist字段前端是否为base64加密传值.
0:表示非base64加密
1:表示是base64加密 
     * @return Encoding 标识cmdlist字段前端是否为base64加密传值.
0:表示非base64加密
1:表示是base64加密
     */
    public Long getEncoding() {
        return this.Encoding;
    }

    /**
     * Set 标识cmdlist字段前端是否为base64加密传值.
0:表示非base64加密
1:表示是base64加密
     * @param Encoding 标识cmdlist字段前端是否为base64加密传值.
0:表示非base64加密
1:表示是base64加密
     */
    public void setEncoding(Long Encoding) {
        this.Encoding = Encoding;
    }

    public CreateCmdTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCmdTemplateRequest(CreateCmdTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CmdList != null) {
            this.CmdList = new String(source.CmdList);
        }
        if (source.Encoding != null) {
            this.Encoding = new Long(source.Encoding);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CmdList", this.CmdList);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);

    }
}

