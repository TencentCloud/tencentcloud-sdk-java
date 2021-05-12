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

public class QueryRecordListRequest extends AbstractModel{

    /**
    * 模块名。AiApi
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名。QueryRecordList
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 偏移值
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 偏移位移，最大20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
    * 被叫号码
    */
    @SerializedName("CalledPhone")
    @Expose
    private String CalledPhone;

    /**
    * 开始日期
    */
    @SerializedName("StartBizDate")
    @Expose
    private String StartBizDate;

    /**
    * 结束日期
    */
    @SerializedName("EndBizDate")
    @Expose
    private String EndBizDate;

    /**
     * Get 模块名。AiApi 
     * @return Module 模块名。AiApi
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名。AiApi
     * @param Module 模块名。AiApi
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名。QueryRecordList 
     * @return Operation 操作名。QueryRecordList
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名。QueryRecordList
     * @param Operation 操作名。QueryRecordList
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 偏移值 
     * @return Offset 偏移值
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移值
     * @param Offset 偏移值
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 偏移位移，最大20 
     * @return Limit 偏移位移，最大20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 偏移位移，最大20
     * @param Limit 偏移位移，最大20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get 被叫号码 
     * @return CalledPhone 被叫号码
     */
    public String getCalledPhone() {
        return this.CalledPhone;
    }

    /**
     * Set 被叫号码
     * @param CalledPhone 被叫号码
     */
    public void setCalledPhone(String CalledPhone) {
        this.CalledPhone = CalledPhone;
    }

    /**
     * Get 开始日期 
     * @return StartBizDate 开始日期
     */
    public String getStartBizDate() {
        return this.StartBizDate;
    }

    /**
     * Set 开始日期
     * @param StartBizDate 开始日期
     */
    public void setStartBizDate(String StartBizDate) {
        this.StartBizDate = StartBizDate;
    }

    /**
     * Get 结束日期 
     * @return EndBizDate 结束日期
     */
    public String getEndBizDate() {
        return this.EndBizDate;
    }

    /**
     * Set 结束日期
     * @param EndBizDate 结束日期
     */
    public void setEndBizDate(String EndBizDate) {
        this.EndBizDate = EndBizDate;
    }

    public QueryRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryRecordListRequest(QueryRecordListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.BotId != null) {
            this.BotId = new String(source.BotId);
        }
        if (source.BotName != null) {
            this.BotName = new String(source.BotName);
        }
        if (source.CalledPhone != null) {
            this.CalledPhone = new String(source.CalledPhone);
        }
        if (source.StartBizDate != null) {
            this.StartBizDate = new String(source.StartBizDate);
        }
        if (source.EndBizDate != null) {
            this.EndBizDate = new String(source.EndBizDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "BotName", this.BotName);
        this.setParamSimple(map, prefix + "CalledPhone", this.CalledPhone);
        this.setParamSimple(map, prefix + "StartBizDate", this.StartBizDate);
        this.setParamSimple(map, prefix + "EndBizDate", this.EndBizDate);

    }
}

