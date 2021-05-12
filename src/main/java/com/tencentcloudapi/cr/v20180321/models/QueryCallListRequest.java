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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCallListRequest extends AbstractModel{

    /**
    * 模块名。默认值（固定）：AiApi
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名。默认值（固定）：QueryCallList
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 业务日期
    */
    @SerializedName("BizDate")
    @Expose
    private String BizDate;

    /**
    * 任务ID，二者必填一个
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 任务名称，二者必填一个
    */
    @SerializedName("BotName")
    @Expose
    private String BotName;

    /**
    * 通过API或平台上传的文件完整名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get 模块名。默认值（固定）：AiApi 
     * @return Module 模块名。默认值（固定）：AiApi
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名。默认值（固定）：AiApi
     * @param Module 模块名。默认值（固定）：AiApi
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名。默认值（固定）：QueryCallList 
     * @return Operation 操作名。默认值（固定）：QueryCallList
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名。默认值（固定）：QueryCallList
     * @param Operation 操作名。默认值（固定）：QueryCallList
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 业务日期 
     * @return BizDate 业务日期
     */
    public String getBizDate() {
        return this.BizDate;
    }

    /**
     * Set 业务日期
     * @param BizDate 业务日期
     */
    public void setBizDate(String BizDate) {
        this.BizDate = BizDate;
    }

    /**
     * Get 任务ID，二者必填一个 
     * @return BotId 任务ID，二者必填一个
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set 任务ID，二者必填一个
     * @param BotId 任务ID，二者必填一个
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * Get 任务名称，二者必填一个 
     * @return BotName 任务名称，二者必填一个
     */
    public String getBotName() {
        return this.BotName;
    }

    /**
     * Set 任务名称，二者必填一个
     * @param BotName 任务名称，二者必填一个
     */
    public void setBotName(String BotName) {
        this.BotName = BotName;
    }

    /**
     * Get 通过API或平台上传的文件完整名称 
     * @return FileName 通过API或平台上传的文件完整名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 通过API或平台上传的文件完整名称
     * @param FileName 通过API或平台上传的文件完整名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public QueryCallListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCallListRequest(QueryCallListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.BizDate != null) {
            this.BizDate = new String(source.BizDate);
        }
        if (source.BotId != null) {
            this.BotId = new String(source.BotId);
        }
        if (source.BotName != null) {
            this.BotName = new String(source.BotName);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "BizDate", this.BizDate);
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "BotName", this.BotName);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

