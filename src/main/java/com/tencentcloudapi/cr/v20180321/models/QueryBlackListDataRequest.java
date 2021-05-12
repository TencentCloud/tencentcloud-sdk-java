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

public class QueryBlackListDataRequest extends AbstractModel{

    /**
    * 模块:AiApi
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作:QueryBlackListData
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 页码
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
    * 电话号码、手机
    */
    @SerializedName("BlackValue")
    @Expose
    private String BlackValue;

    /**
     * Get 模块:AiApi 
     * @return Module 模块:AiApi
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块:AiApi
     * @param Module 模块:AiApi
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作:QueryBlackListData 
     * @return Operation 操作:QueryBlackListData
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作:QueryBlackListData
     * @param Operation 操作:QueryBlackListData
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 页码 
     * @return Offset 页码
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页码
     * @param Offset 页码
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数量 
     * @return Limit 每页数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量
     * @param Limit 每页数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    /**
     * Get 电话号码、手机 
     * @return BlackValue 电话号码、手机
     */
    public String getBlackValue() {
        return this.BlackValue;
    }

    /**
     * Set 电话号码、手机
     * @param BlackValue 电话号码、手机
     */
    public void setBlackValue(String BlackValue) {
        this.BlackValue = BlackValue;
    }

    public QueryBlackListDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryBlackListDataRequest(QueryBlackListDataRequest source) {
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
        if (source.StartBizDate != null) {
            this.StartBizDate = new String(source.StartBizDate);
        }
        if (source.EndBizDate != null) {
            this.EndBizDate = new String(source.EndBizDate);
        }
        if (source.BlackValue != null) {
            this.BlackValue = new String(source.BlackValue);
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
        this.setParamSimple(map, prefix + "StartBizDate", this.StartBizDate);
        this.setParamSimple(map, prefix + "EndBizDate", this.EndBizDate);
        this.setParamSimple(map, prefix + "BlackValue", this.BlackValue);

    }
}

